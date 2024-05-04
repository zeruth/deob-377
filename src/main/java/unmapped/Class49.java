package unmapped;


import jagex2.io.JagFile;
import sign.signlink;

public final class Class49 {

	public static int anInt781;

	public static Class49[] aClass49Array1;

	private static byte aByte43 = 6;

	private int[] anIntArray200;

	private int anInt779 = -766;

	private int anInt780 = 256;

	public int anInt782 = -1;

	private int[] anIntArray201 = new int[6];

	private int[] anIntArray202 = new int[6];

	private int[] anIntArray203 = new int[] { -1, -1, -1, -1, -1 };

	public boolean aBoolean202 = false;

	public static void method546( JagFile arg0) {
		try {
			Packet local8 = new Packet(arg0.read("idk.dat", null));
			anInt781 = local8.readShort();
			if (aClass49Array1 == null) {
				aClass49Array1 = new Class49[anInt781];
			}
			for ( int local18 = 0; local18 < anInt781; local18++) {
				if (aClass49Array1[local18] == null) {
					aClass49Array1[local18] = new Class49();
				}
				aClass49Array1[local18].method547(aByte43, local8);
			}
		} catch ( RuntimeException local45) {
			signlink.reporterror("86120, " + arg0 + ", " + 36135 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	private Class49() {
	}

	private void method547( byte arg0, Packet arg1) {
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
					if (local15 == 1) {
						this.anInt782 = arg1.readByte();
					} else if (local15 == 2) {
						int local33 = arg1.readByte();
						this.anIntArray200 = new int[local33];
						for ( int local39 = 0; local39 < local33; local39++) {
							this.anIntArray200[local39] = arg1.readShort();
						}
					} else if (local15 == 3) {
						this.aBoolean202 = true;
					} else if (local15 >= 40 && local15 < 50) {
						this.anIntArray201[local15 - 40] = arg1.readShort();
					} else if (local15 >= 50 && local15 < 60) {
						this.anIntArray202[local15 - 50] = arg1.readShort();
					} else if (local15 >= 60 && local15 < 70) {
						this.anIntArray203[local15 - 60] = arg1.readShort();
					} else {
						System.out.println("Error unrecognised config code: " + local15);
					}
				}
			}
		} catch ( RuntimeException local120) {
			signlink.reporterror("40395, " + arg0 + ", " + arg1 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	public boolean method548( int arg0) {
		try {
			if (this.anIntArray200 == null) {
				return true;
			}
			boolean local6 = true;
			boolean local10 = false;
			for ( int local12 = 0; local12 < this.anIntArray200.length; local12++) {
				if (!Class10_Sub1_Sub2_Sub4.method272(this.anIntArray200[local12])) {
					local6 = false;
				}
			}
			return local6;
		} catch ( RuntimeException local31) {
			signlink.reporterror("77929, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4 method549() {
		try {
			if (this.anIntArray200 == null) {
				return null;
			}
			Class10_Sub1_Sub2_Sub4[] local11 = new Class10_Sub1_Sub2_Sub4[this.anIntArray200.length];
			for ( int local13 = 0; local13 < this.anIntArray200.length; local13++) {
				local11[local13] = Class10_Sub1_Sub2_Sub4.method271(this.anIntArray200[local13]);
			}
			Class10_Sub1_Sub2_Sub4 local37;
			if (local11.length == 1) {
				local37 = local11[0];
			} else {
				local37 = new Class10_Sub1_Sub2_Sub4(local11.length, local11, (byte) -89);
			}
			for ( int local49 = 0; local49 < 6 && this.anIntArray201[local49] != 0; local49++) {
				local37.method285(this.anIntArray201[local49], this.anIntArray202[local49]);
			}
			return local37;
		} catch ( RuntimeException local80) {
			signlink.reporterror("60350, " + 2 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	public boolean method550() {
		try {
			boolean local8 = true;
			for ( int local10 = 0; local10 < 5; local10++) {
				if (this.anIntArray203[local10] != -1 && !Class10_Sub1_Sub2_Sub4.method272(this.anIntArray203[local10])) {
					local8 = false;
				}
			}
			return local8;
		} catch ( RuntimeException local33) {
			signlink.reporterror("52810, " + -10584 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4 method551( boolean arg0) {
		try {
			Class10_Sub1_Sub2_Sub4[] local4 = new Class10_Sub1_Sub2_Sub4[5];
			if (arg0) {
				this.anInt779 = -298;
			}
			int local11 = 0;
			for ( int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray203[local13] != -1) {
					local4[local11++] = Class10_Sub1_Sub2_Sub4.method271(this.anIntArray203[local13]);
				}
			}
			Class10_Sub1_Sub2_Sub4 local41 = new Class10_Sub1_Sub2_Sub4(local11, local4, (byte) -89);
			for ( int local43 = 0; local43 < 6 && this.anIntArray201[local43] != 0; local43++) {
				local41.method285(this.anIntArray201[local43], this.anIntArray202[local43]);
			}
			return local41;
		} catch ( RuntimeException local67) {
			signlink.reporterror("68025, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
