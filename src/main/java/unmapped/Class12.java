package unmapped;


import sign.signlink;

public final class Class12 {

	private static int[] anIntArray25;

	private static int[] anIntArray26;

	private static int[] anIntArray27;

	private static int[] anIntArray28 = new int[5];

	private static int[] anIntArray29 = new int[5];

	private static int[] anIntArray30 = new int[5];

	private static int[] anIntArray31 = new int[5];

	private static int[] anIntArray32 = new int[5];

	private Class30 aClass30_1;

	private Class30 aClass30_2;

	private Class30 aClass30_3;

	private Class30 aClass30_4;

	private Class30 aClass30_5;

	private Class30 aClass30_6;

	private Class30 aClass30_7;

	private Class30 aClass30_8;

	private int anInt70;

	private Class37 aClass37_1;

	private Class30 aClass30_9;

	public int anInt73;

	private byte aByte7 = 6;

	private int anInt69 = 8;

	private int[] anIntArray22 = new int[5];

	private int[] anIntArray23 = new int[5];

	private int[] anIntArray24 = new int[5];

	private int anInt71 = 100;

	public int anInt72 = 500;

	public static void method41() {
		anIntArray26 = new int[32768];
		for ( int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray26[local6] = 1;
			} else {
				anIntArray26[local6] = -1;
			}
		}
		anIntArray27 = new int[32768];
		for ( int local31 = 0; local31 < 32768; local31++) {
			anIntArray27[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray25 = new int[220500];
	}

	public int[] method42( int arg0, int arg1) {
		for ( int local3 = 0; local3 < arg0; local3++) {
			anIntArray25[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray25;
		}
		double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass30_1.method361();
		this.aClass30_2.method361();
		int local36 = 0;
		int local38 = 0;
		int local40 = 0;
		if (this.aClass30_3 != null) {
			this.aClass30_3.method361();
			this.aClass30_4.method361();
			local36 = (int) ((double) (this.aClass30_3.anInt476 - this.aClass30_3.anInt475) * 32.768D / local26);
			local38 = (int) ((double) this.aClass30_3.anInt475 * 32.768D / local26);
		}
		int local77 = 0;
		int local79 = 0;
		int local81 = 0;
		if (this.aClass30_5 != null) {
			this.aClass30_5.method361();
			this.aClass30_6.method361();
			local77 = (int) ((double) (this.aClass30_5.anInt476 - this.aClass30_5.anInt475) * 32.768D / local26);
			local79 = (int) ((double) this.aClass30_5.anInt475 * 32.768D / local26);
		}
		for ( int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray22[local118] != 0) {
				anIntArray28[local118] = 0;
				anIntArray29[local118] = (int) ((double) this.anIntArray24[local118] * local26);
				anIntArray30[local118] = (this.anIntArray22[local118] << 14) / 100;
				anIntArray31[local118] = (int) ((double) (this.aClass30_1.anInt476 - this.aClass30_1.anInt475) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray23[local118]) / local26);
				anIntArray32[local118] = (int) ((double) this.aClass30_1.anInt475 * 32.768D / local26);
			}
		}
		int local201;
		int local207;
		int local216;
		int local222;
		for ( int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass30_1.method362(arg0);
			local207 = this.aClass30_2.method362(arg0);
			if (this.aClass30_3 != null) {
				local216 = this.aClass30_3.method362(arg0);
				local222 = this.aClass30_4.method362(arg0);
				local201 += this.method43(local40, this.aClass30_3.anInt477, local222) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass30_5 != null) {
				local216 = this.aClass30_5.method362(arg0);
				local222 = this.aClass30_6.method362(arg0);
				local207 = local207 * ((this.method43(local81, this.aClass30_5.anInt477, local222) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray22[local216] != 0) {
					local222 = local193 + anIntArray29[local216];
					if (local222 < arg0) {
						anIntArray25[local222] += this.method43(anIntArray28[local216], this.aClass30_1.anInt477, local207 * anIntArray30[local216] >> 15);
						anIntArray28[local216] += (local201 * anIntArray31[local216] >> 16) + anIntArray32[local216];
					}
				}
			}
		}
		int local379;
		int local385;
		if (this.aClass30_7 != null) {
			this.aClass30_7.method361();
			this.aClass30_8.method361();
			local201 = 0;
			boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass30_7.method362(arg0);
				local385 = this.aClass30_8.method362(arg0);
				if (local369) {
					local207 = this.aClass30_7.anInt475 + ((this.aClass30_7.anInt476 - this.aClass30_7.anInt475) * local379 >> 8);
				} else {
					local207 = this.aClass30_7.anInt475 + ((this.aClass30_7.anInt476 - this.aClass30_7.anInt475) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray25[local222] = 0;
				}
			}
		}
		if (this.anInt70 > 0 && this.anInt71 > 0) {
			local201 = (int) ((double) this.anInt70 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray25[local207] += anIntArray25[local207 - local201] * this.anInt71 / 100;
			}
		}
		if (this.aClass37_1.anIntArray163[0] > 0 || this.aClass37_1.anIntArray163[1] > 0) {
			this.aClass30_9.method361();
			local201 = this.aClass30_9.method362(arg0 + 1);
			local207 = this.aClass37_1.method398(0, (float) local201 / 65536.0F);
			local216 = this.aClass37_1.method398(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				int local559;
				int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray25[local222 + local207] * (long) Class37.anInt563 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray25[local222 + local207 - local559 - 1] * (long) Class37.anIntArrayArray14[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray25[local222 - local590 - 1] * (long) Class37.anIntArrayArray14[1][local590] >> 16);
					}
					anIntArray25[local222] = local385;
					local201 = this.aClass30_9.method362(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray25[local222 + local207] * (long) Class37.anInt563 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray25[local222 + local207 - local590 - 1] * (long) Class37.anIntArrayArray14[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray25[local222 - local694 - 1] * (long) Class37.anIntArrayArray14[1][local694] >> 16);
						}
						anIntArray25[local222] = local559;
						local201 = this.aClass30_9.method362(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray25[local222 + local207 - local590 - 1] * (long) Class37.anIntArrayArray14[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray25[local222 - local694 - 1] * (long) Class37.anIntArrayArray14[1][local694] >> 16);
							}
							anIntArray25[local222] = local559;
							this.aClass30_9.method362(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass37_1.method398(0, (float) local201 / 65536.0F);
					local216 = this.aClass37_1.method398(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray25[local201] < -32768) {
				anIntArray25[local201] = -32768;
			}
			if (anIntArray25[local201] > 32767) {
				anIntArray25[local201] = 32767;
			}
		}
		return anIntArray25;
	}

	private int method43( int arg0, int arg1, int arg2) {
		try {
			if (arg1 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
			} else if (arg1 == 2) {
				return anIntArray27[arg0 & 0x7FFF] * arg2 >> 14;
			} else if (arg1 == 3) {
				return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
			} else if (arg1 == 4) {
				return anIntArray26[arg0 / 2607 & 0x7FFF] * arg2;
			} else {
				return 0;
			}
		} catch ( RuntimeException local61) {
			signlink.reporterror("16122, " + -887 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	public void method44( byte arg0, Packet arg1) {
		try {
			this.aClass30_1 = new Class30();
			this.aClass30_1.method359(this.aByte7, arg1);
			this.aClass30_2 = new Class30();
			this.aClass30_2.method359(this.aByte7, arg1);
			int local26 = arg1.g1();
			if (local26 != 0) {
				arg1.pos--;
				this.aClass30_3 = new Class30();
				this.aClass30_3.method359(this.aByte7, arg1);
				this.aClass30_4 = new Class30();
				this.aClass30_4.method359(this.aByte7, arg1);
			}
			local26 = arg1.g1();
			int local64;
			if (arg0 != 6) {
				for (local64 = 1; local64 > 0; local64++) {
				}
			}
			if (local26 != 0) {
				arg1.pos--;
				this.aClass30_5 = new Class30();
				this.aClass30_5.method359(this.aByte7, arg1);
				this.aClass30_6 = new Class30();
				this.aClass30_6.method359(this.aByte7, arg1);
			}
			local26 = arg1.g1();
			if (local26 != 0) {
				arg1.pos--;
				this.aClass30_7 = new Class30();
				this.aClass30_7.method359(this.aByte7, arg1);
				this.aClass30_8 = new Class30();
				this.aClass30_8.method359(this.aByte7, arg1);
			}
			for (local64 = 0; local64 < 10; local64++) {
				int local145 = arg1.gsmarts();
				if (local145 == 0) {
					break;
				}
				this.anIntArray22[local64] = local145;
				this.anIntArray23[local64] = arg1.gsmart();
				this.anIntArray24[local64] = arg1.gsmarts();
			}
			this.anInt70 = arg1.gsmarts();
			this.anInt71 = arg1.gsmarts();
			this.anInt72 = arg1.g2();
			this.anInt73 = arg1.g2();
			this.aClass37_1 = new Class37();
			this.aClass30_9 = new Class30();
			this.aClass37_1.method399(this.aClass30_9, arg1);
		} catch ( RuntimeException local203) {
			signlink.reporterror("27257, " + arg0 + ", " + arg1 + ", " + local203.toString());
			throw new RuntimeException();
		}
	}
}
