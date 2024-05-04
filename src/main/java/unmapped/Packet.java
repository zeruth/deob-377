package unmapped;

import java.math.BigInteger;




import sign.signlink;

public final class Packet extends Class10_Sub1 {

	private static int anInt430;

	private static int anInt431;

	private static int anInt432;

	private static boolean aBoolean115 = true;

	private static int[] anIntArray150 = new int[256];

	private static final int[] anIntArray151;

	private static Class6 aClass6_2;

	private static Class6 aClass6_3;

	private static Class6 aClass6_4;

	private static char[] aCharArray2;

	private int anInt425;

	private int anInt426;

	public byte[] aByteArray12;

	public int pos;

	public int anInt429;

	public Class25 aClass25_1;

	private boolean aBoolean109 = false;

	private int anInt421 = 8;

	private boolean aBoolean110 = false;

	private boolean aBoolean111 = true;

	private byte aByte22 = 5;

	private int anInt422 = -29290;

	private boolean aBoolean112 = false;

	private int anInt423 = 217;

	private int anInt424 = 236;

	private boolean aBoolean113 = false;

	private byte aByte23 = 17;

	private byte aByte24 = 89;

	private byte aByte25 = -16;

	private boolean aBoolean114 = false;

	private int anInt427 = 1;

	static {
		for ( int local6 = 0; local6 < 256; local6++) {
			int local9 = local6;
			for ( int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray150[local6] = local9;
		}
		anIntArray151 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass6_2 = new Class6(true);
		aClass6_3 = new Class6(true);
		aClass6_4 = new Class6(true);
		aCharArray2 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	public static Packet method299() {
		try {
			Class6 local3 = aClass6_3;
			synchronized (aClass6_3) {
				Packet local7 = null;
				if (anInt431 > 0) {
					anInt431--;
					local7 = (Packet) aClass6_3.method5();
				}
				if (local7 != null) {
					local7.pos = 0;
					return local7;
				}
			}
			Packet local69 = new Packet(-211);
			local69.pos = 0;
			local69.aByteArray12 = new byte[5000];
			return local69;
		} catch ( RuntimeException local104) {
			signlink.reporterror("81898, " + 0 + ", " + 1 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	private Packet(int arg0) {
	}

	public Packet(byte[] arg1) {
		this.aByteArray12 = arg1;
		this.pos = 0;
	}

	public void method300( int arg0) {
		try {
			this.aByteArray12[this.pos++] = (byte) (arg0 + this.aClass25_1.method245());
		} catch ( RuntimeException local27) {
			signlink.reporterror("21317, " + 4 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	public void method301( int arg0) {
		this.aByteArray12[this.pos++] = (byte) arg0;
	}

	public void method302( int arg0) {
		this.aByteArray12[this.pos++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.pos++] = (byte) arg0;
	}

	public void method303( int arg0) {
		try {
			this.aByteArray12[this.pos++] = (byte) arg0;
			this.aByteArray12[this.pos++] = 0;
		} catch ( RuntimeException local30) {
			signlink.reporterror("2554, " + arg0 + ", " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	public void method304( int arg0) {
		this.aByteArray12[this.pos++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.pos++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.pos++] = (byte) arg0;
	}

	public void method305( int arg0) {
		this.aByteArray12[this.pos++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.pos++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.pos++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.pos++] = (byte) arg0;
	}

	public void method306( int arg0) {
		try {
			this.aByteArray12[this.pos++] = (byte) arg0;
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 8);
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 16);
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 24);
		} catch ( RuntimeException local60) {
			signlink.reporterror("11872, " + arg0 + ", " + false + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	public void method307( long arg0) {
		try {
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 56);
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 48);
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 40);
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 32);
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 24);
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 16);
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 8);
			this.aByteArray12[this.pos++] = (byte) arg0;
		} catch ( RuntimeException local123) {
			signlink.reporterror("88423, " + arg0 + ", " + true + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	public void method308( String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray12, this.pos);
		this.pos += arg0.length();
		this.aByteArray12[this.pos++] = 10;
	}

	public void method309( byte[] arg0, int arg1) {
		try {
			for ( int local9 = 0; local9 < arg1 + 0; local9++) {
				this.aByteArray12[this.pos++] = arg0[local9];
			}
		} catch ( RuntimeException local32) {
			signlink.reporterror("84054, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	public void method310( int arg0) {
		try {
			this.aByteArray12[this.pos - arg0 - 1] = (byte) arg0;
		} catch ( RuntimeException local14) {
			signlink.reporterror("2308, " + arg0 + ", " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	public int readByte() {
		return this.aByteArray12[this.pos++] & 0xFF;
	}

	public byte method312() {
		return this.aByteArray12[this.pos++];
	}

	public int readShort() {
		this.pos += 2;
		return ((this.aByteArray12[this.pos - 2] & 0xFF) << 8) + (this.aByteArray12[this.pos - 1] & 0xFF);
	}

	public int method314() {
		this.pos += 2;
		int local27 = ((this.aByteArray12[this.pos - 2] & 0xFF) << 8) + (this.aByteArray12[this.pos - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	public int readInt24() {
		this.pos += 3;
		return ((this.aByteArray12[this.pos - 3] & 0xFF) << 16) + ((this.aByteArray12[this.pos - 2] & 0xFF) << 8) + (this.aByteArray12[this.pos - 1] & 0xFF);
	}

	public int method316() {
		this.pos += 4;
		return ((this.aByteArray12[this.pos - 4] & 0xFF) << 24) + ((this.aByteArray12[this.pos - 3] & 0xFF) << 16) + ((this.aByteArray12[this.pos - 2] & 0xFF) << 8) + (this.aByteArray12[this.pos - 1] & 0xFF);
	}

	public long method317() {
		try {
			long local5 = (long) this.method316() & 0xFFFFFFFFL;
			long local17 = (long) this.method316() & 0xFFFFFFFFL;
			return (local5 << 32) + local17;
		} catch ( RuntimeException local24) {
			signlink.reporterror("36638, " + -149 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	public String method318() {
		int local2 = this.pos;
		while (this.aByteArray12[this.pos++] != 10) {
		}
		return new String(this.aByteArray12, local2, this.pos - local2 - 1);
	}

	public byte[] method319() {
		try {
			int local2 = this.pos;
			while (this.aByteArray12[this.pos++] != 10) {
			}
			byte[] local28 = new byte[this.pos - local2 - 1];
			for (int local30 = local2; local30 < this.pos - 1; local30++) {
				local28[local30 - local2] = this.aByteArray12[local30];
			}
			return local28;
		} catch ( RuntimeException local51) {
			signlink.reporterror("60192, " + 621 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	private void method320( int arg0, byte[] arg1) {
		try {
			for ( int local11 = 0; local11 < arg0 + 0; local11++) {
				arg1[local11] = this.aByteArray12[this.pos++];
			}
		} catch ( RuntimeException local34) {
			signlink.reporterror("36906, " + arg0 + ", " + 0 + ", " + -21 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	public void method321( byte arg0) {
		try {
			this.anInt429 = this.pos * 8;
			boolean local10 = false;
		} catch ( RuntimeException local13) {
			signlink.reporterror("54917, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	public int method322( int arg0) {
		try {
			int local4 = this.anInt429 >> 3;
			int local11 = 8 - (this.anInt429 & 0x7);
			int local13 = 0;
			this.anInt429 += arg0;
			while (arg0 > local11) {
				local13 += (this.aByteArray12[local4++] & anIntArray151[local11]) << arg0 - local11;
				arg0 -= local11;
				local11 = 8;
			}
			if (arg0 == local11) {
				local13 += this.aByteArray12[local4] & anIntArray151[local11];
			} else {
				local13 += this.aByteArray12[local4] >> local11 - arg0 & anIntArray151[arg0];
			}
			return local13;
		} catch ( RuntimeException local83) {
			signlink.reporterror("57594, " + 402 + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	public void method323() {
		try {
			if (this.anInt422 != -29290) {
				this.anInt422 = -448;
			}
			this.pos = (this.anInt429 + 7) / 8;
		} catch ( RuntimeException local16) {
			signlink.reporterror("21652, " + -29290 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	public int method324() {
		int local7 = this.aByteArray12[this.pos] & 0xFF;
		return local7 < 128 ? this.readByte() - 64 : this.readShort() - 49152;
	}

	public int method325() {
		int local7 = this.aByteArray12[this.pos] & 0xFF;
		return local7 < 128 ? this.readByte() : this.readShort() - 32768;
	}

	public void method326( int arg0, BigInteger arg1, BigInteger arg2) {
		try {
			int local2 = this.pos;
			this.pos = 0;
			byte[] local8 = new byte[local2];
			this.method320(local2, local8);
			BigInteger local19 = new BigInteger(local8);
			BigInteger local24 = local19.modPow(arg2, arg1);
			byte[] local27 = local24.toByteArray();
			if (arg0 >= 0 && arg0 <= 0) {
				this.pos = 0;
				this.method301(local27.length);
				this.method309(local27, local27.length);
			}
		} catch ( RuntimeException local48) {
			signlink.reporterror("76034, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	public void method327( int arg0) {
		try {
			this.aByteArray12[this.pos++] = (byte) (arg0 + 128);
		} catch ( RuntimeException local24) {
			signlink.reporterror("74948, " + false + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	public void method328( int arg0) {
		try {
			this.aByteArray12[this.pos++] = (byte) -arg0;
		} catch ( RuntimeException local29) {
			signlink.reporterror("8237, " + 0 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	public void method329( int arg0) {
		try {
			this.aByteArray12[this.pos++] = (byte) (128 - arg0);
		} catch ( RuntimeException local19) {
			signlink.reporterror("6939, " + arg0 + ", " + 1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	public int method330() {
		try {
			return this.anInt425 == 0 ? this.aByteArray12[this.pos++] - 128 & 0xFF : this.anInt423;
		} catch ( RuntimeException local22) {
			signlink.reporterror("66623, " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	public int method331() {
		try {
			return -this.aByteArray12[this.pos++] & 0xFF;
		} catch ( RuntimeException local20) {
			signlink.reporterror("68250, " + -34545 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	public int method332( int arg0) {
		try {
			int local3 = 77 / arg0;
			return 128 - this.aByteArray12[this.pos++] & 0xFF;
		} catch ( RuntimeException local19) {
			signlink.reporterror("25074, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	public byte method333( int arg0) {
		try {
			if (arg0 != 0) {
				for ( int local3 = 1; local3 > 0; local3++) {
				}
			}
			return (byte) (this.aByteArray12[this.pos++] - 128);
		} catch ( RuntimeException local23) {
			signlink.reporterror("66305, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	public byte method334() {
		try {
			return (byte) -this.aByteArray12[this.pos++];
		} catch ( RuntimeException local18) {
			signlink.reporterror("28012, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	public byte method335() {
		try {
			return (byte) (128 - this.aByteArray12[this.pos++]);
		} catch ( RuntimeException local24) {
			signlink.reporterror("38258, " + 43428 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	public void method336( int arg0) {
		try {
			this.aByteArray12[this.pos++] = (byte) arg0;
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 8);
		} catch ( RuntimeException local32) {
			signlink.reporterror("9779, " + 0 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	public void method337( int arg0) {
		try {
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 8);
			this.aByteArray12[this.pos++] = (byte) (arg0 + 128);
		} catch ( RuntimeException local31) {
			signlink.reporterror("9119, " + arg0 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	public void method338( int arg0) {
		try {
			this.aByteArray12[this.pos++] = (byte) (arg0 + 128);
			this.aByteArray12[this.pos++] = (byte) (arg0 >> 8);
		} catch ( RuntimeException local43) {
			signlink.reporterror("85432, " + 3 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	public int method339() {
		try {
			this.pos += 2;
			return ((this.aByteArray12[this.pos - 1] & 0xFF) << 8) + (this.aByteArray12[this.pos - 2] & 0xFF);
		} catch ( RuntimeException local32) {
			signlink.reporterror("3023, " + -125 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	public int method340() {
		try {
			this.pos += 2;
			return ((this.aByteArray12[this.pos - 2] & 0xFF) << 8) + (this.aByteArray12[this.pos - 1] - 128 & 0xFF);
		} catch ( RuntimeException local36) {
			signlink.reporterror("71136, " + 9 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	public int method341() {
		try {
			this.pos += 2;
			return ((this.aByteArray12[this.pos - 1] & 0xFF) << 8) + (this.aByteArray12[this.pos - 2] - 128 & 0xFF);
		} catch ( RuntimeException local35) {
			signlink.reporterror("33768, " + -600 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	public int method342() {
		try {
			this.pos += 2;
			int local29 = ((this.aByteArray12[this.pos - 1] & 0xFF) << 8) + (this.aByteArray12[this.pos - 2] & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch ( RuntimeException local50) {
			signlink.reporterror("15922, " + -63 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	public int method343() {
		try {
			this.pos += 2;
			if (this.aByte23 != 17) {
				this.aBoolean112 = !this.aBoolean112;
			}
			int local41 = ((this.aByteArray12[this.pos - 2] & 0xFF) << 8) + (this.aByteArray12[this.pos - 1] - 128 & 0xFF);
			if (local41 > 32767) {
				local41 -= 65536;
			}
			return local41;
		} catch ( RuntimeException local51) {
			signlink.reporterror("62112, " + 17 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	public int method344() {
		try {
			this.pos += 3;
			return ((this.aByteArray12[this.pos - 2] & 0xFF) << 16) + ((this.aByteArray12[this.pos - 3] & 0xFF) << 8) + (this.aByteArray12[this.pos - 1] & 0xFF);
		} catch ( RuntimeException local44) {
			signlink.reporterror("72022, " + -737 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	public int method345() {
		try {
			this.pos += 4;
			return ((this.aByteArray12[this.pos - 1] & 0xFF) << 24) + ((this.aByteArray12[this.pos - 2] & 0xFF) << 16) + ((this.aByteArray12[this.pos - 3] & 0xFF) << 8) + (this.aByteArray12[this.pos - 4] & 0xFF);
		} catch ( RuntimeException local57) {
			signlink.reporterror("34629, " + 935 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	public int method346() {
		try {
			this.pos += 4;
			return ((this.aByteArray12[this.pos - 2] & 0xFF) << 24) + ((this.aByteArray12[this.pos - 1] & 0xFF) << 16) + ((this.aByteArray12[this.pos - 4] & 0xFF) << 8) + (this.aByteArray12[this.pos - 3] & 0xFF);
		} catch ( RuntimeException local61) {
			signlink.reporterror("90657, " + 3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	public int method347() {
		try {
			this.pos += 4;
			return ((this.aByteArray12[this.pos - 3] & 0xFF) << 24) + ((this.aByteArray12[this.pos - 4] & 0xFF) << 16) + ((this.aByteArray12[this.pos - 1] & 0xFF) << 8) + (this.aByteArray12[this.pos - 2] & 0xFF);
		} catch ( RuntimeException local61) {
			signlink.reporterror("74675, " + true + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	public void method348( byte[] arg0, int arg1) {
		try {
			for ( int local9 = arg1 + 0 - 1; local9 >= 0; local9--) {
				arg0[local9] = this.aByteArray12[this.pos++];
			}
		} catch ( RuntimeException local30) {
			signlink.reporterror("36655, " + -73 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	public void method349( byte[] arg0, int arg1) {
		try {
			for ( int local11 = 0; local11 < arg1 + 0; local11++) {
				arg0[local11] = (byte) (this.aByteArray12[this.pos++] - 128);
			}
		} catch ( RuntimeException local37) {
			signlink.reporterror("69666, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}
}
