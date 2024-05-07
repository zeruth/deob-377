package unmapped;


import jagex2.graphics.Draw2D;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import sign.signlink;

public final class Class10_Sub1_Sub1_Sub3 extends Draw2D {

	private int anInt649;

	private int anInt648 = 3;

	private boolean aBoolean161 = true;

	private int anInt650 = -235;

	private byte aByte36 = 5;

	private int anInt651 = -3539;

	private boolean aBoolean162 = true;

	public int anInt656;

	private int anInt657;

	public int[] anIntArray175;

	public int anInt654;

	public int anInt655;

	public int anInt652;

	public int anInt653;

	public byte[] aByteArray16;

	public Class10_Sub1_Sub1_Sub3(JagFile arg0, String arg1, int arg2) {
		Packet local37 = new Packet(arg0.read(arg1 + ".dat", null));
		Packet local46 = new Packet(arg0.read("index.dat", null));
		local46.pos = local37.g2();
		this.anInt656 = local46.g2();
		this.anInt657 = local46.g2();
		int local61 = local46.g1();
		this.anIntArray175 = new int[local61];
		for ( int local67 = 0; local67 < local61 - 1; local67++) {
			this.anIntArray175[local67 + 1] = local46.g3();
		}
		for ( int local85 = 0; local85 < arg2; local85++) {
			local46.pos += 2;
			local37.pos += local46.g2() * local46.g2();
			local46.pos++;
		}
		this.anInt654 = local46.g1();
		this.anInt655 = local46.g1();
		this.anInt652 = local46.g2();
		this.anInt653 = local46.g2();
		int local132 = local46.g1();
		int local138 = this.anInt652 * this.anInt653;
		this.aByteArray16 = new byte[local138];
		int local146;
		if (local132 == 0) {
			for (local146 = 0; local146 < local138; local146++) {
				this.aByteArray16[local146] = local37.g1b();
			}
		} else if (local132 == 1) {
			for (local146 = 0; local146 < this.anInt652; local146++) {
				for ( int local168 = 0; local168 < this.anInt653; local168++) {
					this.aByteArray16[local146 + local168 * this.anInt652] = local37.g1b();
				}
			}
		}
	}

	public void method435() {
		try {
			this.anInt656 /= 2;
			this.anInt657 /= 2;
			byte[] local20 = new byte[this.anInt656 * this.anInt657];
			int local22 = 0;
			for ( int local27 = 0; local27 < this.anInt653; local27++) {
				for ( int local31 = 0; local31 < this.anInt652; local31++) {
					local20[(local31 + this.anInt654 >> 1) + (local27 + this.anInt655 >> 1) * this.anInt656] = this.aByteArray16[local22++];
				}
			}
			this.aByteArray16 = local20;
			this.anInt652 = this.anInt656;
			this.anInt653 = this.anInt657;
			this.anInt654 = 0;
			this.anInt655 = 0;
		} catch ( RuntimeException local85) {
			signlink.reporterror("66140, " + 0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	public void method436() {
		try {
			if (this.anInt652 != this.anInt656 || this.anInt653 != this.anInt657) {
				byte[] local19 = new byte[this.anInt656 * this.anInt657];
				int local21 = 0;
				for ( int local23 = 0; local23 < this.anInt653; local23++) {
					for ( int local27 = 0; local27 < this.anInt652; local27++) {
						local19[local27 + this.anInt654 + (local23 + this.anInt655) * this.anInt656] = this.aByteArray16[local21++];
					}
				}
				this.aByteArray16 = local19;
				this.anInt652 = this.anInt656;
				this.anInt653 = this.anInt657;
				this.anInt654 = 0;
				this.anInt655 = 0;
			}
		} catch ( RuntimeException local80) {
			signlink.reporterror("31312, " + true + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	public void method437() {
		try {
			byte[] local8 = new byte[this.anInt652 * this.anInt653];
			int local10 = 0;
			for ( int local12 = 0; local12 < this.anInt653; local12++) {
				for ( int local19 = this.anInt652 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray16[local19 + local12 * this.anInt652];
				}
			}
			this.aByteArray16 = local8;
			this.anInt654 = this.anInt656 - this.anInt652 - this.anInt654;
		} catch ( RuntimeException local60) {
			signlink.reporterror("85851, " + 0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	public void method438() {
		try {
			byte[] local8 = new byte[this.anInt652 * this.anInt653];
			int local10 = 0;
			for ( int local26 = this.anInt653 - 1; local26 >= 0; local26--) {
				for ( int local30 = 0; local30 < this.anInt652; local30++) {
					local8[local10++] = this.aByteArray16[local30 + local26 * this.anInt652];
				}
			}
			this.aByteArray16 = local8;
			this.anInt655 = this.anInt657 - this.anInt653 - this.anInt655;
		} catch ( RuntimeException local68) {
			signlink.reporterror("45635, " + 7 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	public void method439( int arg0, int arg1, int arg2) {
		try {
			for ( int local3 = 0; local3 < this.anIntArray175.length; local3++) {
				int local14 = this.anIntArray175[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				int local38 = this.anIntArray175[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				int local60 = this.anIntArray175[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray175[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
			if (this.anInt650 == -235) {
				;
			}
		} catch ( RuntimeException local100) {
			signlink.reporterror("7661, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -235 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	public void method440( int arg0, int arg1) {
		try {
			arg1 += this.anInt654;
			arg0 += this.anInt655;
			int local28 = arg1 + arg0 * Draw2D.width2d;
			int local30 = 0;
			int local33 = this.anInt653;
			int local36 = this.anInt652;
			int local40 = Draw2D.width2d - local36;
			int local42 = 0;
			int local49;
			if (arg0 < Draw2D.top) {
				local49 = Draw2D.top - arg0;
				local33 -= local49;
				arg0 = Draw2D.top;
				local30 = local49 * local36 + 0;
				local28 += local49 * Draw2D.width2d;
			}
			if (arg0 + local33 > Draw2D.bottom) {
				local33 -= arg0 + local33 - Draw2D.bottom;
			}
			if (arg1 < Draw2D.left) {
				local49 = Draw2D.left - arg1;
				local36 -= local49;
				arg1 = Draw2D.left;
				local30 += local49;
				local28 += local49;
				local42 = local49 + 0;
				local40 += local49;
			}
			if (arg1 + local36 > Draw2D.right) {
				local49 = arg1 + local36 - Draw2D.right;
				local36 -= local49;
				local42 += local49;
				local40 += local49;
			}
			if (local36 > 0 && local33 > 0) {
				this.method441(local30, Draw2D.data, this.aByteArray16, local42, this.anIntArray175, local33, local36, local28, local40);
			}
		} catch ( RuntimeException local153) {
			signlink.reporterror("17371, " + arg0 + ", " + arg1 + ", " + -488 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	private void method441( int arg0, int[] arg1, byte[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			int local6 = -(arg6 >> 2);
			int local11 = -(arg6 & 0x3);
			for ( int local19 = -arg5; local19 < 0; local19++) {
				for ( int local23 = local6; local23 < 0; local23++) {
					byte local30 = arg2[arg0++];
					if (local30 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local30 & 0xFF];
					}
					local30 = arg2[arg0++];
					if (local30 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local30 & 0xFF];
					}
					local30 = arg2[arg0++];
					if (local30 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local30 & 0xFF];
					}
					local30 = arg2[arg0++];
					if (local30 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local30 & 0xFF];
					}
				}
				for ( int local106 = local11; local106 < 0; local106++) {
					byte local113 = arg2[arg0++];
					if (local113 == 0) {
						arg7++;
					} else {
						arg1[arg7++] = arg4[local113 & 0xFF];
					}
				}
				arg7 += arg8;
				arg0 += arg3;
			}
		} catch ( RuntimeException local143) {
			signlink.reporterror("67567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + false + ", " + arg8 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
