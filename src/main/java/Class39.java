



import sign.signlink;

public final class Class39 {

	private static byte[] aByteArray15;

	private static Class10_Sub1_Sub3 aClass10_Sub1_Sub3_4;

	private static byte aByte33 = 6;

	private static boolean aBoolean146 = true;

	private static Class39[] aClass39Array1 = new Class39[5000];

	public static int[] anIntArray171 = new int[5000];

	private int anInt587;

	private int anInt588;

	private int anInt585 = -573;

	private int anInt586 = -252;

	private Class12[] aClass12Array1 = new Class12[10];

	public static void method408( Class10_Sub1_Sub3 arg0) {
		try {
			aByteArray15 = new byte[441000];
			aClass10_Sub1_Sub3_4 = new Class10_Sub1_Sub3(true, aByteArray15);
			Class12.method41();
			while (true) {
				int local16 = arg0.method313();
				if (local16 == 65535) {
					return;
				}
				aClass39Array1[local16] = new Class39(-524);
				aClass39Array1[local16].method410(aByte33, arg0);
				anIntArray171[local16] = aClass39Array1[local16].method411();
			}
		} catch ( RuntimeException local43) {
			signlink.reporterror("32846, " + arg0 + ", " + 36135 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	public static Class10_Sub1_Sub3 method409( int arg0, int arg1) {
		try {
			if (aClass39Array1[arg1] == null) {
				return null;
			} else {
				Class39 local16 = aClass39Array1[arg1];
				return local16.method412(arg0);
			}
		} catch ( RuntimeException local24) {
			signlink.reporterror("79759, " + arg0 + ", " + 6 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	private Class39( int arg0) {
	}

	private void method410( byte arg0, Class10_Sub1_Sub3 arg1) {
		try {
			for ( int local1 = 0; local1 < 10; local1++) {
				int local6 = arg1.method311();
				if (local6 != 0) {
					arg1.anInt428--;
					this.aClass12Array1[local1] = new Class12();
					this.aClass12Array1[local1].method44(aByte33, arg1);
				}
			}
			this.anInt587 = arg1.method313();
			this.anInt588 = arg1.method313();
			if (arg0 == 6) {
				boolean local45 = false;
			} else {
				this.anInt586 = 64;
			}
		} catch ( RuntimeException local51) {
			signlink.reporterror("74804, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	private int method411() {
		try {
			int local3 = 9999999;
			for ( int local5 = 0; local5 < 10; local5++) {
				if (this.aClass12Array1[local5] != null && this.aClass12Array1[local5].anInt73 / 20 < local3) {
					local3 = this.aClass12Array1[local5].anInt73 / 20;
				}
			}
			if (this.anInt587 < this.anInt588 && this.anInt587 / 20 < local3) {
				local3 = this.anInt587 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for ( int local58 = 0; local58 < 10; local58++) {
				if (this.aClass12Array1[local58] != null) {
					this.aClass12Array1[local58].anInt73 -= local3 * 20;
				}
			}
			if (this.anInt587 < this.anInt588) {
				this.anInt587 -= local3 * 20;
				this.anInt588 -= local3 * 20;
			}
			return local3;
		} catch ( RuntimeException local112) {
			signlink.reporterror("32270, " + 0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	private Class10_Sub1_Sub3 method412( int arg0) {
		try {
			int local3 = this.method413(arg0);
			aClass10_Sub1_Sub3_4.anInt428 = 0;
			aClass10_Sub1_Sub3_4.method305(1380533830);
			aClass10_Sub1_Sub3_4.method306(local3 + 36);
			aClass10_Sub1_Sub3_4.method305(1463899717);
			aClass10_Sub1_Sub3_4.method305(1718449184);
			aClass10_Sub1_Sub3_4.method306(16);
			aClass10_Sub1_Sub3_4.method303(1);
			aClass10_Sub1_Sub3_4.method303(1);
			aClass10_Sub1_Sub3_4.method306(22050);
			aClass10_Sub1_Sub3_4.method306(22050);
			aClass10_Sub1_Sub3_4.method303(1);
			aClass10_Sub1_Sub3_4.method303(8);
			aClass10_Sub1_Sub3_4.method305(1684108385);
			aClass10_Sub1_Sub3_4.method306(local3);
			aClass10_Sub1_Sub3_4.anInt428 += local3;
			return aClass10_Sub1_Sub3_4;
		} catch ( RuntimeException local71) {
			signlink.reporterror("58296, " + -573 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	private int method413( int arg0) {
		int local3 = 0;
		for ( int local5 = 0; local5 < 10; local5++) {
			if (this.aClass12Array1[local5] != null && this.aClass12Array1[local5].anInt72 + this.aClass12Array1[local5].anInt73 > local3) {
				local3 = this.aClass12Array1[local5].anInt72 + this.aClass12Array1[local5].anInt73;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		int local51 = local3 * 22050 / 1000;
		int local58 = this.anInt587 * 22050 / 1000;
		int local65 = this.anInt588 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for ( int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray15[local92] = -128;
		}
		int local123;
		int local133;
		int local147;
		for ( int local106 = 0; local106 < 10; local106++) {
			if (this.aClass12Array1[local106] != null) {
				local123 = this.aClass12Array1[local106].anInt72 * 22050 / 1000;
				local133 = this.aClass12Array1[local106].anInt73 * 22050 / 1000;
				int[] local145 = this.aClass12Array1[local106].method42(local123, this.aClass12Array1[local106].anInt72);
				for (local147 = 0; local147 < local123; local147++) {
					int local165 = (aByteArray15[local147 + local133 + 44] & 0xFF) + (local145[local147] >> 8);
					if ((local165 & 0xFFFFFF00) != 0) {
						local165 = ~(local165 >> 31);
					}
					aByteArray15[local147 + local133 + 44] = (byte) local165;
				}
			}
		}
		if (arg0 > 1) {
			local58 += 44;
			local65 += 44;
			local51 += 44;
			local90 += 44;
			local123 = local90 - local51;
			for (local133 = local51 - 1; local133 >= local65; local133--) {
				aByteArray15[local133 + local123] = aByteArray15[local133];
			}
			for ( int local223 = 1; local223 < arg0; local223++) {
				local123 = (local65 - local58) * local223;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray15[local147 + local123] = aByteArray15[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
