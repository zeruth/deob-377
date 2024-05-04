



import sign.signlink;

public final class Class10_Sub1_Sub2_Sub3_Sub2 extends Class10_Sub1_Sub2_Sub3 {

	public static Class34 aClass34_9 = new Class34(260, -572);

	public int anInt762;

	public int anInt763;

	public int anInt764;

	public Class10_Sub1_Sub2_Sub4 aClass10_Sub1_Sub2_Sub4_2;

	public int anInt766;

	public String aString14;

	public int anInt767;

	private long aLong25;

	private int anInt768;

	public Class38 aClass38_2;

	public int anInt770;

	public int anInt771;

	public int anInt772;

	public int anInt773;

	public int anInt774;

	public int anInt775;

	public int anInt776;

	public int anInt777;

	private boolean aBoolean197 = false;

	public int anInt765 = -1;

	private long aLong24 = -1L;

	public int[] anIntArray198 = new int[12];

	public int anInt769 = -1;

	public boolean aBoolean198 = false;

	public int[] anIntArray199 = new int[5];

	private boolean aBoolean199 = true;

	public boolean aBoolean200 = false;

	private boolean aBoolean201 = false;

	private int anInt778 = 932;

	public Class10_Sub1_Sub2_Sub4 method543() {
		try {
			if (!this.aBoolean198) {
				return null;
			} else if (this.aClass38_2 == null) {
				boolean local16 = false;
				for ( int local18 = 0; local18 < 12; local18++) {
					int local25 = this.anIntArray198[local18];
					if (local25 >= 256 && local25 < 512 && !Class49.aClass49Array1[local25 - 256].method550()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class17.method104(local25 - 512).method103(this.anInt768)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				Class10_Sub1_Sub2_Sub4[] local66 = new Class10_Sub1_Sub2_Sub4[12];
				int local68 = 0;
				for ( int local70 = 0; local70 < 12; local70++) {
					int local77 = this.anIntArray198[local70];
					Class10_Sub1_Sub2_Sub4 local92;
					if (local77 >= 256 && local77 < 512) {
						local92 = Class49.aClass49Array1[local77 - 256].method551(this.aBoolean197);
						if (local92 != null) {
							local66[local68++] = local92;
						}
					}
					if (local77 >= 512) {
						local92 = Class17.method104(local77 - 512).method111(this.anInt768);
						if (local92 != null) {
							local66[local68++] = local92;
						}
					}
				}
				Class10_Sub1_Sub2_Sub4 local129 = new Class10_Sub1_Sub2_Sub4(local68, local66, (byte) -89);
				for ( int local137 = 0; local137 < 5; local137++) {
					if (this.anIntArray199[local137] != 0) {
						local129.method285(Client.anIntArrayArray24[local137][0], Client.anIntArrayArray24[local137][this.anIntArray199[local137]]);
						if (local137 == 1) {
							local129.method285(Client.anIntArray266[0], Client.anIntArray266[this.anIntArray199[local137]]);
						}
					}
				}
				return local129;
			} else {
				return this.aClass38_2.method402();
			}
		} catch ( RuntimeException local180) {
			signlink.reporterror("51603, " + true + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	private Class10_Sub1_Sub2_Sub4 method544() {
		try {
			if (this.aClass38_2 != null) {
				int local6 = -1;
				if (super.anInt753 >= 0 && super.anInt756 == 0) {
					local6 = Class15.aClass15Array1[super.anInt753].anIntArray47[super.anInt754];
				} else if (super.anInt719 >= 0) {
					local6 = Class15.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
				}
				return this.aClass38_2.method405(local6, -1, null);
			}
			long local48 = this.aLong25;
			int local50 = -1;
			int local52 = -1;
			int local54 = -1;
			int local56 = -1;
			if (super.anInt753 >= 0 && super.anInt756 == 0) {
				Class15 local78 = Class15.aClass15Array1[super.anInt753];
				local50 = local78.anIntArray47[super.anInt754];
				if (super.anInt719 >= 0 && super.anInt719 != super.anInt760) {
					local52 = Class15.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
				}
				if (local78.anInt155 >= 0) {
					local54 = local78.anInt155;
					local48 += local54 - this.anIntArray198[5] << 8;
				}
				if (local78.anInt156 >= 0) {
					local56 = local78.anInt156;
					local48 += local56 - this.anIntArray198[3] << 16;
				}
			} else if (super.anInt719 >= 0) {
				local50 = Class15.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
			}
			Class10_Sub1_Sub2_Sub4 local156 = (Class10_Sub1_Sub2_Sub4) aClass34_9.method387(local48);
			int local162;
			int local169;
			if (local156 == null) {
				boolean local160 = false;
				for (local162 = 0; local162 < 12; local162++) {
					local169 = this.anIntArray198[local162];
					if (local56 >= 0 && local162 == 3) {
						local169 = local56;
					}
					if (local54 >= 0 && local162 == 5) {
						local169 = local54;
					}
					if (local169 >= 256 && local169 < 512 && !Class49.aClass49Array1[local169 - 256].method548(256)) {
						local160 = true;
					}
					if (local169 >= 512 && !Class17.method104(local169 - 512).method108(this.anInt768)) {
						local160 = true;
					}
				}
				if (local160) {
					if (this.aLong24 != -1L) {
						local156 = (Class10_Sub1_Sub2_Sub4) aClass34_9.method387(this.aLong24);
					}
					if (local156 == null) {
						return null;
					}
				}
			}
			if (local156 == null) {
				Class10_Sub1_Sub2_Sub4[] local239 = new Class10_Sub1_Sub2_Sub4[12];
				local162 = 0;
				int local250;
				for (local169 = 0; local169 < 12; local169++) {
					local250 = this.anIntArray198[local169];
					if (local56 >= 0 && local169 == 3) {
						local250 = local56;
					}
					if (local54 >= 0 && local169 == 5) {
						local250 = local54;
					}
					Class10_Sub1_Sub2_Sub4 local278;
					if (local250 >= 256 && local250 < 512) {
						local278 = Class49.aClass49Array1[local250 - 256].method549();
						if (local278 != null) {
							local239[local162++] = local278;
						}
					}
					if (local250 >= 512) {
						local278 = Class17.method104(local250 - 512).method105(this.anInt768);
						if (local278 != null) {
							local239[local162++] = local278;
						}
					}
				}
				local156 = new Class10_Sub1_Sub2_Sub4(local162, local239, (byte) -89);
				for (local250 = 0; local250 < 5; local250++) {
					if (this.anIntArray199[local250] != 0) {
						local156.method285(Client.anIntArrayArray24[local250][0], Client.anIntArrayArray24[local250][this.anIntArray199[local250]]);
						if (local250 == 1) {
							local156.method285(Client.anIntArray266[0], Client.anIntArray266[this.anIntArray199[local250]]);
						}
					}
				}
				local156.method278();
				local156.method288(64, 850, -30, -50, -30, true);
				aClass34_9.method388(local156, local48);
				this.aLong24 = local48;
			}
			if (this.aBoolean200) {
				return local156;
			}
			Class10_Sub1_Sub2_Sub4 local383 = Class10_Sub1_Sub2_Sub4.aClass10_Sub1_Sub2_Sub4_1;
			local383.method273(Class22.method169(this.aBoolean199, local50) & Class22.method169(this.aBoolean199, local52), local156);
			if (local50 != -1 && local52 != -1) {
				local383.method280(local52, local50, Class15.aClass15Array1[super.anInt753].anIntArray50);
			} else if (local50 != -1) {
				local383.method279(local50, (byte) 6);
			}
			local383.method275(this.anInt778);
			local383.anIntArrayArray11 = null;
			local383.anIntArrayArray10 = null;
			return local383;
		} catch ( RuntimeException local434) {
			signlink.reporterror("95366, " + 122 + ", " + local434.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public boolean method539() {
		try {
			return this.aBoolean198;
		} catch ( RuntimeException local16) {
			signlink.reporterror("13217, " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@Override
	protected Class10_Sub1_Sub2_Sub4 method537( byte arg0) {
		try {
			if (!this.aBoolean198) {
				return null;
			}
			Class10_Sub1_Sub2_Sub4 local10 = this.method544();
			if (local10 == null) {
				return null;
			}
			super.anInt723 = local10.anInt713;
			local10.aBoolean106 = true;
			if (this.aBoolean200) {
				return local10;
			}
			if (super.anInt743 != -1 && super.anInt744 != -1) {
				Class28 local39 = Class28.aClass28Array1[super.anInt743];
				Class10_Sub1_Sub2_Sub4 local42 = local39.method352();
				if (local42 != null) {
					Class10_Sub1_Sub2_Sub4 local57 = new Class10_Sub1_Sub2_Sub4(false, false, true, local42, Class22.method169(this.aBoolean199, super.anInt744));
					local57.method284(0, 0, -super.anInt747);
					local57.method278();
					local57.method279(local39.aClass15_1.anIntArray47[super.anInt744], (byte) 6);
					local57.anIntArrayArray11 = null;
					local57.anIntArrayArray10 = null;
					if (local39.anInt438 != 128 || local39.anInt439 != 128) {
						local57.method287(local39.anInt439, local39.anInt438, local39.anInt438);
					}
					local57.method288(local39.anInt441 + 64, local39.anInt442 + 850, -30, -50, -30, true);
					Class10_Sub1_Sub2_Sub4[] local125 = new Class10_Sub1_Sub2_Sub4[] { local10, local57 };
					local10 = new Class10_Sub1_Sub2_Sub4(2, true, 0, local125);
				}
			}
			if (this.aClass10_Sub1_Sub2_Sub4_2 != null) {
				if (Client.anInt1050 >= this.anInt772) {
					this.aClass10_Sub1_Sub2_Sub4_2 = null;
				}
				if (Client.anInt1050 >= this.anInt771 && Client.anInt1050 < this.anInt772) {
					Class10_Sub1_Sub2_Sub4 local154 = this.aClass10_Sub1_Sub2_Sub4_2;
					local154.method284(this.anInt762 - super.anInt739, this.anInt764 - super.anInt740, this.anInt763 - this.anInt766);
					if (super.anInt717 == 512) {
						local154.method282();
						local154.method282();
						local154.method282();
					} else if (super.anInt717 == 1024) {
						local154.method282();
						local154.method282();
					} else if (super.anInt717 == 1536) {
						local154.method282();
					}
					Class10_Sub1_Sub2_Sub4[] local217 = new Class10_Sub1_Sub2_Sub4[] { local10, local154 };
					local10 = new Class10_Sub1_Sub2_Sub4(2, true, 0, local217);
					if (super.anInt717 == 512) {
						local154.method282();
					} else if (super.anInt717 == 1024) {
						local154.method282();
						local154.method282();
					} else if (super.anInt717 == 1536) {
						local154.method282();
						local154.method282();
						local154.method282();
					}
					local154.method284(super.anInt739 - this.anInt762, super.anInt740 - this.anInt764, this.anInt766 - this.anInt763);
				}
			}
			local10.aBoolean106 = true;
			if (arg0 == 3) {
				boolean local285 = false;
			} else {
				this.aBoolean201 = !this.aBoolean201;
			}
			return local10;
		} catch ( RuntimeException local298) {
			signlink.reporterror("65126, " + arg0 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	public void method545( Class10_Sub1_Sub3 arg0) {
		try {
			arg0.anInt428 = 0;
			this.anInt768 = arg0.method311();
			this.anInt769 = arg0.method312();
			this.anInt765 = arg0.method312();
			this.aClass38_2 = null;
			this.anInt773 = 0;
			int local29;
			int local41;
			int local88;
			for ( int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method311();
				if (local29 == 0) {
					this.anIntArray198[local24] = 0;
				} else {
					local41 = arg0.method311();
					this.anIntArray198[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray198[0] == 65535) {
						this.aClass38_2 = Class38.method407(arg0.method313());
						break;
					}
					if (this.anIntArray198[local24] >= 512 && this.anIntArray198[local24] - 512 < Class17.anInt179) {
						local88 = Class17.method104(this.anIntArray198[local24] - 512).anInt176;
						if (local88 != 0) {
							this.anInt773 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method311();
				if (local41 < 0 || local41 >= Client.anIntArrayArray24[local29].length) {
					local41 = 0;
				}
				this.anIntArray199[local29] = local41;
			}
			super.anInt760 = arg0.method313();
			if (super.anInt760 == 65535) {
				super.anInt760 = -1;
			}
			super.anInt761 = arg0.method313();
			if (super.anInt761 == 65535) {
				super.anInt761 = -1;
			}
			super.anInt748 = arg0.method313();
			if (super.anInt748 == 65535) {
				super.anInt748 = -1;
			}
			super.anInt749 = arg0.method313();
			if (super.anInt749 == 65535) {
				super.anInt749 = -1;
			}
			super.anInt750 = arg0.method313();
			if (super.anInt750 == 65535) {
				super.anInt750 = -1;
			}
			super.anInt751 = arg0.method313();
			if (super.anInt751 == 65535) {
				super.anInt751 = -1;
			}
			super.anInt758 = arg0.method313();
			if (super.anInt758 == 65535) {
				super.anInt758 = -1;
			}
			this.aString14 = Class26.method252(Class26.method249(arg0.method317()), (byte) 7);
			this.anInt767 = arg0.method311();
			this.anInt770 = arg0.method313();
			this.aBoolean198 = true;
			this.aLong25 = 0L;
			local41 = this.anIntArray198[5];
			local88 = this.anIntArray198[9];
			this.anIntArray198[5] = local88;
			this.anIntArray198[9] = local41;
			for ( int local248 = 0; local248 < 12; local248++) {
				this.aLong25 <<= 0x4;
				if (this.anIntArray198[local248] >= 256) {
					this.aLong25 += this.anIntArray198[local248] - 256;
				}
			}
			if (this.anIntArray198[0] >= 256) {
				this.aLong25 += this.anIntArray198[0] - 256 >> 4;
			}
			if (this.anIntArray198[1] >= 256) {
				this.aLong25 += this.anIntArray198[1] - 256 >> 8;
			}
			this.anIntArray198[5] = local41;
			this.anIntArray198[9] = local88;
			for ( int local330 = 0; local330 < 5; local330++) {
				this.aLong25 <<= 0x3;
				this.aLong25 += this.anIntArray199[local330];
			}
			this.aLong25 <<= 0x1;
			this.aLong25 += this.anInt768;
		} catch ( RuntimeException local368) {
			signlink.reporterror("13892, " + arg0 + ", " + 0 + ", " + local368.toString());
			throw new RuntimeException();
		}
	}
}
