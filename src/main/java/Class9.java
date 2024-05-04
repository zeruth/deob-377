



import sign.signlink;

public final class Class9 {

	private Class10_Sub1 aClass10_Sub1_2;

	private boolean aBoolean16 = true;

	private Class10_Sub1 aClass10_Sub1_1 = new Class10_Sub1();

	public Class9( boolean arg0) {
		try {
			this.aClass10_Sub1_1.aClass10_Sub1_36 = this.aClass10_Sub1_1;
			this.aClass10_Sub1_1.aClass10_Sub1_37 = this.aClass10_Sub1_1;
		} catch ( RuntimeException local29) {
			signlink.reporterror("93229, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	public void method33( Class10_Sub1 arg0) {
		if (arg0.aClass10_Sub1_37 != null) {
			arg0.method535();
		}
		arg0.aClass10_Sub1_37 = this.aClass10_Sub1_1.aClass10_Sub1_37;
		arg0.aClass10_Sub1_36 = this.aClass10_Sub1_1;
		arg0.aClass10_Sub1_37.aClass10_Sub1_36 = arg0;
		arg0.aClass10_Sub1_36.aClass10_Sub1_37 = arg0;
	}

	public Class10_Sub1 method34() {
		Class10_Sub1 local3 = this.aClass10_Sub1_1.aClass10_Sub1_36;
		if (local3 == this.aClass10_Sub1_1) {
			return null;
		} else {
			local3.method535();
			return local3;
		}
	}

	public Class10_Sub1 method35() {
		Class10_Sub1 local3 = this.aClass10_Sub1_1.aClass10_Sub1_36;
		if (local3 == this.aClass10_Sub1_1) {
			this.aClass10_Sub1_2 = null;
			return null;
		} else {
			this.aClass10_Sub1_2 = local3.aClass10_Sub1_36;
			return local3;
		}
	}

	public Class10_Sub1 method36() {
		try {
			Class10_Sub1 local2 = this.aClass10_Sub1_2;
			if (local2 == this.aClass10_Sub1_1) {
				this.aClass10_Sub1_2 = null;
				return null;
			} else {
				this.aClass10_Sub1_2 = local2.aClass10_Sub1_36;
				return local2;
			}
		} catch ( RuntimeException local32) {
			signlink.reporterror("62279, " + 1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	public int method37() {
		int local1 = 0;
		for ( Class10_Sub1 local5 = this.aClass10_Sub1_1.aClass10_Sub1_36; local5 != this.aClass10_Sub1_1; local5 = local5.aClass10_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
