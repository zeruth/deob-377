



import sign.signlink;

public final class Class15 {

	private static int anInt151;

	public static Class15[] aClass15Array1;

	private static byte aByte10 = 6;

	public int anInt152;

	public int[] anIntArray47;

	public int[] anIntArray48;

	private int[] anIntArray49;

	public int[] anIntArray50;

	private int anInt161;

	private boolean aBoolean44 = false;

	public int anInt153 = -1;

	public boolean aBoolean45 = false;

	public int anInt154 = 5;

	public int anInt155 = -1;

	public int anInt156 = -1;

	public int anInt157 = 99;

	public int anInt158 = -1;

	public int anInt159 = -1;

	public int anInt160 = 2;

	public static void method96( Class2 arg0) {
		try {
			Class10_Sub1_Sub3 local8 = new Class10_Sub1_Sub3(true, arg0.method2("seq.dat", null));
			anInt151 = local8.method313();
			if (aClass15Array1 == null) {
				aClass15Array1 = new Class15[anInt151];
			}
			for ( int local18 = 0; local18 < anInt151; local18++) {
				if (aClass15Array1[local18] == null) {
					aClass15Array1[local18] = new Class15();
				}
				aClass15Array1[local18].method98(aByte10, local8);
			}
		} catch ( RuntimeException local45) {
			signlink.reporterror("65256, " + arg0 + ", " + 36135 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	private Class15() {
	}

	public int method97( int arg0) {
		try {
			int local4 = this.anIntArray49[arg0];
			if (local4 == 0) {
				Class22 local16 = Class22.method168(this.anIntArray47[arg0]);
				if (local16 != null) {
					local4 = this.anIntArray49[arg0] = local16.anInt238;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch ( RuntimeException local33) {
			signlink.reporterror("89148, " + 0 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	private void method98( byte arg0, Class10_Sub1_Sub3 arg1) {
		try {
			if (arg0 == 6) {
				boolean local6 = false;
			} else {
				this.aBoolean44 = !this.aBoolean44;
			}
			while (true) {
				while (true) {
					int local19 = arg1.method311();
					if (local19 == 0) {
						if (this.anInt152 == 0) {
							this.anInt152 = 1;
							this.anIntArray47 = new int[1];
							this.anIntArray47[0] = -1;
							this.anIntArray48 = new int[1];
							this.anIntArray48[0] = -1;
							this.anIntArray49 = new int[1];
							this.anIntArray49[0] = -1;
						}
						if (this.anInt158 == -1) {
							if (this.anIntArray50 == null) {
								this.anInt158 = 0;
							} else {
								this.anInt158 = 2;
							}
						}
						if (this.anInt159 == -1) {
							if (this.anIntArray50 != null) {
								this.anInt159 = 2;
								return;
							}
							this.anInt159 = 0;
							return;
						}
						return;
					}
					int local46;
					if (local19 == 1) {
						this.anInt152 = arg1.method311();
						this.anIntArray47 = new int[this.anInt152];
						this.anIntArray48 = new int[this.anInt152];
						this.anIntArray49 = new int[this.anInt152];
						for (local46 = 0; local46 < this.anInt152; local46++) {
							this.anIntArray47[local46] = arg1.method313();
							this.anIntArray48[local46] = arg1.method313();
							if (this.anIntArray48[local46] == 65535) {
								this.anIntArray48[local46] = -1;
							}
							this.anIntArray49[local46] = arg1.method313();
						}
					} else if (local19 == 2) {
						this.anInt153 = arg1.method313();
					} else if (local19 == 3) {
						local46 = arg1.method311();
						this.anIntArray50 = new int[local46 + 1];
						for ( int local107 = 0; local107 < local46; local107++) {
							this.anIntArray50[local107] = arg1.method311();
						}
						this.anIntArray50[local46] = 9999999;
					} else if (local19 == 4) {
						this.aBoolean45 = true;
					} else if (local19 == 5) {
						this.anInt154 = arg1.method311();
					} else if (local19 == 6) {
						this.anInt155 = arg1.method313();
					} else if (local19 == 7) {
						this.anInt156 = arg1.method313();
					} else if (local19 == 8) {
						this.anInt157 = arg1.method311();
					} else if (local19 == 9) {
						this.anInt158 = arg1.method311();
					} else if (local19 == 10) {
						this.anInt159 = arg1.method311();
					} else if (local19 == 11) {
						this.anInt160 = arg1.method311();
					} else if (local19 == 12) {
						this.anInt161 = arg1.method316();
					} else {
						System.out.println("Error unrecognised seq config code: " + local19);
					}
				}
			}
		} catch ( RuntimeException local281) {
			signlink.reporterror("58164, " + arg0 + ", " + arg1 + ", " + local281.toString());
			throw new RuntimeException();
		}
	}
}
