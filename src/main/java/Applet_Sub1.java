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

public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	private int anInt807;

	private int anInt808;

	protected int anInt811;

	protected int anInt812;

	protected int anInt813;

	protected Graphics aGraphics2;

	protected Class19 aClass19_2;

	protected Frame_Sub1 aFrame_Sub1_2;

	protected int anInt814;

	protected int anInt815;

	public int anInt816;

	public int anInt817;

	private int anInt818;

	private int anInt819;

	private int anInt820;

	private long aLong27;

	protected int anInt821;

	protected int anInt822;

	protected int anInt823;

	protected long aLong28;

	private int anInt824;

	private int anInt825;

	private int anInt805 = 8;

	private boolean aBoolean211 = false;

	private boolean aBoolean212 = false;

	private int anInt806 = 3;

	private int anInt809 = 20;

	protected int anInt810 = 1;

	private long[] aLongArray2 = new long[10];

	protected boolean aBoolean213 = false;

	private Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array3 = new Class10_Sub1_Sub1_Sub1[6];

	private boolean aBoolean214 = true;

	protected boolean aBoolean215 = true;

	protected int[] anIntArray210 = new int[128];

	private int[] anIntArray211 = new int[128];

	protected final void method576( int arg0) {
		try {
			this.anInt812 = 765;
			this.anInt813 = 503;
			this.aFrame_Sub1_2 = new Frame_Sub1(this.anInt806, this.anInt813, this, this.anInt812);
			if (arg0 < 0) {
				this.aGraphics2 = this.method586().getGraphics();
				this.aClass19_2 = new Class19(this.anInt813, (byte) -12, this.method586(), this.anInt812);
				this.method587(this, 1);
			}
		} catch ( RuntimeException local47) {
			signlink.reporterror("28497, " + arg0 + ", " + 503 + ", " + 765 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	protected final void method577() {
		try {
			this.anInt812 = 765;
			this.anInt813 = 503;
			this.aGraphics2 = this.method586().getGraphics();
			this.aClass19_2 = new Class19(this.anInt813, (byte) -12, this.method586(), this.anInt812);
			this.method587(this, 1);
		} catch ( RuntimeException local34) {
			signlink.reporterror("94928, " + 765 + ", " + 503 + ", " + 2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void run() {
		this.method586().addMouseListener(this);
		this.method586().addMouseMotionListener(this);
		this.method586().addKeyListener(this);
		this.method586().addFocusListener(this);
		if (this.aFrame_Sub1_2 != null) {
			this.aFrame_Sub1_2.addWindowListener(this);
		}
		this.method588(0, "Loading...");
		this.method581();
		int local37 = 0;
		int local39 = 256;
		int local41 = 1;
		int local43 = 0;
		int local45 = 0;
		for ( int local47 = 0; local47 < 10; local47++) {
			this.aLongArray2[local47] = System.currentTimeMillis();
		}
		long local60 = System.currentTimeMillis();
		while (true) {
			int local170;
			do {
				if (this.anInt808 < 0) {
					if (this.anInt808 == -1) {
						this.method578(this.aBoolean211);
					}
					return;
				}
				if (this.anInt808 > 0) {
					this.anInt808--;
					if (this.anInt808 == 0) {
						this.method578(this.aBoolean211);
						return;
					}
				}
				int local81 = local39;
				int local83 = local41;
				local39 = 300;
				local41 = 1;
				local60 = System.currentTimeMillis();
				if (this.aLongArray2[local37] == 0L) {
					local39 = local81;
					local41 = local83;
				} else if (local60 > this.aLongArray2[local37]) {
					local39 = (int) ((long) (this.anInt809 * 2560) / (local60 - this.aLongArray2[local37]));
				}
				if (local39 < 25) {
					local39 = 25;
				}
				if (local39 > 256) {
					local39 = 256;
					local41 = (int) ((long) this.anInt809 - (local60 - this.aLongArray2[local37]) / 10L);
				}
				if (local41 > this.anInt809) {
					local41 = this.anInt809;
				}
				this.aLongArray2[local37] = local60;
				local37 = (local37 + 1) % 10;
				if (local41 > 1) {
					for (local170 = 0; local170 < 10; local170++) {
						if (this.aLongArray2[local170] != 0L) {
							this.aLongArray2[local170] += local41;
						}
					}
				}
				if (local41 < this.anInt810) {
					local41 = this.anInt810;
				}
				try {
					Thread.sleep((long) local41);
				} catch ( InterruptedException local204) {
					local45++;
				}
				while (local43 < 256) {
					this.anInt821 = this.anInt818;
					this.anInt822 = this.anInt819;
					this.anInt823 = this.anInt820;
					this.aLong28 = this.aLong27;
					this.anInt818 = 0;
					this.method582();
					this.anInt824 = this.anInt825;
					local43 += local39;
				}
				local43 &= 0xFF;
				if (this.anInt809 > 0) {
					this.anInt811 = local39 * 1000 / (this.anInt809 * 256);
				}
				this.method584();
			} while (!this.aBoolean213);
			System.out.println("ntime:" + local60);
			for (local170 = 0; local170 < 10; local170++) {
				int local286 = (local37 + 20 - local170 - 1) % 10;
				System.out.println("otim" + local286 + ":" + this.aLongArray2[local286]);
			}
			System.out.println("fps:" + this.anInt811 + " ratio:" + local39 + " count:" + local43);
			System.out.println("del:" + local41 + " deltime:" + this.anInt809 + " mindel:" + this.anInt810);
			System.out.println("intex:" + local45 + " opos:" + local37);
			this.aBoolean213 = false;
			local45 = 0;
		}
	}

	private void method578( boolean arg0) {
		try {
			this.anInt808 = -2;
			this.method583(277);
			if (!arg0 && this.aFrame_Sub1_2 != null) {
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
			this.anInt809 = 1000;
		} catch ( RuntimeException local12) {
			signlink.reporterror("21294, " + 103 + ", " + 1 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public final void start() {
		if (this.anInt808 >= 0) {
			this.anInt808 = 0;
		}
	}

	@Override
	public final void stop() {
		if (this.anInt808 >= 0) {
			this.anInt808 = 4000 / this.anInt809;
		}
	}

	@Override
	public final void destroy() {
		this.anInt808 = -1;
		try {
			Thread.sleep(10000L);
		} catch ( Exception local6) {
		}
		if (this.anInt808 == -1) {
			this.method578(this.aBoolean211);
		}
	}

	@Override
	public final void update( Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean214 = true;
		this.method585();
	}

	@Override
	public final void paint( Graphics arg0) {
		if (this.aGraphics2 == null) {
			this.aGraphics2 = arg0;
		}
		this.aBoolean214 = true;
		this.method585();
	}

	@Override
	public final void mousePressed( MouseEvent arg0) {
		int local2 = arg0.getX();
		int local5 = arg0.getY();
		if (this.aFrame_Sub1_2 != null) {
			local2 -= 4;
			local5 -= 22;
		}
		this.anInt814 = 0;
		this.anInt819 = local2;
		this.anInt820 = local5;
		this.aLong27 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.anInt818 = 2;
			this.anInt815 = 2;
		} else {
			this.anInt818 = 1;
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
		if (this.aFrame_Sub1_2 != null) {
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
		if (this.aFrame_Sub1_2 != null) {
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
			this.anIntArray211[this.anInt825] = local10;
			this.anInt825 = this.anInt825 + 1 & 0x7F;
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
			if (this.anInt825 != this.anInt824) {
				local8 = this.anIntArray211[this.anInt824];
				this.anInt824 = this.anInt824 + 1 & 0x7F;
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

	protected void method581() {
	}

	protected void method582() {
	}

	protected void method583( int arg0) {
		try {
			boolean local3 = false;
		} catch ( RuntimeException local5) {
			signlink.reporterror("25601, " + arg0 + ", " + local5.toString());
			throw new RuntimeException();
		}
	}

	protected void method584() {
	}

	protected void method585() {
	}

	protected Component method586() {
		try {
			return this.aFrame_Sub1_2 == null ? this : this.aFrame_Sub1_2;
		} catch ( RuntimeException local13) {
			signlink.reporterror("42544, " + -756 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	public void method587( Runnable arg0, int arg1) {
		Thread local4 = new Thread(arg0);
		local4.start();
		local4.setPriority(arg1);
	}

	protected void method588( int arg0, String arg1) {
		try {
			while (this.aGraphics2 == null) {
				this.aGraphics2 = this.method586().getGraphics();
				try {
					this.method586().repaint();
				} catch ( Exception local21) {
				}
				try {
					Thread.sleep(1000L);
				} catch ( Exception local25) {
				}
			}
			Font local36 = new Font("Helvetica", 1, 13);
			FontMetrics local42 = this.method586().getFontMetrics(local36);
			Font local54 = new Font("Helvetica", 0, 13);
			this.method586().getFontMetrics(local54);
			if (this.aBoolean214) {
				this.aGraphics2.setColor(Color.black);
				this.aGraphics2.fillRect(0, 0, this.anInt812, this.anInt813);
				this.aBoolean214 = false;
			}
			Color local86 = new Color(140, 17, 17);
			int local93 = this.anInt813 / 2 - 18;
			this.aGraphics2.setColor(local86);
			this.aGraphics2.drawRect(this.anInt812 / 2 - 152, local93, 304, 34);
			this.aGraphics2.fillRect(this.anInt812 / 2 - 150, local93 + 2, arg0 * 3, 30);
			this.aGraphics2.setColor(Color.black);
			this.aGraphics2.fillRect(this.anInt812 / 2 + arg0 * 3 - 150, local93 + 2, 300 - arg0 * 3, 30);
			this.aGraphics2.setFont(local36);
			this.aGraphics2.setColor(Color.white);
			this.aGraphics2.drawString(arg1, (this.anInt812 - local42.stringWidth(arg1)) / 2, local93 + 22);
		} catch ( RuntimeException local176) {
			signlink.reporterror("22588, " + arg0 + ", " + true + ", " + arg1 + ", " + local176.toString());
			throw new RuntimeException();
		}
	}
}
