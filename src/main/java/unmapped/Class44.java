package unmapped;


import jagex2.io.JagFile;
import sign.signlink;

public final class Class44 {

	private static int anInt613;

	public static Class44[] aClass44Array1;

	private static int anInt614;

	private static int[] anIntArray173;

	private String aString11;

	private int anInt615;

	private int anInt616;

	public int anInt617;

	private int anInt618;

	private int anInt619;

	private boolean aBoolean147 = false;

	private boolean aBoolean148 = true;

	private boolean aBoolean149 = false;

	public boolean aBoolean150 = false;

	private int anInt620 = -1;

	private boolean aBoolean151 = true;

	public static void method414( JagFile arg0) {
		try {
			Packet local8 = new Packet(arg0.read("varp.dat", null));
			anInt614 = 0;
			anInt613 = local8.g2();
			if (aClass44Array1 == null) {
				aClass44Array1 = new Class44[anInt613];
			}
			if (anIntArray173 == null) {
				anIntArray173 = new int[anInt613];
			}
			for ( int local29 = 0; local29 < anInt613; local29++) {
				if (aClass44Array1[local29] == null) {
					aClass44Array1[local29] = new Class44();
				}
				aClass44Array1[local29].method415(local29, local8);
			}
			if (local8.pos != local8.data.length) {
				System.out.println("varptype load mismatch");
			}
		} catch ( RuntimeException local63) {
			signlink.reporterror("10762, " + arg0 + ", " + 36135 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	private Class44() {
	}

	private void method415( int arg0, Packet arg1) {
		try {
			while (true) {
				int local7 = arg1.g1();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt615 = arg1.g1();
				} else if (local7 == 2) {
					this.anInt616 = arg1.g1();
				} else if (local7 == 3) {
					this.aBoolean147 = true;
					anIntArray173[anInt614++] = arg0;
				} else if (local7 == 4) {
					this.aBoolean148 = false;
				} else if (local7 == 5) {
					this.anInt617 = arg1.g2();
				} else if (local7 == 6) {
					this.aBoolean149 = true;
				} else if (local7 == 7) {
					this.anInt618 = arg1.g4();
				} else if (local7 == 8) {
					this.anInt619 = 1;
					this.aBoolean150 = true;
				} else if (local7 == 10) {
					this.aString11 = arg1.gjstr();
				} else if (local7 == 11) {
					this.aBoolean150 = true;
				} else if (local7 == 12) {
					this.anInt620 = arg1.g4();
				} else if (local7 == 13) {
					this.anInt619 = 2;
					this.aBoolean150 = true;
				} else if (local7 == 14) {
					this.aBoolean151 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch ( RuntimeException local145) {
			signlink.reporterror("68575, " + -954 + ", " + arg0 + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
