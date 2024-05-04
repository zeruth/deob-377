package unmapped;


import jagex2.io.JagFile;
import sign.signlink;

public final class Class38 {

	public static Client aClient3;

	private static int anInt578;

	private static int[] anIntArray169;

	private static Class38[] aClass38Array1;

	private static Packet aClass10_Sub1_Sub3_3;

	private static int anInt583;

	public static Class34 aClass34_6 = new Class34(30, -572);

	private static byte aByte32 = 6;

	public int[] anIntArray165;

	private int[] anIntArray166;

	private int[] anIntArray167;

	private int[] anIntArray168;

	public String[] aStringArray4;

	private int[] anIntArray170;

	private int anInt581;

	public byte[] aByteArray14;

	private int anInt584;

	public int anInt564 = -1;

	private boolean aBoolean140 = true;

	private int anInt565 = 932;

	private int anInt566 = -1;

	public long aLong19 = -1L;

	private int anInt567 = 128;

	public boolean aBoolean141 = true;

	private int anInt568 = 128;

	public int anInt569 = -1;

	public boolean aBoolean142 = true;

	private int anInt570 = -1;

	public int anInt571 = -1;

	public int anInt572 = -1;

	private int anInt573 = 7;

	public int anInt574 = -1;

	public byte aByte31 = 1;

	public int anInt575 = -1;

	public boolean aBoolean143 = false;

	public int anInt576 = -1;

	private boolean aBoolean144 = false;

	private int anInt577 = -1;

	public int anInt579 = 32;

	public String aString10 = "null";

	private int anInt580 = -1;

	private int anInt582 = -1;

	private boolean aBoolean145 = false;

	public static void method401() {
		try {
			aClass34_6 = null;
			anIntArray169 = null;
			aClass38Array1 = null;
			aClass10_Sub1_Sub3_3 = null;
		} catch ( RuntimeException local18) {
			signlink.reporterror("53356, " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	public static void method404( JagFile arg0) {
		aClass10_Sub1_Sub3_3 = new Packet(arg0.read("npc.dat", null));
		Packet local19 = new Packet(arg0.read("npc.idx", null));
		anInt578 = local19.readShort();
		anIntArray169 = new int[anInt578];
		int local27 = 2;
		for ( int local29 = 0; local29 < anInt578; local29++) {
			anIntArray169[local29] = local27;
			local27 += local19.readShort();
		}
		aClass38Array1 = new Class38[20];
		for ( int local49 = 0; local49 < 20; local49++) {
			aClass38Array1[local49] = new Class38();
		}
	}

	public static Class38 method407( int arg0) {
		for ( int local1 = 0; local1 < 20; local1++) {
			if (aClass38Array1[local1].aLong19 == (long) arg0) {
				return aClass38Array1[local1];
			}
		}
		anInt583 = (anInt583 + 1) % 20;
		Class38 local33 = aClass38Array1[anInt583] = new Class38();
		aClass10_Sub1_Sub3_3.pos = anIntArray169[arg0];
		local33.aLong19 = arg0;
		local33.method400(aByte32, aClass10_Sub1_Sub3_3);
		return local33;
	}

	private Class38() {
	}

	private void method400( byte arg0, Packet arg1) {
		try {
			if (arg0 != 6) {
				throw new NullPointerException();
			}
			boolean local6 = false;
			while (true) {
				while (true) {
					int local15 = arg1.readByte();
					if (local15 == 0) {
						return;
					}
					int local24;
					int local30;
					if (local15 == 1) {
						local24 = arg1.readByte();
						this.anIntArray167 = new int[local24];
						for (local30 = 0; local30 < local24; local30++) {
							this.anIntArray167[local30] = arg1.readShort();
						}
					} else if (local15 == 2) {
						this.aString10 = arg1.method318();
					} else if (local15 == 3) {
						this.aByteArray14 = arg1.method319();
					} else if (local15 == 12) {
						this.aByte31 = arg1.method312();
					} else if (local15 == 13) {
						this.anInt564 = arg1.readShort();
					} else if (local15 == 14) {
						this.anInt576 = arg1.readShort();
					} else if (local15 == 17) {
						this.anInt576 = arg1.readShort();
						this.anInt575 = arg1.readShort();
						this.anInt574 = arg1.readShort();
						this.anInt569 = arg1.readShort();
					} else if (local15 >= 30 && local15 < 40) {
						if (this.aStringArray4 == null) {
							this.aStringArray4 = new String[5];
						}
						this.aStringArray4[local15 - 30] = arg1.method318();
						if (this.aStringArray4[local15 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray4[local15 - 30] = null;
						}
					} else if (local15 == 40) {
						local24 = arg1.readByte();
						this.anIntArray168 = new int[local24];
						this.anIntArray170 = new int[local24];
						for (local30 = 0; local30 < local24; local30++) {
							this.anIntArray168[local30] = arg1.readShort();
							this.anIntArray170[local30] = arg1.readShort();
						}
					} else if (local15 == 60) {
						local24 = arg1.readByte();
						this.anIntArray166 = new int[local24];
						for (local30 = 0; local30 < local24; local30++) {
							this.anIntArray166[local30] = arg1.readShort();
						}
					} else if (local15 == 90) {
						this.anInt577 = arg1.readShort();
					} else if (local15 == 91) {
						this.anInt566 = arg1.readShort();
					} else if (local15 == 92) {
						this.anInt570 = arg1.readShort();
					} else if (local15 == 93) {
						this.aBoolean142 = false;
					} else if (local15 == 95) {
						this.anInt572 = arg1.readShort();
					} else if (local15 == 97) {
						this.anInt568 = arg1.readShort();
					} else if (local15 == 98) {
						this.anInt567 = arg1.readShort();
					} else if (local15 == 99) {
						this.aBoolean143 = true;
					} else if (local15 == 100) {
						this.anInt584 = arg1.method312();
					} else if (local15 == 101) {
						this.anInt581 = arg1.method312() * 5;
					} else if (local15 == 102) {
						this.anInt571 = arg1.readShort();
					} else if (local15 == 103) {
						this.anInt579 = arg1.readShort();
					} else if (local15 == 106) {
						this.anInt580 = arg1.readShort();
						if (this.anInt580 == 65535) {
							this.anInt580 = -1;
						}
						this.anInt582 = arg1.readShort();
						if (this.anInt582 == 65535) {
							this.anInt582 = -1;
						}
						local24 = arg1.readByte();
						this.anIntArray165 = new int[local24 + 1];
						for (local30 = 0; local30 <= local24; local30++) {
							this.anIntArray165[local30] = arg1.readShort();
							if (this.anIntArray165[local30] == 65535) {
								this.anIntArray165[local30] = -1;
							}
						}
					} else if (local15 == 107) {
						this.aBoolean141 = false;
					}
				}
			}
		} catch ( RuntimeException local389) {
			signlink.reporterror("86174, " + arg0 + ", " + arg1 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4 method402() {
		try {
			if (this.anIntArray165 != null) {
				Class38 local17 = this.method406();
				return local17 == null ? null : local17.method402();
			} else if (this.anIntArray166 == null) {
				return null;
			} else {
				boolean local32 = false;
				for ( int local34 = 0; local34 < this.anIntArray166.length; local34++) {
					if (!Class10_Sub1_Sub2_Sub4.method272(this.anIntArray166[local34])) {
						local32 = true;
					}
				}
				if (local32) {
					return null;
				}
				Class10_Sub1_Sub2_Sub4[] local59 = new Class10_Sub1_Sub2_Sub4[this.anIntArray166.length];
				for ( int local61 = 0; local61 < this.anIntArray166.length; local61++) {
					local59[local61] = Class10_Sub1_Sub2_Sub4.method271(this.anIntArray166[local61]);
				}
				Class10_Sub1_Sub2_Sub4 local85;
				if (local59.length == 1) {
					local85 = local59[0];
				} else {
					local85 = new Class10_Sub1_Sub2_Sub4(local59.length, local59, (byte) -89);
				}
				if (this.anIntArray168 != null) {
					for ( int local100 = 0; local100 < this.anIntArray168.length; local100++) {
						local85.method285(this.anIntArray168[local100], this.anIntArray170[local100]);
					}
				}
				return local85;
			}
		} catch ( RuntimeException local121) {
			signlink.reporterror("48168, " + 858 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	public boolean method403() {
		try {
			if (this.anIntArray165 == null) {
				return true;
			}
			int local20 = -1;
			if (this.anInt580 != -1) {
				Class50 local29 = Class50.aClass50Array1[this.anInt580];
				int local32 = local29.anInt800;
				int local35 = local29.anInt801;
				int local38 = local29.anInt802;
				int local44 = Client.anIntArray262[local38 - local35];
				local20 = aClient3.anIntArray244[local32] >> local35 & local44;
			} else if (this.anInt582 != -1) {
				local20 = aClient3.anIntArray244[this.anInt582];
			}
			return local20 >= 0 && local20 < this.anIntArray165.length && this.anIntArray165[local20] != -1;
		} catch ( RuntimeException local83) {
			signlink.reporterror("77856, " + -993 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4 method405( int arg0, int arg1, int[] arg2) {
		try {
			if (this.anIntArray165 != null) {
				Class38 local8 = this.method406();
				return local8 == null ? null : local8.method405(arg0, arg1, arg2);
			}
			Class10_Sub1_Sub2_Sub4 local25 = (Class10_Sub1_Sub2_Sub4) aClass34_6.method387(this.aLong19);
			if (local25 == null) {
				boolean local29 = false;
				for ( int local31 = 0; local31 < this.anIntArray167.length; local31++) {
					if (!Class10_Sub1_Sub2_Sub4.method272(this.anIntArray167[local31])) {
						local29 = true;
					}
				}
				if (local29) {
					return null;
				}
				Class10_Sub1_Sub2_Sub4[] local56 = new Class10_Sub1_Sub2_Sub4[this.anIntArray167.length];
				for ( int local58 = 0; local58 < this.anIntArray167.length; local58++) {
					local56[local58] = Class10_Sub1_Sub2_Sub4.method271(this.anIntArray167[local58]);
				}
				if (local56.length == 1) {
					local25 = local56[0];
				} else {
					local25 = new Class10_Sub1_Sub2_Sub4(local56.length, local56, (byte) -89);
				}
				if (this.anIntArray168 != null) {
					for ( int local97 = 0; local97 < this.anIntArray168.length; local97++) {
						local25.method285(this.anIntArray168[local97], this.anIntArray170[local97]);
					}
				}
				local25.method278();
				local25.method288(this.anInt584 + 64, this.anInt581 + 850, -30, -50, -30, true);
				aClass34_6.method388(local25, this.aLong19);
			}
			Class10_Sub1_Sub2_Sub4 local140 = Class10_Sub1_Sub2_Sub4.aClass10_Sub1_Sub2_Sub4_1;
			local140.method273(Class22.method169(this.aBoolean140, arg0) & Class22.method169(this.aBoolean140, arg1), local25);
			if (arg0 != -1 && arg1 != -1) {
				local140.method280(arg1, arg0, arg2);
			} else if (arg0 != -1) {
				local140.method279(arg0, (byte) 6);
			}
			if (this.anInt568 != 128 || this.anInt567 != 128) {
				local140.method287(this.anInt567, this.anInt568, this.anInt568);
			}
			local140.method275(this.anInt565);
			local140.anIntArrayArray11 = null;
			local140.anIntArrayArray10 = null;
			if (this.aByte31 == 1) {
				local140.aBoolean106 = true;
			}
			return local140;
		} catch ( RuntimeException local221) {
			signlink.reporterror("95203, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	public Class38 method406() {
		try {
			int local6 = -1;
			if (this.anInt580 != -1) {
				Class50 local15 = Class50.aClass50Array1[this.anInt580];
				int local18 = local15.anInt800;
				int local21 = local15.anInt801;
				int local24 = local15.anInt802;
				int local30 = Client.anIntArray262[local24 - local21];
				local6 = aClient3.anIntArray244[local18] >> local21 & local30;
			} else if (this.anInt582 != -1) {
				local6 = aClient3.anIntArray244[this.anInt582];
			}
			return local6 < 0 || local6 >= this.anIntArray165.length || this.anIntArray165[local6] == -1 ? null : method407(this.anIntArray165[local6]);
		} catch ( RuntimeException local73) {
			signlink.reporterror("65525, " + false + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
