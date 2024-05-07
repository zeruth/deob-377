package jagex2.datastruct;


import jagex2.datastruct.Linkable;
import sign.signlink;

public final class HashTable {

	private boolean aBoolean72 = true;

	private boolean aBoolean73 = true;

	private int anInt231;

	private Linkable[] aClass10Array1;

	public HashTable(int arg1) {
		this.anInt231 = arg1;
		this.aClass10Array1 = new Linkable[arg1];
		for ( int local16 = 0; local16 < arg1; local16++) {
			Linkable local26 = this.aClass10Array1[local16] = new Linkable();
			local26.next = local26;
			local26.prev = local26;
		}
	}

	public Linkable get(long arg0) {
		Linkable local11 = this.aClass10Array1[(int) (arg0 & (long) (this.anInt231 - 1))];
		for (Linkable local14 = local11.next; local14 != local11; local14 = local14.next) {
			if (local14.key == arg0) {
				return local14;
			}
		}
		return null;
	}

	public void method164(Linkable arg0, long arg1) {
		try {
			if (arg0.prev != null) {
				arg0.unlink();
			}
			Linkable local16 = this.aClass10Array1[(int) (arg1 & (long) (this.anInt231 - 1))];
			arg0.prev = local16.prev;
			arg0.next = local16;
			arg0.prev.next = arg0;
			arg0.next.prev = arg0;
			arg0.key = arg1;
		} catch ( RuntimeException local40) {
			signlink.reporterror("24638, " + 6 + ", " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
