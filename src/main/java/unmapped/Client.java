package unmapped;

import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;


import jagex2.client.GameShell;
import jagex2.config.IdkType;
import jagex2.dash3d.entity.PathingEntity;
import jagex2.dash3d.entity.PlayerEntity;
import jagex2.graphics.Draw2D;
import jagex2.graphics.Model;
import jagex2.graphics.Pix24;
import jagex2.graphics.PixMap;
import jagex2.io.ClientStream;
import jagex2.io.Isaac;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import sign.signlink;

public final class Client extends GameShell {

	private static boolean aBoolean217;

	private static int anInt858;

	public static int portOffset;

	private static boolean lowMemory;

	private static boolean aBoolean228;

	private static int anInt887;

	private static boolean aBoolean230;

	private static int anInt925;

	private static int anInt938;

	private static int anInt944;

	private static int anInt963;

	private static int anInt972;

	private static int anInt974;

	public static PlayerEntity localPlayer;

	private static int anInt975;

	private static boolean aBoolean250;

	private static int anInt1005;

	private static int anInt1007;

	private static int anInt1044;

	public static int anInt1050;

	private static BigInteger modulus = new BigInteger("118715129948298085708715233077562919322936514902694757652158738381215780608469962250645351330040629214264158653936140878800548566943738621344847841892849665824893208868079989706488773861661003170979762976785695483470009941728657441381092748785938014719472658545215538224151739707447212206054952823153519556347");

	private static int nodeId = 10;

	private static boolean members = true;

	private static int[] anIntArray228 = new int[99];

	private static boolean aBoolean229;

	private static String aString23;

	public static final int[][] anIntArrayArray24;

	private static int anInt910;

	private static boolean aBoolean249;

	public static int[] anIntArray262;

	public static final int[] anIntArray266;

	private static BigInteger exponent;

	private byte[][] aByteArrayArray5;

	private int anInt828;

	private int anInt829;

	private int anInt830;

	private int anInt831;

	private int anInt832;

	private int anInt833;

	private int anInt834;

	private int cameraAnticheatOffsetX;

	private int anInt837;

	private int[] anIntArray216;

	private int[] anIntArray217;

	private int[] anIntArray218;

	private int anInt838;

	private int anInt839;

	private int anInt840;

	private int anInt841;

	private int anInt842;

	private int packetSize;

	private int packetType;

	private int idleNetCycles;

	private int anInt846;

	private int idleTimeout;

	private int anInt848;

	private int anInt849;

	private int anInt850;

	private int anInt851;

	private int anInt852;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_1;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_2;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_3;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_4;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_5;

	private int anInt853;

	private JagFile aClass2_2;

	private int anInt854;

	private int anInt855;

	private int[][][] anIntArrayArrayArray8;

	private int anInt856;

	private Isaac randomIn;

	private long aLong29;

	private int lastPacketType0;

	private int lastPacketType1;

	private int lastPacketType2;

	private PixMap aClass19_3;

	private PixMap aClass19_4;

	private PixMap aClass19_5;

	private PixMap aClass19_6;

	private PixMap aClass19_7;

	private PixMap aClass19_8;

	private PixMap aClass19_9;

	private PixMap aClass19_10;

	private PixMap aClass19_11;

	private int anInt863;

	private int minimapAnticheatAngle;

	private long serverSeed;

	private int anInt876;

	private int anInt878;

	private int anInt879;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_6;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_7;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_8;

	private int anInt884;

	private int anInt885;

	private int anInt886;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_9;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_10;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_11;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_12;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_13;

	private int anInt889;

	private int anInt890;

	private int anInt891;

	private int anInt892;

	private int anInt893;

	private int anInt894;

	private int anInt895;

	private int anInt896;

	private int anInt897;

	private int[] anIntArray236;

	private int[] anIntArray237;

	private int[] anIntArray238;

	private int[] anIntArray239;

	private int anInt898;

	private int anInt899;

	private int cameraAnticheatOffsetZ;

	private int anInt902;

	private int anInt903;

	private int anInt905;

	private Pix24 aClass10_Sub1_Sub1_Sub1_3;

	private Pix24 aClass10_Sub1_Sub1_Sub1_4;

	private int anInt906;

	private int anInt907;

	private int anInt908;

	private int anInt909;

	private ClientStream stream;

	private String aString25;

	private int anInt911;

	private int anInt912;

	private int waveCount;

	private Pix24 aClass10_Sub1_Sub1_Sub1_5;

	private Pix24 aClass10_Sub1_Sub1_Sub1_6;

	private int anInt914;

	private int anInt915;

	private int anInt916;

	private int anInt917;

	private int anInt918;

	private int anInt919;

	private int anInt920;

	private int anInt921;

	private int anInt923;

	private int systemUpdateTimer;

	private String aString26;

	private Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_2;

	private Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_3;

	private Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_4;

	private Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_5;

	private int anInt930;

	private int anInt931;

	private int anInt932;

	private int sceneState;

	private int anInt935;

	private int anInt936;

	private int anInt939;

	private int[] anIntArray249;

	private int[] anIntArray250;

	private Pix24 aClass10_Sub1_Sub1_Sub1_7;

	private int anInt940;

	private int anInt942;

	private int anInt943;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_14;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_15;

	private int anInt945;

	private Pix24 aClass10_Sub1_Sub1_Sub1_8;

	private Pix24 aClass10_Sub1_Sub1_Sub1_9;

	private int anInt946;

	private PixMap aClass19_12;

	private PixMap aClass19_13;

	private PixMap aClass19_14;

	private int anInt948;

	private int anInt949;

	private int anInt950;

	private int anInt951;

	private int anInt952;

	private Pix24 aClass10_Sub1_Sub1_Sub1_10;

	private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array3;

	private int anInt953;

	private int anInt955;

	private int anInt956;

	private Pix24 aClass10_Sub1_Sub1_Sub1_11;

	private byte[][][] aByteArrayArrayArray8;

	private int anInt957;

	private int anInt958;

	private int anInt959;

	private int anInt960;

	private int anInt962;

	private long aLong31;

	private int objSelected;

	private int anInt966;

	private int anInt967;

	private int anInt968;

	private String aString30;

	private int anInt969;

	private int anInt970;

	private PixMap aClass19_15;

	private PixMap aClass19_16;

	private PixMap aClass19_17;

	private PixMap aClass19_18;

	private Class23 aClass23_1;

	private int anInt977;

	private int spellSelected;

	private int anInt979;

	private int anInt980;

	private String aString31;

	private int[] anIntArray259;

	private int[] anIntArray260;

	private int anInt983;

	private int menuSize;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_16;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_17;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_18;

	private Pix24 aClass10_Sub1_Sub1_Sub1_12;

	private Pix24 aClass10_Sub1_Sub1_Sub1_13;

	private Pix24 aClass10_Sub1_Sub1_Sub1_14;

	private Pix24 aClass10_Sub1_Sub1_Sub1_15;

	private Pix24 aClass10_Sub1_Sub1_Sub1_16;

	private int hintType;

	private PixMap aClass19_19;

	private PixMap aClass19_20;

	private PixMap aClass19_21;

	private PixMap aClass19_22;

	private PixMap aClass19_23;

	private PixMap aClass19_24;

	private PixMap aClass19_25;

	private PixMap aClass19_26;

	private PixMap aClass19_27;

	private int anInt987;

	private int anInt989;

	private int anInt990;

	private int anInt991;

	private int anInt992;

	private int anInt993;

	private int anInt994;

	private int anInt995;

	private int anInt996;

	private int anInt997;

	private Socket aSocket3;

	private int anInt998;

	private int anInt999;

	private int anInt1000;

	private long loginTime;

	private byte[][] aByteArrayArray6;

	private int minimapZoom;

	private int anInt1008;

	private int anInt1009;

	private int anInt1010;

	private int anInt1011;

	private Pix24 aClass10_Sub1_Sub1_Sub1_17;

	private Class7 aClass7_1;

	private long aLong33;

	private int orbitCameraYaw;

	private int anInt1014;

	private int anInt1015;

	private int cameraAnticheatAngle;

	private int anInt1019;

	private int anInt1020;

	private int anInt1021;

	private int anInt1022;

	private int anInt1023;

	private int anInt1025;

	private int anInt1028;

	private int anInt1030;

	private int anInt1033;

	private Class33_Sub1 aClass33_Sub1_1;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_19;

	private Class10_Sub1_Sub1_Sub3 aClass10_Sub1_Sub1_Sub3_20;

	private int anInt1034;

	private int anInt1035;

	private int anInt1036;

	private int anInt1037;

	private int anInt1038;

	private int anInt1039;

	private int anInt1040;

	private int anInt1041;

	private int anInt1042;

	private int anInt1043;

	private int[] anIntArray271;

	private int[] anIntArray272;

	private int[] anIntArray273;

	private int[] anIntArray274;

	private int anInt1045;

	private int anInt1047;

	private int anInt1048;

	private int anInt1049;

	private int anInt1053;

	private int anInt1054;

	private int anInt1055;

	private int anInt1056;

	private int[] archiveChecksum = new int[9];

	private String aString17 = "";

	private int[] anIntArray213 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	private int[] anIntArray214 = new int[Class43.anInt612];

	private String[] aStringArray8 = new String[200];

	private int[] anIntArray215 = new int[5];

	private int anInt836 = 2;

	private String aString18 = "";

	private String[] aStringArray9 = new String[100];

	private int[] anIntArray219 = new int[100];

	private boolean aBoolean216 = false;

	private int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	private int[][] anIntArrayArray22 = new int[104][104];

	private int[][] anIntArrayArray23 = new int[104][104];

	private boolean aBoolean218 = false;

	private int anInt857 = -992;

	private Pix24[] aClass10_Sub1_Sub1_Sub1Array4 = new Pix24[8];

	private int anInt859 = 559;

	private byte aByte45 = 6;

	private boolean aBoolean219 = false;

	private byte aByte46 = -123;

	private int anInt865 = 2;

	private boolean aBoolean220 = true;

	private boolean aBoolean221 = true;

	private int[] anIntArray220 = new int[151];

	private int anInt866 = 8;

	private boolean[] aBooleanArray11 = new boolean[5];

	private int anInt870 = -188;

	private Packet login = Packet.method299();

	private int anInt871 = 2301979;

	private int anInt872 = -1;

	private int anInt873 = -1;

	private boolean aBoolean224 = true;

	private int anInt874 = -1;

	private byte aByte47 = -113;

	private String aString19 = "";

	private int anInt875 = -214;

	private int anInt877 = 50;

	private int[] anIntArray221 = new int[this.anInt877];

	private int[] anIntArray222 = new int[this.anInt877];

	private int[] anIntArray223 = new int[this.anInt877];

	private int[] anIntArray224 = new int[this.anInt877];

	private int[] anIntArray225 = new int[this.anInt877];

	private int[] anIntArray226 = new int[this.anInt877];

	private int[] anIntArray227 = new int[this.anInt877];

	private String[] aStringArray10 = new String[this.anInt877];

	private String aString20 = "";

	private boolean aBoolean225 = false;

	private boolean aBoolean226 = false;

	private Pix24[] aClass10_Sub1_Sub1_Sub1Array5 = new Pix24[32];

	private byte aByte48 = 1;

	private String loginMessage0 = "";

	private String loginMessage1 = "";

	private boolean aBoolean227 = true;

	private int anInt880 = -1;

	private int anInt881 = -1;

	private Packet out = Packet.method299();

	private int MAX_PLAYER_COUNT = 2048;

	private int anInt883 = 2047;

	private PlayerEntity[] players = new PlayerEntity[this.MAX_PLAYER_COUNT];

	private int[] anIntArray229 = new int[this.MAX_PLAYER_COUNT];

	private int[] anIntArray230 = new int[this.MAX_PLAYER_COUNT];

	private Packet[] playerAppearanceBuffer = new Packet[this.MAX_PLAYER_COUNT];

	private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array2 = new Class10_Sub1_Sub1_Sub3[13];

	private int[] anIntArray231 = new int[500];

	private int[] anIntArray232 = new int[500];

	private int[] anIntArray233 = new int[500];

	private int[] anIntArray234 = new int[500];

	private int anInt888 = -1;

	private int[] anIntArray235 = new int[5];

	private int[] anIntArray240 = new int[2000];

	private int anInt901 = 2;

	private boolean aBoolean231 = false;

	private boolean aBoolean232 = false;

	private int[] anIntArray241 = new int[151];

	private String aString24 = "";

	private boolean aBoolean233 = false;

	private int[] anIntArray242 = new int[Class43.anInt612];

	private Pix24[] aClass10_Sub1_Sub1_Sub1Array6 = new Pix24[100];

	private final int[] anIntArray243 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	private boolean aBoolean234 = false;

	private boolean aBoolean235 = true;

	public int[] anIntArray244 = new int[2000];

	private boolean aBoolean236 = false;

	private int anInt924 = 69;

	private int anInt926 = -1;

	private int[] anIntArray245 = new int[Class43.anInt612];

	private int anInt927 = 2;

	private int anInt928 = 3;

	private boolean menuVisible = false;

	private byte aByte49 = 1;

	private boolean aBoolean238 = false;

	private String[] aStringArray11 = new String[5];

	private boolean[] aBooleanArray12 = new boolean[5];

	private int anInt934 = 20411;

	private long[] aLongArray3 = new long[100];

	private int[] anIntArray246 = new int[1000];

	private int[] anIntArray247 = new int[1000];

	private Pix24[] aClass10_Sub1_Sub1_Sub1Array7 = new Pix24[32];

	private int anInt937 = 5063219;

	private int[] anIntArray248 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	private CRC32 aCRC32_2 = new CRC32();

	private int anInt941 = -1;

	private int[] anIntArray251 = new int[50];

	private String aString27 = "";

	private String aString28 = "";

	private boolean aBoolean240 = false;

	private boolean aBoolean241 = false;

	private int[] designColors = new int[5];

	private String aString29 = "";

	private int[] anIntArray253 = new int[5];

	private int anInt947 = 78;

	private int anInt954 = -30658;

	private int[] anIntArray254 = new int[4000];

	private int[] anIntArray255 = new int[4000];

	private boolean aBoolean242 = false;

	private long[] aLongArray4 = new long[200];

	private Packet aClass10_Sub1_Sub3_8 = new Packet(new byte[5000]);

	private Class10_Sub1_Sub2_Sub3_Sub1[] npcs = new Class10_Sub1_Sub2_Sub3_Sub1[16384];

	private int[] anIntArray256 = new int[16384];

	private int anInt961 = 7759444;

	private boolean aBoolean243 = false;

	public boolean ingame = false;

	private int anInt964 = -110;

	private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array4 = new Class10_Sub1_Sub1_Sub3[2];

	private byte aByte50 = -80;

	private boolean aBoolean245 = true;

	private int[] anIntArray257 = new int[5];

	private Class10_Sub1_Sub1_Sub3[] aClass10_Sub1_Sub1_Sub3Array5 = new Class10_Sub1_Sub1_Sub3[100];

	private int anInt971 = -916;

	private boolean aBoolean246 = false;

	private byte aByte51 = 97;

	private boolean aBoolean247 = false;

	private int[] anIntArray258 = new int[256];

	private int anInt976 = -1;

	private int anInt982 = 300;

	private int[] anIntArray261 = new int[33];

	private boolean aBoolean248 = false;

	private Pix24[] aClass10_Sub1_Sub1_Sub1Array8 = new Pix24[20];

	private String[] aStringArray12 = new String[500];

	private Packet in = Packet.method299();

	private int[][] anIntArrayArray25 = new int[104][104];

	private int anInt985 = -1;

	private boolean aBoolean251 = false;

	private Class6 spotanims = new Class6(true);

	private boolean aBoolean252 = false;

	private boolean aBoolean253 = false;

	private int anInt988 = -1;

	public Class24[] aClass24Array1 = new Class24[5];

	private int anInt1002 = -1;

	private int anInt1004 = 1;

	private int anInt1006 = 326;

	private boolean aBoolean254 = false;

	private boolean aBoolean255 = false;

	private volatile boolean aBoolean257 = false;

	private byte[] aByteArray21 = new byte[16384];

	private Class14 aClass14_1 = new Class14();

	private int anInt1012 = 128;

	private int anInt1017 = 1;

	private final int anInt1018 = 100;

	private int[] anIntArray263 = new int[100];

	private int[] anIntArray264 = new int[50];

	private Class47[] aClass47Array1 = new Class47[4];

	private Class6 spawnedLocations = new Class6(true);

	private boolean aBoolean258 = false;

	private boolean aBoolean259 = true;

	private int[] anIntArray265 = new int[200];

	private boolean aBoolean260 = true;

	private int anInt1024 = -1;

	private boolean aBoolean261 = true;

	private boolean aBoolean262 = true;

	private int anInt1026 = -1;

	private boolean aBoolean263 = false;

	private Pix24[] aClass10_Sub1_Sub1_Sub1Array9 = new Pix24[1000];

	private int anInt1027 = -1;

	private int anInt1029 = -939;

	private Class6 projectiles = new Class6(true);

	private boolean aBoolean264 = false;

	private int anInt1031 = 3;

	private int[] anIntArray267 = new int[33];

	private int anInt1032 = 3353893;

	private Pix24[] aClass10_Sub1_Sub1_Sub1Array10 = new Pix24[32];

	private int[] anIntArray268 = new int[] { 17, 24, 34, 40 };

	private int[] anIntArray269 = new int[1000];

	private int[] anIntArray270 = new int[100];

	private String[] aStringArray13 = new String[100];

	private String[] messageText = new String[100];

	private boolean aBoolean265 = true;

	private volatile boolean aBoolean266 = false;

	private byte aByte52 = -58;

	private int anInt1046 = 416;

	private volatile boolean aBoolean267 = false;

	private int[] anIntArray275 = new int[50];

	private Class6[][][] levelObjStacks = new Class6[4][104][104];

	private int[] anIntArray276 = new int[7];

	private int anInt1051 = -1;

	private int anInt1052 = 409;

	static {
		int local13 = 0;
		int local15;
		for (local15 = 0; local15 < 99; local15++) {
			int local20 = local15 + 1;
			int local33 = (int) ((double) local20 + Math.pow(2.0D, (double) local20 / 7.0D) * 300.0D);
			local13 += local33;
			anIntArray228[local15] = local13 / 4;
		}
		aBoolean229 = true;
		aString23 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArrayArray24 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		anInt910 = -352;
		aBoolean249 = true;
		anIntArray262 = new int[32];
		local13 = 2;
		for (local15 = 0; local15 < 32; local15++) {
			anIntArray262[local15] = local13 - 1;
			local13 += local13;
		}
		anIntArray266 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		exponent = new BigInteger("65537");
	}

	public static void main( String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 377);
			if (arg0.length == 5) {
				nodeId = Integer.parseInt(arg0[0]);
				portOffset = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					setLowMemory();
				} else if (arg0[2].equals("highmem")) {
					setHighMemory();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					members = false;
				} else if (arg0[3].equals("members")) {
					members = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.storeId = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				Client client = new Client();
				client.initApplication(anInt910);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch ( Exception local94) {
		}
	}

	private static String method595( int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch ( RuntimeException local37) {
			signlink.reporterror("44898, " + arg0 + ", " + -243 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	private static void setHighMemory() {
		try {
			Class23.aBoolean93 = false;
			Class10_Sub1_Sub1_Sub4.aBoolean176 = false;
			lowMemory = false;
			Class8.aBoolean15 = false;
			Class48.aBoolean183 = false;
		} catch ( RuntimeException local15) {
			signlink.reporterror("29613, " + true + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	private static String method667( int arg0, int arg1) {
		try {
			int local9 = arg1 - arg0;
			if (local9 < -9) {
				return "@red@";
			} else if (local9 < -6) {
				return "@or3@";
			} else if (local9 < -3) {
				return "@or2@";
			} else if (local9 < 0) {
				return "@or1@";
			} else if (local9 > 9) {
				return "@gre@";
			} else if (local9 > 6) {
				return "@gr3@";
			} else if (local9 > 3) {
				return "@gr2@";
			} else if (local9 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch ( RuntimeException local50) {
			signlink.reporterror("11680, " + arg0 + ", " + arg1 + ", " + 736 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	private static void setLowMemory() {
		try {
			Class23.aBoolean93 = true;
			Class10_Sub1_Sub1_Sub4.aBoolean176 = true;
			lowMemory = true;
			Class8.aBoolean15 = true;
			Class48.aBoolean183 = true;
		} catch ( RuntimeException local19) {
			signlink.reporterror("10008, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	private static String method710( int arg0) {
		try {
			String local4 = String.valueOf(arg0);
			for ( int local15 = local4.length() - 3; local15 > 0; local15 -= 3) {
				local4 = local4.substring(0, local15) + "," + local4.substring(local15);
			}
			if (local4.length() > 8) {
				local4 = "@gre@" + local4.substring(0, local4.length() - 8) + " million @whi@(" + local4 + ")";
			} else if (local4.length() > 4) {
				local4 = "@cya@" + local4.substring(0, local4.length() - 4) + "K @whi@(" + local4 + ")";
			}
			return " " + local4;
		} catch ( RuntimeException local95) {
			signlink.reporterror("88511, " + 0 + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	private void method589( String arg0) {
		try {
			if (arg0 == null || arg0.length() == 0) {
				this.anInt840 = 0;
			} else {
				String local12 = arg0;
				String[] local15 = new String[100];
				int local17 = 0;
				while (true) {
					int local21 = local12.indexOf(" ");
					if (local21 == -1) {
						local12 = local12.trim();
						if (local12.length() > 0) {
							local15[local17++] = local12.toLowerCase();
						}
						this.anInt840 = 0;
						label49: for (local21 = 0; local21 < Class17.anInt179; local21++) {
							Class17 local81 = Class17.method104(local21);
							if (local81.anInt182 == -1 && local81.aString7 != null) {
								String local92 = local81.aString7.toLowerCase();
								for ( int local94 = 0; local94 < local17; local94++) {
									if (local92.indexOf(local15[local94]) == -1) {
										continue label49;
									}
								}
								this.aStringArray9[this.anInt840] = local92;
								this.anIntArray219[this.anInt840] = local21;
								this.anInt840++;
								if (this.anInt840 >= this.aStringArray9.length) {
									return;
								}
							}
						}
						return;
					}
					String local30 = local12.substring(0, local21).trim();
					if (local30.length() > 0) {
						local15[local17++] = local30.toLowerCase();
					}
					local12 = local12.substring(local21 + 1);
				}
			}
		} catch ( RuntimeException local139) {
			signlink.reporterror("28494, " + arg0 + ", " + 2 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	private void method590() {
		try {
			this.out.p1isaac(110);
			if (this.anInt941 != -1) {
				this.method619(aBoolean249, this.anInt941);
				this.anInt941 = -1;
				this.aBoolean248 = true;
				this.aBoolean254 = false;
				this.aBoolean225 = true;
			}
			if (this.anInt888 != -1) {
				this.method619(aBoolean249, this.anInt888);
				this.anInt888 = -1;
				this.aBoolean255 = true;
				this.aBoolean254 = false;
			}
			if (this.anInt926 != -1) {
				this.method619(aBoolean249, this.anInt926);
				this.anInt926 = -1;
				this.aBoolean236 = true;
			}
			if (this.anInt880 != -1) {
				this.method619(aBoolean249, this.anInt880);
				this.anInt880 = -1;
			}
			if (this.anInt976 != -1) {
				this.method619(aBoolean249, this.anInt976);
				this.anInt976 = -1;
			}
		} catch ( RuntimeException local89) {
			signlink.reporterror("64395, " + false + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	private void method591( int arg0, byte arg1, Packet arg2) {
		try {
			while (true) {
				if (arg2.bitPos + 10 < arg0 * 8) {
					int local12 = arg2.gBit(11);
					if (local12 != 2047) {
						if (this.players[local12] == null) {
							this.players[local12] = new PlayerEntity();
							if (this.playerAppearanceBuffer[local12] != null) {
								this.players[local12].method545(this.playerAppearanceBuffer[local12]);
							}
						}
						this.anIntArray229[this.anInt884++] = local12;
						PlayerEntity local58 = this.players[local12];
						local58.anInt718 = anInt1050;
						int local66 = arg2.gBit(5);
						if (local66 > 15) {
							local66 -= 32;
						}
						int local75 = arg2.gBit(1);
						if (local75 == 1) {
							this.anIntArray230[this.anInt885++] = local12;
						}
						int local94 = arg2.gBit(1);
						int local99 = arg2.gBit(5);
						if (local99 > 15) {
							local99 -= 32;
						}
						local58.method542(localPlayer.anIntArray194[0] + local99, (byte) 5, local94 == 1, localPlayer.anIntArray193[0] + local66);
						continue;
					}
				}
				arg2.accessBytes();
				boolean local134 = false;
				return;
			}
		} catch ( RuntimeException local140) {
			signlink.reporterror("45666, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	private void method592( byte arg0) {
		try {
			this.aBoolean267 = true;
			boolean local9 = false;
			try {
				long local16 = System.currentTimeMillis();
				int local18 = 0;
				int local20 = 20;
				while (this.aBoolean257) {
					this.anInt945++;
					this.method656((byte) 1);
					this.method656((byte) 1);
					this.method673(47);
					local18++;
					if (local18 > 10) {
						long local43 = System.currentTimeMillis();
						int local52 = (int) (local43 - local16) / 10 - local20;
						local20 = 40 - local52;
						if (local20 < 5) {
							local20 = 5;
						}
						local18 = 0;
						local16 = local43;
					}
					try {
						Thread.sleep((long) local20);
					} catch ( Exception local70) {
					}
				}
			} catch ( Exception local76) {
			}
			this.aBoolean267 = false;
		} catch ( RuntimeException local81) {
			signlink.reporterror("1126, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	private void method593() {
		try {
			for (Class10_Sub2 local10 = (Class10_Sub2) this.spawnedLocations.method6(); local10 != null; local10 = (Class10_Sub2) this.spawnedLocations.method8()) {
				if (local10.anInt453 == -1) {
					local10.anInt458 = 0;
					this.method715(local10);
				} else {
					local10.unlink();
				}
			}
		} catch ( RuntimeException local37) {
			signlink.reporterror("86545, " + 3 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	private void method594( String arg0) {
		System.out.println(arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + arg0 + ".html"));
		} catch ( Exception local21) {
			local21.printStackTrace();
		}
		while (true) {
			while (true) {
				try {
					Thread.sleep(1000L);
				} catch ( Exception local28) {
				}
			}
		}
	}

	@Override
	protected void unload() {
		this.players = null;
		this.anIntArray229 = null;
		this.anIntArray230 = null;
		this.playerAppearanceBuffer = null;
		this.anIntArray269 = null;
		this.aClass19_3 = null;
		this.aClass19_4 = null;
		this.aClass19_5 = null;
		this.aClass19_6 = null;
		this.aClass10_Sub1_Sub1_Sub3_1 = null;
		this.aClass10_Sub1_Sub1_Sub3_2 = null;
		this.aClass10_Sub1_Sub1_Sub3_3 = null;
		this.aClass10_Sub1_Sub1_Sub3_4 = null;
		this.aClass10_Sub1_Sub1_Sub3_5 = null;
		this.aClass10_Sub1_Sub1_Sub3_9 = null;
		this.aClass10_Sub1_Sub1_Sub3_10 = null;
		this.aClass10_Sub1_Sub1_Sub3_11 = null;
		this.aClass10_Sub1_Sub1_Sub3_12 = null;
		this.aClass10_Sub1_Sub1_Sub3_13 = null;
		this.aStringArray8 = null;
		this.aLongArray4 = null;
		this.anIntArray265 = null;
		this.aClass19_12 = null;
		this.aClass19_13 = null;
		this.aClass19_14 = null;
		this.anIntArray244 = null;
		this.anIntArray216 = null;
		this.aByteArrayArray5 = null;
		this.aByteArrayArray6 = null;
		this.anIntArray217 = null;
		this.anIntArray218 = null;
		this.aClass19_24 = null;
		this.aClass19_25 = null;
		this.aClass19_26 = null;
		this.aClass19_27 = null;
		this.anIntArrayArray22 = null;
		this.anIntArrayArray25 = null;
		this.anIntArray254 = null;
		this.anIntArray255 = null;
		this.aClass10_Sub1_Sub1_Sub1_12 = null;
		this.aClass10_Sub1_Sub1_Sub1_13 = null;
		this.aClass10_Sub1_Sub1_Sub1_14 = null;
		this.aClass10_Sub1_Sub1_Sub1_15 = null;
		this.aClass10_Sub1_Sub1_Sub1_16 = null;
		if (this.aClass7_1 != null) {
			this.aClass7_1.aBoolean12 = false;
		}
		this.aClass7_1 = null;
		this.aClass10_Sub1_Sub1_Sub3_6 = null;
		this.aClass10_Sub1_Sub1_Sub3_7 = null;
		this.aClass10_Sub1_Sub1_Sub3_8 = null;
		this.aClass19_7 = null;
		this.aClass19_8 = null;
		this.aClass19_9 = null;
		this.aClass19_10 = null;
		this.aClass19_11 = null;
		this.anIntArrayArrayArray8 = null;
		this.aByteArrayArrayArray8 = null;
		this.aClass23_1 = null;
		this.aClass47Array1 = null;
		this.aClass10_Sub1_Sub1_Sub1_11 = null;
		this.aClass19_22 = null;
		this.aClass19_23 = null;
		this.aClass19_19 = null;
		this.aClass19_20 = null;
		this.aClass19_21 = null;
		this.aClass10_Sub1_Sub1_Sub1_10 = null;
		this.aClass10_Sub1_Sub1_Sub1Array8 = null;
		this.aClass10_Sub1_Sub1_Sub1Array10 = null;
		this.aClass10_Sub1_Sub1_Sub1Array7 = null;
		this.aClass10_Sub1_Sub1_Sub1Array5 = null;
		this.aClass10_Sub1_Sub1_Sub1Array4 = null;
		this.method625();
		this.out = null;
		this.login = null;
		this.in = null;
		this.aClass19_15 = null;
		this.aClass19_16 = null;
		this.aClass19_17 = null;
		this.aClass19_18 = null;
		this.aClass10_Sub1_Sub1_Sub3_16 = null;
		this.aClass10_Sub1_Sub1_Sub3_17 = null;
		this.aClass10_Sub1_Sub1_Sub3_18 = null;
		try {
			if (this.stream != null) {
				this.stream.close();
			}
		} catch ( Exception local254) {
		}
		this.stream = null;
		this.anIntArray246 = null;
		this.anIntArray247 = null;
		this.aClass10_Sub1_Sub1_Sub1Array9 = null;
		this.npcs = null;
		this.anIntArray256 = null;
		this.aByteArray21 = null;
		this.aClass10_Sub1_Sub3_8 = null;
		this.aClass10_Sub1_Sub1_Sub3Array5 = null;
		this.aClass10_Sub1_Sub1_Sub1Array6 = null;
		this.anIntArrayArray23 = null;
		this.aClass10_Sub1_Sub1_Sub3Array2 = null;
		this.projectiles = null;
		this.spotanims = null;
		this.aClass10_Sub1_Sub1_Sub1_7 = null;
		if (this.aClass33_Sub1_1 != null) {
			this.aClass33_Sub1_1.method568();
		}
		this.aClass33_Sub1_1 = null;
		this.anIntArray231 = null;
		this.anIntArray232 = null;
		this.anIntArray233 = null;
		this.anIntArray234 = null;
		this.aStringArray12 = null;
		this.levelObjStacks = null;
		boolean local330 = false;
		this.spawnedLocations = null;
		this.method716();
		Class48.method533();
		Class38.method401();
		Class17.method114();
		Class14.method94();
		Class16.aClass16Array1 = null;
		IdkType.instances = null;
		Class4.aClass4Array1 = null;
		Class15.aClass15Array1 = null;
		Class28.aClass28Array1 = null;
		Class28.aClass34_5 = null;
		Class44.aClass44Array1 = null;
		super.gameSurface = null;
		PlayerEntity.aClass34_9 = null;
		Class10_Sub1_Sub1_Sub4.method506();
		Class23.method189();
		Model.method267();
		Class22.method167();
		System.gc();
	}

	private void method596() {
		try {
			if (super.anInt821 == 1) {
				if (super.anInt822 >= 539 && super.anInt822 <= 573 && super.anInt823 >= 169 && super.anInt823 < 205 && this.anIntArray248[0] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 0;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 569 && super.anInt822 <= 599 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[1] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 1;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 597 && super.anInt822 <= 627 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[2] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 2;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 625 && super.anInt822 <= 669 && super.anInt823 >= 168 && super.anInt823 < 203 && this.anIntArray248[3] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 3;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 666 && super.anInt822 <= 696 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[4] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 4;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 694 && super.anInt822 <= 724 && super.anInt823 >= 168 && super.anInt823 < 205 && this.anIntArray248[5] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 5;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 722 && super.anInt822 <= 756 && super.anInt823 >= 169 && super.anInt823 < 205 && this.anIntArray248[6] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 6;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 540 && super.anInt822 <= 574 && super.anInt823 >= 466 && super.anInt823 < 502 && this.anIntArray248[7] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 7;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 572 && super.anInt822 <= 602 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[8] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 8;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 599 && super.anInt822 <= 629 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[9] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 9;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 627 && super.anInt822 <= 671 && super.anInt823 >= 467 && super.anInt823 < 502 && this.anIntArray248[10] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 10;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 669 && super.anInt822 <= 699 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[11] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 11;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 696 && super.anInt822 <= 726 && super.anInt823 >= 466 && super.anInt823 < 503 && this.anIntArray248[12] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 12;
					this.aBoolean225 = true;
				}
				if (super.anInt822 >= 724 && super.anInt822 <= 758 && super.anInt823 >= 466 && super.anInt823 < 502 && this.anIntArray248[13] != -1) {
					this.aBoolean248 = true;
					this.anInt1031 = 13;
					this.aBoolean225 = true;
					return;
				}
			}
		} catch ( RuntimeException local442) {
			signlink.reporterror("42246, " + false + ", " + local442.toString());
			throw new RuntimeException();
		}
	}

	private void method597( int arg0) {
		try {
			boolean local5 = false;
			try {
				int local11 = localPlayer.anInt739 + this.cameraAnticheatOffsetX;
				int local17 = localPlayer.anInt740 + this.cameraAnticheatOffsetZ;
				if (this.anInt1019 - local11 < -500 || this.anInt1019 - local11 > 500 || this.anInt1020 - local17 < -500 || this.anInt1020 - local17 > 500) {
					this.anInt1019 = local11;
					this.anInt1020 = local17;
				}
				if (this.anInt1019 != local11) {
					this.anInt1019 += (local11 - this.anInt1019) / 16;
				}
				if (this.anInt1020 != local17) {
					this.anInt1020 += (local17 - this.anInt1020) / 16;
				}
				if (super.actionKey[1] == 1) {
					this.anInt1014 += (-this.anInt1014 - 24) / 2;
				} else if (super.actionKey[2] == 1) {
					this.anInt1014 += (24 - this.anInt1014) / 2;
				} else {
					this.anInt1014 /= 2;
				}
				if (super.actionKey[3] == 1) {
					this.anInt1015 += (12 - this.anInt1015) / 2;
				} else if (super.actionKey[4] == 1) {
					this.anInt1015 += (-this.anInt1015 - 12) / 2;
				} else {
					this.anInt1015 /= 2;
				}
				this.orbitCameraYaw = this.orbitCameraYaw + this.anInt1014 / 2 & 0x7FF;
				this.anInt1012 += this.anInt1015 / 2;
				if (this.anInt1012 < 128) {
					this.anInt1012 = 128;
				}
				if (this.anInt1012 > 383) {
					this.anInt1012 = 383;
				}
				int local204 = this.anInt1019 >> 7;
				int local209 = this.anInt1020 >> 7;
				int local219 = this.method685(this.anInt1020, this.anInt1019, this.anInt942);
				int local221 = 0;
				int local237;
				if (local204 > 3 && local209 > 3 && local204 < 100 && local209 < 100) {
					for (local237 = local204 - 4; local237 <= local204 + 4; local237++) {
						for ( int local243 = local209 - 4; local243 <= local209 + 4; local243++) {
							int local248 = this.anInt942;
							if (local248 < 3 && (this.aByteArrayArrayArray8[1][local237][local243] & 0x2) == 2) {
								local248++;
							}
							int local275 = local219 - this.anIntArrayArrayArray8[local248][local237][local243];
							if (local275 > local221) {
								local221 = local275;
							}
						}
					}
				}
				local237 = local221 * 192;
				if (local237 > 98048) {
					local237 = 98048;
				}
				if (local237 < 32768) {
					local237 = 32768;
				}
				if (local237 > this.anInt1033) {
					this.anInt1033 += (local237 - this.anInt1033) / 24;
				} else if (local237 < this.anInt1033) {
					this.anInt1033 += (local237 - this.anInt1033) / 80;
				}
			} catch ( Exception local339) {
				signlink.reporterror("glfc_ex " + localPlayer.anInt739 + "," + localPlayer.anInt740 + "," + this.anInt1019 + "," + this.anInt1020 + "," + this.anInt854 + "," + this.anInt855 + "," + this.anInt914 + "," + this.anInt915);
				throw new RuntimeException("eek");
			}
		} catch ( RuntimeException local389) {
			signlink.reporterror("56921, " + arg0 + ", " + local389.toString());
			throw new RuntimeException();
		}
	}

	private boolean method598( Class14 arg0, int arg1) {
		try {
			boolean local5 = true;
			int local8 = arg0.anInt124;
			if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
				if (local8 >= 801) {
					local8 -= 701;
				} else if (local8 >= 701) {
					local8 -= 601;
				} else if (local8 >= 101) {
					local8 -= 101;
				} else {
					local8--;
				}
				this.aStringArray12[this.menuSize] = "Remove @whi@" + this.aStringArray8[local8];
				this.anIntArray233[this.menuSize] = 775;
				this.menuSize++;
				this.aStringArray12[this.menuSize] = "Message @whi@" + this.aStringArray8[local8];
				this.anIntArray233[this.menuSize] = 984;
				this.menuSize++;
				return true;
			} else if (local8 >= 401 && local8 <= 500) {
				this.aStringArray12[this.menuSize] = "Remove @whi@" + arg0.aString2;
				this.anIntArray233[this.menuSize] = 859;
				this.menuSize++;
				return true;
			} else {
				return false;
			}
		} catch ( RuntimeException local131) {
			signlink.reporterror("52235, " + arg0 + ", " + arg1 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	private void method599( boolean arg0, byte[] arg1, int arg2) {
		try {
			if (this.aBoolean259) {
				signlink.anInt1064 = arg0 ? 1 : 0;
				signlink.midisave(arg1, arg1.length);
				boolean local17 = false;
			}
		} catch ( RuntimeException local19) {
			signlink.reporterror("3007, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	private void validateCharacterDesign(int arg0) {
		try {
			if (arg0 != 0) {
				this.out.p1(186);
			}
			this.aBoolean263 = true;
			for ( int local12 = 0; local12 < 7; local12++) {
				this.anIntArray276[local12] = -1;
				for (int local21 = 0; local21 < IdkType.count; local21++) {
					if (!IdkType.instances[local21].disable && IdkType.instances[local21].type == local12 + (this.aBoolean245 ? 0 : 7)) {
						this.anIntArray276[local12] = local21;
						break;
					}
				}
			}
		} catch ( RuntimeException local58) {
			signlink.reporterror("40333, " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	private void method601( int arg0, int arg1) {
		Class6 local9 = this.levelObjStacks[this.anInt942][arg0][arg1];
		if (local9 == null) {
			this.aClass23_1.method211(this.anInt942, arg0, arg1);
			return;
		}
		int local21 = -99999999;
		Class10_Sub1_Sub2_Sub1 local23 = null;
		Class10_Sub1_Sub2_Sub1 local27;
		for (local27 = (Class10_Sub1_Sub2_Sub1) local9.method6(); local27 != null; local27 = (Class10_Sub1_Sub2_Sub1) local9.method8()) {
			Class17 local32 = Class17.method104(local27.anInt211);
			int local35 = local32.anInt183;
			if (local32.aBoolean52) {
				local35 *= local27.anInt213 + 1;
			}
			if (local35 > local21) {
				local21 = local35;
				local23 = local27;
			}
		}
		local9.method4(local23);
		Class10_Sub1_Sub2_Sub1 local65 = null;
		Class10_Sub1_Sub2_Sub1 local67 = null;
		for (local27 = (Class10_Sub1_Sub2_Sub1) local9.method6(); local27 != null; local27 = (Class10_Sub1_Sub2_Sub1) local9.method8()) {
			if (local27.anInt211 != local23.anInt211 && local65 == null) {
				local65 = local27;
			}
			if (local27.anInt211 != local23.anInt211 && local27.anInt211 != local65.anInt211 && local67 == null) {
				local67 = local27;
			}
		}
		int local110 = arg0 + (arg1 << 7) + 1610612736;
		this.aClass23_1.method197(this.method685(arg1 * 128 + 64, arg0 * 128 + 64, this.anInt942), this.anInt942, local23, local65, local110, local67, arg1, arg0);
	}

	private void method603() {
		try {
			if (this.systemUpdateTimer > 1) {
				this.systemUpdateTimer--;
			}
			if (this.idleTimeout > 0) {
				this.idleTimeout--;
			}
			for ( int local22 = 0; local22 < 5 && this.method608(); local22++) {
			}
			if (this.ingame) {
				Object local41 = this.aClass7_1.anObject1;
				int local66;
				int local68;
				int local70;
				int local103;
				synchronized (this.aClass7_1.anObject1) {
					if (!aBoolean228) {
						this.aClass7_1.anInt54 = 0;
					} else if (super.anInt821 != 0 || this.aClass7_1.anInt54 >= 40) {
						this.out.p1isaac(171);
						this.out.p1(0);
						local66 = this.out.pos;
						local68 = 0;
						int local86;
						for (local70 = 0; local70 < this.aClass7_1.anInt54 && local66 - this.out.pos < 240; local70++) {
							local68++;
							local86 = this.aClass7_1.anIntArray11[local70];
							if (local86 < 0) {
								local86 = 0;
							} else if (local86 > 502) {
								local86 = 502;
							}
							local103 = this.aClass7_1.anIntArray12[local70];
							if (local103 < 0) {
								local103 = 0;
							} else if (local103 > 764) {
								local103 = 764;
							}
							int local120 = local86 * 765 + local103;
							if (this.aClass7_1.anIntArray11[local70] == -1 && this.aClass7_1.anIntArray12[local70] == -1) {
								local103 = -1;
								local86 = -1;
								local120 = 524287;
							}
							if (local103 != this.anInt902 || local86 != this.anInt903) {
								int local165 = local103 - this.anInt902;
								this.anInt902 = local103;
								int local173 = local86 - this.anInt903;
								this.anInt903 = local86;
								if (this.anInt1035 < 8 && local165 >= -32 && local165 <= 31 && local173 >= -32 && local173 <= 31) {
									local165 += 32;
									local173 += 32;
									this.out.p2((this.anInt1035 << 12) + (local165 << 6) + local173);
									this.anInt1035 = 0;
								} else if (this.anInt1035 < 8) {
									this.out.p3((this.anInt1035 << 19) + local120 + 8388608);
									this.anInt1035 = 0;
								} else {
									this.out.p4((this.anInt1035 << 19) + local120 - 1073741824);
									this.anInt1035 = 0;
								}
							} else if (this.anInt1035 < 2047) {
								this.anInt1035++;
							}
						}
						this.out.psize1(this.out.pos - local66);
						if (local68 >= this.aClass7_1.anInt54) {
							this.aClass7_1.anInt54 = 0;
						} else {
							this.aClass7_1.anInt54 -= local68;
							for (local86 = 0; local86 < this.aClass7_1.anInt54; local86++) {
								this.aClass7_1.anIntArray12[local86] = this.aClass7_1.anIntArray12[local86 + local68];
								this.aClass7_1.anIntArray11[local86] = this.aClass7_1.anIntArray11[local86 + local68];
							}
						}
					}
				}
				if (super.anInt821 != 0) {
					long local336 = (super.aLong28 - this.aLong29) / 50L;
					if (local336 > 4095L) {
						local336 = 4095L;
					}
					this.aLong29 = super.aLong28;
					local66 = super.anInt823;
					if (local66 < 0) {
						local66 = 0;
					} else if (local66 > 502) {
						local66 = 502;
					}
					local68 = super.anInt822;
					if (local68 < 0) {
						local68 = 0;
					} else if (local68 > 764) {
						local68 = 764;
					}
					local70 = local66 * 765 + local68;
					byte local382 = 0;
					if (super.anInt821 == 2) {
						local382 = 1;
					}
					local103 = (int) local336;
					this.out.p1isaac(19);
					this.out.p4((local103 << 20) + (local382 << 19) + local70);
				}
				if (this.anInt1021 > 0) {
					this.anInt1021--;
				}
				if (super.actionKey[1] == 1 || super.actionKey[2] == 1 || super.actionKey[3] == 1 || super.actionKey[4] == 1) {
					this.aBoolean258 = true;
				}
				if (this.aBoolean258 && this.anInt1021 <= 0) {
					this.anInt1021 = 20;
					this.aBoolean258 = false;
					this.out.p1isaac(140);
					this.out.method336(this.anInt1012);
					this.out.method336(this.orbitCameraYaw);
				}
				if (super.hasFocus && !this.aBoolean262) {
					this.aBoolean262 = true;
					this.out.p1isaac(187);
					this.out.p1(1);
				}
				if (!super.hasFocus && this.aBoolean262) {
					this.aBoolean262 = false;
					this.out.p1isaac(187);
					this.out.p1(0);
				}
				this.method718();
				this.method611();
				this.method727();
				this.idleNetCycles++;
				if (this.idleNetCycles > 750) {
					this.method634();
				}
				this.method675();
				this.method642();
				this.method660();
				this.anInt878++;
				if (this.anInt909 != 0) {
					this.anInt908 += 20;
					if (this.anInt908 >= 400) {
						this.anInt909 = 0;
					}
				}
				if (this.anInt1056 != 0) {
					this.anInt1053++;
					if (this.anInt1053 >= 15) {
						if (this.anInt1056 == 2) {
							this.aBoolean248 = true;
						}
						if (this.anInt1056 == 3) {
							this.aBoolean255 = true;
						}
						this.anInt1056 = 0;
					}
				}
				if (this.anInt950 != 0) {
					this.anInt1022++;
					if (super.mouseX > this.anInt951 + 5 || super.mouseX < this.anInt951 - 5 || super.mouseY > this.anInt952 + 5 || super.mouseY < this.anInt952 - 5) {
						this.aBoolean246 = true;
					}
					if (super.mouseButton == 0) {
						if (this.anInt950 == 2) {
							this.aBoolean248 = true;
						}
						if (this.anInt950 == 3) {
							this.aBoolean255 = true;
						}
						this.anInt950 = 0;
						if (this.aBoolean246 && this.anInt1022 >= 5) {
							this.anInt931 = -1;
							this.method666();
							if (this.anInt931 == this.anInt948 && this.anInt930 != this.anInt949) {
								Class14 local683 = Class14.method87(this.anInt948);
								byte local685 = 0;
								if (this.anInt879 == 1 && local683.anInt124 == 206) {
									local685 = 1;
								}
								if (local683.anIntArray44[this.anInt930] <= 0) {
									local685 = 0;
								}
								if (local683.aBoolean32) {
									local66 = this.anInt949;
									local68 = this.anInt930;
									local683.anIntArray44[local68] = local683.anIntArray44[local66];
									local683.anIntArray40[local68] = local683.anIntArray40[local66];
									local683.anIntArray44[local66] = -1;
									local683.anIntArray40[local66] = 0;
								} else if (local685 == 1) {
									local66 = this.anInt949;
									local68 = this.anInt930;
									while (local66 != local68) {
										if (local66 > local68) {
											local683.method88(local66 - 1, local66);
											local66--;
										} else if (local66 < local68) {
											local683.method88(local66 + 1, local66);
											local66++;
										}
									}
								} else {
									local683.method88(this.anInt930, this.anInt949);
								}
								this.out.p1isaac(123);
								this.out.method338(this.anInt930);
								this.out.method327(local685);
								this.out.method337(this.anInt948);
								this.out.method336(this.anInt949);
							}
						} else if ((this.anInt1036 == 1 || this.method701(this.menuSize - 1, this.aByte51)) && this.menuSize > 2) {
							this.method683();
						} else if (this.menuSize > 0) {
							this.method695(this.menuSize - 1);
						}
						this.anInt1053 = 10;
						super.anInt821 = 0;
					}
				}
				int local860;
				int local862;
				if (Class23.anInt307 != -1) {
					local860 = Class23.anInt307;
					local862 = Class23.anInt308;
					boolean local883 = this.method610(true, local862, localPlayer.anIntArray194[0], 0, 0, 0, 0, local860, 0, 0, localPlayer.anIntArray193[0]);
					Class23.anInt307 = -1;
					if (local883) {
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 1;
						this.anInt908 = 0;
					}
				}
				if (super.anInt821 == 1 && this.aString26 != null) {
					this.aString26 = null;
					this.aBoolean255 = true;
					super.anInt821 = 0;
				}
				this.method629();
				if (this.anInt926 == -1) {
					this.method721();
					this.method596();
					this.method614();
				}
				if (super.mouseButton == 1 || super.anInt821 == 1) {
					this.anInt943++;
				}
				if (this.anInt1030 == 0 && this.anInt918 == 0 && this.anInt959 == 0) {
					if (this.anInt856 > 0) {
						this.anInt856--;
					}
				} else if (this.anInt856 < 100) {
					this.anInt856++;
					if (this.anInt856 == 100) {
						if (this.anInt1030 != 0) {
							this.aBoolean255 = true;
						}
						if (this.anInt918 != 0) {
							this.aBoolean248 = true;
						}
					}
				}
				if (this.sceneState == 2) {
					this.method597(409);
				}
				if (this.sceneState == 2 && this.aBoolean252) {
					this.method604(this.aBoolean227);
				}
				for (local860 = 0; local860 < 5; local860++) {
					int local1020 = this.anIntArray257[local860]++;
				}
				this.method605((byte) 2);
				super.idleCycles++;
				if (super.idleCycles > 4500) {
					this.idleTimeout = 250;
					super.idleCycles -= 500;
					this.out.p1isaac(202);
				}
				this.anInt953++;
				if (this.anInt953 > 500) {
					this.anInt953 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.cameraAnticheatOffsetX += this.anInt836;
					}
					if ((local862 & 0x2) == 2) {
						this.cameraAnticheatOffsetZ += this.anInt901;
					}
					if ((local862 & 0x4) == 4) {
						this.cameraAnticheatAngle += this.anInt1017;
					}
				}
				if (this.cameraAnticheatOffsetX < -50) {
					this.anInt836 = 2;
				}
				if (this.cameraAnticheatOffsetX > 50) {
					this.anInt836 = -2;
				}
				if (this.cameraAnticheatOffsetZ < -55) {
					this.anInt901 = 2;
				}
				if (this.cameraAnticheatOffsetZ > 55) {
					this.anInt901 = -2;
				}
				if (this.cameraAnticheatAngle < -40) {
					this.anInt1017 = 1;
				}
				if (this.cameraAnticheatAngle > 40) {
					this.anInt1017 = -1;
				}
				this.anInt919++;
				if (this.anInt919 > 500) {
					this.anInt919 = 0;
					local862 = (int) (Math.random() * 8.0D);
					if ((local862 & 0x1) == 1) {
						this.minimapAnticheatAngle += this.anInt865;
					}
					if ((local862 & 0x2) == 2) {
						this.minimapZoom += this.anInt1004;
					}
				}
				if (this.minimapAnticheatAngle < -60) {
					this.anInt865 = 2;
				}
				if (this.minimapAnticheatAngle > 60) {
					this.anInt865 = -2;
				}
				if (this.minimapZoom < -20) {
					this.anInt1004 = 1;
				}
				if (this.minimapZoom > 10) {
					this.anInt1004 = -1;
				}
				this.anInt846++;
				if (this.anInt846 > 50) {
					this.out.p1isaac(40);
				}
				try {
					if (this.stream != null && this.out.pos > 0) {
						this.stream.write(this.out.pos, this.out.data);
						this.out.pos = 0;
						this.anInt846 = 0;
					}
				} catch ( IOException local1270) {
					this.method634();
				} catch ( Exception local1275) {
					this.method699();
				}
			}
		} catch ( RuntimeException local1280) {
			signlink.reporterror("71494, " + 4 + ", " + local1280.toString());
			throw new RuntimeException();
		}
	}

	private void method604( boolean arg0) {
		try {
			int local6 = this.anInt848 * 128 + 64;
			int local13 = this.anInt849 * 128 + 64;
			int local24 = this.method685(local13, local6, this.anInt942) - this.anInt850;
			if (this.anInt990 < local6) {
				this.anInt990 += this.anInt851 + (local6 - this.anInt990) * this.anInt852 / 1000;
				if (this.anInt990 > local6) {
					this.anInt990 = local6;
				}
			}
			if (this.anInt990 > local6) {
				this.anInt990 -= this.anInt851 + (this.anInt990 - local6) * this.anInt852 / 1000;
				if (this.anInt990 < local6) {
					this.anInt990 = local6;
				}
			}
			if (this.anInt991 < local24) {
				this.anInt991 += this.anInt851 + (local24 - this.anInt991) * this.anInt852 / 1000;
				if (this.anInt991 > local24) {
					this.anInt991 = local24;
				}
			}
			if (this.anInt991 > local24) {
				this.anInt991 -= this.anInt851 + (this.anInt991 - local24) * this.anInt852 / 1000;
				if (this.anInt991 < local24) {
					this.anInt991 = local24;
				}
			}
			if (this.anInt992 < local13) {
				this.anInt992 += this.anInt851 + (local13 - this.anInt992) * this.anInt852 / 1000;
				if (this.anInt992 > local13) {
					this.anInt992 = local13;
				}
			}
			if (this.anInt992 > local13) {
				this.anInt992 -= this.anInt851 + (this.anInt992 - local13) * this.anInt852 / 1000;
				if (this.anInt992 < local13) {
					this.anInt992 = local13;
				}
			}
			local6 = this.anInt892 * 128 + 64;
			local13 = this.anInt893 * 128 + 64;
			local24 = this.method685(local13, local6, this.anInt942) - this.anInt894;
			int local222 = local6 - this.anInt990;
			int local227 = local24 - this.anInt991;
			int local232 = local13 - this.anInt992;
			int local243 = (int) Math.sqrt((double) (local222 * local222 + local232 * local232));
			int local254 = (int) (Math.atan2((double) local227, (double) local243) * 325.949D) & 0x7FF;
			int local258;
			if (!arg0) {
				for (local258 = 1; local258 > 0; local258++) {
				}
			}
			local258 = (int) (Math.atan2((double) local222, (double) local232) * -325.949D) & 0x7FF;
			if (local254 < 128) {
				local254 = 128;
			}
			if (local254 > 383) {
				local254 = 383;
			}
			if (this.anInt993 < local254) {
				this.anInt993 += this.anInt895 + (local254 - this.anInt993) * this.anInt896 / 1000;
				if (this.anInt993 > local254) {
					this.anInt993 = local254;
				}
			}
			if (this.anInt993 > local254) {
				this.anInt993 -= this.anInt895 + (this.anInt993 - local254) * this.anInt896 / 1000;
				if (this.anInt993 < local254) {
					this.anInt993 = local254;
				}
			}
			int local345 = local258 - this.anInt994;
			if (local345 > 1024) {
				local345 -= 2048;
			}
			if (local345 < -1024) {
				local345 += 2048;
			}
			if (local345 > 0) {
				this.anInt994 += this.anInt895 + local345 * this.anInt896 / 1000;
				this.anInt994 &= 0x7FF;
			}
			if (local345 < 0) {
				this.anInt994 -= this.anInt895 + -local345 * this.anInt896 / 1000;
				this.anInt994 &= 0x7FF;
			}
			int local403 = local258 - this.anInt994;
			if (local403 > 1024) {
				local403 -= 2048;
			}
			if (local403 < -1024) {
				local403 += 2048;
			}
			if (local403 < 0 && local345 > 0 || local403 > 0 && local345 < 0) {
				this.anInt994 = local258;
			}
		} catch ( RuntimeException local424) {
			signlink.reporterror("53041, " + arg0 + ", " + local424.toString());
			throw new RuntimeException();
		}
	}

	private void method605( byte arg0) {
		try {
			boolean local6 = false;
			while (true) {
				int local13;
				do {
					while (true) {
						local13 = this.pollKey();
						if (local13 == -1) {
							return;
						}
						if (this.anInt976 != -1 && this.anInt976 == this.anInt1002) {
							if (local13 == 8 && this.aString17.length() > 0) {
								this.aString17 = this.aString17.substring(0, this.aString17.length() - 1);
							}
							break;
						}
						int local193;
						if (this.aBoolean216) {
							if (local13 >= 32 && local13 <= 122 && this.aString24.length() < 80) {
								this.aString24 = this.aString24 + (char) local13;
								this.aBoolean255 = true;
							}
							if (local13 == 8 && this.aString24.length() > 0) {
								this.aString24 = this.aString24.substring(0, this.aString24.length() - 1);
								this.aBoolean255 = true;
							}
							if (local13 == 13 || local13 == 10) {
								this.aBoolean216 = false;
								this.aBoolean255 = true;
								long local153;
								if (this.anInt995 == 1) {
									local153 = Class26.method248(this.aString24);
									this.method677(local153);
								}
								if (this.anInt995 == 2 && this.anInt838 > 0) {
									local153 = Class26.method248(this.aString24);
									this.method628(local153);
								}
								if (this.anInt995 == 3 && this.aString24.length() > 0) {
									this.out.p1isaac(227);
									this.out.p1(0);
									local193 = this.out.pos;
									this.out.p8(this.aLong31);
									Class32.method372(this.aString24, this.out);
									this.out.psize1(this.out.pos - local193);
									this.aString24 = Class32.method373(this.aString24);
									this.aString24 = Class46.method452(this.aString24);
									this.method622(Class26.method252(Class26.method249(this.aLong31), (byte) 7), this.aString24, 6);
									if (this.anInt853 == 2) {
										this.anInt853 = 1;
										this.aBoolean253 = true;
										this.out.p1isaac(176);
										this.out.p1(this.anInt899);
										this.out.p1(this.anInt853);
										this.out.p1(this.anInt1000);
									}
								}
								if (this.anInt995 == 4 && this.anInt837 < 100) {
									local153 = Class26.method248(this.aString24);
									this.method665(this.anInt971, local153);
								}
								if (this.anInt995 == 5 && this.anInt837 > 0) {
									local153 = Class26.method248(this.aString24);
									this.method672(325, local153);
								}
							}
						} else if (this.anInt1010 == 1) {
							if (local13 >= 48 && local13 <= 57 && this.aString20.length() < 10) {
								this.aString20 = this.aString20 + (char) local13;
								this.aBoolean255 = true;
							}
							if (local13 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
								this.aBoolean255 = true;
							}
							if (local13 == 13 || local13 == 10) {
								if (this.aString20.length() > 0) {
									local193 = 0;
									try {
										local193 = Integer.parseInt(this.aString20);
									} catch ( Exception local371) {
									}
									this.out.p1isaac(75);
									this.out.p4(local193);
								}
								this.anInt1010 = 0;
								this.aBoolean255 = true;
							}
						} else if (this.anInt1010 == 2) {
							if (local13 >= 32 && local13 <= 122 && this.aString20.length() < 12) {
								this.aString20 = this.aString20 + (char) local13;
								this.aBoolean255 = true;
							}
							if (local13 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
								this.aBoolean255 = true;
							}
							if (local13 == 13 || local13 == 10) {
								if (this.aString20.length() > 0) {
									this.out.p1isaac(206);
									this.out.p8(Class26.method248(this.aString20));
								}
								this.anInt1010 = 0;
								this.aBoolean255 = true;
							}
						} else if (this.anInt1010 == 3) {
							if (local13 >= 32 && local13 <= 122 && this.aString20.length() < 40) {
								this.aString20 = this.aString20 + (char) local13;
								this.aBoolean255 = true;
							}
							if (local13 == 8 && this.aString20.length() > 0) {
								this.aString20 = this.aString20.substring(0, this.aString20.length() - 1);
								this.aBoolean255 = true;
							}
						} else if (this.anInt888 == -1 && this.anInt926 == -1) {
							if (local13 >= 32 && local13 <= 122 && this.aString29.length() < 80) {
								this.aString29 = this.aString29 + (char) local13;
								this.aBoolean255 = true;
							}
							if (local13 == 8 && this.aString29.length() > 0) {
								this.aString29 = this.aString29.substring(0, this.aString29.length() - 1);
								this.aBoolean255 = true;
							}
							if ((local13 == 13 || local13 == 10) && this.aString29.length() > 0) {
								if (this.anInt842 == 2) {
									if (this.aString29.equals("::clientdrop")) {
										this.method634();
									}
									if (this.aString29.equals("::lag")) {
										this.printDebug();
									}
									if (this.aString29.equals("::prefetchmusic")) {
										for (local193 = 0; local193 < this.aClass33_Sub1_1.method569(2); local193++) {
											this.aClass33_Sub1_1.method556(2, (byte) 1, local193);
										}
									}
									if (this.aString29.equals("::fpson")) {
										aBoolean217 = true;
									}
									if (this.aString29.equals("::fpsoff")) {
										aBoolean217 = false;
									}
									if (this.aString29.equals("::noclip")) {
										for (local193 = 0; local193 < 4; local193++) {
											for ( int local656 = 1; local656 < 103; local656++) {
												for ( int local660 = 1; local660 < 103; local660++) {
													this.aClass47Array1[local193].anIntArrayArray16[local656][local660] = 0;
												}
											}
										}
									}
								}
								if (this.aString29.startsWith("::")) {
									this.out.p1isaac(56);
									this.out.p1(this.aString29.length() - 1);
									this.out.pjstr(this.aString29.substring(2));
								} else {
									String local715 = this.aString29.toLowerCase();
									byte local717 = 0;
									if (local715.startsWith("yellow:")) {
										local717 = 0;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("red:")) {
										local717 = 1;
										this.aString29 = this.aString29.substring(4);
									} else if (local715.startsWith("green:")) {
										local717 = 2;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("cyan:")) {
										local717 = 3;
										this.aString29 = this.aString29.substring(5);
									} else if (local715.startsWith("purple:")) {
										local717 = 4;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("white:")) {
										local717 = 5;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("flash1:")) {
										local717 = 6;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("flash2:")) {
										local717 = 7;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("flash3:")) {
										local717 = 8;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("glow1:")) {
										local717 = 9;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("glow2:")) {
										local717 = 10;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("glow3:")) {
										local717 = 11;
										this.aString29 = this.aString29.substring(6);
									}
									local715 = this.aString29.toLowerCase();
									byte local889 = 0;
									if (local715.startsWith("wave:")) {
										local889 = 1;
										this.aString29 = this.aString29.substring(5);
									} else if (local715.startsWith("wave2:")) {
										local889 = 2;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("shake:")) {
										local889 = 3;
										this.aString29 = this.aString29.substring(6);
									} else if (local715.startsWith("scroll:")) {
										local889 = 4;
										this.aString29 = this.aString29.substring(7);
									} else if (local715.startsWith("slide:")) {
										local889 = 5;
										this.aString29 = this.aString29.substring(6);
									}
									this.out.p1isaac(49);
									this.out.p1(0);
									int local970 = this.out.pos;
									this.out.method328(local717);
									this.out.method327(local889);
									this.aClass10_Sub1_Sub3_8.pos = 0;
									Class32.method372(this.aString29, this.aClass10_Sub1_Sub3_8);
									this.out.pdata(this.aClass10_Sub1_Sub3_8.data, this.aClass10_Sub1_Sub3_8.pos);
									this.out.psize1(this.out.pos - local970);
									this.aString29 = Class32.method373(this.aString29);
									this.aString29 = Class46.method452(this.aString29);
									localPlayer.aString13 = this.aString29;
									localPlayer.anInt716 = local717;
									localPlayer.anInt722 = local889;
									localPlayer.anInt715 = 150;
									if (this.anInt842 == 2) {
										this.method622("@cr2@" + localPlayer.aString14, localPlayer.aString13, 2);
									} else if (this.anInt842 == 1) {
										this.method622("@cr1@" + localPlayer.aString14, localPlayer.aString13, 2);
									} else {
										this.method622(localPlayer.aString14, localPlayer.aString13, 2);
									}
									if (this.anInt899 == 2) {
										this.anInt899 = 3;
										this.aBoolean253 = true;
										this.out.p1isaac(176);
										this.out.p1(this.anInt899);
										this.out.p1(this.anInt853);
										this.out.p1(this.anInt1000);
									}
								}
								this.aString29 = "";
								this.aBoolean255 = true;
							}
						}
					}
				} while ((local13 < 97 || local13 > 122) && (local13 < 65 || local13 > 90) && (local13 < 48 || local13 > 57) && local13 != 32);
				if (this.aString17.length() < 12) {
					this.aString17 = this.aString17 + (char) local13;
				}
			}
		} catch ( RuntimeException local1123) {
			signlink.reporterror("42228, " + arg0 + ", " + local1123.toString());
			throw new RuntimeException();
		}
	}

	private DataInputStream method606( String arg0) throws IOException {
		if (this.aBoolean219) {
			if (this.aSocket3 != null) {
				try {
					this.aSocket3.close();
				} catch ( Exception local26) {
				}
				this.aSocket3 = null;
			}
			this.aSocket3 = this.openSocket(43595);
			this.aSocket3.setSoTimeout(10000);
			InputStream local42 = this.aSocket3.getInputStream();
			OutputStream local46 = this.aSocket3.getOutputStream();
			local46.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(local42);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	public Socket openSocket(int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	private boolean method608() {
		try {
			if (this.stream == null) {
				return false;
			}
			String local1321;
			int local170;
			try {
				int local20 = this.stream.available();
				if (local20 == 0) {
					return false;
				}
				if (this.packetType == -1) {
					this.stream.read(this.in.data, 0, 1);
					this.packetType = this.in.data[0] & 0xFF;
					if (this.randomIn != null) {
						this.packetType = this.packetType - this.randomIn.nextInt() & 0xFF;
					}
					this.packetSize = Class13.anIntArray34[this.packetType];
					local20--;
				}
				if (this.packetSize == -1) {
					if (local20 <= 0) {
						return false;
					}
					this.stream.read(this.in.data, 0, 1);
					this.packetSize = this.in.data[0] & 0xFF;
					local20--;
				}
				if (this.packetSize == -2) {
					if (local20 <= 1) {
						return false;
					}
					this.stream.read(this.in.data, 0, 2);
					this.in.pos = 0;
					this.packetSize = this.in.g2();
					local20 -= 2;
				}
				if (local20 < this.packetSize) {
					return false;
				}
				this.in.pos = 0;
				this.stream.read(this.in.data, 0, this.packetSize);
				this.idleNetCycles = 0;
				this.lastPacketType2 = this.lastPacketType1;
				this.lastPacketType1 = this.lastPacketType0;
				this.lastPacketType0 = this.packetType;
				int local165;
				int local174;
				if (this.packetType == 166) {
					local165 = this.in.method342();
					local170 = this.in.method342();
					local174 = this.in.g2();
					Class14 local177 = Class14.method87(local174);
					local177.anInt117 = local170;
					local177.anInt134 = local165;
					this.packetType = -1;
					return true;
				}
				int local212;
				if (this.packetType == 186) {
					local165 = this.in.method340();
					local170 = this.in.method341();
					local174 = this.in.method340();
					local212 = this.in.method339();
					Class14.method87(local170).anInt130 = local165;
					Class14.method87(local170).anInt131 = local212;
					Class14.method87(local170).anInt129 = local174;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 216) {
					local165 = this.in.method341();
					local170 = this.in.method341();
					Class14.method87(local170).anInt145 = 1;
					Class14.method87(local170).anInt146 = local165;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 26) {
					local165 = this.in.g2();
					local170 = this.in.g1();
					local174 = this.in.g2();
					if (local174 == 65535) {
						if (this.waveCount < 50) {
							this.anIntArray251[this.waveCount] = (short) local165;
							this.anIntArray275[this.waveCount] = local170;
							this.anIntArray264[this.waveCount] = 0;
							this.waveCount++;
						}
					} else if (this.aBoolean265 && !lowMemory && this.waveCount < 50) {
						this.anIntArray251[this.waveCount] = local165;
						this.anIntArray275[this.waveCount] = local170;
						this.anIntArray264[this.waveCount] = local174 + Class39.anIntArray171[local165];
						this.waveCount++;
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 182) {
					local165 = this.in.method340();
					byte local362 = this.in.method335();
					this.anIntArray240[local165] = local362;
					if (this.anIntArray244[local165] != local362) {
						this.anIntArray244[local165] = local362;
						this.method680(local165);
						this.aBoolean248 = true;
						if (this.anInt985 != -1) {
							this.aBoolean255 = true;
						}
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 13) {
					for (local165 = 0; local165 < this.players.length; local165++) {
						if (this.players[local165] != null) {
							this.players[local165].anInt753 = -1;
						}
					}
					for (local170 = 0; local170 < this.npcs.length; local170++) {
						if (this.npcs[local170] != null) {
							this.npcs[local170].anInt753 = -1;
						}
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 156) {
					this.anInt923 = this.in.g1();
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 162) {
					local165 = this.in.method340();
					local170 = this.in.method339();
					Class14.method87(local170).anInt145 = 2;
					Class14.method87(local170).anInt146 = local165;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 109) {
					local165 = this.in.g2();
					this.method687(local165);
					if (this.anInt941 != -1) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = -1;
						this.aBoolean248 = true;
						this.aBoolean225 = true;
					}
					if (this.anInt926 != -1) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = -1;
						this.aBoolean236 = true;
					}
					if (this.anInt880 != -1) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = -1;
					}
					if (this.anInt976 != -1) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt888 != local165) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = local165;
					}
					this.aBoolean254 = false;
					this.aBoolean255 = true;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 220) {
					local165 = this.in.method341();
					if (local165 == 65535) {
						local165 = -1;
					}
					if (local165 != this.anInt1051 && this.aBoolean259 && !lowMemory && this.anInt958 == 0) {
						this.anInt1023 = local165;
						this.aBoolean260 = true;
						this.aClass33_Sub1_1.method558(2, this.anInt1023);
					}
					this.anInt1051 = local165;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 249) {
					local165 = this.in.method339();
					local170 = this.in.method344();
					if (this.aBoolean259 && !lowMemory) {
						this.anInt1023 = local165;
						this.aBoolean260 = false;
						this.aClass33_Sub1_1.method558(2, this.anInt1023);
						this.anInt958 = local170;
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 158) {
					local165 = this.in.method342();
					if (local165 != this.anInt985) {
						this.method619(aBoolean249, this.anInt985);
						this.anInt985 = local165;
					}
					this.aBoolean255 = true;
					this.packetType = -1;
					return true;
				}
				int local724;
				if (this.packetType == 218) {
					local165 = this.in.g2();
					local170 = this.in.method340();
					local174 = local170 >> 10 & 0x1F;
					local212 = local170 >> 5 & 0x1F;
					local724 = local170 & 0x1F;
					Class14.method87(local165).anInt122 = (local174 << 19) + (local212 << 11) + (local724 << 3);
					this.packetType = -1;
					return true;
				}
				String local756;
				if (this.packetType == 157) {
					local165 = this.in.method331();
					local756 = this.in.gjstr();
					local174 = this.in.g1();
					if (local165 >= 1 && local165 <= 5) {
						if (local756.equalsIgnoreCase("null")) {
							local756 = null;
						}
						this.aStringArray11[local165 - 1] = local756;
						this.aBooleanArray12[local165 - 1] = local174 == 0;
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 6) {
					this.aBoolean216 = false;
					this.anInt1010 = 2;
					this.aString20 = "";
					this.aBoolean255 = true;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 201) {
					this.anInt899 = this.in.g1();
					this.anInt853 = this.in.g1();
					this.anInt1000 = this.in.g1();
					this.aBoolean253 = true;
					this.aBoolean255 = true;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 199) {
					this.hintType = this.in.g1();
					if (this.hintType == 1) {
						this.anInt999 = this.in.g2();
					}
					if (this.hintType >= 2 && this.hintType <= 6) {
						if (this.hintType == 2) {
							this.anInt831 = 64;
							this.anInt832 = 64;
						}
						if (this.hintType == 3) {
							this.anInt831 = 0;
							this.anInt832 = 64;
						}
						if (this.hintType == 4) {
							this.anInt831 = 128;
							this.anInt832 = 64;
						}
						if (this.hintType == 5) {
							this.anInt831 = 64;
							this.anInt832 = 0;
						}
						if (this.hintType == 6) {
							this.anInt831 = 64;
							this.anInt832 = 128;
						}
						this.hintType = 2;
						this.anInt828 = this.in.g2();
						this.anInt829 = this.in.g2();
						this.anInt830 = this.in.g1();
					}
					if (this.hintType == 10) {
						this.anInt969 = this.in.g2();
					}
					this.packetType = -1;
					return true;
				}
				int local1030;
				int local1041;
				if (this.packetType == 167) {
					this.aBoolean252 = true;
					this.anInt892 = this.in.g1();
					this.anInt893 = this.in.g1();
					this.anInt894 = this.in.g2();
					this.anInt895 = this.in.g1();
					this.anInt896 = this.in.g1();
					if (this.anInt896 >= 100) {
						local165 = this.anInt892 * 128 + 64;
						local170 = this.anInt893 * 128 + 64;
						local174 = this.method685(local170, local165, this.anInt942) - this.anInt894;
						local212 = local165 - this.anInt990;
						local724 = local174 - this.anInt991;
						local1030 = local170 - this.anInt992;
						local1041 = (int) Math.sqrt((double) (local212 * local212 + local1030 * local1030));
						this.anInt993 = (int) (Math.atan2((double) local724, (double) local1041) * 325.949D) & 0x7FF;
						this.anInt994 = (int) (Math.atan2((double) local212, (double) local1030) * -325.949D) & 0x7FF;
						if (this.anInt993 < 128) {
							this.anInt993 = 128;
						}
						if (this.anInt993 > 383) {
							this.anInt993 = 383;
						}
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 5) {
					this.method699();
					this.packetType = -1;
					return false;
				}
				if (this.packetType == 115) {
					local165 = this.in.method347();
					local170 = this.in.method339();
					this.anIntArray240[local170] = local165;
					if (this.anIntArray244[local170] != local165) {
						this.anIntArray244[local170] = local165;
						this.method680(local170);
						this.aBoolean248 = true;
						if (this.anInt985 != -1) {
							this.aBoolean255 = true;
						}
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 29) {
					if (this.anInt941 != -1) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = -1;
						this.aBoolean248 = true;
						this.aBoolean225 = true;
					}
					if (this.anInt888 != -1) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt926 != -1) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = -1;
						this.aBoolean236 = true;
					}
					if (this.anInt880 != -1) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = -1;
					}
					if (this.anInt976 != -1) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt1010 != 0) {
						this.anInt1010 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean254 = false;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 76) {
					this.anInt939 = this.in.method339();
					this.anInt935 = this.in.method341();
					this.in.g2();
					this.anInt987 = this.in.g2();
					this.anInt977 = this.in.method339();
					this.anInt1025 = this.in.method340();
					this.anInt989 = this.in.method340();
					this.anInt891 = this.in.g2();
					this.anInt1009 = this.in.method345();
					this.anInt912 = this.in.method341();
					this.in.method330();
					signlink.dnslookup(Class26.method251(this.anInt1009));
					this.packetType = -1;
					return true;
				}
				boolean local1337;
				String local1472;
				if (this.packetType == 63) {
					local1321 = this.in.gjstr();
					long local1335;
					if (local1321.endsWith(":tradereq:")) {
						local756 = local1321.substring(0, local1321.indexOf(":"));
						local1335 = Class26.method248(local756);
						local1337 = false;
						for (local1030 = 0; local1030 < this.anInt837; local1030++) {
							if (this.aLongArray3[local1030] == local1335) {
								local1337 = true;
								break;
							}
						}
						if (!local1337 && this.anInt1011 == 0) {
							this.method622(local756, "wishes to trade with you.", 4);
						}
					} else if (local1321.endsWith(":duelreq:")) {
						local756 = local1321.substring(0, local1321.indexOf(":"));
						local1335 = Class26.method248(local756);
						local1337 = false;
						for (local1030 = 0; local1030 < this.anInt837; local1030++) {
							if (this.aLongArray3[local1030] == local1335) {
								local1337 = true;
								break;
							}
						}
						if (!local1337 && this.anInt1011 == 0) {
							this.method622(local756, "wishes to duel with you.", 8);
						}
					} else if (local1321.endsWith(":chalreq:")) {
						local756 = local1321.substring(0, local1321.indexOf(":"));
						local1335 = Class26.method248(local756);
						local1337 = false;
						for (local1030 = 0; local1030 < this.anInt837; local1030++) {
							if (this.aLongArray3[local1030] == local1335) {
								local1337 = true;
								break;
							}
						}
						if (!local1337 && this.anInt1011 == 0) {
							local1472 = local1321.substring(local1321.indexOf(":") + 1, local1321.length() - 9);
							this.method622(local756, local1472, 8);
						}
					} else {
						this.method622("", local1321, 0);
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 50) {
					local165 = this.in.g2b();
					if (local165 >= 0) {
						this.method687(local165);
					}
					if (local165 != this.anInt1027) {
						this.method619(aBoolean249, this.anInt1027);
						this.anInt1027 = local165;
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 82) {
					boolean local1535 = this.in.g1() == 1;
					local170 = this.in.g2();
					Class14.method87(local170).aBoolean33 = local1535;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 174) {
					if (this.anInt1031 == 12) {
						this.aBoolean248 = true;
					}
					this.anInt911 = this.in.g2b();
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 233) {
					this.anInt1047 = this.in.g1();
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 61) {
					this.anInt955 = 0;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 128) {
					local165 = this.in.method340();
					local170 = this.in.method341();
					if (this.anInt888 != -1) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt926 != -1) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = -1;
						this.aBoolean236 = true;
					}
					if (this.anInt880 != -1) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = -1;
					}
					if (this.anInt976 != local165) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = local165;
					}
					if (this.anInt941 != local170) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = local170;
					}
					if (this.anInt1010 != 0) {
						this.anInt1010 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean248 = true;
					this.aBoolean225 = true;
					this.aBoolean254 = false;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 67) {
					local165 = this.in.g1();
					local170 = this.in.g1();
					local174 = this.in.g1();
					local212 = this.in.g1();
					this.aBooleanArray11[local165] = true;
					this.anIntArray253[local165] = local170;
					this.anIntArray215[local165] = local174;
					this.anIntArray235[local165] = local212;
					this.anIntArray257[local165] = 0;
					this.packetType = -1;
					return true;
				}
				Class14 local1762;
				if (this.packetType == 134) {
					this.aBoolean248 = true;
					local165 = this.in.g2();
					local1762 = Class14.method87(local165);
					while (this.in.pos < this.packetSize) {
						local174 = this.in.gsmarts();
						local212 = this.in.g2();
						local724 = this.in.g1();
						if (local724 == 255) {
							local724 = this.in.g4();
						}
						if (local174 >= 0 && local174 < local1762.anIntArray44.length) {
							local1762.anIntArray44[local174] = local212;
							local1762.anIntArray40[local174] = local724;
						}
					}
					this.packetType = -1;
					return true;
				}
				int local1967;
				long local1820;
				if (this.packetType == 78) {
					local1820 = this.in.g8();
					local174 = this.in.g1();
					String local1830 = Class26.method252(Class26.method249(local1820), (byte) 7);
					for (local724 = 0; local724 < this.anInt838; local724++) {
						if (local1820 == this.aLongArray4[local724]) {
							if (this.anIntArray265[local724] != local174) {
								this.anIntArray265[local724] = local174;
								this.aBoolean248 = true;
								if (local174 > 0) {
									this.method622("", local1830 + " has logged in.", 5);
								}
								if (local174 == 0) {
									this.method622("", local1830 + " has logged out.", 5);
								}
							}
							local1830 = null;
							break;
						}
					}
					if (local1830 != null && this.anInt838 < 200) {
						this.aLongArray4[this.anInt838] = local1820;
						this.aStringArray8[this.anInt838] = local1830;
						this.anIntArray265[this.anInt838] = local174;
						this.anInt838++;
						this.aBoolean248 = true;
					}
					boolean local1928 = false;
					while (!local1928) {
						local1928 = true;
						for (local1041 = 0; local1041 < this.anInt838 - 1; local1041++) {
							if (this.anIntArray265[local1041] != nodeId && this.anIntArray265[local1041 + 1] == nodeId || this.anIntArray265[local1041] == 0 && this.anIntArray265[local1041 + 1] != 0) {
								local1967 = this.anIntArray265[local1041];
								this.anIntArray265[local1041] = this.anIntArray265[local1041 + 1];
								this.anIntArray265[local1041 + 1] = local1967;
								String local1989 = this.aStringArray8[local1041];
								this.aStringArray8[local1041] = this.aStringArray8[local1041 + 1];
								this.aStringArray8[local1041 + 1] = local1989;
								long local2011 = this.aLongArray4[local1041];
								this.aLongArray4[local1041] = this.aLongArray4[local1041 + 1];
								this.aLongArray4[local1041 + 1] = local2011;
								this.aBoolean248 = true;
								local1928 = false;
							}
						}
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 58) {
					this.aBoolean216 = false;
					this.anInt1010 = 1;
					this.aString20 = "";
					this.aBoolean255 = true;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 252) {
					this.anInt1031 = this.in.method331();
					this.aBoolean248 = true;
					this.aBoolean225 = true;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 40) {
					this.anInt890 = this.in.method332(this.anInt1006);
					this.anInt889 = this.in.method331();
					for (local165 = this.anInt889; local165 < this.anInt889 + 8; local165++) {
						for (local170 = this.anInt890; local170 < this.anInt890 + 8; local170++) {
							if (this.levelObjStacks[this.anInt942][local165][local170] != null) {
								this.levelObjStacks[this.anInt942][local165][local170] = null;
								this.method601(local165, local170);
							}
						}
					}
					for (Class10_Sub2 local2159 = (Class10_Sub2) this.spawnedLocations.method6(); local2159 != null; local2159 = (Class10_Sub2) this.spawnedLocations.method8()) {
						if (local2159.anInt456 >= this.anInt889 && local2159.anInt456 < this.anInt889 + 8 && local2159.anInt457 >= this.anInt890 && local2159.anInt457 < this.anInt890 + 8 && local2159.anInt454 == this.anInt942) {
							local2159.anInt453 = 0;
						}
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 255) {
					local165 = this.in.method341();
					Class14.method87(local165).anInt145 = 3;
					if (localPlayer.aClass38_2 == null) {
						Class14.method87(local165).anInt146 = (localPlayer.anIntArray199[0] << 25) + (localPlayer.anIntArray199[4] << 20) + (localPlayer.appearances[0] << 15) + (localPlayer.appearances[8] << 10) + (localPlayer.appearances[11] << 5) + localPlayer.appearances[1];
					} else {
						Class14.method87(local165).anInt146 = (int) (localPlayer.aClass38_2.aLong19 + 305419896L);
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 135) {
					local1820 = this.in.g8();
					local174 = this.in.g4();
					local212 = this.in.g1();
					local1337 = false;
					for (local1030 = 0; local1030 < 100; local1030++) {
						if (this.anIntArray263[local1030] == local174) {
							local1337 = true;
							break;
						}
					}
					if (local212 <= 1) {
						for (local1041 = 0; local1041 < this.anInt837; local1041++) {
							if (this.aLongArray3[local1041] == local1820) {
								local1337 = true;
								break;
							}
						}
					}
					if (!local1337 && this.anInt1011 == 0) {
						try {
							this.anIntArray263[this.anInt970] = local174;
							this.anInt970 = (this.anInt970 + 1) % 100;
							local1472 = Class32.method371(this.in, this.packetSize - 13);
							if (local212 != 3) {
								local1472 = Class46.method452(local1472);
							}
							if (local212 == 2 || local212 == 3) {
								this.method622("@cr2@" + Class26.method252(Class26.method249(local1820), (byte) 7), local1472, 7);
							} else if (local212 == 1) {
								this.method622("@cr1@" + Class26.method252(Class26.method249(local1820), (byte) 7), local1472, 7);
							} else {
								this.method622(Class26.method252(Class26.method249(local1820), (byte) 7), local1472, 3);
							}
						} catch ( Exception local2432) {
							signlink.reporterror("cde1");
						}
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 183) {
					this.anInt889 = this.in.g1();
					this.anInt890 = this.in.method330();
					while (this.in.pos < this.packetSize) {
						local165 = this.in.g1();
						this.method708(this.in, local165);
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 159) {
					local165 = this.in.method341();
					this.method687(local165);
					if (this.anInt941 != -1) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = -1;
						this.aBoolean248 = true;
						this.aBoolean225 = true;
					}
					if (this.anInt888 != -1) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt926 != -1) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = -1;
						this.aBoolean236 = true;
					}
					if (this.anInt880 != -1) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = -1;
					}
					if (this.anInt976 != local165) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = local165;
					}
					if (this.anInt1010 != 0) {
						this.anInt1010 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean254 = false;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 246) {
					local165 = this.in.method341();
					this.method687(local165);
					if (this.anInt888 != -1) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = -1;
						this.aBoolean255 = true;
					}
					if (this.anInt926 != -1) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = -1;
						this.aBoolean236 = true;
					}
					if (this.anInt880 != -1) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = -1;
					}
					if (this.anInt976 != -1) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt941 != local165) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = local165;
					}
					if (this.anInt1010 != 0) {
						this.anInt1010 = 0;
						this.aBoolean255 = true;
					}
					this.aBoolean248 = true;
					this.aBoolean225 = true;
					this.aBoolean254 = false;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 49) {
					this.aBoolean248 = true;
					local165 = this.in.method331();
					local170 = this.in.g1();
					local174 = this.in.g4();
					this.anIntArray214[local165] = local174;
					this.anIntArray242[local165] = local170;
					this.anIntArray245[local165] = 1;
					for (local212 = 0; local212 < 98; local212++) {
						if (local174 >= anIntArray228[local212]) {
							this.anIntArray245[local165] = local212 + 2;
						}
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 206) {
					this.aBoolean248 = true;
					local165 = this.in.g2();
					local1762 = Class14.method87(local165);
					local174 = this.in.g2();
					for (local212 = 0; local212 < local174; local212++) {
						local1762.anIntArray44[local212] = this.in.method341();
						local724 = this.in.method331();
						if (local724 == 255) {
							local724 = this.in.method345();
						}
						local1762.anIntArray40[local212] = local724;
					}
					for (local724 = local174; local724 < local1762.anIntArray44.length; local724++) {
						local1762.anIntArray44[local724] = 0;
						local1762.anIntArray40[local724] = 0;
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 222 || this.packetType == 53) {
					local165 = this.anInt854;
					local170 = this.anInt855;
					if (this.packetType == 222) {
						local170 = this.in.g2();
						local165 = this.in.method341();
						this.aBoolean247 = false;
					}
					if (this.packetType == 53) {
						local165 = this.in.method340();
						this.in.accessBits((byte) 6);
						local174 = 0;
						while (true) {
							if (local174 >= 4) {
								this.in.accessBytes();
								local170 = this.in.method340();
								this.aBoolean247 = true;
								break;
							}
							for (local212 = 0; local212 < 13; local212++) {
								for (local724 = 0; local724 < 13; local724++) {
									local1030 = this.in.gBit(1);
									if (local1030 == 1) {
										this.anIntArrayArrayArray7[local174][local212][local724] = this.in.gBit(26);
									} else {
										this.anIntArrayArrayArray7[local174][local212][local724] = -1;
									}
								}
							}
							local174++;
						}
					}
					if (this.anInt854 == local165 && this.anInt855 == local170 && this.sceneState == 2) {
						this.packetType = -1;
						return true;
					}
					this.anInt854 = local165;
					this.anInt855 = local170;
					this.anInt914 = (this.anInt854 - 6) * 8;
					this.anInt915 = (this.anInt855 - 6) * 8;
					this.aBoolean238 = false;
					if ((this.anInt854 / 8 == 48 || this.anInt854 / 8 == 49) && this.anInt855 / 8 == 48) {
						this.aBoolean238 = true;
					}
					if (this.anInt854 / 8 == 48 && this.anInt855 / 8 == 148) {
						this.aBoolean238 = true;
					}
					this.sceneState = 1;
					this.loginTime = System.currentTimeMillis();
					this.method700(null, "Loading - please wait.");
					if (this.packetType == 222) {
						local174 = 0;
						local212 = (this.anInt854 - 6) / 8;
						label1207: while (true) {
							if (local212 > (this.anInt854 + 6) / 8) {
								this.aByteArrayArray5 = new byte[local174][];
								this.aByteArrayArray6 = new byte[local174][];
								this.anIntArray216 = new int[local174];
								this.anIntArray217 = new int[local174];
								this.anIntArray218 = new int[local174];
								local174 = 0;
								local724 = (this.anInt854 - 6) / 8;
								while (true) {
									if (local724 > (this.anInt854 + 6) / 8) {
										break label1207;
									}
									for (local1030 = (this.anInt855 - 6) / 8; local1030 <= (this.anInt855 + 6) / 8; local1030++) {
										this.anIntArray216[local174] = (local724 << 8) + local1030;
										if (this.aBoolean238 && (local1030 == 49 || local1030 == 149 || local1030 == 147 || local724 == 50 || local724 == 49 && local1030 == 47)) {
											this.anIntArray217[local174] = -1;
											this.anIntArray218[local174] = -1;
											local174++;
										} else {
											local1041 = this.anIntArray217[local174] = this.aClass33_Sub1_1.method573(local724, local1030, 0);
											if (local1041 != -1) {
												this.aClass33_Sub1_1.method558(3, local1041);
											}
											local1967 = this.anIntArray218[local174] = this.aClass33_Sub1_1.method573(local724, local1030, 1);
											if (local1967 != -1) {
												this.aClass33_Sub1_1.method558(3, local1967);
											}
											local174++;
										}
									}
									local724++;
								}
							}
							for (local724 = (this.anInt855 - 6) / 8; local724 <= (this.anInt855 + 6) / 8; local724++) {
								local174++;
							}
							local212++;
						}
					}
					if (this.packetType == 53) {
						local174 = 0;
						int[] local3216 = new int[676];
						local724 = 0;
						label1166: while (true) {
							int local3246;
							int local3252;
							int local3262;
							if (local724 >= 4) {
								this.aByteArrayArray5 = new byte[local174][];
								this.aByteArrayArray6 = new byte[local174][];
								this.anIntArray216 = new int[local174];
								this.anIntArray217 = new int[local174];
								this.anIntArray218 = new int[local174];
								local1030 = 0;
								while (true) {
									if (local1030 >= local174) {
										break label1166;
									}
									local1041 = this.anIntArray216[local1030] = local3216[local1030];
									local1967 = local1041 >> 8 & 0xFF;
									local3246 = local1041 & 0xFF;
									local3252 = this.anIntArray217[local1030] = this.aClass33_Sub1_1.method573(local1967, local3246, 0);
									if (local3252 != -1) {
										this.aClass33_Sub1_1.method558(3, local3252);
									}
									local3262 = this.anIntArray218[local1030] = this.aClass33_Sub1_1.method573(local1967, local3246, 1);
									if (local3262 != -1) {
										this.aClass33_Sub1_1.method558(3, local3262);
									}
									local1030++;
								}
							}
							for (local1030 = 0; local1030 < 13; local1030++) {
								for (local1041 = 0; local1041 < 13; local1041++) {
									local1967 = this.anIntArrayArrayArray7[local724][local1030][local1041];
									if (local1967 != -1) {
										local3246 = local1967 >> 14 & 0x3FF;
										local3252 = local1967 >> 3 & 0x7FF;
										local3262 = (local3246 / 8 << 8) + local3252 / 8;
										for ( int local3264 = 0; local3264 < local174; local3264++) {
											if (local3216[local3264] == local3262) {
												local3262 = -1;
												break;
											}
										}
										if (local3262 != -1) {
											local3216[local174++] = local3262;
										}
									}
								}
							}
							local724++;
						}
					}
					local174 = this.anInt914 - this.anInt916;
					local212 = this.anInt915 - this.anInt917;
					this.anInt916 = this.anInt914;
					this.anInt917 = this.anInt915;
					for (local724 = 0; local724 < 16384; local724++) {
						Class10_Sub1_Sub2_Sub3_Sub1 local3417 = this.npcs[local724];
						if (local3417 != null) {
							for (local1041 = 0; local1041 < 10; local1041++) {
								local3417.anIntArray193[local1041] -= local174;
								local3417.anIntArray194[local1041] -= local212;
							}
							local3417.anInt739 -= local174 * 128;
							local3417.anInt740 -= local212 * 128;
						}
					}
					for (local1030 = 0; local1030 < this.MAX_PLAYER_COUNT; local1030++) {
						PlayerEntity local3472 = this.players[local1030];
						if (local3472 != null) {
							for (local1967 = 0; local1967 < 10; local1967++) {
								local3472.anIntArray193[local1967] -= local174;
								local3472.anIntArray194[local1967] -= local212;
							}
							local3472.anInt739 -= local174 * 128;
							local3472.anInt740 -= local212 * 128;
						}
					}
					this.aBoolean251 = true;
					byte local3524 = 0;
					byte local3526 = 104;
					byte local3528 = 1;
					if (local174 < 0) {
						local3524 = 103;
						local3526 = -1;
						local3528 = -1;
					}
					byte local3538 = 0;
					byte local3540 = 104;
					byte local3542 = 1;
					if (local212 < 0) {
						local3538 = 103;
						local3540 = -1;
						local3542 = -1;
					}
					for ( int local3552 = local3524; local3552 != local3526; local3552 += local3528) {
						for ( int local3556 = local3538; local3556 != local3540; local3556 += local3542) {
							int local3562 = local3552 + local174;
							int local3566 = local3556 + local212;
							for ( int local3568 = 0; local3568 < 4; local3568++) {
								if (local3562 >= 0 && local3566 >= 0 && local3562 < 104 && local3566 < 104) {
									this.levelObjStacks[local3568][local3552][local3556] = this.levelObjStacks[local3568][local3562][local3566];
								} else {
									this.levelObjStacks[local3568][local3552][local3556] = null;
								}
							}
						}
					}
					for (Class10_Sub2 local3630 = (Class10_Sub2) this.spawnedLocations.method6(); local3630 != null; local3630 = (Class10_Sub2) this.spawnedLocations.method8()) {
						local3630.anInt456 -= local174;
						local3630.anInt457 -= local212;
						if (local3630.anInt456 < 0 || local3630.anInt457 < 0 || local3630.anInt456 >= 104 || local3630.anInt457 >= 104) {
							local3630.unlink();
						}
					}
					if (this.anInt955 != 0) {
						this.anInt955 -= local174;
						this.anInt956 -= local212;
					}
					this.aBoolean252 = false;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 190) {
					this.systemUpdateTimer = this.in.method339() * 30;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 41 || this.packetType == 121 || this.packetType == 203 || this.packetType == 106 || this.packetType == 59 || this.packetType == 181 || this.packetType == 208 || this.packetType == 107 || this.packetType == 142 || this.packetType == 88 || this.packetType == 152) {
					this.method708(this.in, this.packetType);
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 125) {
					if (this.anInt1031 == 12) {
						this.aBoolean248 = true;
					}
					this.anInt1049 = this.in.g1();
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 21) {
					local165 = this.in.g2();
					local170 = this.in.method339();
					local174 = this.in.method341();
					if (local170 == 65535) {
						Class14.method87(local174).anInt145 = 0;
						this.packetType = -1;
						return true;
					}
					Class17 local3818 = Class17.method104(local170);
					Class14.method87(local174).anInt145 = 4;
					Class14.method87(local174).anInt146 = local170;
					Class14.method87(local174).anInt130 = local3818.anInt192;
					Class14.method87(local174).anInt131 = local3818.anInt189;
					Class14.method87(local174).anInt129 = local3818.anInt200 * 100 / local165;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 3) {
					this.aBoolean252 = true;
					this.anInt848 = this.in.g1();
					this.anInt849 = this.in.g1();
					this.anInt850 = this.in.g2();
					this.anInt851 = this.in.g1();
					this.anInt852 = this.in.g1();
					if (this.anInt852 >= 100) {
						this.anInt990 = this.anInt848 * 128 + 64;
						this.anInt992 = this.anInt849 * 128 + 64;
						this.anInt991 = this.method685(this.anInt992, this.anInt990, this.anInt942) - this.anInt850;
					}
					this.packetType = -1;
					return true;
				}
				Class14 local3938;
				if (this.packetType == 2) {
					local165 = this.in.method341();
					local170 = this.in.method343();
					local3938 = Class14.method87(local165);
					if (local3938.anInt148 != local170 || local170 == -1) {
						local3938.anInt148 = local170;
						local3938.anInt119 = 0;
						local3938.anInt116 = 0;
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 71) {
					this.method623(this.in, this.aBoolean235, this.packetSize);
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 226) {
					this.anInt837 = this.packetSize / 8;
					for (local165 = 0; local165 < this.anInt837; local165++) {
						this.aLongArray3[local165] = this.in.g8();
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 10) {
					local165 = this.in.method332(this.anInt1006);
					local170 = this.in.method340();
					if (local170 == 65535) {
						local170 = -1;
					}
					if (this.anIntArray248[local165] != local170) {
						this.method619(aBoolean249, this.anIntArray248[local165]);
						this.anIntArray248[local165] = local170;
					}
					this.aBoolean248 = true;
					this.aBoolean225 = true;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 219) {
					local165 = this.in.method339();
					local1762 = Class14.method87(local165);
					for (local174 = 0; local174 < local1762.anIntArray44.length; local174++) {
						local1762.anIntArray44[local174] = -1;
						local1762.anIntArray44[local174] = 0;
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 238) {
					this.anInt988 = this.in.g1();
					if (this.anInt988 == this.anInt1031) {
						if (this.anInt988 == 3) {
							this.anInt1031 = 1;
						} else {
							this.anInt1031 = 3;
						}
						this.aBoolean248 = true;
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 148) {
					this.aBoolean252 = false;
					for (local165 = 0; local165 < 5; local165++) {
						this.aBooleanArray11[local165] = false;
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 126) {
					this.anInt932 = this.in.g1();
					this.anInt881 = this.in.method339();
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 75) {
					this.anInt889 = this.in.method331();
					this.anInt890 = this.in.method330();
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 253) {
					local165 = this.in.method339();
					local170 = this.in.method340();
					this.method687(local170);
					if (local165 != -1) {
						this.method687(local165);
					}
					if (this.anInt976 != -1) {
						this.method619(aBoolean249, this.anInt976);
						this.anInt976 = -1;
					}
					if (this.anInt941 != -1) {
						this.method619(aBoolean249, this.anInt941);
						this.anInt941 = -1;
					}
					if (this.anInt888 != -1) {
						this.method619(aBoolean249, this.anInt888);
						this.anInt888 = -1;
					}
					if (this.anInt926 != local170) {
						this.method619(aBoolean249, this.anInt926);
						this.anInt926 = local170;
					}
					if (this.anInt880 != local170) {
						this.method619(aBoolean249, this.anInt880);
						this.anInt880 = local165;
					}
					this.anInt1010 = 0;
					this.aBoolean254 = false;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 251) {
					this.anInt839 = this.in.g1();
					this.aBoolean248 = true;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 18) {
					local165 = this.in.g2();
					local170 = this.in.method340();
					local174 = this.in.method339();
					Class14.method87(local170).anInt112 = (local165 << 16) + local174;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 90) {
					this.method671(this.packetSize, 69, this.in);
					this.aBoolean251 = false;
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 113) {
					for (local165 = 0; local165 < this.anIntArray244.length; local165++) {
						if (this.anIntArray244[local165] != this.anIntArray240[local165]) {
							this.anIntArray244[local165] = this.anIntArray240[local165];
							this.method680(local165);
							this.aBoolean248 = true;
						}
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 232) {
					local165 = this.in.method341();
					local756 = this.in.gjstr();
					Class14.method87(local165).aString2 = local756;
					int local4425 = this.anIntArray248[this.anInt1031];
					if (Class14.method87(local165).anInt128 == local4425) {
						this.aBoolean248 = true;
					}
					this.packetType = -1;
					return true;
				}
				if (this.packetType == 200) {
					local165 = this.in.g2();
					local170 = this.in.method341();
					local3938 = Class14.method87(local165);
					if (local3938 != null && local3938.anInt120 == 0) {
						if (local170 < 0) {
							local170 = 0;
						}
						if (local170 > local3938.anInt147 - local3938.anInt121) {
							local170 = local3938.anInt147 - local3938.anInt121;
						}
						local3938.anInt118 = local170;
					}
					this.packetType = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.packetType + "," + this.packetSize + " - " + this.lastPacketType1 + "," + this.lastPacketType2);
				this.method699();
			} catch ( IOException local4509) {
				this.method634();
			} catch ( Exception local4514) {
				local1321 = "T2 - " + this.packetType + "," + this.lastPacketType1 + "," + this.lastPacketType2 + " - " + this.packetSize + "," + (this.anInt914 + localPlayer.anIntArray193[0]) + "," + (this.anInt915 + localPlayer.anIntArray194[0]) + " - ";
				for (local170 = 0; local170 < this.packetSize && local170 < 50; local170++) {
					local1321 = local1321 + this.in.data[local170] + ",";
				}
				signlink.reporterror(local1321);
				this.method699();
			}
			return true;
		} catch ( RuntimeException local4595) {
			signlink.reporterror("11063, " + 21389 + ", " + local4595.toString());
			throw new RuntimeException();
		}
	}

	private void method609() {
		try {
			if (this.menuSize >= 2 || this.objSelected != 0 || this.spellSelected != 0) {
				String local35;
				if (this.objSelected == 1 && this.menuSize < 2) {
					local35 = "Use " + this.aString30 + " with...";
				} else if (this.spellSelected == 1 && this.menuSize < 2) {
					local35 = this.aString31 + "...";
				} else {
					local35 = this.aStringArray12[this.menuSize - 1];
				}
				if (this.menuSize > 2) {
					local35 = local35 + "@whi@ / " + (this.menuSize - 2) + " more options";
				}
				this.aClass10_Sub1_Sub1_Sub2_4.method157(anInt1050 / 1000, 4, 16777215, 15, local35);
			}
		} catch ( RuntimeException local99) {
			signlink.reporterror("884, " + -79 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	private boolean method610( boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		try {
			int local11;
			for ( int local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					this.anIntArrayArray22[local7][local11] = 0;
					this.anIntArrayArray25[local7][local11] = 99999999;
				}
			}
			local11 = arg10;
			int local39 = arg2;
			this.anIntArrayArray22[arg10][arg2] = 99;
			this.anIntArrayArray25[arg10][arg2] = 0;
			byte local55 = 0;
			int local57 = 0;
			this.anIntArray254[0] = arg10;
			int local66 = local55 + 1;
			this.anIntArray255[0] = arg2;
			boolean local70 = false;
			int local74 = this.anIntArray254.length;
			int[][] local81 = this.aClass47Array1[this.anInt942].anIntArrayArray16;
			int local192;
			while (local57 != local66) {
				local11 = this.anIntArray254[local57];
				local39 = this.anIntArray255[local57];
				local57 = (local57 + 1) % local74;
				if (local11 == arg7 && local39 == arg1) {
					local70 = true;
					break;
				}
				if (arg6 != 0) {
					if ((arg6 < 5 || arg6 == 10) && this.aClass47Array1[this.anInt942].method489(arg7, arg1, arg6 - 1, local11, local39, arg9)) {
						local70 = true;
						break;
					}
					if (arg6 < 10 && this.aClass47Array1[this.anInt942].method490(local39, arg7, local11, arg9, arg6 - 1, arg1)) {
						local70 = true;
						break;
					}
				}
				if (arg3 != 0 && arg4 != 0 && this.aClass47Array1[this.anInt942].method491(arg3, local11, arg7, arg8, arg4, arg1, local39)) {
					local70 = true;
					break;
				}
				local192 = this.anIntArrayArray25[local11][local39] + 1;
				if (local11 > 0 && this.anIntArrayArray22[local11 - 1][local39] == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0) {
					this.anIntArray254[local66] = local11 - 1;
					this.anIntArray255[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39] = 2;
					this.anIntArrayArray25[local11 - 1][local39] = local192;
				}
				if (local11 < 103 && this.anIntArrayArray22[local11 + 1][local39] == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0) {
					this.anIntArray254[local66] = local11 + 1;
					this.anIntArray255[local66] = local39;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39] = 8;
					this.anIntArrayArray25[local11 + 1][local39] = local192;
				}
				if (local39 > 0 && this.anIntArrayArray22[local11][local39 - 1] == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray254[local66] = local11;
					this.anIntArray255[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11][local39 - 1] = 1;
					this.anIntArrayArray25[local11][local39 - 1] = local192;
				}
				if (local39 < 103 && this.anIntArrayArray22[local11][local39 + 1] == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray254[local66] = local11;
					this.anIntArray255[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11][local39 + 1] = 4;
					this.anIntArrayArray25[local11][local39 + 1] = local192;
				}
				if (local11 > 0 && local39 > 0 && this.anIntArrayArray22[local11 - 1][local39 - 1] == 0 && (local81[local11 - 1][local39 - 1] & 0x128010E) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray254[local66] = local11 - 1;
					this.anIntArray255[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39 - 1] = 3;
					this.anIntArrayArray25[local11 - 1][local39 - 1] = local192;
				}
				if (local11 < 103 && local39 > 0 && this.anIntArrayArray22[local11 + 1][local39 - 1] == 0 && (local81[local11 + 1][local39 - 1] & 0x1280183) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 - 1] & 0x1280102) == 0) {
					this.anIntArray254[local66] = local11 + 1;
					this.anIntArray255[local66] = local39 - 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39 - 1] = 9;
					this.anIntArrayArray25[local11 + 1][local39 - 1] = local192;
				}
				if (local11 > 0 && local39 < 103 && this.anIntArrayArray22[local11 - 1][local39 + 1] == 0 && (local81[local11 - 1][local39 + 1] & 0x1280138) == 0 && (local81[local11 - 1][local39] & 0x1280108) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray254[local66] = local11 - 1;
					this.anIntArray255[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 - 1][local39 + 1] = 6;
					this.anIntArrayArray25[local11 - 1][local39 + 1] = local192;
				}
				if (local11 < 103 && local39 < 103 && this.anIntArrayArray22[local11 + 1][local39 + 1] == 0 && (local81[local11 + 1][local39 + 1] & 0x12801E0) == 0 && (local81[local11 + 1][local39] & 0x1280180) == 0 && (local81[local11][local39 + 1] & 0x1280120) == 0) {
					this.anIntArray254[local66] = local11 + 1;
					this.anIntArray255[local66] = local39 + 1;
					local66 = (local66 + 1) % local74;
					this.anIntArrayArray22[local11 + 1][local39 + 1] = 12;
					this.anIntArrayArray25[local11 + 1][local39 + 1] = local192;
				}
			}
			this.anInt957 = 0;
			int local808;
			int local814;
			int local820;
			if (!local70) {
				if (!arg0) {
					return false;
				}
				local192 = 1000;
				local808 = 100;
				for (local814 = arg7 - 10; local814 <= arg7 + 10; local814++) {
					for (local820 = arg1 - 10; local820 <= arg1 + 10; local820++) {
						if (local814 >= 0 && local820 >= 0 && local814 < 104 && local820 < 104 && this.anIntArrayArray25[local814][local820] < 100) {
							int local842 = 0;
							if (local814 < arg7) {
								local842 = arg7 - local814;
							} else if (local814 > arg7 + arg3 - 1) {
								local842 = local814 + 1 - arg7 - arg3;
							}
							int local868 = 0;
							if (local820 < arg1) {
								local868 = arg1 - local820;
							} else if (local820 > arg1 + arg4 - 1) {
								local868 = local820 + 1 - arg1 - arg4;
							}
							int local900 = local842 * local842 + local868 * local868;
							if (local900 < local192 || local900 == local192 && this.anIntArrayArray25[local814][local820] < local808) {
								local192 = local900;
								local808 = this.anIntArrayArray25[local814][local820];
								local11 = local814;
								local39 = local820;
							}
						}
					}
				}
				if (local192 == 1000) {
					return false;
				}
				if (local11 == arg10 && local39 == arg2) {
					return false;
				}
				this.anInt957 = 1;
			}
			byte local961 = 0;
			this.anIntArray254[0] = local11;
			local57 = local961 + 1;
			this.anIntArray255[0] = local39;
			local192 = local808 = this.anIntArrayArray22[local11][local39];
			while (local11 != arg10 || local39 != arg2) {
				if (local192 != local808) {
					local808 = local192;
					this.anIntArray254[local57] = local11;
					this.anIntArray255[local57++] = local39;
				}
				if ((local192 & 0x2) != 0) {
					local11++;
				} else if ((local192 & 0x8) != 0) {
					local11--;
				}
				if ((local192 & 0x1) != 0) {
					local39++;
				} else if ((local192 & 0x4) != 0) {
					local39--;
				}
				local192 = this.anIntArrayArray22[local11][local39];
			}
			if (local57 > 0) {
				local74 = local57;
				if (local57 > 25) {
					local74 = 25;
				}
				local57--;
				int local1055 = this.anIntArray254[local57];
				local814 = this.anIntArray255[local57];
				if (arg5 == 0) {
					this.out.p1isaac(28);
					this.out.p1(local74 + local74 + 3);
				}
				if (arg5 == 1) {
					this.out.p1isaac(213);
					this.out.p1(local74 + local74 + 3 + 14);
				}
				if (arg5 == 2) {
					this.out.p1isaac(247);
					this.out.p1(local74 + local74 + 3);
				}
				this.out.method338(local1055 + this.anInt914);
				this.out.p1(super.actionKey[5] == 1 ? 1 : 0);
				this.out.method338(local814 + this.anInt915);
				this.anInt955 = this.anIntArray254[0];
				this.anInt956 = this.anIntArray255[0];
				for (local820 = 1; local820 < local74; local820++) {
					local57--;
					this.out.p1(this.anIntArray254[local57] - local1055);
					this.out.method329(this.anIntArray255[local57] - local814);
				}
				return true;
			} else if (arg5 == 1) {
				return false;
			} else {
				return true;
			}
		} catch ( RuntimeException local1187) {
			signlink.reporterror("65809, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local1187.toString());
			throw new RuntimeException();
		}
	}

	private void method611() {
		try {
			if (this.sceneState == 2) {
				for (Class10_Sub2 local16 = (Class10_Sub2) this.spawnedLocations.method6(); local16 != null; local16 = (Class10_Sub2) this.spawnedLocations.method8()) {
					if (local16.anInt453 > 0) {
						local16.anInt453--;
					}
					if (local16.anInt453 != 0) {
						if (local16.anInt458 > 0) {
							local16.anInt458--;
						}
						if (local16.anInt458 == 0 && local16.anInt456 >= 1 && local16.anInt457 >= 1 && local16.anInt456 <= 102 && local16.anInt457 <= 102 && (local16.anInt447 < 0 || Class8.method18(local16.anInt449, this.aByte50, local16.anInt447))) {
							this.method620(local16.anInt448, local16.anInt456, local16.anInt447, local16.anInt457, local16.anInt454, local16.anInt449, local16.anInt455);
							local16.anInt458 = -1;
							if (local16.anInt447 == local16.anInt450 && local16.anInt450 == -1) {
								local16.unlink();
							} else if (local16.anInt447 == local16.anInt450 && local16.anInt448 == local16.anInt451 && local16.anInt449 == local16.anInt452) {
								local16.unlink();
							}
						}
					} else if (local16.anInt450 < 0 || Class8.method18(local16.anInt452, this.aByte50, local16.anInt450)) {
						this.method620(local16.anInt451, local16.anInt456, local16.anInt450, local16.anInt457, local16.anInt454, local16.anInt452, local16.anInt455);
						local16.unlink();
					}
				}
			}
		} catch ( RuntimeException local161) {
			signlink.reporterror("6774, " + 16220 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	private String method612() {
		try {
			if (signlink.mainapp == null) {
				return super.frame == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch ( RuntimeException local25) {
			signlink.reporterror("25300, " + -42588 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	private void method613( int arg0, int arg1, int arg2, PlayerEntity arg3) {
		try {
			if (arg3 != localPlayer && this.menuSize < 400) {
				String local43;
				if (arg3.anInt770 == 0) {
					local43 = arg3.aString14 + method667(arg3.anInt767, localPlayer.anInt767) + " (level-" + arg3.anInt767 + ")";
				} else {
					local43 = arg3.aString14 + " (skill-" + arg3.anInt770 + ")";
				}
				int local173;
				if (this.objSelected == 1) {
					this.aStringArray12[this.menuSize] = "Use " + this.aString30 + " with @whi@" + local43;
					this.anIntArray233[this.menuSize] = 596;
					this.anIntArray234[this.menuSize] = arg0;
					this.anIntArray231[this.menuSize] = arg2;
					this.anIntArray232[this.menuSize] = arg1;
					this.menuSize++;
				} else if (this.spellSelected != 1) {
					for (local173 = 4; local173 >= 0; local173--) {
						if (this.aStringArray11[local173] != null) {
							this.aStringArray12[this.menuSize] = this.aStringArray11[local173] + " @whi@" + local43;
							short local200 = 0;
							if (this.aStringArray11[local173].equalsIgnoreCase("attack")) {
								if (arg3.anInt767 > localPlayer.anInt767) {
									local200 = 2000;
								}
								if (localPlayer.anInt773 != 0 && arg3.anInt773 != 0) {
									if (localPlayer.anInt773 == arg3.anInt773) {
										local200 = 2000;
									} else {
										local200 = 0;
									}
								}
							} else if (this.aBooleanArray12[local173]) {
								local200 = 2000;
							}
							if (local173 == 0) {
								this.anIntArray233[this.menuSize] = local200 + 200;
							}
							if (local173 == 1) {
								this.anIntArray233[this.menuSize] = local200 + 493;
							}
							if (local173 == 2) {
								this.anIntArray233[this.menuSize] = local200 + 408;
							}
							if (local173 == 3) {
								this.anIntArray233[this.menuSize] = local200 + 677;
							}
							if (local173 == 4) {
								this.anIntArray233[this.menuSize] = local200 + 876;
							}
							this.anIntArray234[this.menuSize] = arg0;
							this.anIntArray231[this.menuSize] = arg2;
							this.anIntArray232[this.menuSize] = arg1;
							this.menuSize++;
						}
					}
				} else if ((this.anInt980 & 0x8) == 8) {
					this.aStringArray12[this.menuSize] = this.aString31 + " @whi@" + local43;
					this.anIntArray233[this.menuSize] = 918;
					this.anIntArray234[this.menuSize] = arg0;
					this.anIntArray231[this.menuSize] = arg2;
					this.anIntArray232[this.menuSize] = arg1;
					this.menuSize++;
				}
				for (local173 = 0; local173 < this.menuSize; local173++) {
					if (this.anIntArray233[local173] == 14) {
						this.aStringArray12[local173] = "Walk here @whi@" + local43;
						return;
					}
				}
			}
		} catch ( RuntimeException local350) {
			signlink.reporterror("21590, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	private void method614() {
		try {
			if (super.anInt821 == 1) {
				if (super.anInt822 >= 6 && super.anInt822 <= 106 && super.anInt823 >= 467 && super.anInt823 <= 499) {
					this.anInt899 = (this.anInt899 + 1) % 4;
					this.aBoolean253 = true;
					this.aBoolean255 = true;
					this.out.p1isaac(176);
					this.out.p1(this.anInt899);
					this.out.p1(this.anInt853);
					this.out.p1(this.anInt1000);
				}
				if (super.anInt822 >= 135 && super.anInt822 <= 235 && super.anInt823 >= 467 && super.anInt823 <= 499) {
					this.anInt853 = (this.anInt853 + 1) % 3;
					this.aBoolean253 = true;
					this.aBoolean255 = true;
					this.out.p1isaac(176);
					this.out.p1(this.anInt899);
					this.out.p1(this.anInt853);
					this.out.p1(this.anInt1000);
				}
				if (super.anInt822 >= 273 && super.anInt822 <= 373 && super.anInt823 >= 467 && super.anInt823 <= 499) {
					this.anInt1000 = (this.anInt1000 + 1) % 3;
					this.aBoolean253 = true;
					this.aBoolean255 = true;
					this.out.p1isaac(176);
					this.out.p1(this.anInt899);
					this.out.p1(this.anInt853);
					this.out.p1(this.anInt1000);
				}
				if (super.anInt822 >= 412 && super.anInt822 <= 512 && super.anInt823 >= 467 && super.anInt823 <= 499) {
					if (this.anInt976 == -1) {
						this.method590();
						this.aString17 = "";
						this.aBoolean241 = false;
						this.anInt1002 = this.anInt976 = Class14.anInt127;
					} else {
						this.method622("", "Please close the interface you have open before using 'report abuse'", 0);
					}
				}
				anInt972++;
				if (anInt972 > 161) {
					anInt972 = 0;
					this.out.p1isaac(22);
					this.out.p2(38304);
					return;
				}
			}
		} catch ( RuntimeException local221) {
			signlink.reporterror("16738, " + true + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	private void method615(int arg0, Packet arg1, int arg2) {
		try {
			for ( int local1 = 0; local1 < this.anInt885; local1++) {
				int local8 = this.anIntArray230[local1];
				PlayerEntity local13 = this.players[local8];
				int local16 = arg1.g1();
				if ((local16 & 0x20) != 0) {
					local16 += arg1.g1() << 8;
				}
				this.method638(local8, local13, local16, arg1);
			}
			boolean local43 = false;
		} catch ( RuntimeException local45) {
			signlink.reporterror("69503, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	private void method616( int arg0, boolean arg1, Packet arg2) {
		try {
			arg2.accessBits((byte) 6);
			int local7 = arg2.gBit(1);
			if (local7 != 0) {
				int local15 = arg2.gBit(2);
				this.ingame &= arg1;
				if (local15 == 0) {
					this.anIntArray230[this.anInt885++] = this.anInt883;
				} else {
					int local44;
					int local54;
					if (local15 == 1) {
						local44 = arg2.gBit(3);
						localPlayer.method540(false, local44);
						local54 = arg2.gBit(1);
						if (local54 == 1) {
							this.anIntArray230[this.anInt885++] = this.anInt883;
						}
					} else {
						int local98;
						if (local15 == 2) {
							local44 = arg2.gBit(3);
							localPlayer.method540(true, local44);
							local54 = arg2.gBit(3);
							localPlayer.method540(true, local54);
							local98 = arg2.gBit(1);
							if (local98 == 1) {
								this.anIntArray230[this.anInt885++] = this.anInt883;
							}
						} else if (local15 == 3) {
							local44 = arg2.gBit(1);
							this.anInt942 = arg2.gBit(2);
							local54 = arg2.gBit(7);
							local98 = arg2.gBit(7);
							int local143 = arg2.gBit(1);
							if (local143 == 1) {
								this.anIntArray230[this.anInt885++] = this.anInt883;
							}
							localPlayer.method542(local54, (byte) 5, local44 == 1, local98);
						}
					}
				}
			}
		} catch ( RuntimeException local171) {
			signlink.reporterror("50251, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	private void method617( int arg0, int arg1, Class14 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (this.aBoolean242) {
				this.anInt1038 = 32;
			} else {
				this.anInt1038 = 0;
			}
			this.aBoolean242 = false;
			if (arg5 >= arg7 && arg5 < arg7 + 16 && arg3 >= arg1 && arg3 < arg1 + 16) {
				arg2.anInt118 -= this.anInt943 * 4;
				if (arg4 == 1) {
					this.aBoolean248 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
			} else if (arg5 >= arg7 && arg5 < arg7 + 16 && arg3 >= arg1 + arg6 - 16 && arg3 < arg1 + arg6) {
				arg2.anInt118 += this.anInt943 * 4;
				if (arg4 == 1) {
					this.aBoolean248 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
			} else if (arg5 >= arg7 - this.anInt1038 && arg5 < arg7 + this.anInt1038 + 16 && arg3 >= arg1 + 16 && arg3 < arg1 + arg6 - 16 && this.anInt943 > 0) {
				int local148 = (arg6 - 32) * arg6 / arg0;
				if (local148 < 8) {
					local148 = 8;
				}
				int local163 = arg3 - arg1 - local148 / 2 - 16;
				int local169 = arg6 - local148 - 32;
				arg2.anInt118 = (arg0 - arg6) * local163 / local169;
				if (arg4 == 1) {
					this.aBoolean248 = true;
				}
				if (arg4 == 2 || arg4 == 3) {
					this.aBoolean255 = true;
				}
				this.aBoolean242 = true;
			}
		} catch ( RuntimeException local198) {
			signlink.reporterror("27524, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 102 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local198.toString());
			throw new RuntimeException();
		}
	}

	private void method618() {
		try {
			if (this.objSelected == 0 && this.spellSelected == 0) {
				this.aStringArray12[this.menuSize] = "Walk here";
				this.anIntArray233[this.menuSize] = 14;
				this.anIntArray231[this.menuSize] = super.mouseX;
				this.anIntArray232[this.menuSize] = super.mouseY;
				this.menuSize++;
			}
			int local41 = -1;
			for (int local49 = 0; local49 < Model.anInt419; local49++) {
				int local55 = Model.anIntArray145[local49];
				int local59 = local55 & 0x7F;
				int local65 = local55 >> 7 & 0x7F;
				int local71 = local55 >> 29 & 0x3;
				int local77 = local55 >> 14 & 0x7FFF;
				if (local55 != local41) {
					local41 = local55;
					int local224;
					if (local71 == 2 && this.aClass23_1.method220(this.anInt942, local59, local65, local55) >= 0) {
						Class48 local97 = Class48.method523(local77);
						if (local97.anIntArray192 != null) {
							local97 = local97.method524();
						}
						if (local97 == null) {
							continue;
						}
						if (this.objSelected == 1) {
							this.aStringArray12[this.menuSize] = "Use " + this.aString30 + " with @cya@" + local97.aString12;
							this.anIntArray233[this.menuSize] = 467;
							this.anIntArray234[this.menuSize] = local55;
							this.anIntArray231[this.menuSize] = local59;
							this.anIntArray232[this.menuSize] = local65;
							this.menuSize++;
						} else if (this.spellSelected != 1) {
							if (local97.aStringArray7 != null) {
								for (local224 = 4; local224 >= 0; local224--) {
									if (local97.aStringArray7[local224] != null) {
										this.aStringArray12[this.menuSize] = local97.aStringArray7[local224] + " @cya@" + local97.aString12;
										if (local224 == 0) {
											this.anIntArray233[this.menuSize] = 35;
										}
										if (local224 == 1) {
											this.anIntArray233[this.menuSize] = 389;
										}
										if (local224 == 2) {
											this.anIntArray233[this.menuSize] = 888;
										}
										if (local224 == 3) {
											this.anIntArray233[this.menuSize] = 892;
										}
										if (local224 == 4) {
											this.anIntArray233[this.menuSize] = 1280;
										}
										this.anIntArray234[this.menuSize] = local55;
										this.anIntArray231[this.menuSize] = local59;
										this.anIntArray232[this.menuSize] = local65;
										this.menuSize++;
									}
								}
							}
							this.aStringArray12[this.menuSize] = "Examine @cya@" + local97.aString12;
							this.anIntArray233[this.menuSize] = 1412;
							this.anIntArray234[this.menuSize] = local97.anInt696 << 14;
							this.anIntArray231[this.menuSize] = local59;
							this.anIntArray232[this.menuSize] = local65;
							this.menuSize++;
						} else if ((this.anInt980 & 0x4) == 4) {
							this.aStringArray12[this.menuSize] = this.aString31 + " @cya@" + local97.aString12;
							this.anIntArray233[this.menuSize] = 376;
							this.anIntArray234[this.menuSize] = local55;
							this.anIntArray231[this.menuSize] = local59;
							this.anIntArray232[this.menuSize] = local65;
							this.menuSize++;
						}
					}
					Class10_Sub1_Sub2_Sub3_Sub1 local404;
					PlayerEntity local452;
					int local442;
					if (local71 == 1) {
						Class10_Sub1_Sub2_Sub3_Sub1 local375 = this.npcs[local77];
						if (local375.aClass38_1.aByte31 == 1 && (local375.anInt739 & 0x7F) == 64 && (local375.anInt740 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt960; local224++) {
								local404 = this.npcs[this.anIntArray256[local224]];
								if (local404 != null && local404 != local375 && local404.aClass38_1.aByte31 == 1 && local404.anInt739 == local375.anInt739 && local404.anInt740 == local375.anInt740) {
									this.method657(local404.aClass38_1, local65, local59, this.anIntArray256[local224]);
								}
							}
							for (local442 = 0; local442 < this.anInt884; local442++) {
								local452 = this.players[this.anIntArray229[local442]];
								if (local452 != null && local452.anInt739 == local375.anInt739 && local452.anInt740 == local375.anInt740) {
									this.method613(this.anIntArray229[local442], local65, local59, local452);
								}
							}
						}
						this.method657(local375.aClass38_1, local65, local59, local77);
					}
					if (local71 == 0) {
						PlayerEntity local494 = this.players[local77];
						if ((local494.anInt739 & 0x7F) == 64 && (local494.anInt740 & 0x7F) == 64) {
							for (local224 = 0; local224 < this.anInt960; local224++) {
								local404 = this.npcs[this.anIntArray256[local224]];
								if (local404 != null && local404.aClass38_1.aByte31 == 1 && local404.anInt739 == local494.anInt739 && local404.anInt740 == local494.anInt740) {
									this.method657(local404.aClass38_1, local65, local59, this.anIntArray256[local224]);
								}
							}
							for (local442 = 0; local442 < this.anInt884; local442++) {
								local452 = this.players[this.anIntArray229[local442]];
								if (local452 != null && local452 != local494 && local452.anInt739 == local494.anInt739 && local452.anInt740 == local494.anInt740) {
									this.method613(this.anIntArray229[local442], local65, local59, local452);
								}
							}
						}
						this.method613(local77, local65, local59, local494);
					}
					if (local71 == 3) {
						Class6 local613 = this.levelObjStacks[this.anInt942][local59][local65];
						if (local613 != null) {
							for ( Class10_Sub1_Sub2_Sub1 local620 = (Class10_Sub1_Sub2_Sub1) local613.method7(); local620 != null; local620 = (Class10_Sub1_Sub2_Sub1) local613.method9()) {
								Class17 local626 = Class17.method104(local620.anInt211);
								if (this.objSelected == 1) {
									this.aStringArray12[this.menuSize] = "Use " + this.aString30 + " with @lre@" + local626.aString7;
									this.anIntArray233[this.menuSize] = 100;
									this.anIntArray234[this.menuSize] = local620.anInt211;
									this.anIntArray231[this.menuSize] = local59;
									this.anIntArray232[this.menuSize] = local65;
									this.menuSize++;
								} else if (this.spellSelected != 1) {
									for ( int local743 = 4; local743 >= 0; local743--) {
										if (local626.aStringArray2 != null && local626.aStringArray2[local743] != null) {
											this.aStringArray12[this.menuSize] = local626.aStringArray2[local743] + " @lre@" + local626.aString7;
											if (local743 == 0) {
												this.anIntArray233[this.menuSize] = 68;
											}
											if (local743 == 1) {
												this.anIntArray233[this.menuSize] = 26;
											}
											if (local743 == 2) {
												this.anIntArray233[this.menuSize] = 684;
											}
											if (local743 == 3) {
												this.anIntArray233[this.menuSize] = 930;
											}
											if (local743 == 4) {
												this.anIntArray233[this.menuSize] = 270;
											}
											this.anIntArray234[this.menuSize] = local620.anInt211;
											this.anIntArray231[this.menuSize] = local59;
											this.anIntArray232[this.menuSize] = local65;
											this.menuSize++;
										} else if (local743 == 2) {
											this.aStringArray12[this.menuSize] = "Take @lre@" + local626.aString7;
											this.anIntArray233[this.menuSize] = 684;
											this.anIntArray234[this.menuSize] = local620.anInt211;
											this.anIntArray231[this.menuSize] = local59;
											this.anIntArray232[this.menuSize] = local65;
											this.menuSize++;
										}
									}
									this.aStringArray12[this.menuSize] = "Examine @lre@" + local626.aString7;
									this.anIntArray233[this.menuSize] = 1564;
									this.anIntArray234[this.menuSize] = local620.anInt211;
									this.anIntArray231[this.menuSize] = local59;
									this.anIntArray232[this.menuSize] = local65;
									this.menuSize++;
								} else if ((this.anInt980 & 0x1) == 1) {
									this.aStringArray12[this.menuSize] = this.aString31 + " @lre@" + local626.aString7;
									this.anIntArray233[this.menuSize] = 199;
									this.anIntArray234[this.menuSize] = local620.anInt211;
									this.anIntArray231[this.menuSize] = local59;
									this.anIntArray232[this.menuSize] = local65;
									this.menuSize++;
								}
							}
						}
					}
				}
			}
		} catch ( RuntimeException local950) {
			signlink.reporterror("4081, " + 7 + ", " + local950.toString());
			throw new RuntimeException();
		}
	}

	private void method619( boolean arg0, int arg1) {
		try {
			if (arg0) {
				Class14.method92(aBoolean249, arg1);
			}
		} catch ( RuntimeException local7) {
			signlink.reporterror("50870, " + arg0 + ", " + arg1 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	private void method620( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if (arg1 >= 1 && arg3 >= 1 && arg1 <= 102 && arg3 <= 102) {
				if (lowMemory && arg4 != this.anInt942) {
					return;
				}
				int local27 = 0;
				if (arg6 == 0) {
					local27 = this.aClass23_1.method216(arg4, arg1, arg3);
				}
				if (arg6 == 1) {
					local27 = this.aClass23_1.method217(arg1, arg4, arg3);
				}
				if (arg6 == 2) {
					local27 = this.aClass23_1.method218(arg4, arg1, arg3);
				}
				if (arg6 == 3) {
					local27 = this.aClass23_1.method219(arg4, arg1, arg3);
				}
				int local83;
				if (local27 != 0) {
					local83 = this.aClass23_1.method220(arg4, arg1, arg3, local27);
					int local89 = local27 >> 14 & 0x7FFF;
					int local93 = local83 & 0x1F;
					int local97 = local83 >> 6;
					Class48 local109;
					if (arg6 == 0) {
						this.aClass23_1.method207(arg3, arg4, arg1);
						local109 = Class48.method523(local89);
						if (local109.aBoolean192) {
							this.aClass47Array1[arg4].method485(local97, arg1, arg3, local93, local109.aBoolean191);
						}
					}
					if (arg6 == 1) {
						this.aClass23_1.method208(arg1, arg3, arg4);
					}
					if (arg6 == 2) {
						this.aClass23_1.method209(arg3, arg4, arg1);
						local109 = Class48.method523(local89);
						if (arg1 + local109.anInt707 > 103 || arg3 + local109.anInt707 > 103 || arg1 + local109.anInt697 > 103 || arg3 + local109.anInt697 > 103) {
							return;
						}
						if (local109.aBoolean192) {
							this.aClass47Array1[arg4].method486(this.anInt927, arg3, arg1, local97, local109.anInt697, local109.aBoolean191, local109.anInt707);
						}
					}
					if (arg6 == 3) {
						this.aClass23_1.method210(arg1, arg3, arg4);
						local109 = Class48.method523(local89);
						if (local109.aBoolean192 && local109.aBoolean180) {
							this.aClass47Array1[arg4].method488(arg1, arg3);
						}
					}
				}
				if (arg2 >= 0) {
					local83 = arg4;
					if (arg4 < 3 && (this.aByteArrayArrayArray8[1][arg1][arg3] & 0x2) == 2) {
						local83 = arg4 + 1;
					}
					Class8.method13(arg2, local83, arg5, arg3, this.aClass47Array1[arg4], arg0, arg1, arg4, this.aClass23_1, this.anIntArrayArrayArray8);
					return;
				}
			}
		} catch ( RuntimeException local257) {
			signlink.reporterror("37722, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 1 + ", " + arg6 + ", " + local257.toString());
			throw new RuntimeException();
		}
	}

	private void method621( int arg0, Packet arg1) {
		try {
			arg1.accessBits((byte) 6);
			int local9 = arg1.gBit(8);
			if (this.aByte52 != -58) {
				this.anInt1029 = -460;
			}
			int local22;
			if (local9 < this.anInt960) {
				for (local22 = local9; local22 < this.anInt960; local22++) {
					this.anIntArray269[this.anInt1034++] = this.anIntArray256[local22];
				}
			}
			if (local9 > this.anInt960) {
				signlink.reporterror(this.aString27 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.anInt960 = 0;
			for (local22 = 0; local22 < local9; local22++) {
				int local74 = this.anIntArray256[local22];
				Class10_Sub1_Sub2_Sub3_Sub1 local79 = this.npcs[local74];
				int local84 = arg1.gBit(1);
				if (local84 == 0) {
					this.anIntArray256[this.anInt960++] = local74;
					local79.anInt718 = anInt1050;
				} else {
					int local107 = arg1.gBit(2);
					if (local107 == 0) {
						this.anIntArray256[this.anInt960++] = local74;
						local79.anInt718 = anInt1050;
						this.anIntArray230[this.anInt885++] = local74;
					} else {
						int local158;
						int local168;
						if (local107 == 1) {
							this.anIntArray256[this.anInt960++] = local74;
							local79.anInt718 = anInt1050;
							local158 = arg1.gBit(3);
							local79.method540(false, local158);
							local168 = arg1.gBit(1);
							if (local168 == 1) {
								this.anIntArray230[this.anInt885++] = local74;
							}
						} else if (local107 == 2) {
							this.anIntArray256[this.anInt960++] = local74;
							local79.anInt718 = anInt1050;
							local158 = arg1.gBit(3);
							local79.method540(true, local158);
							local168 = arg1.gBit(3);
							local79.method540(true, local168);
							int local226 = arg1.gBit(1);
							if (local226 == 1) {
								this.anIntArray230[this.anInt885++] = local74;
							}
						} else if (local107 == 3) {
							this.anIntArray269[this.anInt1034++] = local74;
						}
					}
				}
			}
		} catch ( RuntimeException local263) {
			signlink.reporterror("6889, " + arg0 + ", " + -58 + ", " + arg1 + ", " + local263.toString());
			throw new RuntimeException();
		}
	}

	private void method622( String arg0, String arg1, int arg2) {
		try {
			if (arg2 == 0 && this.anInt985 != -1) {
				this.aString26 = arg1;
				super.anInt821 = 0;
			}
			if (this.anInt888 == -1) {
				this.aBoolean255 = true;
			}
			for ( int local20 = 99; local20 > 0; local20--) {
				this.anIntArray270[local20] = this.anIntArray270[local20 - 1];
				this.aStringArray13[local20] = this.aStringArray13[local20 - 1];
				this.messageText[local20] = this.messageText[local20 - 1];
			}
			if (this.aByte46 != -123) {
				this.anInt964 = this.randomIn.nextInt();
			}
			this.anIntArray270[0] = arg2;
			this.aStringArray13[0] = arg0;
			this.messageText[0] = arg1;
		} catch ( RuntimeException local81) {
			signlink.reporterror("61756, " + arg0 + ", " + -123 + ", " + arg1 + ", " + arg2 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	private void method623(Packet arg0, boolean arg1, int arg2) {
		try {
			this.ingame &= arg1;
			this.anInt1034 = 0;
			this.anInt885 = 0;
			this.method621(arg2, arg0);
			this.method707(arg0, arg2);
			this.method637(arg0, arg2, 838);
			int local37;
			for ( int local30 = 0; local30 < this.anInt1034; local30++) {
				local37 = this.anIntArray269[local30];
				if (this.npcs[local37].anInt718 != anInt1050) {
					this.npcs[local37].aClass38_1 = null;
					this.npcs[local37] = null;
				}
			}
			if (arg0.pos != arg2) {
				signlink.reporterror(this.aString27 + " size mismatch in getnpcpos - pos:" + arg0.pos + " psize:" + arg2);
				throw new RuntimeException("eek");
			}
			for (local37 = 0; local37 < this.anInt960; local37++) {
				if (this.npcs[this.anIntArray256[local37]] == null) {
					signlink.reporterror(this.aString27 + " null entry in npc list - pos:" + local37 + " size:" + this.anInt960);
					throw new RuntimeException("eek");
				}
			}
		} catch ( RuntimeException local127) {
			signlink.reporterror("5522, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	private void method624() {
		try {
			Class48.aClass34_8.clear();
			Class48.aClass34_7.clear();
			Class38.aClass34_6.clear();
			Class17.aClass34_3.clear();
			Class17.aClass34_4.clear();
			PlayerEntity.aClass34_9.clear();
			Class28.aClass34_5.clear();
		} catch ( RuntimeException local24) {
			signlink.reporterror("20385, " + 383 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	private void method625() {
		try {
			signlink.aBoolean268 = false;
			signlink.anInt1064 = 0;
			signlink.midi = "stop";
		} catch ( RuntimeException local12) {
			signlink.reporterror("83736, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	private void method626() {
		try {
			for (Class10_Sub1_Sub2_Sub2 local6 = (Class10_Sub1_Sub2_Sub2) this.projectiles.method6(); local6 != null; local6 = (Class10_Sub1_Sub2_Sub2) this.projectiles.method8()) {
				if (local6.anInt264 != this.anInt942 || anInt1050 > local6.anInt271) {
					local6.unlink();
				} else if (anInt1050 >= local6.anInt270) {
					if (local6.anInt267 > 0) {
						Class10_Sub1_Sub2_Sub3_Sub1 local41 = this.npcs[local6.anInt267 - 1];
						if (local41 != null && local41.anInt739 >= 0 && local41.anInt739 < 13312 && local41.anInt740 >= 0 && local41.anInt740 < 13312) {
							local6.method187(local41.anInt739, local41.anInt740, this.method685(local41.anInt740, local41.anInt739, local6.anInt264) - local6.anInt277, anInt1050);
						}
					}
					if (local6.anInt267 < 0) {
						int local86 = -local6.anInt267 - 1;
						PlayerEntity local92;
						if (local86 == this.anInt881) {
							local92 = localPlayer;
						} else {
							local92 = this.players[local86];
						}
						if (local92 != null && local92.anInt739 >= 0 && local92.anInt739 < 13312 && local92.anInt740 >= 0 && local92.anInt740 < 13312) {
							local6.method187(local92.anInt739, local92.anInt740, this.method685(local92.anInt740, local92.anInt739, local6.anInt264) - local6.anInt277, anInt1050);
						}
					}
					local6.method188(this.anInt878);
					this.aClass23_1.method201(-1, local6, (int) local6.aDouble1, (int) local6.aDouble3, false, this.anInt942, 60, (int) local6.aDouble2, local6.anInt268);
				}
			}
			anInt975++;
			if (anInt975 > 51) {
				anInt975 = 0;
				this.out.p1isaac(248);
			}
		} catch ( RuntimeException local186) {
			signlink.reporterror("89047, " + false + ", " + local186.toString());
			throw new RuntimeException();
		}
	}

	private void method627() {
		try {
			this.aClass10_Sub1_Sub1_Sub3_19 = new Class10_Sub1_Sub1_Sub3(this.aClass2_2, "titlebox", 0);
			this.aClass10_Sub1_Sub1_Sub3_20 = new Class10_Sub1_Sub1_Sub3(this.aClass2_2, "titlebutton", 0);
			this.aClass10_Sub1_Sub1_Sub3Array3 = new Class10_Sub1_Sub1_Sub3[12];
			for ( int local29 = 0; local29 < 12; local29++) {
				this.aClass10_Sub1_Sub1_Sub3Array3[local29] = new Class10_Sub1_Sub1_Sub3(this.aClass2_2, "runes", local29);
			}
			this.aClass10_Sub1_Sub1_Sub1_3 = new Pix24(128, 265);
			this.aClass10_Sub1_Sub1_Sub1_4 = new Pix24(128, 265);
			for ( int local62 = 0; local62 < 33920; local62++) {
				this.aClass10_Sub1_Sub1_Sub1_3.pixels[local62] = this.aClass19_22.pixels[local62];
			}
			for ( int local80 = 0; local80 < 33920; local80++) {
				this.aClass10_Sub1_Sub1_Sub1_4.pixels[local80] = this.aClass19_23.pixels[local80];
			}
			this.anIntArray272 = new int[256];
			for ( int local102 = 0; local102 < 64; local102++) {
				this.anIntArray272[local102] = local102 * 262144;
			}
			for ( int local117 = 0; local117 < 64; local117++) {
				this.anIntArray272[local117 + 64] = local117 * 1024 + 16711680;
			}
			for ( int local136 = 0; local136 < 64; local136++) {
				this.anIntArray272[local136 + 128] = local136 * 4 + 16776960;
			}
			for ( int local155 = 0; local155 < 64; local155++) {
				this.anIntArray272[local155 + 192] = 16777215;
			}
			this.anIntArray273 = new int[256];
			for ( int local174 = 0; local174 < 64; local174++) {
				this.anIntArray273[local174] = local174 * 1024;
			}
			for ( int local189 = 0; local189 < 64; local189++) {
				this.anIntArray273[local189 + 64] = local189 * 4 + 65280;
			}
			for ( int local208 = 0; local208 < 64; local208++) {
				this.anIntArray273[local208 + 128] = local208 * 262144 + 65535;
			}
			for ( int local227 = 0; local227 < 64; local227++) {
				this.anIntArray273[local227 + 192] = 16777215;
			}
			this.anIntArray274 = new int[256];
			for ( int local246 = 0; local246 < 64; local246++) {
				this.anIntArray274[local246] = local246 * 4;
			}
			for ( int local261 = 0; local261 < 64; local261++) {
				this.anIntArray274[local261 + 64] = local261 * 262144 + 255;
			}
			for ( int local280 = 0; local280 < 64; local280++) {
				this.anIntArray274[local280 + 128] = local280 * 1024 + 16711935;
			}
			for ( int local299 = 0; local299 < 64; local299++) {
				this.anIntArray274[local299 + 192] = 16777215;
			}
			this.anIntArray271 = new int[256];
			this.anIntArray259 = new int[32768];
			this.anIntArray260 = new int[32768];
			this.method658(null);
			this.anIntArray249 = new int[32768];
			this.anIntArray250 = new int[32768];
			this.drawProgress(10, "Connecting to fileserver");
			if (!this.aBoolean257) {
				this.aBoolean266 = true;
				this.aBoolean257 = true;
				this.startThread(this, 2);
			}
		} catch ( RuntimeException local356) {
			signlink.reporterror("73326, " + false + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	private void method628( long arg0) {
		try {
			if (arg0 != 0L) {
				for ( int local8 = 0; local8 < this.anInt838; local8++) {
					if (this.aLongArray4[local8] == arg0) {
						this.anInt838--;
						this.aBoolean248 = true;
						for ( int local28 = local8; local28 < this.anInt838; local28++) {
							this.aStringArray8[local28] = this.aStringArray8[local28 + 1];
							this.anIntArray265[local28] = this.anIntArray265[local28 + 1];
							this.aLongArray4[local28] = this.aLongArray4[local28 + 1];
						}
						this.out.p1isaac(141);
						this.out.p8(arg0);
						break;
					}
				}
				this.packetSize += 0;
			}
		} catch ( RuntimeException local90) {
			signlink.reporterror("38799, " + arg0 + ", " + 0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	private void method629() {
		try {
			if (this.anInt950 == 0) {
				int local6 = super.anInt821;
				if (this.spellSelected == 1 && super.anInt822 >= 516 && super.anInt823 >= 160 && super.anInt822 <= 765 && super.anInt823 <= 205) {
					local6 = 0;
				}
				int local44;
				int local47;
				int local123;
				if (this.menuVisible) {
					if (local6 != 1) {
						local44 = super.mouseX;
						local47 = super.mouseY;
						if (this.anInt1039 == 0) {
							local44 -= 4;
							local47 -= 4;
						}
						if (this.anInt1039 == 1) {
							local44 -= 553;
							local47 -= 205;
						}
						if (this.anInt1039 == 2) {
							local44 -= 17;
							local47 -= 357;
						}
						if (local44 < this.anInt1040 - 10 || local44 > this.anInt1040 + this.anInt1042 + 10 || local47 < this.anInt1041 - 10 || local47 > this.anInt1041 + this.anInt1043 + 10) {
							this.menuVisible = false;
							if (this.anInt1039 == 1) {
								this.aBoolean248 = true;
							}
							if (this.anInt1039 == 2) {
								this.aBoolean255 = true;
							}
						}
					}
					if (local6 == 1) {
						local44 = this.anInt1040;
						local47 = this.anInt1041;
						local123 = this.anInt1042;
						int local126 = super.anInt822;
						int local129 = super.anInt823;
						if (this.anInt1039 == 0) {
							local126 -= 4;
							local129 -= 4;
						}
						if (this.anInt1039 == 1) {
							local126 -= 553;
							local129 -= 205;
						}
						if (this.anInt1039 == 2) {
							local126 -= 17;
							local129 -= 357;
						}
						int local148 = -1;
						for (int local150 = 0; local150 < this.menuSize; local150++) {
							int local165 = local47 + (this.menuSize - 1 - local150) * 15 + 31;
							if (local126 > local44 && local126 < local44 + local123 && local129 > local165 - 13 && local129 < local165 + 3) {
								local148 = local150;
							}
						}
						if (local148 != -1) {
							this.method695(local148);
						}
						this.menuVisible = false;
						if (this.anInt1039 == 1) {
							this.aBoolean248 = true;
						}
						if (this.anInt1039 == 2) {
							this.aBoolean255 = true;
							return;
						}
					}
				} else {
					if (local6 == 1 && this.menuSize > 0) {
						local44 = this.anIntArray233[this.menuSize - 1];
						if (local44 == 9 || local44 == 225 || local44 == 444 || local44 == 564 || local44 == 894 || local44 == 961 || local44 == 399 || local44 == 324 || local44 == 227 || local44 == 891 || local44 == 52 || local44 == 1094) {
							local47 = this.anIntArray231[this.menuSize - 1];
							local123 = this.anIntArray232[this.menuSize - 1];
							Class14 local284 = Class14.method87(local123);
							if (local284.aBoolean41 || local284.aBoolean32) {
								this.aBoolean246 = false;
								this.anInt1022 = 0;
								this.anInt948 = local123;
								this.anInt949 = local47;
								this.anInt950 = 2;
								this.anInt951 = super.anInt822;
								this.anInt952 = super.anInt823;
								if (Class14.method87(local123).anInt128 == this.anInt976) {
									this.anInt950 = 1;
								}
								if (Class14.method87(local123).anInt128 == this.anInt888) {
									this.anInt950 = 3;
								}
								return;
							}
						}
					}
					if (local6 == 1 && (this.anInt1036 == 1 || this.method701(this.menuSize - 1, this.aByte51)) && this.menuSize > 2) {
						local6 = 2;
					}
					if (local6 == 1 && this.menuSize > 0) {
						this.method695(this.menuSize - 1);
					}
					if (local6 != 2 || this.menuSize <= 0) {
						return;
					}
					this.method683();
				}
			}
		} catch ( RuntimeException local378) {
			signlink.reporterror("53733, " + 0 + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	private void method630(int arg0, Pix24 arg1, int arg2) {
		try {
			int local7 = arg2 * arg2 + arg0 * arg0;
			if (local7 > 4225 && local7 < 90000) {
				int local28 = this.orbitCameraYaw + this.minimapAnticheatAngle & 0x7FF;
				int local32 = Model.anIntArray146[local28];
				int local36 = Model.anIntArray147[local28];
				int local45 = local32 * 256 / (this.minimapZoom + 256);
				int local54 = local36 * 256 / (this.minimapZoom + 256);
				int local64 = arg0 * local45 + arg2 * local54 >> 16;
				int local74 = arg0 * local54 - arg2 * local45 >> 16;
				double local80 = Math.atan2((double) local64, (double) local74);
				int local86 = (int) (Math.sin(local80) * 63.0D);
				int local92 = (int) (Math.cos(local80) * 57.0D);
				this.aClass10_Sub1_Sub1_Sub1_17.method83(local86 + 94 + 4 - 10, this.anInt954, local80, 83 - local92 - 20);
			} else {
				this.method705(arg0, arg1, arg2);
			}
		} catch ( RuntimeException local124) {
			signlink.reporterror("39548, " + arg0 + ", " + arg1 + ", " + -687 + ", " + arg2 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	private void method631( int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			this.aClass10_Sub1_Sub1_Sub3_14.method440(arg4, arg1);
			this.aClass10_Sub1_Sub1_Sub3_15.method440(arg4 + arg2 - 16, arg1);
			Draw2D.fillRect(arg2 - 32, arg4 + 16, this.anInt871, 16, arg1);
			int local35 = (arg2 - 32) * arg2 / arg3;
			if (local35 < 8) {
				local35 = 8;
			}
			int local52 = (arg2 - local35 - 32) * arg0 / (arg3 - arg2);
			Draw2D.fillRect(local35, arg4 + local52 + 16, this.anInt937, 16, arg1);
			Draw2D.drawVerticalLine(arg1, this.anInt961, local35, arg4 + local52 + 16);
			Draw2D.drawVerticalLine(arg1 + 1, this.anInt961, local35, arg4 + local52 + 16);
			Draw2D.drawHorizontalLine(arg1, this.anInt961, arg4 + local52 + 16, 16);
			Draw2D.drawHorizontalLine(arg1, this.anInt961, arg4 + local52 + 17, 16);
			Draw2D.drawVerticalLine(arg1 + 15, this.anInt1032, local35, arg4 + local52 + 16);
			Draw2D.drawVerticalLine(arg1 + 14, this.anInt1032, local35 - 1, arg4 + 17 + local52);
			Draw2D.drawHorizontalLine(arg1, this.anInt1032, arg4 + local52 + local35 + 15, 16);
			Draw2D.drawHorizontalLine(arg1 + 1, this.anInt1032, arg4 + local52 + local35 + 14, 15);
		} catch ( RuntimeException local173) {
			signlink.reporterror("30245, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}

	private void method632( int arg0, boolean arg1) {
		try {
			boolean local3 = false;
			for ( int local5 = 0; local5 < this.anInt960; local5++) {
				Class10_Sub1_Sub2_Sub3_Sub1 local15 = this.npcs[this.anIntArray256[local5]];
				int local24 = (this.anIntArray256[local5] << 14) + 536870912;
				if (local15 != null && local15.isVisible() && local15.aClass38_1.aBoolean143 == arg1 && local15.aClass38_1.method403()) {
					int local45 = local15.anInt739 >> 7;
					int local50 = local15.anInt740 >> 7;
					if (local45 >= 0 && local45 < 104 && local50 >= 0 && local50 < 104) {
						if (local15.anInt730 == 1 && (local15.anInt739 & 0x7F) == 64 && (local15.anInt740 & 0x7F) == 64) {
							if (this.anIntArrayArray23[local45][local50] == this.anInt962) {
								continue;
							}
							this.anIntArrayArray23[local45][local50] = this.anInt962;
						}
						if (!local15.aClass38_1.aBoolean141) {
							local24 += Integer.MIN_VALUE;
						}
						this.aClass23_1.method201(local24, local15, local15.anInt739, this.method685(local15.anInt740, local15.anInt739, this.anInt942), local15.aBoolean196, this.anInt942, (local15.anInt730 - 1) * 64 + 60, local15.anInt740, local15.anInt741);
					}
				}
			}
		} catch ( RuntimeException local142) {
			signlink.reporterror("76083, " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	private void method633( int arg0) {
		try {
			signlink.anInt1066 = arg0;
		} catch ( RuntimeException local8) {
			signlink.reporterror("16107, " + 822 + ", " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	private void method634() {
		try {
			if (this.idleTimeout > 0) {
				this.method699();
			} else {
				this.method700("Please wait - attempting to reestablish", "Connection lost");
				this.anInt923 = 0;
				this.anInt955 = 0;
				ClientStream local29 = this.stream;
				this.ingame = false;
				this.anInt833 = 0;
				this.login(this.aString27, this.aString28, true);
				if (!this.ingame) {
					this.method699();
				}
				try {
					local29.close();
				} catch ( Exception local52) {
				}
			}
		} catch ( RuntimeException local54) {
			signlink.reporterror("3954, " + 1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	private boolean method635( Class14 arg0) {
		try {
			int local4 = arg0.anInt124;
			if (this.anInt839 == 2) {
				if (local4 == 201) {
					this.aBoolean255 = true;
					this.anInt1010 = 0;
					this.aBoolean216 = true;
					this.aString24 = "";
					this.anInt995 = 1;
					this.aString19 = "Enter name of friend to add to list";
				}
				if (local4 == 202) {
					this.aBoolean255 = true;
					this.anInt1010 = 0;
					this.aBoolean216 = true;
					this.aString24 = "";
					this.anInt995 = 2;
					this.aString19 = "Enter name of friend to delete from list";
				}
			}
			if (local4 == 205) {
				this.idleTimeout = 250;
				return true;
			}
			if (local4 == 501) {
				this.aBoolean255 = true;
				this.anInt1010 = 0;
				this.aBoolean216 = true;
				this.aString24 = "";
				this.anInt995 = 4;
				this.aString19 = "Enter name of player to add to list";
			}
			if (local4 == 502) {
				this.aBoolean255 = true;
				this.anInt1010 = 0;
				this.aBoolean216 = true;
				this.aString24 = "";
				this.anInt995 = 5;
				this.aString19 = "Enter name of player to delete from list";
			}
			int local117;
			int local121;
			int local126;
			if (local4 >= 300 && local4 <= 313) {
				local117 = (local4 - 300) / 2;
				local121 = local4 & 0x1;
				local126 = this.anIntArray276[local117];
				if (local126 != -1) {
					while (true) {
						if (local121 == 0) {
							local126--;
							if (local126 < 0) {
								local126 = IdkType.count - 1;
							}
						}
						if (local121 == 1) {
							local126++;
							if (local126 >= IdkType.count) {
								local126 = 0;
							}
						}
						if (!IdkType.instances[local126].disable && IdkType.instances[local126].type == local117 + (this.aBoolean245 ? 0 : 7)) {
							this.anIntArray276[local117] = local126;
							this.aBoolean263 = true;
							break;
						}
					}
				}
			}
			if (local4 >= 314 && local4 <= 323) {
				local117 = (local4 - 314) / 2;
				local121 = local4 & 0x1;
				local126 = this.designColors[local117];
				if (local121 == 0) {
					local126--;
					if (local126 < 0) {
						local126 = anIntArrayArray24[local117].length - 1;
					}
				}
				if (local121 == 1) {
					local126++;
					if (local126 >= anIntArrayArray24[local117].length) {
						local126 = 0;
					}
				}
				this.designColors[local117] = local126;
				this.aBoolean263 = true;
			}
			if (local4 == 324 && !this.aBoolean245) {
				this.aBoolean245 = true;
				this.validateCharacterDesign(this.anInt905);
			}
			if (local4 == 325 && this.aBoolean245) {
				this.aBoolean245 = false;
				this.validateCharacterDesign(this.anInt905);
			}
			if (local4 == 326) {
				this.out.p1isaac(163);
				this.out.p1(this.aBoolean245 ? 0 : 1);
				for (local117 = 0; local117 < 7; local117++) {
					this.out.p1(this.anIntArray276[local117]);
				}
				for (local121 = 0; local121 < 5; local121++) {
					this.out.p1(this.designColors[local121]);
				}
				return true;
			}
			if (local4 == 620) {
				this.aBoolean241 = !this.aBoolean241;
			}
			if (local4 >= 601 && local4 <= 613) {
				this.method590();
				if (this.aString17.length() > 0) {
					this.out.p1isaac(184);
					this.out.p8(Class26.method248(this.aString17));
					this.out.p1(local4 - 601);
					this.out.p1(this.aBoolean241 ? 1 : 0);
				}
			}
			return false;
		} catch ( RuntimeException local356) {
			signlink.reporterror("37535, " + 631 + ", " + arg0 + ", " + local356.toString());
			throw new RuntimeException();
		}
	}

	private JagFile method636(int arg0, String arg1, int arg2, int arg3, String arg4) {
		try {
			byte[] local3 = null;
			int local5 = 5;
			try {
				if (this.aClass24Array1[0] != null) {
					local3 = this.aClass24Array1[0].method241(this.aByte45, arg3);
				}
			} catch ( Exception local21) {
			}
			int local35;
			if (local3 != null) {
				this.aCRC32_2.reset();
				this.aCRC32_2.update(local3);
				local35 = (int) this.aCRC32_2.getValue();
				if (local35 != arg0) {
					local3 = null;
				}
			}
			if (local3 != null) {
				return new JagFile(local3);
			}
			local35 = 0;
			while (local3 == null) {
				String local62 = "Unknown error";
				this.drawProgress(arg2, "Requesting " + arg4);
				int local77;
				try {
					local77 = 0;
					DataInputStream local88 = this.method606(arg1 + arg0);
					byte[] local91 = new byte[6];
					local88.readFully(local91, 0, 6);
					Packet local102 = new Packet(local91);
					local102.pos = 3;
					int local110 = local102.g3() + 6;
					int local112 = 6;
					local3 = new byte[local110];
					for ( int local117 = 0; local117 < 6; local117++) {
						local3[local117] = local91[local117];
					}
					int local135;
					while (local112 < local110) {
						local135 = local110 - local112;
						if (local135 > 1000) {
							local135 = 1000;
						}
						int local146 = local88.read(local3, local112, local135);
						if (local146 < 0) {
							(new StringBuffer("Length error: ")).append(local112).append("/").append(local110).toString();
							throw new IOException("EOF");
						}
						local112 += local146;
						int local175 = local112 * 100 / local110;
						if (local175 != local77) {
							this.drawProgress(arg2, "Loading " + arg4 + " - " + local175 + "%");
						}
						local77 = local175;
					}
					local88.close();
					try {
						if (this.aClass24Array1[0] != null) {
							this.aClass24Array1[0].method242(local3.length, local3, arg3);
						}
					} catch ( Exception local220) {
						this.aClass24Array1[0] = null;
					}
					if (local3 != null) {
						this.aCRC32_2.reset();
						this.aCRC32_2.update(local3);
						local135 = (int) this.aCRC32_2.getValue();
						if (local135 != arg0) {
							local3 = null;
							local35++;
							local62 = "Checksum error: " + local135;
						}
					}
				} catch ( IOException local255) {
					if (local62.equals("Unknown error")) {
						local62 = "Connection error";
					}
					local3 = null;
				} catch ( NullPointerException local265) {
					local62 = "Null error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch ( ArrayIndexOutOfBoundsException local274) {
					local62 = "Bounds error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch ( Exception local283) {
					local62 = "Unexpected error";
					local3 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (local3 == null) {
					for (local77 = local5; local77 > 0; local77--) {
						if (local35 >= 3) {
							this.drawProgress(arg2, "Game updated - please reload page");
							local77 = 10;
						} else {
							this.drawProgress(arg2, local62 + " - Retrying in " + local77);
						}
						try {
							Thread.sleep(1000L);
						} catch ( Exception local327) {
						}
					}
					local5 *= 2;
					if (local5 > 60) {
						local5 = 60;
					}
					this.aBoolean219 = !this.aBoolean219;
				}
			}
			return new JagFile(local3);
		} catch ( RuntimeException local359) {
			signlink.reporterror("12591, " + 14076 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local359.toString());
			throw new RuntimeException();
		}
	}

	@Override
	protected void refresh() {
		try {
			this.aBoolean236 = true;
		} catch ( RuntimeException local7) {
			signlink.reporterror("40389, " + -99 + ", " + local7.toString());
			throw new RuntimeException();
		}
	}

	private void method637(Packet arg0, int arg1, int arg2) {
		try {
			boolean local5 = false;
			for ( int local7 = 0; local7 < this.anInt885; local7++) {
				int local14 = this.anIntArray230[local7];
				Class10_Sub1_Sub2_Sub3_Sub1 local19 = this.npcs[local14];
				int local22 = arg0.g1();
				if ((local22 & 0x1) != 0) {
					local19.aClass38_1 = Class38.method407(arg0.method340());
					local19.anInt730 = local19.aClass38_1.aByte31;
					local19.anInt729 = local19.aClass38_1.anInt579;
					local19.anInt748 = local19.aClass38_1.anInt576;
					local19.anInt749 = local19.aClass38_1.anInt575;
					local19.anInt750 = local19.aClass38_1.anInt574;
					local19.anInt751 = local19.aClass38_1.anInt569;
					local19.anInt760 = local19.aClass38_1.anInt564;
				}
				if ((local22 & 0x40) != 0) {
					local19.anInt738 = arg0.method339();
					if (local19.anInt738 == 65535) {
						local19.anInt738 = -1;
					}
				}
				int local91;
				int local95;
				if ((local22 & 0x80) != 0) {
					local91 = arg0.method330();
					local95 = arg0.method330();
					local19.method541(anInt1050, local91, local95);
					local19.anInt724 = anInt1050 + 300;
					local19.anInt725 = arg0.g1();
					local19.anInt726 = arg0.method332(this.anInt1006);
				}
				if ((local22 & 0x4) != 0) {
					local19.anInt743 = arg0.g2();
					local91 = arg0.method346();
					local19.anInt747 = local91 >> 16;
					local19.anInt746 = anInt1050 + (local91 & 0xFFFF);
					local19.anInt744 = 0;
					local19.anInt745 = 0;
					if (local19.anInt746 > anInt1050) {
						local19.anInt744 = -1;
					}
					if (local19.anInt743 == 65535) {
						local19.anInt743 = -1;
					}
				}
				if ((local22 & 0x20) != 0) {
					local19.aString13 = arg0.gjstr();
					local19.anInt715 = 100;
				}
				if ((local22 & 0x8) != 0) {
					local19.anInt727 = arg0.method341();
					local19.anInt728 = arg0.method339();
				}
				if ((local22 & 0x2) != 0) {
					local91 = arg0.g2();
					if (local91 == 65535) {
						local91 = -1;
					}
					local95 = arg0.method332(this.anInt1006);
					if (local91 == local19.anInt753 && local91 != -1) {
						int local214 = Class15.aClass15Array1[local91].anInt160;
						if (local214 == 1) {
							local19.anInt754 = 0;
							local19.anInt755 = 0;
							local19.anInt756 = local95;
							local19.anInt757 = 0;
						}
						if (local214 == 2) {
							local19.anInt757 = 0;
						}
					} else if (local91 == -1 || local19.anInt753 == -1 || Class15.aClass15Array1[local91].anInt154 >= Class15.aClass15Array1[local19.anInt753].anInt154) {
						local19.anInt753 = local91;
						local19.anInt754 = 0;
						local19.anInt755 = 0;
						local19.anInt756 = local95;
						local19.anInt757 = 0;
						local19.anInt742 = local19.anInt759;
					}
				}
				if ((local22 & 0x10) != 0) {
					local91 = arg0.method332(this.anInt1006);
					local95 = arg0.method332(this.anInt1006);
					local19.method541(anInt1050, local91, local95);
					local19.anInt724 = anInt1050 + 300;
					local19.anInt725 = arg0.g1();
					local19.anInt726 = arg0.method331();
				}
			}
		} catch ( RuntimeException local314) {
			signlink.reporterror("29349, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	private void method638(int arg0, PlayerEntity arg1, int arg2, Packet arg3) {
		try {
			int local18;
			int local28;
			int local40;
			if ((arg2 & 0x8) != 0) {
				local18 = arg3.g2();
				if (local18 == 65535) {
					local18 = -1;
				}
				local28 = arg3.method332(this.anInt1006);
				if (local18 == arg1.anInt753 && local18 != -1) {
					local40 = Class15.aClass15Array1[local18].anInt160;
					if (local40 == 1) {
						arg1.anInt754 = 0;
						arg1.anInt755 = 0;
						arg1.anInt756 = local28;
						arg1.anInt757 = 0;
					}
					if (local40 == 2) {
						arg1.anInt757 = 0;
					}
				} else if (local18 == -1 || arg1.anInt753 == -1 || Class15.aClass15Array1[local18].anInt154 >= Class15.aClass15Array1[arg1.anInt753].anInt154) {
					arg1.anInt753 = local18;
					arg1.anInt754 = 0;
					arg1.anInt755 = 0;
					arg1.anInt756 = local28;
					arg1.anInt757 = 0;
					arg1.anInt742 = arg1.anInt759;
				}
			}
			if ((arg2 & 0x10) != 0) {
				arg1.aString13 = arg3.gjstr();
				if (arg1.aString13.charAt(0) == '~') {
					arg1.aString13 = arg1.aString13.substring(1);
					this.method622(arg1.aString14, arg1.aString13, 2);
				} else if (arg1 == localPlayer) {
					this.method622(arg1.aString14, arg1.aString13, 2);
				}
				arg1.anInt716 = 0;
				arg1.anInt722 = 0;
				arg1.anInt715 = 150;
			}
			if ((arg2 & 0x100) != 0) {
				arg1.anInt731 = arg3.method330();
				arg1.anInt733 = arg3.method331();
				arg1.anInt732 = arg3.method332(this.anInt1006);
				arg1.anInt734 = arg3.g1();
				arg1.anInt735 = arg3.g2() + anInt1050;
				arg1.anInt736 = arg3.method340() + anInt1050;
				arg1.anInt737 = arg3.g1();
				arg1.method538();
			}
			if ((arg2 & 0x1) != 0) {
				arg1.anInt738 = arg3.method340();
				if (arg1.anInt738 == 65535) {
					arg1.anInt738 = -1;
				}
			}
			if ((arg2 & 0x2) != 0) {
				arg1.anInt727 = arg3.g2();
				arg1.anInt728 = arg3.g2();
			}
			if ((arg2 & 0x200) != 0) {
				arg1.anInt743 = arg3.method340();
				local18 = arg3.method346();
				arg1.anInt747 = local18 >> 16;
				arg1.anInt746 = anInt1050 + (local18 & 0xFFFF);
				arg1.anInt744 = 0;
				arg1.anInt745 = 0;
				if (arg1.anInt746 > anInt1050) {
					arg1.anInt744 = -1;
				}
				if (arg1.anInt743 == 65535) {
					arg1.anInt743 = -1;
				}
			}
			if ((arg2 & 0x4) != 0) {
				local18 = arg3.g1();
				byte[] local276 = new byte[local18];
				Packet local282 = new Packet(local276);
				arg3.method348(local276, local18);
				this.playerAppearanceBuffer[arg0] = local282;
				arg1.method545(local282);
			}
			if ((arg2 & 0x400) != 0) {
				local18 = arg3.method330();
				local28 = arg3.method332(this.anInt1006);
				arg1.method541(anInt1050, local18, local28);
				arg1.anInt724 = anInt1050 + 300;
				arg1.anInt725 = arg3.method331();
				arg1.anInt726 = arg3.g1();
			}
			if ((arg2 & 0x40) != 0) {
				local18 = arg3.g2();
				local28 = arg3.method331();
				local40 = arg3.method330();
				int local348 = arg3.pos;
				if (arg1.aString14 != null && arg1.visible) {
					long local358 = Class26.method248(arg1.aString14);
					boolean local360 = false;
					if (local28 <= 1) {
						for ( int local365 = 0; local365 < this.anInt837; local365++) {
							if (this.aLongArray3[local365] == local358) {
								local360 = true;
								break;
							}
						}
					}
					if (!local360 && this.anInt1011 == 0) {
						try {
							this.aClass10_Sub1_Sub3_8.pos = 0;
							arg3.method349(this.aClass10_Sub1_Sub3_8.data, local40);
							this.aClass10_Sub1_Sub3_8.pos = 0;
							String local410 = Class32.method371(this.aClass10_Sub1_Sub3_8, local40);
							String local414 = Class46.method452(local410);
							arg1.aString13 = local414;
							arg1.anInt716 = local18 >> 8;
							arg1.anInt722 = local18 & 0xFF;
							arg1.anInt715 = 150;
							if (local28 == 2 || local28 == 3) {
								this.method622("@cr2@" + arg1.aString14, local414, 1);
							} else if (local28 == 1) {
								this.method622("@cr1@" + arg1.aString14, local414, 1);
							} else {
								this.method622(arg1.aString14, local414, 2);
							}
						} catch ( Exception local478) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg3.pos = local348 + local40;
			}
			if ((arg2 & 0x80) != 0) {
				local18 = arg3.method332(this.anInt1006);
				local28 = arg3.method331();
				arg1.method541(anInt1050, local18, local28);
				arg1.anInt724 = anInt1050 + 300;
				arg1.anInt725 = arg3.method332(this.anInt1006);
				arg1.anInt726 = arg3.g1();
			}
		} catch ( RuntimeException local522) {
			signlink.reporterror("61238, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local522.toString());
			throw new RuntimeException();
		}
	}

	private void method639() {
		try {
			if (this.aClass19_19 == null) {
				super.gameSurface = null;
				this.aClass19_18 = null;
				this.aClass19_16 = null;
				this.aClass19_15 = null;
				this.aClass19_17 = null;
				this.aClass19_12 = null;
				this.aClass19_13 = null;
				this.aClass19_14 = null;
				this.aClass19_22 = new PixMap(this.getBaseComponent(), 128, 265);
				Draw2D.clear();
				this.aClass19_23 = new PixMap(this.getBaseComponent(), 128, 265);
				Draw2D.clear();
				this.aClass19_19 = new PixMap(this.getBaseComponent(), 509, 171);
				Draw2D.clear();
				this.aClass19_20 = new PixMap(this.getBaseComponent(), 360, 132);
				Draw2D.clear();
				this.aClass19_21 = new PixMap(this.getBaseComponent(), 360, 200);
				Draw2D.clear();
				this.aClass19_24 = new PixMap(this.getBaseComponent(), 202, 238);
				Draw2D.clear();
				this.aClass19_25 = new PixMap(this.getBaseComponent(), 203, 238);
				Draw2D.clear();
				this.aClass19_26 = new PixMap(this.getBaseComponent(), 74, 94);
				Draw2D.clear();
				this.aClass19_27 = new PixMap(this.getBaseComponent(), 75, 94);
				Draw2D.clear();
				if (this.aClass2_2 != null) {
					this.method714(aBoolean250);
					this.method627();
				}
				this.aBoolean236 = true;
			}
		} catch ( RuntimeException local163) {
			signlink.reporterror("21632, " + -188 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@Override
	protected void load() {
		this.drawProgress(20, "Starting up");
		if (signlink.sunjava) {
			super.mindel = 5;
		}
		if (aBoolean230) {
			this.aBoolean232 = true;
			return;
		}
		aBoolean230 = true;
		boolean local21 = false;
		String local25 = this.method612();
		if (local25.endsWith("jagex.com")) {
			local21 = true;
		}
		if (local25.endsWith("runescape.com")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.2")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.231")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.229")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.228")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.227")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.226")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.224")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.223")) {
			local21 = true;
		}
		if (local25.endsWith("192.168.1.221")) {
			local21 = true;
		}
		if (local25.endsWith("127.0.0.1")) {
			local21 = true;
		}
		if (!local21) {
			this.aBoolean240 = true;
			return;
		}
		if (signlink.aRandomAccessFile3 != null) {
			for ( int local107 = 0; local107 < 5; local107++) {
				this.aClass24Array1[local107] = new Class24(local107 + 1, 600000, signlink.aRandomAccessFile3, signlink.aRandomAccessFileArray1[local107], 4);
			}
		}
		try {
			this.method661();
			this.aClass2_2 = this.method636(this.archiveChecksum[1], "title", 25, 1, "title screen");
			this.aClass10_Sub1_Sub1_Sub2_2 = new Class10_Sub1_Sub1_Sub2(false, this.aClass2_2, -914, "p11_full");
			this.aClass10_Sub1_Sub1_Sub2_3 = new Class10_Sub1_Sub1_Sub2(false, this.aClass2_2, -914, "p12_full");
			this.aClass10_Sub1_Sub1_Sub2_4 = new Class10_Sub1_Sub1_Sub2(false, this.aClass2_2, -914, "b12_full");
			this.aClass10_Sub1_Sub1_Sub2_5 = new Class10_Sub1_Sub1_Sub2(true, this.aClass2_2, -914, "q8_full");
			this.method714(aBoolean250);
			this.method627();
			JagFile local203 = this.method636(this.archiveChecksum[2], "config", 30, 2, "config");
			JagFile local215 = this.method636(this.archiveChecksum[3], "interface", 35, 3, "interface");
			JagFile local227 = this.method636(this.archiveChecksum[4], "media", 40, 4, "2d graphics");
			JagFile local239 = this.method636(this.archiveChecksum[6], "textures", 45, 6, "textures");
			JagFile local251 = this.method636(this.archiveChecksum[7], "wordenc", 50, 7, "chat system");
			JagFile local263 = this.method636(this.archiveChecksum[8], "sounds", 55, 8, "sound effects");
			this.aByteArrayArrayArray8 = new byte[4][104][104];
			this.anIntArrayArrayArray8 = new int[4][105][105];
			this.aClass23_1 = new Class23(this.anIntArrayArrayArray8, 104, 4, 104, (byte) 5);
			for ( int local288 = 0; local288 < 4; local288++) {
				this.aClass47Array1[local288] = new Class47(104, 0, 104);
			}
			this.aClass10_Sub1_Sub1_Sub1_11 = new Pix24(512, 512);
			JagFile local323 = this.method636(this.archiveChecksum[5], "versionlist", 60, 5, "update list");
			this.drawProgress(60, "Connecting to update server");
			this.aClass33_Sub1_1 = new Class33_Sub1();
			this.aClass33_Sub1_1.method564(local323, this);
			Class22.method165(this.aClass33_Sub1_1.method572(553));
			Model.method268(this.aClass33_Sub1_1.method569(0), this.aClass33_Sub1_1);
			if (!lowMemory) {
				this.anInt1023 = 0;
				this.aBoolean260 = true;
				this.aClass33_Sub1_1.method558(2, this.anInt1023);
				while (this.aClass33_Sub1_1.method562() > 0) {
					this.method652();
					try {
						Thread.sleep(100L);
					} catch ( Exception local374) {
					}
					if (this.aClass33_Sub1_1.anInt797 > 3) {
						this.method594("ondemand");
						return;
					}
				}
			}
			this.drawProgress(65, "Requesting animations");
			int local398 = this.aClass33_Sub1_1.method569(1);
			for ( int local400 = 0; local400 < local398; local400++) {
				this.aClass33_Sub1_1.method558(1, local400);
			}
			int local419;
			while (this.aClass33_Sub1_1.method562() > 0) {
				local419 = local398 - this.aClass33_Sub1_1.method562();
				if (local419 > 0) {
					this.drawProgress(65, "Loading animations - " + local419 * 100 / local398 + "%");
				}
				this.method652();
				try {
					Thread.sleep(100L);
				} catch ( Exception local445) {
				}
				if (this.aClass33_Sub1_1.anInt797 > 3) {
					this.method594("ondemand");
					return;
				}
			}
			this.drawProgress(70, "Requesting models");
			local398 = this.aClass33_Sub1_1.method569(0);
			int local479;
			for (local419 = 0; local419 < local398; local419++) {
				local479 = this.aClass33_Sub1_1.method554(local419);
				if ((local479 & 0x1) != 0) {
					this.aClass33_Sub1_1.method558(0, local419);
				}
			}
			local398 = this.aClass33_Sub1_1.method562();
			while (this.aClass33_Sub1_1.method562() > 0) {
				local479 = local398 - this.aClass33_Sub1_1.method562();
				if (local479 > 0) {
					this.drawProgress(70, "Loading models - " + local479 * 100 / local398 + "%");
				}
				this.method652();
				try {
					Thread.sleep(100L);
				} catch ( Exception local530) {
				}
			}
			if (this.aClass24Array1[0] != null) {
				this.drawProgress(75, "Requesting maps");
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 48, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 48, 1));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 48, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 48, 1));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(49, 48, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(49, 48, 1));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 47, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(47, 47, 1));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 47, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 47, 1));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 148, 0));
				this.aClass33_Sub1_1.method558(3, this.aClass33_Sub1_1.method573(48, 148, 1));
				local398 = this.aClass33_Sub1_1.method562();
				while (this.aClass33_Sub1_1.method562() > 0) {
					local479 = local398 - this.aClass33_Sub1_1.method562();
					if (local479 > 0) {
						this.drawProgress(75, "Loading maps - " + local479 * 100 / local398 + "%");
					}
					this.method652();
					try {
						Thread.sleep(100L);
					} catch ( Exception local715) {
					}
				}
			}
			local398 = this.aClass33_Sub1_1.method569(0);
			int local736;
			for (local479 = 0; local479 < local398; local479++) {
				local736 = this.aClass33_Sub1_1.method554(local479);
				byte local738 = 0;
				if ((local736 & 0x8) != 0) {
					local738 = 10;
				} else if ((local736 & 0x20) != 0) {
					local738 = 9;
				} else if ((local736 & 0x10) != 0) {
					local738 = 8;
				} else if ((local736 & 0x40) != 0) {
					local738 = 7;
				} else if ((local736 & 0x80) != 0) {
					local738 = 6;
				} else if ((local736 & 0x2) != 0) {
					local738 = 5;
				} else if ((local736 & 0x4) != 0) {
					local738 = 4;
				}
				if ((local736 & 0x1) != 0) {
					local738 = 3;
				}
				if (local738 != 0) {
					this.aClass33_Sub1_1.method556(0, local738, local479);
				}
			}
			this.aClass33_Sub1_1.method561(members);
			if (!lowMemory) {
				local398 = this.aClass33_Sub1_1.method569(2);
				for (local736 = 1; local736 < local398; local736++) {
					if (this.aClass33_Sub1_1.method557(local736, aBoolean229)) {
						this.aClass33_Sub1_1.method556(2, (byte) 1, local736);
					}
				}
			}
			local398 = this.aClass33_Sub1_1.method569(0);
			int local861;
			for (local736 = 0; local736 < local398; local736++) {
				local861 = this.aClass33_Sub1_1.method554(local736);
				if (local861 == 0 && this.aClass33_Sub1_1.anInt789 < 200) {
					this.aClass33_Sub1_1.method556(0, (byte) 1, local736);
				}
			}
			this.drawProgress(80, "Unpacking media");
			this.aClass10_Sub1_Sub1_Sub3_16 = new Class10_Sub1_Sub1_Sub3(local227, "invback", 0);
			this.aClass10_Sub1_Sub1_Sub3_18 = new Class10_Sub1_Sub1_Sub3(local227, "chatback", 0);
			this.aClass10_Sub1_Sub1_Sub3_17 = new Class10_Sub1_Sub1_Sub3(local227, "mapback", 0);
			this.aClass10_Sub1_Sub1_Sub3_6 = new Class10_Sub1_Sub1_Sub3(local227, "backbase1", 0);
			this.aClass10_Sub1_Sub1_Sub3_7 = new Class10_Sub1_Sub1_Sub3(local227, "backbase2", 0);
			this.aClass10_Sub1_Sub1_Sub3_8 = new Class10_Sub1_Sub1_Sub3(local227, "backhmid1", 0);
			for (local861 = 0; local861 < 13; local861++) {
				this.aClass10_Sub1_Sub1_Sub3Array2[local861] = new Class10_Sub1_Sub1_Sub3(local227, "sideicons", local861);
			}
			this.aClass10_Sub1_Sub1_Sub1_10 = new Pix24(local227, "compass", 0);
			this.aClass10_Sub1_Sub1_Sub1_17 = new Pix24(local227, "mapedge", 0);
			this.aClass10_Sub1_Sub1_Sub1_17.method75();
			for ( int local972 = 0; local972 < 72; local972++) {
				this.aClass10_Sub1_Sub1_Sub3Array5[local972] = new Class10_Sub1_Sub1_Sub3(local227, "mapscene", local972);
			}
			for ( int local990 = 0; local990 < 70; local990++) {
				this.aClass10_Sub1_Sub1_Sub1Array6[local990] = new Pix24(local227, "mapfunction", local990);
			}
			for ( int local1008 = 0; local1008 < 5; local1008++) {
				this.aClass10_Sub1_Sub1_Sub1Array8[local1008] = new Pix24(local227, "hitmarks", local1008);
			}
			for ( int local1026 = 0; local1026 < 6; local1026++) {
				this.aClass10_Sub1_Sub1_Sub1Array10[local1026] = new Pix24(local227, "headicons_pk", local1026);
			}
			for ( int local1044 = 0; local1044 < 9; local1044++) {
				this.aClass10_Sub1_Sub1_Sub1Array7[local1044] = new Pix24(local227, "headicons_prayer", local1044);
			}
			for ( int local1062 = 0; local1062 < 6; local1062++) {
				this.aClass10_Sub1_Sub1_Sub1Array5[local1062] = new Pix24(local227, "headicons_hint", local1062);
			}
			this.aClass10_Sub1_Sub1_Sub1_7 = new Pix24(local227, "overlay_multiway", 0);
			this.aClass10_Sub1_Sub1_Sub1_5 = new Pix24(local227, "mapmarker", 0);
			this.aClass10_Sub1_Sub1_Sub1_6 = new Pix24(local227, "mapmarker", 1);
			for ( int local1104 = 0; local1104 < 8; local1104++) {
				this.aClass10_Sub1_Sub1_Sub1Array4[local1104] = new Pix24(local227, "cross", local1104);
			}
			this.aClass10_Sub1_Sub1_Sub1_12 = new Pix24(local227, "mapdots", 0);
			this.aClass10_Sub1_Sub1_Sub1_13 = new Pix24(local227, "mapdots", 1);
			this.aClass10_Sub1_Sub1_Sub1_14 = new Pix24(local227, "mapdots", 2);
			this.aClass10_Sub1_Sub1_Sub1_15 = new Pix24(local227, "mapdots", 3);
			this.aClass10_Sub1_Sub1_Sub1_16 = new Pix24(local227, "mapdots", 4);
			this.aClass10_Sub1_Sub1_Sub3_14 = new Class10_Sub1_Sub1_Sub3(local227, "scrollbar", 0);
			this.aClass10_Sub1_Sub1_Sub3_15 = new Class10_Sub1_Sub1_Sub3(local227, "scrollbar", 1);
			this.aClass10_Sub1_Sub1_Sub3_1 = new Class10_Sub1_Sub1_Sub3(local227, "redstone1", 0);
			this.aClass10_Sub1_Sub1_Sub3_2 = new Class10_Sub1_Sub1_Sub3(local227, "redstone2", 0);
			this.aClass10_Sub1_Sub1_Sub3_3 = new Class10_Sub1_Sub1_Sub3(local227, "redstone3", 0);
			this.aClass10_Sub1_Sub1_Sub3_4 = new Class10_Sub1_Sub1_Sub3(local227, "redstone1", 0);
			this.aClass10_Sub1_Sub1_Sub3_4.method437();
			this.aClass10_Sub1_Sub1_Sub3_5 = new Class10_Sub1_Sub1_Sub3(local227, "redstone2", 0);
			this.aClass10_Sub1_Sub1_Sub3_5.method437();
			this.aClass10_Sub1_Sub1_Sub3_9 = new Class10_Sub1_Sub1_Sub3(local227, "redstone1", 0);
			this.aClass10_Sub1_Sub1_Sub3_9.method438();
			this.aClass10_Sub1_Sub1_Sub3_10 = new Class10_Sub1_Sub1_Sub3(local227, "redstone2", 0);
			this.aClass10_Sub1_Sub1_Sub3_10.method438();
			this.aClass10_Sub1_Sub1_Sub3_11 = new Class10_Sub1_Sub1_Sub3(local227, "redstone3", 0);
			this.aClass10_Sub1_Sub1_Sub3_11.method438();
			this.aClass10_Sub1_Sub1_Sub3_12 = new Class10_Sub1_Sub1_Sub3(local227, "redstone1", 0);
			this.aClass10_Sub1_Sub1_Sub3_12.method437();
			this.aClass10_Sub1_Sub1_Sub3_12.method438();
			this.aClass10_Sub1_Sub1_Sub3_13 = new Class10_Sub1_Sub1_Sub3(local227, "redstone2", 0);
			this.aClass10_Sub1_Sub1_Sub3_13.method437();
			this.aClass10_Sub1_Sub1_Sub3_13.method438();
			for ( int local1294 = 0; local1294 < 2; local1294++) {
				this.aClass10_Sub1_Sub1_Sub3Array4[local1294] = new Class10_Sub1_Sub1_Sub3(local227, "mod_icons", local1294);
			}
			Pix24 local1317 = new Pix24(local227, "backleft1", 0);
			this.aClass19_3 = new PixMap(this.getBaseComponent(), local1317.width, local1317.height);
			local1317.method76(0, 0);
			Pix24 local1342 = new Pix24(local227, "backleft2", 0);
			this.aClass19_4 = new PixMap(this.getBaseComponent(), local1342.width, local1342.height);
			local1342.method76(0, 0);
			Pix24 local1367 = new Pix24(local227, "backright1", 0);
			this.aClass19_5 = new PixMap(this.getBaseComponent(), local1367.width, local1367.height);
			local1367.method76(0, 0);
			Pix24 local1392 = new Pix24(local227, "backright2", 0);
			this.aClass19_6 = new PixMap(this.getBaseComponent(), local1392.width, local1392.height);
			local1392.method76(0, 0);
			Pix24 local1417 = new Pix24(local227, "backtop1", 0);
			this.aClass19_7 = new PixMap(this.getBaseComponent(), local1417.width, local1417.height);
			local1417.method76(0, 0);
			Pix24 local1442 = new Pix24(local227, "backvmid1", 0);
			this.aClass19_8 = new PixMap(this.getBaseComponent(), local1442.width, local1442.height);
			local1442.method76(0, 0);
			Pix24 local1467 = new Pix24(local227, "backvmid2", 0);
			this.aClass19_9 = new PixMap(this.getBaseComponent(), local1467.width, local1467.height);
			local1467.method76(0, 0);
			Pix24 local1492 = new Pix24(local227, "backvmid3", 0);
			this.aClass19_10 = new PixMap(this.getBaseComponent(), local1492.width, local1492.height);
			local1492.method76(0, 0);
			Pix24 local1517 = new Pix24(local227, "backhmid2", 0);
			this.aClass19_11 = new PixMap(this.getBaseComponent(), local1517.width, local1517.height);
			local1517.method76(0, 0);
			int local1542 = (int) (Math.random() * 21.0D) - 10;
			int local1549 = (int) (Math.random() * 21.0D) - 10;
			int local1556 = (int) (Math.random() * 21.0D) - 10;
			int local1563 = (int) (Math.random() * 41.0D) - 20;
			for ( int local1565 = 0; local1565 < 100; local1565++) {
				if (this.aClass10_Sub1_Sub1_Sub1Array6[local1565] != null) {
					this.aClass10_Sub1_Sub1_Sub1Array6[local1565].translate(local1556 + local1563, local1549 + local1563, local1542 + local1563);
				}
				if (this.aClass10_Sub1_Sub1_Sub3Array5[local1565] != null) {
					this.aClass10_Sub1_Sub1_Sub3Array5[local1565].method439(local1556 + local1563, local1549 + local1563, local1542 + local1563);
				}
			}
			this.drawProgress(83, "Unpacking textures");
			Class10_Sub1_Sub1_Sub4.method511(local239);
			Class10_Sub1_Sub1_Sub4.method515(0.8D, (byte) 6);
			Class10_Sub1_Sub1_Sub4.method510();
			this.drawProgress(86, "Unpacking config");
			Class15.method96(local203);
			Class48.method526(local203);
			Class16.method99(local203);
			Class17.method106(local203);
			Class38.method404(local203);
			IdkType.unpack(local203);
			Class28.method350(local203);
			Class44.method414(local203);
			Class50.method574(local203);
			Class17.aBoolean49 = members;
			if (!lowMemory) {
				this.drawProgress(90, "Unpacking sounds");
				byte[] local1668 = local263.read("sounds.dat", null);
				Packet local1674 = new Packet(local1668);
				Class39.method408(local1674);
			}
			this.drawProgress(95, "Unpacking interfaces");
			Class10_Sub1_Sub1_Sub2[] local1705 = new Class10_Sub1_Sub1_Sub2[] { this.aClass10_Sub1_Sub1_Sub2_2, this.aClass10_Sub1_Sub1_Sub2_3, this.aClass10_Sub1_Sub1_Sub2_4, this.aClass10_Sub1_Sub1_Sub2_5 };
			Class14.method91(local1705, local215, local227);
			this.drawProgress(100, "Preparing game engine");
			int local1721;
			int local1723;
			int local1725;
			for ( int local1717 = 0; local1717 < 33; local1717++) {
				local1721 = 999;
				local1723 = 0;
				for (local1725 = 0; local1725 < 34; local1725++) {
					if (this.aClass10_Sub1_Sub1_Sub3_17.aByteArray16[local1725 + local1717 * this.aClass10_Sub1_Sub1_Sub3_17.anInt652] == 0) {
						if (local1721 == 999) {
							local1721 = local1725;
						}
					} else if (local1721 != 999) {
						local1723 = local1725;
						break;
					}
				}
				this.anIntArray261[local1717] = local1721;
				this.anIntArray267[local1717] = local1723 - local1721;
			}
			int local1783;
			for (local1721 = 5; local1721 < 156; local1721++) {
				local1723 = 999;
				local1725 = 0;
				for (local1783 = 25; local1783 < 172; local1783++) {
					if (this.aClass10_Sub1_Sub1_Sub3_17.aByteArray16[local1783 + local1721 * this.aClass10_Sub1_Sub1_Sub3_17.anInt652] == 0 && (local1783 > 34 || local1721 > 34)) {
						if (local1723 == 999) {
							local1723 = local1783;
						}
					} else if (local1723 != 999) {
						local1725 = local1783;
						break;
					}
				}
				this.anIntArray241[local1721 - 5] = local1723 - 25;
				this.anIntArray220[local1721 - 5] = local1725 - local1723;
			}
			Class10_Sub1_Sub1_Sub4.method508(503, 765);
			this.anIntArray239 = Class10_Sub1_Sub1_Sub4.anIntArray183;
			Class10_Sub1_Sub1_Sub4.method508(96, 479);
			this.anIntArray236 = Class10_Sub1_Sub1_Sub4.anIntArray183;
			Class10_Sub1_Sub1_Sub4.method508(261, 190);
			this.anIntArray237 = Class10_Sub1_Sub1_Sub4.anIntArray183;
			Class10_Sub1_Sub1_Sub4.method508(334, 512);
			this.anIntArray238 = Class10_Sub1_Sub1_Sub4.anIntArray183;
			int[] local1874 = new int[9];
			for (local1725 = 0; local1725 < 9; local1725++) {
				local1783 = local1725 * 32 + 128 + 15;
				int local1892 = local1783 * 3 + 600;
				int local1896 = Class10_Sub1_Sub1_Sub4.anIntArray181[local1783];
				local1874[local1725] = local1892 * local1896 >> 16;
			}
			Class23.method226(local1874);
			Class46.method442(local251);
			this.aClass7_1 = new Class7(this, (byte) -116);
			this.startThread(this.aClass7_1, 10);
			Class10_Sub1_Sub2_Sub5.aClient2 = this;
			Class48.aClient4 = this;
			Class38.aClient3 = this;
		} catch ( Exception local1937) {
			signlink.reporterror("loaderror " + this.aString25 + " " + this.anInt1048);
			this.aBoolean264 = true;
		}
	}

	private void method640( int arg0) {
		try {
			if (!lowMemory) {
				for ( int local10 = 0; local10 < this.anIntArray268.length; local10++) {
					int local17 = this.anIntArray268[local10];
					if (Class10_Sub1_Sub1_Sub4.anIntArray185[local17] >= arg0) {
						Class10_Sub1_Sub1_Sub3 local26 = Class10_Sub1_Sub1_Sub4.aClass10_Sub1_Sub1_Sub3Array1[local17];
						int local34 = local26.anInt652 * local26.anInt653 - 1;
						int local42 = local26.anInt652 * this.anInt878 * 2;
						byte[] local45 = local26.aByteArray16;
						byte[] local48 = this.aByteArray21;
						for ( int local50 = 0; local50 <= local34; local50++) {
							local48[local50] = local45[local50 - local42 & local34];
						}
						local26.aByteArray16 = local48;
						this.aByteArray21 = local45;
						Class10_Sub1_Sub1_Sub4.method513(local17);
					}
				}
			}
		} catch ( RuntimeException local83) {
			signlink.reporterror("88281, " + arg0 + ", " + -927 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	private void method641( int arg0, Class14 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if (arg1.anInt120 == 0 && arg1.anIntArray43 != null && !arg1.aBoolean33 && (arg5 >= arg4 && arg6 >= arg0 && arg5 <= arg4 + arg1.anInt123 && arg6 <= arg0 + arg1.anInt121)) {
				int local38 = arg1.anIntArray43.length;
				for ( int local40 = 0; local40 < local38; local40++) {
					int local49 = arg1.anIntArray41[local40] + arg4;
					int local58 = arg1.anIntArray46[local40] + arg0 - arg3;
					Class14 local64 = Class14.method87(arg1.anIntArray43[local40]);
					int local69 = local49 + local64.anInt117;
					int local74 = local58 + local64.anInt134;
					if ((local64.anInt132 >= 0 || local64.anInt136 != 0) && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
						if (local64.anInt132 >= 0) {
							this.anInt863 = local64.anInt132;
						} else {
							this.anInt863 = local64.anInt111;
						}
					}
					if (local64.anInt120 == 8 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
						this.anInt1045 = local64.anInt111;
					}
					if (local64.anInt120 == 0) {
						this.method641(local74, local64, arg2, local64.anInt118, local69, arg5, arg6);
						if (local64.anInt147 > local64.anInt121) {
							this.method617(local64.anInt147, local74, local64, arg6, arg2, arg5, local64.anInt121, local69 + local64.anInt123);
						}
					} else {
						if (local64.anInt150 == 1 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							boolean local198 = false;
							if (local64.anInt124 != 0) {
								local198 = this.method598(local64, 8);
							}
							if (!local198) {
								this.aStringArray12[this.menuSize] = local64.aString4;
								this.anIntArray233[this.menuSize] = 352;
								this.anIntArray232[this.menuSize] = local64.anInt111;
								this.menuSize++;
							}
						}
						if (local64.anInt150 == 2 && this.spellSelected == 0 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							String local262 = local64.aString5;
							if (local262.indexOf(" ") != -1) {
								local262 = local262.substring(0, local262.indexOf(" "));
							}
							this.aStringArray12[this.menuSize] = local262 + " @gre@" + local64.aString1;
							this.anIntArray233[this.menuSize] = 70;
							this.anIntArray232[this.menuSize] = local64.anInt111;
							this.menuSize++;
						}
						if (local64.anInt150 == 3 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							this.aStringArray12[this.menuSize] = "Close";
							if (arg2 == 3) {
								this.anIntArray233[this.menuSize] = 55;
							} else {
								this.anIntArray233[this.menuSize] = 639;
							}
							this.anIntArray232[this.menuSize] = local64.anInt111;
							this.menuSize++;
						}
						if (local64.anInt150 == 4 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							this.aStringArray12[this.menuSize] = local64.aString4;
							this.anIntArray233[this.menuSize] = 890;
							this.anIntArray232[this.menuSize] = local64.anInt111;
							this.menuSize++;
						}
						if (local64.anInt150 == 5 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							this.aStringArray12[this.menuSize] = local64.aString4;
							this.anIntArray233[this.menuSize] = 518;
							this.anIntArray232[this.menuSize] = local64.anInt111;
							this.menuSize++;
						}
						if (local64.anInt150 == 6 && !this.aBoolean254 && arg5 >= local69 && arg6 >= local74 && arg5 < local69 + local64.anInt123 && arg6 < local74 + local64.anInt121) {
							this.aStringArray12[this.menuSize] = local64.aString4;
							this.anIntArray233[this.menuSize] = 575;
							this.anIntArray232[this.menuSize] = local64.anInt111;
							this.menuSize++;
						}
						if (local64.anInt120 == 2) {
							int local521 = 0;
							for ( int local523 = 0; local523 < local64.anInt121; local523++) {
								for ( int local527 = 0; local527 < local64.anInt123; local527++) {
									int local538 = local69 + local527 * (local64.anInt137 + 32);
									int local547 = local74 + local523 * (local64.anInt126 + 32);
									if (local521 < 20) {
										local538 += local64.anIntArray39[local521];
										local547 += local64.anIntArray38[local521];
									}
									if (arg5 >= local538 && arg6 >= local547 && arg5 < local538 + 32 && arg6 < local547 + 32) {
										this.anInt930 = local521;
										this.anInt931 = local64.anInt111;
										if (local64.anIntArray44[local521] > 0) {
											Class17 local600 = Class17.method104(local64.anIntArray44[local521] - 1);
											if (this.objSelected == 1 && local64.aBoolean34) {
												if (local64.anInt111 != this.anInt967 || local521 != this.anInt966) {
													this.aStringArray12[this.menuSize] = "Use " + this.aString30 + " with @lre@" + local600.aString7;
													this.anIntArray233[this.menuSize] = 903;
													this.anIntArray234[this.menuSize] = local600.anInt196;
													this.anIntArray231[this.menuSize] = local521;
													this.anIntArray232[this.menuSize] = local64.anInt111;
													this.menuSize++;
												}
											} else if (this.spellSelected != 1 || !local64.aBoolean34) {
												int local737;
												if (local64.aBoolean34) {
													for (local737 = 4; local737 >= 3; local737--) {
														if (local600.aStringArray3 != null && local600.aStringArray3[local737] != null) {
															this.aStringArray12[this.menuSize] = local600.aStringArray3[local737] + " @lre@" + local600.aString7;
															if (local737 == 3) {
																this.anIntArray233[this.menuSize] = 227;
															}
															if (local737 == 4) {
																this.anIntArray233[this.menuSize] = 891;
															}
															this.anIntArray234[this.menuSize] = local600.anInt196;
															this.anIntArray231[this.menuSize] = local521;
															this.anIntArray232[this.menuSize] = local64.anInt111;
															this.menuSize++;
														} else if (local737 == 4) {
															this.aStringArray12[this.menuSize] = "Drop @lre@" + local600.aString7;
															this.anIntArray233[this.menuSize] = 891;
															this.anIntArray234[this.menuSize] = local600.anInt196;
															this.anIntArray231[this.menuSize] = local521;
															this.anIntArray232[this.menuSize] = local64.anInt111;
															this.menuSize++;
														}
													}
												}
												if (local64.aBoolean43) {
													this.aStringArray12[this.menuSize] = "Use @lre@" + local600.aString7;
													this.anIntArray233[this.menuSize] = 52;
													this.anIntArray234[this.menuSize] = local600.anInt196;
													this.anIntArray231[this.menuSize] = local521;
													this.anIntArray232[this.menuSize] = local64.anInt111;
													this.menuSize++;
												}
												if (local64.aBoolean34 && local600.aStringArray3 != null) {
													for (local737 = 2; local737 >= 0; local737--) {
														if (local600.aStringArray3[local737] != null) {
															this.aStringArray12[this.menuSize] = local600.aStringArray3[local737] + " @lre@" + local600.aString7;
															if (local737 == 0) {
																this.anIntArray233[this.menuSize] = 961;
															}
															if (local737 == 1) {
																this.anIntArray233[this.menuSize] = 399;
															}
															if (local737 == 2) {
																this.anIntArray233[this.menuSize] = 324;
															}
															this.anIntArray234[this.menuSize] = local600.anInt196;
															this.anIntArray231[this.menuSize] = local521;
															this.anIntArray232[this.menuSize] = local64.anInt111;
															this.menuSize++;
														}
													}
												}
												if (local64.aStringArray1 != null) {
													for (local737 = 4; local737 >= 0; local737--) {
														if (local64.aStringArray1[local737] != null) {
															this.aStringArray12[this.menuSize] = local64.aStringArray1[local737] + " @lre@" + local600.aString7;
															if (local737 == 0) {
																this.anIntArray233[this.menuSize] = 9;
															}
															if (local737 == 1) {
																this.anIntArray233[this.menuSize] = 225;
															}
															if (local737 == 2) {
																this.anIntArray233[this.menuSize] = 444;
															}
															if (local737 == 3) {
																this.anIntArray233[this.menuSize] = 564;
															}
															if (local737 == 4) {
																this.anIntArray233[this.menuSize] = 894;
															}
															this.anIntArray234[this.menuSize] = local600.anInt196;
															this.anIntArray231[this.menuSize] = local521;
															this.anIntArray232[this.menuSize] = local64.anInt111;
															this.menuSize++;
														}
													}
												}
												this.aStringArray12[this.menuSize] = "Examine @lre@" + local600.aString7;
												this.anIntArray233[this.menuSize] = 1094;
												this.anIntArray234[this.menuSize] = local600.anInt196;
												this.anIntArray231[this.menuSize] = local521;
												this.anIntArray232[this.menuSize] = local64.anInt111;
												this.menuSize++;
											} else if ((this.anInt980 & 0x10) == 16) {
												this.aStringArray12[this.menuSize] = this.aString31 + " @lre@" + local600.aString7;
												this.anIntArray233[this.menuSize] = 361;
												this.anIntArray234[this.menuSize] = local600.anInt196;
												this.anIntArray231[this.menuSize] = local521;
												this.anIntArray232[this.menuSize] = local64.anInt111;
												this.menuSize++;
											}
										}
									}
									local521++;
								}
							}
						}
					}
				}
			}
		} catch ( RuntimeException local1167) {
			signlink.reporterror("81476, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 23658 + ", " + arg6 + ", " + local1167.toString());
			throw new RuntimeException();
		}
	}

	private void method642() {
		try {
			for ( int local1 = 0; local1 < this.anInt960; local1++) {
				int local8 = this.anIntArray256[local1];
				Class10_Sub1_Sub2_Sub3_Sub1 local13 = this.npcs[local8];
				if (local13 != null) {
					this.method643(local13.aClass38_1.aByte31, local13);
				}
			}
		} catch ( RuntimeException local36) {
			signlink.reporterror("63020, " + -37214 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	private void method643( int arg0, PathingEntity arg1) {
		try {
			if (arg1.anInt739 < 128 || arg1.anInt740 < 128 || arg1.anInt739 >= 13184 || arg1.anInt740 >= 13184) {
				arg1.anInt753 = -1;
				arg1.anInt743 = -1;
				arg1.anInt735 = 0;
				arg1.anInt736 = 0;
				arg1.anInt739 = arg1.anIntArray193[0] * 128 + arg1.anInt730 * 64;
				arg1.anInt740 = arg1.anIntArray194[0] * 128 + arg1.anInt730 * 64;
				arg1.method538();
			}
			if (arg1 == localPlayer && (arg1.anInt739 < 1536 || arg1.anInt740 < 1536 || arg1.anInt739 >= 11776 || arg1.anInt740 >= 11776)) {
				arg1.anInt753 = -1;
				arg1.anInt743 = -1;
				arg1.anInt735 = 0;
				arg1.anInt736 = 0;
				arg1.anInt739 = arg1.anIntArray193[0] * 128 + arg1.anInt730 * 64;
				arg1.anInt740 = arg1.anIntArray194[0] * 128 + arg1.anInt730 * 64;
				arg1.method538();
			}
			if (arg1.anInt735 > anInt1050) {
				this.method644(arg1);
			} else if (arg1.anInt736 >= anInt1050) {
				this.method645(arg1);
			} else {
				this.method646(arg1);
			}
			this.method647(arg1);
			this.method648(arg1);
		} catch ( RuntimeException local155) {
			signlink.reporterror("26942, " + arg0 + ", " + -97 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	private void method644( PathingEntity arg0) {
		try {
			int local12 = arg0.anInt735 - anInt1050;
			int local22 = arg0.anInt731 * 128 + arg0.anInt730 * 64;
			int local32 = arg0.anInt733 * 128 + arg0.anInt730 * 64;
			arg0.anInt739 += (local22 - arg0.anInt739) / local12;
			arg0.anInt740 += (local32 - arg0.anInt740) / local12;
			arg0.anInt752 = 0;
			if (arg0.anInt737 == 0) {
				arg0.anInt717 = 1024;
			}
			if (arg0.anInt737 == 1) {
				arg0.anInt717 = 1536;
			}
			if (arg0.anInt737 == 2) {
				arg0.anInt717 = 0;
			}
			if (arg0.anInt737 == 3) {
				arg0.anInt717 = 512;
			}
		} catch ( RuntimeException local86) {
			signlink.reporterror("69093, " + arg0 + ", " + true + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	private void method645( PathingEntity arg0) {
		try {
			if (arg0.anInt736 == anInt1050 || arg0.anInt753 == -1 || arg0.anInt756 != 0 || arg0.anInt755 + 1 > Class15.aClass15Array1[arg0.anInt753].method97(arg0.anInt754)) {
				int local29 = arg0.anInt736 - arg0.anInt735;
				int local34 = anInt1050 - arg0.anInt735;
				int local44 = arg0.anInt731 * 128 + arg0.anInt730 * 64;
				int local54 = arg0.anInt733 * 128 + arg0.anInt730 * 64;
				int local64 = arg0.anInt732 * 128 + arg0.anInt730 * 64;
				int local74 = arg0.anInt734 * 128 + arg0.anInt730 * 64;
				arg0.anInt739 = (local44 * (local29 - local34) + local64 * local34) / local29;
				arg0.anInt740 = (local54 * (local29 - local34) + local74 * local34) / local29;
			}
			arg0.anInt752 = 0;
			if (arg0.anInt737 == 0) {
				arg0.anInt717 = 1024;
			}
			if (arg0.anInt737 == 1) {
				arg0.anInt717 = 1536;
			}
			if (arg0.anInt737 == 2) {
				arg0.anInt717 = 0;
			}
			if (arg0.anInt737 == 3) {
				arg0.anInt717 = 512;
			}
			arg0.anInt741 = arg0.anInt717;
		} catch ( RuntimeException local139) {
			signlink.reporterror("67614, " + arg0 + ", " + -31135 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	private void method646( PathingEntity arg0) {
		try {
			arg0.anInt719 = arg0.anInt760;
			if (arg0.anInt759 == 0) {
				arg0.anInt752 = 0;
			} else {
				if (arg0.anInt753 != -1 && arg0.anInt756 == 0) {
					Class15 local24 = Class15.aClass15Array1[arg0.anInt753];
					if (arg0.anInt742 > 0 && local24.anInt158 == 0) {
						arg0.anInt752++;
						return;
					}
					if (arg0.anInt742 <= 0 && local24.anInt159 == 0) {
						arg0.anInt752++;
						return;
					}
				}
				int local53 = arg0.anInt739;
				int local56 = arg0.anInt740;
				int local71 = arg0.anIntArray193[arg0.anInt759 - 1] * 128 + arg0.anInt730 * 64;
				int local86 = arg0.anIntArray194[arg0.anInt759 - 1] * 128 + arg0.anInt730 * 64;
				if (local71 - local53 <= 256 && local71 - local53 >= -256 && local86 - local56 <= 256 && local86 - local56 >= -256) {
					if (local53 < local71) {
						if (local56 < local86) {
							arg0.anInt717 = 1280;
						} else if (local56 > local86) {
							arg0.anInt717 = 1792;
						} else {
							arg0.anInt717 = 1536;
						}
					} else if (local53 > local71) {
						if (local56 < local86) {
							arg0.anInt717 = 768;
						} else if (local56 > local86) {
							arg0.anInt717 = 256;
						} else {
							arg0.anInt717 = 512;
						}
					} else if (local56 < local86) {
						arg0.anInt717 = 1024;
					} else {
						arg0.anInt717 = 0;
					}
					int local180 = arg0.anInt717 - arg0.anInt741 & 0x7FF;
					if (local180 > 1024) {
						local180 -= 2048;
					}
					int local187 = arg0.anInt749;
					if (local180 >= -256 && local180 <= 256) {
						local187 = arg0.anInt748;
					} else if (local180 >= 256 && local180 < 768) {
						local187 = arg0.anInt751;
					} else if (local180 >= -768 && local180 <= -256) {
						local187 = arg0.anInt750;
					}
					if (local187 == -1) {
						local187 = arg0.anInt748;
					}
					arg0.anInt719 = local187;
					int local235 = 4;
					if (arg0.anInt741 != arg0.anInt717 && arg0.anInt738 == -1 && arg0.anInt729 != 0) {
						local235 = 2;
					}
					if (arg0.anInt759 > 2) {
						local235 = 6;
					}
					if (arg0.anInt759 > 3) {
						local235 = 8;
					}
					if (arg0.anInt752 > 0 && arg0.anInt759 > 1) {
						local235 = 8;
						arg0.anInt752--;
					}
					if (arg0.aBooleanArray10[arg0.anInt759 - 1]) {
						local235 <<= 0x1;
					}
					if (local235 >= 8 && arg0.anInt719 == arg0.anInt748 && arg0.anInt758 != -1) {
						arg0.anInt719 = arg0.anInt758;
					}
					if (local53 < local71) {
						arg0.anInt739 += local235;
						if (arg0.anInt739 > local71) {
							arg0.anInt739 = local71;
						}
					} else if (local53 > local71) {
						arg0.anInt739 -= local235;
						if (arg0.anInt739 < local71) {
							arg0.anInt739 = local71;
						}
					}
					if (local56 < local86) {
						arg0.anInt740 += local235;
						if (arg0.anInt740 > local86) {
							arg0.anInt740 = local86;
						}
					} else if (local56 > local86) {
						arg0.anInt740 -= local235;
						if (arg0.anInt740 < local86) {
							arg0.anInt740 = local86;
						}
					}
					if (arg0.anInt739 == local71 && arg0.anInt740 == local86) {
						arg0.anInt759--;
						if (arg0.anInt742 > 0) {
							arg0.anInt742--;
							return;
						}
					}
				} else {
					arg0.anInt739 = local71;
					arg0.anInt740 = local86;
				}
			}
		} catch ( RuntimeException local397) {
			signlink.reporterror("4659, " + arg0 + ", " + 0 + ", " + local397.toString());
			throw new RuntimeException();
		}
	}

	private void method647( PathingEntity arg0) {
		try {
			if (arg0.anInt729 != 0) {
				int local35;
				int local41;
				if (arg0.anInt738 != -1 && arg0.anInt738 < 32768) {
					Class10_Sub1_Sub2_Sub3_Sub1 local27 = this.npcs[arg0.anInt738];
					if (local27 != null) {
						local35 = arg0.anInt739 - local27.anInt739;
						local41 = arg0.anInt740 - local27.anInt740;
						if (local35 != 0 || local41 != 0) {
							arg0.anInt717 = (int) (Math.atan2((double) local35, (double) local41) * 325.949D) & 0x7FF;
						}
					}
				}
				int local66;
				if (arg0.anInt738 >= 32768) {
					local66 = arg0.anInt738 - 32768;
					if (local66 == this.anInt881) {
						local66 = this.anInt883;
					}
					PlayerEntity local78 = this.players[local66];
					if (local78 != null) {
						local41 = arg0.anInt739 - local78.anInt739;
						int local92 = arg0.anInt740 - local78.anInt740;
						if (local41 != 0 || local92 != 0) {
							arg0.anInt717 = (int) (Math.atan2((double) local41, (double) local92) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.anInt727 != 0 || arg0.anInt728 != 0) && (arg0.anInt759 == 0 || arg0.anInt752 > 0)) {
					local66 = arg0.anInt739 - (arg0.anInt727 - this.anInt914 - this.anInt914) * 64;
					local35 = arg0.anInt740 - (arg0.anInt728 - this.anInt915 - this.anInt915) * 64;
					if (local66 != 0 || local35 != 0) {
						arg0.anInt717 = (int) (Math.atan2((double) local66, (double) local35) * 325.949D) & 0x7FF;
					}
					arg0.anInt727 = 0;
					arg0.anInt728 = 0;
				}
				local66 = arg0.anInt717 - arg0.anInt741 & 0x7FF;
				if (local66 != 0) {
					if (local66 < arg0.anInt729 || local66 > 2048 - arg0.anInt729) {
						arg0.anInt741 = arg0.anInt717;
					} else if (local66 > 1024) {
						arg0.anInt741 -= arg0.anInt729;
					} else {
						arg0.anInt741 += arg0.anInt729;
					}
					arg0.anInt741 &= 0x7FF;
					if (arg0.anInt719 == arg0.anInt760 && arg0.anInt741 != arg0.anInt717) {
						if (arg0.anInt761 != -1) {
							arg0.anInt719 = arg0.anInt761;
							return;
						}
						arg0.anInt719 = arg0.anInt748;
						return;
					}
				}
			}
		} catch ( RuntimeException local246) {
			signlink.reporterror("40909, " + 8 + ", " + arg0 + ", " + local246.toString());
			throw new RuntimeException();
		}
	}

	private void method648( PathingEntity arg0) {
		try {
			arg0.aBoolean196 = false;
			Class15 local20;
			if (arg0.anInt719 != -1) {
				local20 = Class15.aClass15Array1[arg0.anInt719];
				arg0.anInt721++;
				if (arg0.anInt720 < local20.anInt152 && arg0.anInt721 > local20.method97(arg0.anInt720)) {
					arg0.anInt721 = 1;
					arg0.anInt720++;
				}
				if (arg0.anInt720 >= local20.anInt152) {
					arg0.anInt721 = 1;
					arg0.anInt720 = 0;
				}
			}
			if (arg0.anInt743 != -1 && anInt1050 >= arg0.anInt746) {
				if (arg0.anInt744 < 0) {
					arg0.anInt744 = 0;
				}
				local20 = Class28.aClass28Array1[arg0.anInt743].aClass15_1;
				arg0.anInt745++;
				if (arg0.anInt744 < local20.anInt152 && arg0.anInt745 > local20.method97(arg0.anInt744)) {
					arg0.anInt745 = 1;
					arg0.anInt744++;
				}
				if (arg0.anInt744 >= local20.anInt152 && (arg0.anInt744 < 0 || arg0.anInt744 >= local20.anInt152)) {
					arg0.anInt743 = -1;
				}
			}
			if (arg0.anInt753 != -1 && arg0.anInt756 <= 1) {
				local20 = Class15.aClass15Array1[arg0.anInt753];
				if (local20.anInt158 == 1 && arg0.anInt742 > 0 && arg0.anInt735 <= anInt1050 && arg0.anInt736 < anInt1050) {
					arg0.anInt756 = 1;
					return;
				}
			}
			if (arg0.anInt753 != -1 && arg0.anInt756 == 0) {
				local20 = Class15.aClass15Array1[arg0.anInt753];
				arg0.anInt755++;
				if (arg0.anInt754 < local20.anInt152 && arg0.anInt755 > local20.method97(arg0.anInt754)) {
					arg0.anInt755 = 1;
					arg0.anInt754++;
				}
				if (arg0.anInt754 >= local20.anInt152) {
					arg0.anInt754 -= local20.anInt153;
					arg0.anInt757++;
					if (arg0.anInt757 >= local20.anInt157) {
						arg0.anInt753 = -1;
					}
					if (arg0.anInt754 < 0 || arg0.anInt754 >= local20.anInt152) {
						arg0.anInt753 = -1;
					}
				}
				arg0.aBoolean196 = local20.aBoolean45;
			}
			if (arg0.anInt756 > 0) {
				arg0.anInt756--;
			}
		} catch ( RuntimeException local247) {
			signlink.reporterror("8251, " + arg0 + ", " + -136 + ", " + local247.toString());
			throw new RuntimeException();
		}
	}

	private void method649() {
		try {
			if (this.anInt926 == -1 || this.sceneState != 2 && super.gameSurface == null) {
				if (this.aBoolean236) {
					this.prepareGameScreen();
					this.aBoolean236 = false;
					this.aClass19_3.method131(4, 0, super.graphics);
					this.aClass19_4.method131(357, 0, super.graphics);
					this.aClass19_5.method131(4, 722, super.graphics);
					this.aClass19_6.method131(205, 743, super.graphics);
					this.aClass19_7.method131(0, 0, super.graphics);
					this.aClass19_8.method131(4, 516, super.graphics);
					this.aClass19_9.method131(205, 516, super.graphics);
					this.aClass19_10.method131(357, 496, super.graphics);
					this.aClass19_11.method131(338, 0, super.graphics);
					this.aBoolean248 = true;
					this.aBoolean255 = true;
					this.aBoolean225 = true;
					this.aBoolean253 = true;
					if (this.sceneState != 2) {
						this.aClass19_17.method131(4, 4, super.graphics);
						this.aClass19_16.method131(4, 550, super.graphics);
					}
					anInt1007++;
					if (anInt1007 > 85) {
						anInt1007 = 0;
						this.out.p1isaac(168);
					}
				}
				if (this.sceneState == 2) {
					this.method726();
				}
				if (this.menuVisible && this.anInt1039 == 1) {
					this.aBoolean248 = true;
				}
				boolean local306;
				if (this.anInt941 != -1) {
					local306 = this.method663(this.anInt878, this.anInt941, (byte) 5);
					if (local306) {
						this.aBoolean248 = true;
					}
				}
				if (this.anInt1056 == 2) {
					this.aBoolean248 = true;
				}
				if (this.anInt950 == 2) {
					this.aBoolean248 = true;
				}
				if (this.aBoolean248) {
					this.method709();
					this.aBoolean248 = false;
				}
				int local391;
				if (this.anInt888 == -1 && this.anInt1010 == 0) {
					this.aClass14_1.anInt118 = this.anInt947 - this.anInt834 - 77;
					if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
						this.method617(this.anInt947, 0, this.aClass14_1, super.mouseY - 357, -1, super.mouseX - 17, 77, 463);
					}
					local391 = this.anInt947 - this.aClass14_1.anInt118 - 77;
					if (local391 < 0) {
						local391 = 0;
					}
					if (local391 > this.anInt947 - 77) {
						local391 = this.anInt947 - 77;
					}
					if (this.anInt834 != local391) {
						this.anInt834 = local391;
						this.aBoolean255 = true;
					}
				}
				if (this.anInt888 == -1 && this.anInt1010 == 3) {
					local391 = this.anInt840 * 14 + 7;
					this.aClass14_1.anInt118 = this.anInt841;
					if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
						this.method617(local391, 0, this.aClass14_1, super.mouseY - 357, -1, super.mouseX - 17, 77, 463);
					}
					int local470 = this.aClass14_1.anInt118;
					if (local470 < 0) {
						local470 = 0;
					}
					if (local470 > local391 - 77) {
						local470 = local391 - 77;
					}
					if (this.anInt841 != local470) {
						this.anInt841 = local470;
						this.aBoolean255 = true;
					}
				}
				if (this.anInt888 != -1) {
					local306 = this.method663(this.anInt878, this.anInt888, (byte) 5);
					if (local306) {
						this.aBoolean255 = true;
					}
				}
				if (this.anInt1056 == 3) {
					this.aBoolean255 = true;
				}
				if (this.anInt950 == 3) {
					this.aBoolean255 = true;
				}
				if (this.aString26 != null) {
					this.aBoolean255 = true;
				}
				if (this.menuVisible && this.anInt1039 == 2) {
					this.aBoolean255 = true;
				}
				if (this.aBoolean255) {
					this.method659();
					this.aBoolean255 = false;
				}
				if (this.sceneState == 2) {
					this.method662(503);
					this.aClass19_16.method131(4, 550, super.graphics);
				}
				if (this.anInt988 != -1) {
					this.aBoolean225 = true;
				}
				if (this.aBoolean225) {
					if (this.anInt988 != -1 && this.anInt988 == this.anInt1031) {
						this.anInt988 = -1;
						this.out.p1isaac(119);
						this.out.p1(this.anInt1031);
					}
					this.aBoolean225 = false;
					this.aClass19_14.method130();
					this.aClass10_Sub1_Sub1_Sub3_8.method440(0, 0);
					if (this.anInt941 == -1) {
						if (this.anIntArray248[this.anInt1031] != -1) {
							if (this.anInt1031 == 0) {
								this.aClass10_Sub1_Sub1_Sub3_1.method440(10, 22);
							}
							if (this.anInt1031 == 1) {
								this.aClass10_Sub1_Sub1_Sub3_2.method440(8, 54);
							}
							if (this.anInt1031 == 2) {
								this.aClass10_Sub1_Sub1_Sub3_2.method440(8, 82);
							}
							if (this.anInt1031 == 3) {
								this.aClass10_Sub1_Sub1_Sub3_3.method440(8, 110);
							}
							if (this.anInt1031 == 4) {
								this.aClass10_Sub1_Sub1_Sub3_5.method440(8, 153);
							}
							if (this.anInt1031 == 5) {
								this.aClass10_Sub1_Sub1_Sub3_5.method440(8, 181);
							}
							if (this.anInt1031 == 6) {
								this.aClass10_Sub1_Sub1_Sub3_4.method440(9, 209);
							}
						}
						if (this.anIntArray248[0] != -1 && (this.anInt988 != 0 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[0].method440(13, 29);
						}
						if (this.anIntArray248[1] != -1 && (this.anInt988 != 1 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[1].method440(11, 53);
						}
						if (this.anIntArray248[2] != -1 && (this.anInt988 != 2 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[2].method440(11, 82);
						}
						if (this.anIntArray248[3] != -1 && (this.anInt988 != 3 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[3].method440(12, 115);
						}
						if (this.anIntArray248[4] != -1 && (this.anInt988 != 4 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[4].method440(13, 153);
						}
						if (this.anIntArray248[5] != -1 && (this.anInt988 != 5 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[5].method440(11, 180);
						}
						if (this.anIntArray248[6] != -1 && (this.anInt988 != 6 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[6].method440(13, 208);
						}
					}
					this.aClass19_14.method131(160, 516, super.graphics);
					this.aClass19_13.method130();
					this.aClass10_Sub1_Sub1_Sub3_7.method440(0, 0);
					if (this.anInt941 == -1) {
						if (this.anIntArray248[this.anInt1031] != -1) {
							if (this.anInt1031 == 7) {
								this.aClass10_Sub1_Sub1_Sub3_9.method440(0, 42);
							}
							if (this.anInt1031 == 8) {
								this.aClass10_Sub1_Sub1_Sub3_10.method440(0, 74);
							}
							if (this.anInt1031 == 9) {
								this.aClass10_Sub1_Sub1_Sub3_10.method440(0, 102);
							}
							if (this.anInt1031 == 10) {
								this.aClass10_Sub1_Sub1_Sub3_11.method440(1, 130);
							}
							if (this.anInt1031 == 11) {
								this.aClass10_Sub1_Sub1_Sub3_13.method440(0, 173);
							}
							if (this.anInt1031 == 12) {
								this.aClass10_Sub1_Sub1_Sub3_13.method440(0, 201);
							}
							if (this.anInt1031 == 13) {
								this.aClass10_Sub1_Sub1_Sub3_12.method440(0, 229);
							}
						}
						if (this.anIntArray248[8] != -1 && (this.anInt988 != 8 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[7].method440(2, 74);
						}
						if (this.anIntArray248[9] != -1 && (this.anInt988 != 9 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[8].method440(3, 102);
						}
						if (this.anIntArray248[10] != -1 && (this.anInt988 != 10 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[9].method440(4, 137);
						}
						if (this.anIntArray248[11] != -1 && (this.anInt988 != 11 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[10].method440(2, 174);
						}
						if (this.anIntArray248[12] != -1 && (this.anInt988 != 12 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[11].method440(2, 201);
						}
						if (this.anIntArray248[13] != -1 && (this.anInt988 != 13 || anInt1050 % 20 < 10)) {
							this.aClass10_Sub1_Sub1_Sub3Array2[12].method440(2, 226);
						}
					}
					this.aClass19_13.method131(466, 496, super.graphics);
					this.aClass19_17.method130();
					Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
				}
				if (this.aBoolean253) {
					this.aBoolean253 = false;
					this.aClass19_12.method130();
					this.aClass10_Sub1_Sub1_Sub3_6.method440(0, 0);
					this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 28, 55, "Public chat");
					if (this.anInt899 == 0) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65280, 41, 55, "On");
					}
					if (this.anInt899 == 1) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16776960, 41, 55, "Friends");
					}
					if (this.anInt899 == 2) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16711680, 41, 55, "Off");
					}
					if (this.anInt899 == 3) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65535, 41, 55, "Hide");
					}
					this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 28, 184, "Private chat");
					if (this.anInt853 == 0) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65280, 41, 184, "On");
					}
					if (this.anInt853 == 1) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16776960, 41, 184, "Friends");
					}
					if (this.anInt853 == 2) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16711680, 41, 184, "Off");
					}
					this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 28, 324, "Trade/compete");
					if (this.anInt1000 == 0) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 65280, 41, 324, "On");
					}
					if (this.anInt1000 == 1) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16776960, 41, 324, "Friends");
					}
					if (this.anInt1000 == 2) {
						this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16711680, 41, 324, "Off");
					}
					this.aClass10_Sub1_Sub1_Sub2_3.method149(true, this.anInt928, 16777215, 33, 458, "Report abuse");
					this.aClass19_12.method131(453, 0, super.graphics);
					this.aClass19_17.method130();
					Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
				}
				this.anInt878 = 0;
			} else {
				if (this.sceneState == 2) {
					this.method663(this.anInt878, this.anInt926, (byte) 5);
					if (this.anInt880 != -1) {
						this.method663(this.anInt878, this.anInt880, (byte) 5);
					}
					this.anInt878 = 0;
					this.method722(this.anInt964);
					super.gameSurface.method130();
					Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray239;
					Draw2D.clear();
					this.aBoolean236 = true;
					Class14 local59 = Class14.method87(this.anInt926);
					if (local59.anInt123 == 512 && local59.anInt121 == 334 && local59.anInt120 == 0) {
						local59.anInt123 = 765;
						local59.anInt121 = 503;
					}
					this.method717(0, 0, local59, 0);
					if (this.anInt880 != -1) {
						local59 = Class14.method87(this.anInt880);
						if (local59.anInt123 == 512 && local59.anInt121 == 334 && local59.anInt120 == 0) {
							local59.anInt123 = 765;
							local59.anInt121 = 503;
						}
						this.method717(0, 0, local59, 0);
					}
					if (this.menuVisible) {
						this.method703();
					} else {
						this.method666();
						this.method609();
					}
				}
				super.gameSurface.method131(0, 0, super.graphics);
			}
		} catch ( RuntimeException local1328) {
			signlink.reporterror("29795, " + 7 + ", " + local1328.toString());
			throw new RuntimeException();
		}
	}

	private void method650() {
		try {
			this.packetSize += 0;
			if (this.anInt997 != 0) {
				Class10_Sub1_Sub1_Sub2 local12 = this.aClass10_Sub1_Sub1_Sub2_3;
				int local14 = 0;
				if (this.systemUpdateTimer != 0) {
					local14 = 1;
				}
				for ( int local21 = 0; local21 < 100; local21++) {
					if (this.messageText[local21] != null) {
						int local33 = this.anIntArray270[local21];
						String local38 = this.aStringArray13[local21];
						byte local40 = 0;
						if (local38 != null && local38.startsWith("@cr1@")) {
							local38 = local38.substring(5);
							local40 = 1;
						}
						if (local38 != null && local38.startsWith("@cr2@")) {
							local38 = local38.substring(5);
							local40 = 2;
						}
						int local91;
						if ((local33 == 3 || local33 == 7) && (local33 == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.method723(local38))) {
							local91 = 329 - local14 * 13;
							local12.method152(4, 0, local91, "From");
							local12.method152(4, 65535, local91 - 1, "From");
							int local116 = local12.method150("From ") + 4;
							if (local40 == 1) {
								this.aClass10_Sub1_Sub1_Sub3Array4[0].method440(local91 - 12, local116);
								local116 += 14;
							}
							if (local40 == 2) {
								this.aClass10_Sub1_Sub1_Sub3Array4[1].method440(local91 - 12, local116);
								local116 += 14;
							}
							local12.method152(local116, 0, local91, local38 + ": " + this.messageText[local21]);
							local12.method152(local116, 65535, local91 - 1, local38 + ": " + this.messageText[local21]);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 5 && this.anInt853 < 2) {
							local91 = 329 - local14 * 13;
							local12.method152(4, 0, local91, this.messageText[local21]);
							local12.method152(4, 65535, local91 - 1, this.messageText[local21]);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
						if (local33 == 6 && this.anInt853 < 2) {
							local91 = 329 - local14 * 13;
							local12.method152(4, 0, local91, "To " + local38 + ": " + this.messageText[local21]);
							local12.method152(4, 65535, local91 - 1, "To " + local38 + ": " + this.messageText[local21]);
							local14++;
							if (local14 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch ( RuntimeException local295) {
			signlink.reporterror("72902, " + 0 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void init() {
		nodeId = Integer.parseInt(this.getParameter("nodeid"));
		portOffset = Integer.parseInt(this.getParameter("portoff"));
		String local15 = this.getParameter("lowmem");
		if (local15 != null && local15.equals("1")) {
			setLowMemory();
		} else {
			setHighMemory();
		}
		String local31 = this.getParameter("free");
		if (local31 != null && local31.equals("1")) {
			members = false;
		} else {
			members = true;
		}
		this.initApplet();
	}

	private void method651() {
		try {
			for (Class10_Sub1_Sub2_Sub6 local13 = (Class10_Sub1_Sub2_Sub6) this.spotanims.method6(); local13 != null; local13 = (Class10_Sub1_Sub2_Sub6) this.spotanims.method8()) {
				if (local13.anInt623 != this.anInt942 || local13.aBoolean156) {
					local13.unlink();
				} else if (anInt1050 >= local13.anInt629) {
					local13.method420((byte) 1, this.anInt878);
					if (local13.aBoolean156) {
						local13.unlink();
					} else {
						this.aClass23_1.method201(-1, local13, local13.anInt624, local13.anInt626, false, local13.anInt623, 60, local13.anInt625, 0);
					}
				}
			}
		} catch ( RuntimeException local71) {
			signlink.reporterror("83050, " + -992 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	private void method652() {
		try {
			while (true) {
				Class10_Sub1_Sub4 local10 = this.aClass33_Sub1_1.method559();
				if (local10 == null) {
					return;
				}
				if (local10.anInt486 == 0) {
					Model.method269(local10.aByteArray13, local10.anInt487);
					if ((this.aClass33_Sub1_1.method554(local10.anInt487) & 0x62) != 0) {
						this.aBoolean248 = true;
						if (this.anInt888 != -1 || this.anInt985 != -1) {
							this.aBoolean255 = true;
						}
					}
				}
				if (local10.anInt486 == 1 && local10.aByteArray13 != null) {
					Class22.method166(local10.aByteArray13);
				}
				if (local10.anInt486 == 2 && local10.anInt487 == this.anInt1023 && local10.aByteArray13 != null) {
					this.method599(this.aBoolean260, local10.aByteArray13, 659);
				}
				if (local10.anInt486 == 3 && this.sceneState == 1) {
					for ( int local85 = 0; local85 < this.aByteArrayArray5.length; local85++) {
						if (this.anIntArray217[local85] == local10.anInt487) {
							this.aByteArrayArray5[local85] = local10.aByteArray13;
							if (local10.aByteArray13 == null) {
								this.anIntArray217[local85] = -1;
							}
							break;
						}
						if (this.anIntArray218[local85] == local10.anInt487) {
							this.aByteArrayArray6[local85] = local10.aByteArray13;
							if (local10.aByteArray13 == null) {
								this.anIntArray218[local85] = -1;
							}
							break;
						}
					}
				}
				if (local10.anInt486 == 93 && this.aClass33_Sub1_1.method563(local10.anInt487)) {
					Class8.method17(this.aClass33_Sub1_1, new Packet(local10.aByteArray13));
				}
			}
		} catch ( RuntimeException local162) {
			signlink.reporterror("96200, " + false + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	private boolean method653() {
		try {
			return signlink.wavereplay();
		} catch ( RuntimeException local11) {
			signlink.reporterror("22206, " + 295 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	private void login(String username, String password, boolean reconnect) {
		signlink.errorname = username;
		try {
			if (!reconnect) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Connecting to server...";
				this.drawTitleScreen(true);
			}
			this.stream = new ClientStream(this.openSocket(portOffset + 43594), this);
			long local30 = Class26.method248(username);
			int local37 = (int) (local30 >> 16 & 0x1FL);
			this.out.pos = 0;
			this.out.p1(14);
			this.out.p1(local37);
			this.stream.write(2, this.out.data);
			for ( int local60 = 0; local60 < 8; local60++) {
				this.stream.read();
			}
			int reply = this.stream.read();
			int local76 = reply;
			int i;
			if (reply == 0) {
				this.stream.read(this.in.data, 0, 8);
				this.in.pos = 0;
				this.serverSeed = this.in.g8();
				int[] seed = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.serverSeed >> 32), (int) this.serverSeed};
				this.out.pos = 0;
				this.out.p1(10);
				this.out.p4(seed[0]);
				this.out.p4(seed[1]);
				this.out.p4(seed[2]);
				this.out.p4(seed[3]);
				this.out.p4(signlink.anInt1058);
				this.out.pjstr(username);
				this.out.pjstr(password);
				this.out.rsaenc(modulus, exponent);
				this.login.pos = 0;
				if (reconnect) {
					this.login.p1(18);
				} else {
					this.login.p1(16);
				}
				this.login.p1(this.out.pos + 36 + 1 + 1 + 2);
				this.login.p1(255);
				this.login.p2(signlink.clientversion);
				this.login.p1(lowMemory ? 1 : 0);
				for (i = 0; i < 9; i++) {
					this.login.p4(this.archiveChecksum[i]);
				}
				this.login.pdata(this.out.data, this.out.pos);
				this.out.random = new Isaac(seed);
				for (i = 0; i < 4; i++) {
					seed[i] += 50;
				}
				this.randomIn = new Isaac(seed);
				this.stream.write(this.login.pos, this.login.data);
				reply = this.stream.read();
			}
			if (reply == 1) {
				try {
					Thread.sleep(2000L);
				} catch ( Exception ex) {
				}
				this.login(username, password, reconnect);
			} else {
				int k;
				if (reply == 2) {

					this.anInt842 = this.stream.read();
					aBoolean228 = this.stream.read() == 1;
					this.aLong29 = 0L;
					this.anInt1035 = 0;
					this.aClass7_1.anInt54 = 0;
					super.hasFocus = true;
					this.aBoolean262 = true;
					this.ingame = true;

					this.out.pos = 0;
					this.in.pos = 0;
					this.packetType = -1;
					this.lastPacketType0 = -1;
					this.lastPacketType1 = -1;
					this.lastPacketType2 = -1;
					this.packetSize = 0;
					this.idleNetCycles = 0;
					this.systemUpdateTimer = 0;
					this.idleTimeout = 0;
					this.hintType = 0;
					this.menuSize = 0;
					this.menuVisible = false;
					super.idleCycles = 0;
					for (k = 0; k < 100; k++) {
						this.messageText[k] = null;
					}
					this.objSelected = 0;
					this.spellSelected = 0;
					this.sceneState = 0;
					this.waveCount = 0;
					this.cameraAnticheatOffsetX = (int) (Math.random() * 100.0D) - 50;
					this.cameraAnticheatOffsetZ = (int) (Math.random() * 110.0D) - 55;
					this.cameraAnticheatAngle = (int) (Math.random() * 80.0D) - 40;
					this.minimapAnticheatAngle = (int) (Math.random() * 120.0D) - 60;
					this.minimapZoom = (int) (Math.random() * 30.0D) - 20;
					this.orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
					this.anInt923 = 0;
					this.anInt1026 = -1;
					this.anInt955 = 0;
					this.anInt956 = 0;
					this.anInt884 = 0;
					this.anInt960 = 0;
					for (i = 0; i < this.MAX_PLAYER_COUNT; i++) {
						this.players[i] = null;
						this.playerAppearanceBuffer[i] = null;
					}
					for (i = 0; i < 16384; i++) {
						this.npcs[i] = null;
					}
					localPlayer = this.players[this.anInt883] = new PlayerEntity();
					this.projectiles.clear();
					this.spotanims.clear();
					for ( int level = 0; level < 4; level++) {
						for (int x = 0; x < 104; x++) {
							for (int z = 0; z < 104; z++) {
								this.levelObjStacks[level][x][z] = null;
							}
						}
					}
					this.spawnedLocations = new Class6(true);
					this.anInt839 = 0;
					this.anInt838 = 0;
					this.method619(aBoolean249, this.anInt985);
					this.anInt985 = -1;
					this.method619(aBoolean249, this.anInt888);
					this.anInt888 = -1;
					this.method619(aBoolean249, this.anInt976);
					this.anInt976 = -1;
					this.method619(aBoolean249, this.anInt926);
					this.anInt926 = -1;
					this.method619(aBoolean249, this.anInt880);
					this.anInt880 = -1;
					this.method619(aBoolean249, this.anInt941);
					this.anInt941 = -1;
					this.method619(aBoolean249, this.anInt1027);
					this.anInt1027 = -1;
					this.aBoolean254 = false;
					this.anInt1031 = 3;
					this.anInt1010 = 0;
					this.menuVisible = false;
					this.aBoolean216 = false;
					this.aString26 = null;
					this.anInt1047 = 0;
					this.anInt988 = -1;
					this.aBoolean245 = true;
					this.validateCharacterDesign(this.anInt905);
					for (int x = 0; x < 5; x++) {
						this.designColors[x] = 0;
					}
					for (int z = 0; z < 5; z++) {
						this.aStringArray11[z] = null;
						this.aBooleanArray12[z] = false;
					}
					anInt944 = 0;
					anInt974 = 0;
					anInt1005 = 0;
					anInt925 = 0;
					anInt963 = 0;
					this.prepareGameScreen();
				} else if (reply == 3) {
					this.loginMessage0 = "";
					this.loginMessage1 = "Invalid username or password.";
				} else if (reply == 4) {
					this.loginMessage0 = "Your account has been disabled.";
					this.loginMessage1 = "Please check your message-centre for details.";
				} else if (reply == 5) {
					this.loginMessage0 = "Your account is already logged in.";
					this.loginMessage1 = "Try again in 60 secs...";
				} else if (reply == 6) {
					this.loginMessage0 = "RuneScape has been updated!";
					this.loginMessage1 = "Please reload this page.";
				} else if (reply == 7) {
					this.loginMessage0 = "This world is full.";
					this.loginMessage1 = "Please use a different world.";
				} else if (reply == 8) {
					this.loginMessage0 = "Unable to connect.";
					this.loginMessage1 = "Login server offline.";
				} else if (reply == 9) {
					this.loginMessage0 = "Login limit exceeded.";
					this.loginMessage1 = "Too many connections from your address.";
				} else if (reply == 10) {
					this.loginMessage0 = "Unable to connect.";
					this.loginMessage1 = "Bad session id.";
				} else if (reply == 12) {
					this.loginMessage0 = "You need a members account to login to this world.";
					this.loginMessage1 = "Please subscribe, or use a different world.";
				} else if (reply == 13) {
					this.loginMessage0 = "Could not complete login.";
					this.loginMessage1 = "Please try using a different world.";
				} else if (reply == 14) {
					this.loginMessage0 = "The server is being updated.";
					this.loginMessage1 = "Please wait 1 minute and try again.";
				} else if (reply == 15) {
					this.ingame = true;
					this.out.pos = 0;
					this.in.pos = 0;
					this.packetType = -1;
					this.lastPacketType0 = -1;
					this.lastPacketType1 = -1;
					this.lastPacketType2 = -1;
					this.packetSize = 0;
					this.idleNetCycles = 0;
					this.systemUpdateTimer = 0;
					this.menuSize = 0;
					this.menuVisible = false;
					this.loginTime = System.currentTimeMillis();
				} else if (reply == 16) {
					this.loginMessage0 = "Login attempts exceeded.";
					this.loginMessage1 = "Please wait 1 minute and try again.";
				} else if (reply == 17) {
					this.loginMessage0 = "You are standing in a members-only area.";
					this.loginMessage1 = "To play on this world move to a free area first";
				} else if (reply == 18) {
					this.loginMessage0 = "Account locked as we suspect it has been stolen.";
					this.loginMessage1 = "Press 'recover a locked account' on front page.";
				} else if (reply == 20) {
					this.loginMessage0 = "Invalid loginserver requested";
					this.loginMessage1 = "Please try using a different world.";
				} else if (reply == 21) {
					k = this.stream.read();
					for ( int local921 = k + 3; local921 >= 0; local921--) {
						this.loginMessage0 = "You have only just left another world";
						this.loginMessage1 = "Your profile will be transferred in: " + local921;
						this.drawTitleScreen(true);
						try {
							Thread.sleep(1200L);
						} catch ( Exception local943) {
						}
					}
					this.login(username, password, reconnect);
				} else if (reply == 22) {
					this.loginMessage0 = "Malformed login packet.";
					this.loginMessage1 = "Please try again.";
				} else if (reply == 23) {
					this.loginMessage0 = "No reply from loginserver.";
					this.loginMessage1 = "Please try again.";
				} else if (reply == 24) {
					this.loginMessage0 = "Error loading your profile.";
					this.loginMessage1 = "Please contact customer support.";
				} else if (reply == 25) {
					this.loginMessage0 = "Unexpected loginserver response.";
					this.loginMessage1 = "Please try using a different world.";
				} else if (reply == 26) {
					this.loginMessage0 = "This computers address has been blocked";
					this.loginMessage1 = "as it was used to break our rules";
				} else if (reply != -1) {
					System.out.println("response:" + reply);
					this.loginMessage0 = "Unexpected server response";
					this.loginMessage1 = "Please try using a different world.";
				} else if (local76 != 0) {
					this.loginMessage0 = "No response from server";
					this.loginMessage1 = "Please try using a different world.";
				} else if (this.anInt833 < 2) {
					try {
						Thread.sleep(2000L);
					} catch ( Exception local1015) {
					}
					this.anInt833++;
					this.login(username, password, reconnect);
				} else {
					this.loginMessage0 = "No response from loginserver";
					this.loginMessage1 = "Please wait 1 minute and try again.";
				}
			}
		} catch ( IOException local1058) {
			this.loginMessage0 = "";
			this.loginMessage1 = "Error connecting to server.";
		}
	}

	private boolean method655( int arg0, int arg1, int arg2) {
		try {
			int local7 = arg2 >> 14 & 0x7FFF;
			int local16 = this.aClass23_1.method220(this.anInt942, arg1, arg0, arg2);
			if (local16 == -1) {
				return false;
			}
			int local25 = local16 & 0x1F;
			int local31 = local16 >> 6 & 0x3;
			if (local25 == 10 || local25 == 11 || local25 == 22) {
				Class48 local43 = Class48.method523(local7);
				int local51;
				int local54;
				if (local31 == 0 || local31 == 2) {
					local51 = local43.anInt707;
					local54 = local43.anInt697;
				} else {
					local51 = local43.anInt697;
					local54 = local43.anInt707;
				}
				int local65 = local43.anInt693;
				if (local31 != 0) {
					local65 = (local65 << local31 & 0xF) + (local65 >> 4 - local31);
				}
				this.method610(true, arg0, localPlayer.anIntArray194[0], local51, local54, 2, 0, arg1, local65, 0, localPlayer.anIntArray193[0]);
			} else {
				this.method610(true, arg0, localPlayer.anIntArray194[0], 0, 0, 2, local25 + 1, arg1, 0, local31, localPlayer.anIntArray193[0]);
			}
			this.anInt906 = super.anInt822;
			this.anInt907 = super.anInt823;
			this.anInt909 = 2;
			this.anInt908 = 0;
			this.packetSize += 0;
			return true;
		} catch ( RuntimeException local148) {
			signlink.reporterror("96069, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	private void method656( byte arg0) {
		try {
			int local12;
			for ( int local5 = 10; local5 < 117; local5++) {
				local12 = (int) (Math.random() * 100.0D);
				if (local12 < 50) {
					this.anIntArray249[local5 + 32512] = 255;
				}
			}
			int local41;
			int local48;
			int local54;
			for (local12 = 0; local12 < 100; local12++) {
				local41 = (int) (Math.random() * 124.0D) + 2;
				local48 = (int) (Math.random() * 128.0D) + 128;
				local54 = local41 + (local48 << 7);
				this.anIntArray249[local54] = 192;
			}
			for (local41 = 1; local41 < 255; local41++) {
				for (local48 = 1; local48 < 127; local48++) {
					local54 = local48 + (local41 << 7);
					this.anIntArray250[local54] = (this.anIntArray249[local54 - 1] + this.anIntArray249[local54 + 1] + this.anIntArray249[local54 - 128] + this.anIntArray249[local54 + 128]) / 4;
				}
			}
			this.anInt1008 += 128;
			if (this.anInt1008 > this.anIntArray259.length) {
				this.anInt1008 -= this.anIntArray259.length;
				local48 = (int) (Math.random() * 12.0D);
				this.method658(this.aClass10_Sub1_Sub1_Sub3Array3[local48]);
			}
			int local166;
			for (local48 = 1; local48 < 255; local48++) {
				for (local54 = 1; local54 < 127; local54++) {
					local166 = local54 + (local48 << 7);
					int local189 = this.anIntArray250[local166 + 128] - this.anIntArray259[local166 + this.anInt1008 & this.anIntArray259.length - 1] / 5;
					if (local189 < 0) {
						local189 = 0;
					}
					this.anIntArray249[local166] = local189;
				}
			}
			boolean local213 = false;
			for (local54 = 0; local54 < 255; local54++) {
				this.anIntArray258[local54] = this.anIntArray258[local54 + 1];
			}
			this.anIntArray258[255] = (int) (Math.sin((double) anInt1050 / 14.0D) * 16.0D + Math.sin((double) anInt1050 / 15.0D) * 14.0D + Math.sin((double) anInt1050 / 16.0D) * 12.0D);
			if (this.anInt920 > 0) {
				this.anInt920 -= 4;
			}
			if (this.anInt921 > 0) {
				this.anInt921 -= 4;
			}
			if (this.anInt920 == 0 && this.anInt921 == 0) {
				local166 = (int) (Math.random() * 2000.0D);
				if (local166 == 0) {
					this.anInt920 = 1024;
				}
				if (local166 == 1) {
					this.anInt921 = 1024;
					return;
				}
			}
		} catch ( RuntimeException local314) {
			signlink.reporterror("47625, " + arg0 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	private void method657( Class38 arg0, int arg1, int arg2, int arg3) {
		try {
			if (this.menuSize < 400) {
				if (arg0.anIntArray165 != null) {
					arg0 = arg0.method406();
				}
				if (arg0 != null && arg0.aBoolean141) {
					String local29 = arg0.aString10;
					if (arg0.anInt572 != 0) {
						local29 = local29 + method667(arg0.anInt572, localPlayer.anInt767) + " (level-" + arg0.anInt572 + ")";
					}
					if (this.objSelected == 1) {
						this.aStringArray12[this.menuSize] = "Use " + this.aString30 + " with @yel@" + local29;
						this.anIntArray233[this.menuSize] = 347;
						this.anIntArray234[this.menuSize] = arg3;
						this.anIntArray231[this.menuSize] = arg2;
						this.anIntArray232[this.menuSize] = arg1;
						this.menuSize++;
					} else if (this.spellSelected != 1) {
						int local167;
						if (arg0.aStringArray4 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg0.aStringArray4[local167] != null && !arg0.aStringArray4[local167].equalsIgnoreCase("attack")) {
									this.aStringArray12[this.menuSize] = arg0.aStringArray4[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray233[this.menuSize] = 318;
									}
									if (local167 == 1) {
										this.anIntArray233[this.menuSize] = 921;
									}
									if (local167 == 2) {
										this.anIntArray233[this.menuSize] = 118;
									}
									if (local167 == 3) {
										this.anIntArray233[this.menuSize] = 553;
									}
									if (local167 == 4) {
										this.anIntArray233[this.menuSize] = 432;
									}
									this.anIntArray234[this.menuSize] = arg3;
									this.anIntArray231[this.menuSize] = arg2;
									this.anIntArray232[this.menuSize] = arg1;
									this.menuSize++;
								}
							}
						}
						if (arg0.aStringArray4 != null) {
							for (local167 = 4; local167 >= 0; local167--) {
								if (arg0.aStringArray4[local167] != null && arg0.aStringArray4[local167].equalsIgnoreCase("attack")) {
									short local291 = 0;
									if (arg0.anInt572 > localPlayer.anInt767) {
										local291 = 2000;
									}
									this.aStringArray12[this.menuSize] = arg0.aStringArray4[local167] + " @yel@" + local29;
									if (local167 == 0) {
										this.anIntArray233[this.menuSize] = local291 + 318;
									}
									if (local167 == 1) {
										this.anIntArray233[this.menuSize] = local291 + 921;
									}
									if (local167 == 2) {
										this.anIntArray233[this.menuSize] = local291 + 118;
									}
									if (local167 == 3) {
										this.anIntArray233[this.menuSize] = local291 + 553;
									}
									if (local167 == 4) {
										this.anIntArray233[this.menuSize] = local291 + 432;
									}
									this.anIntArray234[this.menuSize] = arg3;
									this.anIntArray231[this.menuSize] = arg2;
									this.anIntArray232[this.menuSize] = arg1;
									this.menuSize++;
								}
							}
						}
						this.aStringArray12[this.menuSize] = "Examine @yel@" + local29;
						this.anIntArray233[this.menuSize] = 1668;
						this.anIntArray234[this.menuSize] = arg3;
						this.anIntArray231[this.menuSize] = arg2;
						this.anIntArray232[this.menuSize] = arg1;
						this.menuSize++;
					} else if ((this.anInt980 & 0x2) == 2) {
						this.aStringArray12[this.menuSize] = this.aString31 + " @yel@" + local29;
						this.anIntArray233[this.menuSize] = 67;
						this.anIntArray234[this.menuSize] = arg3;
						this.anIntArray231[this.menuSize] = arg2;
						this.anIntArray232[this.menuSize] = arg1;
						this.menuSize++;
						return;
					}
				}
			}
		} catch ( RuntimeException local441) {
			signlink.reporterror("57326, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -76 + ", " + local441.toString());
			throw new RuntimeException();
		}
	}

	private void method658( Class10_Sub1_Sub1_Sub3 arg0) {
		try {
			this.packetSize += 0;
			for ( int local11 = 0; local11 < this.anIntArray259.length; local11++) {
				this.anIntArray259[local11] = 0;
			}
			int local36;
			for ( int local26 = 0; local26 < 5000; local26++) {
				local36 = (int) (Math.random() * 128.0D * (double) 256);
				this.anIntArray259[local36] = (int) (Math.random() * 256.0D);
			}
			int local54;
			int local58;
			int local66;
			for (local36 = 0; local36 < 20; local36++) {
				for (local54 = 1; local54 < 255; local54++) {
					for (local58 = 1; local58 < 127; local58++) {
						local66 = local58 + (local54 << 7);
						this.anIntArray260[local66] = (this.anIntArray259[local66 - 1] + this.anIntArray259[local66 + 1] + this.anIntArray259[local66 - 128] + this.anIntArray259[local66 + 128]) / 4;
					}
				}
				int[] local112 = this.anIntArray259;
				this.anIntArray259 = this.anIntArray260;
				this.anIntArray260 = local112;
			}
			if (arg0 != null) {
				local54 = 0;
				for (local58 = 0; local58 < arg0.anInt653; local58++) {
					for (local66 = 0; local66 < arg0.anInt652; local66++) {
						if (arg0.aByteArray16[local54++] != 0) {
							int local148 = local66 + arg0.anInt654 + 16;
							int local155 = local58 + arg0.anInt655 + 16;
							int local161 = local148 + (local155 << 7);
							this.anIntArray259[local161] = 0;
						}
					}
				}
			}
		} catch ( RuntimeException local178) {
			signlink.reporterror("12993, " + arg0 + ", " + 0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	private void method659() {
		try {
			this.aClass19_18.method130();
			Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray236;
			this.aClass10_Sub1_Sub1_Sub3_18.method440(0, 0);
			if (this.aBoolean216) {
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, this.aString19);
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, this.aString24 + "*");
			} else if (this.anInt1010 == 1) {
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, "Enter amount:");
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, this.aString20 + "*");
			} else if (this.anInt1010 == 2) {
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, "Enter name:");
				this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, this.aString20 + "*");
			} else {
				Class10_Sub1_Sub1_Sub2 local125;
				int local133;
				int local144;
				if (this.anInt1010 == 3) {
					if (this.aString20 != this.aString18) {
						this.method589(this.aString20);
						this.aString18 = this.aString20;
					}
					local125 = this.aClass10_Sub1_Sub1_Sub2_3;
					Draw2D.setBounds(0, 0, 77, 463);
					for (local133 = 0; local133 < this.anInt840; local133++) {
						local144 = local133 * 14 + 18 - this.anInt841;
						if (local144 > 0 && local144 < 110) {
							local125.method148(239, 452, local144, 0, this.aStringArray9[local133]);
						}
					}
					Draw2D.resetBounds();
					if (this.anInt840 > 5) {
						this.method631(this.anInt841, 463, 77, this.anInt840 * 14 + 7, 0);
					}
					if (this.aString20.length() == 0) {
						this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 255, "Enter object name");
					} else if (this.anInt840 == 0) {
						this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, "No matching objects found, please shorten search");
					}
					local125.method148(239, 452, 90, 0, this.aString20 + "*");
					Draw2D.drawHorizontalLine(0, 0, 77, 479);
				} else if (this.aString26 != null) {
					this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 40, 0, this.aString26);
					this.aClass10_Sub1_Sub1_Sub2_4.method148(239, 452, 60, 128, "Click to continue");
				} else if (this.anInt888 != -1) {
					this.method717(0, 0, Class14.method87(this.anInt888), 0);
				} else if (this.anInt985 == -1) {
					local125 = this.aClass10_Sub1_Sub1_Sub2_3;
					local133 = 0;
					Draw2D.setBounds(0, 0, 77, 463);
					for (local144 = 0; local144 < 100; local144++) {
						if (this.messageText[local144] != null) {
							int local309 = this.anIntArray270[local144];
							int local318 = this.anInt834 + 70 - local133 * 14;
							String local323 = this.aStringArray13[local144];
							byte local325 = 0;
							if (local323 != null && local323.startsWith("@cr1@")) {
								local323 = local323.substring(5);
								local325 = 1;
							}
							if (local323 != null && local323.startsWith("@cr2@")) {
								local323 = local323.substring(5);
								local325 = 2;
							}
							if (local309 == 0) {
								if (local318 > 0 && local318 < 110) {
									local125.method152(4, 0, local318, this.messageText[local144]);
								}
								local133++;
							}
							int local395;
							if ((local309 == 1 || local309 == 2) && (local309 == 1 || this.anInt899 == 0 || this.anInt899 == 1 && this.method723(local323))) {
								if (local318 > 0 && local318 < 110) {
									local395 = 4;
									if (local325 == 1) {
										this.aClass10_Sub1_Sub1_Sub3Array4[0].method440(local318 - 12, 4);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass10_Sub1_Sub1_Sub3Array4[1].method440(local318 - 12, local395);
										local395 += 14;
									}
									local125.method152(local395, 0, local318, local323 + ":");
									local395 += local125.method150(local323) + 8;
									local125.method152(local395, 255, local318, this.messageText[local144]);
								}
								local133++;
							}
							if ((local309 == 3 || local309 == 7) && this.anInt997 == 0 && (local309 == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.method723(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method152(4, 0, local318, "From");
									local395 = local125.method150("From ") + 4;
									if (local325 == 1) {
										this.aClass10_Sub1_Sub1_Sub3Array4[0].method440(local318 - 12, local395);
										local395 += 14;
									}
									if (local325 == 2) {
										this.aClass10_Sub1_Sub1_Sub3Array4[1].method440(local318 - 12, local395);
										local395 += 14;
									}
									local125.method152(local395, 0, local318, local323 + ":");
									local395 += local125.method150(local323) + 8;
									local125.method152(local395, 8388608, local318, this.messageText[local144]);
								}
								local133++;
							}
							if (local309 == 4 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.method723(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method152(4, 8388736, local318, local323 + " " + this.messageText[local144]);
								}
								local133++;
							}
							if (local309 == 5 && this.anInt997 == 0 && this.anInt853 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method152(4, 8388608, local318, this.messageText[local144]);
								}
								local133++;
							}
							if (local309 == 6 && this.anInt997 == 0 && this.anInt853 < 2) {
								if (local318 > 0 && local318 < 110) {
									local125.method152(4, 0, local318, "To " + local323 + ":");
									local125.method152(local125.method150("To " + local323) + 12, 8388608, local318, this.messageText[local144]);
								}
								local133++;
							}
							if (local309 == 8 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.method723(local323))) {
								if (local318 > 0 && local318 < 110) {
									local125.method152(4, 8270336, local318, local323 + " " + this.messageText[local144]);
								}
								local133++;
							}
						}
					}
					Draw2D.resetBounds();
					this.anInt947 = local133 * 14 + 7;
					if (this.anInt947 < 78) {
						this.anInt947 = 78;
					}
					this.method631(this.anInt947 - this.anInt834 - 77, 463, 77, this.anInt947, 0);
					String local765;
					if (localPlayer == null || localPlayer.aString14 == null) {
						local765 = Class26.method252(this.aString27, (byte) 7);
					} else {
						local765 = localPlayer.aString14;
					}
					local125.method152(4, 0, 90, local765 + ":");
					local125.method152(local125.method150(local765 + ": ") + 6, 255, 90, this.aString29 + "*");
					Draw2D.drawHorizontalLine(0, 0, 77, 479);
				} else {
					this.method717(0, 0, Class14.method87(this.anInt985), 0);
				}
			}
			if (this.menuVisible && this.anInt1039 == 2) {
				this.method703();
			}
			this.aClass19_18.method131(357, 17, super.graphics);
			this.aClass19_17.method130();
			Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
		} catch ( RuntimeException local852) {
			signlink.reporterror("86402, " + 0 + ", " + local852.toString());
			throw new RuntimeException();
		}
	}

	private void method660() {
		try {
			int local11;
			for ( int local3 = -1; local3 < this.anInt884; local3++) {
				if (local3 == -1) {
					local11 = this.anInt883;
				} else {
					local11 = this.anIntArray229[local3];
				}
				PlayerEntity local23 = this.players[local11];
				if (local23 != null && local23.anInt715 > 0) {
					local23.anInt715--;
					if (local23.anInt715 == 0) {
						local23.aString13 = null;
					}
				}
			}
			this.packetSize += 0;
			for (local11 = 0; local11 < this.anInt960; local11++) {
				int local60 = this.anIntArray256[local11];
				Class10_Sub1_Sub2_Sub3_Sub1 local65 = this.npcs[local60];
				if (local65 != null && local65.anInt715 > 0) {
					local65.anInt715--;
					if (local65.anInt715 == 0) {
						local65.aString13 = null;
					}
				}
			}
		} catch ( RuntimeException local89) {
			signlink.reporterror("72352, " + 0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	private void method661() {
		try {
			int local3 = 5;
			this.archiveChecksum[8] = 0;
			int local19 = 0;
			while (this.archiveChecksum[8] == 0) {
				String local23 = "Unknown problem";
				this.drawProgress(20, "Connecting to web server");
				try {
					DataInputStream local45 = this.method606("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 377);
					Packet local52 = new Packet(new byte[40]);
					local45.readFully(local52.data, 0, 40);
					local45.close();
					for ( int local62 = 0; local62 < 9; local62++) {
						this.archiveChecksum[local62] = local52.g4();
					}
					int local77 = local52.g4();
					int local79 = 1234;
					for ( int local81 = 0; local81 < 9; local81++) {
						local79 = (local79 << 1) + this.archiveChecksum[local81];
					}
					if (local77 != local79) {
						local23 = "checksum problem";
						this.archiveChecksum[8] = 0;
					}
				} catch ( EOFException local108) {
					local23 = "EOF problem";
					this.archiveChecksum[8] = 0;
				} catch ( IOException local117) {
					local23 = "connection problem";
					this.archiveChecksum[8] = 0;
				} catch ( Exception local126) {
					local23 = "logic problem";
					this.archiveChecksum[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.archiveChecksum[8] == 0) {
					local19++;
					for ( int local144 = local3; local144 > 0; local144--) {
						if (local19 >= 10) {
							this.drawProgress(10, "Game updated - please reload page");
							local144 = 10;
						} else {
							this.drawProgress(10, local23 + " - Will retry in " + local144 + " secs.");
						}
						try {
							Thread.sleep(1000L);
						} catch ( Exception local178) {
						}
					}
					local3 *= 2;
					if (local3 > 60) {
						local3 = 60;
					}
					this.aBoolean219 = !this.aBoolean219;
				}
			}
		} catch ( RuntimeException local206) {
			signlink.reporterror("76789, " + false + ", " + local206.toString());
			throw new RuntimeException();
		}
	}

	private void method662( int arg0) {
		try {
			this.aClass19_16.method130();
			int local18;
			int local20;
			if (this.anInt923 == 2) {
				byte[] local13 = this.aClass10_Sub1_Sub1_Sub3_17.aByteArray16;
				int[] local15 = Draw2D.data;
				local18 = local13.length;
				for (local20 = 0; local20 < local18; local20++) {
					if (local13[local20] == 0) {
						local15[local20] = 0;
					}
				}
				this.aClass10_Sub1_Sub1_Sub1_10.method82(0, 567, 33, 25, 33, this.anIntArray267, 0, this.orbitCameraYaw, 256, this.anIntArray261, 25);
				this.aClass19_17.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
			} else {
				int local67 = this.orbitCameraYaw + this.minimapAnticheatAngle & 0x7FF;
				int local74 = localPlayer.anInt739 / 32 + 48;
				boolean local78 = false;
				local18 = 464 - localPlayer.anInt740 / 32;
				this.aClass10_Sub1_Sub1_Sub1_11.method82(5, 567, 151, local74, 146, this.anIntArray220, 25, local67, this.minimapZoom + 256, this.anIntArray241, local18);
				this.aClass10_Sub1_Sub1_Sub1_10.method82(0, 567, 33, 25, 33, this.anIntArray267, 0, this.orbitCameraYaw, 256, this.anIntArray261, 25);
				for (local20 = 0; local20 < this.anInt936; local20++) {
					local74 = this.anIntArray246[local20] * 4 + 2 - localPlayer.anInt739 / 32;
					local18 = this.anIntArray247[local20] * 4 + 2 - localPlayer.anInt740 / 32;
					this.method705(local18, this.aClass10_Sub1_Sub1_Sub1Array9[local20], local74);
				}
				int local173;
				for ( int local169 = 0; local169 < 104; local169++) {
					for (local173 = 0; local173 < 104; local173++) {
						Class6 local185 = this.levelObjStacks[this.anInt942][local169][local173];
						if (local185 != null) {
							local74 = local169 * 4 + 2 - localPlayer.anInt739 / 32;
							local18 = local173 * 4 + 2 - localPlayer.anInt740 / 32;
							this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_12, local74);
						}
					}
				}
				for (local173 = 0; local173 < this.anInt960; local173++) {
					Class10_Sub1_Sub2_Sub3_Sub1 local236 = this.npcs[this.anIntArray256[local173]];
					if (local236 != null && local236.isVisible()) {
						Class38 local245 = local236.aClass38_1;
						if (local245.anIntArray165 != null) {
							local245 = local245.method406();
						}
						if (local245 != null && local245.aBoolean142 && local245.aBoolean141) {
							local74 = local236.anInt739 / 32 - localPlayer.anInt739 / 32;
							local18 = local236.anInt740 / 32 - localPlayer.anInt740 / 32;
							this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_13, local74);
						}
					}
				}
				PlayerEntity local304;
				for ( int local294 = 0; local294 < this.anInt884; local294++) {
					local304 = this.players[this.anIntArray229[local294]];
					if (local304 != null && local304.isVisible()) {
						local74 = local304.anInt739 / 32 - localPlayer.anInt739 / 32;
						local18 = local304.anInt740 / 32 - localPlayer.anInt740 / 32;
						boolean local332 = false;
						long local336 = Class26.method248(local304.aString14);
						for ( int local338 = 0; local338 < this.anInt838; local338++) {
							if (local336 == this.aLongArray4[local338] && this.anIntArray265[local338] != 0) {
								local332 = true;
								break;
							}
						}
						boolean local363 = false;
						if (localPlayer.anInt773 != 0 && local304.anInt773 != 0 && localPlayer.anInt773 == local304.anInt773) {
							local363 = true;
						}
						if (local332) {
							this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_15, local74);
						} else if (local363) {
							this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_16, local74);
						} else {
							this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_14, local74);
						}
					}
				}
				if (this.hintType != 0 && anInt1050 % 20 < 10) {
					if (this.hintType == 1 && this.anInt999 >= 0 && this.anInt999 < this.npcs.length) {
						Class10_Sub1_Sub2_Sub3_Sub1 local437 = this.npcs[this.anInt999];
						if (local437 != null) {
							local74 = local437.anInt739 / 32 - localPlayer.anInt739 / 32;
							local18 = local437.anInt740 / 32 - localPlayer.anInt740 / 32;
							this.method630(local18, this.aClass10_Sub1_Sub1_Sub1_6, local74);
						}
					}
					if (this.hintType == 2) {
						local74 = (this.anInt828 - this.anInt914) * 4 + 2 - localPlayer.anInt739 / 32;
						local18 = (this.anInt829 - this.anInt915) * 4 + 2 - localPlayer.anInt740 / 32;
						this.method630(local18, this.aClass10_Sub1_Sub1_Sub1_6, local74);
					}
					if (this.hintType == 10 && this.anInt969 >= 0 && this.anInt969 < this.players.length) {
						local304 = this.players[this.anInt969];
						if (local304 != null) {
							local74 = local304.anInt739 / 32 - localPlayer.anInt739 / 32;
							local18 = local304.anInt740 / 32 - localPlayer.anInt740 / 32;
							this.method630(local18, this.aClass10_Sub1_Sub1_Sub1_6, local74);
						}
					}
				}
				if (this.anInt955 != 0) {
					local74 = this.anInt955 * 4 + 2 - localPlayer.anInt739 / 32;
					local18 = this.anInt956 * 4 + 2 - localPlayer.anInt740 / 32;
					this.method705(local18, this.aClass10_Sub1_Sub1_Sub1_5, local74);
				}
				Draw2D.fillRect(3, 78, 16777215, 3, 97);
				this.aClass19_17.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
			}
		} catch ( RuntimeException local605) {
			signlink.reporterror("5267, " + arg0 + ", " + local605.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.frame != null) {
				return new URL("http://127.0.0.1:" + (portOffset + 80));
			}
		} catch ( Exception local21) {
		}
		return super.getCodeBase();
	}

	private boolean method663( int arg0, int arg1, byte arg2) {
		try {
			boolean local3 = false;
			Class14 local6 = Class14.method87(arg1);
			for ( int local8 = 0; local8 < local6.anIntArray43.length && local6.anIntArray43[local8] != -1; local8++) {
				Class14 local22 = Class14.method87(local6.anIntArray43[local8]);
				if (local22.anInt120 == 0) {
					local3 |= this.method663(arg0, local22.anInt111, (byte) 5);
				}
				int local56;
				if (local22.anInt120 == 6 && (local22.anInt148 != -1 || local22.anInt149 != -1)) {
					boolean local51 = this.method670(local22);
					if (local51) {
						local56 = local22.anInt149;
					} else {
						local56 = local22.anInt148;
					}
					if (local56 != -1) {
						Class15 local68 = Class15.aClass15Array1[local56];
						local22.anInt116 += arg0;
						while (local22.anInt116 > local68.method97(local22.anInt119)) {
							local22.anInt116 -= local68.method97(local22.anInt119);
							local22.anInt119++;
							if (local22.anInt119 >= local68.anInt152) {
								local22.anInt119 -= local68.anInt153;
								if (local22.anInt119 < 0 || local22.anInt119 >= local68.anInt152) {
									local22.anInt119 = 0;
								}
							}
							local3 = true;
						}
					}
				}
				if (local22.anInt120 == 6 && local22.anInt112 != 0) {
					int local137 = local22.anInt112 >> 16;
					local56 = local22.anInt112 << 16 >> 16;
					int local148 = local137 * arg0;
					local56 *= arg0;
					local22.anInt130 = local22.anInt130 + local148 & 0x7FF;
					local22.anInt131 = local22.anInt131 + local56 & 0x7FF;
					local3 = true;
				}
			}
			boolean local181 = false;
			return local3;
		} catch ( RuntimeException local189) {
			signlink.reporterror("87155, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}

	private String method664( int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch ( RuntimeException local18) {
			signlink.reporterror("89286, " + arg0 + ", " + 8 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	private void method665( int arg0, long arg1) {
		try {
			if (arg0 != -916) {
				this.packetType = this.in.g1();
			}
			if (arg1 != 0L) {
				if (this.anInt837 >= 100) {
					this.method622("", "Your ignore list is full. Max of 100 hit", 0);
				} else {
					String local31 = Class26.method252(Class26.method249(arg1), (byte) 7);
					for ( int local33 = 0; local33 < this.anInt837; local33++) {
						if (this.aLongArray3[local33] == arg1) {
							this.method622("", local31 + " is already on your ignore list", 0);
							return;
						}
					}
					for ( int local63 = 0; local63 < this.anInt838; local63++) {
						if (this.aLongArray4[local63] == arg1) {
							this.method622("", "Please remove " + local31 + " from your friend list first", 0);
							return;
						}
					}
					this.aLongArray3[this.anInt837++] = arg1;
					this.aBoolean248 = true;
					this.out.p1isaac(217);
					this.out.p8(arg1);
				}
			}
		} catch ( RuntimeException local118) {
			signlink.reporterror("27939, " + arg0 + ", " + arg1 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@Override
	protected void update() {
		try {
			if (!this.aBoolean232 && !this.aBoolean264 && !this.aBoolean240) {
				anInt1050++;
				if (this.ingame) {
					this.method603();
				} else {
					this.method724();
				}
				this.method652();
			}
		} catch ( RuntimeException local33) {
			signlink.reporterror("76962, " + -111 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	private void method666() {
		try {
			if (this.anInt950 == 0) {
				this.aStringArray12[0] = "Cancel";
				this.anIntArray233[0] = 1016;
				this.menuSize = 1;
				if (this.anInt926 == -1) {
					this.method686(this.anInt982);
					this.anInt863 = 0;
					this.anInt1045 = 0;
					if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
						if (this.anInt976 == -1) {
							this.method618();
						} else {
							this.method641(4, Class14.method87(this.anInt976), 0, 0, 4, super.mouseX, super.mouseY);
						}
					}
					if (this.anInt863 != this.anInt1037) {
						this.anInt1037 = this.anInt863;
					}
					if (this.anInt1045 != this.anInt959) {
						this.anInt959 = this.anInt1045;
					}
					this.anInt863 = 0;
					this.anInt1045 = 0;
					if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
						if (this.anInt941 != -1) {
							this.method641(205, Class14.method87(this.anInt941), 1, 0, 553, super.mouseX, super.mouseY);
						} else if (this.anIntArray248[this.anInt1031] != -1) {
							this.method641(205, Class14.method87(this.anIntArray248[this.anInt1031]), 1, 0, 553, super.mouseX, super.mouseY);
						}
					}
					if (this.anInt863 != this.anInt1028) {
						this.aBoolean248 = true;
						this.anInt1028 = this.anInt863;
					}
					if (this.anInt1045 != this.anInt918) {
						this.aBoolean248 = true;
						this.anInt918 = this.anInt1045;
					}
					this.anInt863 = 0;
					this.anInt1045 = 0;
					if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 496 && super.mouseY < 453) {
						if (this.anInt888 != -1) {
							this.method641(357, Class14.method87(this.anInt888), 2, 0, 17, super.mouseX, super.mouseY);
						} else if (this.anInt985 != -1) {
							this.method641(357, Class14.method87(this.anInt985), 3, 0, 17, super.mouseX, super.mouseY);
						} else if (super.mouseY < 434 && super.mouseX < 426 && this.anInt1010 == 0) {
							this.method688(466, super.mouseX - 17, super.mouseY - 357);
						}
					}
					if ((this.anInt888 != -1 || this.anInt985 != -1) && this.anInt863 != this.anInt946) {
						this.aBoolean255 = true;
						this.anInt946 = this.anInt863;
					}
					if ((this.anInt888 != -1 || this.anInt985 != -1) && this.anInt1045 != this.anInt1030) {
						this.aBoolean255 = true;
						this.anInt1030 = this.anInt1045;
					}
					boolean local351 = false;
					while (!local351) {
						local351 = true;
						for (int local357 = 0; local357 < this.menuSize - 1; local357++) {
							if (this.anIntArray233[local357] < 1000 && this.anIntArray233[local357 + 1] > 1000) {
								String local378 = this.aStringArray12[local357];
								this.aStringArray12[local357] = this.aStringArray12[local357 + 1];
								this.aStringArray12[local357 + 1] = local378;
								int local400 = this.anIntArray233[local357];
								this.anIntArray233[local357] = this.anIntArray233[local357 + 1];
								this.anIntArray233[local357 + 1] = local400;
								int local422 = this.anIntArray231[local357];
								this.anIntArray231[local357] = this.anIntArray231[local357 + 1];
								this.anIntArray231[local357 + 1] = local422;
								int local444 = this.anIntArray232[local357];
								this.anIntArray232[local357] = this.anIntArray232[local357 + 1];
								this.anIntArray232[local357 + 1] = local444;
								int local466 = this.anIntArray234[local357];
								this.anIntArray234[local357] = this.anIntArray234[local357 + 1];
								this.anIntArray234[local357 + 1] = local466;
								local351 = false;
							}
						}
					}
				} else {
					this.anInt863 = 0;
					this.anInt1045 = 0;
					this.method641(0, Class14.method87(this.anInt926), 0, 0, 0, super.mouseX, super.mouseY);
					if (this.anInt863 != this.anInt1037) {
						this.anInt1037 = this.anInt863;
					}
					if (this.anInt1045 != this.anInt959) {
						this.anInt959 = this.anInt1045;
					}
				}
			}
		} catch ( RuntimeException local496) {
			signlink.reporterror("34424, " + -521 + ", " + local496.toString());
			throw new RuntimeException();
		}
	}

	private void method668( int arg0) {
		try {
			int local22;
			int local35;
			int local39;
			int local43;
			int local91;
			int local105;
			int local117;
			int local176;
			try {
				this.anInt1026 = -1;
				this.spotanims.clear();
				this.projectiles.clear();
				Class10_Sub1_Sub1_Sub4.method509();
				this.method624();
				this.aClass23_1.method190();
				System.gc();
				for (local22 = 0; local22 < 4; local22++) {
					this.aClass47Array1[local22].method480();
				}
				for (local35 = 0; local35 < 4; local35++) {
					for (local39 = 0; local39 < 104; local39++) {
						for (local43 = 0; local43 < 104; local43++) {
							this.aByteArrayArrayArray8[local35][local39][local43] = 0;
						}
					}
				}
				Class8 local77 = new Class8(this.anIntArrayArrayArray8, 14290, this.aByteArrayArrayArray8, 104, 104);
				local43 = this.aByteArrayArray5.length;
				this.out.p1isaac(40);
				int local238;
				int local226;
				if (!this.aBoolean247) {
					byte[] local122;
					for (local91 = 0; local91 < local43; local91++) {
						local105 = (this.anIntArray216[local91] >> 8) * 64 - this.anInt914;
						local117 = (this.anIntArray216[local91] & 0xFF) * 64 - this.anInt915;
						local122 = this.aByteArrayArray5[local91];
						if (local122 != null) {
							local77.method22(local117, (this.anInt855 - 6) * 8, local105, local122, (this.anInt854 - 6) * 8, this.aClass47Array1);
						}
					}
					for (local105 = 0; local105 < local43; local105++) {
						local117 = (this.anIntArray216[local105] >> 8) * 64 - this.anInt914;
						local176 = (this.anIntArray216[local105] & 0xFF) * 64 - this.anInt915;
						byte[] local181 = this.aByteArrayArray5[local105];
						if (local181 == null && this.anInt855 < 800) {
							local77.method28(local117, local176, 64, 64);
						}
					}
					this.out.p1isaac(40);
					for (local117 = 0; local117 < local43; local117++) {
						local122 = this.aByteArrayArray6[local117];
						if (local122 != null) {
							local226 = (this.anIntArray216[local117] >> 8) * 64 - this.anInt914;
							local238 = (this.anIntArray216[local117] & 0xFF) * 64 - this.anInt915;
							local77.method27(local238, this.aClass47Array1, local226, this.aClass23_1, local122);
						}
					}
				}
				if (this.aBoolean247) {
					local91 = 0;
					label254: while (true) {
						int local293;
						int local299;
						int local305;
						int local315;
						int local317;
						if (local91 >= 4) {
							for (local105 = 0; local105 < 13; local105++) {
								for (local117 = 0; local117 < 13; local117++) {
									local176 = this.anIntArrayArrayArray7[0][local105][local117];
									if (local176 == -1) {
										local77.method28(local105 * 8, local117 * 8, 8, 8);
									}
								}
							}
							this.out.p1isaac(40);
							local117 = 0;
							while (true) {
								if (local117 >= 4) {
									break label254;
								}
								for (local176 = 0; local176 < 13; local176++) {
									for (local226 = 0; local226 < 13; local226++) {
										local238 = this.anIntArrayArrayArray7[local117][local176][local226];
										if (local238 != -1) {
											local293 = local238 >> 24 & 0x3;
											local299 = local238 >> 1 & 0x3;
											local305 = local238 >> 14 & 0x3FF;
											local315 = local238 >> 3 & 0x7FF;
											local317 = (local305 / 8 << 8) + local315 / 8;
											for ( int local497 = 0; local497 < this.anIntArray216.length; local497++) {
												if (this.anIntArray216[local497] == local317 && this.aByteArrayArray6[local497] != null) {
													local77.method20(local117, this.aClass47Array1, this.aClass23_1, this.aByteArrayArray6[local497], local226 * 8, local299, (local305 & 0x7) * 8, local176 * 8, (local315 & 0x7) * 8, local293);
													break;
												}
											}
										}
									}
								}
								local117++;
							}
						}
						for (local105 = 0; local105 < 13; local105++) {
							for (local117 = 0; local117 < 13; local117++) {
								boolean local269 = false;
								local226 = this.anIntArrayArrayArray7[local91][local105][local117];
								if (local226 != -1) {
									local238 = local226 >> 24 & 0x3;
									local293 = local226 >> 1 & 0x3;
									local299 = local226 >> 14 & 0x3FF;
									local305 = local226 >> 3 & 0x7FF;
									local315 = (local299 / 8 << 8) + local305 / 8;
									for (local317 = 0; local317 < this.anIntArray216.length; local317++) {
										if (this.anIntArray216[local317] == local315 && this.aByteArrayArray5[local317] != null) {
											local77.method16(local293, (local305 & 0x7) * 8, this.aByteArrayArray5[local317], local91, local238, local105 * 8, this.aClass47Array1, local117 * 8, (local299 & 0x7) * 8);
											local269 = true;
											break;
										}
									}
								}
								if (!local269) {
									local77.method14(this.anInt934, local91, local117 * 8, local105 * 8);
								}
							}
						}
						local91++;
					}
				}
				this.out.p1isaac(40);
				local77.method15(this.aClass47Array1, this.anInt1046, this.aClass23_1);
				if (this.aClass19_17 != null) {
					this.aClass19_17.method130();
					Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
				}
				this.out.p1isaac(40);
				local91 = Class8.anInt56;
				if (local91 > this.anInt942) {
					local91 = this.anInt942;
				}
				if (local91 < this.anInt942 - 1) {
					local91 = this.anInt942 - 1;
				}
				if (lowMemory) {
					this.aClass23_1.method191(Class8.anInt56);
				} else {
					this.aClass23_1.method191(0);
				}
				for (local105 = 0; local105 < 104; local105++) {
					for (local117 = 0; local117 < 104; local117++) {
						this.method601(local105, local117);
					}
				}
				this.method593();
			} catch ( Exception local647) {
			}
			Class48.aClass34_8.clear();
			if (super.frame != null) {
				this.out.p1isaac(78);
				this.out.p4(1057001181);
			}
			if (lowMemory && signlink.aRandomAccessFile3 != null) {
				local22 = this.aClass33_Sub1_1.method569(0);
				for (local35 = 0; local35 < local22; local35++) {
					local39 = this.aClass33_Sub1_1.method554(local35);
					if ((local39 & 0x79) == 0) {
						Model.method270(local35);
					}
				}
			}
			System.gc();
			Class10_Sub1_Sub1_Sub4.method510();
			this.aClass33_Sub1_1.method565();
			local22 = (this.anInt854 - 6) / 8 - 1;
			local35 = (this.anInt854 + 6) / 8 + 1;
			local39 = (this.anInt855 - 6) / 8 - 1;
			local43 = (this.anInt855 + 6) / 8 + 1;
			boolean local740 = false;
			if (this.aBoolean238) {
				local22 = 49;
				local35 = 50;
				local39 = 49;
				local43 = 50;
			}
			for (local91 = local22; local91 <= local35; local91++) {
				for (local105 = local39; local105 <= local43; local105++) {
					if (local91 == local22 || local91 == local35 || local105 == local39 || local105 == local43) {
						local117 = this.aClass33_Sub1_1.method573(local91, local105, 0);
						if (local117 != -1) {
							this.aClass33_Sub1_1.method566(local117, 3, this.aByte47);
						}
						local176 = this.aClass33_Sub1_1.method573(local91, local105, 1);
						if (local176 != -1) {
							this.aClass33_Sub1_1.method566(local176, 3, this.aByte47);
						}
					}
				}
			}
		} catch ( RuntimeException local817) {
			signlink.reporterror("1413, " + arg0 + ", " + local817.toString());
			throw new RuntimeException();
		}
	}

	private void method669( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			int local5 = 2048 - arg2 & 0x7FF;
			int local11 = 2048 - arg4 & 0x7FF;
			int local19 = 0;
			int local21 = 0;
			int local23 = arg3;
			int local29;
			int local33;
			int local43;
			if (local5 != 0) {
				local29 = Model.anIntArray146[local5];
				local33 = Model.anIntArray147[local5];
				local43 = local33 * 0 - arg3 * local29 >> 16;
				local23 = local29 * 0 + arg3 * local33 >> 16;
				local21 = local43;
			}
			if (local11 != 0) {
				local29 = Model.anIntArray146[local11];
				local33 = Model.anIntArray147[local11];
				local43 = local23 * local29 + local33 * 0 >> 16;
				local23 = local23 * local33 - local29 * 0 >> 16;
				local19 = local43;
			}
			this.anInt990 = arg1 - local19;
			this.anInt991 = arg0 - local21;
			this.anInt992 = arg5 - local23;
			this.anInt993 = arg2;
			this.anInt994 = arg4;
		} catch ( RuntimeException local110) {
			signlink.reporterror("85476, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -103 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	private boolean method670( Class14 arg0) {
		try {
			if (arg0.anIntArray45 == null) {
				return false;
			}
			for ( int local11 = 0; local11 < arg0.anIntArray45.length; local11++) {
				int local19 = this.method704(local11, arg0);
				int local24 = arg0.anIntArray42[local11];
				if (arg0.anIntArray45[local11] == 2) {
					if (local19 >= local24) {
						return false;
					}
				} else if (arg0.anIntArray45[local11] == 3) {
					if (local19 <= local24) {
						return false;
					}
				} else if (arg0.anIntArray45[local11] == 4) {
					if (local19 == local24) {
						return false;
					}
				} else if (local19 != local24) {
					return false;
				}
			}
			return true;
		} catch ( RuntimeException local71) {
			signlink.reporterror("95389, " + arg0 + ", " + -693 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	private void method671( int arg0, int arg1, Packet arg2) {
		try {
			this.anInt1034 = 0;
			this.anInt885 = 0;
			this.method616(arg0, this.aBoolean261, arg2);
			this.method689(arg0, arg2);
			boolean local22 = false;
			this.method591(arg0, (byte) 6, arg2);
			this.method615(808, arg2, arg0);
			int local41;
			for ( int local34 = 0; local34 < this.anInt1034; local34++) {
				local41 = this.anIntArray269[local34];
				if (this.players[local41].anInt718 != anInt1050) {
					this.players[local41] = null;
				}
			}
			if (arg2.pos != arg0) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.pos + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (local41 = 0; local41 < this.anInt884; local41++) {
				if (this.players[this.anIntArray229[local41]] == null) {
					signlink.reporterror(this.aString27 + " null entry in pl list - pos:" + local41 + " size:" + this.anInt884);
					throw new RuntimeException("eek");
				}
			}
		} catch ( RuntimeException local121) {
			signlink.reporterror("88583, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	private void method672( int arg0, long arg1) {
		try {
			if (arg1 != 0L) {
				for ( int local8 = 0; local8 < this.anInt837; local8++) {
					if (this.aLongArray3[local8] == arg1) {
						this.anInt837--;
						this.aBoolean248 = true;
						for ( int local28 = local8; local28 < this.anInt837; local28++) {
							this.aLongArray3[local28] = this.aLongArray3[local28 + 1];
						}
						this.out.p1isaac(160);
						this.out.p8(arg1);
						break;
					}
				}
				boolean local66 = false;
			}
		} catch ( RuntimeException local68) {
			signlink.reporterror("45745, " + arg0 + ", " + arg1 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public String getParameter( String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	private void method673( int arg0) {
		try {
			int local8;
			if (this.anInt920 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt920 > 768) {
						this.anIntArray271[local8] = this.method681(this.anIntArray272[local8], this.anIntArray273[local8], 1024 - this.anInt920);
					} else if (this.anInt920 > 256) {
						this.anIntArray271[local8] = this.anIntArray273[local8];
					} else {
						this.anIntArray271[local8] = this.method681(this.anIntArray273[local8], this.anIntArray272[local8], 256 - this.anInt920);
					}
				}
			} else if (this.anInt921 > 0) {
				for (local8 = 0; local8 < 256; local8++) {
					if (this.anInt921 > 768) {
						this.anIntArray271[local8] = this.method681(this.anIntArray272[local8], this.anIntArray274[local8], 1024 - this.anInt921);
					} else if (this.anInt921 > 256) {
						this.anIntArray271[local8] = this.anIntArray274[local8];
					} else {
						this.anIntArray271[local8] = this.method681(this.anIntArray274[local8], this.anIntArray272[local8], 256 - this.anInt921);
					}
				}
			} else {
				for (local8 = 0; local8 < 256; local8++) {
					this.anIntArray271[local8] = this.anIntArray272[local8];
				}
			}
			for (local8 = 0; local8 < 33920; local8++) {
				this.aClass19_22.pixels[local8] = this.aClass10_Sub1_Sub1_Sub1_3.pixels[local8];
			}
			int local181 = 0;
			int local183 = 1152;
			int local198;
			int local202;
			int local212;
			int local220;
			int local224;
			int local228;
			int local239;
			for ( int local185 = 1; local185 < 255; local185++) {
				local198 = this.anIntArray258[local185] * (256 - local185) / 256;
				local202 = local198 + 22;
				if (local202 < 0) {
					local202 = 0;
				}
				local181 += local202;
				for (local212 = local202; local212 < 128; local212++) {
					local220 = this.anIntArray249[local181++];
					if (local220 == 0) {
						local183++;
					} else {
						local224 = local220;
						local228 = 256 - local220;
						local220 = this.anIntArray271[local220];
						local239 = this.aClass19_22.pixels[local183];
						this.aClass19_22.pixels[local183++] = ((local220 & 0xFF00FF) * local224 + (local239 & 0xFF00FF) * local228 & 0xFF00FF00) + ((local220 & 0xFF00) * local224 + (local239 & 0xFF00) * local228 & 0xFF0000) >> 8;
					}
				}
				local183 += local202;
			}
			this.aClass19_22.method131(0, 0, super.graphics);
			boolean local304 = true;
			for (local198 = 0; local198 < 33920; local198++) {
				this.aClass19_23.pixels[local198] = this.aClass10_Sub1_Sub1_Sub1_4.pixels[local198];
			}
			local181 = 0;
			local183 = 1176;
			for (local202 = 1; local202 < 255; local202++) {
				local212 = this.anIntArray258[local202] * (256 - local202) / 256;
				local220 = 103 - local212;
				local183 += local212;
				for (local224 = 0; local224 < local220; local224++) {
					local228 = this.anIntArray249[local181++];
					if (local228 == 0) {
						local183++;
					} else {
						local239 = local228;
						int local367 = 256 - local228;
						local228 = this.anIntArray271[local228];
						int local378 = this.aClass19_23.pixels[local183];
						this.aClass19_23.pixels[local183++] = ((local228 & 0xFF00FF) * local239 + (local378 & 0xFF00FF) * local367 & 0xFF00FF00) + ((local228 & 0xFF00) * local239 + (local378 & 0xFF00) * local367 & 0xFF0000) >> 8;
					}
				}
				local181 += 128 - local220;
				local183 += 128 - local220 - local212;
			}
			this.aClass19_23.method131(0, 637, super.graphics);
		} catch ( RuntimeException local451) {
			signlink.reporterror("77236, " + arg0 + ", " + local451.toString());
			throw new RuntimeException();
		}
	}

	private void method674( boolean arg0, int arg1) {
		try {
			signlink.anInt1063 = arg1;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch ( RuntimeException local14) {
			signlink.reporterror("76893, " + arg0 + ", " + 8 + ", " + arg1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	private void method675() {
		try {
			int local11;
			for ( int local3 = -1; local3 < this.anInt884; local3++) {
				if (local3 == -1) {
					local11 = this.anInt883;
				} else {
					local11 = this.anIntArray229[local3];
				}
				PlayerEntity local23 = this.players[local11];
				if (local23 != null) {
					this.method643(1, local23);
				}
			}
			if (this.anInt996 > 0 || this.anInt996 < 0) {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
		} catch ( RuntimeException local52) {
			signlink.reporterror("41968, " + 0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	private void method677( long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.anInt838 >= 100 && this.anInt932 != 1) {
					this.method622("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else if (this.anInt838 >= 200) {
					this.method622("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
				} else {
					String local38 = Class26.method252(Class26.method249(arg0), (byte) 7);
					for ( int local40 = 0; local40 < this.anInt838; local40++) {
						if (this.aLongArray4[local40] == arg0) {
							this.method622("", local38 + " is already on your friend list", 0);
							return;
						}
					}
					for ( int local70 = 0; local70 < this.anInt837; local70++) {
						if (this.aLongArray3[local70] == arg0) {
							this.method622("", "Please remove " + local38 + " from your ignore list first", 0);
							return;
						}
					}
					if (!local38.equals(localPlayer.aString14)) {
						this.aStringArray8[this.anInt838] = local38;
						this.aLongArray4[this.anInt838] = arg0;
						this.anIntArray265[this.anInt838] = 0;
						this.anInt838++;
						this.aBoolean248 = true;
						this.out.p1isaac(120);
						this.out.p8(arg0);
					}
				}
			}
		} catch ( RuntimeException local150) {
			signlink.reporterror("94629, " + arg0 + ", " + -45229 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	private void method678( byte arg0, Class14 arg1) {
		try {
			boolean local6 = false;
			int local14 = arg1.anInt124;
			int local70;
			if ((local14 < 1 || local14 > 100) && (local14 < 701 || local14 > 800)) {
				if (local14 >= 101 && local14 <= 200 || !(local14 < 801 || local14 > 900)) {
					local70 = this.anInt838;
					if (this.anInt839 != 2) {
						local70 = 0;
					}
					if (local14 > 800) {
						local14 -= 701;
					} else {
						local14 -= 101;
					}
					if (local14 >= local70) {
						arg1.aString2 = "";
						arg1.anInt150 = 0;
					} else {
						if (this.anIntArray265[local14] == 0) {
							arg1.aString2 = "@red@Offline";
						} else if (this.anIntArray265[local14] < 200) {
							if (this.anIntArray265[local14] == nodeId) {
								arg1.aString2 = "@gre@World" + (this.anIntArray265[local14] - 9);
							} else {
								arg1.aString2 = "@yel@World" + (this.anIntArray265[local14] - 9);
							}
						} else if (this.anIntArray265[local14] == nodeId) {
							arg1.aString2 = "@gre@Classic" + (this.anIntArray265[local14] - 219);
						} else {
							arg1.aString2 = "@yel@Classic" + (this.anIntArray265[local14] - 219);
						}
						arg1.anInt150 = 1;
					}
				} else if (local14 == 203) {
					local70 = this.anInt838;
					if (this.anInt839 != 2) {
						local70 = 0;
					}
					arg1.anInt147 = local70 * 15 + 20;
					if (arg1.anInt147 <= arg1.anInt121) {
						arg1.anInt147 = arg1.anInt121 + 1;
					}
				} else if (local14 >= 401 && local14 <= 500) {
					local14 -= 401;
					if (local14 == 0 && this.anInt839 == 0) {
						arg1.aString2 = "Loading ignore list";
						arg1.anInt150 = 0;
					} else if (local14 == 1 && this.anInt839 == 0) {
						arg1.aString2 = "Please wait...";
						arg1.anInt150 = 0;
					} else {
						local70 = this.anInt837;
						if (this.anInt839 == 0) {
							local70 = 0;
						}
						if (local14 >= local70) {
							arg1.aString2 = "";
							arg1.anInt150 = 0;
						} else {
							arg1.aString2 = Class26.method252(Class26.method249(this.aLongArray3[local14]), (byte) 7);
							arg1.anInt150 = 1;
						}
					}
				} else if (local14 == 503) {
					arg1.anInt147 = this.anInt837 * 15 + 20;
					if (arg1.anInt147 <= arg1.anInt121) {
						arg1.anInt147 = arg1.anInt121 + 1;
					}
				} else if (local14 == 327) {
					arg1.anInt130 = 150;
					arg1.anInt131 = (int) (Math.sin((double) anInt1050 / 40.0D) * 256.0D) & 0x7FF;
					if (this.aBoolean263) {
						for (local70 = 0; local70 < 7; local70++) {
							int local383 = this.anIntArray276[local70];
							if (local383 >= 0 && !IdkType.instances[local383].method548(256)) {
								return;
							}
						}
						this.aBoolean263 = false;
						Model[] local402 = new Model[7];
						int local404 = 0;
						for ( int local406 = 0; local406 < 7; local406++) {
							int local413 = this.anIntArray276[local406];
							if (local413 >= 0) {
								local402[local404++] = IdkType.instances[local413].getModel();
							}
						}
						Model local435 = new Model(local404, local402);
						for ( int local437 = 0; local437 < 5; local437++) {
							if (this.designColors[local437] != 0) {
								local435.recolor(anIntArrayArray24[local437][0], anIntArrayArray24[local437][this.designColors[local437]]);
								if (local437 == 1) {
									local435.recolor(anIntArray266[0], anIntArray266[this.designColors[local437]]);
								}
							}
						}
						local435.method278();
						local435.method279(Class15.aClass15Array1[localPlayer.anInt760].anIntArray47[0], (byte) 6);
						local435.method288(64, 850, -30, -50, -30, true);
						arg1.anInt145 = 5;
						arg1.anInt146 = 0;
						Class14.method93(local435);
					}
				} else if (local14 == 324) {
					if (this.aClass10_Sub1_Sub1_Sub1_8 == null) {
						this.aClass10_Sub1_Sub1_Sub1_8 = arg1.aClass10_Sub1_Sub1_Sub1_1;
						this.aClass10_Sub1_Sub1_Sub1_9 = arg1.aClass10_Sub1_Sub1_Sub1_2;
					}
					if (this.aBoolean245) {
						arg1.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_9;
					} else {
						arg1.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_8;
					}
				} else if (local14 == 325) {
					if (this.aClass10_Sub1_Sub1_Sub1_8 == null) {
						this.aClass10_Sub1_Sub1_Sub1_8 = arg1.aClass10_Sub1_Sub1_Sub1_1;
						this.aClass10_Sub1_Sub1_Sub1_9 = arg1.aClass10_Sub1_Sub1_Sub1_2;
					}
					if (this.aBoolean245) {
						arg1.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_8;
					} else {
						arg1.aClass10_Sub1_Sub1_Sub1_1 = this.aClass10_Sub1_Sub1_Sub1_9;
					}
				} else if (local14 == 600) {
					arg1.aString2 = this.aString17;
					if (anInt1050 % 20 < 10) {
						arg1.aString2 = arg1.aString2 + "|";
					} else {
						arg1.aString2 = arg1.aString2 + " ";
					}
				} else {
					if (local14 == 620) {
						if (this.anInt842 < 1) {
							arg1.aString2 = "";
						} else if (this.aBoolean241) {
							arg1.anInt122 = 16711680;
							arg1.aString2 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg1.anInt122 = 16777215;
							arg1.aString2 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					String local642;
					if (local14 == 660) {
						local70 = this.anInt977 - this.anInt989;
						if (local70 <= 0) {
							local642 = "earlier today";
						} else if (local70 == 1) {
							local642 = "yesterday";
						} else {
							local642 = local70 + " days ago";
						}
						arg1.aString2 = "You last logged in @red@" + local642 + "@bla@ from: @red@" + signlink.dns;
					}
					if (local14 == 661) {
						if (this.anInt912 == 0) {
							arg1.aString2 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.anInt912 <= this.anInt977) {
							arg1.aString2 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method679(this.anInt912);
						} else {
							local70 = this.anInt977 + 14 - this.anInt912;
							if (local70 <= 0) {
								local642 = "Earlier today";
							} else if (local70 == 1) {
								local642 = "Yesterday";
							} else {
								local642 = local70 + " days ago";
							}
							arg1.aString2 = local642 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method679(this.anInt912) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (local14 == 662) {
						String local760;
						if (this.anInt1025 == 0) {
							local760 = "@yel@0 unread messages";
						} else if (this.anInt1025 == 1) {
							local760 = "@gre@1 unread message";
						} else {
							local760 = "@gre@" + this.anInt1025 + " unread messages";
						}
						arg1.aString2 = "You have " + local760 + "\\nin your message centre.";
					}
					if (local14 == 663) {
						if (this.anInt939 > 0 && this.anInt939 <= this.anInt977 + 10) {
							arg1.aString2 = "Last password change:\\n@gre@" + this.method679(this.anInt939);
						} else {
							arg1.aString2 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (local14 == 665) {
						if (this.anInt891 > 2 && !members) {
							arg1.aString2 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.anInt891 > 2) {
							arg1.aString2 = "\\n\\nYou have @gre@" + this.anInt891 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.anInt891 > 0) {
							arg1.aString2 = "You have @gre@" + this.anInt891 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg1.aString2 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (local14 == 667) {
						if (this.anInt891 > 2 && !members) {
							arg1.aString2 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.anInt891 > 0) {
							arg1.aString2 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg1.aString2 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (local14 == 668) {
						if (this.anInt912 > this.anInt977) {
							arg1.aString2 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg1.aString2 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (local14 == 1 && this.anInt839 == 0) {
				arg1.aString2 = "Loading friend list";
				arg1.anInt150 = 0;
			} else if (local14 == 1 && this.anInt839 == 1) {
				arg1.aString2 = "Connecting to friendserver";
				arg1.anInt150 = 0;
			} else if (local14 == 2 && this.anInt839 != 2) {
				arg1.aString2 = "Please wait...";
				arg1.anInt150 = 0;
			} else {
				local70 = this.anInt838;
				if (this.anInt839 != 2) {
					local70 = 0;
				}
				if (local14 > 700) {
					local14 -= 601;
				} else {
					local14--;
				}
				if (local14 >= local70) {
					arg1.aString2 = "";
					arg1.anInt150 = 0;
				} else {
					arg1.aString2 = this.aStringArray8[local14];
					arg1.anInt150 = 1;
				}
			}
		} catch ( RuntimeException local917) {
			signlink.reporterror("38927, " + arg0 + ", " + arg1 + ", " + local917.toString());
			throw new RuntimeException();
		}
	}

	private String method679( int arg0) {
		try {
			if (arg0 > this.anInt977 + 10) {
				return "Unknown";
			}
			long local22 = ((long) arg0 + 11745L) * 86400000L;
			Calendar local24 = Calendar.getInstance();
			local24.setTime(new Date(local22));
			int local34 = local24.get(5);
			int local38 = local24.get(2);
			int local42 = local24.get(1);
			String[] local93 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return local34 + "-" + local93[local38] + "-" + local42;
		} catch ( RuntimeException local111) {
			signlink.reporterror("68481, " + arg0 + ", " + 83 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	private void method680( int arg0) {
		try {
			this.packetSize += 0;
			int local10 = Class44.aClass44Array1[arg0].anInt617;
			if (local10 != 0) {
				int local18 = this.anIntArray244[arg0];
				if (local10 == 1) {
					if (local18 == 1) {
						Class10_Sub1_Sub1_Sub4.method515(0.9D, (byte) 6);
					}
					if (local18 == 2) {
						Class10_Sub1_Sub1_Sub4.method515(0.8D, (byte) 6);
					}
					if (local18 == 3) {
						Class10_Sub1_Sub1_Sub4.method515(0.7D, (byte) 6);
					}
					if (local18 == 4) {
						Class10_Sub1_Sub1_Sub4.method515(0.6D, (byte) 6);
					}
					Class17.aClass34_4.clear();
					this.aBoolean236 = true;
				}
				if (local10 == 3) {
					boolean local56 = this.aBoolean259;
					if (local18 == 0) {
						this.method674(this.aBoolean259, 0);
						this.aBoolean259 = true;
					}
					if (local18 == 1) {
						this.method674(this.aBoolean259, -400);
						this.aBoolean259 = true;
					}
					if (local18 == 2) {
						this.method674(this.aBoolean259, -800);
						this.aBoolean259 = true;
					}
					if (local18 == 3) {
						this.method674(this.aBoolean259, -1200);
						this.aBoolean259 = true;
					}
					if (local18 == 4) {
						this.aBoolean259 = false;
					}
					if (this.aBoolean259 != local56 && !lowMemory) {
						if (this.aBoolean259) {
							this.anInt1023 = this.anInt1051;
							this.aBoolean260 = true;
							this.aClass33_Sub1_1.method558(2, this.anInt1023);
						} else {
							this.method625();
						}
						this.anInt958 = 0;
					}
				}
				if (local10 == 4) {
					if (local18 == 0) {
						this.aBoolean265 = true;
						this.method633(0);
					}
					if (local18 == 1) {
						this.aBoolean265 = true;
						this.method633(-400);
					}
					if (local18 == 2) {
						this.aBoolean265 = true;
						this.method633(-800);
					}
					if (local18 == 3) {
						this.aBoolean265 = true;
						this.method633(-1200);
					}
					if (local18 == 4) {
						this.aBoolean265 = false;
					}
				}
				if (local10 == 5) {
					this.anInt1036 = local18;
				}
				if (local10 == 6) {
					this.anInt897 = local18;
				}
				if (local10 == 8) {
					this.anInt997 = local18;
					this.aBoolean255 = true;
				}
				if (local10 == 9) {
					this.anInt879 = local18;
				}
			}
		} catch ( RuntimeException local216) {
			signlink.reporterror("9652, " + 0 + ", " + arg0 + ", " + local216.toString());
			throw new RuntimeException();
		}
	}

	private int method681( int arg0, int arg1, int arg2) {
		try {
			int local13 = 256 - arg2;
			return ((arg0 & 0xFF00FF) * local13 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * local13 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		} catch ( RuntimeException local44) {
			signlink.reporterror("31901, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	private void method682() {
		try {
			this.anInt1011 = 0;
			int local10 = (localPlayer.anInt739 >> 7) + this.anInt914;
			int local18 = (localPlayer.anInt740 >> 7) + this.anInt915;
			if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
				this.anInt1011 = 1;
			}
			if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
				this.anInt1011 = 1;
			}
			if (this.anInt1011 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
				this.anInt1011 = 0;
			}
		} catch ( RuntimeException local74) {
			signlink.reporterror("98796, " + -7 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	private void method683() {
		try {
			int local7 = this.aClass10_Sub1_Sub1_Sub2_4.method150("Choose Option");
			int local20;
			for (int local9 = 0; local9 < this.menuSize; local9++) {
				local20 = this.aClass10_Sub1_Sub1_Sub2_4.method150(this.aStringArray12[local9]);
				if (local20 > local7) {
					local7 = local20;
				}
			}
			local7 += 8;
			local20 = this.menuSize * 15 + 21;
			int local71;
			int local89;
			if (super.anInt822 > 4 && super.anInt823 > 4 && super.anInt822 < 516 && super.anInt823 < 338) {
				local71 = super.anInt822 - local7 / 2 - 4;
				if (local71 + local7 > 512) {
					local71 = 512 - local7;
				}
				if (local71 < 0) {
					local71 = 0;
				}
				local89 = super.anInt823 - 4;
				if (local89 + local20 > 334) {
					local89 = 334 - local20;
				}
				if (local89 < 0) {
					local89 = 0;
				}
				this.menuVisible = true;
				this.anInt1039 = 0;
				this.anInt1040 = local71;
				this.anInt1041 = local89;
				this.anInt1042 = local7;
				this.anInt1043 = this.menuSize * 15 + 22;
			}
			if (super.anInt822 > 553 && super.anInt823 > 205 && super.anInt822 < 743 && super.anInt823 < 466) {
				local71 = super.anInt822 - local7 / 2 - 553;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 190) {
					local71 = 190 - local7;
				}
				local89 = super.anInt823 - 205;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 261) {
					local89 = 261 - local20;
				}
				this.menuVisible = true;
				this.anInt1039 = 1;
				this.anInt1040 = local71;
				this.anInt1041 = local89;
				this.anInt1042 = local7;
				this.anInt1043 = this.menuSize * 15 + 22;
			}
			if (super.anInt822 > 17 && super.anInt823 > 357 && super.anInt822 < 496 && super.anInt823 < 453) {
				local71 = super.anInt822 - local7 / 2 - 17;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 + local7 > 479) {
					local71 = 479 - local7;
				}
				local89 = super.anInt823 - 357;
				if (local89 < 0) {
					local89 = 0;
				} else if (local89 + local20 > 96) {
					local89 = 96 - local20;
				}
				this.menuVisible = true;
				this.anInt1039 = 2;
				this.anInt1040 = local71;
				this.anInt1041 = local89;
				this.anInt1042 = local7;
				this.anInt1043 = this.menuSize * 15 + 22;
			}
		} catch ( RuntimeException local293) {
			signlink.reporterror("27328, " + 811 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	private void method684() {
		try {
			this.method650();
			if (this.anInt909 == 1) {
				this.aClass10_Sub1_Sub1_Sub1Array4[this.anInt908 / 100].method78(this.anInt907 - 8 - 4, this.anInt906 - 8 - 4);
			}
			if (this.anInt909 == 2) {
				this.aClass10_Sub1_Sub1_Sub1Array4[this.anInt908 / 100 + 4].method78(this.anInt907 - 8 - 4, this.anInt906 - 8 - 4);
			}
			if (this.anInt1027 != -1) {
				this.method663(this.anInt878, this.anInt1027, (byte) 5);
				this.method717(0, 0, Class14.method87(this.anInt1027), 0);
			}
			if (this.anInt976 != -1) {
				this.method663(this.anInt878, this.anInt976, (byte) 5);
				this.method717(0, 0, Class14.method87(this.anInt976), 0);
			}
			this.method682();
			if (!this.menuVisible) {
				this.method666();
				this.method609();
			} else if (this.anInt1039 == 0) {
				this.method703();
			}
			if (this.anInt1047 == 1) {
				this.aClass10_Sub1_Sub1_Sub1_7.method78(296, 472);
			}
			int local176;
			if (aBoolean217) {
				byte local142 = 20;
				int local144 = 16776960;
				if (super.fps < 30 && lowMemory) {
					local144 = 16711680;
				}
				if (super.fps < 20 && !lowMemory) {
					local144 = 16711680;
				}
				this.aClass10_Sub1_Sub1_Sub2_3.method147("Fps:" + super.fps, local144, 20);
				local176 = local142 + 15;
				Runtime local178 = Runtime.getRuntime();
				int local187 = (int) ((local178.totalMemory() - local178.freeMemory()) / 1024L);
				if (local187 > 33554432 && lowMemory) {
				}
				if (local187 > 67108864 && !lowMemory) {
				}
				this.aClass10_Sub1_Sub1_Sub2_3.method147("Mem:" + local187 + "k", 16776960, 35);
				local176 += 15;
			}
			if (this.systemUpdateTimer != 0) {
				int local228 = this.systemUpdateTimer / 50;
				local176 = local228 / 60;
				int local236 = local228 % 60;
				if (local236 < 10) {
					this.aClass10_Sub1_Sub1_Sub2_3.method152(4, 16776960, 329, "System update in: " + local176 + ":0" + local236);
				} else {
					this.aClass10_Sub1_Sub1_Sub2_3.method152(4, 16776960, 329, "System update in: " + local176 + ":" + local236);
				}
				anInt858++;
				if (anInt858 > 112) {
					anInt858 = 0;
					this.out.p1isaac(197);
					this.out.p4(0);
					return;
				}
			}
		} catch ( RuntimeException local297) {
			signlink.reporterror("93570, " + 30729 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void run() {
		if (this.aBoolean266) {
			this.method592((byte) 4);
		} else {
			super.run();
		}
	}

	private int method685( int arg0, int arg1, int arg2) {
		try {
			int local3 = arg1 >> 7;
			int local7 = arg0 >> 7;
			if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
				return 0;
			}
			int local21 = arg2;
			if (arg2 < 3 && (this.aByteArrayArrayArray8[1][local3][local7] & 0x2) == 2) {
				local21 = arg2 + 1;
			}
			int local41 = arg1 & 0x7F;
			int local45 = arg0 & 0x7F;
			int local84 = this.anIntArrayArrayArray8[local21][local3][local7] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7] * local41 >> 7;
			int local116 = this.anIntArrayArrayArray8[local21][local3][local7 + 1] * (128 - local41) + this.anIntArrayArrayArray8[local21][local3 + 1][local7 + 1] * local41 >> 7;
			return local84 * (128 - local45) + local116 * local45 >> 7;
		} catch ( RuntimeException local129) {
			signlink.reporterror("46343, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	private void method686( int arg0) {
		try {
			int local3 = 21 / arg0;
			if (this.anInt997 != 0) {
				int local9 = 0;
				if (this.systemUpdateTimer != 0) {
					local9 = 1;
				}
				for ( int local16 = 0; local16 < 100; local16++) {
					if (this.messageText[local16] != null) {
						int local28 = this.anIntArray270[local16];
						String local33 = this.aStringArray13[local16];
						if (local33 != null && local33.startsWith("@cr1@")) {
							local33 = local33.substring(5);
						}
						if (local33 != null && local33.startsWith("@cr2@")) {
							local33 = local33.substring(5);
						}
						if ((local28 == 3 || local28 == 7) && (local28 == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.method723(local33))) {
							int local86 = 329 - local9 * 13;
							if (super.mouseX > 4 && super.mouseY - 4 > local86 - 10 && super.mouseY - 4 <= local86 + 3) {
								int local125 = this.aClass10_Sub1_Sub1_Sub2_3.method150("From:  " + local33 + this.messageText[local16]) + 25;
								if (local125 > 450) {
									local125 = 450;
								}
								if (super.mouseX < local125 + 4) {
									if (this.anInt842 >= 1) {
										this.aStringArray12[this.menuSize] = "Report abuse @whi@" + local33;
										this.anIntArray233[this.menuSize] = 2507;
										this.menuSize++;
									}
									this.aStringArray12[this.menuSize] = "Add ignore @whi@" + local33;
									this.anIntArray233[this.menuSize] = 2574;
									this.menuSize++;
									this.aStringArray12[this.menuSize] = "Add friend @whi@" + local33;
									this.anIntArray233[this.menuSize] = 2762;
									this.menuSize++;
								}
							}
							local9++;
							if (local9 >= 5) {
								return;
							}
						}
						if ((local28 == 5 || local28 == 6) && this.anInt853 < 2) {
							local9++;
							if (local9 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch ( RuntimeException local238) {
			signlink.reporterror("9655, " + arg0 + ", " + local238.toString());
			throw new RuntimeException();
		}
	}

	private void method687( int arg0) {
		try {
			Class14 local9 = Class14.method87(arg0);
			for ( int local11 = 0; local11 < local9.anIntArray43.length && local9.anIntArray43[local11] != -1; local11++) {
				Class14 local25 = Class14.method87(local9.anIntArray43[local11]);
				if (local25.anInt120 == 1) {
					this.method687(local25.anInt111);
				}
				local25.anInt119 = 0;
				local25.anInt116 = 0;
			}
		} catch ( RuntimeException local48) {
			signlink.reporterror("12465, " + 36 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	private void method688( int arg0, int arg1, int arg2) {
		try {
			int local1 = 0;
			boolean local5 = false;
			for ( int local7 = 0; local7 < 100; local7++) {
				if (this.messageText[local7] != null) {
					int local19 = this.anIntArray270[local7];
					int local30 = this.anInt834 + 70 + 4 - local1 * 14;
					if (local30 < -20) {
						break;
					}
					String local38 = this.aStringArray13[local7];
					if (local38 != null && local38.startsWith("@cr1@")) {
						local38 = local38.substring(5);
					}
					if (local38 != null && local38.startsWith("@cr2@")) {
						local38 = local38.substring(5);
					}
					if (local19 == 0) {
						local1++;
					}
					if ((local19 == 1 || local19 == 2) && (local19 == 1 || this.anInt899 == 0 || this.anInt899 == 1 && this.method723(local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30 && !local38.equals(localPlayer.aString14)) {
							if (this.anInt842 >= 1) {
								this.aStringArray12[this.menuSize] = "Report abuse @whi@" + local38;
								this.anIntArray233[this.menuSize] = 507;
								this.menuSize++;
							}
							this.aStringArray12[this.menuSize] = "Add ignore @whi@" + local38;
							this.anIntArray233[this.menuSize] = 574;
							this.menuSize++;
							this.aStringArray12[this.menuSize] = "Add friend @whi@" + local38;
							this.anIntArray233[this.menuSize] = 762;
							this.menuSize++;
						}
						local1++;
					}
					if ((local19 == 3 || local19 == 7) && this.anInt997 == 0 && (local19 == 7 || this.anInt853 == 0 || this.anInt853 == 1 && this.method723(local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							if (this.anInt842 >= 1) {
								this.aStringArray12[this.menuSize] = "Report abuse @whi@" + local38;
								this.anIntArray233[this.menuSize] = 507;
								this.menuSize++;
							}
							this.aStringArray12[this.menuSize] = "Add ignore @whi@" + local38;
							this.anIntArray233[this.menuSize] = 574;
							this.menuSize++;
							this.aStringArray12[this.menuSize] = "Add friend @whi@" + local38;
							this.anIntArray233[this.menuSize] = 762;
							this.menuSize++;
						}
						local1++;
					}
					if (local19 == 4 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.method723(local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							this.aStringArray12[this.menuSize] = "Accept trade @whi@" + local38;
							this.anIntArray233[this.menuSize] = 544;
							this.menuSize++;
						}
						local1++;
					}
					if ((local19 == 5 || local19 == 6) && this.anInt997 == 0 && this.anInt853 < 2) {
						local1++;
					}
					if (local19 == 8 && (this.anInt1000 == 0 || this.anInt1000 == 1 && this.method723(local38))) {
						if (arg2 > local30 - 14 && arg2 <= local30) {
							this.aStringArray12[this.menuSize] = "Accept challenge @whi@" + local38;
							this.anIntArray233[this.menuSize] = 695;
							this.menuSize++;
						}
						local1++;
					}
				}
			}
		} catch ( RuntimeException local403) {
			signlink.reporterror("70082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local403.toString());
			throw new RuntimeException();
		}
	}

	private void method689( int arg0, Packet arg1) {
		try {
			int local6 = arg1.gBit(8);
			int local12;
			if (local6 < this.anInt884) {
				for (local12 = local6; local12 < this.anInt884; local12++) {
					this.anIntArray269[this.anInt1034++] = this.anIntArray229[local12];
				}
			}
			if (local6 > this.anInt884) {
				signlink.reporterror(this.aString27 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.anInt884 = 0;
			for (local12 = 0; local12 < local6; local12++) {
				int local69 = this.anIntArray229[local12];
				PlayerEntity local74 = this.players[local69];
				int local79 = arg1.gBit(1);
				if (local79 == 0) {
					this.anIntArray229[this.anInt884++] = local69;
					local74.anInt718 = anInt1050;
				} else {
					int local102 = arg1.gBit(2);
					if (local102 == 0) {
						this.anIntArray229[this.anInt884++] = local69;
						local74.anInt718 = anInt1050;
						this.anIntArray230[this.anInt885++] = local69;
					} else {
						int local153;
						int local163;
						if (local102 == 1) {
							this.anIntArray229[this.anInt884++] = local69;
							local74.anInt718 = anInt1050;
							local153 = arg1.gBit(3);
							local74.method540(false, local153);
							local163 = arg1.gBit(1);
							if (local163 == 1) {
								this.anIntArray230[this.anInt885++] = local69;
							}
						} else if (local102 == 2) {
							this.anIntArray229[this.anInt884++] = local69;
							local74.anInt718 = anInt1050;
							local153 = arg1.gBit(3);
							local74.method540(true, local153);
							local163 = arg1.gBit(3);
							local74.method540(true, local163);
							int local221 = arg1.gBit(1);
							if (local221 == 1) {
								this.anIntArray230[this.anInt885++] = local69;
							}
						} else if (local102 == 3) {
							this.anIntArray269[this.anInt1034++] = local69;
						}
					}
				}
			}
		} catch ( RuntimeException local258) {
			signlink.reporterror("71993, " + arg0 + ", " + -138 + ", " + arg1 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	private void method690( int arg0) {
		try {
			int[] local5 = this.aClass10_Sub1_Sub1_Sub1_11.pixels;
			int local8 = local5.length;
			for ( int local10 = 0; local10 < local8; local10++) {
				local5[local10] = 0;
			}
			int local34;
			int local36;
			for ( int local22 = 1; local22 < 103; local22++) {
				local34 = (103 - local22) * 512 * 4 + 24628;
				for (local36 = 1; local36 < 103; local36++) {
					if ((this.aByteArrayArrayArray8[arg0][local36][local22] & 0x18) == 0) {
						this.aClass23_1.method225(local5, local34, arg0, local36, local22);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local36][local22] & 0x8) != 0) {
						this.aClass23_1.method225(local5, local34, arg0 + 1, local36, local22);
					}
					local34 += 4;
				}
			}
			local34 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			local36 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.aClass10_Sub1_Sub1_Sub1_11.bind();
			int local153;
			for ( int local149 = 1; local149 < 103; local149++) {
				for (local153 = 1; local153 < 103; local153++) {
					if ((this.aByteArrayArrayArray8[arg0][local153][local149] & 0x18) == 0) {
						this.method725(local149, arg0, local153, local36, 563, local34);
					}
					if (arg0 < 3 && (this.aByteArrayArrayArray8[arg0 + 1][local153][local149] & 0x8) != 0) {
						this.method725(local149, arg0 + 1, local153, local36, 563, local34);
					}
				}
			}
			if (this.aClass19_17 != null) {
				this.aClass19_17.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
			}
			anInt938++;
			if (anInt938 > 177) {
				anInt938 = 0;
				this.out.p1isaac(173);
				this.out.p3(2657152);
			}
			this.anInt936 = 0;
			for (local153 = 0; local153 < 104; local153++) {
				for ( int local245 = 0; local245 < 104; local245++) {
					int local255 = this.aClass23_1.method219(this.anInt942, local153, local245);
					if (local255 != 0) {
						local255 = local255 >> 14 & 0x7FFF;
						int local267 = Class48.method523(local255).anInt710;
						if (local267 >= 0) {
							int local271 = local153;
							int local273 = local245;
							if (local267 != 22 && local267 != 29 && local267 != 34 && local267 != 36 && local267 != 46 && local267 != 47 && local267 != 48) {
								int[][] local305 = this.aClass47Array1[this.anInt942].anIntArrayArray16;
								for ( int local307 = 0; local307 < 10; local307++) {
									int local314 = (int) (Math.random() * 4.0D);
									if (local314 == 0 && local271 > 0 && local271 > local153 - 3 && (local305[local271 - 1][local273] & 0x1280108) == 0) {
										local271--;
									}
									if (local314 == 1 && local271 < 103 && local271 < local153 + 3 && (local305[local271 + 1][local273] & 0x1280180) == 0) {
										local271++;
									}
									if (local314 == 2 && local273 > 0 && local273 > local245 - 3 && (local305[local271][local273 - 1] & 0x1280102) == 0) {
										local273--;
									}
									if (local314 == 3 && local273 < 103 && local273 < local245 + 3 && (local305[local271][local273 + 1] & 0x1280120) == 0) {
										local273++;
									}
								}
							}
							this.aClass10_Sub1_Sub1_Sub1Array9[this.anInt936] = this.aClass10_Sub1_Sub1_Sub1Array6[local267];
							this.anIntArray246[this.anInt936] = local271;
							this.anIntArray247[this.anInt936] = local273;
							this.anInt936++;
						}
					}
				}
			}
		} catch ( RuntimeException local444) {
			signlink.reporterror("20009, " + arg0 + ", " + 0 + ", " + local444.toString());
			throw new RuntimeException();
		}
	}

	private boolean method691( int arg0, byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch ( RuntimeException local18) {
			signlink.reporterror("88075, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	private int method692( byte arg0) {
		try {
			int local3 = 3;
			if (this.aByte48 == 1) {
				boolean local9 = false;
			} else {
				this.load();
			}
			if (this.anInt993 < 310) {
				anInt887++;
				int local39;
				if (anInt887 > 1457) {
					anInt887 = 0;
					this.out.p1isaac(244);
					this.out.p1(0);
					local39 = this.out.pos;
					this.out.p1(219);
					this.out.p2(37745);
					this.out.p1(61);
					this.out.p2(43756);
					this.out.p2((int) (Math.random() * 65536.0D));
					this.out.p1((int) (Math.random() * 256.0D));
					this.out.p2(51171);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.out.p2(15808);
					}
					this.out.p1(97);
					this.out.p1((int) (Math.random() * 256.0D));
					this.out.psize1(this.out.pos - local39);
				}
				local39 = this.anInt990 >> 7;
				int local112 = this.anInt992 >> 7;
				int local117 = localPlayer.anInt739 >> 7;
				int local122 = localPlayer.anInt740 >> 7;
				if ((this.aByteArrayArrayArray8[this.anInt942][local39][local112] & 0x4) != 0) {
					local3 = this.anInt942;
				}
				int local144;
				if (local117 > local39) {
					local144 = local117 - local39;
				} else {
					local144 = local39 - local117;
				}
				int local157;
				if (local122 > local112) {
					local157 = local122 - local112;
				} else {
					local157 = local112 - local122;
				}
				int local172;
				int local174;
				if (local144 > local157) {
					local172 = local157 * 65536 / local144;
					local174 = 32768;
					while (local39 != local117) {
						if (local39 < local117) {
							local39++;
						} else if (local39 > local117) {
							local39--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt942][local39][local112] & 0x4) != 0) {
							local3 = this.anInt942;
						}
						local174 += local172;
						if (local174 >= 65536) {
							local174 -= 65536;
							if (local112 < local122) {
								local112++;
							} else if (local112 > local122) {
								local112--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt942][local39][local112] & 0x4) != 0) {
								local3 = this.anInt942;
							}
						}
					}
				} else {
					local172 = local144 * 65536 / local157;
					local174 = 32768;
					while (local112 != local122) {
						if (local112 < local122) {
							local112++;
						} else if (local112 > local122) {
							local112--;
						}
						if ((this.aByteArrayArrayArray8[this.anInt942][local39][local112] & 0x4) != 0) {
							local3 = this.anInt942;
						}
						local174 += local172;
						if (local174 >= 65536) {
							local174 -= 65536;
							if (local39 < local117) {
								local39++;
							} else if (local39 > local117) {
								local39--;
							}
							if ((this.aByteArrayArrayArray8[this.anInt942][local39][local112] & 0x4) != 0) {
								local3 = this.anInt942;
							}
						}
					}
				}
			}
			if ((this.aByteArrayArrayArray8[this.anInt942][localPlayer.anInt739 >> 7][localPlayer.anInt740 >> 7] & 0x4) != 0) {
				local3 = this.anInt942;
			}
			return local3;
		} catch ( RuntimeException local340) {
			signlink.reporterror("1340, " + arg0 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	private int method693() {
		try {
			int local9 = this.method685(this.anInt992, this.anInt990, this.anInt942);
			return local9 - this.anInt991 >= 800 || (this.aByteArrayArrayArray8[this.anInt942][this.anInt990 >> 7][this.anInt992 >> 7] & 0x4) == 0 ? 3 : this.anInt942;
		} catch ( RuntimeException local48) {
			signlink.reporterror("20147, " + -276 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void startThread(Runnable runnable, int priority) {
		if (priority > 10) {
			priority = 10;
		}
		if (signlink.mainapp == null) {
			super.startThread(runnable, priority);
		} else {
			signlink.startthread(runnable, priority);
		}
	}

	private void method694( boolean arg0) {
		try {
			if (localPlayer.anInt739 >> 7 == this.anInt955 && localPlayer.anInt740 >> 7 == this.anInt956) {
				this.anInt955 = 0;
			}
			int local21 = this.anInt884;
			if (arg0) {
				local21 = 1;
			}
			for ( int local27 = 0; local27 < local21; local27++) {
				PlayerEntity local33;
				int local38;
				if (arg0) {
					local33 = localPlayer;
					local38 = this.anInt883 << 14;
				} else {
					local33 = this.players[this.anIntArray229[local27]];
					local38 = this.anIntArray229[local27] << 14;
				}
				if (local33 != null && local33.isVisible()) {
					local33.aBoolean200 = false;
					if ((lowMemory && this.anInt884 > 50 || this.anInt884 > 200) && !arg0 && local33.anInt719 == local33.anInt760) {
						local33.aBoolean200 = true;
					}
					int local89 = local33.anInt739 >> 7;
					int local94 = local33.anInt740 >> 7;
					if (local89 >= 0 && local89 < 104 && local94 >= 0 && local94 < 104) {
						if (local33.aClass10_Sub1_Sub2_Sub4_2 == null || anInt1050 < local33.anInt771 || anInt1050 >= local33.anInt772) {
							if ((local33.anInt739 & 0x7F) == 64 && (local33.anInt740 & 0x7F) == 64) {
								if (this.anIntArrayArray23[local89][local94] == this.anInt962) {
									continue;
								}
								this.anIntArrayArray23[local89][local94] = this.anInt962;
							}
							local33.anInt766 = this.method685(local33.anInt740, local33.anInt739, this.anInt942);
							this.aClass23_1.method201(local38, local33, local33.anInt739, local33.anInt766, local33.aBoolean196, this.anInt942, 60, local33.anInt740, local33.anInt741);
						} else {
							local33.aBoolean200 = false;
							local33.anInt766 = this.method685(local33.anInt740, local33.anInt739, this.anInt942);
							this.aClass23_1.method202(local33.anInt766, local33.anInt775, local33, local33.anInt774, local33.anInt740, local33.anInt777, local33.anInt739, local33.anInt741, local33.anInt776, this.anInt942, local38);
						}
					}
				}
			}
		} catch ( RuntimeException local225) {
			signlink.reporterror("37806, " + 0 + ", " + arg0 + ", " + local225.toString());
			throw new RuntimeException();
		}
	}

	private void method695( int arg0) {
		try {
			if (arg0 >= 0) {
				int local9 = this.anIntArray231[arg0];
				int local14 = this.anIntArray232[arg0];
				int local19 = this.anIntArray233[arg0];
				int local24 = this.anIntArray234[arg0];
				if (this.anInt866 > 8 || this.anInt866 < 8) {
					this.packetType = this.in.g1();
				}
				if (local19 >= 2000) {
					local19 -= 2000;
				}
				if (this.anInt1010 != 0 && local19 != 1016) {
					this.anInt1010 = 0;
					this.aBoolean255 = true;
				}
				PlayerEntity local61;
				if (local19 == 200) {
					local61 = this.players[local24];
					if (local61 != null) {
						this.method610(false, local61.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(245);
						this.out.method338(local24);
					}
				}
				if (local19 == 227) {
					anInt974++;
					if (anInt974 >= 62) {
						this.out.p1isaac(165);
						this.out.p1(206);
						anInt974 = 0;
					}
					this.out.p1isaac(228);
					this.out.method336(local9);
					this.out.method337(local24);
					this.out.p2(local14);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 876) {
					local61 = this.players[local24];
					if (local61 != null) {
						this.method610(false, local61.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(45);
						this.out.method337(local24);
					}
				}
				Class10_Sub1_Sub2_Sub3_Sub1 local253;
				if (local19 == 921) {
					local253 = this.npcs[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(67);
						this.out.method337(local24);
					}
				}
				if (local19 == 961) {
					anInt963 += local24;
					if (anInt963 >= 115) {
						this.out.p1isaac(126);
						this.out.p1(125);
						anInt963 = 0;
					}
					this.out.p1isaac(203);
					this.out.method337(local14);
					this.out.method336(local9);
					this.out.method336(local24);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 467 && this.method655(local14, local9, local24)) {
					this.out.p1isaac(152);
					this.out.method336(local24 >> 14 & 0x7FFF);
					this.out.method336(this.anInt967);
					this.out.method336(this.anInt968);
					this.out.method336(local14 + this.anInt915);
					this.out.p2(this.anInt966);
					this.out.method338(local9 + this.anInt914);
				}
				if (local19 == 9) {
					this.out.p1isaac(3);
					this.out.method337(local24);
					this.out.p2(local14);
					this.out.p2(local9);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 553) {
					local253 = this.npcs[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(42);
						this.out.method336(local24);
					}
				}
				if (local19 == 677) {
					local61 = this.players[local24];
					if (local61 != null) {
						this.method610(false, local61.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(116);
						this.out.method336(local24);
					}
				}
				int local628;
				long local639;
				String local624;
				if (local19 == 762 || local19 == 574 || local19 == 775 || local19 == 859) {
					local624 = this.aStringArray12[arg0];
					local628 = local624.indexOf("@whi@");
					if (local628 != -1) {
						local639 = Class26.method248(local624.substring(local628 + 5).trim());
						if (local19 == 762) {
							this.method677(local639);
						}
						if (local19 == 574) {
							this.method665(this.anInt971, local639);
						}
						if (local19 == 775) {
							this.method628(local639);
						}
						if (local19 == 859) {
							this.method672(325, local639);
						}
					}
				}
				boolean local692;
				if (local19 == 930) {
					local692 = this.method610(false, local14, localPlayer.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
					if (!local692) {
						this.method610(false, local14, localPlayer.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
					}
					this.anInt906 = super.anInt822;
					this.anInt907 = super.anInt823;
					this.anInt909 = 2;
					this.anInt908 = 0;
					this.out.p1isaac(54);
					this.out.method337(local24);
					this.out.method336(local14 + this.anInt915);
					this.out.p2(local9 + this.anInt914);
				}
				if (local19 == 399) {
					this.out.p1isaac(24);
					this.out.method336(local14);
					this.out.method336(local24);
					this.out.method337(local9);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 347) {
					local253 = this.npcs[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(57);
						this.out.p2(local24);
						this.out.method336(this.anInt968);
						this.out.method338(this.anInt967);
						this.out.p2(this.anInt966);
					}
				}
				Class14 local899;
				if (local19 == 890) {
					this.out.p1isaac(79);
					this.out.p2(local14);
					local899 = Class14.method87(local14);
					if (local899.anIntArrayArray5 != null && local899.anIntArrayArray5[0][0] == 5) {
						local628 = local899.anIntArrayArray5[0][1];
						this.anIntArray244[local628] = 1 - this.anIntArray244[local628];
						this.method680(local628);
						this.aBoolean248 = true;
					}
				}
				if (local19 == 493) {
					local61 = this.players[local24];
					if (local61 != null) {
						this.method610(false, local61.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(233);
						this.out.method337(local24);
					}
				}
				if (local19 == 14) {
					if (this.menuVisible) {
						this.aClass23_1.method228(local9 - 4, local14 - 4);
					} else {
						this.aClass23_1.method228(super.anInt822 - 4, super.anInt823 - 4);
					}
				}
				if (local19 == 903) {
					this.out.p1isaac(1);
					this.out.p2(local24);
					this.out.method336(this.anInt966);
					this.out.method336(this.anInt968);
					this.out.method338(this.anInt967);
					this.out.method337(local9);
					this.out.method337(local14);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 361) {
					this.out.p1isaac(36);
					this.out.p2(this.anInt979);
					this.out.method337(local14);
					this.out.method337(local9);
					this.out.method337(local24);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				if (local19 == 118) {
					local253 = this.npcs[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						anInt1005 += local24;
						if (anInt1005 >= 143) {
							this.out.p1isaac(157);
							this.out.p4(0);
							anInt1005 = 0;
						}
						this.out.p1isaac(13);
						this.out.method338(local24);
					}
				}
				if (local19 == 376 && this.method655(local14, local9, local24)) {
					this.out.p1isaac(210);
					this.out.p2(this.anInt979);
					this.out.method336(local24 >> 14 & 0x7FFF);
					this.out.method337(local9 + this.anInt914);
					this.out.method336(local14 + this.anInt915);
				}
				if (local19 == 432) {
					local253 = this.npcs[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(8);
						this.out.method336(local24);
					}
				}
				if (local19 == 639) {
					this.method590();
				}
				if (local19 == 918) {
					local61 = this.players[local24];
					if (local61 != null) {
						this.method610(false, local61.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(31);
						this.out.p2(local24);
						this.out.method336(this.anInt979);
					}
				}
				if (local19 == 67) {
					local253 = this.npcs[local24];
					if (local253 != null) {
						this.method610(false, local253.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(104);
						this.out.method337(this.anInt979);
						this.out.method336(local24);
					}
				}
				if (local19 == 68) {
					local692 = this.method610(false, local14, localPlayer.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
					if (!local692) {
						this.method610(false, local14, localPlayer.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
					}
					this.anInt906 = super.anInt822;
					this.anInt907 = super.anInt823;
					this.anInt909 = 2;
					this.anInt908 = 0;
					this.out.p1isaac(77);
					this.out.method337(local9 + this.anInt914);
					this.out.p2(local14 + this.anInt915);
					this.out.method338(local24);
				}
				if (local19 == 684) {
					local692 = this.method610(false, local14, localPlayer.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
					if (!local692) {
						this.method610(false, local14, localPlayer.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
					}
					this.anInt906 = super.anInt822;
					this.anInt907 = super.anInt823;
					this.anInt909 = 2;
					this.anInt908 = 0;
					if ((local24 & 0x3) == 0) {
						anInt925++;
					}
					if (anInt925 >= 84) {
						this.out.p1isaac(222);
						this.out.p3(11257922);
						anInt925 = 0;
					}
					this.out.p1isaac(71);
					this.out.method338(local24);
					this.out.method338(local9 + this.anInt914);
					this.out.method337(local14 + this.anInt915);
				}
				int local1708;
				String local1704;
				if (local19 == 544 || local19 == 695) {
					local624 = this.aStringArray12[arg0];
					local628 = local624.indexOf("@whi@");
					if (local628 != -1) {
						local624 = local624.substring(local628 + 5).trim();
						local1704 = Class26.method252(Class26.method249(Class26.method248(local624)), (byte) 7);
						boolean local1706 = false;
						for (local1708 = 0; local1708 < this.anInt884; local1708++) {
							PlayerEntity local1718 = this.players[this.anIntArray229[local1708]];
							if (local1718 != null && local1718.aString14 != null && local1718.aString14.equalsIgnoreCase(local1704)) {
								this.method610(false, local1718.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local1718.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
								if (local19 == 544) {
									this.out.p1isaac(116);
									this.out.method336(this.anIntArray229[local1708]);
								}
								if (local19 == 695) {
									this.out.p1isaac(245);
									this.out.method338(this.anIntArray229[local1708]);
								}
								local1706 = true;
								break;
							}
						}
						if (!local1706) {
							this.method622("", "Unable to find " + local1704, 0);
						}
					}
				}
				if (local19 == 225) {
					this.out.p1isaac(177);
					this.out.method337(local9);
					this.out.method336(local24);
					this.out.method336(local14);
					this.anInt1053 = 0;
					this.anInt1054 = local14;
					this.anInt1055 = local9;
					this.anInt1056 = 2;
					if (Class14.method87(local14).anInt128 == this.anInt976) {
						this.anInt1056 = 1;
					}
					if (Class14.method87(local14).anInt128 == this.anInt888) {
						this.anInt1056 = 3;
					}
				}
				String local1888;
				if (local19 == 70) {
					local899 = Class14.method87(local14);
					this.spellSelected = 1;
					this.anInt979 = local14;
					this.anInt980 = local899.anInt113;
					this.objSelected = 0;
					this.aBoolean248 = true;
					local1888 = local899.aString5;
					if (local1888.indexOf(" ") != -1) {
						local1888 = local1888.substring(0, local1888.indexOf(" "));
					}
					local1704 = local899.aString5;
					if (local1704.indexOf(" ") != -1) {
						local1704 = local1704.substring(local1704.indexOf(" ") + 1);
					}
					this.aString31 = local1888 + " " + local899.aString1 + " " + local1704;
					if (this.anInt980 == 16) {
						this.aBoolean248 = true;
						this.anInt1031 = 3;
						this.aBoolean225 = true;
					}
				} else {
					if (local19 == 891) {
						this.out.p1isaac(4);
						this.out.method336(local9);
						this.out.method338(local24);
						this.out.method338(local14);
						this.anInt1053 = 0;
						this.anInt1054 = local14;
						this.anInt1055 = local9;
						this.anInt1056 = 2;
						if (Class14.method87(local14).anInt128 == this.anInt976) {
							this.anInt1056 = 1;
						}
						if (Class14.method87(local14).anInt128 == this.anInt888) {
							this.anInt1056 = 3;
						}
					}
					if (local19 == 894) {
						this.out.p1isaac(158);
						this.out.method338(local9);
						this.out.method338(local24);
						this.out.method336(local14);
						this.anInt1053 = 0;
						this.anInt1054 = local14;
						this.anInt1055 = local9;
						this.anInt1056 = 2;
						if (Class14.method87(local14).anInt128 == this.anInt976) {
							this.anInt1056 = 1;
						}
						if (Class14.method87(local14).anInt128 == this.anInt888) {
							this.anInt1056 = 3;
						}
					}
					if (local19 == 1280) {
						this.method655(local14, local9, local24);
						this.out.p1isaac(55);
						this.out.method336(local24 >> 14 & 0x7FFF);
						this.out.method336(local14 + this.anInt915);
						this.out.p2(local9 + this.anInt914);
					}
					if (local19 == 35) {
						this.method655(local14, local9, local24);
						this.out.p1isaac(181);
						this.out.method337(local9 + this.anInt914);
						this.out.method336(local14 + this.anInt915);
						this.out.method336(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 888) {
						this.method655(local14, local9, local24);
						this.out.p1isaac(50);
						this.out.method337(local14 + this.anInt915);
						this.out.method336(local24 >> 14 & 0x7FFF);
						this.out.method338(local9 + this.anInt914);
					}
					if (local19 == 324) {
						this.out.p1isaac(161);
						this.out.method338(local9);
						this.out.method338(local24);
						this.out.method336(local14);
						this.anInt1053 = 0;
						this.anInt1054 = local14;
						this.anInt1055 = local9;
						this.anInt1056 = 2;
						if (Class14.method87(local14).anInt128 == this.anInt976) {
							this.anInt1056 = 1;
						}
						if (Class14.method87(local14).anInt128 == this.anInt888) {
							this.anInt1056 = 3;
						}
					}
					Class17 local2231;
					if (local19 == 1094) {
						local2231 = Class17.method104(local24);
						Class14 local2234 = Class14.method87(local14);
						if (local2234 != null && local2234.anIntArray40[local9] >= 100000) {
							local1888 = local2234.anIntArray40[local9] + " x " + local2231.aString7;
						} else if (local2231.aByteArray8 == null) {
							local1888 = "It's a " + local2231.aString7 + ".";
						} else {
							local1888 = new String(local2231.aByteArray8);
						}
						this.method622("", local1888, 0);
					}
					if (local19 == 352) {
						local899 = Class14.method87(local14);
						boolean local2295 = true;
						if (local899.anInt124 > 0) {
							local2295 = this.method635(local899);
						}
						if (local2295) {
							this.out.p1isaac(79);
							this.out.p2(local14);
						}
					}
					if (local19 == 1412) {
						int local2323 = local24 >> 14 & 0x7FFF;
						Class48 local2326 = Class48.method523(local2323);
						if (local2326.aByteArray17 == null) {
							local1704 = "It's a " + local2326.aString12 + ".";
						} else {
							local1704 = new String(local2326.aByteArray17);
						}
						this.method622("", local1704, 0);
					}
					if (local19 == 575 && !this.aBoolean254) {
						this.out.p1isaac(226);
						this.out.p2(local14);
						this.aBoolean254 = true;
					}
					if (local19 == 892) {
						this.method655(local14, local9, local24);
						this.out.p1isaac(136);
						this.out.p2(local9 + this.anInt914);
						this.out.method336(local14 + this.anInt915);
						this.out.p2(local24 >> 14 & 0x7FFF);
					}
					if (local19 == 270) {
						local692 = this.method610(false, local14, localPlayer.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
						if (!local692) {
							this.method610(false, local14, localPlayer.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
						}
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(230);
						this.out.method336(local24);
						this.out.method337(local9 + this.anInt914);
						this.out.p2(local14 + this.anInt915);
					}
					if (local19 == 596) {
						local61 = this.players[local24];
						if (local61 != null) {
							this.method610(false, local61.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
							this.anInt906 = super.anInt822;
							this.anInt907 = super.anInt823;
							this.anInt909 = 2;
							this.anInt908 = 0;
							this.out.p1isaac(143);
							this.out.method336(this.anInt968);
							this.out.method338(this.anInt966);
							this.out.p2(this.anInt967);
							this.out.method337(local24);
						}
					}
					if (local19 == 100) {
						local692 = this.method610(false, local14, localPlayer.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
						if (!local692) {
							this.method610(false, local14, localPlayer.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
						}
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(211);
						this.out.method338(this.anInt966);
						this.out.method337(this.anInt968);
						this.out.method338(local14 + this.anInt915);
						this.out.method338(local9 + this.anInt914);
						this.out.method336(this.anInt967);
						this.out.method336(local24);
					}
					if (local19 == 1668) {
						local253 = this.npcs[local24];
						if (local253 != null) {
							Class38 local2692 = local253.aClass38_1;
							if (local2692.anIntArray165 != null) {
								local2692 = local2692.method406();
							}
							if (local2692 != null) {
								if (local2692.aByteArray14 == null) {
									local1704 = "It's a " + local2692.aString10 + ".";
								} else {
									local1704 = new String(local2692.aByteArray14);
								}
								this.method622("", local1704, 0);
							}
						}
					}
					if (local19 == 26) {
						local692 = this.method610(false, local14, localPlayer.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
						if (!local692) {
							this.method610(false, local14, localPlayer.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
						}
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						anInt944++;
						if (anInt944 >= 120) {
							this.out.p1isaac(95);
							this.out.p4(0);
							anInt944 = 0;
						}
						this.out.p1isaac(100);
						this.out.p2(local9 + this.anInt914);
						this.out.method337(local14 + this.anInt915);
						this.out.method338(local24);
					}
					if (local19 == 444) {
						this.out.p1isaac(91);
						this.out.method336(local24);
						this.out.method338(local9);
						this.out.p2(local14);
						this.anInt1053 = 0;
						this.anInt1054 = local14;
						this.anInt1055 = local9;
						this.anInt1056 = 2;
						if (Class14.method87(local14).anInt128 == this.anInt976) {
							this.anInt1056 = 1;
						}
						if (Class14.method87(local14).anInt128 == this.anInt888) {
							this.anInt1056 = 3;
						}
					}
					if (local19 == 507) {
						local624 = this.aStringArray12[arg0];
						local628 = local624.indexOf("@whi@");
						if (local628 != -1) {
							if (this.anInt976 == -1) {
								this.method590();
								this.aString17 = local624.substring(local628 + 5).trim();
								this.aBoolean241 = false;
								this.anInt1002 = this.anInt976 = Class14.anInt127;
							} else {
								this.method622("", "Please close the interface you have open before using 'report abuse'", 0);
							}
						}
					}
					if (local19 == 389) {
						this.method655(local14, local9, local24);
						this.out.p1isaac(241);
						this.out.p2(local24 >> 14 & 0x7FFF);
						this.out.p2(local9 + this.anInt914);
						this.out.method337(local14 + this.anInt915);
					}
					if (local19 == 564) {
						this.out.p1isaac(231);
						this.out.method338(local14);
						this.out.method336(local9);
						this.out.p2(local24);
						this.anInt1053 = 0;
						this.anInt1054 = local14;
						this.anInt1055 = local9;
						this.anInt1056 = 2;
						if (Class14.method87(local14).anInt128 == this.anInt976) {
							this.anInt1056 = 1;
						}
						if (Class14.method87(local14).anInt128 == this.anInt888) {
							this.anInt1056 = 3;
						}
					}
					if (local19 == 984) {
						local624 = this.aStringArray12[arg0];
						local628 = local624.indexOf("@whi@");
						if (local628 != -1) {
							local639 = Class26.method248(local624.substring(local628 + 5).trim());
							local1708 = -1;
							for ( int local3049 = 0; local3049 < this.anInt838; local3049++) {
								if (this.aLongArray4[local3049] == local639) {
									local1708 = local3049;
									break;
								}
							}
							if (local1708 != -1 && this.anIntArray265[local1708] > 0) {
								this.aBoolean255 = true;
								this.anInt1010 = 0;
								this.aBoolean216 = true;
								this.aString24 = "";
								this.anInt995 = 3;
								this.aLong31 = this.aLongArray4[local1708];
								this.aString19 = "Enter message to send to " + this.aStringArray8[local1708];
							}
						}
					}
					if (local19 == 518) {
						this.out.p1isaac(79);
						this.out.p2(local14);
						local899 = Class14.method87(local14);
						if (local899.anIntArrayArray5 != null && local899.anIntArrayArray5[0][0] == 5) {
							local628 = local899.anIntArrayArray5[0][1];
							if (this.anIntArray244[local628] != local899.anIntArray42[0]) {
								this.anIntArray244[local628] = local899.anIntArray42[0];
								this.method680(local628);
								this.aBoolean248 = true;
							}
						}
					}
					if (local19 == 318) {
						local253 = this.npcs[local24];
						if (local253 != null) {
							this.method610(false, local253.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local253.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
							this.anInt906 = super.anInt822;
							this.anInt907 = super.anInt823;
							this.anInt909 = 2;
							this.anInt908 = 0;
							this.out.p1isaac(112);
							this.out.method336(local24);
						}
					}
					if (local19 == 199) {
						local692 = this.method610(false, local14, localPlayer.anIntArray194[0], 0, 0, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
						if (!local692) {
							this.method610(false, local14, localPlayer.anIntArray194[0], 1, 1, 2, 0, local9, 0, 0, localPlayer.anIntArray193[0]);
						}
						this.anInt906 = super.anInt822;
						this.anInt907 = super.anInt823;
						this.anInt909 = 2;
						this.anInt908 = 0;
						this.out.p1isaac(83);
						this.out.method336(local24);
						this.out.p2(local14 + this.anInt915);
						this.out.method336(this.anInt979);
						this.out.method338(local9 + this.anInt914);
					}
					if (local19 == 55) {
						this.method619(aBoolean249, this.anInt985);
						this.anInt985 = -1;
						this.aBoolean255 = true;
					}
					if (local19 == 52) {
						this.objSelected = 1;
						this.anInt966 = local9;
						this.anInt967 = local14;
						this.anInt968 = local24;
						this.aString30 = String.valueOf(Class17.method104(local24).aString7);
						this.spellSelected = 0;
						this.aBoolean248 = true;
					} else {
						if (local19 == 1564) {
							local2231 = Class17.method104(local24);
							if (local2231.aByteArray8 == null) {
								local1888 = "It's a " + local2231.aString7 + ".";
							} else {
								local1888 = new String(local2231.aByteArray8);
							}
							this.method622("", local1888, 0);
						}
						if (local19 == 408) {
							local61 = this.players[local24];
							if (local61 != null) {
								this.method610(false, local61.anIntArray194[0], localPlayer.anIntArray194[0], 1, 1, 2, 0, local61.anIntArray193[0], 0, 0, localPlayer.anIntArray193[0]);
								this.anInt906 = super.anInt822;
								this.anInt907 = super.anInt823;
								this.anInt909 = 2;
								this.anInt908 = 0;
								this.out.p1isaac(194);
								this.out.method336(local24);
							}
						}
						this.objSelected = 0;
						this.spellSelected = 0;
						this.aBoolean248 = true;
					}
				}
			}
		} catch ( RuntimeException local3466) {
			signlink.reporterror("95946, " + arg0 + ", " + 8 + ", " + local3466.toString());
			throw new RuntimeException();
		}
	}

	private void method696() {
		try {
			this.anInt876 = 0;
			int local70;
			for ( int local6 = -1; local6 < this.anInt884 + this.anInt960; local6++) {
				PathingEntity local13;
				if (local6 == -1) {
					local13 = localPlayer;
				} else if (local6 < this.anInt884) {
					local13 = this.players[this.anIntArray229[local6]];
				} else {
					local13 = this.npcs[this.anIntArray256[local6 - this.anInt884]];
				}
				if (local13 != null && local13.isVisible()) {
					Class38 local54;
					if (local13 instanceof Class10_Sub1_Sub2_Sub3_Sub1) {
						local54 = ((Class10_Sub1_Sub2_Sub3_Sub1) local13).aClass38_1;
						if (local54.anIntArray165 != null) {
							local54 = local54.method406();
						}
						if (local54 == null) {
							continue;
						}
					}
					if (local6 >= this.anInt884) {
						local54 = ((Class10_Sub1_Sub2_Sub3_Sub1) local13).aClass38_1;
						if (local54.anInt571 >= 0 && local54.anInt571 < this.aClass10_Sub1_Sub1_Sub1Array7.length) {
							this.method711(local13, local13.anInt723 + 15);
							if (this.anInt872 > -1) {
								this.aClass10_Sub1_Sub1_Sub1Array7[local54.anInt571].method78(this.anInt873 - 30, this.anInt872 - 12);
							}
						}
						if (this.hintType == 1 && this.anInt999 == this.anIntArray256[local6 - this.anInt884] && anInt1050 % 20 < 10) {
							this.method711(local13, local13.anInt723 + 15);
							if (this.anInt872 > -1) {
								this.aClass10_Sub1_Sub1_Sub1Array5[0].method78(this.anInt873 - 28, this.anInt872 - 12);
							}
						}
					} else {
						local70 = 30;
						PlayerEntity local73 = (PlayerEntity) local13;
						if (local73.anInt769 != -1 || local73.anInt765 != -1) {
							this.method711(local13, local13.anInt723 + 15);
							if (this.anInt872 > -1) {
								if (local73.anInt769 != -1) {
									this.aClass10_Sub1_Sub1_Sub1Array10[local73.anInt769].method78(this.anInt873 - 30, this.anInt872 - 12);
									local70 += 25;
								}
								if (local73.anInt765 != -1) {
									this.aClass10_Sub1_Sub1_Sub1Array7[local73.anInt765].method78(this.anInt873 - local70, this.anInt872 - 12);
									local70 += 25;
								}
							}
						}
						if (local6 >= 0 && this.hintType == 10 && this.anInt969 == this.anIntArray229[local6]) {
							this.method711(local13, local13.anInt723 + 15);
							if (this.anInt872 > -1) {
								this.aClass10_Sub1_Sub1_Sub1Array5[1].method78(this.anInt873 - local70, this.anInt872 - 12);
							}
						}
					}
					if (local13.aString13 != null && (local6 >= this.anInt884 || this.anInt899 == 0 || this.anInt899 == 3 || this.anInt899 == 1 && this.method723(((PlayerEntity) local13).aString14))) {
						this.method711(local13, local13.anInt723);
						if (this.anInt872 > -1 && this.anInt876 < this.anInt877) {
							this.anIntArray224[this.anInt876] = this.aClass10_Sub1_Sub1_Sub2_4.method151(local13.aString13) / 2;
							this.anIntArray223[this.anInt876] = this.aClass10_Sub1_Sub1_Sub2_4.anInt230;
							this.anIntArray221[this.anInt876] = this.anInt872;
							this.anIntArray222[this.anInt876] = this.anInt873;
							this.anIntArray225[this.anInt876] = local13.anInt716;
							this.anIntArray226[this.anInt876] = local13.anInt722;
							this.anIntArray227[this.anInt876] = local13.anInt715;
							this.aStringArray10[this.anInt876++] = local13.aString13;
							if (this.anInt897 == 0 && local13.anInt722 >= 1 && local13.anInt722 <= 3) {
								this.anIntArray223[this.anInt876] += 10;
								this.anIntArray222[this.anInt876] += 5;
							}
							if (this.anInt897 == 0 && local13.anInt722 == 4) {
								this.anIntArray224[this.anInt876] = 60;
							}
							if (this.anInt897 == 0 && local13.anInt722 == 5) {
								this.anIntArray223[this.anInt876] += 5;
							}
						}
					}
					if (local13.anInt724 > anInt1050) {
						this.method711(local13, local13.anInt723 + 15);
						if (this.anInt872 > -1) {
							local70 = local13.anInt725 * 30 / local13.anInt726;
							if (local70 > 30) {
								local70 = 30;
							}
							Draw2D.fillRect(5, this.anInt873 - 3, 65280, local70, this.anInt872 - 15);
							Draw2D.fillRect(5, this.anInt873 - 3, 16711680, 30 - local70, this.anInt872 - 15 + local70);
						}
					}
					for (local70 = 0; local70 < 4; local70++) {
						if (local13.anIntArray197[local70] > anInt1050) {
							this.method711(local13, local13.anInt723 / 2);
							if (this.anInt872 > -1) {
								if (local70 == 1) {
									this.anInt873 -= 20;
								}
								if (local70 == 2) {
									this.anInt872 -= 15;
									this.anInt873 -= 10;
								}
								if (local70 == 3) {
									this.anInt872 += 15;
									this.anInt873 -= 10;
								}
								this.aClass10_Sub1_Sub1_Sub1Array8[local13.anIntArray196[local70]].method78(this.anInt873 - 12, this.anInt872 - 12);
								this.aClass10_Sub1_Sub1_Sub2_2.method148(this.anInt872, 452, this.anInt873 + 4, 0, String.valueOf(local13.anIntArray195[local70]));
								this.aClass10_Sub1_Sub1_Sub2_2.method148(this.anInt872 - 1, 452, this.anInt873 + 3, 16777215, String.valueOf(local13.anIntArray195[local70]));
							}
						}
					}
				}
			}
			for ( int local610 = 0; local610 < this.anInt876; local610++) {
				local70 = this.anIntArray221[local610];
				int local622 = this.anIntArray222[local610];
				int local627 = this.anIntArray224[local610];
				int local632 = this.anIntArray223[local610];
				boolean local634 = true;
				while (local634) {
					local634 = false;
					for ( int local640 = 0; local640 < local610; local640++) {
						if (local622 + 2 > this.anIntArray222[local640] - this.anIntArray223[local640] && local622 - local632 < this.anIntArray222[local640] + 2 && local70 - local627 < this.anIntArray221[local640] + this.anIntArray224[local640] && local70 + local627 > this.anIntArray221[local640] - this.anIntArray224[local640] && this.anIntArray222[local640] - this.anIntArray223[local640] < local622) {
							local622 = this.anIntArray222[local640] - this.anIntArray223[local640];
							local634 = true;
						}
					}
				}
				this.anInt872 = this.anIntArray221[local610];
				this.anInt873 = this.anIntArray222[local610] = local622;
				String local739 = this.aStringArray10[local610];
				if (this.anInt897 == 0) {
					int local744 = 16776960;
					if (this.anIntArray225[local610] < 6) {
						local744 = this.anIntArray213[this.anIntArray225[local610]];
					}
					if (this.anIntArray225[local610] == 6) {
						local744 = this.anInt962 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.anIntArray225[local610] == 7) {
						local744 = this.anInt962 % 20 < 10 ? 255 : 65535;
					}
					if (this.anIntArray225[local610] == 8) {
						local744 = this.anInt962 % 20 < 10 ? 45056 : 8454016;
					}
					int local819;
					if (this.anIntArray225[local610] == 9) {
						local819 = 150 - this.anIntArray227[local610];
						if (local819 < 50) {
							local744 = local819 * 1280 + 16711680;
						} else if (local819 < 100) {
							local744 = 16776960 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 5 + 65280;
						}
					}
					if (this.anIntArray225[local610] == 10) {
						local819 = 150 - this.anIntArray227[local610];
						if (local819 < 50) {
							local744 = local819 * 5 + 16711680;
						} else if (local819 < 100) {
							local744 = 16711935 - (local819 - 50) * 327680;
						} else if (local819 < 150) {
							local744 = (local819 - 100) * 327680 + 255 - (local819 - 100) * 5;
						}
					}
					if (this.anIntArray225[local610] == 11) {
						local819 = 150 - this.anIntArray227[local610];
						if (local819 < 50) {
							local744 = 16777215 - local819 * 327685;
						} else if (local819 < 100) {
							local744 = (local819 - 50) * 327685 + 65280;
						} else if (local819 < 150) {
							local744 = 16777215 - (local819 - 100) * 327680;
						}
					}
					if (this.anIntArray226[local610] == 0) {
						this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873 + 1, 0, local739);
						this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873, local744, local739);
					}
					if (this.anIntArray226[local610] == 1) {
						this.aClass10_Sub1_Sub1_Sub2_4.method153(this.anInt873 + 1, (byte) 4, this.anInt962, local739, this.anInt872, 0);
						this.aClass10_Sub1_Sub1_Sub2_4.method153(this.anInt873, (byte) 4, this.anInt962, local739, this.anInt872, local744);
					}
					if (this.anIntArray226[local610] == 2) {
						this.aClass10_Sub1_Sub1_Sub2_4.method154(this.anInt873 + 1, 0, local739, this.anInt872, this.anInt962);
						this.aClass10_Sub1_Sub1_Sub2_4.method154(this.anInt873, local744, local739, this.anInt872, this.anInt962);
					}
					if (this.anIntArray226[local610] == 3) {
						this.aClass10_Sub1_Sub1_Sub2_4.method155(local739, 0, this.anInt872, this.anInt873 + 1, 150 - this.anIntArray227[local610], this.anInt962);
						this.aClass10_Sub1_Sub1_Sub2_4.method155(local739, local744, this.anInt872, this.anInt873, 150 - this.anIntArray227[local610], this.anInt962);
					}
					int local1116;
					if (this.anIntArray226[local610] == 4) {
						local819 = this.aClass10_Sub1_Sub1_Sub2_4.method151(local739);
						local1116 = (150 - this.anIntArray227[local610]) * (local819 + 100) / 150;
						Draw2D.setBounds(0, this.anInt872 - 50, 334, this.anInt872 + 50);
						this.aClass10_Sub1_Sub1_Sub2_4.method152(this.anInt872 + 50 - local1116, 0, this.anInt873 + 1, local739);
						this.aClass10_Sub1_Sub1_Sub2_4.method152(this.anInt872 + 50 - local1116, local744, this.anInt873, local739);
						Draw2D.resetBounds();
					}
					if (this.anIntArray226[local610] == 5) {
						local819 = 150 - this.anIntArray227[local610];
						local1116 = 0;
						if (local819 < 25) {
							local1116 = local819 - 25;
						} else if (local819 > 125) {
							local1116 = local819 - 125;
						}
						Draw2D.setBounds(this.anInt873 - this.aClass10_Sub1_Sub1_Sub2_4.anInt230 - 1, 0, this.anInt873 + 5, 512);
						this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873 + local1116 + 1, 0, local739);
						this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873 + local1116, local744, local739);
						Draw2D.resetBounds();
					}
				} else {
					this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873 + 1, 0, local739);
					this.aClass10_Sub1_Sub1_Sub2_4.method148(this.anInt872, 452, this.anInt873, 16776960, local739);
				}
			}
		} catch ( RuntimeException local1271) {
			signlink.reporterror("91115, " + false + ", " + local1271.toString());
			throw new RuntimeException();
		}
	}

	private void prepareGameScreen() {
		try {
			if (this.aClass19_18 == null) {
				this.method716();
				super.gameSurface = null;
				this.aClass19_19 = null;
				this.aClass19_20 = null;
				this.aClass19_21 = null;
				this.aClass19_22 = null;
				this.aClass19_23 = null;
				this.aClass19_24 = null;
				this.aClass19_25 = null;
				this.aClass19_26 = null;
				this.aClass19_27 = null;
				this.aClass19_18 = new PixMap(this.getBaseComponent(), 479, 96);
				this.aClass19_16 = new PixMap(this.getBaseComponent(), 172, 156);
				Draw2D.clear();
				this.aClass10_Sub1_Sub1_Sub3_17.method440(0, 0);
				this.aClass19_15 = new PixMap(this.getBaseComponent(), 190, 261);
				this.aClass19_17 = new PixMap(this.getBaseComponent(), 512, 334);
				Draw2D.clear();
				this.aClass19_12 = new PixMap(this.getBaseComponent(), 496, 50);
				this.aClass19_13 = new PixMap(this.getBaseComponent(), 269, 37);
				this.aClass19_14 = new PixMap(this.getBaseComponent(), 249, 45);
				this.aBoolean236 = true;
				this.aClass19_17.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
			}
		} catch ( RuntimeException local145) {
			signlink.reporterror("69063, " + -906 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	private void method698( int arg0) {
		try {
			Graphics local4 = this.getBaseComponent().getGraphics();
			local4.setColor(Color.black);
			boolean local11 = false;
			local4.fillRect(0, 0, 765, 503);
			this.setCycleDelay();
			byte local40;
			int local46;
			if (this.aBoolean264) {
				this.aBoolean257 = false;
				local4.setFont(new Font("Helvetica", 1, 16));
				local4.setColor(Color.yellow);
				local40 = 35;
				local4.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				local46 = local40 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				int local55 = local46 + 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				int local72 = local55 + 30;
				local4.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				int local78 = local72 + 30;
				local4.drawString("3: Try using a different game-world", 30, 195);
				int local84 = local78 + 30;
				local4.drawString("4: Try rebooting your computer", 30, 225);
				int local90 = local84 + 30;
				local4.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.aBoolean240) {
				this.aBoolean257 = false;
				local4.setFont(new Font("Helvetica", 1, 20));
				local4.setColor(Color.white);
				local4.drawString("Error - unable to load game!", 50, 50);
				local4.drawString("To play RuneScape make sure you play from", 50, 100);
				local4.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.aBoolean232) {
				this.aBoolean257 = false;
				local4.setColor(Color.yellow);
				local40 = 35;
				local4.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				local46 = local40 + 50;
				local4.setColor(Color.white);
				local4.drawString("To fix this try the following (in order):", 30, 85);
				local46 += 50;
				local4.setColor(Color.white);
				local4.setFont(new Font("Helvetica", 1, 12));
				local4.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				local46 += 30;
				local4.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				local46 += 30;
			}
		} catch ( RuntimeException local178) {
			signlink.reporterror("19067, " + arg0 + ", " + local178.toString());
			throw new RuntimeException();
		}
	}

	private void method699() {
		try {
			try {
				if (this.stream != null) {
					this.stream.close();
				}
			} catch ( Exception local7) {
			}
			this.stream = null;
			this.ingame = false;
			this.anInt998 = 0;
			this.aString27 = "";
			this.aString28 = "";
			this.method624();
			this.ingame &= true;
			this.aClass23_1.method190();
			for ( int local37 = 0; local37 < 4; local37++) {
				this.aClass47Array1[local37].method480();
			}
			System.gc();
			this.method625();
			this.anInt1051 = -1;
			this.anInt1023 = -1;
			this.anInt958 = 0;
		} catch ( RuntimeException local63) {
			signlink.reporterror("93177, " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	private void method700( String arg0, String arg1) {
		try {
			int local16;
			if (this.aClass19_17 != null) {
				this.aClass19_17.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
				local16 = 151;
				if (arg0 != null) {
					local16 -= 7;
				}
				this.aClass10_Sub1_Sub1_Sub2_3.method148(257, 452, local16, 0, arg1);
				this.aClass10_Sub1_Sub1_Sub2_3.method148(256, 452, local16 - 1, 16777215, arg1);
				local16 += 15;
				if (arg0 != null) {
					this.aClass10_Sub1_Sub1_Sub2_3.method148(257, 452, local16, 0, arg0);
					this.aClass10_Sub1_Sub1_Sub2_3.method148(256, 452, local16 - 1, 16777215, arg0);
				}
				this.aClass19_17.method131(4, 4, super.graphics);
			} else if (super.gameSurface != null) {
				super.gameSurface.method130();
				Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray239;
				local16 = 251;
				Draw2D.fillRect(50, 221, 0, 300, 233);
				Draw2D.drawRect(221, 50, 16777215, 233, 300);
				if (arg0 != null) {
					local16 -= 7;
				}
				this.aClass10_Sub1_Sub1_Sub2_3.method148(383, 452, local16, 0, arg1);
				this.aClass10_Sub1_Sub1_Sub2_3.method148(382, 452, local16 - 1, 16777215, arg1);
				local16 += 15;
				if (arg0 != null) {
					this.aClass10_Sub1_Sub1_Sub2_3.method148(383, 452, local16, 0, arg0);
					this.aClass10_Sub1_Sub1_Sub2_3.method148(382, 452, local16 - 1, 16777215, arg0);
				}
				super.gameSurface.method131(0, 0, super.graphics);
			}
		} catch ( RuntimeException local171) {
			signlink.reporterror("61884, " + -332 + ", " + arg0 + ", " + arg1 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	private boolean method701( int arg0, byte arg1) {
		try {
			if (arg0 < 0) {
				return false;
			}
			int local8 = this.anIntArray233[arg0];
			if (arg1 != 97) {
				throw new NullPointerException();
			}
			if (local8 >= 2000) {
				local8 -= 2000;
			}
			return local8 == 762;
		} catch ( RuntimeException local27) {
			signlink.reporterror("33506, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	private void method702() {
		try {
			if (this.hintType == 2) {
				this.method712((this.anInt828 - this.anInt914 << 7) + this.anInt831, this.anInt830 * 2, (this.anInt829 - this.anInt915 << 7) + this.anInt832);
				if (this.anInt872 > -1 && anInt1050 % 20 < 10) {
					this.aClass10_Sub1_Sub1_Sub1Array5[0].method78(this.anInt873 - 28, this.anInt872 - 12);
				}
			}
		} catch ( RuntimeException local63) {
			signlink.reporterror("96436, " + true + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@Override
	protected void draw() {
		try {
			if (this.aBoolean232 || this.aBoolean264 || this.aBoolean240) {
				this.method698(281);
			} else {
				anInt1044++;
				if (this.ingame) {
					this.method649();
				} else {
					this.drawTitleScreen(false);
				}
				this.anInt943 = 0;
			}
		} catch ( RuntimeException local38) {
			signlink.reporterror("87021, " + 818 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	private void method703() {
		try {
			int local8 = this.anInt1040;
			int local11 = this.anInt1041;
			int local14 = this.anInt1042;
			int local17 = this.anInt1043;
			Draw2D.fillRect(local17, local11, 6116423, local14, local8);
			Draw2D.fillRect(16, local11 + 1, 0, local14 - 2, local8 + 1);
			Draw2D.drawRect(local11 + 18, local17 - 19, 0, local8 + 1, local14 - 2);
			this.aClass10_Sub1_Sub1_Sub2_4.method152(local8 + 3, 6116423, local11 + 14, "Choose Option");
			int local69 = super.mouseX;
			int local72 = super.mouseY;
			if (this.anInt1039 == 0) {
				local69 -= 4;
				local72 -= 4;
			}
			if (this.anInt1039 == 1) {
				local69 -= 553;
				local72 -= 205;
			}
			if (this.anInt1039 == 2) {
				local69 -= 17;
				local72 -= 357;
			}
			for (int local91 = 0; local91 < this.menuSize; local91++) {
				int local106 = local11 + (this.menuSize - 1 - local91) * 15 + 31;
				int local108 = 16777215;
				if (local69 > local8 && local69 < local8 + local14 && local72 > local106 - 13 && local72 < local106 + 3) {
					local108 = 16776960;
				}
				this.aClass10_Sub1_Sub1_Sub2_4.method156(local108, local8 + 3, local106, true, this.aStringArray12[local91]);
			}
		} catch ( RuntimeException local149) {
			signlink.reporterror("50432, " + false + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	private int method704( int arg0, Class14 arg1) {
		try {
			if (arg1.anIntArrayArray5 == null || arg0 >= arg1.anIntArrayArray5.length) {
				return -2;
			}
			try {
				int[] local22 = arg1.anIntArrayArray5[arg0];
				int local24 = 0;
				int local26 = 0;
				byte local28 = 0;
				while (true) {
					int local33 = local22[local26++];
					int local35 = 0;
					byte local37 = 0;
					if (local33 == 0) {
						return local24;
					}
					if (local33 == 1) {
						local35 = this.anIntArray242[local22[local26++]];
					}
					if (local33 == 2) {
						local35 = this.anIntArray245[local22[local26++]];
					}
					if (local33 == 3) {
						local35 = this.anIntArray214[local22[local26++]];
					}
					Class14 local83;
					int local88;
					int local101;
					if (local33 == 4) {
						local83 = Class14.method87(local22[local26++]);
						local88 = local22[local26++];
						if (local88 >= 0 && local88 < Class17.anInt179 && (!Class17.method104(local88).aBoolean54 || members)) {
							for (local101 = 0; local101 < local83.anIntArray44.length; local101++) {
								if (local83.anIntArray44[local101] == local88 + 1) {
									local35 += local83.anIntArray40[local101];
								}
							}
						}
					}
					if (local33 == 5) {
						local35 = this.anIntArray244[local22[local26++]];
					}
					if (local33 == 6) {
						local35 = anIntArray228[this.anIntArray245[local22[local26++]] - 1];
					}
					if (local33 == 7) {
						local35 = this.anIntArray244[local22[local26++]] * 100 / 46875;
					}
					if (local33 == 8) {
						local35 = localPlayer.anInt767;
					}
					int local176;
					if (local33 == 9) {
						for (local176 = 0; local176 < Class43.anInt612; local176++) {
							if (Class43.aBooleanArray8[local176]) {
								local35 += this.anIntArray245[local176];
							}
						}
					}
					if (local33 == 10) {
						local83 = Class14.method87(local22[local26++]);
						local88 = local22[local26++] + 1;
						if (local88 >= 0 && local88 < Class17.anInt179 && (!Class17.method104(local88).aBoolean54 || members)) {
							for (local101 = 0; local101 < local83.anIntArray44.length; local101++) {
								if (local83.anIntArray44[local101] == local88) {
									local35 = 999999999;
									break;
								}
							}
						}
					}
					if (local33 == 11) {
						local35 = this.anInt1049;
					}
					if (local33 == 12) {
						local35 = this.anInt911;
					}
					if (local33 == 13) {
						local176 = this.anIntArray244[local22[local26++]];
						local88 = local22[local26++];
						local35 = (local176 & 0x1 << local88) == 0 ? 0 : 1;
					}
					if (local33 == 14) {
						local176 = local22[local26++];
						Class50 local290 = Class50.aClass50Array1[local176];
						local101 = local290.anInt800;
						int local296 = local290.anInt801;
						int local299 = local290.anInt802;
						int local305 = anIntArray262[local299 - local296];
						local35 = this.anIntArray244[local101] >> local296 & local305;
					}
					if (local33 == 15) {
						local37 = 1;
					}
					if (local33 == 16) {
						local37 = 2;
					}
					if (local33 == 17) {
						local37 = 3;
					}
					if (local33 == 18) {
						local35 = (localPlayer.anInt739 >> 7) + this.anInt914;
					}
					if (local33 == 19) {
						local35 = (localPlayer.anInt740 >> 7) + this.anInt915;
					}
					if (local33 == 20) {
						local35 = local22[local26++];
					}
					if (local37 == 0) {
						if (local28 == 0) {
							local24 += local35;
						}
						if (local28 == 1) {
							local24 -= local35;
						}
						if (local28 == 2 && local35 != 0) {
							local24 /= local35;
						}
						if (local28 == 3) {
							local24 *= local35;
						}
						local28 = 0;
					} else {
						local28 = local37;
					}
				}
			} catch ( Exception local398) {
				return -1;
			}
		} catch ( RuntimeException local401) {
			signlink.reporterror("524, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local401.toString());
			throw new RuntimeException();
		}
	}

	private void method705(int arg0, Pix24 arg1, int arg2) {
		try {
			if (arg1 != null) {
				int local10 = this.orbitCameraYaw + this.minimapAnticheatAngle & 0x7FF;
				int local18 = arg2 * arg2 + arg0 * arg0;
				if (local18 <= 6400) {
					int local26 = Model.anIntArray146[local10];
					int local30 = Model.anIntArray147[local10];
					int local39 = local26 * 256 / (this.minimapZoom + 256);
					int local48 = local30 * 256 / (this.minimapZoom + 256);
					int local65 = arg0 * local39 + arg2 * local48 >> 16;
					int local75 = arg0 * local48 - arg2 * local39 >> 16;
					if (local18 > 2500) {
						arg1.method84(this.aClass10_Sub1_Sub1_Sub3_17, 83 - local75 - arg1.cropH / 2 - 4, local65 + 94 - arg1.cropW / 2 + 4);
					} else {
						arg1.method78(83 - local75 - arg1.cropH / 2 - 4, local65 + 94 - arg1.cropW / 2 + 4);
					}
				}
			}
		} catch ( RuntimeException local129) {
			signlink.reporterror("62069, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	private void drawTitleScreen(boolean arg0) {
		try {
			this.method639();
			this.aClass19_21.method130();
			this.aClass10_Sub1_Sub1_Sub3_19.method440(0, 0);
			byte local57;
			int local70;
			if (this.anInt998 == 0) {
				this.aClass10_Sub1_Sub1_Sub2_2.method149(true, this.anInt928, 7711145, 180, 180, this.aClass33_Sub1_1.aString15);
				local57 = 80;
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 80, 180, "Welcome to RuneScape");
				local70 = local57 + 30;
				this.aClass10_Sub1_Sub1_Sub3_20.method440(100, 27);
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 125, 100, "New User");
				this.aClass10_Sub1_Sub1_Sub3_20.method440(100, 187);
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 125, 260, "Existing User");
			}
			if (this.anInt998 == 2) {
				local57 = 60;
				if (this.loginMessage0.length() > 0) {
					this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 45, 180, this.loginMessage0);
					this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 60, 180, this.loginMessage1);
					local70 = local57 + 30;
				} else {
					this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 53, 180, this.loginMessage1);
					local70 = local57 + 30;
				}
				this.aClass10_Sub1_Sub1_Sub2_4.method156(16777215, 90, 90, true, "Username: " + this.aString27 + (this.anInt886 == 0 & anInt1050 % 40 < 20 ? "@yel@|" : ""));
				local70 += 15;
				this.aClass10_Sub1_Sub1_Sub2_4.method156(16777215, 92, 105, true, "Password: " + Class26.method253(this.aString28) + (this.anInt886 == 1 & anInt1050 % 40 < 20 ? "@yel@|" : ""));
				local70 += 15;
				if (!arg0) {
					this.aClass10_Sub1_Sub1_Sub3_20.method440(130, 27);
					this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 155, 100, "Login");
					this.aClass10_Sub1_Sub1_Sub3_20.method440(130, 187);
					this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 155, 260, "Cancel");
				}
			}
			if (this.anInt998 == 3) {
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16776960, 40, 180, "Create a free account");
				local57 = 65;
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 65, 180, "To create a new account you need to");
				local70 = local57 + 15;
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 80, 180, "go back to the main RuneScape webpage");
				local70 += 15;
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 95, 180, "and choose the 'create account'");
				local70 += 15;
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 110, 180, "button near the top of that page.");
				local70 += 15;
				this.aClass10_Sub1_Sub1_Sub3_20.method440(130, 107);
				this.aClass10_Sub1_Sub1_Sub2_4.method149(true, this.anInt928, 16777215, 155, 180, "Cancel");
			}
			this.aClass19_21.method131(171, 202, super.graphics);
			if (this.aBoolean236) {
				this.aBoolean236 = false;
				this.aClass19_19.method131(0, 128, super.graphics);
				this.aClass19_20.method131(371, 202, super.graphics);
				this.aClass19_24.method131(265, 0, super.graphics);
				this.aClass19_25.method131(265, 562, super.graphics);
				this.aClass19_26.method131(171, 128, super.graphics);
				this.aClass19_27.method131(171, 562, super.graphics);
			}
		} catch ( RuntimeException local523) {
			signlink.reporterror("86033, " + -50 + ", " + arg0 + ", " + local523.toString());
			throw new RuntimeException();
		}
	}

	private void method707(Packet arg0, int arg1) {
		try {
			while (true) {
				if (arg0.bitPos + 21 < arg1 * 8) {
					int local17 = arg0.gBit(14);
					if (local17 != 16383) {
						if (this.npcs[local17] == null) {
							this.npcs[local17] = new Class10_Sub1_Sub2_Sub3_Sub1();
						}
						Class10_Sub1_Sub2_Sub3_Sub1 local37 = this.npcs[local17];
						this.anIntArray256[this.anInt960++] = local17;
						local37.anInt718 = anInt1050;
						int local56 = arg0.gBit(1);
						if (local56 == 1) {
							this.anIntArray230[this.anInt885++] = local17;
						}
						int local75 = arg0.gBit(5);
						if (local75 > 15) {
							local75 -= 32;
						}
						int local84 = arg0.gBit(5);
						if (local84 > 15) {
							local84 -= 32;
						}
						int local93 = arg0.gBit(1);
						local37.aClass38_1 = Class38.method407(arg0.gBit(13));
						local37.anInt730 = local37.aClass38_1.aByte31;
						local37.anInt729 = local37.aClass38_1.anInt579;
						local37.anInt748 = local37.aClass38_1.anInt576;
						local37.anInt749 = local37.aClass38_1.anInt575;
						local37.anInt750 = local37.aClass38_1.anInt574;
						local37.anInt751 = local37.aClass38_1.anInt569;
						local37.anInt760 = local37.aClass38_1.anInt564;
						local37.method542(localPlayer.anIntArray194[0] + local75, (byte) 5, local93 == 1, localPlayer.anIntArray193[0] + local84);
						continue;
					}
				}
				arg0.accessBytes();
				return;
			}
		} catch ( RuntimeException local163) {
			signlink.reporterror("11789, " + arg0 + ", " + arg1 + ", " + false + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	private void method708(Packet arg0, int arg1) {
		try {
			int local12;
			int local15;
			int local19;
			int local23;
			int local28;
			int local36;
			int local45;
			int local52;
			int local61;
			int local65;
			if (arg1 == 203) {
				local12 = arg0.g2();
				local15 = arg0.g1();
				local19 = local15 >> 2;
				local23 = local15 & 0x3;
				local28 = this.anIntArray243[local19];
				byte local32 = arg0.method334();
				local36 = arg0.method330();
				local45 = this.anInt889 + (local36 >> 4 & 0x7);
				local52 = this.anInt890 + (local36 & 0x7);
				byte local57 = arg0.method333(this.anInt940);
				local61 = arg0.method340();
				local65 = arg0.method339();
				byte local68 = arg0.g1b();
				byte local73 = arg0.method333(this.anInt940);
				int local76 = arg0.g2();
				PlayerEntity local82;
				if (local65 == this.anInt881) {
					local82 = localPlayer;
				} else {
					local82 = this.players[local65];
				}
				if (local82 != null) {
					Class48 local94 = Class48.method523(local12);
					int local104 = this.anIntArrayArrayArray8[this.anInt942][local45][local52];
					int local116 = this.anIntArrayArrayArray8[this.anInt942][local45 + 1][local52];
					int local130 = this.anIntArrayArrayArray8[this.anInt942][local45 + 1][local52 + 1];
					int local142 = this.anIntArrayArrayArray8[this.anInt942][local45][local52 + 1];
					Model local152 = local94.method531(local19, local23, local104, local116, local130, local142, -1);
					if (local152 != null) {
						this.method720(this.anInt942, local45, 0, local61 + 1, 0, -1, local76 + 1, local28, local52);
						local82.anInt771 = local76 + anInt1050;
						local82.anInt772 = local61 + anInt1050;
						local82.aClass10_Sub1_Sub2_Sub4_2 = local152;
						int local187 = local94.anInt707;
						int local190 = local94.anInt697;
						if (local23 == 1 || local23 == 3) {
							local187 = local94.anInt697;
							local190 = local94.anInt707;
						}
						local82.anInt762 = local45 * 128 + local187 * 64;
						local82.anInt764 = local52 * 128 + local190 * 64;
						local82.anInt763 = this.method685(local82.anInt764, local82.anInt762, this.anInt942);
						byte local236;
						if (local57 > local32) {
							local236 = local57;
							local57 = local32;
							local32 = local236;
						}
						if (local73 > local68) {
							local236 = local73;
							local73 = local68;
							local68 = local236;
						}
						local82.anInt774 = local45 + local57;
						local82.anInt776 = local45 + local32;
						local82.anInt775 = local52 + local73;
						local82.anInt777 = local52 + local68;
					}
				}
			}
			int local304;
			if (arg1 == 106) {
				local12 = arg0.method330();
				local15 = this.anInt889 + (local12 >> 4 & 0x7);
				local19 = this.anInt890 + (local12 & 0x7);
				local23 = arg0.method341();
				local28 = arg0.method340();
				local304 = arg0.method340();
				if (local15 >= 0 && local19 >= 0 && local15 < 104 && local19 < 104 && local304 != this.anInt881) {
					Class10_Sub1_Sub2_Sub1 local322 = new Class10_Sub1_Sub2_Sub1();
					local322.anInt211 = local28;
					local322.anInt213 = local23;
					if (this.levelObjStacks[this.anInt942][local15][local19] == null) {
						this.levelObjStacks[this.anInt942][local15][local19] = new Class6(true);
					}
					this.levelObjStacks[this.anInt942][local15][local19].method3(local322);
					this.method601(local15, local19);
				}
			} else {
				int local441;
				if (arg1 == 142) {
					local12 = arg0.g2();
					local15 = arg0.method330();
					local19 = local15 >> 2;
					local23 = local15 & 0x3;
					local28 = this.anIntArray243[local19];
					local304 = arg0.g1();
					local36 = this.anInt889 + (local304 >> 4 & 0x7);
					local45 = this.anInt890 + (local304 & 0x7);
					if (local36 >= 0 && local45 >= 0 && local36 < 103 && local45 < 103) {
						local52 = this.anIntArrayArrayArray8[this.anInt942][local36][local45];
						local441 = this.anIntArrayArrayArray8[this.anInt942][local36 + 1][local45];
						local61 = this.anIntArrayArrayArray8[this.anInt942][local36 + 1][local45 + 1];
						local65 = this.anIntArrayArrayArray8[this.anInt942][local36][local45 + 1];
						if (local28 == 0) {
							Class45 local478 = this.aClass23_1.method212(this.anInt942, local36, local45);
							if (local478 != null) {
								int local487 = local478.anInt635 >> 14 & 0x7FFF;
								if (local19 == 2) {
									local478.aClass10_Sub1_Sub2_7 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, 2, (byte) 3, local487, false, local52, local23 + 4);
									local478.aClass10_Sub1_Sub2_8 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, 2, (byte) 3, local487, false, local52, local23 + 1 & 0x3);
								} else {
									local478.aClass10_Sub1_Sub2_7 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, local19, (byte) 3, local487, false, local52, local23);
								}
							}
						}
						if (local28 == 1) {
							Class36 local555 = this.aClass23_1.method213(this.anInt942, local45, local36);
							if (local555 != null) {
								local555.aClass10_Sub1_Sub2_6 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, 4, (byte) 3, local555.anInt561 >> 14 & 0x7FFF, false, local52, 0);
							}
						}
						if (local28 == 2) {
							Class5 local589 = this.aClass23_1.method214(local36, local45, this.anInt942);
							if (local19 == 11) {
								local19 = 10;
							}
							if (local589 != null) {
								local589.aClass10_Sub1_Sub2_1 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, local19, (byte) 3, local589.anInt50 >> 14 & 0x7FFF, false, local52, local23);
							}
						}
						if (local28 == 3) {
							Class29 local628 = this.aClass23_1.method215(this.anInt942, local45, local36);
							if (local628 != null) {
								local628.aClass10_Sub1_Sub2_5 = new Class10_Sub1_Sub2_Sub5(local12, local61, local65, local441, 22, (byte) 3, local628.anInt446 >> 14 & 0x7FFF, false, local52, local23);
							}
						}
					}
				} else {
					Class10_Sub1_Sub2_Sub1 local695;
					if (arg1 == 107) {
						local12 = arg0.g2();
						local15 = arg0.method331();
						local19 = this.anInt889 + (local15 >> 4 & 0x7);
						local23 = this.anInt890 + (local15 & 0x7);
						local28 = arg0.method340();
						if (local19 >= 0 && local23 >= 0 && local19 < 104 && local23 < 104) {
							local695 = new Class10_Sub1_Sub2_Sub1();
							local695.anInt211 = local12;
							local695.anInt213 = local28;
							if (this.levelObjStacks[this.anInt942][local19][local23] == null) {
								this.levelObjStacks[this.anInt942][local19][local23] = new Class6(true);
							}
							this.levelObjStacks[this.anInt942][local19][local23].method3(local695);
							this.method601(local19, local23);
						}
					} else if (arg1 == 121) {
						local12 = arg0.g1();
						local15 = this.anInt889 + (local12 >> 4 & 0x7);
						local19 = this.anInt890 + (local12 & 0x7);
						local23 = arg0.g2();
						local28 = arg0.g2();
						local304 = arg0.g2();
						if (local15 >= 0 && local19 >= 0 && local15 < 104 && local19 < 104) {
							Class6 local791 = this.levelObjStacks[this.anInt942][local15][local19];
							if (local791 != null) {
								for ( Class10_Sub1_Sub2_Sub1 local797 = (Class10_Sub1_Sub2_Sub1) local791.method6(); local797 != null; local797 = (Class10_Sub1_Sub2_Sub1) local791.method8()) {
									if (local797.anInt211 == (local23 & 0x7FFF) && local797.anInt213 == local28) {
										local797.anInt213 = local304;
										break;
									}
								}
								this.method601(local15, local19);
							}
						}
					} else if (arg1 == 181) {
						local12 = arg0.g1();
						local15 = this.anInt889 + (local12 >> 4 & 0x7);
						local19 = this.anInt890 + (local12 & 0x7);
						local23 = local15 + arg0.g1b();
						local28 = local19 + arg0.g1b();
						local304 = arg0.g2b();
						local36 = arg0.g2();
						local45 = arg0.g1() * 4;
						local52 = arg0.g1() * 4;
						local441 = arg0.g2();
						local61 = arg0.g2();
						local65 = arg0.g1();
						int local886 = arg0.g1();
						if (local15 >= 0 && local19 >= 0 && local15 < 104 && local19 < 104 && local23 >= 0 && local28 >= 0 && local23 < 104 && local28 < 104 && local36 != 65535) {
							local15 = local15 * 128 + 64;
							local19 = local19 * 128 + 64;
							local23 = local23 * 128 + 64;
							local28 = local28 * 128 + 64;
							Class10_Sub1_Sub2_Sub2 local962 = new Class10_Sub1_Sub2_Sub2(this.anInt942, local52, local886, local19, local36, local61 + anInt1050, local65, local304, (byte) -41, this.method685(local19, local15, this.anInt942) - local45, local15, local441 + anInt1050);
							local962.method187(local23, local28, this.method685(local28, local23, this.anInt942) - local52, local441 + anInt1050);
							this.projectiles.method3(local962);
						}
					} else {
						if (arg1 == 41) {
							local12 = arg0.g1();
							local15 = this.anInt889 + (local12 >> 4 & 0x7);
							local19 = this.anInt890 + (local12 & 0x7);
							local23 = arg0.g2();
							local28 = arg0.g1();
							local304 = local28 >> 4 & 0xF;
							local36 = local28 & 0x7;
							if (localPlayer.anIntArray193[0] >= local15 - local304 && localPlayer.anIntArray193[0] <= local15 + local304 && localPlayer.anIntArray194[0] >= local19 - local304 && localPlayer.anIntArray194[0] <= local19 + local304 && this.aBoolean265 && !lowMemory && this.waveCount < 50) {
								this.anIntArray251[this.waveCount] = local23;
								this.anIntArray275[this.waveCount] = local36;
								this.anIntArray264[this.waveCount] = Class39.anIntArray171[local23];
								this.waveCount++;
							}
						}
						if (arg1 == 59) {
							local12 = arg0.g1();
							local15 = this.anInt889 + (local12 >> 4 & 0x7);
							local19 = this.anInt890 + (local12 & 0x7);
							local23 = arg0.g2();
							local28 = arg0.g1();
							local304 = arg0.g2();
							if (local15 >= 0 && local19 >= 0 && local15 < 104 && local19 < 104) {
								local15 = local15 * 128 + 64;
								local19 = local19 * 128 + 64;
								Class10_Sub1_Sub2_Sub6 local1163 = new Class10_Sub1_Sub2_Sub6(local15, this.anInt942, this.method685(local19, local15, this.anInt942) - local28, local304, local23, anInt1050, local19, 10709);
								this.spotanims.method3(local1163);
							}
						} else if (arg1 == 152) {
							local12 = arg0.method331();
							local15 = local12 >> 2;
							local19 = local12 & 0x3;
							local23 = this.anIntArray243[local15];
							local28 = arg0.method341();
							local304 = arg0.method330();
							local36 = this.anInt889 + (local304 >> 4 & 0x7);
							local45 = this.anInt890 + (local304 & 0x7);
							if (local36 >= 0 && local45 >= 0 && local36 < 104 && local45 < 104) {
								this.method720(this.anInt942, local36, local19, -1, local15, local28, 0, local23, local45);
							}
						} else if (arg1 == 208) {
							local12 = arg0.method340();
							local15 = arg0.method330();
							local19 = this.anInt889 + (local15 >> 4 & 0x7);
							local23 = this.anInt890 + (local15 & 0x7);
							if (local19 >= 0 && local23 >= 0 && local19 < 104 && local23 < 104) {
								Class6 local1283 = this.levelObjStacks[this.anInt942][local19][local23];
								if (local1283 != null) {
									for (local695 = (Class10_Sub1_Sub2_Sub1) local1283.method6(); local695 != null; local695 = (Class10_Sub1_Sub2_Sub1) local1283.method8()) {
										if (local695.anInt211 == (local12 & 0x7FFF)) {
											local695.unlink();
											break;
										}
									}
									if (local1283.method6() == null) {
										this.levelObjStacks[this.anInt942][local19][local23] = null;
									}
									this.method601(local19, local23);
								}
							}
						} else if (arg1 == 88) {
							local12 = arg0.method332(this.anInt1006);
							local15 = this.anInt889 + (local12 >> 4 & 0x7);
							local19 = this.anInt890 + (local12 & 0x7);
							local23 = arg0.method332(this.anInt1006);
							local28 = local23 >> 2;
							local304 = local23 & 0x3;
							local36 = this.anIntArray243[local28];
							if (local15 >= 0 && local19 >= 0 && local15 < 104 && local19 < 104) {
								this.method720(this.anInt942, local15, local304, -1, local28, -1, 0, local36, local19);
							}
						}
					}
				}
			}
		} catch ( RuntimeException local1393) {
			signlink.reporterror("94366, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local1393.toString());
			throw new RuntimeException();
		}
	}

	private void method709() {
		try {
			this.aClass19_15.method130();
			Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray237;
			this.aClass10_Sub1_Sub1_Sub3_16.method440(0, 0);
			if (this.anInt941 != -1) {
				this.method717(0, 0, Class14.method87(this.anInt941), 0);
			} else if (this.anIntArray248[this.anInt1031] != -1) {
				this.method717(0, 0, Class14.method87(this.anIntArray248[this.anInt1031]), 0);
			}
			if (this.menuVisible && this.anInt1039 == 1) {
				this.method703();
			}
			this.aClass19_15.method131(205, 553, super.graphics);
			this.aClass19_17.method130();
			Class10_Sub1_Sub1_Sub4.anIntArray183 = this.anIntArray238;
		} catch ( RuntimeException local77) {
			signlink.reporterror("69819, " + 7 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	private void method711(PathingEntity arg0, int arg1) {
		try {
			this.method712(arg0.anInt739, arg1, arg0.anInt740);
		} catch ( RuntimeException local11) {
			signlink.reporterror("22747, " + arg0 + ", " + false + ", " + arg1 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	private void method712( int arg0, int arg1, int arg2) {
		try {
			if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
				int local28 = this.method685(arg2, arg0, this.anInt942) - arg1;
				int local33 = arg0 - this.anInt990;
				int local38 = local28 - this.anInt991;
				int local43 = arg2 - this.anInt992;
				int local48 = Model.anIntArray146[this.anInt993];
				int local53 = Model.anIntArray147[this.anInt993];
				int local58 = Model.anIntArray146[this.anInt994];
				int local63 = Model.anIntArray147[this.anInt994];
				int local73 = local43 * local58 + local33 * local63 >> 16;
				int local83 = local43 * local63 - local33 * local58 >> 16;
				int local85 = local73;
				int local95 = local38 * local53 - local83 * local48 >> 16;
				int local105 = local38 * local48 + local83 * local53 >> 16;
				if (local105 >= 50) {
					this.anInt872 = Class10_Sub1_Sub1_Sub4.anInt686 + (local85 << 9) / local105;
					this.anInt873 = Class10_Sub1_Sub1_Sub4.anInt687 + (local95 << 9) / local105;
				} else {
					this.anInt872 = -1;
					this.anInt873 = -1;
				}
			} else {
				this.anInt872 = -1;
				this.anInt873 = -1;
			}
		} catch ( RuntimeException local144) {
			signlink.reporterror("91402, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -214 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	private void printDebug() {
		System.out.println("============");
		System.out.println("flame-cycle:" + this.anInt945);
		if (this.aClass33_Sub1_1 != null) {
			System.out.println("Od-cycle:" + this.aClass33_Sub1_1.anInt788);
		}
		System.out.println("loop-cycle:" + anInt1050);
		System.out.println("draw-cycle:" + anInt1044);
		System.out.println("ptype:" + this.packetType);
		System.out.println("psize:" + this.packetSize);
		if (this.stream != null) {
			this.stream.printDebug();
		}
		super.aBoolean213 = true;
	}

	@Override
	protected Component getBaseComponent() {
		try {
			if (signlink.mainapp == null) {
				return super.frame == null ? this : super.frame;
			} else {
				return signlink.mainapp;
			}
		} catch ( RuntimeException local25) {
			signlink.reporterror("16126, " + -756 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@Override
	protected void drawProgress(int progress, String message) {
		try {
			this.anInt1048 = progress;
			this.aString25 = message;
			this.method639();
			if (this.aClass2_2 == null) {
				super.drawProgress(progress, message);
			} else {
				this.aClass19_21.method130();
				this.aClass10_Sub1_Sub1_Sub2_4.method148(180, 452, 54, 16777215, "RuneScape is loading - please wait...");
				Draw2D.drawRect(62, 34, 9179409, 28, 304);
				Draw2D.drawRect(63, 32, 0, 29, 302);
				Draw2D.fillRect(30, 64, 9179409, progress * 3, 30);
				Draw2D.fillRect(30, 64, 0, 300 - progress * 3, progress * 3 + 30);
				this.aClass10_Sub1_Sub1_Sub2_4.method148(180, 452, 85, 16777215, message);
				this.aClass19_21.method131(171, 202, super.graphics);
				if (this.aBoolean236) {
					this.aBoolean236 = false;
					if (!this.aBoolean257) {
						this.aClass19_22.method131(0, 0, super.graphics);
						this.aClass19_23.method131(0, 637, super.graphics);
					}
					this.aClass19_19.method131(0, 128, super.graphics);
					this.aClass19_20.method131(371, 202, super.graphics);
					this.aClass19_24.method131(265, 0, super.graphics);
					this.aClass19_25.method131(265, 562, super.graphics);
					this.aClass19_26.method131(171, 128, super.graphics);
					this.aClass19_27.method131(171, 562, super.graphics);
				}
			}
		} catch ( RuntimeException local229) {
			signlink.reporterror("97534, " + progress + ", " + true + ", " + message + ", " + local229.toString());
			throw new RuntimeException();
		}
	}

	private void method714( boolean arg0) {
		try {
			byte[] local7 = this.aClass2_2.read("title.dat", null);
			Pix24 local13 = new Pix24(local7, this);
			this.aClass19_22.method130();
			local13.method76(0, 0);
			this.aClass19_23.method130();
			local13.method76(0, -637);
			this.aClass19_19.method130();
			local13.method76(0, -128);
			this.aClass19_20.method130();
			local13.method76(-371, -202);
			this.aClass19_21.method130();
			local13.method76(-171, -202);
			this.aClass19_24.method130();
			local13.method76(-265, 0);
			this.aClass19_25.method130();
			local13.method76(-265, -562);
			this.aClass19_26.method130();
			local13.method76(-171, -128);
			this.aClass19_27.method130();
			local13.method76(-171, -562);
			int[] local98 = new int[local13.width];
			int local104;
			for (int local100 = 0; local100 < local13.height; local100++) {
				for (local104 = 0; local104 < local13.width; local104++) {
					local98[local104] = local13.pixels[local13.width + local13.width * local100 - local104 - 1];
				}
				for (int local130 = 0; local130 < local13.width; local130++) {
					local13.pixels[local130 + local13.width * local100] = local98[local130];
				}
			}
			this.aClass19_22.method130();
			local13.method76(0, 382);
			this.aClass19_23.method130();
			local13.method76(0, -255);
			this.aClass19_19.method130();
			local13.method76(0, 254);
			this.aClass19_20.method130();
			local13.method76(-371, 180);
			this.aClass19_21.method130();
			local13.method76(-171, 180);
			this.aClass19_24.method130();
			if (arg0) {
				for (local104 = 1; local104 > 0; local104++) {
				}
			}
			local13.method76(-265, 382);
			this.aClass19_25.method130();
			local13.method76(-265, -180);
			this.aClass19_26.method130();
			local13.method76(-171, 254);
			this.aClass19_27.method130();
			local13.method76(-171, -180);
			local13 = new Pix24(this.aClass2_2, "logo", 0);
			this.aClass19_19.method130();
			local13.method78(18, 382 - local13.width / 2 - 128);
			System.gc();
		} catch ( RuntimeException local282) {
			signlink.reporterror("54886, " + arg0 + ", " + local282.toString());
			throw new RuntimeException();
		}
	}

	private void method715( Class10_Sub2 arg0) {
		try {
			int local1 = 0;
			int local3 = -1;
			int local5 = 0;
			int local7 = 0;
			if (arg0.anInt455 == 0) {
				local1 = this.aClass23_1.method216(arg0.anInt454, arg0.anInt456, arg0.anInt457);
			}
			if (arg0.anInt455 == 1) {
				local1 = this.aClass23_1.method217(arg0.anInt456, arg0.anInt454, arg0.anInt457);
			}
			if (arg0.anInt455 == 2) {
				local1 = this.aClass23_1.method218(arg0.anInt454, arg0.anInt456, arg0.anInt457);
			}
			if (arg0.anInt455 == 3) {
				local1 = this.aClass23_1.method219(arg0.anInt454, arg0.anInt456, arg0.anInt457);
			}
			if (local1 != 0) {
				int local83 = this.aClass23_1.method220(arg0.anInt454, arg0.anInt456, arg0.anInt457, local1);
				local3 = local1 >> 14 & 0x7FFF;
				local5 = local83 & 0x1F;
				local7 = local83 >> 6;
			}
			arg0.anInt450 = local3;
			arg0.anInt452 = local5;
			arg0.anInt451 = local7;
		} catch ( RuntimeException local108) {
			signlink.reporterror("50647, " + -61 + ", " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	private void method716() {
		try {
			this.aBoolean257 = false;
			while (this.aBoolean267) {
				this.aBoolean257 = false;
				try {
					Thread.sleep(50L);
				} catch ( Exception local11) {
				}
			}
			this.aClass10_Sub1_Sub1_Sub3_19 = null;
			this.aClass10_Sub1_Sub1_Sub3_20 = null;
			this.aClass10_Sub1_Sub1_Sub3Array3 = null;
			this.anIntArray271 = null;
			this.anIntArray272 = null;
			this.anIntArray273 = null;
			this.anIntArray274 = null;
			this.anIntArray259 = null;
			this.anIntArray260 = null;
			this.anIntArray249 = null;
			this.anIntArray250 = null;
			this.aClass10_Sub1_Sub1_Sub1_3 = null;
			this.aClass10_Sub1_Sub1_Sub1_4 = null;
		} catch ( RuntimeException local67) {
			signlink.reporterror("64682, " + 28614 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	private void method717( int arg0, int arg1, Class14 arg2, int arg3) {
		try {
			if (arg2.anInt120 == 0 && arg2.anIntArray43 != null && (!arg2.aBoolean33 || this.anInt1037 == arg2.anInt111 || this.anInt1028 == arg2.anInt111 || this.anInt946 == arg2.anInt111)) {
				int local29 = Draw2D.left;
				int local31 = Draw2D.top;
				int local33 = Draw2D.right;
				int local35 = Draw2D.bottom;
				Draw2D.setBounds(arg0, arg1, arg0 + arg2.anInt121, arg1 + arg2.anInt123);
				int local51 = arg2.anIntArray43.length;
				for ( int local59 = 0; local59 < local51; local59++) {
					int local68 = arg2.anIntArray41[local59] + arg1;
					int local77 = arg2.anIntArray46[local59] + arg0 - arg3;
					Class14 local83 = Class14.method87(arg2.anIntArray43[local59]);
					int local88 = local68 + local83.anInt117;
					int local93 = local77 + local83.anInt134;
					if (local83.anInt124 > 0) {
						this.method678((byte) 2, local83);
					}
					if (local83.anInt120 == 0) {
						if (local83.anInt118 > local83.anInt147 - local83.anInt121) {
							local83.anInt118 = local83.anInt147 - local83.anInt121;
						}
						if (local83.anInt118 < 0) {
							local83.anInt118 = 0;
						}
						this.method717(local93, local88, local83, local83.anInt118);
						if (local83.anInt147 > local83.anInt121) {
							this.method631(local83.anInt118, local88 + local83.anInt123, local83.anInt121, local83.anInt147, local93);
						}
					} else if (local83.anInt120 != 1) {
						int local165;
						int local169;
						int local180;
						int local215;
						int local222;
						int local247;
						int local163;
						int local213;
						if (local83.anInt120 == 2) {
							local163 = 0;
							for (local165 = 0; local165 < local83.anInt121; local165++) {
								for (local169 = 0; local169 < local83.anInt123; local169++) {
									local180 = local88 + local169 * (local83.anInt137 + 32);
									int local189 = local93 + local165 * (local83.anInt126 + 32);
									if (local163 < 20) {
										local180 += local83.anIntArray39[local163];
										local189 += local83.anIntArray38[local163];
									}
									if (local83.anIntArray44[local163] > 0) {
										local213 = 0;
										local215 = 0;
										local222 = local83.anIntArray44[local163] - 1;
										if (local180 > Draw2D.left - 32 && local180 < Draw2D.right && local189 > Draw2D.top - 32 && local189 < Draw2D.bottom || this.anInt950 != 0 && this.anInt949 == local163) {
											local247 = 0;
											if (this.objSelected == 1 && this.anInt966 == local163 && this.anInt967 == local83.anInt111) {
												local247 = 16777215;
											}
											Pix24 local271 = Class17.method113(local247, local83.anIntArray40[local163], local222);
											if (local271 != null) {
												int local350;
												if (this.anInt950 != 0 && this.anInt949 == local163 && this.anInt948 == local83.anInt111) {
													local213 = super.mouseX - this.anInt951;
													local215 = super.mouseY - this.anInt952;
													if (local213 < 5 && local213 > -5) {
														local213 = 0;
													}
													if (local215 < 5 && local215 > -5) {
														local215 = 0;
													}
													if (this.anInt1022 < 5) {
														local213 = 0;
														local215 = 0;
													}
													local271.method80(local180 + local213, local189 + local215);
													if (local189 + local215 < Draw2D.top && arg2.anInt118 > 0) {
														local350 = this.anInt878 * (Draw2D.top - local189 - local215) / 3;
														if (local350 > this.anInt878 * 10) {
															local350 = this.anInt878 * 10;
														}
														if (local350 > arg2.anInt118) {
															local350 = arg2.anInt118;
														}
														arg2.anInt118 -= local350;
														this.anInt952 += local350;
													}
													if (local189 + local215 + 32 > Draw2D.bottom && arg2.anInt118 < arg2.anInt147 - arg2.anInt121) {
														local350 = this.anInt878 * (local189 + local215 + 32 - Draw2D.bottom) / 3;
														if (local350 > this.anInt878 * 10) {
															local350 = this.anInt878 * 10;
														}
														if (local350 > arg2.anInt147 - arg2.anInt121 - arg2.anInt118) {
															local350 = arg2.anInt147 - arg2.anInt121 - arg2.anInt118;
														}
														arg2.anInt118 += local350;
														this.anInt952 -= local350;
													}
												} else if (this.anInt1056 != 0 && this.anInt1055 == local163 && this.anInt1054 == local83.anInt111) {
													local271.method80(local180, local189);
												} else {
													local271.method78(local189, local180);
												}
												if (local271.cropW == 33 || local83.anIntArray40[local163] != 1) {
													local350 = local83.anIntArray40[local163];
													this.aClass10_Sub1_Sub1_Sub2_2.method152(local180 + local213 + 1, 0, local189 + local215 + 10, method595(local350));
													this.aClass10_Sub1_Sub1_Sub2_2.method152(local180 + local213, 16776960, local189 + local215 + 9, method595(local350));
												}
											}
										}
									} else if (local83.aClass10_Sub1_Sub1_Sub1Array1 != null && local163 < 20) {
										Pix24 local539 = local83.aClass10_Sub1_Sub1_Sub1Array1[local163];
										if (local539 != null) {
											local539.method78(local189, local180);
										}
									}
									local163++;
								}
							}
						} else if (local83.anInt120 == 3) {
							boolean local564 = false;
							if (this.anInt946 == local83.anInt111 || this.anInt1028 == local83.anInt111 || this.anInt1037 == local83.anInt111) {
								local564 = true;
							}
							if (this.method670(local83)) {
								local163 = local83.anInt135;
								if (local564 && local83.anInt115 != 0) {
									local163 = local83.anInt115;
								}
							} else {
								local163 = local83.anInt122;
								if (local564 && local83.anInt136 != 0) {
									local163 = local83.anInt136;
								}
							}
							if (local83.aByte9 == 0) {
								if (local83.aBoolean36) {
									Draw2D.fillRect(local83.anInt121, local93, local163, local83.anInt123, local88);
								} else {
									Draw2D.drawRect(local93, local83.anInt121, local163, local88, local83.anInt123);
								}
							} else if (local83.aBoolean36) {
								Draw2D.fillRectAlpha(local163, local93, local83.anInt123, local83.anInt121, 256 - (local83.aByte9 & 0xFF), local88);
							} else {
								Draw2D.method501(local88, local83.anInt123, local163, local83.anInt121, local93, 256 - (local83.aByte9 & 0xFF));
							}
						} else {
							Class10_Sub1_Sub1_Sub2 local682;
							String local959;
							if (local83.anInt120 == 4) {
								local682 = local83.aClass10_Sub1_Sub1_Sub2_1;
								String local685 = local83.aString2;
								boolean local687 = false;
								if (this.anInt946 == local83.anInt111 || this.anInt1028 == local83.anInt111 || this.anInt1037 == local83.anInt111) {
									local687 = true;
								}
								if (this.method670(local83)) {
									local165 = local83.anInt135;
									if (local687 && local83.anInt115 != 0) {
										local165 = local83.anInt115;
									}
									if (local83.aString3.length() > 0) {
										local685 = local83.aString3;
									}
								} else {
									local165 = local83.anInt122;
									if (local687 && local83.anInt136 != 0) {
										local165 = local83.anInt136;
									}
								}
								if (local83.anInt150 == 6 && this.aBoolean254) {
									local685 = "Please wait...";
									local165 = local83.anInt122;
								}
								if (Draw2D.width2d == 479) {
									if (local165 == 16776960) {
										local165 = 255;
									}
									if (local165 == 49152) {
										local165 = 16777215;
									}
								}
								local213 = local93 + local682.anInt230;
								while (local685.length() > 0) {
									if (local685.indexOf("%") != -1) {
										label390: while (true) {
											local215 = local685.indexOf("%1");
											if (local215 == -1) {
												while (true) {
													local215 = local685.indexOf("%2");
													if (local215 == -1) {
														while (true) {
															local215 = local685.indexOf("%3");
															if (local215 == -1) {
																while (true) {
																	local215 = local685.indexOf("%4");
																	if (local215 == -1) {
																		while (true) {
																			local215 = local685.indexOf("%5");
																			if (local215 == -1) {
																				break label390;
																			}
																			local685 = local685.substring(0, local215) + this.method664(this.method704(4, local83)) + local685.substring(local215 + 2);
																		}
																	}
																	local685 = local685.substring(0, local215) + this.method664(this.method704(3, local83)) + local685.substring(local215 + 2);
																}
															}
															local685 = local685.substring(0, local215) + this.method664(this.method704(2, local83)) + local685.substring(local215 + 2);
														}
													}
													local685 = local685.substring(0, local215) + this.method664(this.method704(1, local83)) + local685.substring(local215 + 2);
												}
											}
											local685 = local685.substring(0, local215) + this.method664(this.method704(0, local83)) + local685.substring(local215 + 2);
										}
									}
									local215 = local685.indexOf("\\n");
									if (local215 == -1) {
										local959 = local685;
										local685 = "";
									} else {
										local959 = local685.substring(0, local215);
										local685 = local685.substring(local215 + 2);
									}
									if (local83.aBoolean40) {
										local682.method149(local83.aBoolean37, this.anInt928, local165, local213, local88 + local83.anInt123 / 2, local959);
									} else {
										local682.method156(local165, local88, local213, local83.aBoolean37, local959);
									}
									local213 += local682.anInt230;
								}
							} else if (local83.anInt120 == 5) {
								Pix24 local1021;
								if (this.method670(local83)) {
									local1021 = local83.aClass10_Sub1_Sub1_Sub1_2;
								} else {
									local1021 = local83.aClass10_Sub1_Sub1_Sub1_1;
								}
								if (local1021 != null) {
									local1021.method78(local93, local88);
								}
							} else if (local83.anInt120 == 6) {
								local163 = Class10_Sub1_Sub1_Sub4.anInt686;
								local165 = Class10_Sub1_Sub1_Sub4.anInt687;
								Class10_Sub1_Sub1_Sub4.anInt686 = local88 + local83.anInt123 / 2;
								Class10_Sub1_Sub1_Sub4.anInt687 = local93 + local83.anInt121 / 2;
								local169 = Class10_Sub1_Sub1_Sub4.anIntArray181[local83.anInt130] * local83.anInt129 >> 16;
								local180 = Class10_Sub1_Sub1_Sub4.anIntArray182[local83.anInt130] * local83.anInt129 >> 16;
								boolean local1082 = this.method670(local83);
								if (local1082) {
									local213 = local83.anInt149;
								} else {
									local213 = local83.anInt148;
								}
								Model local1102;
								if (local213 == -1) {
									local1102 = local83.method95(-1, -1, local1082);
								} else {
									Class15 local1108 = Class15.aClass15Array1[local213];
									local1102 = local83.method95(local1108.anIntArray47[local83.anInt119], local1108.anIntArray48[local83.anInt119], local1082);
								}
								if (local1102 != null) {
									local1102.method292(local83.anInt131, 0, local83.anInt130, 0, local169, local180);
								}
								Class10_Sub1_Sub1_Sub4.anInt686 = local163;
								Class10_Sub1_Sub1_Sub4.anInt687 = local165;
							} else {
								if (local83.anInt120 == 7) {
									local682 = local83.aClass10_Sub1_Sub1_Sub2_1;
									local165 = 0;
									for (local169 = 0; local169 < local83.anInt121; local169++) {
										for (local180 = 0; local180 < local83.anInt123; local180++) {
											if (local83.anIntArray44[local165] > 0) {
												Class17 local1172 = Class17.method104(local83.anIntArray44[local165] - 1);
												String local1176 = String.valueOf(local1172.aString7);
												if (local1172.aBoolean52 || local83.anIntArray40[local165] != 1) {
													local1176 = local1176 + " x" + method710(local83.anIntArray40[local165]);
												}
												local215 = local88 + local180 * (local83.anInt137 + 115);
												local222 = local93 + local169 * (local83.anInt126 + 12);
												if (local83.aBoolean40) {
													local682.method149(local83.aBoolean37, this.anInt928, local83.anInt122, local222, local215 + local83.anInt123 / 2, local1176);
												} else {
													local682.method156(local83.anInt122, local215, local222, local83.aBoolean37, local1176);
												}
											}
											local165++;
										}
									}
								}
								if (local83.anInt120 == 8 && (this.anInt1030 == local83.anInt111 || this.anInt918 == local83.anInt111 || this.anInt959 == local83.anInt111) && this.anInt856 == 100) {
									local163 = 0;
									local165 = 0;
									Class10_Sub1_Sub1_Sub2 local1291 = this.aClass10_Sub1_Sub1_Sub2_3;
									String local1294 = local83.aString2;
									while (local1294.length() > 0) {
										local213 = local1294.indexOf("\\n");
										if (local213 == -1) {
											local959 = local1294;
											local1294 = "";
										} else {
											local959 = local1294.substring(0, local213);
											local1294 = local1294.substring(local213 + 2);
										}
										local215 = local1291.method150(local959);
										if (local215 > local163) {
											local163 = local215;
										}
										local165 += local1291.anInt230 + 1;
									}
									local163 += 6;
									local165 += 7;
									local213 = local88 + local83.anInt123 - local163 - 5;
									local215 = local93 + local83.anInt121 + 5;
									if (local213 < local88 + 5) {
										local213 = local88 + 5;
									}
									if (local213 + local163 > arg1 + arg2.anInt123) {
										local213 = arg1 + arg2.anInt123 - local163;
									}
									if (local215 + local165 > arg0 + arg2.anInt121) {
										local215 = arg0 + arg2.anInt121 - local165;
									}
									Draw2D.fillRect(local165, local215, 16777120, local163, local213);
									Draw2D.drawRect(local215, local165, 0, local213, local163);
									local1294 = local83.aString2;
									local222 = local215 + local1291.anInt230 + 2;
									while (local1294.length() > 0) {
										local247 = local1294.indexOf("\\n");
										if (local247 == -1) {
											local959 = local1294;
											local1294 = "";
										} else {
											local959 = local1294.substring(0, local247);
											local1294 = local1294.substring(local247 + 2);
										}
										local1291.method156(0, local213 + 3, local222, false, local959);
										local222 += local1291.anInt230 + 1;
									}
								}
							}
						}
					}
				}
				Draw2D.setBounds(local31, local29, local35, local33);
			}
		} catch ( RuntimeException local1479) {
			signlink.reporterror("31048, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 8 + ", " + local1479.toString());
			throw new RuntimeException();
		}
	}

	private void method718() {
		try {
			if (lowMemory && this.sceneState == 2 && Class8.anInt60 != this.anInt942) {
				this.method700(null, "Loading - please wait.");
				this.sceneState = 1;
				this.loginTime = System.currentTimeMillis();
			}
			if (this.sceneState == 1) {
				int local37 = this.method719();
				if (local37 != 0 && System.currentTimeMillis() - this.loginTime > 360000L) {
					signlink.reporterror(this.aString27 + " glcfb " + this.serverSeed + "," + local37 + "," + lowMemory + "," + this.aClass24Array1[0] + "," + this.aClass33_Sub1_1.method562() + "," + this.anInt942 + "," + this.anInt854 + "," + this.anInt855);
					this.loginTime = System.currentTimeMillis();
				}
			}
			if (this.sceneState == 2 && this.anInt942 != this.anInt1026) {
				this.anInt1026 = this.anInt942;
				this.method690(this.anInt942);
			}
		} catch ( RuntimeException local118) {
			signlink.reporterror("75168, " + -40 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	private int method719() {
		try {
			for ( int local3 = 0; local3 < this.aByteArrayArray5.length; local3++) {
				if (this.aByteArrayArray5[local3] == null && this.anIntArray217[local3] != -1) {
					return -1;
				}
				if (this.aByteArrayArray6[local3] == null && this.anIntArray218[local3] != -1) {
					return -2;
				}
			}
			boolean local39 = true;
			for ( int local55 = 0; local55 < this.aByteArrayArray5.length; local55++) {
				byte[] local62 = this.aByteArrayArray6[local55];
				if (local62 != null) {
					int local76 = (this.anIntArray216[local55] >> 8) * 64 - this.anInt914;
					int local88 = (this.anIntArray216[local55] & 0xFF) * 64 - this.anInt915;
					if (this.aBoolean247) {
						local76 = 10;
						local88 = 10;
					}
					local39 &= Class8.method29(local76, local88, local62);
				}
			}
			if (!local39) {
				return -3;
			} else if (this.aBoolean251) {
				return -4;
			} else {
				this.sceneState = 2;
				Class8.anInt60 = this.anInt942;
				this.method668(175);
				this.out.p1isaac(6);
				return 0;
			}
		} catch ( RuntimeException local135) {
			signlink.reporterror("80821, " + 5 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	private void method720( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			Class10_Sub2 local1 = null;
			for (Class10_Sub2 local6 = (Class10_Sub2) this.spawnedLocations.method6(); local6 != null; local6 = (Class10_Sub2) this.spawnedLocations.method8()) {
				if (local6.anInt454 == arg0 && local6.anInt456 == arg1 && local6.anInt457 == arg8 && local6.anInt455 == arg7) {
					local1 = local6;
					break;
				}
			}
			if (local1 == null) {
				local1 = new Class10_Sub2();
				local1.anInt454 = arg0;
				local1.anInt455 = arg7;
				local1.anInt456 = arg1;
				local1.anInt457 = arg8;
				this.method715(local1);
				this.spawnedLocations.method3(local1);
			}
			local1.anInt447 = arg5;
			local1.anInt449 = arg4;
			local1.anInt448 = arg2;
			local1.anInt458 = arg6;
			local1.anInt453 = arg3;
			this.ingame &= true;
		} catch ( RuntimeException local84) {
			signlink.reporterror("63025, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	private void method721() {
		try {
			if (this.anInt923 == 0 && super.anInt821 == 1) {
				int local18 = super.anInt822 - 25 - 550;
				int local25 = super.anInt823 - 5 - 4;
				if (local18 >= 0 && local25 >= 0 && local18 < 146 && local25 < 151) {
					local18 -= 73;
					local25 -= 75;
					int local45 = this.orbitCameraYaw + this.minimapAnticheatAngle & 0x7FF;
					int local49 = Class10_Sub1_Sub1_Sub4.anIntArray181[local45];
					int local53 = Class10_Sub1_Sub1_Sub4.anIntArray182[local45];
					int local62 = local49 * (this.minimapZoom + 256) >> 8;
					int local71 = local53 * (this.minimapZoom + 256) >> 8;
					int local81 = local25 * local62 + local18 * local71 >> 11;
					int local91 = local25 * local71 - local18 * local62 >> 11;
					int local98 = localPlayer.anInt739 + local81 >> 7;
					int local105 = localPlayer.anInt740 - local91 >> 7;
					boolean local126 = this.method610(true, local105, localPlayer.anIntArray194[0], 0, 0, 1, 0, local98, 0, 0, localPlayer.anIntArray193[0]);
					if (local126) {
						this.out.p1(local18);
						this.out.p1(local25);
						this.out.p2(this.orbitCameraYaw);
						this.out.p1(57);
						this.out.p1(this.minimapAnticheatAngle);
						this.out.p1(this.minimapZoom);
						this.out.p1(89);
						this.out.p2(localPlayer.anInt739);
						this.out.p2(localPlayer.anInt740);
						this.out.p1(this.anInt957);
						this.out.p1(63);
						return;
					}
				}
			}
		} catch ( RuntimeException local180) {
			signlink.reporterror("47659, " + 4 + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	private void method722( int arg0) {
		try {
			if (super.gameSurface == null) {
				this.method716();
				this.aClass19_19 = null;
				this.aClass19_20 = null;
				this.aClass19_21 = null;
				if (arg0 >= 0) {
					this.anInt898 = -4;
				}
				this.aClass19_22 = null;
				this.aClass19_23 = null;
				this.aClass19_24 = null;
				this.aClass19_25 = null;
				this.aClass19_26 = null;
				this.aClass19_27 = null;
				this.aClass19_18 = null;
				this.aClass19_16 = null;
				this.aClass19_15 = null;
				this.aClass19_17 = null;
				this.aClass19_12 = null;
				this.aClass19_13 = null;
				this.aClass19_14 = null;
				super.gameSurface = new PixMap(this.getBaseComponent(), 765, 503);
				this.aBoolean236 = true;
			}
		} catch ( RuntimeException local75) {
			signlink.reporterror("50497, " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	private boolean method723( String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for ( int local5 = 0; local5 < this.anInt838; local5++) {
				if (arg0.equalsIgnoreCase(this.aStringArray8[local5])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(localPlayer.aString14);
		} catch ( RuntimeException local42) {
			signlink.reporterror("13116, " + 13292 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	private void method724() {
		try {
			int local20;
			int local27;
			if (this.anInt998 == 0) {
				local20 = super.screenWidth / 2 - 80;
				local27 = super.screenHeight / 2 + 20;
				local27 += 20;
				if (super.anInt821 == 1 && super.anInt822 >= local20 - 75 && super.anInt822 <= local20 + 75 && super.anInt823 >= local27 - 20 && super.anInt823 <= local27 + 20) {
					this.anInt998 = 3;
					this.anInt886 = 0;
				}
				local20 = super.screenWidth / 2 + 80;
				if (super.anInt821 == 1 && super.anInt822 >= local20 - 75 && super.anInt822 <= local20 + 75 && super.anInt823 >= local27 - 20 && super.anInt823 <= local27 + 20) {
					this.loginMessage0 = "";
					this.loginMessage1 = "Enter your username & password.";
					this.anInt998 = 2;
					this.anInt886 = 0;
				}
			} else if (this.anInt998 == 2) {
				local20 = super.screenHeight / 2 - 40;
				local20 += 30;
				local20 += 25;
				if (super.anInt821 == 1 && super.anInt823 >= local20 - 15 && super.anInt823 < local20) {
					this.anInt886 = 0;
				}
				local20 += 15;
				if (super.anInt821 == 1 && super.anInt823 >= local20 - 15 && super.anInt823 < local20) {
					this.anInt886 = 1;
				}
				local20 += 15;
				local27 = super.screenWidth / 2 - 80;
				int local173 = super.screenHeight / 2 + 50;
				int local174 = local173 + 20;
				if (super.anInt821 == 1 && super.anInt822 >= local27 - 75 && super.anInt822 <= local27 + 75 && super.anInt823 >= local174 - 20 && super.anInt823 <= local174 + 20) {
					this.anInt833 = 0;
					this.login(this.aString27, this.aString28, false);
					if (this.ingame) {
						return;
					}
				}
				local27 = super.screenWidth / 2 + 80;
				if (super.anInt821 == 1 && super.anInt822 >= local27 - 75 && super.anInt822 <= local27 + 75 && super.anInt823 >= local174 - 20 && super.anInt823 <= local174 + 20) {
					this.anInt998 = 0;
					this.aString27 = "";
					this.aString28 = "";
				}
				while (true) {
					while (true) {
						int local264 = this.pollKey();
						if (local264 == -1) {
							return;
						}
						boolean local269 = false;
						for ( int local271 = 0; local271 < aString23.length(); local271++) {
							if (local264 == aString23.charAt(local271)) {
								local269 = true;
								break;
							}
						}
						if (this.anInt886 == 0) {
							if (local264 == 8 && this.aString27.length() > 0) {
								this.aString27 = this.aString27.substring(0, this.aString27.length() - 1);
							}
							if (local264 == 9 || local264 == 10 || local264 == 13) {
								this.anInt886 = 1;
							}
							if (local269) {
								this.aString27 = this.aString27 + (char) local264;
							}
							if (this.aString27.length() > 12) {
								this.aString27 = this.aString27.substring(0, 12);
							}
						} else if (this.anInt886 == 1) {
							if (local264 == 8 && this.aString28.length() > 0) {
								this.aString28 = this.aString28.substring(0, this.aString28.length() - 1);
							}
							if (local264 == 9 || local264 == 10 || local264 == 13) {
								this.anInt886 = 0;
							}
							if (local269) {
								this.aString28 = this.aString28 + (char) local264;
							}
							if (this.aString28.length() > 20) {
								this.aString28 = this.aString28.substring(0, 20);
							}
						}
					}
				}
			} else if (this.anInt998 == 3) {
				local20 = super.screenWidth / 2;
				local27 = super.screenHeight / 2 + 50;
				int local428 = local27 + 20;
				if (super.anInt821 == 1 && super.anInt822 >= local20 - 75 && super.anInt822 <= local20 + 75 && super.anInt823 >= local428 - 20 && super.anInt823 <= local428 + 20) {
					this.anInt998 = 0;
					return;
				}
			}
		} catch ( RuntimeException local461) {
			signlink.reporterror("47621, " + -724 + ", " + local461.toString());
			throw new RuntimeException();
		}
	}

	private void method725( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			int local8 = this.aClass23_1.method216(arg1, arg2, arg0);
			boolean local12 = false;
			int local22;
			int local28;
			int local32;
			int local34;
			int local56;
			int local62;
			if (local8 != 0) {
				local22 = this.aClass23_1.method220(arg1, arg2, arg0, local8);
				local28 = local22 >> 6 & 0x3;
				local32 = local22 & 0x1F;
				local34 = arg5;
				if (local8 > 0) {
					local34 = arg3;
				}
				int[] local42 = this.aClass10_Sub1_Sub1_Sub1_11.pixels;
				local56 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
				local62 = local8 >> 14 & 0x7FFF;
				Class48 local65 = Class48.method523(local62);
				if (local65.anInt705 == -1) {
					if (local32 == 0 || local32 == 2) {
						if (local28 == 0) {
							local42[local56] = local34;
							local42[local56 + 512] = local34;
							local42[local56 + 1024] = local34;
							local42[local56 + 1536] = local34;
						} else if (local28 == 1) {
							local42[local56] = local34;
							local42[local56 + 1] = local34;
							local42[local56 + 2] = local34;
							local42[local56 + 3] = local34;
						} else if (local28 == 2) {
							local42[local56 + 3] = local34;
							local42[local56 + 3 + 512] = local34;
							local42[local56 + 3 + 1024] = local34;
							local42[local56 + 3 + 1536] = local34;
						} else if (local28 == 3) {
							local42[local56 + 1536] = local34;
							local42[local56 + 1536 + 1] = local34;
							local42[local56 + 1536 + 2] = local34;
							local42[local56 + 1536 + 3] = local34;
						}
					}
					if (local32 == 3) {
						if (local28 == 0) {
							local42[local56] = local34;
						} else if (local28 == 1) {
							local42[local56 + 3] = local34;
						} else if (local28 == 2) {
							local42[local56 + 3 + 1536] = local34;
						} else if (local28 == 3) {
							local42[local56 + 1536] = local34;
						}
					}
					if (local32 == 2) {
						if (local28 == 3) {
							local42[local56] = local34;
							local42[local56 + 512] = local34;
							local42[local56 + 1024] = local34;
							local42[local56 + 1536] = local34;
						} else if (local28 == 0) {
							local42[local56] = local34;
							local42[local56 + 1] = local34;
							local42[local56 + 2] = local34;
							local42[local56 + 3] = local34;
						} else if (local28 == 1) {
							local42[local56 + 3] = local34;
							local42[local56 + 3 + 512] = local34;
							local42[local56 + 3 + 1024] = local34;
							local42[local56 + 3 + 1536] = local34;
						} else if (local28 == 2) {
							local42[local56 + 1536] = local34;
							local42[local56 + 1536 + 1] = local34;
							local42[local56 + 1536 + 2] = local34;
							local42[local56 + 1536 + 3] = local34;
						}
					}
				} else {
					Class10_Sub1_Sub1_Sub3 local75 = this.aClass10_Sub1_Sub1_Sub3Array5[local65.anInt705];
					if (local75 != null) {
						int local87 = (local65.anInt707 * 4 - local75.anInt652) / 2;
						int local97 = (local65.anInt697 * 4 - local75.anInt653) / 2;
						local75.method440((104 - arg0 - local65.anInt697) * 4 + local97 + 48, arg2 * 4 + 48 + local87);
					}
				}
			}
			local8 = this.aClass23_1.method218(arg1, arg2, arg0);
			if (local8 != 0) {
				local22 = this.aClass23_1.method220(arg1, arg2, arg0, local8);
				local28 = local22 >> 6 & 0x3;
				local32 = local22 & 0x1F;
				local34 = local8 >> 14 & 0x7FFF;
				Class48 local451 = Class48.method523(local34);
				int local483;
				if (local451.anInt705 != -1) {
					Class10_Sub1_Sub1_Sub3 local461 = this.aClass10_Sub1_Sub1_Sub3Array5[local451.anInt705];
					if (local461 != null) {
						local62 = (local451.anInt707 * 4 - local461.anInt652) / 2;
						local483 = (local451.anInt697 * 4 - local461.anInt653) / 2;
						local461.method440((104 - arg0 - local451.anInt697) * 4 + local483 + 48, arg2 * 4 + 48 + local62);
					}
				} else if (local32 == 9) {
					local56 = 15658734;
					if (local8 > 0) {
						local56 = 15597568;
					}
					int[] local520 = this.aClass10_Sub1_Sub1_Sub1_11.pixels;
					local483 = arg2 * 4 + (103 - arg0) * 512 * 4 + 24624;
					if (local28 == 0 || local28 == 2) {
						local520[local483 + 1536] = local56;
						local520[local483 + 1024 + 1] = local56;
						local520[local483 + 512 + 2] = local56;
						local520[local483 + 3] = local56;
					} else {
						local520[local483] = local56;
						local520[local483 + 512 + 1] = local56;
						local520[local483 + 1024 + 2] = local56;
						local520[local483 + 1536 + 3] = local56;
					}
				}
			}
			local8 = this.aClass23_1.method219(arg1, arg2, arg0);
			if (local8 != 0) {
				local22 = local8 >> 14 & 0x7FFF;
				Class48 local615 = Class48.method523(local22);
				if (local615.anInt705 != -1) {
					Class10_Sub1_Sub1_Sub3 local625 = this.aClass10_Sub1_Sub1_Sub3Array5[local615.anInt705];
					if (local625 != null) {
						local34 = (local615.anInt707 * 4 - local625.anInt652) / 2;
						int local647 = (local615.anInt697 * 4 - local625.anInt653) / 2;
						local625.method440((104 - arg0 - local615.anInt697) * 4 + local647 + 48, arg2 * 4 + 48 + local34);
						return;
					}
				}
			}
		} catch ( RuntimeException local671) {
			signlink.reporterror("51834, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local671.toString());
			throw new RuntimeException();
		}
	}

	private void method726() {
		try {
			this.anInt962++;
			this.method694(true);
			this.method632(751, true);
			this.method694(false);
			this.method632(751, false);
			this.method626();
			this.method651();
			int local35;
			int local74;
			if (!this.aBoolean252) {
				local35 = this.anInt1012;
				if (this.anInt1033 / 256 > local35) {
					local35 = this.anInt1033 / 256;
				}
				if (this.aBooleanArray11[4] && this.anIntArray215[4] + 128 > local35) {
					local35 = this.anIntArray215[4] + 128;
				}
				local74 = this.orbitCameraYaw + this.cameraAnticheatAngle & 0x7FF;
				this.method669(this.method685(localPlayer.anInt740, localPlayer.anInt739, this.anInt942) - 50, this.anInt1019, local35, local35 * 3 + 600, local74, this.anInt1020);
			}
			if (this.aBoolean252) {
				local35 = this.method693();
			} else {
				local35 = this.method692((byte) 1);
			}
			local74 = this.anInt990;
			int local118 = this.anInt991;
			int local121 = this.anInt992;
			int local124 = this.anInt993;
			int local127 = this.anInt994;
			int local184;
			for ( int local137 = 0; local137 < 5; local137++) {
				if (this.aBooleanArray11[local137]) {
					local184 = (int) (Math.random() * (double) (this.anIntArray253[local137] * 2 + 1) - (double) this.anIntArray253[local137] + Math.sin((double) this.anIntArray257[local137] * ((double) this.anIntArray235[local137] / 100.0D)) * (double) this.anIntArray215[local137]);
					if (local137 == 0) {
						this.anInt990 += local184;
					}
					if (local137 == 1) {
						this.anInt991 += local184;
					}
					if (local137 == 2) {
						this.anInt992 += local184;
					}
					if (local137 == 3) {
						this.anInt994 = this.anInt994 + local184 & 0x7FF;
					}
					if (local137 == 4) {
						this.anInt993 += local184;
						if (this.anInt993 < 128) {
							this.anInt993 = 128;
						}
						if (this.anInt993 > 383) {
							this.anInt993 = 383;
						}
					}
				}
			}
			local184 = Class10_Sub1_Sub1_Sub4.anInt690;
			Model.aBoolean107 = true;
			Model.anInt419 = 0;
			Model.anInt417 = super.mouseX - 4;
			Model.anInt418 = super.mouseY - 4;
			Draw2D.clear();
			this.aClass23_1.method229(this.anInt990, local35, this.anInt991, this.anInt992, this.anInt994, this.anInt993);
			this.aClass23_1.method204(this.anInt859);
			this.method696();
			this.method702();
			this.method640(local184);
			this.method684();
			this.aClass19_17.method131(4, 4, super.graphics);
			this.anInt990 = local74;
			this.anInt991 = local118;
			this.anInt992 = local121;
			this.anInt993 = local124;
			this.anInt994 = local127;
		} catch ( RuntimeException local325) {
			signlink.reporterror("99254, " + 2 + ", " + local325.toString());
			throw new RuntimeException();
		}
	}

	private void method727() {
		try {
			for (int local8 = 0; local8 < this.waveCount; local8++) {
				if (this.anIntArray264[local8] <= 0) {
					boolean local17 = false;
					try {
						if (this.anIntArray251[local8] != this.anInt1024 || this.anIntArray275[local8] != this.anInt874) {
							Packet local50 = Class39.method409(this.anIntArray275[local8], this.anIntArray251[local8]);
							if (System.currentTimeMillis() + (long) (local50.pos / 22) > this.aLong33 + (long) (this.anInt983 / 22)) {
								this.anInt983 = local50.pos;
								this.aLong33 = System.currentTimeMillis();
								if (this.method691(local50.pos, local50.data)) {
									this.anInt1024 = this.anIntArray251[local8];
									this.anInt874 = this.anIntArray275[local8];
								} else {
									local17 = true;
								}
							}
						} else if (!this.method653()) {
							local17 = true;
						}
					} catch ( Exception local100) {
						if (signlink.reporterror) {
							this.out.p1isaac(80);
							this.out.p2(this.anIntArray251[local8] & 0x7FFF);
						} else {
							this.out.p1isaac(80);
							this.out.p2(-1);
						}
					}
					if (local17 && this.anIntArray264[local8] != -5) {
						this.anIntArray264[local8] = -5;
					} else {
						this.waveCount--;
						for (int local143 = local8; local143 < this.waveCount; local143++) {
							this.anIntArray251[local143] = this.anIntArray251[local143 + 1];
							this.anIntArray275[local143] = this.anIntArray275[local143 + 1];
							this.anIntArray264[local143] = this.anIntArray264[local143 + 1];
						}
						local8--;
					}
				} else {
					int local195 = this.anIntArray264[local8]--;
				}
			}
			if (this.anInt958 > 0) {
				this.anInt958 -= 20;
				if (this.anInt958 < 0) {
					this.anInt958 = 0;
				}
				if (this.anInt958 == 0 && this.aBoolean259 && !lowMemory) {
					this.anInt1023 = this.anInt1051;
					this.aBoolean260 = true;
					this.aClass33_Sub1_1.method558(2, this.anInt1023);
					return;
				}
			}
		} catch ( RuntimeException local241) {
			signlink.reporterror("46583, " + -23763 + ", " + local241.toString());
			throw new RuntimeException();
		}
	}
}
