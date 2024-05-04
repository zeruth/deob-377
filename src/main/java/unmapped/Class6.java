package unmapped;


import sign.signlink;

public final class Class6 {

	private int anInt52;

	private Class10 aClass10_2;

	private int anInt51 = -48545;

	private Class10 aClass10_1 = new Class10();

	public Class6( boolean arg0) {
		try {
			this.aClass10_1.aClass10_41 = this.aClass10_1;
			this.aClass10_1.aClass10_42 = this.aClass10_1;
		} catch ( RuntimeException local29) {
			signlink.reporterror("28867, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	public void method3( Class10 arg0) {
		if (arg0.aClass10_42 != null) {
			arg0.method534();
		}
		arg0.aClass10_42 = this.aClass10_1.aClass10_42;
		arg0.aClass10_41 = this.aClass10_1;
		arg0.aClass10_42.aClass10_41 = arg0;
		arg0.aClass10_41.aClass10_42 = arg0;
	}

	public void method4( Class10 arg0) {
		try {
			if (arg0.aClass10_42 != null) {
				arg0.method534();
			}
			arg0.aClass10_42 = this.aClass10_1;
			arg0.aClass10_41 = this.aClass10_1.aClass10_41;
			arg0.aClass10_42.aClass10_41 = arg0;
			arg0.aClass10_41.aClass10_42 = arg0;
		} catch ( RuntimeException local39) {
			signlink.reporterror("85719, " + -57 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	public Class10 method5() {
		Class10 local3 = this.aClass10_1.aClass10_41;
		if (local3 == this.aClass10_1) {
			return null;
		} else {
			local3.method534();
			return local3;
		}
	}

	public Class10 method6() {
		Class10 local3 = this.aClass10_1.aClass10_41;
		if (local3 == this.aClass10_1) {
			this.aClass10_2 = null;
			return null;
		} else {
			this.aClass10_2 = local3.aClass10_41;
			return local3;
		}
	}

	public Class10 method7() {
		try {
			Class10 local3 = this.aClass10_1.aClass10_42;
			if (local3 == this.aClass10_1) {
				this.aClass10_2 = null;
				return null;
			} else {
				this.aClass10_2 = local3.aClass10_42;
				return local3;
			}
		} catch ( RuntimeException local28) {
			signlink.reporterror("67224, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	public Class10 method8() {
		try {
			Class10 local2 = this.aClass10_2;
			if (local2 == this.aClass10_1) {
				this.aClass10_2 = null;
				return null;
			} else {
				this.aClass10_2 = local2.aClass10_41;
				return local2;
			}
		} catch ( RuntimeException local25) {
			signlink.reporterror("40388, " + 1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	public Class10 method9() {
		try {
			Class10 local2 = this.aClass10_2;
			if (local2 == this.aClass10_1) {
				this.aClass10_2 = null;
				return null;
			} else {
				this.aClass10_2 = local2.aClass10_42;
				return local2;
			}
		} catch ( RuntimeException local24) {
			signlink.reporterror("26745, " + 173 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	public void method10() {
		if (this.aClass10_1.aClass10_41 == this.aClass10_1) {
			return;
		}
		while (true) {
			Class10 local10 = this.aClass10_1.aClass10_41;
			if (local10 == this.aClass10_1) {
				return;
			}
			local10.method534();
		}
	}
}
