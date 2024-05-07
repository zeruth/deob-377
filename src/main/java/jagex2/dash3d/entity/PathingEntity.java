package jagex2.dash3d.entity;


import sign.signlink;
import unmapped.Class15;

public abstract class PathingEntity extends Entity {

	public String aString13;

	public int anInt716;

	public int anInt717;

	public int anInt718;

	public int anInt720;

	public int anInt721;

	public int anInt722;

	public int anInt725;

	public int anInt726;

	public int anInt727;

	public int anInt728;

	public int anInt731;

	public int anInt732;

	public int anInt733;

	public int anInt734;

	public int anInt735;

	public int anInt736;

	public int anInt737;

	public int anInt739;

	public int anInt740;

	public int anInt741;

	public int anInt742;

	public int anInt744;

	public int anInt745;

	public int anInt746;

	public int anInt747;

	public int anInt752;

	public int anInt754;

	public int anInt755;

	public int anInt756;

	public int anInt757;

	public int anInt759;

	private int anInt714 = -89;

	public int anInt715 = 100;

	public int[] anIntArray193 = new int[10];

	public int[] anIntArray194 = new int[10];

	public int anInt719 = -1;

	public boolean[] aBooleanArray10 = new boolean[10];

	public boolean aBoolean196 = false;

	public int anInt723 = 200;

	public int anInt724 = -1000;

	public int anInt729 = 32;

	public int anInt730 = 1;

	public int anInt738 = -1;

	public int anInt743 = -1;

	public int anInt748 = -1;

	public int anInt749 = -1;

	public int anInt750 = -1;

	public int anInt751 = -1;

	public int anInt753 = -1;

	public int anInt758 = -1;

	public int[] anIntArray195 = new int[4];

	public int[] anIntArray196 = new int[4];

	public int[] anIntArray197 = new int[4];

	public int anInt760 = -1;

	public int anInt761 = -1;

	public final void method538() {
		try {
			this.anInt759 = 0;
			this.anInt742 = 0;
		} catch ( RuntimeException local12) {
			signlink.reporterror("69965, " + -56 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	public boolean isVisible() {
		try {
			return false;
		} catch ( RuntimeException local8) {
			signlink.reporterror("41269, " + 0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	public final void method540( boolean arg0, int arg1) {
		try {
			int local11 = this.anIntArray193[0];
			int local16 = this.anIntArray194[0];
			if (arg1 == 0) {
				local11--;
				local16++;
			}
			if (arg1 == 1) {
				local16++;
			}
			if (arg1 == 2) {
				local11++;
				local16++;
			}
			if (arg1 == 3) {
				local11--;
			}
			if (arg1 == 4) {
				local11++;
			}
			if (arg1 == 5) {
				local11--;
				local16--;
			}
			if (arg1 == 6) {
				local16--;
			}
			if (arg1 == 7) {
				local11++;
				local16--;
			}
			if (this.anInt753 != -1 && Class15.aClass15Array1[this.anInt753].anInt159 == 1) {
				this.anInt753 = -1;
			}
			if (this.anInt759 < 9) {
				this.anInt759++;
			}
			for ( int local78 = this.anInt759; local78 > 0; local78--) {
				this.anIntArray193[local78] = this.anIntArray193[local78 - 1];
				this.anIntArray194[local78] = this.anIntArray194[local78 - 1];
				this.aBooleanArray10[local78] = this.aBooleanArray10[local78 - 1];
			}
			this.anIntArray193[0] = local11;
			this.anIntArray194[0] = local16;
			this.aBooleanArray10[0] = arg0;
		} catch ( RuntimeException local130) {
			signlink.reporterror("59519, " + arg0 + ", " + arg1 + ", " + -808 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	public final void method541( int arg0, int arg1, int arg2) {
		try {
			for ( int local1 = 0; local1 < 4; local1++) {
				if (this.anIntArray197[local1] <= arg0) {
					this.anIntArray195[local1] = arg1;
					this.anIntArray196[local1] = arg2;
					this.anIntArray197[local1] = arg0 + 70;
					return;
				}
			}
		} catch ( RuntimeException local38) {
			signlink.reporterror("16680, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	public final void method542( int arg0, byte arg1, boolean arg2, int arg3) {
		try {
			if (this.anInt753 != -1 && Class15.aClass15Array1[this.anInt753].anInt159 == 1) {
				this.anInt753 = -1;
			}
			if (!arg2) {
				int local24 = arg3 - this.anIntArray193[0];
				int local31 = arg0 - this.anIntArray194[0];
				if (local24 >= -8 && local24 <= 8 && local31 >= -8 && local31 <= 8) {
					if (this.anInt759 < 9) {
						this.anInt759++;
					}
					for ( int local56 = this.anInt759; local56 > 0; local56--) {
						this.anIntArray193[local56] = this.anIntArray193[local56 - 1];
						this.anIntArray194[local56] = this.anIntArray194[local56 - 1];
						this.aBooleanArray10[local56] = this.aBooleanArray10[local56 - 1];
					}
					this.anIntArray193[0] = arg3;
					this.anIntArray194[0] = arg0;
					this.aBooleanArray10[0] = false;
					return;
				}
			}
			this.anInt759 = 0;
			this.anInt742 = 0;
			this.anInt752 = 0;
			this.anIntArray193[0] = arg3;
			this.anIntArray194[0] = arg0;
			boolean local131 = false;
			this.anInt739 = this.anIntArray193[0] * 128 + this.anInt730 * 64;
			this.anInt740 = this.anIntArray194[0] * 128 + this.anInt730 * 64;
		} catch ( RuntimeException local168) {
			signlink.reporterror("62497, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}
}
