import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;




import sign.signlink;

public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	private int anInt807;

	private int state;

	protected int fps;

	protected int screenWidth;

	protected int screenHeight;

	protected Graphics graphics;

	protected PixMap gameSurface;

	protected ViewBox frame;

	protected int anInt814;

	protected int anInt815;

	public int anInt816;

	public int anInt817;

	private int mouseClickButton;

	private int anInt819;

	private int anInt820;

	private long aLong27;

	protected int anInt821;

	protected int anInt822;

	protected int anInt823;

	protected long aLong28;

	private int keyQueueReadPos;

	private int keyQueueWritePos;

	private int anInt805 = 8;

	private boolean aBoolean211 = false;

	private boolean aBoolean212 = false;

	private int anInt806 = 3;

	private int deltime = 20;

	protected int anInt810 = 1;

	private long[] otim = new long[10];

	protected boolean aBoolean213 = false;

	private Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array3 = new Class10_Sub1_Sub1_Sub1[6];

	private boolean aBoolean214 = true;

	protected boolean aBoolean215 = true;

	protected int[] anIntArray210 = new int[128];

	private int[] anIntArray211 = new int[128];

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
		try {
			this.screenWidth = 765;
			this.screenHeight = 503;
			this.graphics = this.getBaseComponent().getGraphics();
			this.gameSurface = new PixMap(this.getBaseComponent(), this.screenWidth, this.screenHeight);
			this.startThread(this, 1);
		} catch ( RuntimeException local34) {
			signlink.reporterror("94928, " + 765 + ", " + 503 + ", " + 2 + ", " + local34.toString());
			throw new RuntimeException();
		}
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
		for ( int local47 = 0; local47 < 10; local47++) {
			this.otim[local47] = System.currentTimeMillis();
		}
		long last = System.currentTimeMillis();
		while (true) {
			int local170;
			do {
				if (this.state < 0) {
					if (this.state == -1) {
						this.shutdown(this.aBoolean211);
					}
					return;
				}
				if (this.state > 0) {
					this.state--;
					if (this.state == 0) {
						this.shutdown(this.aBoolean211);
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
				if (delta < this.anInt810) {
					delta = this.anInt810;
				}
				try {
					Thread.sleep((long) delta);
				} catch ( InterruptedException local204) {
					interruptedExceptions++;
				}
				while (count < 256) {
					this.anInt821 = this.mouseClickButton;
					this.anInt822 = this.anInt819;
					this.anInt823 = this.anInt820;
					this.aLong28 = this.aLong27;
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
			System.out.println("del:" + delta + " deltime:" + this.deltime + " mindel:" + this.anInt810);
			System.out.println("intex:" + interruptedExceptions + " opos:" + opos);
			this.aBoolean213 = false;
			interruptedExceptions = 0;
		}
	}

	private void shutdown(boolean arg0) {
		try {
			this.state = -2;
			this.unload();
			if (!arg0 && this.frame != null) {
				try {
					Thread.sleep(1000L);
				} catch ( Exception local15) {
				}
				try {
					System.exit(0);
				} catch ( Throwable local19) {
				}
			}
		} catch ( RuntimeException local21) {
			signlink.reporterror("9921, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	protected final void method579() {
		try {
			this.deltime = 1000;
		} catch ( RuntimeException local12) {
			signlink.reporterror("21294, " + 103 + ", " + 1 + ", " + local12.toString());
			throw new RuntimeException();
		}
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
		} catch ( Exception local6) {
		}
		if (this.state == -1) {
			this.shutdown(this.aBoolean211);
		}
	}

	@Override
	public final void update( Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.aBoolean214 = true;
		this.method585();
	}

	@Override
	public final void paint( Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.aBoolean214 = true;
		this.method585();
	}

	@Override
	public final void mousePressed( MouseEvent arg0) {
		int local2 = arg0.getX();
		int local5 = arg0.getY();
		if (this.frame != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt814 = 0;
		this.anInt819 = local2;
		this.anInt820 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.mouseClickButton = 2;
			this.anInt815 = 2;
		} else {
			this.mouseClickButton = 1;
			this.anInt815 = 1;
		}
	}

	@Override
	public final void mouseReleased( MouseEvent arg0) {
		this.anInt814 = 0;
		this.anInt815 = 0;
	}

	@Override
	public final void mouseClicked( MouseEvent arg0) {
	}

	@Override
	public final void mouseEntered( MouseEvent arg0) {
	}

	@Override
	public final void mouseExited( MouseEvent arg0) {
		this.anInt814 = 0;
		this.anInt816 = -1;
		this.anInt817 = -1;
	}

	@Override
	public final void mouseDragged( MouseEvent arg0) {
		int local2 = arg0.getX();
		int local5 = arg0.getY();
		if (this.frame != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt814 = 0;
		this.anInt816 = local2;
		this.anInt817 = local5;
	}

	@Override
	public final void mouseMoved( MouseEvent arg0) {
		int local2 = arg0.getX();
		int local5 = arg0.getY();
		if (this.frame != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt814 = 0;
		this.anInt816 = local2;
		this.anInt817 = local5;
	}

	@Override
	public final void keyPressed( KeyEvent arg0) {
		this.anInt814 = 0;
		int local7 = arg0.getKeyCode();
		int local10 = arg0.getKeyChar();
		if (local10 < 30) {
			local10 = 0;
		}
		if (local7 == 37) {
			local10 = 1;
		}
		if (local7 == 39) {
			local10 = 2;
		}
		if (local7 == 38) {
			local10 = 3;
		}
		if (local7 == 40) {
			local10 = 4;
		}
		if (local7 == 17) {
			local10 = 5;
		}
		if (local7 == 8) {
			local10 = 8;
		}
		if (local7 == 127) {
			local10 = 8;
		}
		if (local7 == 9) {
			local10 = 9;
		}
		if (local7 == 10) {
			local10 = 10;
		}
		if (local7 >= 112 && local7 <= 123) {
			local10 = local7 + 1008 - 112;
		}
		if (local7 == 36) {
			local10 = 1000;
		}
		if (local7 == 35) {
			local10 = 1001;
		}
		if (local7 == 33) {
			local10 = 1002;
		}
		if (local7 == 34) {
			local10 = 1003;
		}
		if (local10 > 0 && local10 < 128) {
			this.anIntArray210[local10] = 1;
		}
		if (local10 > 4) {
			this.anIntArray211[this.keyQueueWritePos] = local10;
			this.keyQueueWritePos = this.keyQueueWritePos + 1 & 0x7F;
		}
	}

	@Override
	public final void keyReleased( KeyEvent arg0) {
		this.anInt814 = 0;
		int local5 = arg0.getKeyCode();
		char local8 = arg0.getKeyChar();
		if (local8 < '\u001e') {
			local8 = '\u0000';
		}
		if (local5 == 37) {
			local8 = '\u0001';
		}
		if (local5 == 39) {
			local8 = '\u0002';
		}
		if (local5 == 38) {
			local8 = '\u0003';
		}
		if (local5 == 40) {
			local8 = '\u0004';
		}
		if (local5 == 17) {
			local8 = '\u0005';
		}
		if (local5 == 8) {
			local8 = '\b';
		}
		if (local5 == 127) {
			local8 = '\b';
		}
		if (local5 == 9) {
			local8 = '\t';
		}
		if (local5 == 10) {
			local8 = '\n';
		}
		if (local8 > '\u0000' && local8 < '\u0080') {
			this.anIntArray210[local8] = 0;
		}
	}

	@Override
	public final void keyTyped( KeyEvent arg0) {
	}

	protected final int method580() {
		try {
			int local8 = -1;
			if (this.keyQueueWritePos != this.keyQueueReadPos) {
				local8 = this.anIntArray211[this.keyQueueReadPos];
				this.keyQueueReadPos = this.keyQueueReadPos + 1 & 0x7F;
			}
			return local8;
		} catch ( RuntimeException local30) {
			signlink.reporterror("47387, " + -983 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public final void focusGained( FocusEvent arg0) {
		this.aBoolean215 = true;
		this.aBoolean214 = true;
		this.method585();
	}

	@Override
	public final void focusLost( FocusEvent arg0) {
		this.aBoolean215 = false;
		for ( int local4 = 0; local4 < 128; local4++) {
			this.anIntArray210[local4] = 0;
		}
	}

	@Override
	public final void windowActivated( WindowEvent arg0) {
	}

	@Override
	public final void windowClosed( WindowEvent arg0) {
	}

	@Override
	public final void windowClosing( WindowEvent arg0) {
		this.destroy();
	}

	@Override
	public final void windowDeactivated( WindowEvent arg0) {
	}

	@Override
	public final void windowDeiconified( WindowEvent arg0) {
	}

	@Override
	public final void windowIconified( WindowEvent arg0) {
	}

	@Override
	public final void windowOpened( WindowEvent arg0) {
	}

	protected void load() {
	}

	protected void update() {
	}

	protected void unload() {

	}

	protected void draw() {
	}

	protected void method585() {
	}

	protected Component getBaseComponent() {
		try {
			return this.frame == null ? this : this.frame;
		} catch ( RuntimeException local13) {
			signlink.reporterror("42544, " + -756 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	public void startThread(Runnable arg0, int arg1) {
		Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	protected void drawProgress(int arg0, String arg1) {
		try {
			while (this.graphics == null) {
				this.graphics = this.getBaseComponent().getGraphics();
				try {
					this.getBaseComponent().repaint();
				} catch ( Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch ( Exception local25) {
				}
			}
			Font local36 = new Font("Helvetica", 1, 13);
			FontMetrics local42 = this.getBaseComponent().getFontMetrics(local36);
			Font local54 = new Font("Helvetica", 0, 13);
			this.getBaseComponent().getFontMetrics(local54);
			if (this.aBoolean214) {
				this.graphics.setColor(Color.black);
				this.graphics.fillRect(0, 0, this.screenWidth, this.screenHeight);
				this.aBoolean214 = false;
			}
			Color local86 = new Color(140, 17, 17);
			int local93 = this.screenHeight / 2 - 18;
			this.graphics.setColor(local86);
			this.graphics.drawRect(this.screenWidth / 2 - 152, local93, 304, 34);
			this.graphics.fillRect(this.screenWidth / 2 - 150, local93 + 2, arg0 * 3, 30);
			this.graphics.setColor(Color.black);
			this.graphics.fillRect(this.screenWidth / 2 + arg0 * 3 - 150, local93 + 2, 300 - arg0 * 3, 30);
			this.graphics.setFont(local36);
			this.graphics.setColor(Color.white);
			this.graphics.drawString(arg1, (this.screenWidth - local42.stringWidth(arg1)) / 2, local93 + 22);
		} catch ( RuntimeException local176) {
			signlink.reporterror("22588, " + arg0 + ", " + true + ", " + arg1 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}
}
