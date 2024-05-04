package unmapped;


import jagex2.graphics.Pix24;
import jagex2.io.JagFile;
import sign.signlink;

public final class Class14 {

	private static int anInt110;

	private static JagFile aClass2_1;

	private static Class14[] aClass14Array1;

	private static Class10_Sub1_Sub1_Sub2[] aClass10_Sub1_Sub1_Sub2Array1;

	private static int anInt125;

	private static Class34 aClass34_1;

	private static boolean aBoolean38;

	private static int anInt144;

	private static byte[][] aByteArrayArray2;

	public static int anInt127 = -1;

	private static int anInt133 = -1;

	private static Class34 aClass34_2 = new Class34(30, -572);

	private static int anInt141 = -291;

	private static int anInt142 = -1;

	private static boolean aBoolean42 = true;

	private static int anInt143 = 373;

	public String aString1;

	public Pix24 aClass10_Sub1_Sub1_Sub1_1;

	public int[] anIntArray38;

	public int anInt111;

	public boolean aBoolean32;

	public int anInt112;

	public boolean aBoolean33;

	public byte aByte9;

	public int[] anIntArray39;

	public int anInt113;

	public int[] anIntArray40;

	private int anInt114;

	public int anInt115;

	public int anInt116;

	public int anInt117;

	public boolean aBoolean34;

	public String aString2;

	public int anInt118;

	public int[] anIntArray41;

	private boolean aBoolean35;

	public int[][] anIntArrayArray5;

	public int anInt119;

	public int anInt120;

	public Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_1;

	public int anInt121;

	public boolean aBoolean36;

	public int anInt122;

	public int anInt123;

	public int anInt124;

	public int anInt126;

	public Pix24 aClass10_Sub1_Sub1_Sub1_2;

	public boolean aBoolean37;

	public int anInt128;

	public String aString3;

	public int anInt129;

	public int anInt130;

	public int anInt131;

	public int anInt132;

	public int[] anIntArray42;

	public int[] anIntArray43;

	public int anInt134;

	public int anInt135;

	public int anInt136;

	public String[] aStringArray1;

	public int anInt137;

	public Pix24[] aClass10_Sub1_Sub1_Sub1Array1;

	private int anInt138;

	private int anInt139;

	public String aString4;

	public int[] anIntArray44;

	public boolean aBoolean40;

	public int[] anIntArray45;

	public boolean aBoolean41;

	public int[] anIntArray46;

	public String aString5;

	public int anInt145;

	public int anInt146;

	public int anInt147;

	public int anInt148;

	public int anInt149;

	public boolean aBoolean43;

	public int anInt150;

	private int anInt140 = -68;

	private boolean aBoolean39 = true;

	private static Pix24 method86(int arg0, String arg1) {
		try {
			long local8 = (Class26.method250(183, arg1) << 8) + (long) arg0;
			Pix24 local17 = (Pix24) aClass34_1.method387(local8);
			if (local17 != null) {
				return local17;
			} else if (aClass2_1 == null) {
				return null;
			} else {
				try {
					local17 = new Pix24(aClass2_1, arg1, arg0);
					aClass34_1.method388(local17, local8);
					return local17;
				} catch ( Exception local39) {
					return null;
				}
			}
		} catch ( RuntimeException local44) {
			signlink.reporterror("18265, " + arg0 + ", " + arg1 + ", " + 373 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	public static Class14 method87( int arg0) {
		if (aClass14Array1[arg0] == null) {
			Packet local11 = new Packet(aByteArrayArray2[arg0]);
			int local14 = local11.readShort();
			aClass14Array1[arg0] = method90(local14, local11, arg0);
		}
		return aClass14Array1[arg0];
	}

	private static Class14 method90(int arg0, Packet arg1, int arg2) {
		try {
			Class14 local5 = new Class14();
			local5.anInt111 = arg2;
			local5.anInt128 = arg0;
			local5.anInt120 = arg1.readByte();
			local5.anInt150 = arg1.readByte();
			local5.anInt124 = arg1.readShort();
			local5.anInt123 = arg1.readShort();
			local5.anInt121 = arg1.readShort();
			local5.aByte9 = (byte) arg1.readByte();
			local5.anInt132 = arg1.readByte();
			if (local5.anInt132 == 0) {
				local5.anInt132 = -1;
			} else {
				local5.anInt132 = (local5.anInt132 - 1 << 8) + arg1.readByte();
			}
			if (local5.anInt124 == 600) {
				anInt127 = arg0;
			}
			if (local5.anInt124 == 650) {
				anInt133 = arg0;
			}
			if (local5.anInt124 == 655) {
				anInt142 = arg0;
			}
			int local89 = arg1.readByte();
			int local101;
			if (local89 > 0) {
				local5.anIntArray45 = new int[local89];
				local5.anIntArray42 = new int[local89];
				for (local101 = 0; local101 < local89; local101++) {
					local5.anIntArray45[local101] = arg1.readByte();
					local5.anIntArray42[local101] = arg1.readShort();
				}
			}
			local101 = arg1.readByte();
			int local130;
			int local135;
			if (local101 > 0) {
				local5.anIntArrayArray5 = new int[local101][];
				for (local130 = 0; local130 < local101; local130++) {
					local135 = arg1.readShort();
					local5.anIntArrayArray5[local130] = new int[local135];
					for ( int local143 = 0; local143 < local135; local143++) {
						local5.anIntArrayArray5[local130][local143] = arg1.readShort();
					}
				}
			}
			if (local5.anInt120 == 0) {
				local5.anInt147 = arg1.readShort();
				local5.aBoolean33 = arg1.readByte() == 1;
				local130 = arg1.readShort();
				local5.anIntArray43 = new int[local130];
				local5.anIntArray41 = new int[local130];
				local5.anIntArray46 = new int[local130];
				for (local135 = 0; local135 < local130; local135++) {
					local5.anIntArray43[local135] = arg1.readShort();
					local5.anIntArray41[local135] = arg1.method314();
					local5.anIntArray46[local135] = arg1.method314();
				}
			}
			if (local5.anInt120 == 1) {
				local5.anInt114 = arg1.readShort();
				local5.aBoolean35 = arg1.readByte() == 1;
			}
			if (local5.anInt120 == 2) {
				local5.anIntArray44 = new int[local5.anInt123 * local5.anInt121];
				local5.anIntArray40 = new int[local5.anInt123 * local5.anInt121];
				local5.aBoolean41 = arg1.readByte() == 1;
				local5.aBoolean34 = arg1.readByte() == 1;
				local5.aBoolean43 = arg1.readByte() == 1;
				local5.aBoolean32 = arg1.readByte() == 1;
				local5.anInt137 = arg1.readByte();
				local5.anInt126 = arg1.readByte();
				local5.anIntArray39 = new int[20];
				local5.anIntArray38 = new int[20];
				local5.aClass10_Sub1_Sub1_Sub1Array1 = new Pix24[20];
				for (local130 = 0; local130 < 20; local130++) {
					local135 = arg1.readByte();
					if (local135 == 1) {
						local5.anIntArray39[local130] = arg1.method314();
						local5.anIntArray38[local130] = arg1.method314();
						String local336 = arg1.method318();
						if (local336.length() > 0) {
							int local343 = local336.lastIndexOf(",");
							local5.aClass10_Sub1_Sub1_Sub1Array1[local130] = method86(Integer.parseInt(local336.substring(local343 + 1)), local336.substring(0, local343));
						}
					}
				}
				local5.aStringArray1 = new String[5];
				for (local135 = 0; local135 < 5; local135++) {
					local5.aStringArray1[local135] = arg1.method318();
					if (local5.aStringArray1[local135].length() == 0) {
						local5.aStringArray1[local135] = null;
					}
				}
			}
			if (local5.anInt120 == 3) {
				local5.aBoolean36 = arg1.readByte() == 1;
			}
			if (local5.anInt120 == 4 || local5.anInt120 == 1) {
				local5.aBoolean40 = arg1.readByte() == 1;
				local130 = arg1.readByte();
				if (aClass10_Sub1_Sub1_Sub2Array1 != null) {
					local5.aClass10_Sub1_Sub1_Sub2_1 = aClass10_Sub1_Sub1_Sub2Array1[local130];
				}
				local5.aBoolean37 = arg1.readByte() == 1;
			}
			if (local5.anInt120 == 4) {
				local5.aString2 = arg1.method318();
				local5.aString3 = arg1.method318();
			}
			if (local5.anInt120 == 1 || local5.anInt120 == 3 || local5.anInt120 == 4) {
				local5.anInt122 = arg1.method316();
			}
			if (local5.anInt120 == 3 || local5.anInt120 == 4) {
				local5.anInt135 = arg1.method316();
				local5.anInt136 = arg1.method316();
				local5.anInt115 = arg1.method316();
			}
			if (local5.anInt120 == 5) {
				String local496 = arg1.method318();
				if (local496.length() > 0) {
					local135 = local496.lastIndexOf(",");
					local5.aClass10_Sub1_Sub1_Sub1_1 = method86(Integer.parseInt(local496.substring(local135 + 1)), local496.substring(0, local135));
				}
				local496 = arg1.method318();
				if (local496.length() > 0) {
					local135 = local496.lastIndexOf(",");
					local5.aClass10_Sub1_Sub1_Sub1_2 = method86(Integer.parseInt(local496.substring(local135 + 1)), local496.substring(0, local135));
				}
			}
			if (local5.anInt120 == 6) {
				int local548 = arg1.readByte();
				if (local548 != 0) {
					local5.anInt145 = 1;
					local5.anInt146 = (local548 - 1 << 8) + arg1.readByte();
				}
				local548 = arg1.readByte();
				if (local548 != 0) {
					local5.anInt138 = 1;
					local5.anInt139 = (local548 - 1 << 8) + arg1.readByte();
				}
				local548 = arg1.readByte();
				if (local548 == 0) {
					local5.anInt148 = -1;
				} else {
					local5.anInt148 = (local548 - 1 << 8) + arg1.readByte();
				}
				local548 = arg1.readByte();
				if (local548 == 0) {
					local5.anInt149 = -1;
				} else {
					local5.anInt149 = (local548 - 1 << 8) + arg1.readByte();
				}
				local5.anInt129 = arg1.readShort();
				local5.anInt130 = arg1.readShort();
				local5.anInt131 = arg1.readShort();
			}
			if (local5.anInt120 == 7) {
				local5.anIntArray44 = new int[local5.anInt123 * local5.anInt121];
				local5.anIntArray40 = new int[local5.anInt123 * local5.anInt121];
				local5.aBoolean40 = arg1.readByte() == 1;
				local130 = arg1.readByte();
				if (aClass10_Sub1_Sub1_Sub2Array1 != null) {
					local5.aClass10_Sub1_Sub1_Sub2_1 = aClass10_Sub1_Sub1_Sub2Array1[local130];
				}
				local5.aBoolean37 = arg1.readByte() == 1;
				local5.anInt122 = arg1.method316();
				local5.anInt137 = arg1.method314();
				local5.anInt126 = arg1.method314();
				local5.aBoolean34 = arg1.readByte() == 1;
				local5.aStringArray1 = new String[5];
				for (local135 = 0; local135 < 5; local135++) {
					local5.aStringArray1[local135] = arg1.method318();
					if (local5.aStringArray1[local135].length() == 0) {
						local5.aStringArray1[local135] = null;
					}
				}
			}
			if (local5.anInt120 == 8) {
				local5.aString2 = arg1.method318();
			}
			if (local5.anInt150 == 2 || local5.anInt120 == 2) {
				local5.aString5 = arg1.method318();
				local5.aString1 = arg1.method318();
				local5.anInt113 = arg1.readShort();
			}
			if (local5.anInt150 == 1 || local5.anInt150 == 4 || local5.anInt150 == 5 || local5.anInt150 == 6) {
				local5.aString4 = arg1.method318();
				if (local5.aString4.length() == 0) {
					if (local5.anInt150 == 1) {
						local5.aString4 = "Ok";
					}
					if (local5.anInt150 == 4) {
						local5.aString4 = "Select";
					}
					if (local5.anInt150 == 5) {
						local5.aString4 = "Select";
					}
					if (local5.anInt150 == 6) {
						local5.aString4 = "Continue";
					}
				}
			}
			return local5;
		} catch ( RuntimeException local814) {
			signlink.reporterror("1128, " + arg0 + ", " + arg1 + ", " + 10896 + ", " + arg2 + ", " + local814.toString());
			throw new RuntimeException();
		}
	}

	public static void method91(Class10_Sub1_Sub1_Sub2[] arg0, JagFile arg1, JagFile arg2) {
		try {
			aClass34_1 = new Class34(50000, -572);
			aClass2_1 = arg2;
			aClass10_Sub1_Sub1_Sub2Array1 = arg0;
			int local13 = -1;
			Packet local22 = new Packet(arg1.read("data", null));
			int local25 = local22.readShort();
			aClass14Array1 = new Class14[local25];
			aByteArrayArray2 = new byte[local25][];
			while (local22.pos < local22.aByteArray12.length) {
				int local36 = local22.readShort();
				if (local36 == 65535) {
					local13 = local22.readShort();
					local36 = local22.readShort();
				}
				int local48 = local22.pos;
				Class14 local54 = method90(local13, local22, local36);
				byte[] local67 = aByteArrayArray2[local54.anInt111] = new byte[local22.pos + 2 - local48];
				for (int local69 = local48; local69 < local22.pos; local69++) {
					local67[local69 + 2 - local48] = local22.aByteArray12[local69];
				}
				local67[0] = (byte) (local13 >> 8);
				local67[1] = (byte) local13;
			}
			aClass2_1 = null;
		} catch ( RuntimeException local113) {
			signlink.reporterror("40859, " + -845 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	public static void method92( boolean arg0, int arg1) {
		try {
			if (!arg0) {
				aBoolean38 = !aBoolean38;
			}
			if (arg1 != -1) {
				for ( int local13 = 0; local13 < aClass14Array1.length; local13++) {
					if (aClass14Array1[local13] != null && aClass14Array1[local13].anInt128 == arg1 && aClass14Array1[local13].anInt120 != 2) {
						aClass14Array1[local13] = null;
					}
				}
			}
		} catch ( RuntimeException local42) {
			signlink.reporterror("24394, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	public static void method93( Class10_Sub1_Sub2_Sub4 arg0) {
		try {
			aClass34_2.method389();
			if (arg0 != null) {
				aClass34_2.method388(arg0, (long) 327680);
			}
		} catch ( RuntimeException local28) {
			signlink.reporterror("30015, " + 5 + ", " + arg0 + ", " + 0 + ", " + 6 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	public static void method94() {
		try {
			aClass14Array1 = null;
			aClass2_1 = null;
			aClass34_1 = null;
			aClass10_Sub1_Sub1_Sub2Array1 = null;
			aByteArrayArray2 = null;
		} catch ( RuntimeException local19) {
			signlink.reporterror("71741, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	public void method88( int arg0, int arg1) {
		try {
			int local4 = this.anIntArray44[arg1];
			this.anIntArray44[arg1] = this.anIntArray44[arg0];
			this.anIntArray44[arg0] = local4;
			int local22 = this.anIntArray40[arg1];
			this.anIntArray40[arg1] = this.anIntArray40[arg0];
			this.anIntArray40[arg0] = local22;
		} catch ( RuntimeException local40) {
			signlink.reporterror("71471, " + arg0 + ", " + -291 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	private Class10_Sub1_Sub2_Sub4 method89( int arg0, int arg1) {
		Class17 local1 = null;
		if (arg0 == 4) {
			local1 = Class17.method104(arg1);
			anInt144 += local1.anInt187;
			anInt125 += local1.anInt191;
		}
		Class10_Sub1_Sub2_Sub4 local27 = (Class10_Sub1_Sub2_Sub4) aClass34_2.method387((long) ((arg0 << 16) + arg1));
		if (local27 != null) {
			return local27;
		}
		if (arg0 == 1) {
			local27 = Class10_Sub1_Sub2_Sub4.method271(arg1);
		}
		if (arg0 == 2) {
			local27 = Class38.method407(arg1).method402();
		}
		if (arg0 == 3) {
			local27 = Client.aClass10_Sub1_Sub2_Sub3_Sub2_1.method543();
		}
		if (arg0 == 4) {
			local27 = local1.method109(this.anInt140, 50);
		}
		if (arg0 == 5) {
			local27 = null;
		}
		if (local27 != null) {
			aClass34_2.method388(local27, (long) ((arg0 << 16) + arg1));
		}
		return local27;
	}

	public Class10_Sub1_Sub2_Sub4 method95( int arg0, int arg1, boolean arg2) {
		try {
			anInt144 = 64;
			anInt125 = 768;
			Class10_Sub1_Sub2_Sub4 local12;
			if (arg2) {
				local12 = this.method89(this.anInt138, this.anInt139);
			} else {
				local12 = this.method89(this.anInt145, this.anInt146);
			}
			if (local12 == null) {
				return null;
			} else if (arg0 == -1 && arg1 == -1 && local12.anIntArray125 == null) {
				return local12;
			} else {
				Class10_Sub1_Sub2_Sub4 local53 = new Class10_Sub1_Sub2_Sub4(false, false, true, local12, Class22.method169(this.aBoolean39, arg0) & Class22.method169(this.aBoolean39, arg1));
				if (arg0 != -1 || arg1 != -1) {
					local53.method278();
				}
				if (arg0 != -1) {
					local53.method279(arg0, (byte) 6);
				}
				if (arg1 != -1) {
					local53.method279(arg1, (byte) 6);
				}
				local53.method288(anInt144, anInt125, -50, -10, -50, true);
				return local53;
			}
		} catch ( RuntimeException local97) {
			signlink.reporterror("62237, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
