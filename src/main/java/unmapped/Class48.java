package unmapped;


import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import sign.signlink;

public final class Class48 {

	private static int[] anIntArray187;

	private static Packet aClass10_Sub1_Sub3_5;

	public static Client aClient4;

	public static boolean aBoolean183;

	private static int anInt698;

	private static Class48[] aClass48Array1;

	private static int anInt711;

	public static LruCache aClass34_7 = new LruCache(40);

	private static Model[] aClass10_Sub1_Sub2_Sub4Array1 = new Model[4];

	public static LruCache aClass34_8 = new LruCache(500);

	private static byte aByte41 = 6;

	public boolean aBoolean180;

	private int anInt691;

	private int anInt692;

	private int[] anIntArray188;

	public int anInt693;

	public boolean aBoolean181;

	private int anInt694;

	public boolean aBoolean182;

	public int anInt697;

	public int anInt699;

	private int anInt700;

	public int anInt701;

	public byte[] aByteArray17;

	private byte aByte38;

	private int anInt702;

	private byte aByte39;

	private int anInt703;

	private int[] anIntArray189;

	public String[] aStringArray7;

	private boolean aBoolean186;

	private int[] anIntArray190;

	private int anInt704;

	public int anInt705;

	private int anInt706;

	public boolean aBoolean187;

	private boolean aBoolean188;

	private int[] anIntArray191;

	public int anInt707;

	public int anInt708;

	public int anInt709;

	private boolean aBoolean189;

	public int[] anIntArray192;

	public int anInt710;

	public boolean aBoolean190;

	public boolean aBoolean191;

	public boolean aBoolean192;

	private int anInt695 = -992;

	public int anInt696 = -1;

	private boolean aBoolean184 = true;

	public String aString12 = "null";

	private boolean aBoolean185 = true;

	private byte aByte40 = -113;

	public static Class48 method523( int arg0) {
		for ( int local1 = 0; local1 < 20; local1++) {
			if (aClass48Array1[local1].anInt696 == arg0) {
				return aClass48Array1[local1];
			}
		}
		anInt698 = (anInt698 + 1) % 20;
		Class48 local27 = aClass48Array1[anInt698];
		aClass10_Sub1_Sub3_5.pos = anIntArray187[arg0];
		local27.anInt696 = arg0;
		local27.method529();
		local27.method530(aByte41, aClass10_Sub1_Sub3_5);
		return local27;
	}

	public static void method526( JagFile arg0) {
		aClass10_Sub1_Sub3_5 = new Packet(arg0.read("loc.dat", null));
		Packet local19 = new Packet(arg0.read("loc.idx", null));
		anInt711 = local19.g2();
		anIntArray187 = new int[anInt711];
		int local27 = 2;
		for ( int local29 = 0; local29 < anInt711; local29++) {
			anIntArray187[local29] = local27;
			local27 += local19.g2();
		}
		aClass48Array1 = new Class48[20];
		for ( int local49 = 0; local49 < 20; local49++) {
			aClass48Array1[local49] = new Class48();
		}
	}

	public static void method533() {
		try {
			aClass34_8 = null;
			aClass34_7 = null;
			anIntArray187 = null;
			aClass48Array1 = null;
			aClass10_Sub1_Sub3_5 = null;
		} catch ( RuntimeException local20) {
			signlink.reporterror("85703, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	private Class48() {
	}

	public Class48 method524() {
		try {
			int local6 = -1;
			if (this.anInt699 != -1) {
				Class50 local15 = Class50.aClass50Array1[this.anInt699];
				int local18 = local15.anInt800;
				int local21 = local15.anInt801;
				int local24 = local15.anInt802;
				int local30 = Client.anIntArray262[local24 - local21];
				local6 = aClient4.anIntArray244[local18] >> local21 & local30;
			} else if (this.anInt701 != -1) {
				local6 = aClient4.anIntArray244[this.anInt701];
			}
			return local6 < 0 || local6 >= this.anIntArray192.length || this.anIntArray192[local6] == -1 ? null : method523(this.anIntArray192[local6]);
		} catch ( RuntimeException local73) {
			signlink.reporterror("81180, " + 0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	public void method525( Class33_Sub1 arg0) {
		try {
			if (this.anIntArray188 != null) {
				for ( int local7 = 0; local7 < this.anIntArray188.length; local7++) {
					arg0.method566(this.anIntArray188[local7] & 0xFFFF, 0, this.aByte40);
				}
			}
		} catch ( RuntimeException local37) {
			signlink.reporterror("14059, " + arg0 + ", " + -747 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	private Model method527(int arg0, int arg1, int arg2) {
		try {
			Model local3 = null;
			long local26;
			boolean local50;
			int local56;
			Model local169;
			if (this.anIntArray189 == null) {
				if (arg2 != 10) {
					return null;
				}
				local26 = (long) ((this.anInt696 << 6) + arg0) + ((long) (arg1 + 1) << 32);
				Model local31 = (Model) aClass34_7.get(local26);
				if (local31 != null) {
					return local31;
				}
				if (this.anIntArray188 == null) {
					return null;
				}
				local50 = this.aBoolean188 ^ arg0 > 3;
				int local54 = this.anIntArray188.length;
				for (local56 = 0; local56 < local54; local56++) {
					int local62 = this.anIntArray188[local56];
					if (local50) {
						local62 += 65536;
					}
					local3 = (Model) aClass34_8.get((long) local62);
					if (local3 == null) {
						local3 = Model.createModel(local62 & 0xFFFF);
						if (local3 == null) {
							return null;
						}
						if (local50) {
							local3.method286();
						}
						aClass34_8.put(local3, (long) local62);
					}
					if (local54 > 1) {
						aClass10_Sub1_Sub2_Sub4Array1[local56] = local3;
					}
				}
				if (local54 > 1) {
					local3 = new Model(local54, aClass10_Sub1_Sub2_Sub4Array1);
				}
			} else {
				int local120 = -1;
				for ( int local122 = 0; local122 < this.anIntArray189.length; local122++) {
					if (this.anIntArray189[local122] == arg2) {
						local120 = local122;
						break;
					}
				}
				if (local120 == -1) {
					return null;
				}
				local26 = (long) ((this.anInt696 << 6) + (local120 << 3) + arg0) + ((long) (arg1 + 1) << 32);
				local169 = (Model) aClass34_7.get(local26);
				if (local169 != null) {
					return local169;
				}
				local56 = this.anIntArray188[local120];
				boolean local188 = this.aBoolean188 ^ arg0 > 3;
				if (local188) {
					local56 += 65536;
				}
				local3 = (Model) aClass34_8.get((long) local56);
				if (local3 == null) {
					local3 = Model.createModel(local56 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local188) {
						local3.method286();
					}
					aClass34_8.put(local3, (long) local56);
				}
			}
			boolean local236;
			if (this.anInt700 == 128 && this.anInt691 == 128 && this.anInt706 == 128) {
				local236 = false;
			} else {
				local236 = true;
			}
			if (this.anInt692 == 0 && this.anInt702 == 0 && this.anInt694 == 0) {
				local50 = false;
			} else {
				local50 = true;
			}
			local169 = new Model(arg0 == 0 && arg1 == -1 && !local236 && !local50, false, this.anIntArray191 == null, local3, Class22.method169(this.aBoolean184, arg1));
			if (arg1 != -1) {
				local169.method278();
				local169.method279(arg1, (byte) 6);
				local169.anIntArrayArray11 = null;
				local169.anIntArrayArray10 = null;
			}
			while (arg0-- > 0) {
				local169.method282();
			}
			if (this.anIntArray191 != null) {
				for (local56 = 0; local56 < this.anIntArray191.length; local56++) {
					local169.recolor(this.anIntArray191[local56], this.anIntArray190[local56]);
				}
			}
			if (local236) {
				local169.method287(this.anInt691, this.anInt706, this.anInt700);
			}
			if (local50) {
				local169.method284(this.anInt692, this.anInt694, this.anInt702);
			}
			local169.method288(this.aByte38 + 64, this.aByte39 * 5 + 768, -50, -10, -50, !this.aBoolean189);
			if (this.anInt704 == 1) {
				local169.anInt413 = local169.anInt713;
			}
			aClass34_7.put(local169, local26);
			return local169;
		} catch ( RuntimeException local394) {
			signlink.reporterror("99261, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local394.toString());
			throw new RuntimeException();
		}
	}

	public boolean method528() {
		try {
			if (this.anIntArray188 == null) {
				return true;
			}
			boolean local8 = true;
			for ( int local17 = 0; local17 < this.anIntArray188.length; local17++) {
				local8 &= Model.method272(this.anIntArray188[local17] & 0xFFFF);
			}
			return local8;
		} catch ( RuntimeException local38) {
			signlink.reporterror("7444, " + -321 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	private void method529() {
		this.anIntArray188 = null;
		this.anIntArray189 = null;
		this.aString12 = "null";
		this.aByteArray17 = null;
		this.anIntArray191 = null;
		this.anIntArray190 = null;
		this.anInt707 = 1;
		this.anInt697 = 1;
		this.aBoolean192 = true;
		this.aBoolean191 = true;
		this.aBoolean180 = false;
		this.aBoolean182 = false;
		this.aBoolean189 = false;
		this.aBoolean187 = false;
		this.anInt709 = -1;
		this.anInt708 = 16;
		this.aByte38 = 0;
		this.aByte39 = 0;
		this.aStringArray7 = null;
		this.anInt710 = -1;
		this.anInt705 = -1;
		this.aBoolean188 = false;
		this.aBoolean190 = true;
		this.anInt700 = 128;
		this.anInt691 = 128;
		this.anInt706 = 128;
		this.anInt693 = 0;
		this.anInt692 = 0;
		this.anInt702 = 0;
		this.anInt694 = 0;
		this.aBoolean181 = false;
		this.aBoolean186 = false;
		this.anInt704 = -1;
		this.anInt699 = -1;
		this.anInt701 = -1;
		this.anIntArray192 = null;
	}

	private void method530( byte arg0, Packet arg1) {
		try {
			int local3 = -1;
			if (arg0 != 6) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					int local21;
					int local38;
					do {
						while (true) {
							int local13 = arg1.g1();
							if (local13 == 0) {
								if (local3 == -1) {
									this.aBoolean180 = false;
									if (this.anIntArray188 != null && (this.anIntArray189 == null || this.anIntArray189[0] == 10)) {
										this.aBoolean180 = true;
									}
									if (this.aStringArray7 != null) {
										this.aBoolean180 = true;
									}
								}
								if (this.aBoolean186) {
									this.aBoolean192 = false;
									this.aBoolean191 = false;
								}
								if (this.anInt704 == -1) {
									this.anInt704 = this.aBoolean192 ? 1 : 0;
									return;
								}
								return;
							}
							if (local13 == 1) {
								local21 = arg1.g1();
								break;
							}
							if (local13 == 2) {
								this.aString12 = arg1.gjstr();
							} else if (local13 == 3) {
								this.aByteArray17 = arg1.gstrbyte();
							} else if (local13 == 5) {
								local21 = arg1.g1();
								if (local21 > 0) {
									if (this.anIntArray188 == null || aBoolean183) {
										this.anIntArray189 = null;
										this.anIntArray188 = new int[local21];
										for (local38 = 0; local38 < local21; local38++) {
											this.anIntArray188[local38] = arg1.g2();
										}
									} else {
										arg1.pos += local21 * 2;
									}
								}
							} else if (local13 == 14) {
								this.anInt707 = arg1.g1();
							} else if (local13 == 15) {
								this.anInt697 = arg1.g1();
							} else if (local13 == 17) {
								this.aBoolean192 = false;
							} else if (local13 == 18) {
								this.aBoolean191 = false;
							} else if (local13 == 19) {
								local3 = arg1.g1();
								if (local3 == 1) {
									this.aBoolean180 = true;
								}
							} else if (local13 == 21) {
								this.aBoolean182 = true;
							} else if (local13 == 22) {
								this.aBoolean189 = true;
							} else if (local13 == 23) {
								this.aBoolean187 = true;
							} else if (local13 == 24) {
								this.anInt709 = arg1.g2();
								if (this.anInt709 == 65535) {
									this.anInt709 = -1;
								}
							} else if (local13 == 28) {
								this.anInt708 = arg1.g1();
							} else if (local13 == 29) {
								this.aByte38 = arg1.g1b();
							} else if (local13 == 39) {
								this.aByte39 = arg1.g1b();
							} else if (local13 >= 30 && local13 < 39) {
								if (this.aStringArray7 == null) {
									this.aStringArray7 = new String[5];
								}
								this.aStringArray7[local13 - 30] = arg1.gjstr();
								if (this.aStringArray7[local13 - 30].equalsIgnoreCase("hidden")) {
									this.aStringArray7[local13 - 30] = null;
								}
							} else if (local13 == 40) {
								local21 = arg1.g1();
								this.anIntArray191 = new int[local21];
								this.anIntArray190 = new int[local21];
								for (local38 = 0; local38 < local21; local38++) {
									this.anIntArray191[local38] = arg1.g2();
									this.anIntArray190[local38] = arg1.g2();
								}
							} else if (local13 == 60) {
								this.anInt710 = arg1.g2();
							} else if (local13 == 62) {
								this.aBoolean188 = true;
							} else if (local13 == 64) {
								this.aBoolean190 = false;
							} else if (local13 == 65) {
								this.anInt700 = arg1.g2();
							} else if (local13 == 66) {
								this.anInt691 = arg1.g2();
							} else if (local13 == 67) {
								this.anInt706 = arg1.g2();
							} else if (local13 == 68) {
								this.anInt705 = arg1.g2();
							} else if (local13 == 69) {
								this.anInt693 = arg1.g1();
							} else if (local13 == 70) {
								this.anInt692 = arg1.g2b();
							} else if (local13 == 71) {
								this.anInt702 = arg1.g2b();
							} else if (local13 == 72) {
								this.anInt694 = arg1.g2b();
							} else if (local13 == 73) {
								this.aBoolean181 = true;
							} else if (local13 == 74) {
								this.aBoolean186 = true;
							} else if (local13 == 75) {
								this.anInt704 = arg1.g1();
							} else if (local13 == 77) {
								this.anInt699 = arg1.g2();
								if (this.anInt699 == 65535) {
									this.anInt699 = -1;
								}
								this.anInt701 = arg1.g2();
								if (this.anInt701 == 65535) {
									this.anInt701 = -1;
								}
								local21 = arg1.g1();
								this.anIntArray192 = new int[local21 + 1];
								for (local38 = 0; local38 <= local21; local38++) {
									this.anIntArray192[local38] = arg1.g2();
									if (this.anIntArray192[local38] == 65535) {
										this.anIntArray192[local38] = -1;
									}
								}
							}
						}
					} while (local21 <= 0);
					if (this.anIntArray188 == null || aBoolean183) {
						this.anIntArray189 = new int[local21];
						this.anIntArray188 = new int[local21];
						for (local38 = 0; local38 < local21; local38++) {
							this.anIntArray188[local38] = arg1.g2();
							this.anIntArray189[local38] = arg1.g1();
						}
					} else {
						arg1.pos += local21 * 3;
					}
				}
			}
		} catch ( RuntimeException local556) {
			signlink.reporterror("25322, " + arg0 + ", " + arg1 + ", " + local556.toString());
			throw new RuntimeException();
		}
	}

	public Model method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		Model local6 = this.method527(arg1, arg6, arg0);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean182 || this.aBoolean189) {
			local6 = new Model(this.aBoolean182, this.aBoolean189, 0, local6);
		}
		if (this.aBoolean182) {
			int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for ( int local41 = 0; local41 < local6.anInt402; local41++) {
				int local48 = local6.anIntArray113[local41];
				int local53 = local6.anIntArray115[local41];
				int local65 = arg2 + (arg3 - arg2) * (local48 + 64) / 128;
				int local77 = arg5 + (arg4 - arg5) * (local48 + 64) / 128;
				int local89 = local65 + (local77 - local65) * (local53 + 64) / 128;
				local6.anIntArray114[local41] += local89 - local39;
			}
			local6.method276();
		}
		return local6;
	}

	public boolean method532( int arg0) {
		try {
			if (this.anIntArray189 != null) {
				for ( int local51 = 0; local51 < this.anIntArray189.length; local51++) {
					if (this.anIntArray189[local51] == arg0) {
						return Model.method272(this.anIntArray188[local51] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray188 == null) {
				return true;
			} else if (arg0 == 10) {
				boolean local27 = true;
				for ( int local29 = 0; local29 < this.anIntArray188.length; local29++) {
					local27 &= Model.method272(this.anIntArray188[local29] & 0xFFFF);
				}
				return local27;
			} else {
				return true;
			}
		} catch ( RuntimeException local76) {
			signlink.reporterror("84531, " + 26261 + ", " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
