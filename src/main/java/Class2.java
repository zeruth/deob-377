



import sign.signlink;

public final class Class2 {

	private byte[] aByteArray7;

	private int anInt30;

	private int[] anIntArray7;

	private int[] anIntArray8;

	private int[] anIntArray9;

	private int[] anIntArray10;

	private boolean aBoolean3;

	private int anInt29 = -766;

	private boolean aBoolean2 = true;

	public Class2( byte[] arg0, int arg1) {
		try {
			this.method1(arg0);
		} catch ( RuntimeException local26) {
			signlink.reporterror("5971, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	private void method1( byte[] arg0) {
		try {
			Class10_Sub1_Sub3 local7 = new Class10_Sub1_Sub3(true, arg0);
			int local10 = local7.method315();
			int local13 = local7.method315();
			if (local13 == local10) {
				this.aByteArray7 = arg0;
				this.aBoolean3 = false;
			} else {
				byte[] local19 = new byte[local10];
				Class31.method363(local19, local10, arg0, local13, 6);
				this.aByteArray7 = local19;
				local7 = new Class10_Sub1_Sub3(true, this.aByteArray7);
				this.aBoolean3 = true;
			}
			this.anInt30 = local7.method313();
			this.anIntArray7 = new int[this.anInt30];
			this.anIntArray8 = new int[this.anInt30];
			this.anIntArray9 = new int[this.anInt30];
			this.anIntArray10 = new int[this.anInt30];
			int local82 = local7.anInt428 + this.anInt30 * 10;
			for ( int local84 = 0; local84 < this.anInt30; local84++) {
				this.anIntArray7[local84] = local7.method316();
				this.anIntArray8[local84] = local7.method315();
				this.anIntArray9[local84] = local7.method315();
				this.anIntArray10[local84] = local82;
				local82 += this.anIntArray9[local84];
			}
		} catch ( RuntimeException local123) {
			signlink.reporterror("56904, " + 0 + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	public byte[] method2( String arg0, byte[] arg1) {
		int local3 = 0;
		String local6 = arg0.toUpperCase();
		for ( int local8 = 0; local8 < local6.length(); local8++) {
			local3 = local3 * 61 + local6.charAt(local8) - 32;
		}
		for ( int local27 = 0; local27 < this.anInt30; local27++) {
			if (this.anIntArray7[local27] == local3) {
				if (arg1 == null) {
					arg1 = new byte[this.anIntArray8[local27]];
				}
				if (this.aBoolean3) {
					for ( int local67 = 0; local67 < this.anIntArray8[local27]; local67++) {
						arg1[local67] = this.aByteArray7[this.anIntArray10[local27] + local67];
					}
				} else {
					Class31.method363(arg1, this.anIntArray8[local27], this.aByteArray7, this.anIntArray9[local27], this.anIntArray10[local27]);
				}
				return arg1;
			}
		}
		return null;
	}
}
