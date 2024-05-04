



import sign.signlink;

public class Draw2D extends Class10_Sub1 {

	private static int anInt672;

	private static boolean aBoolean172;

	public static int[] anIntArray178;

	public static int anInt674;

	public static int anInt675;

	public static int anInt676;

	public static int anInt677;

	public static int anInt678;

	public static int anInt679;

	public static int anInt680;

	public static int anInt681;

	public static int anInt682;

	private static boolean aBoolean173 = true;

	private static int anInt673 = -291;

	public static void bind(int arg1, int arg2, int[] arg3) {
		anIntArray178 = arg3;
		anInt674 = arg1;
		anInt675 = arg2;
		method496(0, 0, arg2, arg1);
	}

	public static void method495() {
		try {
			anInt678 = 0;
			anInt676 = 0;
			anInt679 = anInt674;
			anInt677 = anInt675;
			anInt680 = anInt679 - 1;
			anInt681 = anInt679 / 2;
		} catch ( RuntimeException local22) {
			signlink.reporterror("70020, " + 82 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	public static void method496( int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg3 > anInt674) {
				arg3 = anInt674;
			}
			if (arg2 > anInt675) {
				arg2 = anInt675;
			}
			anInt678 = arg1;
			anInt676 = arg0;
			anInt679 = arg3;
			anInt677 = arg2;
			anInt680 = anInt679 - 1;
			anInt681 = anInt679 / 2;
			anInt682 = anInt677 / 2;
		} catch ( RuntimeException local42) {
			signlink.reporterror("95145, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	public static void method497() {
		try {
			int local3 = anInt674 * anInt675;
			for ( int local14 = 0; local14 < local3; local14++) {
				anIntArray178[local14] = 0;
			}
		} catch ( RuntimeException local26) {
			signlink.reporterror("92195, " + 4 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	public static void method498( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg5 < anInt678) {
				arg2 -= anInt678 - arg5;
				arg5 = anInt678;
			}
			if (arg1 < anInt676) {
				arg3 -= anInt676 - arg1;
				arg1 = anInt676;
			}
			if (arg5 + arg2 > anInt679) {
				arg2 = anInt679 - arg5;
			}
			if (arg1 + arg3 > anInt677) {
				arg3 = anInt677 - arg1;
			}
			int local45 = 256 - arg4;
			int local53 = (arg0 >> 16 & 0xFF) * arg4;
			int local61 = (arg0 >> 8 & 0xFF) * arg4;
			int local67 = (arg0 & 0xFF) * arg4;
			int local79 = anInt674 - arg2;
			int local85 = arg5 + arg1 * anInt674;
			for ( int local87 = 0; local87 < arg3; local87++) {
				for ( int local92 = -arg2; local92 < 0; local92++) {
					int local104 = (anIntArray178[local85] >> 16 & 0xFF) * local45;
					int local114 = (anIntArray178[local85] >> 8 & 0xFF) * local45;
					int local122 = (anIntArray178[local85] & 0xFF) * local45;
					int local144 = (local53 + local104 >> 8 << 16) + (local61 + local114 >> 8 << 8) + (local67 + local122 >> 8);
					anIntArray178[local85++] = local144;
				}
				local85 += local79;
			}
		} catch ( RuntimeException local162) {
			signlink.reporterror("40167, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	public static void method499( int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg4 < anInt678) {
				arg3 -= anInt678 - arg4;
				arg4 = anInt678;
			}
			if (arg1 < anInt676) {
				arg0 -= anInt676 - arg1;
				arg1 = anInt676;
			}
			if (arg4 + arg3 > anInt679) {
				arg3 = anInt679 - arg4;
			}
			if (arg1 + arg0 > anInt677) {
				arg0 = anInt677 - arg1;
			}
			int local45 = anInt674 - arg3;
			int local51 = arg4 + arg1 * anInt674;
			for ( int local54 = -arg0; local54 < 0; local54++) {
				for ( int local59 = -arg3; local59 < 0; local59++) {
					anIntArray178[local51++] = arg2;
				}
				local51 += local45;
			}
		} catch ( RuntimeException local81) {
			signlink.reporterror("72807, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -24 + ", " + arg3 + ", " + arg4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	public static void method500( int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			method502(arg3, arg2, arg0, arg4);
			method502(arg3, arg2, arg0 + arg1 - 1, arg4);
			method504(arg3, arg2, arg1, arg0);
			method504(arg3 + arg4 - 1, arg2, arg1, arg0);
		} catch ( RuntimeException local37) {
			signlink.reporterror("44773, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	public static void method501( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			method503(arg4, arg0, arg1, arg5, arg2);
			method503(arg4 + arg3 - 1, arg0, arg1, arg5, arg2);
			if (arg3 >= 3) {
				method505(arg4 + 1, arg0, arg2, arg3 - 2, arg5);
				method505(arg4 + 1, arg0 + arg1 - 1, arg2, arg3 - 2, arg5);
			}
		} catch ( RuntimeException local52) {
			signlink.reporterror("11975, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -113 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	public static void method502( int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg2 >= anInt676 && arg2 < anInt677) {
				if (arg0 < anInt678) {
					arg3 -= anInt678 - arg0;
					arg0 = anInt678;
				}
				if (arg0 + arg3 > anInt679) {
					arg3 = anInt679 - arg0;
				}
				int local34 = arg0 + arg2 * anInt674;
				for ( int local45 = 0; local45 < arg3; local45++) {
					anIntArray178[local34 + local45] = arg1;
				}
			}
		} catch ( RuntimeException local59) {
			signlink.reporterror("15177, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	private static void method503( int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg0 >= anInt676 && arg0 < anInt677) {
				if (arg1 < anInt678) {
					arg2 -= anInt678 - arg1;
					arg1 = anInt678;
				}
				if (arg1 + arg2 > anInt679) {
					arg2 = anInt679 - arg1;
				}
				int local30 = 256 - arg3;
				int local38 = (arg4 >> 16 & 0xFF) * arg3;
				int local46 = (arg4 >> 8 & 0xFF) * arg3;
				int local52 = (arg4 & 0xFF) * arg3;
				int local58 = arg1 + arg0 * anInt674;
				for ( int local60 = 0; local60 < arg2; local60++) {
					int local72 = (anIntArray178[local58] >> 16 & 0xFF) * local30;
					int local82 = (anIntArray178[local58] >> 8 & 0xFF) * local30;
					int local90 = (anIntArray178[local58] & 0xFF) * local30;
					int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray178[local58++] = local112;
				}
			}
		} catch ( RuntimeException local128) {
			signlink.reporterror("54569, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1388 + ", " + arg3 + ", " + arg4 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	public static void method504( int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 >= anInt678 && arg0 < anInt679) {
				if (arg3 < anInt676) {
					arg2 -= anInt676 - arg3;
					arg3 = anInt676;
				}
				if (arg3 + arg2 > anInt677) {
					arg2 = anInt677 - arg3;
				}
				int local35 = arg0 + arg3 * anInt674;
				for ( int local37 = 0; local37 < arg2; local37++) {
					anIntArray178[local35 + local37 * anInt674] = arg1;
				}
			}
		} catch ( RuntimeException local53) {
			signlink.reporterror("2455, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	private static void method505( int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg1 >= anInt678 && arg1 < anInt679) {
				if (arg0 < anInt676) {
					arg3 -= anInt676 - arg0;
					arg0 = anInt676;
				}
				if (arg0 + arg3 > anInt677) {
					arg3 = anInt677 - arg0;
				}
				int local32 = 256 - arg4;
				int local40 = (arg2 >> 16 & 0xFF) * arg4;
				int local48 = (arg2 >> 8 & 0xFF) * arg4;
				int local54 = (arg2 & 0xFF) * arg4;
				int local69 = arg1 + arg0 * anInt674;
				for ( int local71 = 0; local71 < arg3; local71++) {
					int local83 = (anIntArray178[local69] >> 16 & 0xFF) * local32;
					int local93 = (anIntArray178[local69] >> 8 & 0xFF) * local32;
					int local101 = (anIntArray178[local69] & 0xFF) * local32;
					int local123 = (local40 + local83 >> 8 << 16) + (local48 + local93 >> 8 << 8) + (local54 + local101 >> 8);
					anIntArray178[local69] = local123;
					local69 += anInt674;
				}
			}
		} catch ( RuntimeException local137) {
			signlink.reporterror("11425, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	protected Draw2D() {
	}
}
