package unmapped;


import sign.signlink;

public final class Class10_Sub1_Sub2_Sub5 extends Class10_Sub1_Sub2 {

	public static Client aClient2;

	private int anInt471;

	private boolean aBoolean122 = false;

	private int anInt466;

	private int anInt467;

	private int anInt468;

	private int anInt461;

	private int anInt462;

	private int anInt463;

	private int anInt464;

	private Class15 aClass15_2;

	private int anInt473;

	private int anInt472;

	private int anInt469;

	private int anInt470;

	private int[] anIntArray154;

	private int anInt465;

	public Class10_Sub1_Sub2_Sub5( int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, boolean arg7, int arg8, int arg9) {
		try {
			this.anInt466 = arg6;
			this.anInt467 = arg4;
			this.anInt468 = arg9;
			this.anInt461 = arg8;
			this.anInt462 = arg3;
			this.anInt463 = arg1;
			this.anInt464 = arg2;
			if (arg0 != -1) {
				this.aClass15_2 = Class15.aClass15Array1[arg0];
				this.anInt473 = 0;
				this.anInt472 = Client.anInt1050 - 1;
				if (arg7 && this.aClass15_2.anInt153 != -1) {
					this.anInt473 = (int) (Math.random() * (double) this.aClass15_2.anInt152);
					this.anInt472 -= (int) (Math.random() * (double) this.aClass15_2.method97(this.anInt473));
				}
			}
			Class48 local76 = Class48.method523(this.anInt466);
			this.anInt469 = local76.anInt699;
			this.anInt470 = local76.anInt701;
			this.anIntArray154 = local76.anIntArray192;
		} catch ( RuntimeException local96) {
			signlink.reporterror("66382, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	private Class48 method358() {
		try {
			int local1 = -1;
			if (this.anInt469 != -1) {
				Class50 local15 = Class50.aClass50Array1[this.anInt469];
				int local18 = local15.anInt800;
				int local21 = local15.anInt801;
				int local24 = local15.anInt802;
				int local30 = Client.anIntArray262[local24 - local21];
				local1 = aClient2.anIntArray244[local18] >> local21 & local30;
			} else if (this.anInt470 != -1) {
				local1 = aClient2.anIntArray244[this.anInt470];
			}
			return local1 < 0 || local1 >= this.anIntArray154.length || this.anIntArray154[local1] == -1 ? null : Class48.method523(this.anIntArray154[local1]);
		} catch ( RuntimeException local73) {
			signlink.reporterror("64623, " + 0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@Override
	protected Class10_Sub1_Sub2_Sub4 method537( byte arg0) {
		try {
			if (arg0 != 3) {
				this.aBoolean122 = !this.aBoolean122;
			}
			int local14 = -1;
			if (this.aClass15_2 != null) {
				int local22 = Client.anInt1050 - this.anInt472;
				if (local22 > 100 && this.aClass15_2.anInt153 > 0) {
					local22 = 100;
				}
				label51: {
					do {
						do {
							if (local22 <= this.aClass15_2.method97(this.anInt473)) {
								break label51;
							}
							local22 -= this.aClass15_2.method97(this.anInt473);
							this.anInt473++;
						} while (this.anInt473 < this.aClass15_2.anInt152);
						this.anInt473 -= this.aClass15_2.anInt153;
					} while (this.anInt473 >= 0 && this.anInt473 < this.aClass15_2.anInt152);
					this.aClass15_2 = null;
				}
				this.anInt472 = Client.anInt1050 - local22;
				if (this.aClass15_2 != null) {
					local14 = this.aClass15_2.anIntArray47[this.anInt473];
				}
			}
			Class48 local106;
			if (this.anIntArray154 == null) {
				local106 = Class48.method523(this.anInt466);
			} else {
				local106 = this.method358();
			}
			return local106 == null ? null : local106.method531(this.anInt467, this.anInt468, this.anInt461, this.anInt462, this.anInt463, this.anInt464, local14);
		} catch ( RuntimeException local135) {
			signlink.reporterror("86963, " + arg0 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}
}
