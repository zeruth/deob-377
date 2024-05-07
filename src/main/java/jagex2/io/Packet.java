package jagex2.io;

import java.math.BigInteger;


import jagex2.datastruct.Hashable;
import sign.signlink;
import unmapped.Class6;

public final class Packet extends Hashable {

	private static int anInt430;

	private static int anInt431;

	private static int anInt432;

	private static boolean aBoolean115 = true;

	private static int[] anIntArray150 = new int[256];

	private static final int[] BITMASK;

	private static Class6 aClass6_2;

	private static Class6 aClass6_3;

	private static Class6 aClass6_4;

	private static char[] aCharArray2;

	private int anInt425;

	private int anInt426;

	public byte[] data;

	public int pos;

	public int bitPos;

	public Isaac random;

	private boolean aBoolean109 = false;

	private int anInt421 = 8;

	private boolean aBoolean110 = false;

	private boolean aBoolean111 = true;

	private byte aByte22 = 5;

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
		BITMASK = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass6_2 = new Class6(true);
		aClass6_3 = new Class6(true);
		aClass6_4 = new Class6(true);
		aCharArray2 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	public static Packet method299() {
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
		local69.data = new byte[5000];
		return local69;
	}

	private Packet(int arg0) {
	}

	public Packet(byte[] src) {
		this.data = src;
		this.pos = 0;
	}

	public void p1isaac(int arg0) {
		this.data[this.pos++] = (byte) (arg0 + this.random.nextInt());
	}

	public void p1(int arg0) {
		this.data[this.pos++] = (byte) arg0;
	}

	public void p2(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	public void p3(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	public void p4(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	public void method303( int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = 0;
	}

	public void ip4(int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
	}

	public void p8(long arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 56);
		this.data[this.pos++] = (byte) (arg0 >> 48);
		this.data[this.pos++] = (byte) (arg0 >> 40);
		this.data[this.pos++] = (byte) (arg0 >> 32);
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	public void pjstr(String str) {
		str.getBytes(0, str.length(), this.data, this.pos);
		this.pos += str.length();
		this.data[this.pos++] = 10;
	}

	public void pdata(byte[] arg0, int arg1) {
		for ( int local9 = 0; local9 < arg1 + 0; local9++) {
			this.data[this.pos++] = arg0[local9];
		}
	}

	public void psize1(int size) {
		this.data[this.pos - size - 1] = (byte) size;
	}

	public int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	public byte g1b() {
		return this.data[this.pos++];
	}

	public int g2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	public int g2b() {
		this.pos += 2;
		int value = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	public int g3() {
		this.pos += 3;
		return ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	public int g4() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 24) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	public long g8() {
		long high = (long) this.g4() & 0xFFFFFFFFL;
		long low = (long) this.g4() & 0xFFFFFFFFL;
		return (high << 32) + low;
	}

	public String gjstr() {
		int local2 = this.pos;
		while (this.data[this.pos++] != 10) {
		}
		return new String(this.data, local2, this.pos - local2 - 1);
	}

	public byte[] gstrbyte() {
		int start = this.pos;
		while (this.data[this.pos++] != 10) {
		}
		byte[] temp = new byte[this.pos - start - 1];
        if (this.pos - 1 - start >= 0) System.arraycopy(this.data, start, temp, 0, this.pos - 1 - start);
		return temp;
	}

	private void gdata(int arg0, byte[] arg1) {
		for (int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = this.data[this.pos++];
		}
	}

	public void accessBits(byte arg0) {
		this.bitPos = this.pos * 8;
	}

	public int gBit(int n) {
		int bytePos = this.bitPos >> 3;
		int remainingBits = 8 - (this.bitPos & 0x7);
		int value = 0;
		this.bitPos += n;
		while (n > remainingBits) {
			value += (this.data[bytePos++] & BITMASK[remainingBits]) << n - remainingBits;
			n -= remainingBits;
			remainingBits = 8;
		}
		if (n == remainingBits) {
			value += this.data[bytePos] & BITMASK[remainingBits];
		} else {
			value += this.data[bytePos] >> remainingBits - n & BITMASK[n];
		}
		return value;
	}

	public void accessBytes() {
		this.pos = (this.bitPos + 7) / 8;
	}

	public int gsmart() {
		int local7 = this.data[this.pos] & 0xFF;
		return local7 < 128 ? this.g1() - 64 : this.g2() - 49152;
	}

	public int gsmarts() {
		int local7 = this.data[this.pos] & 0xFF;
		return local7 < 128 ? this.g1() : this.g2() - 32768;
	}

	public void rsaenc(BigInteger arg1, BigInteger exp) {
		int length = this.pos;
		this.pos = 0;
		byte[] temp = new byte[length];
		this.gdata(length, temp);
		BigInteger bigRaw = new BigInteger(temp);
		BigInteger bigEnc = bigRaw.modPow(exp, arg1);
		byte[] rawEnc = bigEnc.toByteArray();
		this.pos = 0;
		this.p1(rawEnc.length);
		this.pdata(rawEnc, rawEnc.length);
	}

	public void method327( int arg0) {
		try {
			this.data[this.pos++] = (byte) (arg0 + 128);
		} catch ( RuntimeException local24) {
			signlink.reporterror("74948, " + false + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	public void method328( int arg0) {
		try {
			this.data[this.pos++] = (byte) -arg0;
		} catch ( RuntimeException local29) {
			signlink.reporterror("8237, " + 0 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	public void method329( int arg0) {
		try {
			this.data[this.pos++] = (byte) (128 - arg0);
		} catch ( RuntimeException local19) {
			signlink.reporterror("6939, " + arg0 + ", " + 1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	public int method330() {
		try {
			return this.anInt425 == 0 ? this.data[this.pos++] - 128 & 0xFF : this.anInt423;
		} catch ( RuntimeException local22) {
			signlink.reporterror("66623, " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	public int method331() {
		try {
			return -this.data[this.pos++] & 0xFF;
		} catch ( RuntimeException local20) {
			signlink.reporterror("68250, " + -34545 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	public int method332( int arg0) {
		try {
			int local3 = 77 / arg0;
			return 128 - this.data[this.pos++] & 0xFF;
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
			return (byte) (this.data[this.pos++] - 128);
		} catch ( RuntimeException local23) {
			signlink.reporterror("66305, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	public byte method334() {
		try {
			return (byte) -this.data[this.pos++];
		} catch ( RuntimeException local18) {
			signlink.reporterror("28012, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	public byte method335() {
		try {
			return (byte) (128 - this.data[this.pos++]);
		} catch ( RuntimeException local24) {
			signlink.reporterror("38258, " + 43428 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	public void method336( int arg0) {
		try {
			this.data[this.pos++] = (byte) arg0;
			this.data[this.pos++] = (byte) (arg0 >> 8);
		} catch ( RuntimeException local32) {
			signlink.reporterror("9779, " + 0 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	public void method337( int arg0) {
		try {
			this.data[this.pos++] = (byte) (arg0 >> 8);
			this.data[this.pos++] = (byte) (arg0 + 128);
		} catch ( RuntimeException local31) {
			signlink.reporterror("9119, " + arg0 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	public void method338( int arg0) {
		try {
			this.data[this.pos++] = (byte) (arg0 + 128);
			this.data[this.pos++] = (byte) (arg0 >> 8);
		} catch ( RuntimeException local43) {
			signlink.reporterror("85432, " + 3 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	public int method339() {
		try {
			this.pos += 2;
			return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
		} catch ( RuntimeException local32) {
			signlink.reporterror("3023, " + -125 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	public int method340() {
		try {
			this.pos += 2;
			return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
		} catch ( RuntimeException local36) {
			signlink.reporterror("71136, " + 9 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	public int method341() {
		try {
			this.pos += 2;
			return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
		} catch ( RuntimeException local35) {
			signlink.reporterror("33768, " + -600 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	public int method342() {
		try {
			this.pos += 2;
			int local29 = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
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
			int local41 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
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
			return ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos - 3] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
		} catch ( RuntimeException local44) {
			signlink.reporterror("72022, " + -737 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	public int method345() {
		try {
			this.pos += 4;
			return ((this.data[this.pos - 1] & 0xFF) << 24) + ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos - 3] & 0xFF) << 8) + (this.data[this.pos - 4] & 0xFF);
		} catch ( RuntimeException local57) {
			signlink.reporterror("34629, " + 935 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	public int method346() {
		try {
			this.pos += 4;
			return ((this.data[this.pos - 2] & 0xFF) << 24) + ((this.data[this.pos - 1] & 0xFF) << 16) + ((this.data[this.pos - 4] & 0xFF) << 8) + (this.data[this.pos - 3] & 0xFF);
		} catch ( RuntimeException local61) {
			signlink.reporterror("90657, " + 3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	public int method347() {
		try {
			this.pos += 4;
			return ((this.data[this.pos - 3] & 0xFF) << 24) + ((this.data[this.pos - 4] & 0xFF) << 16) + ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
		} catch ( RuntimeException local61) {
			signlink.reporterror("74675, " + true + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	public void method348( byte[] arg0, int arg1) {
		try {
			for ( int local9 = arg1 + 0 - 1; local9 >= 0; local9--) {
				arg0[local9] = this.data[this.pos++];
			}
		} catch ( RuntimeException local30) {
			signlink.reporterror("36655, " + -73 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	public void method349( byte[] arg0, int arg1) {
		try {
			for ( int local11 = 0; local11 < arg1 + 0; local11++) {
				arg0[local11] = (byte) (this.data[this.pos++] - 128);
			}
		} catch ( RuntimeException local37) {
			signlink.reporterror("69666, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}
}
