



import sign.signlink;

public final class Class35 {

	private static int anInt555;

	private static boolean aBoolean138;

	static {
		aBoolean138 = true;
	}

	public static int method391( byte arg0, int arg1, int arg2, int arg3) {
		try {
			boolean local4 = false;
			int local12 = arg1 & 0x3;
			if (local12 == 0) {
				return arg2;
			} else if (local12 == 1) {
				return arg3;
			} else if (local12 == 2) {
				return 7 - arg2;
			} else {
				return 7 - arg3;
			}
		} catch ( RuntimeException local33) {
			signlink.reporterror("41348, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	public static int method392( int arg0, int arg1, int arg2, byte arg3) {
		try {
			boolean local4 = false;
			int local16 = arg2 & 0x3;
			if (local16 == 0) {
				return arg0;
			} else if (local16 == 1) {
				return 7 - arg1;
			} else if (local16 == 2) {
				return 7 - arg0;
			} else {
				return arg1;
			}
		} catch ( RuntimeException local37) {
			signlink.reporterror("86268, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	public static int method393( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if ((arg2 & 0x1) == 1) {
				int local15 = arg4;
				arg4 = arg1;
				arg1 = local15;
			}
			int local23 = arg0 & 0x3;
			if (local23 == 0) {
				return arg3;
			} else if (local23 == 1) {
				return arg5;
			} else if (local23 == 2) {
				return 7 + 1 - arg3 - arg4;
			} else {
				return 7 + 1 - arg5 - arg1;
			}
		} catch ( RuntimeException local52) {
			signlink.reporterror("79364, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -117 + ", " + arg4 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	public static int method394( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if ((arg5 & 0x1) == 1) {
				int local10 = arg0;
				arg0 = arg4;
				arg4 = local10;
			}
			int local18 = arg1 & 0x3;
			if (local18 == 0) {
				return arg3;
			} else if (local18 == 1) {
				return 7 + 1 - arg2 - arg0;
			} else if (local18 == 2) {
				return 7 + 1 - arg3 - arg4;
			} else {
				return arg2;
			}
		} catch ( RuntimeException local47) {
			signlink.reporterror("1668, " + arg0 + ", " + arg1 + ", " + 671 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
