package unmapped;


import jagex2.graphics.Draw2D;
import sign.signlink;

public final class Class10_Sub1_Sub2_Sub4 extends Class10_Sub1_Sub2 {

	private static int anInt401;

	private static Class27[] aClass27Array1;

	private static Class33 aClass33_1;

	private static int anInt414;

	private static int anInt415;

	private static int anInt416;

	public static boolean aBoolean107;

	public static int anInt417;

	public static int anInt418;

	public static int anInt419;

	public static Class10_Sub1_Sub2_Sub4 aClass10_Sub1_Sub2_Sub4_1 = new Class10_Sub1_Sub2_Sub4(852);

	private static int[] anIntArray109 = new int[2000];

	private static int[] anIntArray110 = new int[2000];

	private static int[] anIntArray111 = new int[2000];

	private static int[] anIntArray112 = new int[2000];

	private static boolean[] aBooleanArray5 = new boolean[4096];

	private static boolean[] aBooleanArray6 = new boolean[4096];

	private static int[] anIntArray131 = new int[4096];

	private static int[] anIntArray132 = new int[4096];

	private static int[] anIntArray133 = new int[4096];

	private static int[] anIntArray134 = new int[4096];

	private static int[] anIntArray135 = new int[4096];

	private static int[] anIntArray136 = new int[4096];

	private static int[] anIntArray137 = new int[1500];

	private static int[][] anIntArrayArray12 = new int[1500][512];

	private static int[] anIntArray138 = new int[12];

	private static int[][] anIntArrayArray13 = new int[12][2000];

	private static int[] anIntArray139 = new int[2000];

	private static int[] anIntArray140 = new int[2000];

	private static int[] anIntArray141 = new int[12];

	private static int[] anIntArray142 = new int[10];

	private static int[] anIntArray143 = new int[10];

	private static int[] anIntArray144 = new int[10];

	public static int[] anIntArray145 = new int[1000];

	public static int[] anIntArray146 = Class10_Sub1_Sub1_Sub4.anIntArray181;

	public static int[] anIntArray147 = Class10_Sub1_Sub1_Sub4.anIntArray182;

	private static int[] anIntArray148 = Class10_Sub1_Sub1_Sub4.anIntArray186;

	private static int[] anIntArray149 = Class10_Sub1_Sub1_Sub4.anIntArray180;

	public int anInt402;

	public int[] anIntArray113;

	public int[] anIntArray114;

	public int[] anIntArray115;

	public int anInt403;

	public int[] anIntArray116;

	public int[] anIntArray117;

	public int[] anIntArray118;

	private int[] anIntArray119;

	private int[] anIntArray120;

	private int[] anIntArray121;

	public int[] anIntArray122;

	private int[] anIntArray123;

	private int[] anIntArray124;

	public int[] anIntArray125;

	private int anInt404;

	private int anInt405;

	private int[] anIntArray126;

	private int[] anIntArray127;

	private int[] anIntArray128;

	private int anInt406;

	public int anInt407;

	public int anInt408;

	public int anInt409;

	public int anInt410;

	private int anInt411;

	private int anInt412;

	public int anInt413;

	private int[] anIntArray129;

	private int[] anIntArray130;

	public int[][] anIntArrayArray10;

	public int[][] anIntArrayArray11;

	public Class41[] aClass41Array6;

	private int anInt398 = 932;

	private int anInt399 = 426;

	private boolean aBoolean103 = false;

	private boolean aBoolean104 = true;

	private int anInt400 = -252;

	private boolean aBoolean105 = false;

	public boolean aBoolean106 = false;

	public static void method267() {
		try {
			aClass27Array1 = null;
			aBooleanArray5 = null;
			aBooleanArray6 = null;
			anIntArray131 = null;
			anIntArray132 = null;
			anIntArray133 = null;
			anIntArray134 = null;
			anIntArray135 = null;
			anIntArray136 = null;
			anIntArray137 = null;
			anIntArrayArray12 = null;
			anIntArray138 = null;
			anIntArrayArray13 = null;
			anIntArray139 = null;
			anIntArray140 = null;
			anIntArray141 = null;
			anIntArray146 = null;
			anIntArray147 = null;
			anIntArray148 = null;
			anIntArray149 = null;
		} catch ( RuntimeException local44) {
			signlink.reporterror("67131, " + false + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	public static void method268( int arg0, Class33 arg1) {
		aClass27Array1 = new Class27[arg0];
		aClass33_1 = arg1;
	}

	public static void method269( byte[] arg0, int arg1) {
		try {
			if (arg0 == null) {
				Class27 local15 = aClass27Array1[arg1] = new Class27();
				local15.anInt330 = 0;
				local15.anInt331 = 0;
				local15.anInt332 = 0;
			} else {
				Packet local31 = new Packet(arg0);
				local31.pos = arg0.length - 18;
				Class27 local45 = aClass27Array1[arg1] = new Class27();
				local45.aByteArray11 = arg0;
				local45.anInt330 = local31.readShort();
				local45.anInt331 = local31.readShort();
				local45.anInt332 = local31.readByte();
				int local63 = local31.readByte();
				int local66 = local31.readByte();
				int local69 = local31.readByte();
				int local72 = local31.readByte();
				int local75 = local31.readByte();
				int local78 = local31.readShort();
				int local81 = local31.readShort();
				int local84 = local31.readShort();
				int local87 = local31.readShort();
				local45.anInt333 = 0;
				int local97 = local45.anInt330 + 0;
				local45.anInt339 = local97;
				local97 += local45.anInt331;
				local45.anInt342 = local97;
				if (local66 == 255) {
					local97 += local45.anInt331;
				} else {
					local45.anInt342 = -local66 - 1;
				}
				local45.anInt344 = local97;
				if (local72 == 1) {
					local97 += local45.anInt331;
				} else {
					local45.anInt344 = -1;
				}
				local45.anInt341 = local97;
				if (local63 == 1) {
					local97 += local45.anInt331;
				} else {
					local45.anInt341 = -1;
				}
				local45.anInt337 = local97;
				if (local75 == 1) {
					local97 += local45.anInt330;
				} else {
					local45.anInt337 = -1;
				}
				local45.anInt343 = local97;
				if (local69 == 1) {
					local97 += local45.anInt331;
				} else {
					local45.anInt343 = -1;
				}
				local45.anInt338 = local97;
				local97 += local87;
				local45.anInt340 = local97;
				local97 += local45.anInt331 * 2;
				local45.anInt345 = local97;
				local97 += local45.anInt332 * 6;
				local45.anInt334 = local97;
				local97 += local78;
				local45.anInt335 = local97;
				local97 += local81;
				local45.anInt336 = local97;
			}
		} catch ( RuntimeException local238) {
			signlink.reporterror("83766, " + arg0 + ", " + arg1 + ", " + 7 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	public static void method270( int arg0) {
		try {
			aClass27Array1[arg0] = null;
		} catch ( RuntimeException local9) {
			signlink.reporterror("15750, " + arg0 + ", " + 1 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	public static Class10_Sub1_Sub2_Sub4 method271( int arg0) {
		if (aClass27Array1 == null) {
			return null;
		}
		Class27 local7 = aClass27Array1[arg0];
		if (local7 == null) {
			aClass33_1.method552(arg0);
			return null;
		} else {
			return new Class10_Sub1_Sub2_Sub4(arg0, -478);
		}
	}

	public static boolean method272( int arg0) {
		if (aClass27Array1 == null) {
			return false;
		}
		Class27 local7 = aClass27Array1[arg0];
		if (local7 == null) {
			aClass33_1.method552(arg0);
			return false;
		} else {
			return true;
		}
	}

	private static int method291( int arg0, int arg1, int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	private Class10_Sub1_Sub2_Sub4( int arg0) {
	}

	private Class10_Sub1_Sub2_Sub4( int arg0, int arg1) {
		try {
			anInt401++;
			Class27 local32 = aClass27Array1[arg0];
			this.anInt402 = local32.anInt330;
			this.anInt403 = local32.anInt331;
			this.anInt405 = local32.anInt332;
			this.anIntArray113 = new int[this.anInt402];
			this.anIntArray114 = new int[this.anInt402];
			this.anIntArray115 = new int[this.anInt402];
			this.anIntArray116 = new int[this.anInt403];
			this.anIntArray117 = new int[this.anInt403];
			this.anIntArray118 = new int[this.anInt403];
			this.anIntArray126 = new int[this.anInt405];
			this.anIntArray127 = new int[this.anInt405];
			this.anIntArray128 = new int[this.anInt405];
			if (local32.anInt337 >= 0) {
				this.anIntArray129 = new int[this.anInt402];
			}
			if (local32.anInt341 >= 0) {
				this.anIntArray122 = new int[this.anInt403];
			}
			if (local32.anInt342 >= 0) {
				this.anIntArray123 = new int[this.anInt403];
			} else {
				this.anInt404 = -local32.anInt342 - 1;
			}
			if (local32.anInt343 >= 0) {
				this.anIntArray124 = new int[this.anInt403];
			}
			if (local32.anInt344 >= 0) {
				this.anIntArray130 = new int[this.anInt403];
			}
			this.anIntArray125 = new int[this.anInt403];
			Packet local150 = new Packet(local32.aByteArray11);
			local150.pos = local32.anInt333;
			Packet local161 = new Packet(local32.aByteArray11);
			local161.pos = local32.anInt334;
			Packet local172 = new Packet(local32.aByteArray11);
			local172.pos = local32.anInt335;
			Packet local193 = new Packet(local32.aByteArray11);
			local193.pos = local32.anInt336;
			Packet local204 = new Packet(local32.aByteArray11);
			local204.pos = local32.anInt337;
			int local210 = 0;
			int local212 = 0;
			int local214 = 0;
			int local221;
			int local223;
			int local232;
			int local241;
			for ( int local216 = 0; local216 < this.anInt402; local216++) {
				local221 = local150.readByte();
				local223 = 0;
				if ((local221 & 0x1) != 0) {
					local223 = local161.method324();
				}
				local232 = 0;
				if ((local221 & 0x2) != 0) {
					local232 = local172.method324();
				}
				local241 = 0;
				if ((local221 & 0x4) != 0) {
					local241 = local193.method324();
				}
				this.anIntArray113[local216] = local210 + local223;
				this.anIntArray114[local216] = local212 + local232;
				this.anIntArray115[local216] = local214 + local241;
				local210 = this.anIntArray113[local216];
				local212 = this.anIntArray114[local216];
				local214 = this.anIntArray115[local216];
				if (this.anIntArray129 != null) {
					this.anIntArray129[local216] = local204.readByte();
				}
			}
			local150.pos = local32.anInt340;
			local161.pos = local32.anInt341;
			local172.pos = local32.anInt342;
			local193.pos = local32.anInt343;
			local204.pos = local32.anInt344;
			for (local221 = 0; local221 < this.anInt403; local221++) {
				this.anIntArray125[local221] = local150.readShort();
				if (this.anIntArray122 != null) {
					this.anIntArray122[local221] = local161.readByte();
				}
				if (this.anIntArray123 != null) {
					this.anIntArray123[local221] = local172.readByte();
				}
				if (this.anIntArray124 != null) {
					this.anIntArray124[local221] = local193.readByte();
				}
				if (this.anIntArray130 != null) {
					this.anIntArray130[local221] = local204.readByte();
				}
			}
			local150.pos = local32.anInt338;
			local161.pos = local32.anInt339;
			local223 = 0;
			local232 = 0;
			local241 = 0;
			int local385 = 0;
			int local392;
			for ( int local387 = 0; local387 < this.anInt403; local387++) {
				local392 = local161.readByte();
				if (local392 == 1) {
					local223 = local150.method324() + local385;
					local232 = local150.method324() + local223;
					local241 = local150.method324() + local232;
					local385 = local241;
					this.anIntArray116[local387] = local223;
					this.anIntArray117[local387] = local232;
					this.anIntArray118[local387] = local241;
				}
				if (local392 == 2) {
					local223 = local223;
					local232 = local241;
					local241 = local150.method324() + local385;
					local385 = local241;
					this.anIntArray116[local387] = local223;
					this.anIntArray117[local387] = local232;
					this.anIntArray118[local387] = local241;
				}
				if (local392 == 3) {
					local223 = local241;
					local232 = local232;
					local241 = local150.method324() + local385;
					local385 = local241;
					this.anIntArray116[local387] = local223;
					this.anIntArray117[local387] = local232;
					this.anIntArray118[local387] = local241;
				}
				if (local392 == 4) {
					int local494 = local223;
					local223 = local232;
					local232 = local494;
					local241 = local150.method324() + local385;
					local385 = local241;
					this.anIntArray116[local387] = local223;
					this.anIntArray117[local387] = local494;
					this.anIntArray118[local387] = local241;
				}
			}
			local150.pos = local32.anInt345;
			for (local392 = 0; local392 < this.anInt405; local392++) {
				this.anIntArray126[local392] = local150.readShort();
				this.anIntArray127[local392] = local150.readShort();
				this.anIntArray128[local392] = local150.readShort();
			}
		} catch ( RuntimeException local558) {
			signlink.reporterror("50904, " + arg0 + ", " + arg1 + ", " + local558.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4( int arg0, Class10_Sub1_Sub2_Sub4[] arg1, byte arg2) {
		try {
			anInt401++;
			boolean local30 = false;
			boolean local32 = false;
			boolean local34 = false;
			boolean local36 = false;
			this.anInt402 = 0;
			this.anInt403 = 0;
			this.anInt405 = 0;
			this.anInt404 = -1;
			for ( int local50 = 0; local50 < arg0; local50++) {
				Class10_Sub1_Sub2_Sub4 local56 = arg1[local50];
				if (local56 != null) {
					this.anInt402 += local56.anInt402;
					this.anInt403 += local56.anInt403;
					this.anInt405 += local56.anInt405;
					local30 |= local56.anIntArray122 != null;
					if (local56.anIntArray123 == null) {
						if (this.anInt404 == -1) {
							this.anInt404 = local56.anInt404;
						}
						if (this.anInt404 != local56.anInt404) {
							local32 = true;
						}
					} else {
						local32 = true;
					}
					local34 |= local56.anIntArray124 != null;
					local36 |= local56.anIntArray130 != null;
				}
			}
			this.anIntArray113 = new int[this.anInt402];
			this.anIntArray114 = new int[this.anInt402];
			this.anIntArray115 = new int[this.anInt402];
			this.anIntArray129 = new int[this.anInt402];
			this.anIntArray116 = new int[this.anInt403];
			this.anIntArray117 = new int[this.anInt403];
			this.anIntArray118 = new int[this.anInt403];
			this.anIntArray126 = new int[this.anInt405];
			this.anIntArray127 = new int[this.anInt405];
			this.anIntArray128 = new int[this.anInt405];
			if (local30) {
				this.anIntArray122 = new int[this.anInt403];
			}
			if (local32) {
				this.anIntArray123 = new int[this.anInt403];
			}
			if (local34) {
				this.anIntArray124 = new int[this.anInt403];
			}
			if (local36) {
				this.anIntArray130 = new int[this.anInt403];
			}
			this.anIntArray125 = new int[this.anInt403];
			this.anInt402 = 0;
			this.anInt403 = 0;
			this.anInt405 = 0;
			int local233 = 0;
			for ( int local235 = 0; local235 < arg0; local235++) {
				Class10_Sub1_Sub2_Sub4 local241 = arg1[local235];
				if (local241 != null) {
					int local265;
					for ( int local245 = 0; local245 < local241.anInt403; local245++) {
						if (local30) {
							if (local241.anIntArray122 == null) {
								this.anIntArray122[this.anInt403] = 0;
							} else {
								local265 = local241.anIntArray122[local245];
								if ((local265 & 0x2) == 2) {
									local265 += local233 << 2;
								}
								this.anIntArray122[this.anInt403] = local265;
							}
						}
						if (local32) {
							if (local241.anIntArray123 == null) {
								this.anIntArray123[this.anInt403] = local241.anInt404;
							} else {
								this.anIntArray123[this.anInt403] = local241.anIntArray123[local245];
							}
						}
						if (local34) {
							if (local241.anIntArray124 == null) {
								this.anIntArray124[this.anInt403] = 0;
							} else {
								this.anIntArray124[this.anInt403] = local241.anIntArray124[local245];
							}
						}
						if (local36 && local241.anIntArray130 != null) {
							this.anIntArray130[this.anInt403] = local241.anIntArray130[local245];
						}
						this.anIntArray125[this.anInt403] = local241.anIntArray125[local245];
						this.anIntArray116[this.anInt403] = this.method274(local241, local241.anIntArray116[local245]);
						this.anIntArray117[this.anInt403] = this.method274(local241, local241.anIntArray117[local245]);
						this.anIntArray118[this.anInt403] = this.method274(local241, local241.anIntArray118[local245]);
						this.anInt403++;
					}
					for (local265 = 0; local265 < local241.anInt405; local265++) {
						this.anIntArray126[this.anInt405] = this.method274(local241, local241.anIntArray126[local265]);
						this.anIntArray127[this.anInt405] = this.method274(local241, local241.anIntArray127[local265]);
						this.anIntArray128[this.anInt405] = this.method274(local241, local241.anIntArray128[local265]);
						this.anInt405++;
					}
					local233 += local241.anInt405;
				}
			}
		} catch ( RuntimeException local459) {
			signlink.reporterror("83924, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4( int arg0, boolean arg1, int arg2, Class10_Sub1_Sub2_Sub4[] arg3) {
		try {
			anInt401++;
			boolean local30 = false;
			boolean local32 = false;
			boolean local34 = false;
			boolean local36 = false;
			this.anInt402 = 0;
			this.anInt403 = 0;
			this.anInt405 = 0;
			this.anInt404 = -1;
			for ( int local50 = 0; local50 < arg0; local50++) {
				Class10_Sub1_Sub2_Sub4 local56 = arg3[local50];
				if (local56 != null) {
					this.anInt402 += local56.anInt402;
					this.anInt403 += local56.anInt403;
					this.anInt405 += local56.anInt405;
					local30 |= local56.anIntArray122 != null;
					if (local56.anIntArray123 == null) {
						if (this.anInt404 == -1) {
							this.anInt404 = local56.anInt404;
						}
						if (this.anInt404 != local56.anInt404) {
							local32 = true;
						}
					} else {
						local32 = true;
					}
					local34 |= local56.anIntArray124 != null;
					local36 |= local56.anIntArray125 != null;
				}
			}
			this.anIntArray113 = new int[this.anInt402];
			this.anIntArray114 = new int[this.anInt402];
			this.anIntArray115 = new int[this.anInt402];
			this.anIntArray116 = new int[this.anInt403];
			this.anIntArray117 = new int[this.anInt403];
			this.anIntArray118 = new int[this.anInt403];
			this.anIntArray119 = new int[this.anInt403];
			this.anIntArray120 = new int[this.anInt403];
			this.anIntArray121 = new int[this.anInt403];
			this.anIntArray126 = new int[this.anInt405];
			this.anIntArray127 = new int[this.anInt405];
			this.anIntArray128 = new int[this.anInt405];
			if (local30) {
				this.anIntArray122 = new int[this.anInt403];
			}
			if (local32) {
				this.anIntArray123 = new int[this.anInt403];
			}
			if (local34) {
				this.anIntArray124 = new int[this.anInt403];
			}
			if (local36) {
				this.anIntArray125 = new int[this.anInt403];
			}
			this.anInt402 = 0;
			this.anInt403 = 0;
			this.anInt405 = 0;
			int local237 = 0;
			for ( int local239 = 0; local239 < arg0; local239++) {
				Class10_Sub1_Sub2_Sub4 local245 = arg3[local239];
				if (local245 != null) {
					int local250 = this.anInt402;
					for ( int local252 = 0; local252 < local245.anInt402; local252++) {
						this.anIntArray113[this.anInt402] = local245.anIntArray113[local252];
						this.anIntArray114[this.anInt402] = local245.anIntArray114[local252];
						this.anIntArray115[this.anInt402] = local245.anIntArray115[local252];
						this.anInt402++;
					}
					int local374;
					for ( int local294 = 0; local294 < local245.anInt403; local294++) {
						this.anIntArray116[this.anInt403] = local245.anIntArray116[local294] + local250;
						this.anIntArray117[this.anInt403] = local245.anIntArray117[local294] + local250;
						this.anIntArray118[this.anInt403] = local245.anIntArray118[local294] + local250;
						this.anIntArray119[this.anInt403] = local245.anIntArray119[local294];
						this.anIntArray120[this.anInt403] = local245.anIntArray120[local294];
						this.anIntArray121[this.anInt403] = local245.anIntArray121[local294];
						if (local30) {
							if (local245.anIntArray122 == null) {
								this.anIntArray122[this.anInt403] = 0;
							} else {
								local374 = local245.anIntArray122[local294];
								if ((local374 & 0x2) == 2) {
									local374 += local237 << 2;
								}
								this.anIntArray122[this.anInt403] = local374;
							}
						}
						if (local32) {
							if (local245.anIntArray123 == null) {
								this.anIntArray123[this.anInt403] = local245.anInt404;
							} else {
								this.anIntArray123[this.anInt403] = local245.anIntArray123[local294];
							}
						}
						if (local34) {
							if (local245.anIntArray124 == null) {
								this.anIntArray124[this.anInt403] = 0;
							} else {
								this.anIntArray124[this.anInt403] = local245.anIntArray124[local294];
							}
						}
						if (local36 && local245.anIntArray125 != null) {
							this.anIntArray125[this.anInt403] = local245.anIntArray125[local294];
						}
						this.anInt403++;
					}
					for (local374 = 0; local374 < local245.anInt405; local374++) {
						this.anIntArray126[this.anInt405] = local245.anIntArray126[local374] + local250;
						this.anIntArray127[this.anInt405] = local245.anIntArray127[local374] + local250;
						this.anIntArray128[this.anInt405] = local245.anIntArray128[local374] + local250;
						this.anInt405++;
					}
					local237 += local245.anInt405;
				}
			}
			this.method275(this.anInt398);
		} catch ( RuntimeException local524) {
			signlink.reporterror("92423, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local524.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4( boolean arg0, boolean arg1, boolean arg2, Class10_Sub1_Sub2_Sub4 arg3, boolean arg4) {
		try {
			anInt401++;
			this.anInt402 = arg3.anInt402;
			this.anInt403 = arg3.anInt403;
			this.anInt405 = arg3.anInt405;
			int local78;
			if (arg0) {
				this.anIntArray113 = arg3.anIntArray113;
				this.anIntArray114 = arg3.anIntArray114;
				this.anIntArray115 = arg3.anIntArray115;
			} else {
				this.anIntArray113 = new int[this.anInt402];
				this.anIntArray114 = new int[this.anInt402];
				this.anIntArray115 = new int[this.anInt402];
				for (local78 = 0; local78 < this.anInt402; local78++) {
					this.anIntArray113[local78] = arg3.anIntArray113[local78];
					this.anIntArray114[local78] = arg3.anIntArray114[local78];
					this.anIntArray115[local78] = arg3.anIntArray115[local78];
				}
			}
			if (arg2) {
				this.anIntArray125 = arg3.anIntArray125;
			} else {
				this.anIntArray125 = new int[this.anInt403];
				for (local78 = 0; local78 < this.anInt403; local78++) {
					this.anIntArray125[local78] = arg3.anIntArray125[local78];
				}
			}
			if (arg4) {
				this.anIntArray124 = arg3.anIntArray124;
			} else {
				this.anIntArray124 = new int[this.anInt403];
				if (arg3.anIntArray124 == null) {
					for (local78 = 0; local78 < this.anInt403; local78++) {
						this.anIntArray124[local78] = 0;
					}
				} else {
					for (local78 = 0; local78 < this.anInt403; local78++) {
						this.anIntArray124[local78] = arg3.anIntArray124[local78];
					}
				}
			}
			this.anIntArray129 = arg3.anIntArray129;
			this.anIntArray130 = arg3.anIntArray130;
			this.anIntArray122 = arg3.anIntArray122;
			this.anIntArray116 = arg3.anIntArray116;
			this.anIntArray117 = arg3.anIntArray117;
			this.anIntArray118 = arg3.anIntArray118;
			this.anIntArray123 = arg3.anIntArray123;
			this.anInt404 = arg3.anInt404;
			this.anIntArray126 = arg3.anIntArray126;
			this.anIntArray127 = arg3.anIntArray127;
			this.anIntArray128 = arg3.anIntArray128;
		} catch ( RuntimeException local233) {
			signlink.reporterror("1103, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4( boolean arg0, boolean arg1, int arg2, Class10_Sub1_Sub2_Sub4 arg3) {
		try {
			anInt401++;
			this.anInt402 = arg3.anInt402;
			this.anInt403 = arg3.anInt403;
			this.anInt405 = arg3.anInt405;
			int local49;
			if (arg0) {
				this.anIntArray114 = new int[this.anInt402];
				for (local49 = 0; local49 < this.anInt402; local49++) {
					this.anIntArray114[local49] = arg3.anIntArray114[local49];
				}
			} else {
				this.anIntArray114 = arg3.anIntArray114;
			}
			if (arg1) {
				this.anIntArray119 = new int[this.anInt403];
				this.anIntArray120 = new int[this.anInt403];
				this.anIntArray121 = new int[this.anInt403];
				for (local49 = 0; local49 < this.anInt403; local49++) {
					this.anIntArray119[local49] = arg3.anIntArray119[local49];
					this.anIntArray120[local49] = arg3.anIntArray120[local49];
					this.anIntArray121[local49] = arg3.anIntArray121[local49];
				}
				this.anIntArray122 = new int[this.anInt403];
				int local129;
				if (arg3.anIntArray122 == null) {
					for (local129 = 0; local129 < this.anInt403; local129++) {
						this.anIntArray122[local129] = 0;
					}
				} else {
					for (local129 = 0; local129 < this.anInt403; local129++) {
						this.anIntArray122[local129] = arg3.anIntArray122[local129];
					}
				}
				super.aClass41Array10 = new Class41[this.anInt402];
				for (local129 = 0; local129 < this.anInt402; local129++) {
					Class41 local177 = super.aClass41Array10[local129] = new Class41();
					Class41 local182 = arg3.aClass41Array10[local129];
					local177.anInt607 = local182.anInt607;
					local177.anInt608 = local182.anInt608;
					local177.anInt609 = local182.anInt609;
					local177.anInt610 = local182.anInt610;
				}
				this.aClass41Array6 = arg3.aClass41Array6;
			} else {
				this.anIntArray119 = arg3.anIntArray119;
				this.anIntArray120 = arg3.anIntArray120;
				this.anIntArray121 = arg3.anIntArray121;
				this.anIntArray122 = arg3.anIntArray122;
			}
			this.anIntArray113 = arg3.anIntArray113;
			this.anIntArray115 = arg3.anIntArray115;
			this.anIntArray125 = arg3.anIntArray125;
			this.anIntArray124 = arg3.anIntArray124;
			this.anIntArray123 = arg3.anIntArray123;
			this.anInt404 = arg3.anInt404;
			this.anIntArray116 = arg3.anIntArray116;
			this.anIntArray117 = arg3.anIntArray117;
			this.anIntArray118 = arg3.anIntArray118;
			this.anIntArray126 = arg3.anIntArray126;
			this.anIntArray127 = arg3.anIntArray127;
			this.anIntArray128 = arg3.anIntArray128;
			super.anInt713 = arg3.anInt713;
			this.anInt410 = arg3.anInt410;
			this.anInt409 = arg3.anInt409;
			this.anInt412 = arg3.anInt412;
			this.anInt411 = arg3.anInt411;
			this.anInt407 = arg3.anInt407;
			this.anInt408 = arg3.anInt408;
			this.anInt406 = arg3.anInt406;
		} catch ( RuntimeException local317) {
			signlink.reporterror("18542, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local317.toString());
			throw new RuntimeException();
		}
	}

	public void method273( boolean arg0, Class10_Sub1_Sub2_Sub4 arg1) {
		try {
			this.anInt402 = arg1.anInt402;
			this.anInt403 = arg1.anInt403;
			this.anInt405 = arg1.anInt405;
			if (anIntArray109.length < this.anInt402) {
				anIntArray109 = new int[this.anInt402 + 100];
				anIntArray110 = new int[this.anInt402 + 100];
				anIntArray111 = new int[this.anInt402 + 100];
			}
			this.anIntArray113 = anIntArray109;
			this.anIntArray114 = anIntArray110;
			this.anIntArray115 = anIntArray111;
			for ( int local51 = 0; local51 < this.anInt402; local51++) {
				this.anIntArray113[local51] = arg1.anIntArray113[local51];
				this.anIntArray114[local51] = arg1.anIntArray114[local51];
				this.anIntArray115[local51] = arg1.anIntArray115[local51];
			}
			if (arg0) {
				this.anIntArray124 = arg1.anIntArray124;
			} else {
				if (anIntArray112.length < this.anInt403) {
					anIntArray112 = new int[this.anInt403 + 100];
				}
				this.anIntArray124 = anIntArray112;
				int local109;
				if (arg1.anIntArray124 == null) {
					for (local109 = 0; local109 < this.anInt403; local109++) {
						this.anIntArray124[local109] = 0;
					}
				} else {
					for (local109 = 0; local109 < this.anInt403; local109++) {
						this.anIntArray124[local109] = arg1.anIntArray124[local109];
					}
				}
			}
			this.anIntArray122 = arg1.anIntArray122;
			this.anIntArray125 = arg1.anIntArray125;
			this.anIntArray123 = arg1.anIntArray123;
			this.anInt404 = arg1.anInt404;
			this.anIntArrayArray11 = arg1.anIntArrayArray11;
			this.anIntArrayArray10 = arg1.anIntArrayArray10;
			this.anIntArray116 = arg1.anIntArray116;
			this.anIntArray117 = arg1.anIntArray117;
			this.anIntArray118 = arg1.anIntArray118;
			this.anIntArray119 = arg1.anIntArray119;
			this.anIntArray120 = arg1.anIntArray120;
			this.anIntArray121 = arg1.anIntArray121;
			this.anIntArray126 = arg1.anIntArray126;
			this.anIntArray127 = arg1.anIntArray127;
			this.anIntArray128 = arg1.anIntArray128;
		} catch ( RuntimeException local201) {
			signlink.reporterror("37164, " + arg0 + ", " + arg1 + ", " + 1244 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	private int method274( Class10_Sub1_Sub2_Sub4 arg0, int arg1) {
		int local3 = -1;
		int local8 = arg0.anIntArray113[arg1];
		int local13 = arg0.anIntArray114[arg1];
		int local18 = arg0.anIntArray115[arg1];
		for ( int local20 = 0; local20 < this.anInt402; local20++) {
			if (local8 == this.anIntArray113[local20] && local13 == this.anIntArray114[local20] && local18 == this.anIntArray115[local20]) {
				local3 = local20;
				break;
			}
		}
		if (local3 == -1) {
			this.anIntArray113[this.anInt402] = local8;
			this.anIntArray114[this.anInt402] = local13;
			this.anIntArray115[this.anInt402] = local18;
			if (arg0.anIntArray129 != null) {
				this.anIntArray129[this.anInt402] = arg0.anIntArray129[arg1];
			}
			local3 = this.anInt402++;
		}
		return local3;
	}

	public void method275( int arg0) {
		try {
			super.anInt713 = 0;
			this.anInt409 = 0;
			this.anInt410 = 0;
			for ( int local10 = 0; local10 < this.anInt402; local10++) {
				int local17 = this.anIntArray113[local10];
				int local22 = this.anIntArray114[local10];
				int local27 = this.anIntArray115[local10];
				if (-local22 > super.anInt713) {
					super.anInt713 = -local22;
				}
				if (local22 > this.anInt410) {
					this.anInt410 = local22;
				}
				int local51 = local17 * local17 + local27 * local27;
				if (local51 > this.anInt409) {
					this.anInt409 = local51;
				}
			}
			this.anInt409 = (int) (Math.sqrt((double) this.anInt409) + 0.99D);
			this.anInt412 = (int) (Math.sqrt((double) (this.anInt409 * this.anInt409 + super.anInt713 * super.anInt713)) + 0.99D);
			int local94 = 64 / arg0;
			this.anInt411 = this.anInt412 + (int) (Math.sqrt((double) (this.anInt409 * this.anInt409 + this.anInt410 * this.anInt410)) + 0.99D);
		} catch ( RuntimeException local117) {
			signlink.reporterror("67878, " + arg0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	public void method276() {
		try {
			super.anInt713 = 0;
			this.anInt410 = 0;
			for ( int local11 = 0; local11 < this.anInt402; local11++) {
				int local18 = this.anIntArray114[local11];
				if (-local18 > super.anInt713) {
					super.anInt713 = -local18;
				}
				if (local18 > this.anInt410) {
					this.anInt410 = local18;
				}
			}
			this.anInt412 = (int) (Math.sqrt((double) (this.anInt409 * this.anInt409 + super.anInt713 * super.anInt713)) + 0.99D);
			this.anInt411 = this.anInt412 + (int) (Math.sqrt((double) (this.anInt409 * this.anInt409 + this.anInt410 * this.anInt410)) + 0.99D);
		} catch ( RuntimeException local80) {
			signlink.reporterror("90514, " + 6 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	private void method277() {
		try {
			super.anInt713 = 0;
			this.anInt409 = 0;
			this.anInt410 = 0;
			int local10 = 32767;
			int local12 = -32767;
			int local14 = -32767;
			int local16 = 32767;
			for ( int local18 = 0; local18 < this.anInt402; local18++) {
				int local25 = this.anIntArray113[local18];
				int local30 = this.anIntArray114[local18];
				int local35 = this.anIntArray115[local18];
				if (local25 < local10) {
					local10 = local25;
				}
				if (local25 > local12) {
					local12 = local25;
				}
				if (local35 < local16) {
					local16 = local35;
				}
				if (local35 > local14) {
					local14 = local35;
				}
				if (-local30 > super.anInt713) {
					super.anInt713 = -local30;
				}
				if (local30 > this.anInt410) {
					this.anInt410 = local30;
				}
				int local79 = local25 * local25 + local35 * local35;
				if (local79 > this.anInt409) {
					this.anInt409 = local79;
				}
			}
			this.anInt409 = (int) Math.sqrt((double) this.anInt409);
			this.anInt412 = (int) Math.sqrt((double) (this.anInt409 * this.anInt409 + super.anInt713 * super.anInt713));
			this.anInt411 = this.anInt412 + (int) Math.sqrt((double) (this.anInt409 * this.anInt409 + this.anInt410 * this.anInt410));
			this.anInt407 = (local10 << 16) + (local12 & 0xFFFF);
			this.anInt408 = (local14 << 16) + (local16 & 0xFFFF);
		} catch ( RuntimeException local158) {
			signlink.reporterror("15788, " + 426 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	public void method278() {
		try {
			int[] local11;
			int local13;
			int local26;
			int local15;
			int local22;
			int local67;
			int local74;
			if (this.anIntArray129 != null) {
				local11 = new int[256];
				local13 = 0;
				for (local15 = 0; local15 < this.anInt402; local15++) {
					local22 = this.anIntArray129[local15];
					local26 = local11[local22]++;
					if (local22 > local13) {
						local13 = local22;
					}
				}
				this.anIntArrayArray10 = new int[local13 + 1][];
				for (local22 = 0; local22 <= local13; local22++) {
					this.anIntArrayArray10[local22] = new int[local11[local22]];
					local11[local22] = 0;
				}
				local67 = 0;
				while (local67 < this.anInt402) {
					local74 = this.anIntArray129[local67];
					this.anIntArrayArray10[local74][local11[local74]++] = local67++;
				}
				this.anIntArray129 = null;
			}
			if (this.anIntArray130 != null) {
				local11 = new int[256];
				local13 = 0;
				for (local15 = 0; local15 < this.anInt403; local15++) {
					local22 = this.anIntArray130[local15];
					local26 = local11[local22]++;
					if (local22 > local13) {
						local13 = local22;
					}
				}
				this.anIntArrayArray11 = new int[local13 + 1][];
				for (local22 = 0; local22 <= local13; local22++) {
					this.anIntArrayArray11[local22] = new int[local11[local22]];
					local11[local22] = 0;
				}
				local67 = 0;
				while (local67 < this.anInt403) {
					local74 = this.anIntArray130[local67];
					this.anIntArrayArray11[local74][local11[local74]++] = local67++;
				}
				this.anIntArray130 = null;
			}
		} catch ( RuntimeException local189) {
			signlink.reporterror("88800, " + 7 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	public void method279( int arg0, byte arg1) {
		try {
			if (this.anIntArrayArray10 != null && arg0 != -1) {
				Class22 local12 = Class22.method168(arg0);
				if (local12 != null) {
					Class42 local18 = local12.aClass42_1;
					boolean local23 = false;
					anInt414 = 0;
					anInt415 = 0;
					anInt416 = 0;
					for ( int local34 = 0; local34 < local12.anInt239; local34++) {
						int local41 = local12.anIntArray81[local34];
						this.method281(local18.anIntArray172[local41], local18.anIntArrayArray15[local41], local12.anIntArray82[local34], local12.anIntArray83[local34], local12.anIntArray84[local34]);
					}
				}
			}
		} catch ( RuntimeException local70) {
			signlink.reporterror("76974, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	public void method280( int arg0, int arg1, int[] arg2) {
		try {
			if (arg1 != -1) {
				if (arg2 == null || arg0 == -1) {
					this.method279(arg1, (byte) 6);
				} else {
					Class22 local18 = Class22.method168(arg1);
					if (local18 != null) {
						Class22 local24 = Class22.method168(arg0);
						if (local24 == null) {
							this.method279(arg1, (byte) 6);
						} else {
							Class42 local34 = local18.aClass42_1;
							anInt414 = 0;
							anInt415 = 0;
							anInt416 = 0;
							byte local52 = 0;
							int local55 = local52 + 1;
							int local57 = arg2[0];
							int local66;
							for ( int local59 = 0; local59 < local18.anInt239; local59++) {
								local66 = local18.anIntArray81[local59];
								while (local66 > local57) {
									local57 = arg2[local55++];
								}
								if (local66 != local57 || local34.anIntArray172[local66] == 0) {
									this.method281(local34.anIntArray172[local66], local34.anIntArrayArray15[local66], local18.anIntArray82[local59], local18.anIntArray83[local59], local18.anIntArray84[local59]);
								}
							}
							anInt414 = 0;
							anInt415 = 0;
							anInt416 = 0;
							local52 = 0;
							local55 = local52 + 1;
							local57 = arg2[0];
							for (local66 = 0; local66 < local24.anInt239; local66++) {
								int local133 = local24.anIntArray81[local66];
								while (local133 > local57) {
									local57 = arg2[local55++];
								}
								if (local133 == local57 || local34.anIntArray172[local133] == 0) {
									this.method281(local34.anIntArray172[local133], local34.anIntArrayArray15[local133], local24.anIntArray82[local66], local24.anIntArray83[local66], local24.anIntArray84[local66]);
								}
							}
						}
					}
				}
			}
		} catch ( RuntimeException local180) {
			signlink.reporterror("72004, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	private void method281( int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int local4 = arg1.length;
		int local8;
		int local16;
		int local34;
		int local40;
		if (arg0 == 0) {
			local8 = 0;
			anInt414 = 0;
			anInt415 = 0;
			anInt416 = 0;
			for (local16 = 0; local16 < local4; local16++) {
				int local22 = arg1[local16];
				if (local22 < this.anIntArrayArray10.length) {
					int[] local32 = this.anIntArrayArray10[local22];
					for (local34 = 0; local34 < local32.length; local34++) {
						local40 = local32[local34];
						anInt414 += this.anIntArray113[local40];
						anInt415 += this.anIntArray114[local40];
						anInt416 += this.anIntArray115[local40];
						local8++;
					}
				}
			}
			if (local8 > 0) {
				anInt414 = anInt414 / local8 + arg2;
				anInt415 = anInt415 / local8 + arg3;
				anInt416 = anInt416 / local8 + arg4;
			} else {
				anInt414 = arg2;
				anInt415 = arg3;
				anInt416 = arg4;
			}
			return;
		}
		int[] local120;
		int local122;
		if (arg0 == 1) {
			for (local8 = 0; local8 < local4; local8++) {
				local16 = arg1[local8];
				if (local16 < this.anIntArrayArray10.length) {
					local120 = this.anIntArrayArray10[local16];
					for (local122 = 0; local122 < local120.length; local122++) {
						local34 = local120[local122];
						this.anIntArray113[local34] += arg2;
						this.anIntArray114[local34] += arg3;
						this.anIntArray115[local34] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local8 = 0; local8 < local4; local8++) {
				local16 = arg1[local8];
				if (local16 < this.anIntArrayArray10.length) {
					local120 = this.anIntArrayArray10[local16];
					for (local122 = 0; local122 < local120.length; local122++) {
						local34 = local120[local122];
						this.anIntArray113[local34] -= anInt414;
						this.anIntArray114[local34] -= anInt415;
						this.anIntArray115[local34] -= anInt416;
						local40 = (arg2 & 0xFF) * 8;
						int local227 = (arg3 & 0xFF) * 8;
						int local233 = (arg4 & 0xFF) * 8;
						int local239;
						int local243;
						int local259;
						if (local233 != 0) {
							local239 = anIntArray146[local233];
							local243 = anIntArray147[local233];
							local259 = this.anIntArray114[local34] * local239 + this.anIntArray113[local34] * local243 >> 16;
							this.anIntArray114[local34] = this.anIntArray114[local34] * local243 - this.anIntArray113[local34] * local239 >> 16;
							this.anIntArray113[local34] = local259;
						}
						if (local40 != 0) {
							local239 = anIntArray146[local40];
							local243 = anIntArray147[local40];
							local259 = this.anIntArray114[local34] * local243 - this.anIntArray115[local34] * local239 >> 16;
							this.anIntArray115[local34] = this.anIntArray114[local34] * local239 + this.anIntArray115[local34] * local243 >> 16;
							this.anIntArray114[local34] = local259;
						}
						if (local227 != 0) {
							local239 = anIntArray146[local227];
							local243 = anIntArray147[local227];
							local259 = this.anIntArray115[local34] * local239 + this.anIntArray113[local34] * local243 >> 16;
							this.anIntArray115[local34] = this.anIntArray115[local34] * local243 - this.anIntArray113[local34] * local239 >> 16;
							this.anIntArray113[local34] = local259;
						}
						this.anIntArray113[local34] += anInt414;
						this.anIntArray114[local34] += anInt415;
						this.anIntArray115[local34] += anInt416;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local8 = 0; local8 < local4; local8++) {
				local16 = arg1[local8];
				if (local16 < this.anIntArrayArray10.length) {
					local120 = this.anIntArrayArray10[local16];
					for (local122 = 0; local122 < local120.length; local122++) {
						local34 = local120[local122];
						this.anIntArray113[local34] -= anInt414;
						this.anIntArray114[local34] -= anInt415;
						this.anIntArray115[local34] -= anInt416;
						this.anIntArray113[local34] = this.anIntArray113[local34] * arg2 / 128;
						this.anIntArray114[local34] = this.anIntArray114[local34] * arg3 / 128;
						this.anIntArray115[local34] = this.anIntArray115[local34] * arg4 / 128;
						this.anIntArray113[local34] += anInt414;
						this.anIntArray114[local34] += anInt415;
						this.anIntArray115[local34] += anInt416;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray11 != null && this.anIntArray124 != null)) {
			for (local8 = 0; local8 < local4; local8++) {
				local16 = arg1[local8];
				if (local16 < this.anIntArrayArray11.length) {
					local120 = this.anIntArrayArray11[local16];
					for (local122 = 0; local122 < local120.length; local122++) {
						local34 = local120[local122];
						this.anIntArray124[local34] += arg2 * 8;
						if (this.anIntArray124[local34] < 0) {
							this.anIntArray124[local34] = 0;
						}
						if (this.anIntArray124[local34] > 255) {
							this.anIntArray124[local34] = 255;
						}
					}
				}
			}
		}
	}

	public void method282() {
		try {
			for ( int local4 = 0; local4 < this.anInt402; local4++) {
				int local11 = this.anIntArray113[local4];
				this.anIntArray113[local4] = this.anIntArray115[local4];
				this.anIntArray115[local4] = -local11;
			}
		} catch ( RuntimeException local32) {
			signlink.reporterror("76482, " + true + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	public void method283( int arg0, int arg1) {
		try {
			int local3 = anIntArray146[arg0];
			int local7 = anIntArray147[arg0];
			for ( int local9 = 0; local9 < this.anInt402; local9++) {
				int local27 = this.anIntArray114[local9] * local7 - this.anIntArray115[local9] * local3 >> 16;
				this.anIntArray115[local9] = this.anIntArray114[local9] * local3 + this.anIntArray115[local9] * local7 >> 16;
				this.anIntArray114[local9] = local27;
			}
			boolean local60 = false;
		} catch ( RuntimeException local62) {
			signlink.reporterror("91366, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	public void method284( int arg0, int arg1, int arg2) {
		try {
			for ( int local6 = 0; local6 < this.anInt402; local6++) {
				this.anIntArray113[local6] += arg0;
				this.anIntArray114[local6] += arg2;
				this.anIntArray115[local6] += arg1;
			}
		} catch ( RuntimeException local39) {
			signlink.reporterror("30486, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	public void method285( int arg0, int arg1) {
		for ( int local1 = 0; local1 < this.anInt403; local1++) {
			if (this.anIntArray125[local1] == arg0) {
				this.anIntArray125[local1] = arg1;
			}
		}
	}

	public void method286() {
		try {
			for ( int local12 = 0; local12 < this.anInt402; local12++) {
				this.anIntArray115[local12] = -this.anIntArray115[local12];
			}
			for ( int local30 = 0; local30 < this.anInt403; local30++) {
				int local37 = this.anIntArray116[local30];
				this.anIntArray116[local30] = this.anIntArray118[local30];
				this.anIntArray118[local30] = local37;
			}
		} catch ( RuntimeException local57) {
			signlink.reporterror("8589, " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	public void method287( int arg0, int arg1, int arg2) {
		try {
			for ( int local1 = 0; local1 < this.anInt402; local1++) {
				this.anIntArray113[local1] = this.anIntArray113[local1] * arg2 / 128;
				this.anIntArray114[local1] = this.anIntArray114[local1] * arg0 / 128;
				this.anIntArray115[local1] = this.anIntArray115[local1] * arg1 / 128;
			}
		} catch ( RuntimeException local52) {
			signlink.reporterror("26889, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	public void method288( int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		int local22 = arg1 * local16 >> 8;
		if (this.anIntArray119 == null) {
			this.anIntArray119 = new int[this.anInt403];
			this.anIntArray120 = new int[this.anInt403];
			this.anIntArray121 = new int[this.anInt403];
		}
		int local50;
		if (super.aClass41Array10 == null) {
			super.aClass41Array10 = new Class41[this.anInt402];
			for (local50 = 0; local50 < this.anInt402; local50++) {
				super.aClass41Array10[local50] = new Class41();
			}
		}
		int local73;
		for (local50 = 0; local50 < this.anInt403; local50++) {
			local73 = this.anIntArray116[local50];
			int local78 = this.anIntArray117[local50];
			int local83 = this.anIntArray118[local50];
			int local93 = this.anIntArray113[local78] - this.anIntArray113[local73];
			int local103 = this.anIntArray114[local78] - this.anIntArray114[local73];
			int local113 = this.anIntArray115[local78] - this.anIntArray115[local73];
			int local123 = this.anIntArray113[local83] - this.anIntArray113[local73];
			int local133 = this.anIntArray114[local83] - this.anIntArray114[local73];
			int local143 = this.anIntArray115[local83] - this.anIntArray115[local73];
			int local151 = local103 * local143 - local133 * local113;
			int local159 = local113 * local123 - local143 * local93;
			int local167;
			for (local167 = local93 * local133 - local123 * local103; local151 > 8192 || local159 > 8192 || local167 > 8192 || local151 < -8192 || local159 < -8192 || local167 < -8192; local167 >>= 0x1) {
				local151 >>= 0x1;
				local159 >>= 0x1;
			}
			int local214 = (int) Math.sqrt((double) (local151 * local151 + local159 * local159 + local167 * local167));
			if (local214 <= 0) {
				local214 = 1;
			}
			local151 = local151 * 256 / local214;
			local159 = local159 * 256 / local214;
			local167 = local167 * 256 / local214;
			if (this.anIntArray122 == null || (this.anIntArray122[local50] & 0x1) == 0) {
				Class41 local251 = super.aClass41Array10[local73];
				local251.anInt607 += local151;
				local251.anInt608 += local159;
				local251.anInt609 += local167;
				local251.anInt610++;
				Class41 local280 = super.aClass41Array10[local78];
				local280.anInt607 += local151;
				local280.anInt608 += local159;
				local280.anInt609 += local167;
				local280.anInt610++;
				Class41 local309 = super.aClass41Array10[local83];
				local309.anInt607 += local151;
				local309.anInt608 += local159;
				local309.anInt609 += local167;
				local309.anInt610++;
			} else {
				int local355 = arg0 + (arg2 * local151 + arg3 * local159 + arg4 * local167) / (local22 + local22 / 2);
				this.anIntArray119[local50] = method291(this.anIntArray125[local50], local355, this.anIntArray122[local50]);
			}
		}
		if (arg5) {
			this.method290(arg0, local22, arg2, arg3, arg4);
		} else {
			this.aClass41Array6 = new Class41[this.anInt402];
			for (local73 = 0; local73 < this.anInt402; local73++) {
				Class41 local399 = super.aClass41Array10[local73];
				Class41 local408 = this.aClass41Array6[local73] = new Class41();
				local408.anInt607 = local399.anInt607;
				local408.anInt608 = local399.anInt608;
				local408.anInt609 = local399.anInt609;
				local408.anInt610 = local399.anInt610;
			}
			this.anInt406 = (arg0 << 16) + (local22 & 0xFFFF);
		}
		if (arg5) {
			this.method275(this.anInt398);
		} else {
			this.method277();
		}
	}

	public void method289() {
		try {
			int local4 = this.anInt406 >> 16;
			int local11 = this.anInt406 << 16 >> 16;
			this.method290(local4, local11, -50, -10, -50);
		} catch ( RuntimeException local29) {
			signlink.reporterror("52189, " + -10 + ", " + -50 + ", " + 0 + ", " + -50 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	private void method290( int arg0, int arg1, int arg2, int arg3, int arg4) {
		int local10;
		for ( int local3 = 0; local3 < this.anInt403; local3++) {
			local10 = this.anIntArray116[local3];
			int local15 = this.anIntArray117[local3];
			int local20 = this.anIntArray118[local3];
			Class41 local33;
			int local55;
			int local28;
			if (this.anIntArray122 == null) {
				local28 = this.anIntArray125[local3];
				local33 = super.aClass41Array10[local10];
				local55 = arg0 + (arg2 * local33.anInt607 + arg3 * local33.anInt608 + arg4 * local33.anInt609) / (arg1 * local33.anInt610);
				this.anIntArray119[local3] = method291(local28, local55, 0);
				Class41 local68 = super.aClass41Array10[local15];
				int local90 = arg0 + (arg2 * local68.anInt607 + arg3 * local68.anInt608 + arg4 * local68.anInt609) / (arg1 * local68.anInt610);
				this.anIntArray120[local3] = method291(local28, local90, 0);
				Class41 local103 = super.aClass41Array10[local20];
				int local125 = arg0 + (arg2 * local103.anInt607 + arg3 * local103.anInt608 + arg4 * local103.anInt609) / (arg1 * local103.anInt610);
				this.anIntArray121[local3] = method291(local28, local125, 0);
			} else if ((this.anIntArray122[local3] & 0x1) == 0) {
				local28 = this.anIntArray125[local3];
				int local152 = this.anIntArray122[local3];
				local33 = super.aClass41Array10[local10];
				local55 = arg0 + (arg2 * local33.anInt607 + arg3 * local33.anInt608 + arg4 * local33.anInt609) / (arg1 * local33.anInt610);
				this.anIntArray119[local3] = method291(local28, local55, local152);
				local33 = super.aClass41Array10[local15];
				local55 = arg0 + (arg2 * local33.anInt607 + arg3 * local33.anInt608 + arg4 * local33.anInt609) / (arg1 * local33.anInt610);
				this.anIntArray120[local3] = method291(local28, local55, local152);
				local33 = super.aClass41Array10[local20];
				local55 = arg0 + (arg2 * local33.anInt607 + arg3 * local33.anInt608 + arg4 * local33.anInt609) / (arg1 * local33.anInt610);
				this.anIntArray121[local3] = method291(local28, local55, local152);
			}
		}
		super.aClass41Array10 = null;
		this.aClass41Array6 = null;
		this.anIntArray129 = null;
		this.anIntArray130 = null;
		if (this.anIntArray122 != null) {
			for (local10 = 0; local10 < this.anInt403; local10++) {
				if ((this.anIntArray122[local10] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray125 = null;
	}

	public void method292( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int local1 = Class10_Sub1_Sub1_Sub4.anInt686;
		int local3 = Class10_Sub1_Sub1_Sub4.anInt687;
		int local7 = anIntArray146[0];
		int local11 = anIntArray147[0];
		int local15 = anIntArray146[arg0];
		int local19 = anIntArray147[arg0];
		int local23 = anIntArray146[arg1];
		int local27 = anIntArray147[arg1];
		int local31 = anIntArray146[arg2];
		int local35 = anIntArray147[arg2];
		int local45 = arg4 * local31 + arg5 * local35 >> 16;
		for ( int local47 = 0; local47 < this.anInt402; local47++) {
			int local54 = this.anIntArray113[local47];
			int local59 = this.anIntArray114[local47];
			int local64 = this.anIntArray115[local47];
			int local76;
			if (arg1 != 0) {
				local76 = local59 * local23 + local54 * local27 >> 16;
				local59 = local59 * local27 - local54 * local23 >> 16;
				local54 = local76;
			}
			if (arg0 != 0) {
				local76 = local64 * local15 + local54 * local19 >> 16;
				local64 = local64 * local19 - local54 * local15 >> 16;
				local54 = local76;
			}
			local54 += arg3;
			local59 += arg4;
			local64 += arg5;
			local76 = local59 * local35 - local64 * local31 >> 16;
			local64 = local59 * local31 + local64 * local35 >> 16;
			anIntArray133[local47] = local64 - local45;
			anIntArray131[local47] = local1 + (local54 << 9) / local64;
			anIntArray132[local47] = local3 + (local76 << 9) / local64;
			if (this.anInt405 > 0) {
				anIntArray134[local47] = local54;
				anIntArray135[local47] = local76;
				anIntArray136[local47] = local64;
			}
		}
		try {
			this.method293(false, false, 0);
		} catch ( Exception local223) {
		}
	}

	@Override
	public void method536( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int local11 = arg7 * arg4 - arg5 * arg3 >> 16;
		int local21 = arg6 * arg1 + local11 * arg2 >> 16;
		int local28 = this.anInt409 * arg2 >> 16;
		int local32 = local21 + local28;
		if (local32 <= 50 || local21 >= 3500) {
			return;
		}
		int local49 = arg7 * arg3 + arg5 * arg4 >> 16;
		int local56 = local49 - this.anInt409 << 9;
		if (local56 / local32 >= Draw2D.centerX2d) {
			return;
		}
		int local69 = local49 + this.anInt409 << 9;
		if (local69 / local32 <= -Draw2D.centerX2d) {
			return;
		}
		int local86 = arg6 * arg2 - local11 * arg1 >> 16;
		int local93 = this.anInt409 * arg1 >> 16;
		int local99 = local86 + local93 << 9;
		if (local99 / local32 <= -Draw2D.anInt682) {
			return;
		}
		int local115 = local93 + (super.anInt713 * arg2 >> 16);
		int local121 = local86 - local115 << 9;
		if (local121 / local32 >= Draw2D.anInt682) {
			return;
		}
		int local136 = local28 + (super.anInt713 * arg1 >> 16);
		boolean local138 = false;
		if (local21 - local136 <= 50) {
			local138 = true;
		}
		boolean local147 = false;
		int local155;
		int local204;
		int local208;
		if (arg8 > 0 && aBoolean107) {
			local155 = local21 - local28;
			if (local155 <= 50) {
				local155 = 50;
			}
			if (local49 > 0) {
				local56 /= local32;
				local69 /= local155;
			} else {
				local69 /= local32;
				local56 /= local155;
			}
			if (local86 > 0) {
				local121 /= local32;
				local99 /= local155;
			} else {
				local99 /= local32;
				local121 /= local155;
			}
			local204 = anInt417 - Class10_Sub1_Sub1_Sub4.anInt686;
			local208 = anInt418 - Class10_Sub1_Sub1_Sub4.anInt687;
			if (local204 > local56 && local204 < local69 && local208 > local121 && local208 < local99) {
				if (this.aBoolean106) {
					anIntArray145[anInt419++] = arg8;
				} else {
					local147 = true;
				}
			}
		}
		local155 = Class10_Sub1_Sub1_Sub4.anInt686;
		local204 = Class10_Sub1_Sub1_Sub4.anInt687;
		local208 = 0;
		int local243 = 0;
		if (arg0 != 0) {
			local208 = anIntArray146[arg0];
			local243 = anIntArray147[arg0];
		}
		for ( int local255 = 0; local255 < this.anInt402; local255++) {
			int local262 = this.anIntArray113[local255];
			int local267 = this.anIntArray114[local255];
			int local272 = this.anIntArray115[local255];
			int local284;
			if (arg0 != 0) {
				local284 = local272 * local208 + local262 * local243 >> 16;
				local272 = local272 * local243 - local262 * local208 >> 16;
				local262 = local284;
			}
			local262 += arg5;
			local267 += arg6;
			local272 += arg7;
			local284 = local272 * arg3 + local262 * arg4 >> 16;
			local272 = local272 * arg4 - local262 * arg3 >> 16;
			local262 = local284;
			local284 = local267 * arg2 - local272 * arg1 >> 16;
			local272 = local267 * arg1 + local272 * arg2 >> 16;
			anIntArray133[local255] = local272 - local21;
			if (local272 >= 50) {
				anIntArray131[local255] = local155 + (local262 << 9) / local272;
				anIntArray132[local255] = local204 + (local284 << 9) / local272;
			} else {
				anIntArray131[local255] = -5000;
				local138 = true;
			}
			if (local138 || this.anInt405 > 0) {
				anIntArray134[local255] = local262;
				anIntArray135[local255] = local284;
				anIntArray136[local255] = local272;
			}
		}
		try {
			this.method293(local138, local147, arg8);
		} catch ( Exception local418) {
		}
	}

	private void method293( boolean arg0, boolean arg1, int arg2) {
		for ( int local3 = 0; local3 < this.anInt411; local3++) {
			anIntArray137[local3] = 0;
		}
		int local32;
		int local37;
		int local42;
		int local46;
		int local50;
		int local54;
		int local86;
		for ( int local16 = 0; local16 < this.anInt403; local16++) {
			if (this.anIntArray122 == null || this.anIntArray122[local16] != -1) {
				local32 = this.anIntArray116[local16];
				local37 = this.anIntArray117[local16];
				local42 = this.anIntArray118[local16];
				local46 = anIntArray131[local32];
				local50 = anIntArray131[local37];
				local54 = anIntArray131[local42];
				if (arg0 && (local46 == -5000 || local50 == -5000 || local54 == -5000)) {
					aBooleanArray6[local16] = true;
					local86 = (anIntArray133[local32] + anIntArray133[local37] + anIntArray133[local42]) / 3 + this.anInt412;
					anIntArrayArray12[local86][anIntArray137[local86]++] = local16;
				} else {
					if (arg1 && this.method296(anInt417, anInt418, anIntArray132[local32], anIntArray132[local37], anIntArray132[local42], local46, local50, local54)) {
						anIntArray145[anInt419++] = arg2;
						arg1 = false;
					}
					if ((local46 - local50) * (anIntArray132[local42] - anIntArray132[local37]) - (anIntArray132[local32] - anIntArray132[local37]) * (local54 - local50) > 0) {
						aBooleanArray6[local16] = false;
						if (local46 >= 0 && local50 >= 0 && local54 >= 0 && local46 <= Draw2D.boundX && local50 <= Draw2D.boundX && local54 <= Draw2D.boundX) {
							aBooleanArray5[local16] = false;
						} else {
							aBooleanArray5[local16] = true;
						}
						local86 = (anIntArray133[local32] + anIntArray133[local37] + anIntArray133[local42]) / 3 + this.anInt412;
						anIntArrayArray12[local86][anIntArray137[local86]++] = local16;
					}
				}
			}
		}
		if (this.anIntArray123 == null) {
			for (local32 = this.anInt411 - 1; local32 >= 0; local32--) {
				local37 = anIntArray137[local32];
				if (local37 > 0) {
					int[] local238 = anIntArrayArray12[local32];
					for (local46 = 0; local46 < local37; local46++) {
						this.method294(local238[local46]);
					}
				}
			}
			return;
		}
		for (local32 = 0; local32 < 12; local32++) {
			anIntArray138[local32] = 0;
			anIntArray141[local32] = 0;
		}
		int local310;
		for (local37 = this.anInt411 - 1; local37 >= 0; local37--) {
			local42 = anIntArray137[local37];
			if (local42 > 0) {
				int[] local288 = anIntArrayArray12[local37];
				for (local50 = 0; local50 < local42; local50++) {
					local54 = local288[local50];
					local86 = this.anIntArray123[local54];
					local310 = anIntArray138[local86]++;
					anIntArrayArray13[local86][local310] = local54;
					if (local86 < 10) {
						anIntArray141[local86] += local37;
					} else if (local86 == 10) {
						anIntArray139[local310] = local37;
					} else {
						anIntArray140[local310] = local37;
					}
				}
			}
		}
		local42 = 0;
		if (anIntArray138[1] > 0 || anIntArray138[2] > 0) {
			local42 = (anIntArray141[1] + anIntArray141[2]) / (anIntArray138[1] + anIntArray138[2]);
		}
		local46 = 0;
		if (anIntArray138[3] > 0 || anIntArray138[4] > 0) {
			local46 = (anIntArray141[3] + anIntArray141[4]) / (anIntArray138[3] + anIntArray138[4]);
		}
		local50 = 0;
		if (anIntArray138[6] > 0 || anIntArray138[8] > 0) {
			local50 = (anIntArray141[6] + anIntArray141[8]) / (anIntArray138[6] + anIntArray138[8]);
		}
		local86 = 0;
		local310 = anIntArray138[10];
		int[] local436 = anIntArrayArray13[10];
		int[] local438 = anIntArray139;
		if (local310 == 0) {
			local86 = 0;
			local310 = anIntArray138[11];
			local436 = anIntArrayArray13[11];
			local438 = anIntArray140;
		}
		if (local310 > 0) {
			local54 = local438[0];
		} else {
			local54 = -1000;
		}
		for ( int local466 = 0; local466 < 10; local466++) {
			while (local466 == 0 && local54 > local42) {
				this.method294(local436[local86++]);
				if (local86 == local310 && local436 != anIntArrayArray13[11]) {
					local86 = 0;
					local310 = anIntArray138[11];
					local436 = anIntArrayArray13[11];
					local438 = anIntArray140;
				}
				if (local86 < local310) {
					local54 = local438[local86];
				} else {
					local54 = -1000;
				}
			}
			while (local466 == 3 && local54 > local46) {
				this.method294(local436[local86++]);
				if (local86 == local310 && local436 != anIntArrayArray13[11]) {
					local86 = 0;
					local310 = anIntArray138[11];
					local436 = anIntArrayArray13[11];
					local438 = anIntArray140;
				}
				if (local86 < local310) {
					local54 = local438[local86];
				} else {
					local54 = -1000;
				}
			}
			while (local466 == 5 && local54 > local50) {
				this.method294(local436[local86++]);
				if (local86 == local310 && local436 != anIntArrayArray13[11]) {
					local86 = 0;
					local310 = anIntArray138[11];
					local436 = anIntArrayArray13[11];
					local438 = anIntArray140;
				}
				if (local86 < local310) {
					local54 = local438[local86];
				} else {
					local54 = -1000;
				}
			}
			int local604 = anIntArray138[local466];
			int[] local608 = anIntArrayArray13[local466];
			for ( int local610 = 0; local610 < local604; local610++) {
				this.method294(local608[local610]);
			}
		}
		while (local54 != -1000) {
			this.method294(local436[local86++]);
			if (local86 == local310 && local436 != anIntArrayArray13[11]) {
				local86 = 0;
				local436 = anIntArrayArray13[11];
				local310 = anIntArray138[11];
				local438 = anIntArray140;
			}
			if (local86 < local310) {
				local54 = local438[local86];
			} else {
				local54 = -1000;
			}
		}
	}

	private void method294( int arg0) {
		if (aBooleanArray6[arg0]) {
			this.method295(arg0);
			return;
		}
		int local14 = this.anIntArray116[arg0];
		int local19 = this.anIntArray117[arg0];
		int local24 = this.anIntArray118[arg0];
		Class10_Sub1_Sub1_Sub4.aBoolean177 = aBooleanArray5[arg0];
		if (this.anIntArray124 == null) {
			Class10_Sub1_Sub1_Sub4.anInt685 = 0;
		} else {
			Class10_Sub1_Sub1_Sub4.anInt685 = this.anIntArray124[arg0];
		}
		int local45;
		if (this.anIntArray122 == null) {
			local45 = 0;
		} else {
			local45 = this.anIntArray122[arg0] & 0x3;
		}
		if (local45 == 0) {
			Class10_Sub1_Sub1_Sub4.method517(anIntArray132[local14], anIntArray132[local19], anIntArray132[local24], anIntArray131[local14], anIntArray131[local19], anIntArray131[local24], this.anIntArray119[arg0], this.anIntArray120[arg0], this.anIntArray121[arg0]);
		} else if (local45 == 1) {
			Class10_Sub1_Sub1_Sub4.method519(anIntArray132[local14], anIntArray132[local19], anIntArray132[local24], anIntArray131[local14], anIntArray131[local19], anIntArray131[local24], anIntArray148[this.anIntArray119[arg0]]);
		} else {
			int local127;
			int local132;
			int local137;
			int local142;
			if (local45 == 2) {
				local127 = this.anIntArray122[arg0] >> 2;
				local132 = this.anIntArray126[local127];
				local137 = this.anIntArray127[local127];
				local142 = this.anIntArray128[local127];
				Class10_Sub1_Sub1_Sub4.method521(anIntArray132[local14], anIntArray132[local19], anIntArray132[local24], anIntArray131[local14], anIntArray131[local19], anIntArray131[local24], this.anIntArray119[arg0], this.anIntArray120[arg0], this.anIntArray121[arg0], anIntArray134[local132], anIntArray134[local137], anIntArray134[local142], anIntArray135[local132], anIntArray135[local137], anIntArray135[local142], anIntArray136[local132], anIntArray136[local137], anIntArray136[local142], this.anIntArray125[arg0]);
			} else if (local45 == 3) {
				local127 = this.anIntArray122[arg0] >> 2;
				local132 = this.anIntArray126[local127];
				local137 = this.anIntArray127[local127];
				local142 = this.anIntArray128[local127];
				Class10_Sub1_Sub1_Sub4.method521(anIntArray132[local14], anIntArray132[local19], anIntArray132[local24], anIntArray131[local14], anIntArray131[local19], anIntArray131[local24], this.anIntArray119[arg0], this.anIntArray119[arg0], this.anIntArray119[arg0], anIntArray134[local132], anIntArray134[local137], anIntArray134[local142], anIntArray135[local132], anIntArray135[local137], anIntArray135[local142], anIntArray136[local132], anIntArray136[local137], anIntArray136[local142], this.anIntArray125[arg0]);
			}
		}
	}

	private void method295( int arg0) {
		int local3 = Class10_Sub1_Sub1_Sub4.anInt686;
		int local5 = Class10_Sub1_Sub1_Sub4.anInt687;
		int local7 = 0;
		int local12 = this.anIntArray116[arg0];
		int local17 = this.anIntArray117[arg0];
		int local22 = this.anIntArray118[arg0];
		int local26 = anIntArray136[local12];
		int local30 = anIntArray136[local17];
		int local34 = anIntArray136[local22];
		int local63;
		int local67;
		int local72;
		int local85;
		if (local26 >= 50) {
			anIntArray142[0] = anIntArray131[local12];
			anIntArray143[0] = anIntArray132[local12];
			local7++;
			anIntArray144[0] = this.anIntArray119[arg0];
		} else {
			local63 = anIntArray134[local12];
			local67 = anIntArray135[local12];
			local72 = this.anIntArray119[arg0];
			if (local34 >= 50) {
				local85 = (50 - local26) * anIntArray149[local34 - local26];
				anIntArray142[0] = local3 + (local63 + ((anIntArray134[local22] - local63) * local85 >> 16) << 9) / 50;
				anIntArray143[0] = local5 + (local67 + ((anIntArray135[local22] - local67) * local85 >> 16) << 9) / 50;
				local7++;
				anIntArray144[0] = local72 + ((this.anIntArray121[arg0] - local72) * local85 >> 16);
			}
			if (local30 >= 50) {
				local85 = (50 - local26) * anIntArray149[local30 - local26];
				anIntArray142[local7] = local3 + (local63 + ((anIntArray134[local17] - local63) * local85 >> 16) << 9) / 50;
				anIntArray143[local7] = local5 + (local67 + ((anIntArray135[local17] - local67) * local85 >> 16) << 9) / 50;
				anIntArray144[local7++] = local72 + ((this.anIntArray120[arg0] - local72) * local85 >> 16);
			}
		}
		if (local30 >= 50) {
			anIntArray142[local7] = anIntArray131[local17];
			anIntArray143[local7] = anIntArray132[local17];
			anIntArray144[local7++] = this.anIntArray120[arg0];
		} else {
			local63 = anIntArray134[local17];
			local67 = anIntArray135[local17];
			local72 = this.anIntArray120[arg0];
			if (local26 >= 50) {
				local85 = (50 - local30) * anIntArray149[local26 - local30];
				anIntArray142[local7] = local3 + (local63 + ((anIntArray134[local12] - local63) * local85 >> 16) << 9) / 50;
				anIntArray143[local7] = local5 + (local67 + ((anIntArray135[local12] - local67) * local85 >> 16) << 9) / 50;
				anIntArray144[local7++] = local72 + ((this.anIntArray119[arg0] - local72) * local85 >> 16);
			}
			if (local34 >= 50) {
				local85 = (50 - local30) * anIntArray149[local34 - local30];
				anIntArray142[local7] = local3 + (local63 + ((anIntArray134[local22] - local63) * local85 >> 16) << 9) / 50;
				anIntArray143[local7] = local5 + (local67 + ((anIntArray135[local22] - local67) * local85 >> 16) << 9) / 50;
				anIntArray144[local7++] = local72 + ((this.anIntArray121[arg0] - local72) * local85 >> 16);
			}
		}
		if (local34 >= 50) {
			anIntArray142[local7] = anIntArray131[local22];
			anIntArray143[local7] = anIntArray132[local22];
			anIntArray144[local7++] = this.anIntArray121[arg0];
		} else {
			local63 = anIntArray134[local22];
			local67 = anIntArray135[local22];
			local72 = this.anIntArray121[arg0];
			if (local30 >= 50) {
				local85 = (50 - local34) * anIntArray149[local30 - local34];
				anIntArray142[local7] = local3 + (local63 + ((anIntArray134[local17] - local63) * local85 >> 16) << 9) / 50;
				anIntArray143[local7] = local5 + (local67 + ((anIntArray135[local17] - local67) * local85 >> 16) << 9) / 50;
				anIntArray144[local7++] = local72 + ((this.anIntArray120[arg0] - local72) * local85 >> 16);
			}
			if (local26 >= 50) {
				local85 = (50 - local34) * anIntArray149[local26 - local34];
				anIntArray142[local7] = local3 + (local63 + ((anIntArray134[local12] - local63) * local85 >> 16) << 9) / 50;
				anIntArray143[local7] = local5 + (local67 + ((anIntArray135[local12] - local67) * local85 >> 16) << 9) / 50;
				anIntArray144[local7++] = local72 + ((this.anIntArray119[arg0] - local72) * local85 >> 16);
			}
		}
		local63 = anIntArray142[0];
		local67 = anIntArray142[1];
		local72 = anIntArray142[2];
		local85 = anIntArray143[0];
		int local582 = anIntArray143[1];
		int local586 = anIntArray143[2];
		if ((local63 - local67) * (local586 - local582) - (local85 - local582) * (local72 - local67) <= 0) {
			return;
		}
		Class10_Sub1_Sub1_Sub4.aBoolean177 = false;
		int local629;
		int local686;
		int local691;
		int local696;
		int local701;
		if (local7 == 3) {
			if (local63 < 0 || local67 < 0 || local72 < 0 || local63 > Draw2D.boundX || local67 > Draw2D.boundX || local72 > Draw2D.boundX) {
				Class10_Sub1_Sub1_Sub4.aBoolean177 = true;
			}
			if (this.anIntArray122 == null) {
				local629 = 0;
			} else {
				local629 = this.anIntArray122[arg0] & 0x3;
			}
			if (local629 == 0) {
				Class10_Sub1_Sub1_Sub4.method517(local85, local582, local586, local63, local67, local72, anIntArray144[0], anIntArray144[1], anIntArray144[2]);
			} else if (local629 == 1) {
				Class10_Sub1_Sub1_Sub4.method519(local85, local582, local586, local63, local67, local72, anIntArray148[this.anIntArray119[arg0]]);
			} else if (local629 == 2) {
				local686 = this.anIntArray122[arg0] >> 2;
				local691 = this.anIntArray126[local686];
				local696 = this.anIntArray127[local686];
				local701 = this.anIntArray128[local686];
				Class10_Sub1_Sub1_Sub4.method521(local85, local582, local586, local63, local67, local72, anIntArray144[0], anIntArray144[1], anIntArray144[2], anIntArray134[local691], anIntArray134[local696], anIntArray134[local701], anIntArray135[local691], anIntArray135[local696], anIntArray135[local701], anIntArray136[local691], anIntArray136[local696], anIntArray136[local701], this.anIntArray125[arg0]);
			} else if (local629 == 3) {
				local686 = this.anIntArray122[arg0] >> 2;
				local691 = this.anIntArray126[local686];
				local696 = this.anIntArray127[local686];
				local701 = this.anIntArray128[local686];
				Class10_Sub1_Sub1_Sub4.method521(local85, local582, local586, local63, local67, local72, this.anIntArray119[arg0], this.anIntArray119[arg0], this.anIntArray119[arg0], anIntArray134[local691], anIntArray134[local696], anIntArray134[local701], anIntArray135[local691], anIntArray135[local696], anIntArray135[local701], anIntArray136[local691], anIntArray136[local696], anIntArray136[local701], this.anIntArray125[arg0]);
			}
		}
		if (local7 != 4) {
			return;
		}
		if (local63 < 0 || local67 < 0 || local72 < 0 || local63 > Draw2D.boundX || local67 > Draw2D.boundX || local72 > Draw2D.boundX || anIntArray142[3] < 0 || anIntArray142[3] > Draw2D.boundX) {
			Class10_Sub1_Sub1_Sub4.aBoolean177 = true;
		}
		if (this.anIntArray122 == null) {
			local629 = 0;
		} else {
			local629 = this.anIntArray122[arg0] & 0x3;
		}
		if (local629 == 0) {
			Class10_Sub1_Sub1_Sub4.method517(local85, local582, local586, local63, local67, local72, anIntArray144[0], anIntArray144[1], anIntArray144[2]);
			Class10_Sub1_Sub1_Sub4.method517(local85, local586, anIntArray143[3], local63, local72, anIntArray142[3], anIntArray144[0], anIntArray144[2], anIntArray144[3]);
			return;
		}
		if (local629 == 1) {
			local686 = anIntArray148[this.anIntArray119[arg0]];
			Class10_Sub1_Sub1_Sub4.method519(local85, local582, local586, local63, local67, local72, local686);
			Class10_Sub1_Sub1_Sub4.method519(local85, local586, anIntArray143[3], local63, local72, anIntArray142[3], local686);
			return;
		}
		if (local629 == 2) {
			local686 = this.anIntArray122[arg0] >> 2;
			local691 = this.anIntArray126[local686];
			local696 = this.anIntArray127[local686];
			local701 = this.anIntArray128[local686];
			Class10_Sub1_Sub1_Sub4.method521(local85, local582, local586, local63, local67, local72, anIntArray144[0], anIntArray144[1], anIntArray144[2], anIntArray134[local691], anIntArray134[local696], anIntArray134[local701], anIntArray135[local691], anIntArray135[local696], anIntArray135[local701], anIntArray136[local691], anIntArray136[local696], anIntArray136[local701], this.anIntArray125[arg0]);
			Class10_Sub1_Sub1_Sub4.method521(local85, local586, anIntArray143[3], local63, local72, anIntArray142[3], anIntArray144[0], anIntArray144[2], anIntArray144[3], anIntArray134[local691], anIntArray134[local696], anIntArray134[local701], anIntArray135[local691], anIntArray135[local696], anIntArray135[local701], anIntArray136[local691], anIntArray136[local696], anIntArray136[local701], this.anIntArray125[arg0]);
			return;
		}
		if (local629 != 3) {
			return;
		}
		local686 = this.anIntArray122[arg0] >> 2;
		local691 = this.anIntArray126[local686];
		local696 = this.anIntArray127[local686];
		local701 = this.anIntArray128[local686];
		Class10_Sub1_Sub1_Sub4.method521(local85, local582, local586, local63, local67, local72, this.anIntArray119[arg0], this.anIntArray119[arg0], this.anIntArray119[arg0], anIntArray134[local691], anIntArray134[local696], anIntArray134[local701], anIntArray135[local691], anIntArray135[local696], anIntArray135[local701], anIntArray136[local691], anIntArray136[local696], anIntArray136[local701], this.anIntArray125[arg0]);
		Class10_Sub1_Sub1_Sub4.method521(local85, local586, anIntArray143[3], local63, local72, anIntArray142[3], this.anIntArray119[arg0], this.anIntArray119[arg0], this.anIntArray119[arg0], anIntArray134[local691], anIntArray134[local696], anIntArray134[local701], anIntArray135[local691], anIntArray135[local696], anIntArray135[local701], anIntArray136[local691], anIntArray136[local696], anIntArray136[local701], this.anIntArray125[arg0]);
	}

	private boolean method296( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}
}
