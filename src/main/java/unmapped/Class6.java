package unmapped;


import jagex2.datastruct.Linkable;
import sign.signlink;

public final class Class6 {

	private int anInt52;

	private Linkable aClass10_2;

	private int anInt51 = -48545;

	private Linkable aClass10_1 = new Linkable();

	public Class6( boolean arg0) {
		try {
			this.aClass10_1.next = this.aClass10_1;
			this.aClass10_1.prev = this.aClass10_1;
		} catch ( RuntimeException local29) {
			signlink.reporterror("28867, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	public void method3( Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.aClass10_1.prev;
		arg0.next = this.aClass10_1;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	public void method4( Linkable arg0) {
		try {
			if (arg0.prev != null) {
				arg0.unlink();
			}
			arg0.prev = this.aClass10_1;
			arg0.next = this.aClass10_1.next;
			arg0.prev.next = arg0;
			arg0.next.prev = arg0;
		} catch ( RuntimeException local39) {
			signlink.reporterror("85719, " + -57 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	public Linkable method5() {
		Linkable local3 = this.aClass10_1.next;
		if (local3 == this.aClass10_1) {
			return null;
		} else {
			local3.unlink();
			return local3;
		}
	}

	public Linkable method6() {
		Linkable local3 = this.aClass10_1.next;
		if (local3 == this.aClass10_1) {
			this.aClass10_2 = null;
			return null;
		} else {
			this.aClass10_2 = local3.next;
			return local3;
		}
	}

	public Linkable method7() {
		try {
			Linkable local3 = this.aClass10_1.prev;
			if (local3 == this.aClass10_1) {
				this.aClass10_2 = null;
				return null;
			} else {
				this.aClass10_2 = local3.prev;
				return local3;
			}
		} catch ( RuntimeException local28) {
			signlink.reporterror("67224, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	public Linkable method8() {
		try {
			Linkable local2 = this.aClass10_2;
			if (local2 == this.aClass10_1) {
				this.aClass10_2 = null;
				return null;
			} else {
				this.aClass10_2 = local2.next;
				return local2;
			}
		} catch ( RuntimeException local25) {
			signlink.reporterror("40388, " + 1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	public Linkable method9() {
		try {
			Linkable local2 = this.aClass10_2;
			if (local2 == this.aClass10_1) {
				this.aClass10_2 = null;
				return null;
			} else {
				this.aClass10_2 = local2.prev;
				return local2;
			}
		} catch ( RuntimeException local24) {
			signlink.reporterror("26745, " + 173 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	public void clear() {
		if (this.aClass10_1.next == this.aClass10_1) {
			return;
		}
		while (true) {
			Linkable local10 = this.aClass10_1.next;
			if (local10 == this.aClass10_1) {
				return;
			}
			local10.unlink();
		}
	}
}
