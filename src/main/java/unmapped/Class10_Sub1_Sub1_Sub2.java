package unmapped;

import java.util.Random;


import jagex2.graphics.Draw2D;
import jagex2.io.JagFile;
import sign.signlink;

public final class Class10_Sub1_Sub1_Sub2 extends Draw2D {

	private boolean aBoolean69 = true;

	private boolean aBoolean70 = true;

	private int anInt228 = 3;

	private int anInt229 = 3;

	private byte[][] aByteArrayArray3 = new byte[256][];

	private int[] anIntArray58 = new int[256];

	private int[] anIntArray59 = new int[256];

	private int[] anIntArray60 = new int[256];

	private int[] anIntArray61 = new int[256];

	private int[] anIntArray62 = new int[256];

	private Random aRandom1 = new Random();

	private boolean aBoolean71 = false;

	public int anInt230;

	public Class10_Sub1_Sub1_Sub2(boolean arg0, JagFile arg1, int arg2, String arg3) {
		try {
			Packet local63 = new Packet(arg1.read(arg3 + ".dat", null));
			Packet local72 = new Packet(arg1.read("index.dat", null));
			local72.pos = local63.g2() + 4;
			int local95 = local72.g1();
			if (local95 > 0) {
				local72.pos += (local95 - 1) * 3;
			}
			for ( int local109 = 0; local109 < 256; local109++) {
				this.anIntArray60[local109] = local72.g1();
				this.anIntArray61[local109] = local72.g1();
				int local133 = this.anIntArray58[local109] = local72.g2();
				int local141 = this.anIntArray59[local109] = local72.g2();
				int local144 = local72.g1();
				int local148 = local133 * local141;
				this.aByteArrayArray3[local109] = new byte[local148];
				int local158;
				int local183;
				if (local144 == 0) {
					for (local158 = 0; local158 < local148; local158++) {
						this.aByteArrayArray3[local109][local158] = local63.g1b();
					}
				} else if (local144 == 1) {
					for (local158 = 0; local158 < local133; local158++) {
						for (local183 = 0; local183 < local141; local183++) {
							this.aByteArrayArray3[local109][local158 + local183 * local133] = local63.g1b();
						}
					}
				}
				if (local141 > this.anInt230 && local109 < 128) {
					this.anInt230 = local141;
				}
				this.anIntArray60[local109] = 1;
				this.anIntArray62[local109] = local133 + 2;
				local158 = 0;
				for (local183 = local141 / 7; local183 < local141; local183++) {
					local158 += this.aByteArrayArray3[local109][local183 * local133];
				}
				int local260;
				if (local158 <= local141 / 7) {
					local260 = this.anIntArray62[local109]--;
					this.anIntArray60[local109] = 0;
				}
				local158 = 0;
				for ( int local274 = local141 / 7; local274 < local141; local274++) {
					local158 += this.aByteArrayArray3[local109][local133 + local274 * local133 - 1];
				}
				if (local158 <= local141 / 7) {
					local260 = this.anIntArray62[local109]--;
				}
			}
			if (arg0) {
				this.anIntArray62[32] = this.anIntArray62[73];
			} else {
				this.anIntArray62[32] = this.anIntArray62[105];
			}
		} catch ( RuntimeException local333) {
			signlink.reporterror("60156, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	public void method147( String arg0, int arg1, int arg2) {
		try {
			this.method152(507 - this.method151(arg0), arg1, arg2, arg0);
		} catch ( RuntimeException local15) {
			signlink.reporterror("54845, " + true + ", " + arg0 + ", " + arg1 + ", " + 507 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	public void method148( int arg0, int arg1, int arg2, int arg3, String arg4) {
		try {
			this.method152(arg0 - this.method151(arg4) / 2, arg3, arg2, arg4);
			boolean local17 = false;
		} catch ( RuntimeException local19) {
			signlink.reporterror("56142, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	public void method149( boolean arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		try {
			if (arg1 >= this.anInt228 && arg1 <= this.anInt228) {
				this.method156(arg2, arg4 - this.method150(arg5) / 2, arg3, arg0, arg5);
			}
		} catch ( RuntimeException local25) {
			signlink.reporterror("73500, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	public int method150( String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			int local7 = 0;
			for ( int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray62[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch ( RuntimeException local59) {
			signlink.reporterror("64370, " + 35 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	public int method151( String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			int local7 = 0;
			for ( int local19 = 0; local19 < arg0.length(); local19++) {
				local7 += this.anIntArray62[arg0.charAt(local19)];
			}
			return local7;
		} catch ( RuntimeException local38) {
			signlink.reporterror("89750, " + arg0 + ", " + -53 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	public void method152( int arg0, int arg1, int arg2, String arg3) {
		try {
			if (arg3 != null) {
				int local19 = arg2 - this.anInt230;
				for ( int local21 = 0; local21 < arg3.length(); local21++) {
					char local27 = arg3.charAt(local21);
					if (local27 != ' ') {
						this.method159(this.aByteArrayArray3[local27], arg0 + this.anIntArray60[local27], local19 + this.anIntArray61[local27], this.anIntArray58[local27], this.anIntArray59[local27], arg1);
					}
					arg0 += this.anIntArray62[local27];
				}
			}
		} catch ( RuntimeException local71) {
			signlink.reporterror("98211, " + 2245 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	public void method153( int arg0, byte arg1, int arg2, String arg3, int arg4, int arg5) {
		try {
			if (arg3 != null) {
				arg4 -= this.method151(arg3) / 2;
				boolean local18 = false;
				int local33 = arg0 - this.anInt230;
				for ( int local35 = 0; local35 < arg3.length(); local35++) {
					char local41 = arg3.charAt(local35);
					if (local41 != ' ') {
						this.method159(this.aByteArrayArray3[local41], arg4 + this.anIntArray60[local41], local33 + this.anIntArray61[local41] + (int) (Math.sin((double) local35 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray58[local41], this.anIntArray59[local41], arg5);
					}
					arg4 += this.anIntArray62[local41];
				}
			}
		} catch ( RuntimeException local99) {
			signlink.reporterror("30730, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	public void method154( int arg0, int arg1, String arg2, int arg3, int arg4) {
		try {
			if (arg2 != null) {
				arg3 -= this.method151(arg2) / 2;
				int local28 = arg0 - this.anInt230;
				for ( int local30 = 0; local30 < arg2.length(); local30++) {
					char local36 = arg2.charAt(local30);
					if (local36 != ' ') {
						this.method159(this.aByteArrayArray3[local36], arg3 + this.anIntArray60[local36] + (int) (Math.sin((double) local30 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local28 + this.anIntArray61[local36] + (int) (Math.sin((double) local30 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray58[local36], this.anIntArray59[local36], arg1);
					}
					arg3 += this.anIntArray62[local36];
				}
			}
		} catch ( RuntimeException local108) {
			signlink.reporterror("95836, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	public void method155( String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg0 != null) {
				double local11 = 7.0D - (double) arg4 / 8.0D;
				if (local11 < 0.0D) {
					local11 = 0.0D;
				}
				arg2 -= this.method151(arg0) / 2;
				int local42 = arg3 - this.anInt230;
				for ( int local44 = 0; local44 < arg0.length(); local44++) {
					char local50 = arg0.charAt(local44);
					if (local50 != ' ') {
						this.method159(this.aByteArrayArray3[local50], arg2 + this.anIntArray60[local50], local42 + this.anIntArray61[local50] + (int) (Math.sin((double) local44 / 1.5D + (double) arg5) * local11), this.anIntArray58[local50], this.anIntArray59[local50], arg1);
					}
					arg2 += this.anIntArray62[local50];
				}
			}
		} catch ( RuntimeException local106) {
			signlink.reporterror("76523, " + -601 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	public void method156( int arg0, int arg1, int arg2, boolean arg3, String arg4) {
		try {
			this.aBoolean71 = false;
			int local10 = arg1;
			if (arg4 != null) {
				int local18 = arg2 - this.anInt230;
				for ( int local20 = 0; local20 < arg4.length(); local20++) {
					if (arg4.charAt(local20) == '@' && local20 + 4 < arg4.length() && arg4.charAt(local20 + 4) == '@') {
						int local53 = this.method158(this.anInt229, arg4.substring(local20 + 1, local20 + 4));
						if (local53 != -1) {
							arg0 = local53;
						}
						local20 += 4;
					} else {
						char local65 = arg4.charAt(local20);
						if (local65 != ' ') {
							if (arg3) {
								this.method159(this.aByteArrayArray3[local65], arg1 + this.anIntArray60[local65] + 1, local18 + this.anIntArray61[local65] + 1, this.anIntArray58[local65], this.anIntArray59[local65], 0);
							}
							this.method159(this.aByteArrayArray3[local65], arg1 + this.anIntArray60[local65], local18 + this.anIntArray61[local65], this.anIntArray58[local65], this.anIntArray59[local65], arg0);
						}
						arg1 += this.anIntArray62[local65];
					}
				}
				if (this.aBoolean71) {
					Draw2D.drawHorizontalLine(local10, 8388608, local18 + (int) ((double) this.anInt230 * 0.7D), arg1 - local10);
				}
			}
		} catch ( RuntimeException local160) {
			signlink.reporterror("39622, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -39629 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	public void method157( int arg0, int arg1, int arg2, int arg3, String arg4) {
		try {
			if (arg4 != null) {
				this.aRandom1.setSeed((long) arg0);
				int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				int local22 = 15 - this.anInt230;
				for ( int local29 = 0; local29 < arg4.length(); local29++) {
					if (arg4.charAt(local29) == '@' && local29 + 4 < arg4.length() && arg4.charAt(local29 + 4) == '@') {
						int local62 = this.method158(this.anInt229, arg4.substring(local29 + 1, local29 + 4));
						if (local62 != -1) {
							arg2 = local62;
						}
						local29 += 4;
					} else {
						char local74 = arg4.charAt(local29);
						if (local74 != ' ') {
							this.method161(arg1 + this.anIntArray60[local74] + 1, 0, this.aByteArrayArray3[local74], local22 + this.anIntArray61[local74] + 1, this.anIntArray59[local74], this.anIntArray58[local74], 192);
							this.method161(arg1 + this.anIntArray60[local74], arg2, this.aByteArrayArray3[local74], local22 + this.anIntArray61[local74], this.anIntArray59[local74], this.anIntArray58[local74], local17);
						}
						arg1 += this.anIntArray62[local74];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
			}
		} catch ( RuntimeException local162) {
			signlink.reporterror("46126, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	private int method158( int arg0, String arg1) {
		try {
			if (arg0 != this.anInt229) {
				for ( int local5 = 1; local5 > 0; local5++) {
				}
			}
			if (arg1.equals("red")) {
				return 16711680;
			} else if (arg1.equals("gre")) {
				return 65280;
			} else if (arg1.equals("blu")) {
				return 255;
			} else if (arg1.equals("yel")) {
				return 16776960;
			} else if (arg1.equals("cya")) {
				return 65535;
			} else if (arg1.equals("mag")) {
				return 16711935;
			} else if (arg1.equals("whi")) {
				return 16777215;
			} else if (arg1.equals("bla")) {
				return 0;
			} else if (arg1.equals("lre")) {
				return 16748608;
			} else if (arg1.equals("dre")) {
				return 8388608;
			} else if (arg1.equals("dbl")) {
				return 128;
			} else if (arg1.equals("or1")) {
				return 16756736;
			} else if (arg1.equals("or2")) {
				return 16740352;
			} else if (arg1.equals("or3")) {
				return 16723968;
			} else if (arg1.equals("gr1")) {
				return 12648192;
			} else if (arg1.equals("gr2")) {
				return 8453888;
			} else if (arg1.equals("gr3")) {
				return 4259584;
			} else {
				if (arg1.equals("str")) {
					this.aBoolean71 = true;
				}
				if (arg1.equals("end")) {
					this.aBoolean71 = false;
				}
				return -1;
			}
		} catch ( RuntimeException local129) {
			signlink.reporterror("40569, " + arg0 + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	private void method159( byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int local5 = arg1 + arg2 * Draw2D.width2d;
		int local9 = Draw2D.width2d - arg3;
		int local11 = 0;
		int local13 = 0;
		int local20;
		if (arg2 < Draw2D.top) {
			local20 = Draw2D.top - arg2;
			arg4 -= local20;
			arg2 = Draw2D.top;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Draw2D.width2d;
		}
		if (arg2 + arg4 >= Draw2D.bottom) {
			arg4 -= arg2 + arg4 + 1 - Draw2D.bottom;
		}
		if (arg1 < Draw2D.left) {
			local20 = Draw2D.left - arg1;
			arg3 -= local20;
			arg1 = Draw2D.left;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Draw2D.right) {
			local20 = arg1 + arg3 + 1 - Draw2D.right;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method160(Draw2D.data, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	private void method160( int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int local6 = -(arg5 >> 2);
		int local11 = -(arg5 & 0x3);
		for ( int local14 = -arg6; local14 < 0; local14++) {
			for ( int local18 = local6; local18 < 0; local18++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for ( int local77 = local11; local77 < 0; local77++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	private void method161( int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			int local5 = arg0 + arg3 * Draw2D.width2d;
			int local9 = Draw2D.width2d - arg5;
			int local11 = 0;
			int local13 = 0;
			int local23;
			if (arg3 < Draw2D.top) {
				local23 = Draw2D.top - arg3;
				arg4 -= local23;
				arg3 = Draw2D.top;
				local13 = local23 * arg5 + 0;
				local5 += local23 * Draw2D.width2d;
			}
			if (arg3 + arg4 >= Draw2D.bottom) {
				arg4 -= arg3 + arg4 + 1 - Draw2D.bottom;
			}
			if (arg0 < Draw2D.left) {
				local23 = Draw2D.left - arg0;
				arg5 -= local23;
				arg0 = Draw2D.left;
				local13 += local23;
				local5 += local23;
				local11 = local23 + 0;
				local9 += local23;
			}
			if (arg0 + arg5 >= Draw2D.right) {
				local23 = arg0 + arg5 + 1 - Draw2D.right;
				arg5 -= local23;
				local11 += local23;
				local9 += local23;
			}
			if (arg5 > 0 && arg4 > 0) {
				this.method162(local13, local9, local11, local5, arg6, Draw2D.data, arg1, arg4, arg5, arg2);
			}
		} catch ( RuntimeException local130) {
			signlink.reporterror("65701, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	private void method162( int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		try {
			int local33 = ((arg6 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg4 & 0xFF0000) >> 8;
			int local37 = 256 - arg4;
			for ( int local40 = -arg7; local40 < 0; local40++) {
				for ( int local45 = -arg8; local45 < 0; local45++) {
					if (arg9[arg0++] == 0) {
						arg3++;
					} else {
						int local56 = arg5[arg3];
						arg5[arg3++] = (((local56 & 0xFF00FF) * local37 & 0xFF00FF00) + ((local56 & 0xFF00) * local37 & 0xFF0000) >> 8) + local33;
					}
				}
				arg3 += arg1;
				arg0 += arg2;
			}
		} catch ( RuntimeException local98) {
			signlink.reporterror("18799, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 2 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}
}
