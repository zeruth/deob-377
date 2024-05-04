



import sign.signlink;

public final class Class34 {

	private int anInt540;

	private int anInt541;

	private int anInt539 = 256;

	private Class10_Sub1 aClass10_Sub1_29 = new Class10_Sub1();

	private Class9 aClass9_1 = new Class9(true);

	private int anInt542;

	private int anInt543;

	private Class20 aClass20_1;

	public Class34( int arg0, int arg1) {
		try {
			this.anInt542 = arg0;
			this.anInt543 = arg0;
			this.aClass20_1 = new Class20((byte) 0, 1024);
		} catch ( RuntimeException local35) {
			signlink.reporterror("68195, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1 method387( long arg0) {
		Class10_Sub1 local5 = (Class10_Sub1) this.aClass20_1.method163(arg0);
		if (local5 == null) {
			this.anInt540++;
		} else {
			this.aClass9_1.method33(local5);
			this.anInt541++;
		}
		return local5;
	}

	public void method388( Class10_Sub1 arg0, long arg1) {
		try {
			if (this.anInt543 == 0) {
				Class10_Sub1 local14 = this.aClass9_1.method34();
				local14.method534();
				local14.method535();
				if (local14 == this.aClass10_Sub1_29) {
					local14 = this.aClass9_1.method34();
					local14.method534();
					local14.method535();
				}
			} else {
				this.anInt543--;
			}
			this.aClass20_1.method164(arg0, arg1);
			this.aClass9_1.method33(arg0);
		} catch ( RuntimeException local55) {
			signlink.reporterror("76413, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	public void method389() {
		while (true) {
			Class10_Sub1 local3 = this.aClass9_1.method34();
			if (local3 == null) {
				this.anInt543 = this.anInt542;
				return;
			}
			local3.method534();
			local3.method535();
		}
	}
}
