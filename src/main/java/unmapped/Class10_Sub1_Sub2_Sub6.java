package unmapped;


import sign.signlink;

public final class Class10_Sub1_Sub2_Sub6 extends Class10_Sub1_Sub2 {

	private int anInt627;

	private int anInt628;

	private boolean aBoolean155 = true;

	public boolean aBoolean156 = false;

	private Class28 aClass28_2;

	public int anInt623;

	public int anInt624;

	public int anInt625;

	public int anInt626;

	public int anInt629;

	public Class10_Sub1_Sub2_Sub6( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			this.aClass28_2 = Class28.aClass28Array1[arg4];
			this.anInt623 = arg1;
			this.anInt624 = arg0;
			this.anInt625 = arg6;
			this.anInt626 = arg2;
			this.anInt629 = arg5 + arg3;
			this.aBoolean156 = false;
		} catch ( RuntimeException local44) {
			signlink.reporterror("83840, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	public void method420( byte arg0, int arg1) {
		try {
			this.anInt628 += arg1;
			boolean local10 = false;
			while (true) {
				do {
					do {
						if (this.anInt628 <= this.aClass28_2.aClass15_1.method97(this.anInt627)) {
							return;
						}
						this.anInt628 -= this.aClass28_2.aClass15_1.method97(this.anInt627);
						this.anInt627++;
					} while (this.anInt627 < this.aClass28_2.aClass15_1.anInt152);
				} while (this.anInt627 >= 0 && this.anInt627 < this.aClass28_2.aClass15_1.anInt152);
				this.anInt627 = 0;
				this.aBoolean156 = true;
			}
		} catch ( RuntimeException local66) {
			signlink.reporterror("8182, " + arg0 + ", " + arg1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@Override
	protected Class10_Sub1_Sub2_Sub4 method537( byte arg0) {
		try {
			if (arg0 != 3) {
				throw new NullPointerException();
			}
			Class10_Sub1_Sub2_Sub4 local10 = this.aClass28_2.method352();
			if (local10 == null) {
				return null;
			}
			int local22 = this.aClass28_2.aClass15_1.anIntArray47[this.anInt627];
			Class10_Sub1_Sub2_Sub4 local34 = new Class10_Sub1_Sub2_Sub4(false, false, true, local10, Class22.method169(this.aBoolean155, local22));
			if (!this.aBoolean156) {
				local34.method278();
				local34.method279(local22, (byte) 6);
				local34.anIntArrayArray11 = null;
				local34.anIntArrayArray10 = null;
			}
			if (this.aClass28_2.anInt438 != 128 || this.aClass28_2.anInt439 != 128) {
				local34.method287(this.aClass28_2.anInt439, this.aClass28_2.anInt438, this.aClass28_2.anInt438);
			}
			if (this.aClass28_2.anInt440 != 0) {
				if (this.aClass28_2.anInt440 == 90) {
					local34.method282();
				}
				if (this.aClass28_2.anInt440 == 180) {
					local34.method282();
					local34.method282();
				}
				if (this.aClass28_2.anInt440 == 270) {
					local34.method282();
					local34.method282();
					local34.method282();
				}
			}
			local34.method288(this.aClass28_2.anInt441 + 64, this.aClass28_2.anInt442 + 850, -30, -50, -30, true);
			return local34;
		} catch ( RuntimeException local128) {
			signlink.reporterror("80333, " + arg0 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}
}
