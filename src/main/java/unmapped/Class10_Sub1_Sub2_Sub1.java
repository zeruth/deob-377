package unmapped;


import jagex2.dash3d.entity.Entity;
import jagex2.graphics.Model;
import sign.signlink;

public final class Class10_Sub1_Sub2_Sub1 extends Entity {

	public int anInt211;

	private int anInt212;

	public int anInt213;

	@Override
	protected Model method537(byte arg0) {
		try {
			if (arg0 != 3) {
				this.anInt212 = -358;
			}
			Class17 local9 = Class17.method104(this.anInt211);
			return local9.method112(this.anInt213);
		} catch ( RuntimeException local15) {
			signlink.reporterror("1325, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
