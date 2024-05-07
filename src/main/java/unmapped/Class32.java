package unmapped;


import sign.signlink;

public final class Class32 {

	private static int anInt484 = 20411;

	private static char[] aCharArray3 = new char[100];

	private static Packet aClass10_Sub1_Sub3_2 = new Packet(new byte[100]);

	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	public static String method371(Packet arg0, int arg1) {
		try {
			int local3 = 0;
			int local5 = -1;
			int local18;
			for ( int local7 = 0; local7 < arg1; local7++) {
				int local12 = arg0.g1();
				local18 = local12 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray3[local3++] = aCharArray4[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray3[local3++] = aCharArray4[local18];
				} else {
					local5 = local18;
				}
				local18 = local12 & 0xF;
				if (local5 != -1) {
					aCharArray3[local3++] = aCharArray4[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray3[local3++] = aCharArray4[local18];
				} else {
					local5 = local18;
				}
			}
			boolean local96 = true;
			for (local18 = 0; local18 < local3; local18++) {
				char local104 = aCharArray3[local18];
				if (local96 && local104 >= 'a' && local104 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local96 = false;
				}
				if (local104 == '.' || local104 == '!' || local104 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch ( RuntimeException local149) {
			signlink.reporterror("56026, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	public static void method372( String arg0, Packet arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			int local24 = -1;
			for ( int local26 = 0; local26 < arg0.length(); local26++) {
				char local32 = arg0.charAt(local26);
				int local34 = 0;
				for ( int local36 = 0; local36 < aCharArray4.length; local36++) {
					if (local32 == aCharArray4[local36]) {
						local34 = local36;
						break;
					}
				}
				if (local34 > 12) {
					local34 += 195;
				}
				if (local24 == -1) {
					if (local34 < 13) {
						local24 = local34;
					} else {
						arg1.p1(local34);
					}
				} else if (local34 < 13) {
					arg1.p1((local24 << 4) + local34);
					local24 = -1;
				} else {
					arg1.p1((local24 << 4) + (local34 >> 4));
					local24 = local34 & 0xF;
				}
			}
			if (local24 != -1) {
				arg1.p1(local24 << 4);
			}
		} catch ( RuntimeException local113) {
			signlink.reporterror("76466, " + arg0 + ", " + 569 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	public static String method373( String arg0) {
		try {
			aClass10_Sub1_Sub3_2.pos = 0;
			method372(arg0, aClass10_Sub1_Sub3_2);
			int local9 = aClass10_Sub1_Sub3_2.pos;
			aClass10_Sub1_Sub3_2.pos = 0;
			return method371(aClass10_Sub1_Sub3_2, local9);
		} catch ( RuntimeException local29) {
			signlink.reporterror("80320, " + 0 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
