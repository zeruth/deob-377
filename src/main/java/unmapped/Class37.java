package unmapped;


import jagex2.io.Packet;
import sign.signlink;

public final class Class37 {

	private static float aFloat1;

	public static int anInt563;

	private static float[][] aFloatArrayArray1 = new float[2][8];

	public static int[][] anIntArrayArray14 = new int[2][8];

	private int anInt562;

	private boolean aBoolean139 = true;

	public int[] anIntArray163 = new int[2];

	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	private int[] anIntArray164 = new int[2];

	private float method395( int arg0, int arg1, float arg2, int arg3) {
		try {
			float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg3] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg3] - this.anIntArrayArrayArray6[arg0][0][arg3]);
			float local34 = local30 * 0.0015258789F;
			boolean local38 = false;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch ( RuntimeException local50) {
			signlink.reporterror("40586, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	private float method396( float arg0) {
		try {
			float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch ( RuntimeException local24) {
			signlink.reporterror("89834, " + arg0 + ", " + -335 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	private float method397( int arg0, int arg1, float arg2) {
		try {
			float local35 = (float) this.anIntArrayArrayArray5[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray5[arg1][1][arg0] - this.anIntArrayArrayArray5[arg1][0][arg0]);
			float local39 = local35 * 1.2207031E-4F;
			return this.method396(local39);
		} catch ( RuntimeException local45) {
			signlink.reporterror("65056, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	public int method398( int arg0, float arg1) {
		try {
			float local31;
			if (arg0 == 0) {
				local31 = (float) this.anIntArray164[0] + (float) (this.anIntArray164[1] - this.anIntArray164[0]) * arg1;
				float local35 = local31 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local35 / 20.0F));
				anInt563 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray163[arg0] == 0) {
				return 0;
			}
			local31 = this.method395(arg0, 849, arg1, 0);
			aFloatArrayArray1[arg0][0] = -2.0F * local31 * (float) Math.cos((double) this.method397(0, arg0, arg1));
			aFloatArrayArray1[arg0][1] = local31 * local31;
			for ( int local90 = 1; local90 < this.anIntArray163[arg0]; local90++) {
				local31 = this.method395(arg0, 849, arg1, local90);
				float local113 = -2.0F * local31 * (float) Math.cos((double) this.method397(local90, arg0, arg1));
				float local117 = local31 * local31;
				aFloatArrayArray1[arg0][local90 * 2 + 1] = aFloatArrayArray1[arg0][local90 * 2 - 1] * local117;
				aFloatArrayArray1[arg0][local90 * 2] = aFloatArrayArray1[arg0][local90 * 2 - 1] * local113 + aFloatArrayArray1[arg0][local90 * 2 - 2] * local117;
				for ( int local173 = local90 * 2 - 1; local173 >= 2; local173--) {
					aFloatArrayArray1[arg0][local173] += aFloatArrayArray1[arg0][local173 - 1] * local113 + aFloatArrayArray1[arg0][local173 - 2] * local117;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local113 + local117;
				aFloatArrayArray1[arg0][0] += local113;
			}
			int local243;
			if (arg0 == 0) {
				for (local243 = 0; local243 < this.anIntArray163[0] * 2; local243++) {
					aFloatArrayArray1[0][local243] *= aFloat1;
				}
			}
			for (local243 = 0; local243 < this.anIntArray163[arg0] * 2; local243++) {
				anIntArrayArray14[arg0][local243] = (int) (aFloatArrayArray1[arg0][local243] * 65536.0F);
			}
			return this.anIntArray163[arg0] * 2;
		} catch ( RuntimeException local297) {
			signlink.reporterror("5181, " + arg0 + ", " + true + ", " + arg1 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	public void method399( Class30 arg0, Packet arg1) {
		try {
			int local4 = arg1.g1();
			this.anIntArray163[0] = local4 >> 4;
			this.anIntArray163[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray164[0] = this.anIntArray164[1] = 0;
			} else {
				this.anIntArray164[0] = arg1.g2();
				this.anIntArray164[1] = arg1.g2();
				int local46 = arg1.g1();
				int local52;
				for ( int local48 = 0; local48 < 2; local48++) {
					for (local52 = 0; local52 < this.anIntArray163[local48]; local52++) {
						this.anIntArrayArrayArray5[local48][0][local52] = arg1.g2();
						this.anIntArrayArrayArray6[local48][0][local52] = arg1.g2();
					}
				}
				for (local52 = 0; local52 < 2; local52++) {
					for ( int local91 = 0; local91 < this.anIntArray163[local52]; local91++) {
						if ((local46 & 0x1 << local52 * 4 << local91) == 0) {
							this.anIntArrayArrayArray5[local52][1][local91] = this.anIntArrayArrayArray5[local52][0][local91];
							this.anIntArrayArrayArray6[local52][1][local91] = this.anIntArrayArrayArray6[local52][0][local91];
						} else {
							this.anIntArrayArrayArray5[local52][1][local91] = arg1.g2();
							this.anIntArrayArrayArray6[local52][1][local91] = arg1.g2();
						}
					}
				}
				if (local46 != 0 || this.anIntArray164[1] != this.anIntArray164[0]) {
					arg0.method360(arg1);
				}
			}
		} catch ( RuntimeException local201) {
			signlink.reporterror("70345, " + -954 + ", " + arg0 + ", " + arg1 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}
}
