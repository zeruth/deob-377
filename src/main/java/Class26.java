



import sign.signlink;

public final class Class26 {

	private static int anInt326 = 236;

	private static int anInt327 = -20714;

	private static int anInt328 = 3;

	private static int anInt329 = -68;

	private static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	public static long method248( String arg0) {
		long local3 = 0L;
		for ( int local5 = 0; local5 < arg0.length() && local5 < 12; local5++) {
			char local11 = arg0.charAt(local5);
			local3 *= 37L;
			if (local11 >= 'A' && local11 <= 'Z') {
				local3 += local11 + 1 - 65;
			} else if (local11 >= 'a' && local11 <= 'z') {
				local3 += local11 + 1 - 97;
			} else if (local11 >= '0' && local11 <= '9') {
				local3 += local11 + 27 - 48;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	public static String method249( long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				int local25 = 0;
				char[] local28 = new char[12];
				while (arg0 != 0L) {
					long local32 = arg0;
					arg0 /= 37L;
					local28[11 - local25++] = aCharArray1[(int) (local32 - arg0 * 37L)];
				}
				return new String(local28, 12 - local25, local25);
			}
		} catch ( RuntimeException local64) {
			signlink.reporterror("93269, " + arg0 + ", " + 0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	public static long method250( int arg0, String arg1) {
		try {
			String local2 = arg1.toUpperCase();
			long local4 = 0L;
			boolean local8 = false;
			for ( int local10 = 0; local10 < local2.length(); local10++) {
				local4 = local4 * 61L + (long) local2.charAt(local10) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch ( RuntimeException local39) {
			signlink.reporterror("28419, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	public static String method251( int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch ( RuntimeException local39) {
			signlink.reporterror("19868, " + arg0 + ", " + -826 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	public static String method252( String arg0, byte arg1) {
		try {
			boolean local6 = false;
			if (arg0.length() <= 0) {
				return arg0;
			}
			char[] local16 = arg0.toCharArray();
			for ( int local18 = 0; local18 < local16.length; local18++) {
				if (local16[local18] == '_') {
					local16[local18] = ' ';
					if (local18 + 1 < local16.length && local16[local18 + 1] >= 'a' && local16[local18 + 1] <= 'z') {
						local16[local18 + 1] = (char) (local16[local18 + 1] + 'A' - 97);
					}
				}
			}
			if (local16[0] >= 'a' && local16[0] <= 'z') {
				local16[0] = (char) (local16[0] + 'A' - 97);
			}
			return new String(local16);
		} catch ( RuntimeException local98) {
			signlink.reporterror("81217, " + arg0 + ", " + arg1 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	public static String method253( String arg0) {
		try {
			StringBuffer local5 = new StringBuffer();
			for ( int local17 = 0; local17 < arg0.length(); local17++) {
				local5.append("*");
			}
			return local5.toString();
		} catch ( RuntimeException local32) {
			signlink.reporterror("9657, " + 2934 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}
}
