package unmapped;


import sign.signlink;

public final class Class10_Sub1_Sub2_Sub2 extends Class10_Sub1_Sub2 {

	public double aDouble1;

	public double aDouble2;

	public double aDouble3;

	public int anInt268;

	private int anInt269;

	private int anInt272;

	private int anInt273;

	private double aDouble4;

	private double aDouble5;

	private double aDouble6;

	private double aDouble7;

	private double aDouble8;

	private boolean aBoolean84 = false;

	private byte aByte19 = -41;

	private boolean aBoolean85 = true;

	private boolean aBoolean86 = false;

	private Class28 aClass28_1;

	public int anInt264;

	private int anInt274;

	private int anInt275;

	private int anInt276;

	public int anInt270;

	public int anInt271;

	private int anInt265;

	private int anInt266;

	public int anInt267;

	public int anInt277;

	public Class10_Sub1_Sub2_Sub2( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
		try {
			this.aClass28_1 = Class28.aClass28Array1[arg4];
			this.anInt264 = arg0;
			this.anInt274 = arg10;
			this.anInt275 = arg3;
			this.anInt276 = arg9;
			this.anInt270 = arg11;
			this.anInt271 = arg5;
			if (arg8 != this.aByte19) {
				throw new NullPointerException();
			}
			this.anInt265 = arg6;
			this.anInt266 = arg2;
			this.anInt267 = arg7;
			this.anInt277 = arg1;
			this.aBoolean86 = false;
		} catch ( RuntimeException local61) {
			signlink.reporterror("57913, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	public void method187( int arg0, int arg1, int arg2, int arg3) {
		try {
			double local8;
			if (!this.aBoolean86) {
				local8 = arg0 - this.anInt274;
				double local14 = (double) (arg1 - this.anInt275);
				double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt274 + local8 * (double) this.anInt266 / local23;
				this.aDouble2 = (double) this.anInt275 + local14 * (double) this.anInt266 / local23;
				this.aDouble3 = this.anInt276;
			}
			local8 = this.anInt271 + 1 - arg3;
			this.aDouble4 = ((double) arg0 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg1 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean86) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt265 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch ( RuntimeException local132) {
			signlink.reporterror("90121, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	public void method188( int arg0) {
		try {
			this.aBoolean86 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt268 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt269 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass28_1.aClass15_1 != null) {
				this.anInt273 += arg0;
				while (this.anInt273 > this.aClass28_1.aClass15_1.method97(this.anInt272)) {
					this.anInt273 -= this.aClass28_1.aClass15_1.method97(this.anInt272);
					this.anInt272++;
					if (this.anInt272 >= this.aClass28_1.aClass15_1.anInt152) {
						this.anInt272 = 0;
					}
				}
			}
		} catch ( RuntimeException local142) {
			signlink.reporterror("73896, " + arg0 + ", " + false + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@Override
	protected Class10_Sub1_Sub2_Sub4 method537( byte arg0) {
		try {
			Class10_Sub1_Sub2_Sub4 local3 = this.aClass28_1.method352();
			if (local3 == null) {
				return null;
			}
			int local9 = -1;
			if (this.aClass28_1.aClass15_1 != null) {
				local9 = this.aClass28_1.aClass15_1.anIntArray47[this.anInt272];
			}
			Class10_Sub1_Sub2_Sub4 local33 = new Class10_Sub1_Sub2_Sub4(false, false, true, local3, Class22.method169(this.aBoolean85, local9));
			if (local9 != -1) {
				local33.method278();
				local33.method279(local9, (byte) 6);
				local33.anIntArrayArray11 = null;
				local33.anIntArrayArray10 = null;
			}
			if (this.aClass28_1.anInt438 != 128 || this.aClass28_1.anInt439 != 128) {
				local33.method287(this.aClass28_1.anInt439, this.aClass28_1.anInt438, this.aClass28_1.anInt438);
			}
			local33.method283(this.anInt269, 341);
			local33.method288(this.aClass28_1.anInt441 + 64, this.aClass28_1.anInt442 + 850, -30, -50, -30, true);
			if (arg0 == 3) {
				boolean local97 = false;
			} else {
				this.aBoolean84 = !this.aBoolean84;
			}
			return local33;
		} catch ( RuntimeException local110) {
			signlink.reporterror("37750, " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}
}
