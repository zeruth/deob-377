import java.awt.Frame;
import java.awt.Graphics;




import sign.signlink;

public final class Frame_Sub1 extends Frame {

	private Applet_Sub1 anApplet_Sub1_2;

	public Frame_Sub1( int arg0, int arg1, Applet_Sub1 arg2, int arg3) {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.setTitle("Jagex");
			this.setResizable(false);
			this.show();
			if (arg0 != 3) {
				throw new NullPointerException();
			}
			this.toFront();
			this.resize(arg3 + 8, arg1 + 28);
		} catch ( RuntimeException local31) {
			signlink.reporterror("80762, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public Graphics getGraphics() {
		Graphics local2 = super.getGraphics();
		local2.translate(4, 24);
		return local2;
	}

	@Override
	public void update( Graphics arg0) {
		this.anApplet_Sub1_2.update(arg0);
	}

	@Override
	public void paint( Graphics arg0) {
		this.anApplet_Sub1_2.paint(arg0);
	}
}
