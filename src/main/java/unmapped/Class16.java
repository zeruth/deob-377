package unmapped;


import jagex2.io.JagFile;
import sign.signlink;

public final class Class16 {

	private static int anInt164;

	public static Class16[] aClass16Array1;

	private static byte aByte11 = 6;

	private int anInt163;

	private String aString6;

	public int anInt165;

	public int anInt167;

	public int anInt168;

	public int anInt169;

	public int anInt170;

	public int anInt171;

	public int anInt172;

	private boolean aBoolean46 = true;

	public int anInt166 = -1;

	private boolean aBoolean47 = false;

	public boolean aBoolean48 = true;

	public static void method99( JagFile arg0) {
		try {
			Packet local12 = new Packet(arg0.read("flo.dat", null));
			anInt164 = local12.g2();
			if (aClass16Array1 == null) {
				aClass16Array1 = new Class16[anInt164];
			}
			for ( int local22 = 0; local22 < anInt164; local22++) {
				if (aClass16Array1[local22] == null) {
					aClass16Array1[local22] = new Class16();
				}
				aClass16Array1[local22].method100(aByte11, local12);
			}
		} catch ( RuntimeException local46) {
			signlink.reporterror("59130, " + arg0 + ", " + 36135 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	private Class16() {
	}

	private void method100( byte arg0, Packet arg1) {
		try {
			int local10;
			if (arg0 == 6) {
				boolean local6 = false;
			} else {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			while (true) {
				local10 = arg1.g1();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt165 = arg1.g3();
					this.method101(this.anInt165);
				} else if (local10 == 2) {
					this.anInt166 = arg1.g1();
				} else if (local10 == 3) {
					this.aBoolean47 = true;
				} else if (local10 == 5) {
					this.aBoolean48 = false;
				} else if (local10 == 6) {
					this.aString6 = arg1.gjstr();
				} else if (local10 == 7) {
					int local75 = this.anInt167;
					int local78 = this.anInt168;
					int local81 = this.anInt169;
					int local84 = this.anInt170;
					int local87 = arg1.g3();
					this.method101(local87);
					this.anInt167 = local75;
					this.anInt168 = local78;
					this.anInt169 = local81;
					this.anInt170 = local84;
					this.anInt171 = local84;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch ( RuntimeException local119) {
			signlink.reporterror("32485, " + arg0 + ", " + arg1 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	private void method101( int arg0) {
		try {
			if (arg0 == 16711935) {
				arg0 = 0;
			}
			double local15 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			double local24 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			double local31 = (double) (arg0 & 0xFF) / 256.0D;
			double local33 = local15;
			if (local24 < local15) {
				local33 = local24;
			}
			if (local31 < local33) {
				local33 = local31;
			}
			double local47 = local15;
			if (local24 > local15) {
				local47 = local24;
			}
			if (local31 > local47) {
				local47 = local31;
			}
			double local61 = 0.0D;
			double local63 = 0.0D;
			double local69 = (local33 + local47) / 2.0D;
			if (local33 != local47) {
				if (local69 < 0.5D) {
					local63 = (local47 - local33) / (local47 + local33);
				}
				if (local69 >= 0.5D) {
					local63 = (local47 - local33) / (2.0D - local47 - local33);
				}
				if (local15 == local47) {
					local61 = (local24 - local31) / (local47 - local33);
				} else if (local24 == local47) {
					local61 = (local31 - local15) / (local47 - local33) + 2.0D;
				} else if (local31 == local47) {
					local61 = (local15 - local24) / (local47 - local33) + 4.0D;
				}
			}
			local61 /= 6.0D;
			this.anInt167 = (int) (local61 * 256.0D);
			this.anInt168 = (int) (local63 * 256.0D);
			this.anInt169 = (int) (local69 * 256.0D);
			if (this.anInt168 < 0) {
				this.anInt168 = 0;
			} else if (this.anInt168 > 255) {
				this.anInt168 = 255;
			}
			if (this.anInt169 < 0) {
				this.anInt169 = 0;
			} else if (this.anInt169 > 255) {
				this.anInt169 = 255;
			}
			if (local69 > 0.5D) {
				this.anInt171 = (int) ((1.0D - local69) * local63 * 512.0D);
			} else {
				this.anInt171 = (int) (local69 * local63 * 512.0D);
			}
			if (this.anInt171 < 1) {
				this.anInt171 = 1;
			}
			this.anInt170 = (int) (local61 * (double) this.anInt171);
			int local249 = this.anInt167 + (int) (Math.random() * 16.0D) - 8;
			if (local249 < 0) {
				local249 = 0;
			} else if (local249 > 255) {
				local249 = 255;
			}
			int local270 = this.anInt168 + (int) (Math.random() * 48.0D) - 24;
			if (local270 < 0) {
				local270 = 0;
			} else if (local270 > 255) {
				local270 = 255;
			}
			int local291 = this.anInt169 + (int) (Math.random() * 48.0D) - 24;
			if (local291 < 0) {
				local291 = 0;
			} else if (local291 > 255) {
				local291 = 255;
			}
			this.anInt172 = this.method102(local249, local270, local291);
		} catch ( RuntimeException local311) {
			signlink.reporterror("17646, " + true + ", " + arg0 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	private int method102( int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}
}
