import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;




import sign.signlink;

public final class Class19 implements ImageProducer, ImageObserver {

	private ImageConsumer anImageConsumer1;

	private boolean aBoolean64 = true;

	private int anInt214;

	private int anInt215;

	public int[] anIntArray56;

	private ColorModel aColorModel1;

	private Image anImage1;

	public Class19( int arg0, byte arg1, Component arg2, int arg3) {
		try {
			this.anInt214 = arg3;
			this.anInt215 = arg0;
			this.anIntArray56 = new int[arg3 * arg0];
			this.aColorModel1 = new DirectColorModel(32, 16711680, 65280, 255);
			this.anImage1 = arg2.createImage(this);
			this.method132();
			arg2.prepareImage(this.anImage1, this);
			this.method132();
			arg2.prepareImage(this.anImage1, this);
			this.method132();
			arg2.prepareImage(this.anImage1, this);
			this.method130();
		} catch ( RuntimeException local66) {
			signlink.reporterror("6856, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	public void method130() {
		try {
			Class10_Sub1_Sub1.method494(this.anInt214, this.anInt215, this.anIntArray56);
		} catch ( RuntimeException local19) {
			signlink.reporterror("24943, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	public void method131( int arg0, int arg1, Graphics arg2, boolean arg3) {
		try {
			if (!arg3) {
				this.method132();
				arg2.drawImage(this.anImage1, arg1, arg0, this);
			}
		} catch ( RuntimeException local14) {
			signlink.reporterror("97525, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public synchronized void addConsumer( ImageConsumer arg0) {
		this.anImageConsumer1 = arg0;
		arg0.setDimensions(this.anInt214, this.anInt215);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel1);
		arg0.setHints(14);
	}

	@Override
	public synchronized boolean isConsumer( ImageConsumer arg0) {
		return this.anImageConsumer1 == arg0;
	}

	@Override
	public synchronized void removeConsumer( ImageConsumer arg0) {
		if (this.anImageConsumer1 == arg0) {
			this.anImageConsumer1 = null;
		}
	}

	@Override
	public void startProduction( ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@Override
	public void requestTopDownLeftRightResend( ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	private synchronized void method132() {
		if (this.anImageConsumer1 != null) {
			this.anImageConsumer1.setPixels(0, 0, this.anInt214, this.anInt215, this.aColorModel1, this.anIntArray56, 0, this.anInt214);
			this.anImageConsumer1.imageComplete(2);
		}
	}

	@Override
	public boolean imageUpdate( Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
