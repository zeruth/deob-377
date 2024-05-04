


public final class BZip2State {

	public static int[] anIntArray4;

	public byte[] aByteArray1;

	public int anInt10;

	public int anInt11;

	public int anInt12;

	public int anInt13;

	public byte[] aByteArray2;

	public int anInt14;

	public int anInt15;

	public int anInt16;

	public int anInt17;

	public byte aByte1;

	public int anInt18;

	public boolean aBoolean1;

	public int anInt19;

	public int anInt20;

	public int anInt21;

	public int anInt22;

	public int anInt23;

	public int anInt24;

	public int anInt25;

	public int anInt26;

	public int anInt27;

	public int anInt28;

	private final int MTFA_SIZE = 4096;

	private final int MTFL_SIZE = 16;

	private final int BZ_MAX_ALPHA_SIZE = 258;

	private final int BZ_MAX_CODE_LEN = 23;

	private final int anInt5 = 1;

	private final int BZ_N_GROUPS = 6;

	private final int BZ_G_SIZE = 50;

	private final int anInt8 = 4;

	private final int BZ_MAX_SELECTORS = (2 + (900000 / BZ_G_SIZE)); // 18002

	public int[] anIntArray1 = new int[256];

	public int[] anIntArray2 = new int[257];

	private int[] anIntArray3 = new int[257];

	public boolean[] aBooleanArray1 = new boolean[256];

	public boolean[] aBooleanArray2 = new boolean[16];

	public byte[] aByteArray3 = new byte[256];

	public byte[] mtfa = new byte[MTFA_SIZE];

	public int[] anIntArray5 = new int[MTFL_SIZE];

	public byte[] selector = new byte[BZ_MAX_SELECTORS];

	public byte[] selectorMtf = new byte[BZ_MAX_SELECTORS];

	public byte[][] len = new byte[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

	public int[][] limit = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

	public int[][] base = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

	public int[][] perm = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

	public int[] minLens = new int[BZ_N_GROUPS];
}
