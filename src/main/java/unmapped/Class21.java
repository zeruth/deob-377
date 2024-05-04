package unmapped;


import sign.signlink;

public final class Class21 {

	public static int[] anIntArray73 = new int[6];

	public static int[] anIntArray74 = new int[6];

	public static int[] anIntArray75 = new int[6];

	public static int[] anIntArray76 = new int[6];

	public static int[] anIntArray77 = new int[6];

	private static int[] anIntArray78 = new int[] { 1, 0 };

	private static int[] anIntArray79 = new int[] { 2, 1 };

	private static int[] anIntArray80 = new int[] { 3, 3 };

	private static final int[][] anIntArrayArray6 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	private static final int[][] anIntArrayArray7 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	private int anInt232;

	public boolean aBoolean74 = true;

	public int anInt233;

	public int anInt234;

	public int anInt235;

	public int anInt236;

	public int[] anIntArray63;

	public int[] anIntArray64;

	public int[] anIntArray65;

	public int[] anIntArray69;

	public int[] anIntArray70;

	public int[] anIntArray71;

	public int[] anIntArray66;

	public int[] anIntArray67;

	public int[] anIntArray68;

	public int[] anIntArray72;

	public Class21( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		try {
			if (arg3 != arg13 || arg3 != arg2 || arg3 != arg0) {
				this.aBoolean74 = false;
			}
			this.anInt233 = arg12;
			this.anInt234 = arg19;
			this.anInt235 = arg16;
			this.anInt236 = arg7;
			short local32 = 128;
			int local36 = local32 / 2;
			int local40 = local32 / 4;
			int local46 = local32 * 3 / 4;
			if (arg10 < this.anInt232 || arg10 > this.anInt232) {
				throw new NullPointerException();
			}
			int[] local62 = anIntArrayArray6[arg12];
			int local65 = local62.length;
			this.anIntArray63 = new int[local65];
			this.anIntArray64 = new int[local65];
			this.anIntArray65 = new int[local65];
			int[] local80 = new int[local65];
			int[] local83 = new int[local65];
			int local87 = arg4 * local32;
			int local91 = arg18 * local32;
			int local155;
			int local157;
			int local159;
			int local161;
			int local163;
			for ( int local93 = 0; local93 < local65; local93++) {
				int local99 = local62[local93];
				if ((local99 & 0x1) == 0 && local99 <= 8) {
					local99 = (local99 - arg19 - arg19 - 1 & 0x7) + 1;
				}
				if (local99 > 8 && local99 <= 12) {
					local99 = (local99 - arg19 - 9 & 0x3) + 9;
				}
				if (local99 > 12 && local99 <= 16) {
					local99 = (local99 - arg19 - 13 & 0x3) + 13;
				}
				if (local99 == 1) {
					local155 = local87;
					local157 = local91;
					local159 = arg3;
					local161 = arg11;
					local163 = arg1;
				} else if (local99 == 2) {
					local155 = local87 + local36;
					local157 = local91;
					local159 = arg3 + arg13 >> 1;
					local161 = arg11 + arg8 >> 1;
					local163 = arg1 + arg17 >> 1;
				} else if (local99 == 3) {
					local155 = local87 + local32;
					local157 = local91;
					local159 = arg13;
					local161 = arg8;
					local163 = arg17;
				} else if (local99 == 4) {
					local155 = local87 + local32;
					local157 = local91 + local36;
					local159 = arg13 + arg2 >> 1;
					local161 = arg8 + arg5 >> 1;
					local163 = arg17 + arg9 >> 1;
				} else if (local99 == 5) {
					local155 = local87 + local32;
					local157 = local91 + local32;
					local159 = arg2;
					local161 = arg5;
					local163 = arg9;
				} else if (local99 == 6) {
					local155 = local87 + local36;
					local157 = local91 + local32;
					local159 = arg2 + arg0 >> 1;
					local161 = arg5 + arg6 >> 1;
					local163 = arg9 + arg14 >> 1;
				} else if (local99 == 7) {
					local155 = local87;
					local157 = local91 + local32;
					local159 = arg0;
					local161 = arg6;
					local163 = arg14;
				} else if (local99 == 8) {
					local155 = local87;
					local157 = local91 + local36;
					local159 = arg0 + arg3 >> 1;
					local161 = arg6 + arg11 >> 1;
					local163 = arg14 + arg1 >> 1;
				} else if (local99 == 9) {
					local155 = local87 + local36;
					local157 = local91 + local40;
					local159 = arg3 + arg13 >> 1;
					local161 = arg11 + arg8 >> 1;
					local163 = arg1 + arg17 >> 1;
				} else if (local99 == 10) {
					local155 = local87 + local46;
					local157 = local91 + local36;
					local159 = arg13 + arg2 >> 1;
					local161 = arg8 + arg5 >> 1;
					local163 = arg17 + arg9 >> 1;
				} else if (local99 == 11) {
					local155 = local87 + local36;
					local157 = local91 + local46;
					local159 = arg2 + arg0 >> 1;
					local161 = arg5 + arg6 >> 1;
					local163 = arg9 + arg14 >> 1;
				} else if (local99 == 12) {
					local155 = local87 + local40;
					local157 = local91 + local36;
					local159 = arg0 + arg3 >> 1;
					local161 = arg6 + arg11 >> 1;
					local163 = arg14 + arg1 >> 1;
				} else if (local99 == 13) {
					local155 = local87 + local40;
					local157 = local91 + local40;
					local159 = arg3;
					local161 = arg11;
					local163 = arg1;
				} else if (local99 == 14) {
					local155 = local87 + local46;
					local157 = local91 + local40;
					local159 = arg13;
					local161 = arg8;
					local163 = arg17;
				} else if (local99 == 15) {
					local155 = local87 + local46;
					local157 = local91 + local46;
					local159 = arg2;
					local161 = arg5;
					local163 = arg9;
				} else {
					local155 = local87 + local40;
					local157 = local91 + local46;
					local159 = arg0;
					local161 = arg6;
					local163 = arg14;
				}
				this.anIntArray63[local93] = local155;
				this.anIntArray64[local93] = local159;
				this.anIntArray65[local93] = local157;
				local80[local93] = local161;
				local83[local93] = local163;
			}
			int[] local564 = anIntArrayArray7[arg12];
			local155 = local564.length / 4;
			this.anIntArray69 = new int[local155];
			this.anIntArray70 = new int[local155];
			this.anIntArray71 = new int[local155];
			this.anIntArray66 = new int[local155];
			this.anIntArray67 = new int[local155];
			this.anIntArray68 = new int[local155];
			if (arg15 != -1) {
				this.anIntArray72 = new int[local155];
			}
			local157 = 0;
			for (local159 = 0; local159 < local155; local159++) {
				local161 = local564[local157];
				local163 = local564[local157 + 1];
				int local622 = local564[local157 + 2];
				int local628 = local564[local157 + 3];
				local157 += 4;
				if (local163 < 4) {
					local163 = local163 - arg19 & 0x3;
				}
				if (local622 < 4) {
					local622 = local622 - arg19 & 0x3;
				}
				if (local628 < 4) {
					local628 = local628 - arg19 & 0x3;
				}
				this.anIntArray69[local159] = local163;
				this.anIntArray70[local159] = local622;
				this.anIntArray71[local159] = local628;
				if (local161 == 0) {
					this.anIntArray66[local159] = local80[local163];
					this.anIntArray67[local159] = local80[local622];
					this.anIntArray68[local159] = local80[local628];
					if (this.anIntArray72 != null) {
						this.anIntArray72[local159] = -1;
					}
				} else {
					this.anIntArray66[local159] = local83[local163];
					this.anIntArray67[local159] = local83[local622];
					this.anIntArray68[local159] = local83[local628];
					if (this.anIntArray72 != null) {
						this.anIntArray72[local159] = arg15;
					}
				}
			}
			local161 = arg3;
			local163 = arg13;
			if (arg13 < arg3) {
				local161 = arg13;
			}
			if (arg13 > arg13) {
				local163 = arg13;
			}
			if (arg2 < local161) {
				local161 = arg2;
			}
			if (arg2 > arg13) {
				local163 = arg2;
			}
			if (arg0 < local161) {
				;
			}
			if (arg0 > local163) {
				;
			}
		} catch ( RuntimeException local789) {
			signlink.reporterror("98450, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + arg12 + ", " + arg13 + ", " + arg14 + ", " + arg15 + ", " + arg16 + ", " + arg17 + ", " + arg18 + ", " + arg19 + ", " + local789.toString());
			throw new RuntimeException();
		}
	}
}
