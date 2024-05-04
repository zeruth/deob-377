package unmapped;


import jagex2.graphics.Draw2D;
import jagex2.graphics.Pix24;
import jagex2.io.JagFile;
import sign.signlink;

public final class Class17 {

	public static int anInt179;

	private static Class17[] aClass17Array1;

	private static int[] anIntArray52;

	private static int anInt185;

	private static Packet aClass10_Sub1_Sub3_1;

	public static Class34 aClass34_3 = new Class34(50, -572);

	public static boolean aBoolean49 = true;

	public static Class34 aClass34_4 = new Class34(100, -572);

	private static byte aByte13 = 6;

	private int anInt173;

	private int anInt174;

	public byte[] aByteArray8;

	public String aString7;

	private byte aByte12;

	private int anInt175;

	public int anInt176;

	private int anInt177;

	private int anInt178;

	public String[] aStringArray2;

	private int anInt180;

	private int anInt181;

	private int[] anIntArray51;

	public int anInt182;

	public int anInt183;

	public String[] aStringArray3;

	private int anInt186;

	public int anInt187;

	private int anInt188;

	public int anInt189;

	private int anInt190;

	public int anInt191;

	public int anInt192;

	private int anInt193;

	private int anInt194;

	private int anInt195;

	private int[] anIntArray53;

	private int[] anIntArray54;

	private int anInt197;

	private int anInt198;

	private int anInt199;

	public int anInt200;

	private int anInt201;

	public boolean aBoolean52;

	private int anInt202;

	private int anInt203;

	private int[] anIntArray55;

	public boolean aBoolean54;

	private byte aByte14;

	private boolean aBoolean50 = true;

	private int anInt184 = -68;

	public int anInt196 = -1;

	private boolean aBoolean53 = true;

	public static Class17 method104( int arg0) {
		for ( int local1 = 0; local1 < 10; local1++) {
			if (aClass17Array1[local1].anInt196 == arg0) {
				return aClass17Array1[local1];
			}
		}
		anInt185 = (anInt185 + 1) % 10;
		Class17 local27 = aClass17Array1[anInt185];
		aClass10_Sub1_Sub3_1.pos = anIntArray52[arg0];
		local27.anInt196 = arg0;
		local27.method115();
		local27.method110(aByte13, aClass10_Sub1_Sub3_1);
		if (local27.anInt182 != -1) {
			local27.method107();
		}
		if (!aBoolean49 && local27.aBoolean54) {
			local27.aString7 = "Members Object";
			local27.aByteArray8 = "Login to a members' server to use this object.".getBytes();
			local27.aStringArray2 = null;
			local27.aStringArray3 = null;
			local27.anInt176 = 0;
		}
		return local27;
	}

	public static void method106( JagFile arg0) {
		aClass10_Sub1_Sub3_1 = new Packet(arg0.read("obj.dat", null));
		Packet local19 = new Packet(arg0.read("obj.idx", null));
		anInt179 = local19.readShort();
		anIntArray52 = new int[anInt179];
		int local27 = 2;
		for ( int local29 = 0; local29 < anInt179; local29++) {
			anIntArray52[local29] = local27;
			local27 += local19.readShort();
		}
		aClass17Array1 = new Class17[10];
		for ( int local49 = 0; local49 < 10; local49++) {
			aClass17Array1[local49] = new Class17();
		}
	}

	public static Pix24 method113(int arg0, int arg1, int arg2) {
		try {
			Pix24 local9;
			if (arg0 == 0) {
				local9 = (Pix24) aClass34_4.method387((long) arg2);
				if (local9 != null && local9.cropH != arg1 && local9.cropH != -1) {
					local9.method534();
					local9 = null;
				}
				if (local9 != null) {
					return local9;
				}
			}
			Class17 local30 = method104(arg2);
			if (local30.anIntArray54 == null) {
				arg1 = -1;
			}
			if (arg1 > 1) {
				int local40 = -1;
				for ( int local42 = 0; local42 < 10; local42++) {
					if (arg1 >= local30.anIntArray55[local42] && local30.anIntArray55[local42] != 0) {
						local40 = local30.anIntArray54[local42];
					}
				}
				if (local40 != -1) {
					local30 = method104(local40);
				}
			}
			Class10_Sub1_Sub2_Sub4 local74 = local30.method112(1);
			if (local74 == null) {
				return null;
			}
			Pix24 local80 = null;
			if (local30.anInt182 != -1) {
				local80 = method113(-1, 10, local30.anInt177);
				if (local80 == null) {
					return null;
				}
			}
			local9 = new Pix24(32, 32);
			int local103 = Class10_Sub1_Sub1_Sub4.anInt686;
			int local105 = Class10_Sub1_Sub1_Sub4.anInt687;
			int[] local107 = Class10_Sub1_Sub1_Sub4.anIntArray183;
			int[] local109 = Draw2D.data;
			int local111 = Draw2D.width2d;
			int local113 = Draw2D.height2d;
			int local115 = Draw2D.left;
			int local117 = Draw2D.right;
			int local119 = Draw2D.top;
			int local121 = Draw2D.bottom;
			Class10_Sub1_Sub1_Sub4.aBoolean179 = false;
			Draw2D.bind(32, 32, local9.pixels);
			Draw2D.fillRect(32, 0, 0, 32, 0);
			Class10_Sub1_Sub1_Sub4.method507(568);
			int local141 = local30.anInt200;
			if (arg0 == -1) {
				local141 = (int) ((double) local141 * 1.5D);
			}
			if (arg0 > 0) {
				local141 = (int) ((double) local141 * 1.04D);
			}
			int local167 = Class10_Sub1_Sub1_Sub4.anIntArray181[local30.anInt192] * local141 >> 16;
			int local176 = Class10_Sub1_Sub1_Sub4.anIntArray182[local30.anInt192] * local141 >> 16;
			local74.method292(local30.anInt189, local30.anInt180, local30.anInt192, local30.anInt174, local167 + local74.anInt713 / 2 + local30.anInt181, local176 + local30.anInt181);
			for ( int local202 = 31; local202 >= 0; local202--) {
				for (local176 = 31; local176 >= 0; local176--) {
					if (local9.pixels[local202 + local176 * 32] == 0) {
						if (local202 > 0 && local9.pixels[local202 + local176 * 32 - 1] > 1) {
							local9.pixels[local202 + local176 * 32] = 1;
						} else if (local176 > 0 && local9.pixels[local202 + (local176 - 1) * 32] > 1) {
							local9.pixels[local202 + local176 * 32] = 1;
						} else if (local202 < 31 && local9.pixels[local202 + local176 * 32 + 1] > 1) {
							local9.pixels[local202 + local176 * 32] = 1;
						} else if (local176 < 31 && local9.pixels[local202 + (local176 + 1) * 32] > 1) {
							local9.pixels[local202 + local176 * 32] = 1;
						}
					}
				}
			}
			int local327;
			if (arg0 > 0) {
				for (local327 = 31; local327 >= 0; local327--) {
					for (local176 = 31; local176 >= 0; local176--) {
						if (local9.pixels[local327 + local176 * 32] == 0) {
							if (local327 > 0 && local9.pixels[local327 + local176 * 32 - 1] == 1) {
								local9.pixels[local327 + local176 * 32] = arg0;
							} else if (local176 > 0 && local9.pixels[local327 + (local176 - 1) * 32] == 1) {
								local9.pixels[local327 + local176 * 32] = arg0;
							} else if (local327 < 31 && local9.pixels[local327 + local176 * 32 + 1] == 1) {
								local9.pixels[local327 + local176 * 32] = arg0;
							} else if (local176 < 31 && local9.pixels[local327 + (local176 + 1) * 32] == 1) {
								local9.pixels[local327 + local176 * 32] = arg0;
							}
						}
					}
				}
			} else if (arg0 == 0) {
				for (local327 = 31; local327 >= 0; local327--) {
					for (local176 = 31; local176 >= 0; local176--) {
						if (local9.pixels[local327 + local176 * 32] == 0 && local327 > 0 && local176 > 0 && local9.pixels[local327 + (local176 - 1) * 32 - 1] > 0) {
							local9.pixels[local327 + local176 * 32] = 3153952;
						}
					}
				}
			}
			if (local30.anInt182 != -1) {
				local327 = local80.cropW;
				int local511 = local80.cropH;
				local80.cropW = 32;
				local80.cropH = 32;
				local80.method78(0, 0);
				local80.cropW = local327;
				local80.cropH = local511;
			}
			if (arg0 == 0) {
				aClass34_4.method388(local9, (long) arg2);
			}
			Draw2D.bind(local111, local113, local109);
			Draw2D.setBounds(local119, local115, local121, local117);
			Class10_Sub1_Sub1_Sub4.anInt686 = local103;
			Class10_Sub1_Sub1_Sub4.anInt687 = local105;
			Class10_Sub1_Sub1_Sub4.anIntArray183 = local107;
			Class10_Sub1_Sub1_Sub4.aBoolean179 = true;
			if (local30.aBoolean52) {
				local9.cropW = 33;
			} else {
				local9.cropW = 32;
			}
			local9.cropH = arg1;
			return local9;
		} catch ( RuntimeException local579) {
			signlink.reporterror("35244, " + -33 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local579.toString());
			throw new RuntimeException();
		}
	}

	public static void method114() {
		try {
			aClass34_3 = null;
			aClass34_4 = null;
			anIntArray52 = null;
			aClass17Array1 = null;
			aClass10_Sub1_Sub3_1 = null;
		} catch ( RuntimeException local20) {
			signlink.reporterror("88176, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	private Class17() {
	}

	public boolean method103( int arg0) {
		try {
			int local2 = this.anInt178;
			int local5 = this.anInt194;
			if (arg0 == 1) {
				local2 = this.anInt203;
				local5 = this.anInt195;
			}
			if (local2 == -1) {
				return true;
			}
			boolean local31 = true;
			if (!Class10_Sub1_Sub2_Sub4.method272(local2)) {
				local31 = false;
			}
			if (local5 != -1 && !Class10_Sub1_Sub2_Sub4.method272(local5)) {
				local31 = false;
			}
			return local31;
		} catch ( RuntimeException local47) {
			signlink.reporterror("74997, " + arg0 + ", " + 0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4 method105( int arg0) {
		try {
			int local4 = this.anInt186;
			int local7 = this.anInt175;
			int local10 = this.anInt201;
			if (arg0 == 1) {
				local4 = this.anInt173;
				local7 = this.anInt188;
				local10 = this.anInt198;
			}
			if (local4 == -1) {
				return null;
			}
			Class10_Sub1_Sub2_Sub4 local30 = Class10_Sub1_Sub2_Sub4.method271(local4);
			if (local7 != -1) {
				Class10_Sub1_Sub2_Sub4 local46;
				if (local10 == -1) {
					local46 = Class10_Sub1_Sub2_Sub4.method271(local7);
					Class10_Sub1_Sub2_Sub4[] local87 = new Class10_Sub1_Sub2_Sub4[] { local30, local46 };
					local30 = new Class10_Sub1_Sub2_Sub4(2, local87, (byte) -89);
				} else {
					local46 = Class10_Sub1_Sub2_Sub4.method271(local7);
					Class10_Sub1_Sub2_Sub4 local49 = Class10_Sub1_Sub2_Sub4.method271(local10);
					Class10_Sub1_Sub2_Sub4[] local64 = new Class10_Sub1_Sub2_Sub4[] { local30, local46, local49 };
					local30 = new Class10_Sub1_Sub2_Sub4(3, local64, (byte) -89);
				}
			}
			if (arg0 == 0 && this.aByte14 != 0) {
				local30.method284(0, 0, this.aByte14);
			}
			if (arg0 == 1 && this.aByte12 != 0) {
				local30.method284(0, 0, this.aByte12);
			}
			if (this.anIntArray53 != null) {
				for ( int local124 = 0; local124 < this.anIntArray53.length; local124++) {
					local30.method285(this.anIntArray53[local124], this.anIntArray51[local124]);
				}
			}
			return local30;
		} catch ( RuntimeException local145) {
			signlink.reporterror("77749, " + -98 + ", " + arg0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	private void method107() {
		try {
			Class17 local3 = method104(this.anInt182);
			this.anInt193 = local3.anInt193;
			this.anInt200 = local3.anInt200;
			this.anInt192 = local3.anInt192;
			this.anInt189 = local3.anInt189;
			this.anInt180 = local3.anInt180;
			this.anInt174 = local3.anInt174;
			this.anInt181 = local3.anInt181;
			this.anIntArray53 = local3.anIntArray53;
			this.anIntArray51 = local3.anIntArray51;
			Class17 local52 = method104(this.anInt177);
			this.aString7 = local52.aString7;
			this.aBoolean54 = local52.aBoolean54;
			this.anInt183 = local52.anInt183;
			String local66 = "a";
			char local71 = local52.aString7.charAt(0);
			if (local71 == 'A' || local71 == 'E' || local71 == 'I' || local71 == 'O' || local71 == 'U') {
				local66 = "an";
			}
			this.aByteArray8 = ("Swap this note at any bank for " + local66 + " " + local52.aString7 + ".").getBytes();
			this.aBoolean52 = true;
		} catch ( RuntimeException local110) {
			signlink.reporterror("89722, " + 0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	public boolean method108( int arg0) {
		try {
			int local12 = this.anInt186;
			int local15 = this.anInt175;
			int local18 = this.anInt201;
			if (arg0 == 1) {
				local12 = this.anInt173;
				local15 = this.anInt188;
				local18 = this.anInt198;
			}
			if (local12 == -1) {
				return true;
			}
			boolean local37 = true;
			if (!Class10_Sub1_Sub2_Sub4.method272(local12)) {
				local37 = false;
			}
			if (local15 != -1 && !Class10_Sub1_Sub2_Sub4.method272(local15)) {
				local37 = false;
			}
			if (local18 != -1 && !Class10_Sub1_Sub2_Sub4.method272(local18)) {
				local37 = false;
			}
			return local37;
		} catch ( RuntimeException local61) {
			signlink.reporterror("76416, " + -861 + ", " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4 method109( int arg0, int arg1) {
		try {
			int local11;
			if (this.anIntArray54 != null && arg1 > 1) {
				int local9 = -1;
				for (local11 = 0; local11 < 10; local11++) {
					if (arg1 >= this.anIntArray55[local11] && this.anIntArray55[local11] != 0) {
						local9 = this.anIntArray54[local11];
					}
				}
				if (local9 != -1) {
					return method104(local9).method109(this.anInt184, 1);
				}
			}
			Class10_Sub1_Sub2_Sub4 local47 = Class10_Sub1_Sub2_Sub4.method271(this.anInt193);
			while (arg0 >= 0) {
				this.aBoolean50 = !this.aBoolean50;
			}
			if (local47 == null) {
				return null;
			}
			if (this.anIntArray53 != null) {
				for (local11 = 0; local11 < this.anIntArray53.length; local11++) {
					local47.method285(this.anIntArray53[local11], this.anIntArray51[local11]);
				}
			}
			return local47;
		} catch ( RuntimeException local89) {
			signlink.reporterror("904, " + arg0 + ", " + arg1 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	private void method110( byte arg0, Packet arg1) {
		try {
			if (arg0 != 6) {
				this.aBoolean50 = !this.aBoolean50;
			}
			while (true) {
				while (true) {
					int local15 = arg1.readByte();
					if (local15 == 0) {
						return;
					}
					if (local15 == 1) {
						this.anInt193 = arg1.readShort();
					} else if (local15 == 2) {
						this.aString7 = arg1.method318();
					} else if (local15 == 3) {
						this.aByteArray8 = arg1.method319();
					} else if (local15 == 4) {
						this.anInt200 = arg1.readShort();
					} else if (local15 == 5) {
						this.anInt192 = arg1.readShort();
					} else if (local15 == 6) {
						this.anInt189 = arg1.readShort();
					} else if (local15 == 7) {
						this.anInt174 = arg1.readShort();
						if (this.anInt174 > 32767) {
							this.anInt174 -= 65536;
						}
					} else if (local15 == 8) {
						this.anInt181 = arg1.readShort();
						if (this.anInt181 > 32767) {
							this.anInt181 -= 65536;
						}
					} else if (local15 == 10) {
						this.anInt202 = arg1.readShort();
					} else if (local15 == 11) {
						this.aBoolean52 = true;
					} else if (local15 == 12) {
						this.anInt183 = arg1.method316();
					} else if (local15 == 16) {
						this.aBoolean54 = true;
					} else if (local15 == 23) {
						this.anInt186 = arg1.readShort();
						this.aByte14 = arg1.method312();
					} else if (local15 == 24) {
						this.anInt175 = arg1.readShort();
					} else if (local15 == 25) {
						this.anInt173 = arg1.readShort();
						this.aByte12 = arg1.method312();
					} else if (local15 == 26) {
						this.anInt188 = arg1.readShort();
					} else if (local15 >= 30 && local15 < 35) {
						if (this.aStringArray2 == null) {
							this.aStringArray2 = new String[5];
						}
						this.aStringArray2[local15 - 30] = arg1.method318();
						if (this.aStringArray2[local15 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray2[local15 - 30] = null;
						}
					} else if (local15 >= 35 && local15 < 40) {
						if (this.aStringArray3 == null) {
							this.aStringArray3 = new String[5];
						}
						this.aStringArray3[local15 - 35] = arg1.method318();
					} else if (local15 == 40) {
						int local257 = arg1.readByte();
						this.anIntArray53 = new int[local257];
						this.anIntArray51 = new int[local257];
						for ( int local267 = 0; local267 < local257; local267++) {
							this.anIntArray53[local267] = arg1.readShort();
							this.anIntArray51[local267] = arg1.readShort();
						}
					} else if (local15 == 78) {
						this.anInt201 = arg1.readShort();
					} else if (local15 == 79) {
						this.anInt198 = arg1.readShort();
					} else if (local15 == 90) {
						this.anInt178 = arg1.readShort();
					} else if (local15 == 91) {
						this.anInt203 = arg1.readShort();
					} else if (local15 == 92) {
						this.anInt194 = arg1.readShort();
					} else if (local15 == 93) {
						this.anInt195 = arg1.readShort();
					} else if (local15 == 95) {
						this.anInt180 = arg1.readShort();
					} else if (local15 == 97) {
						this.anInt177 = arg1.readShort();
					} else if (local15 == 98) {
						this.anInt182 = arg1.readShort();
					} else if (local15 >= 100 && local15 < 110) {
						if (this.anIntArray54 == null) {
							this.anIntArray54 = new int[10];
							this.anIntArray55 = new int[10];
						}
						this.anIntArray54[local15 - 100] = arg1.readShort();
						this.anIntArray55[local15 - 100] = arg1.readShort();
					} else if (local15 == 110) {
						this.anInt197 = arg1.readShort();
					} else if (local15 == 111) {
						this.anInt190 = arg1.readShort();
					} else if (local15 == 112) {
						this.anInt199 = arg1.readShort();
					} else if (local15 == 113) {
						this.anInt187 = arg1.method312();
					} else if (local15 == 114) {
						this.anInt191 = arg1.method312() * 5;
					} else if (local15 == 115) {
						this.anInt176 = arg1.readByte();
					}
				}
			}
		} catch ( RuntimeException local459) {
			signlink.reporterror("35544, " + arg0 + ", " + arg1 + ", " + local459.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4 method111( int arg0) {
		try {
			int local12 = this.anInt178;
			int local15 = this.anInt194;
			if (arg0 == 1) {
				local12 = this.anInt203;
				local15 = this.anInt195;
			}
			if (local12 == -1) {
				return null;
			}
			Class10_Sub1_Sub2_Sub4 local32 = Class10_Sub1_Sub2_Sub4.method271(local12);
			if (local15 != -1) {
				Class10_Sub1_Sub2_Sub4 local38 = Class10_Sub1_Sub2_Sub4.method271(local15);
				Class10_Sub1_Sub2_Sub4[] local49 = new Class10_Sub1_Sub2_Sub4[] { local32, local38 };
				local32 = new Class10_Sub1_Sub2_Sub4(2, local49, (byte) -89);
			}
			if (this.anIntArray53 != null) {
				for ( int local61 = 0; local61 < this.anIntArray53.length; local61++) {
					local32.method285(this.anIntArray53[local61], this.anIntArray51[local61]);
				}
			}
			return local32;
		} catch ( RuntimeException local82) {
			signlink.reporterror("83619, " + true + ", " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4 method112( int arg0) {
		int local11;
		if (this.anIntArray54 != null && arg0 > 1) {
			int local9 = -1;
			for (local11 = 0; local11 < 10; local11++) {
				if (arg0 >= this.anIntArray55[local11] && this.anIntArray55[local11] != 0) {
					local9 = this.anIntArray54[local11];
				}
			}
			if (local9 != -1) {
				return method104(local9).method112(1);
			}
		}
		Class10_Sub1_Sub2_Sub4 local48 = (Class10_Sub1_Sub2_Sub4) aClass34_3.method387((long) this.anInt196);
		if (local48 != null) {
			return local48;
		}
		local48 = Class10_Sub1_Sub2_Sub4.method271(this.anInt193);
		if (local48 == null) {
			return null;
		}
		if (this.anInt197 != 128 || this.anInt190 != 128 || this.anInt199 != 128) {
			local48.method287(this.anInt190, this.anInt199, this.anInt197);
		}
		if (this.anIntArray53 != null) {
			for (local11 = 0; local11 < this.anIntArray53.length; local11++) {
				local48.method285(this.anIntArray53[local11], this.anIntArray51[local11]);
			}
		}
		local48.method288(this.anInt187 + 64, this.anInt191 + 768, -50, -10, -50, true);
		local48.aBoolean106 = true;
		aClass34_3.method388(local48, (long) this.anInt196);
		return local48;
	}

	private void method115() {
		this.anInt193 = 0;
		this.aString7 = null;
		this.aByteArray8 = null;
		this.anIntArray53 = null;
		this.anIntArray51 = null;
		this.anInt200 = 2000;
		this.anInt192 = 0;
		this.anInt189 = 0;
		this.anInt180 = 0;
		this.anInt174 = 0;
		this.anInt181 = 0;
		this.anInt202 = -1;
		this.aBoolean52 = false;
		this.anInt183 = 1;
		this.aBoolean54 = false;
		this.aStringArray2 = null;
		this.aStringArray3 = null;
		this.anInt186 = -1;
		this.anInt175 = -1;
		this.aByte14 = 0;
		this.anInt173 = -1;
		this.anInt188 = -1;
		this.aByte12 = 0;
		this.anInt201 = -1;
		this.anInt198 = -1;
		this.anInt178 = -1;
		this.anInt194 = -1;
		this.anInt203 = -1;
		this.anInt195 = -1;
		this.anIntArray54 = null;
		this.anIntArray55 = null;
		this.anInt177 = -1;
		this.anInt182 = -1;
		this.anInt197 = 128;
		this.anInt190 = 128;
		this.anInt199 = 128;
		this.anInt187 = 0;
		this.anInt191 = 0;
		this.anInt176 = 0;
	}
}
