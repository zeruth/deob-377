package unmapped;


import jagex2.io.JagFile;
import sign.signlink;

public final class Class28 {

	private static int anInt434;

	public static Class28[] aClass28Array1;

	private static byte aByte26 = 6;

	private static boolean aBoolean117 = true;

	public static Class34 aClass34_5 = new Class34(30, -572);

	private int anInt435;

	private int anInt436;

	public Class15 aClass15_1;

	public int anInt440;

	public int anInt441;

	public int anInt442;

	private int anInt433 = -214;

	private int anInt437 = -1;

	private int[] anIntArray152 = new int[6];

	private int[] anIntArray153 = new int[6];

	public int anInt438 = 128;

	public int anInt439 = 128;

	public static void method350( JagFile arg0) {
		try {
			Packet local8 = new Packet(arg0.read("spotanim.dat", null));
			anInt434 = local8.g2();
			if (aClass28Array1 == null) {
				aClass28Array1 = new Class28[anInt434];
			}
			for ( int local27 = 0; local27 < anInt434; local27++) {
				if (aClass28Array1[local27] == null) {
					aClass28Array1[local27] = new Class28();
				}
				aClass28Array1[local27].anInt435 = local27;
				aClass28Array1[local27].method351(aByte26, local8);
			}
		} catch ( RuntimeException local56) {
			signlink.reporterror("20002, " + arg0 + ", " + 36135 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	private Class28() {
	}

	private void method351( byte arg0, Packet arg1) {
		try {
			if (arg0 == 6) {
				boolean local6 = false;
			} else {
				this.anInt433 = 458;
			}
			while (true) {
				while (true) {
					int local14 = arg1.g1();
					if (local14 == 0) {
						return;
					}
					if (local14 == 1) {
						this.anInt436 = arg1.g2();
					} else if (local14 == 2) {
						this.anInt437 = arg1.g2();
						if (Class15.aClass15Array1 != null) {
							this.aClass15_1 = Class15.aClass15Array1[this.anInt437];
						}
					} else if (local14 == 4) {
						this.anInt438 = arg1.g2();
					} else if (local14 == 5) {
						this.anInt439 = arg1.g2();
					} else if (local14 == 6) {
						this.anInt440 = arg1.g2();
					} else if (local14 == 7) {
						this.anInt441 = arg1.g1();
					} else if (local14 == 8) {
						this.anInt442 = arg1.g1();
					} else if (local14 >= 40 && local14 < 50) {
						this.anIntArray152[local14 - 40] = arg1.g2();
					} else if (local14 >= 50 && local14 < 60) {
						this.anIntArray153[local14 - 50] = arg1.g2();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local14);
					}
				}
			}
		} catch ( RuntimeException local131) {
			signlink.reporterror("19263, " + arg0 + ", " + arg1 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	public Class10_Sub1_Sub2_Sub4 method352() {
		Class10_Sub1_Sub2_Sub4 local6 = (Class10_Sub1_Sub2_Sub4) aClass34_5.method387((long) this.anInt435);
		if (local6 != null) {
			return local6;
		}
		local6 = Class10_Sub1_Sub2_Sub4.method271(this.anInt436);
		if (local6 == null) {
			return null;
		}
		for ( int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray152[0] != 0) {
				local6.method285(this.anIntArray152[local20], this.anIntArray153[local20]);
			}
		}
		aClass34_5.method388(local6, (long) this.anInt435);
		return local6;
	}
}
