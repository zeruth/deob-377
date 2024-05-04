



import sign.signlink;

public final class Class25 {

	private int anInt322;

	private int anInt323;

	private int anInt324;

	private int anInt325;

	private int[] anIntArray103;

	private int[] anIntArray102;

	public Class25( int arg0, int[] arg1) {
		try {
			this.anIntArray103 = new int[256];
			this.anIntArray102 = new int[256];
			for ( int local11 = 0; local11 < arg1.length; local11++) {
				this.anIntArray102[local11] = arg1[local11];
			}
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			this.method247();
		} catch ( RuntimeException local35) {
			signlink.reporterror("91630, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	public int method245() {
		if (this.anInt322-- == 0) {
			this.method246();
			this.anInt322 = 255;
		}
		return this.anIntArray102[this.anInt322];
	}

	private void method246() {
		this.anInt324 += ++this.anInt325;
		for ( int local15 = 0; local15 < 256; local15++) {
			int local22 = this.anIntArray103[local15];
			if ((local15 & 0x3) == 0) {
				this.anInt323 ^= this.anInt323 << 13;
			} else if ((local15 & 0x3) == 1) {
				this.anInt323 ^= this.anInt323 >>> 6;
			} else if ((local15 & 0x3) == 2) {
				this.anInt323 ^= this.anInt323 << 2;
			} else if ((local15 & 0x3) == 3) {
				this.anInt323 ^= this.anInt323 >>> 16;
			}
			this.anInt323 += this.anIntArray103[local15 + 128 & 0xFF];
			int local115;
			this.anIntArray103[local15] = local115 = this.anIntArray103[local22 >> 2 & 0xFF] + this.anInt323 + this.anInt324;
			this.anIntArray102[local15] = this.anInt324 = this.anIntArray103[local115 >> 8 >> 2 & 0xFF] + local22;
		}
	}

	private void method247() {
		int local4 = -1640531527;
		int local6 = -1640531527;
		int local8 = -1640531527;
		int local10 = -1640531527;
		int local12 = -1640531527;
		int local14 = -1640531527;
		int local16 = -1640531527;
		int local17 = -1640531527;
		int local19;
		for (local19 = 0; local19 < 4; local19++) {
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray102[local19];
			local16 += this.anIntArray102[local19 + 1];
			local14 += this.anIntArray102[local19 + 2];
			local12 += this.anIntArray102[local19 + 3];
			local10 += this.anIntArray102[local19 + 4];
			local8 += this.anIntArray102[local19 + 5];
			local6 += this.anIntArray102[local19 + 6];
			local4 += this.anIntArray102[local19 + 7];
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
			this.anIntArray103[local19] = local17;
			this.anIntArray103[local19 + 1] = local16;
			this.anIntArray103[local19 + 2] = local14;
			this.anIntArray103[local19 + 3] = local12;
			this.anIntArray103[local19 + 4] = local10;
			this.anIntArray103[local19 + 5] = local8;
			this.anIntArray103[local19 + 6] = local6;
			this.anIntArray103[local19 + 7] = local4;
		}
		for (local19 = 0; local19 < 256; local19 += 8) {
			local17 += this.anIntArray103[local19];
			local16 += this.anIntArray103[local19 + 1];
			local14 += this.anIntArray103[local19 + 2];
			local12 += this.anIntArray103[local19 + 3];
			local10 += this.anIntArray103[local19 + 4];
			local8 += this.anIntArray103[local19 + 5];
			local6 += this.anIntArray103[local19 + 6];
			local4 += this.anIntArray103[local19 + 7];
			local17 ^= local16 << 11;
			local12 += local17;
			local16 += local14;
			local16 ^= local14 >>> 2;
			local10 += local16;
			local14 += local12;
			local14 ^= local12 << 8;
			local8 += local14;
			local12 += local10;
			local12 ^= local10 >>> 16;
			local6 += local12;
			local10 += local8;
			local10 ^= local8 << 10;
			local4 += local10;
			local8 += local6;
			local8 ^= local6 >>> 4;
			local17 += local8;
			local6 += local4;
			local6 ^= local4 << 8;
			local16 += local6;
			local4 += local17;
			local4 ^= local17 >>> 9;
			local14 += local4;
			local17 += local16;
			this.anIntArray103[local19] = local17;
			this.anIntArray103[local19 + 1] = local16;
			this.anIntArray103[local19 + 2] = local14;
			this.anIntArray103[local19 + 3] = local12;
			this.anIntArray103[local19 + 4] = local10;
			this.anIntArray103[local19 + 5] = local8;
			this.anIntArray103[local19 + 6] = local6;
			this.anIntArray103[local19 + 7] = local4;
		}
		this.method246();
		this.anInt322 = 256;
	}
}
