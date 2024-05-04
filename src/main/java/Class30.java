



import sign.signlink;

public final class Class30 {

	private int anInt474;

	private int[] anIntArray155;

	private int[] anIntArray156;

	public int anInt475;

	public int anInt476;

	public int anInt477;

	private int anInt478;

	private int anInt479;

	private int anInt480;

	private int anInt481;

	private int anInt482;

	private boolean aBoolean123 = true;

	public void method359( byte arg0, Class10_Sub1_Sub3 arg1) {
		try {
			this.anInt477 = arg1.method311();
			if (arg0 != 6) {
				throw new NullPointerException();
			}
			boolean local8 = false;
			this.anInt475 = arg1.method316();
			this.anInt476 = arg1.method316();
			this.method360(arg1);
		} catch ( RuntimeException local28) {
			signlink.reporterror("33975, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	public void method360( Class10_Sub1_Sub3 arg0) {
		try {
			this.anInt474 = arg0.method311();
			this.anIntArray155 = new int[this.anInt474];
			this.anIntArray156 = new int[this.anInt474];
			for ( int local18 = 0; local18 < this.anInt474; local18++) {
				this.anIntArray155[local18] = arg0.method313();
				this.anIntArray156[local18] = arg0.method313();
			}
		} catch ( RuntimeException local39) {
			signlink.reporterror("28975, " + arg0 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	public void method361() {
		try {
			this.anInt478 = 0;
			this.anInt479 = 0;
			this.anInt480 = 0;
			this.anInt481 = 0;
			this.anInt482 = 0;
		} catch ( RuntimeException local19) {
			signlink.reporterror("11493, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	public int method362( int arg0) {
		try {
			if (this.anInt482 >= this.anInt478) {
				this.anInt481 = this.anIntArray156[this.anInt479++] << 15;
				if (this.anInt479 >= this.anInt474) {
					this.anInt479 = this.anInt474 - 1;
				}
				this.anInt478 = (int) ((double) this.anIntArray155[this.anInt479] / 65536.0D * (double) arg0);
				if (this.anInt478 > this.anInt482) {
					this.anInt480 = ((this.anIntArray156[this.anInt479] << 15) - this.anInt481) / (this.anInt478 - this.anInt482);
				}
			}
			this.anInt481 += this.anInt480;
			this.anInt482++;
			return this.anInt481 - this.anInt480 >> 15;
		} catch ( RuntimeException local97) {
			signlink.reporterror("72068, " + 0 + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
