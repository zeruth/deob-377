package jagex2.datastruct;


import jagex2.datastruct.Hashable;
import sign.signlink;

public final class Stack {

	private Hashable aClass10_Sub1_2;

	private boolean aBoolean16 = true;

	private Hashable aClass10_Sub1_1 = new Hashable();

	public Stack() {
		this.aClass10_Sub1_1.nextHashable = this.aClass10_Sub1_1;
		this.aClass10_Sub1_1.prevHashable = this.aClass10_Sub1_1;
	}

	public void method33( Hashable arg0) {
		if (arg0.prevHashable != null) {
			arg0.uncache();
		}
		arg0.prevHashable = this.aClass10_Sub1_1.prevHashable;
		arg0.nextHashable = this.aClass10_Sub1_1;
		arg0.prevHashable.nextHashable = arg0;
		arg0.nextHashable.prevHashable = arg0;
	}

	public Hashable pop() {
		Hashable local3 = this.aClass10_Sub1_1.nextHashable;
		if (local3 == this.aClass10_Sub1_1) {
			return null;
		} else {
			local3.uncache();
			return local3;
		}
	}

	public Hashable method35() {
		Hashable local3 = this.aClass10_Sub1_1.nextHashable;
		if (local3 == this.aClass10_Sub1_1) {
			this.aClass10_Sub1_2 = null;
			return null;
		} else {
			this.aClass10_Sub1_2 = local3.nextHashable;
			return local3;
		}
	}

	public Hashable method36() {
		try {
			Hashable local2 = this.aClass10_Sub1_2;
			if (local2 == this.aClass10_Sub1_1) {
				this.aClass10_Sub1_2 = null;
				return null;
			} else {
				this.aClass10_Sub1_2 = local2.nextHashable;
				return local2;
			}
		} catch ( RuntimeException local32) {
			signlink.reporterror("62279, " + 1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	public int method37() {
		int local1 = 0;
		for (Hashable local5 = this.aClass10_Sub1_1.nextHashable; local5 != this.aClass10_Sub1_1; local5 = local5.nextHashable) {
			local1++;
		}
		return local1;
	}
}
