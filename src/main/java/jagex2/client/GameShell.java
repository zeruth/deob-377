package jagex2.client;

import jagex2.graphics.PixMap;
import jagex2.graphics.Pix24;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("all")
public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    public int mouseX;
    public int mouseY;
    protected int fps;

    protected int screenWidth;

    protected int screenHeight;

    protected Graphics graphics;

    protected PixMap gameSurface;

    protected ViewBox frame;

    protected int idleCycles;

    protected int mouseButton;
    protected int anInt821;
    protected int anInt822;
    protected int anInt823;
    protected long aLong28;
    protected int mindel = 1;
    protected boolean aBoolean213 = false;
    protected boolean hasFocus = true;
    protected int[] actionKey = new int[128];
    private int anInt807;
    private int state;
    private int mouseClickButton;
    private int mouseClickX;
    private int mouseClickY;
    private long mousePressMs;
    private int keyQueueReadPos;
    private int keyQueueWritePos;
    private final int anInt805 = 8;
    private final boolean aBoolean212 = false;
    private final int anInt806 = 3;
    private int deltime = 20;
    private final long[] otim = new long[10];
    private final Pix24[] temp = new Pix24[6];
    private boolean refresh = true;
    private final int[] keyQueue = new int[128];

    protected final void initApplication(int arg0) {
        this.screenWidth = 765;
        this.screenHeight = 503;
        this.frame = new ViewBox(this, this.screenWidth, this.screenHeight);
        if (arg0 < 0) {
            this.graphics = this.getBaseComponent().getGraphics();
            this.gameSurface = new PixMap(this.getBaseComponent(), this.screenWidth, this.screenHeight);
            this.startThread(this, 1);
        }
    }

    protected final void initApplet() {
        this.screenWidth = 765;
        this.screenHeight = 503;
        this.graphics = this.getBaseComponent().getGraphics();
        this.gameSurface = new PixMap(this.getBaseComponent(), this.screenWidth, this.screenHeight);
        this.startThread(this, 1);
    }

    @Override
    public void run() {
        this.getBaseComponent().addMouseListener(this);
        this.getBaseComponent().addMouseMotionListener(this);
        this.getBaseComponent().addKeyListener(this);
        this.getBaseComponent().addFocusListener(this);
        if (this.frame != null) {
            this.frame.addWindowListener(this);
        }
        this.drawProgress(0, "Loading...");
        this.load();

        int opos = 0;
        int ratio = 256;
        int delta = 1;
        int count = 0;
        int interruptedExceptions = 0;

        for (int local47 = 0; local47 < 10; local47++) {
            this.otim[local47] = System.currentTimeMillis();
        }

        long last = System.currentTimeMillis();
        while (true) {
            int local170;
            do {
                if (this.state < 0) {
                    if (this.state == -1) {
                        this.shutdown();
                    }
                    return;
                }
                if (this.state > 0) {
                    this.state--;
                    if (this.state == 0) {
                        this.shutdown();
                        return;
                    }
                }
                int lastRatio = ratio;
                int lastDelta = delta;
                ratio = 300;
                delta = 1;
                last = System.currentTimeMillis();
                if (this.otim[opos] == 0L) {
                    ratio = lastRatio;
                    delta = lastDelta;
                } else if (last > this.otim[opos]) {
                    ratio = (int) ((this.deltime * 2560L) / (last - this.otim[opos]));
                }
                if (ratio < 25) {
                    ratio = 25;
                }
                if (ratio > 256) {
                    ratio = 256;
                    delta = (int) ((long) this.deltime - (last - this.otim[opos]) / 10L);
                }
                if (delta > this.deltime) {
                    delta = this.deltime;
                }
                this.otim[opos] = last;
                opos = (opos + 1) % 10;
                if (delta > 1) {
                    for (int i = 0; i < 10; i++) {
                        if (this.otim[i] != 0L) {
                            this.otim[i] += delta;
                        }
                    }
                }
                if (delta < this.mindel) {
                    delta = this.mindel;
                }
                try {
                    Thread.sleep(delta);
                } catch (InterruptedException local204) {
                    interruptedExceptions++;
                }
                while (count < 256) {
                    this.anInt821 = this.mouseClickButton;
                    this.anInt822 = this.mouseClickX;
                    this.anInt823 = this.mouseClickY;
                    this.aLong28 = this.mousePressMs;
                    this.mouseClickButton = 0;
                    this.update();
                    this.keyQueueReadPos = this.keyQueueWritePos;
                    count += ratio;
                }
                count &= 0xFF;
                if (this.deltime > 0) {
                    this.fps = ratio * 1000 / (this.deltime * 256);
                }
                this.draw();
            } while (!this.aBoolean213);
            System.out.println("ntime:" + last);
            for (local170 = 0; local170 < 10; local170++) {
                int local286 = (opos + 20 - local170 - 1) % 10;
                System.out.println("otim" + local286 + ":" + this.otim[local286]);
            }
            System.out.println("fps:" + this.fps + " ratio:" + ratio + " count:" + count);
            System.out.println("del:" + delta + " deltime:" + this.deltime + " mindel:" + this.mindel);
            System.out.println("intex:" + interruptedExceptions + " opos:" + opos);
            this.aBoolean213 = false;
            interruptedExceptions = 0;
        }
    }

    private void shutdown() {
        this.state = -2;
        this.unload();
        if (this.frame != null) {
            try {
                Thread.sleep(1000L);
            } catch (Exception local15) {
            }
            try {
                System.exit(0);
            } catch (Throwable local19) {
            }
        }
    }

    protected final void setCycleDelay() {
        this.deltime = 1000;
    }

    @Override
    public final void start() {
        if (this.state >= 0) {
            this.state = 0;
        }
    }

    @Override
    public final void stop() {
        if (this.state >= 0) {
            this.state = 4000 / this.deltime;
        }
    }

    @Override
    public final void destroy() {
        this.state = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception local6) {
        }
        if (this.state == -1) {
            this.shutdown();
        }
    }

    @Override
    public final void update(Graphics g) {
        if (this.graphics == null) {
            this.graphics = g;
        }
        this.refresh = true;
        this.refresh();
    }

    @Override
    public final void paint(Graphics g) {
        if (this.graphics == null) {
            this.graphics = g;
        }
        this.refresh = true;
        this.refresh();
    }

    /**
     * A change has been made here to fix mouse clicks
     */
    @Override
    public final void mousePressed(MouseEvent event) {
        int x = event.getX();
        int y = event.getY();
        if (this.frame != null) {
            x -= 4;
            y -= 22;
        }
        this.idleCycles = 0;
        this.mouseClickX = x;
        this.mouseClickY = y;
        this.mousePressMs = System.currentTimeMillis();
        try {
            if ((event.getModifiersEx() & MouseEvent.BUTTON3_DOWN_MASK) != 0) {
                this.mouseClickButton = 2;
                this.mouseButton = 2;
            } else if ((event.getModifiersEx() & MouseEvent.BUTTON1_DOWN_MASK) != 0) {
                this.mouseClickButton = 1;
                this.mouseButton = 1;
            }
        } catch (NoSuchMethodError ex) {
            if (event.isMetaDown()) {
                this.mouseClickButton = 2;
                this.mouseButton = 2;
            } else {
                this.mouseClickButton = 1;
                this.mouseButton = 1;
            }
        }
    }

    @Override
    public final void mouseReleased(MouseEvent event) {
        this.idleCycles = 0;
        this.mouseButton = 0;
    }

    @Override
    public final void mouseClicked(MouseEvent event) {
    }

    @Override
    public final void mouseEntered(MouseEvent event) {
    }

    @Override
    public final void mouseExited(MouseEvent event) {
        this.idleCycles = 0;
        this.mouseX = -1;
        this.mouseY = -1;
    }

    @Override
    public final void mouseDragged(MouseEvent event) {
        int mouseX = event.getX();
        int mouseY = event.getY();
        if (this.frame != null) {
            mouseX -= 4;
            mouseY -= 22;
        }
        this.idleCycles = 0;
        this.mouseX = mouseX;
        this.mouseY = mouseY;
    }

    @Override
    public final void mouseMoved(MouseEvent event) {
        int mouseX = event.getX();
        int mouseY = event.getY();
        if (this.frame != null) {
            mouseX -= 4;
            mouseY -= 22;
        }
        this.idleCycles = 0;
        this.mouseX = mouseX;
        this.mouseY = mouseY;
    }

    /**
     * A change has been made here to support Shift/Alt
     */
    @Override
    public final void keyPressed(KeyEvent event) {
        this.idleCycles = 0;
        int code = event.getKeyCode();
        int ch = event.getKeyChar();
        if (ch < 30) {
            ch = 0;
        }
        if (code == 37) {
            ch = 1;
        }
        if (code == 39) {
            ch = 2;
        }
        if (code == 38) {
            ch = 3;
        }
        if (code == 40) {
            ch = 4;
        }
        if (code == 17) {
            ch = 5;
        }
        if (code == 16) {
            // SHIFT
            ch = 6;
        }
        if (code == 18) {
            // ALT
            ch = 7;
        }
        if (code == 8) {
            ch = 8;
        }
        if (code == 127) {
            ch = 8;
        }
        if (code == 9) {
            ch = 9;
        }
        if (code == 10) {
            ch = 10;
        }
        if (code >= 112 && code <= 123) {
            ch = code + 1008 - 112;
        }
        if (code == 36) {
            ch = 1000;
        }
        if (code == 35) {
            ch = 1001;
        }
        if (code == 33) {
            ch = 1002;
        }
        if (code == 34) {
            ch = 1003;
        }
        if (ch > 0 && ch < 128) {
            this.actionKey[ch] = 1;
        }
        if (ch > 4) {
            this.keyQueue[this.keyQueueWritePos] = ch;
            this.keyQueueWritePos = this.keyQueueWritePos + 1 & 0x7F;
        }
    }

    /**
     * A change has been made here to support Shift/Alt
     */
    @Override
    public final void keyReleased(KeyEvent event) {
        this.idleCycles = 0;
        int code = event.getKeyCode();
        char ch = event.getKeyChar();
        if (ch < '\u001e') {
            ch = '\u0000';
        }
        if (code == 37) {
            ch = '\u0001';
        }
        if (code == 39) {
            ch = '\u0002';
        }
        if (code == 38) {
            ch = '\u0003';
        }
        if (code == 40) {
            ch = '\u0004';
        }
        if (code == 17) {
            ch = '\u0005';
        }
        if (code == 16) {
            // SHIFT
            ch = 6;
        }
        if (code == 18) {
            // ALT
            ch = 7;
        }
        if (code == 8) {
            ch = '\b';
        }
        if (code == 127) {
            ch = '\b';
        }
        if (code == 9) {
            ch = '\t';
        }
        if (code == 10) {
            ch = '\n';
        }
        if (ch > '\u0000' && ch < '\u0080') {
            this.actionKey[ch] = 0;
        }
    }

    @Override
    public final void keyTyped(KeyEvent event) {
    }

    protected final int pollKey() {
        int key = -1;
        if (this.keyQueueWritePos != this.keyQueueReadPos) {
            key = this.keyQueue[this.keyQueueReadPos];
            this.keyQueueReadPos = this.keyQueueReadPos + 1 & 0x7F;
        }
        return key;
    }

    @Override
    public final void focusGained(FocusEvent event) {
        this.hasFocus = true;
        this.refresh = true;
        this.refresh();
    }

    @Override
    public final void focusLost(FocusEvent event) {
        this.hasFocus = false;
        for (int key = 0; key < 128; key++) {
            this.actionKey[key] = 0;
        }
    }

    @Override
    public final void windowActivated(WindowEvent event) {
    }

    @Override
    public final void windowClosed(WindowEvent event) {
    }

    @Override
    public final void windowClosing(WindowEvent event) {
        this.destroy();
    }

    @Override
    public final void windowDeactivated(WindowEvent event) {
    }

    @Override
    public final void windowDeiconified(WindowEvent event) {
    }

    @Override
    public final void windowIconified(WindowEvent event) {
    }

    @Override
    public final void windowOpened(WindowEvent event) {
    }

    protected void load() {
    }

    protected void update() {
    }

    protected void unload() {

    }

    protected void draw() {
    }

    protected void refresh() {
    }

    protected Component getBaseComponent() {
        return this.frame == null ? this : this.frame;
    }

    public void startThread(Runnable runnable, int priority) {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(priority);
    }

    protected void drawProgress(int progress, String message) {
        while (this.graphics == null) {
            this.graphics = this.getBaseComponent().getGraphics();
            try {
                this.getBaseComponent().repaint();
            } catch (Exception local21) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception local25) {
            }
        }
        Font bold = new Font("Helvetica", Font.BOLD, 13);
        FontMetrics boldMetrics = this.getBaseComponent().getFontMetrics(bold);
        Font plain = new Font("Helvetica", Font.PLAIN, 13);
        FontMetrics plainMetrics = this.getBaseComponent().getFontMetrics(plain);
        if (this.refresh) {
            this.graphics.setColor(Color.black);
            this.graphics.fillRect(0, 0, this.screenWidth, this.screenHeight);
            this.refresh = false;
        }
        Color barColor = new Color(140, 17, 17);
        int y = this.screenHeight / 2 - 18;
        this.graphics.setColor(barColor);
        this.graphics.drawRect(this.screenWidth / 2 - 152, y, 304, 34);
        this.graphics.fillRect(this.screenWidth / 2 - 150, y + 2, progress * 3, 30);
        this.graphics.setColor(Color.black);
        this.graphics.fillRect(this.screenWidth / 2 + progress * 3 - 150, y + 2, 300 - progress * 3, 30);
        this.graphics.setFont(bold);
        this.graphics.setColor(Color.white);
        this.graphics.drawString(message, (this.screenWidth - boldMetrics.stringWidth(message)) / 2, y + 22);
    }
}
