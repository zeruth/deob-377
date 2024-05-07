package unmapped;


import jagex2.io.Packet;
import sign.signlink;

public final class Class42 {

	private int anInt611;

	public int[] anIntArray172;

	public int[][] anIntArrayArray15;

	public Class42(Packet arg0, int arg1) {
		try {
			this.anInt611 = arg0.g1();
			this.anIntArray172 = new int[this.anInt611];
			this.anIntArrayArray15 = new int[this.anInt611][];
			for ( int local25 = 0; local25 < this.anInt611; local25++) {
				this.anIntArray172[local25] = arg0.g1();
			}
			for ( int local40 = 0; local40 < this.anInt611; local40++) {
				int local45 = arg0.g1();
				this.anIntArrayArray15[local40] = new int[local45];
				for ( int local53 = 0; local53 < local45; local53++) {
					this.anIntArrayArray15[local40][local53] = arg0.g1();
				}
			}
		} catch ( RuntimeException local74) {
			signlink.reporterror("51209, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
