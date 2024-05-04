package unmapped;


import jagex2.io.JagFile;
import sign.signlink;

public final class Class50 {

	private static int anInt799;

	public static Class50[] aClass50Array1;

	private int anInt798;

	private String aString16;

	public int anInt800;

	public int anInt801;

	public int anInt802;

	private int anInt804;

	private boolean aBoolean209 = false;

	private int anInt803 = -1;

	private boolean aBoolean210 = true;

	public static void method574( JagFile arg0) {
		try {
			Packet local8 = new Packet(arg0.read("varbit.dat", null));
			anInt799 = local8.readShort();
			if (aClass50Array1 == null) {
				aClass50Array1 = new Class50[anInt799];
			}
			for ( int local22 = 0; local22 < anInt799; local22++) {
				if (aClass50Array1[local22] == null) {
					aClass50Array1[local22] = new Class50();
				}
				aClass50Array1[local22].method575(local22, local8);
				if (aClass50Array1[local22].aBoolean209) {
					Class44.aClass44Array1[aClass50Array1[local22].anInt800].aBoolean150 = true;
				}
			}
			if (local8.pos != local8.aByteArray12.length) {
				System.out.println("varbit load mismatch");
			}
		} catch ( RuntimeException local69) {
			signlink.reporterror("77123, " + arg0 + ", " + 36135 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	private Class50() {
	}

	private void method575( int arg0, Packet arg1) {
		try {
			while (true) {
				int local9 = arg1.readByte();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt800 = arg1.readShort();
					this.anInt801 = arg1.readByte();
					this.anInt802 = arg1.readByte();
				} else if (local9 == 10) {
					this.aString16 = arg1.method318();
				} else if (local9 == 2) {
					this.aBoolean209 = true;
				} else if (local9 == 3) {
					this.anInt803 = arg1.method316();
				} else if (local9 == 4) {
					this.anInt804 = arg1.method316();
				} else if (local9 == 5) {
					this.aBoolean210 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch ( RuntimeException local83) {
			signlink.reporterror("90774, " + -954 + ", " + arg0 + ", " + arg1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}
}
