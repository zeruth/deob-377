



import sign.signlink;

public final class Class22 {

	private static boolean aBoolean75;

	private static Class22[] aClass22Array1;

	private static boolean[] aBooleanArray3;

	private static int anInt237 = 217;

	public int anInt238;

	public Class42 aClass42_1;

	public int anInt239;

	public int[] anIntArray81;

	public int[] anIntArray82;

	public int[] anIntArray83;

	public int[] anIntArray84;

	public static void method165( int arg0) {
		aClass22Array1 = new Class22[arg0 + 1];
		aBooleanArray3 = new boolean[arg0 + 1];
		for ( int local11 = 0; local11 < arg0 + 1; local11++) {
			aBooleanArray3[local11] = true;
		}
	}

	public static void method166( byte[] arg0) {
		try {
			Class10_Sub1_Sub3 local7 = new Class10_Sub1_Sub3(true, arg0);
			local7.anInt428 = arg0.length - 8;
			int local16 = local7.method313();
			int local19 = local7.method313();
			int local22 = local7.method313();
			int local28 = local7.method313();
			Class10_Sub1_Sub3 local36 = new Class10_Sub1_Sub3(true, arg0);
			local36.anInt428 = 0;
			int local45 = local16 + 0 + 2;
			Class10_Sub1_Sub3 local51 = new Class10_Sub1_Sub3(true, arg0);
			local51.anInt428 = local45;
			int local58 = local45 + local19;
			Class10_Sub1_Sub3 local64 = new Class10_Sub1_Sub3(true, arg0);
			local64.anInt428 = local58;
			int local71 = local58 + local22;
			Class10_Sub1_Sub3 local77 = new Class10_Sub1_Sub3(true, arg0);
			local77.anInt428 = local71;
			int local84 = local71 + local28;
			Class10_Sub1_Sub3 local90 = new Class10_Sub1_Sub3(true, arg0);
			local90.anInt428 = local84;
			Class42 local99 = new Class42(local90, 0);
			int local102 = local36.method313();
			int[] local105 = new int[500];
			int[] local108 = new int[500];
			int[] local111 = new int[500];
			int[] local114 = new int[500];
			for ( int local116 = 0; local116 < local102; local116++) {
				int local121 = local36.method313();
				Class22 local129 = aClass22Array1[local121] = new Class22();
				local129.anInt238 = local77.method311();
				local129.aClass42_1 = local99;
				int local139 = local36.method311();
				int local141 = -1;
				int local143 = 0;
				int local150;
				for ( int local145 = 0; local145 < local139; local145++) {
					local150 = local51.method311();
					if (local150 > 0) {
						if (local99.anIntArray172[local145] != 0) {
							for ( int local161 = local145 - 1; local161 > local141; local161--) {
								if (local99.anIntArray172[local161] == 0) {
									local105[local143] = local161;
									local108[local143] = 0;
									local111[local143] = 0;
									local114[local143] = 0;
									local143++;
									break;
								}
							}
						}
						local105[local143] = local145;
						short local197 = 0;
						if (local99.anIntArray172[local145] == 3) {
							local197 = 128;
						}
						if ((local150 & 0x1) == 0) {
							local108[local143] = local197;
						} else {
							local108[local143] = local64.method324();
						}
						if ((local150 & 0x2) == 0) {
							local111[local143] = local197;
						} else {
							local111[local143] = local64.method324();
						}
						if ((local150 & 0x4) == 0) {
							local114[local143] = local197;
						} else {
							local114[local143] = local64.method324();
						}
						local141 = local145;
						local143++;
						if (local99.anIntArray172[local145] == 5) {
							aBooleanArray3[local121] = false;
						}
					}
				}
				local129.anInt239 = local143;
				local129.anIntArray81 = new int[local143];
				local129.anIntArray82 = new int[local143];
				local129.anIntArray83 = new int[local143];
				local129.anIntArray84 = new int[local143];
				for (local150 = 0; local150 < local143; local150++) {
					local129.anIntArray81[local150] = local105[local150];
					local129.anIntArray82[local150] = local108[local150];
					local129.anIntArray83[local150] = local111[local150];
					local129.anIntArray84[local150] = local114[local150];
				}
			}
		} catch ( RuntimeException local328) {
			signlink.reporterror("6319, " + arg0 + ", " + true + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	public static void method167() {
		try {
			aClass22Array1 = null;
		} catch ( RuntimeException local7) {
			signlink.reporterror("60321, " + false + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	public static Class22 method168( int arg0) {
		return aClass22Array1 == null ? null : aClass22Array1[arg0];
	}

	public static boolean method169( boolean arg0, int arg1) {
		try {
			if (!arg0) {
				aBoolean75 = !aBoolean75;
			}
			return arg1 == -1;
		} catch ( RuntimeException local15) {
			signlink.reporterror("71201, " + arg0 + ", " + arg1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	private Class22() {
	}
}
