



import sign.signlink;

public final class Class10_Sub1_Sub2_Sub1 extends Class10_Sub1_Sub2 {

	public int anInt211;

	private int anInt212;

	public int anInt213;

	@Override
	protected Class10_Sub1_Sub2_Sub4 method537( byte arg0) {
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
