package unmapped;


import sign.signlink;

public final class Class20 {

	private boolean aBoolean72 = true;

	private boolean aBoolean73 = true;

	private int anInt231;

	private Class10[] aClass10Array1;

	public Class20( byte arg0, int arg1) {
		try {
			this.anInt231 = arg1;
			this.aClass10Array1 = new Class10[arg1];
			for ( int local16 = 0; local16 < arg1; local16++) {
				Class10 local26 = this.aClass10Array1[local16] = new Class10();
				local26.aClass10_41 = local26;
				local26.aClass10_42 = local26;
			}
		} catch ( RuntimeException local46) {
			signlink.reporterror("68506, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	public Class10 method163( long arg0) {
		Class10 local11 = this.aClass10Array1[(int) (arg0 & (long) (this.anInt231 - 1))];
		for ( Class10 local14 = local11.aClass10_41; local14 != local11; local14 = local14.aClass10_41) {
			if (local14.aLong23 == arg0) {
				return local14;
			}
		}
		return null;
	}

	public void method164( Class10 arg0, long arg1) {
		try {
			if (arg0.aClass10_42 != null) {
				arg0.method534();
			}
			Class10 local16 = this.aClass10Array1[(int) (arg1 & (long) (this.anInt231 - 1))];
			arg0.aClass10_42 = local16.aClass10_42;
			arg0.aClass10_41 = local16;
			arg0.aClass10_42.aClass10_41 = arg0;
			arg0.aClass10_41.aClass10_42 = arg0;
			arg0.aLong23 = arg1;
		} catch ( RuntimeException local40) {
			signlink.reporterror("24638, " + 6 + ", " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
