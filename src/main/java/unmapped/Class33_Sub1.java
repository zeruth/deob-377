package unmapped;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;


import jagex2.datastruct.Stack;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import sign.signlink;

public final class Class33_Sub1 extends Class33 implements Runnable {

	private int anInt783;

	private byte[] aByteArray18;

	private int[] anIntArray204;

	private int anInt784;

	private int anInt785;

	private int anInt786;

	private int anInt787;

	private int[] anIntArray205;

	public int anInt788;

	private OutputStream anOutputStream2;

	public int anInt789;

	private int anInt790;

	private Socket aSocket2;

	private int[] anIntArray206;

	private int anInt791;

	private int anInt792;

	private int anInt793;

	private int[] anIntArray207;

	private int[] anIntArray208;

	private int anInt795;

	private InputStream anInputStream2;

	private Class10_Sub1_Sub4 aClass10_Sub1_Sub4_1;

	private Client aClient5;

	private int anInt796;

	private int[] anIntArray209;

	private long aLong26;

	public int anInt797;

	private byte[][] aByteArrayArray4 = new byte[4][];

	private boolean aBoolean204 = false;

	private boolean aBoolean205 = true;

	private Class6 aClass6_5 = new Class6(true);

	private int[][] anIntArrayArray20 = new int[4][];

	public String aString15 = "";

	private Class6 aClass6_6 = new Class6(true);

	private boolean aBoolean206 = false;

	private CRC32 aCRC32_1 = new CRC32();

	private boolean aBoolean207 = false;

	private Class6 aClass6_7 = new Class6(true);

	private Class6 aClass6_8 = new Class6(true);

	private byte[] aByteArray19 = new byte[65000];

	private byte[] aByteArray20 = new byte[500];

	private int anInt794 = 591;

	private Stack aClass9_2 = new Stack();

	private byte aByte44 = 6;

	private Class6 aClass6_9 = new Class6(true);

	private int[][] anIntArrayArray21 = new int[4][];

	private boolean aBoolean208 = false;

	private void method553() {
		try {
			try {
				int local10 = this.anInputStream2.available();
				int local45;
				int local61;
				if (this.anInt792 == 0 && local10 >= 6) {
					this.aBoolean204 = true;
					for ( int local21 = 0; local21 < 6; local21 += this.anInputStream2.read(this.aByteArray20, local21, 6 - local21)) {
					}
					local45 = this.aByteArray20[0] & 0xFF;
					local61 = ((this.aByteArray20[1] & 0xFF) << 8) + (this.aByteArray20[2] & 0xFF);
					int local77 = ((this.aByteArray20[3] & 0xFF) << 8) + (this.aByteArray20[4] & 0xFF);
					int local84 = this.aByteArray20[5] & 0xFF;
					this.aClass10_Sub1_Sub4_1 = null;
					for ( Class10_Sub1_Sub4 local92 = (Class10_Sub1_Sub4) this.aClass6_9.method6(); local92 != null; local92 = (Class10_Sub1_Sub4) this.aClass6_9.method8()) {
						if (local92.anInt486 == local45 && local92.anInt487 == local61) {
							this.aClass10_Sub1_Sub4_1 = local92;
						}
						if (this.aClass10_Sub1_Sub4_1 != null) {
							local92.anInt488 = 0;
						}
					}
					if (this.aClass10_Sub1_Sub4_1 != null) {
						this.anInt790 = 0;
						if (local77 == 0) {
							signlink.reporterror("Rej: " + local45 + "," + local61);
							this.aClass10_Sub1_Sub4_1.aByteArray13 = null;
							if (this.aClass10_Sub1_Sub4_1.aBoolean125) {
								Class6 local150 = this.aClass6_7;
								synchronized (this.aClass6_7) {
									this.aClass6_7.method3(this.aClass10_Sub1_Sub4_1);
								}
							} else {
								this.aClass10_Sub1_Sub4_1.unlink();
							}
							this.aClass10_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass10_Sub1_Sub4_1.aByteArray13 == null && local84 == 0) {
								this.aClass10_Sub1_Sub4_1.aByteArray13 = new byte[local77];
							}
							if (this.aClass10_Sub1_Sub4_1.aByteArray13 == null && local84 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt791 = local84 * 500;
					this.anInt792 = 500;
					if (this.anInt792 > local77 - local84 * 500) {
						this.anInt792 = local77 - local84 * 500;
					}
				}
				if (this.anInt792 > 0 && local10 >= this.anInt792) {
					this.aBoolean204 = true;
					byte[] local229 = this.aByteArray20;
					local45 = 0;
					if (this.aClass10_Sub1_Sub4_1 != null) {
						local229 = this.aClass10_Sub1_Sub4_1.aByteArray13;
						local45 = this.anInt791;
					}
					for (local61 = 0; local61 < this.anInt792; local61 += this.anInputStream2.read(local229, local61 + local45, this.anInt792 - local61)) {
					}
					if (this.anInt792 + this.anInt791 >= local229.length && this.aClass10_Sub1_Sub4_1 != null) {
						if (this.aClient5.aClass24Array1[0] != null) {
							this.aClient5.aClass24Array1[this.aClass10_Sub1_Sub4_1.anInt486 + 1].method242(local229.length, local229, this.aClass10_Sub1_Sub4_1.anInt487);
						}
						if (!this.aClass10_Sub1_Sub4_1.aBoolean125 && this.aClass10_Sub1_Sub4_1.anInt486 == 3) {
							this.aClass10_Sub1_Sub4_1.aBoolean125 = true;
							this.aClass10_Sub1_Sub4_1.anInt486 = 93;
						}
						if (this.aClass10_Sub1_Sub4_1.aBoolean125) {
							Class6 local322 = this.aClass6_7;
							synchronized (this.aClass6_7) {
								this.aClass6_7.method3(this.aClass10_Sub1_Sub4_1);
							}
						} else {
							this.aClass10_Sub1_Sub4_1.unlink();
						}
					}
					this.anInt792 = 0;
				}
			} catch ( IOException local343) {
				try {
					this.aSocket2.close();
				} catch ( Exception local348) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt792 = 0;
			}
		} catch ( RuntimeException local362) {
			signlink.reporterror("74821, " + false + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	public int method554( int arg0) {
		try {
			return this.aByteArray18[arg0] & 0xFF;
		} catch ( RuntimeException local14) {
			signlink.reporterror("28439, " + arg0 + ", " + -493 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void method552( int arg0) {
		this.method558(0, arg0);
	}

	private void method555() {
		try {
			while (this.anInt785 == 0) {
				if (this.anInt786 >= 10 || this.anInt784 == 0) {
					return;
				}
				Class6 local10 = this.aClass6_8;
				Class10_Sub1_Sub4 local17;
				synchronized (this.aClass6_8) {
					local17 = (Class10_Sub1_Sub4) this.aClass6_8.method5();
				}
				while (local17 != null) {
					if (this.aByteArrayArray4[local17.anInt486][local17.anInt487] != 0) {
						this.aByteArrayArray4[local17.anInt486][local17.anInt487] = 0;
						this.aClass6_9.method3(local17);
						this.method571(this.anInt787, local17);
						this.aBoolean204 = true;
						if (this.anInt783 < this.anInt789) {
							this.anInt783++;
						}
						this.aString15 = "Loading extra files - " + this.anInt783 * 100 / this.anInt789 + "%";
						this.anInt786++;
						if (this.anInt786 == 10) {
							return;
						}
					}
					local10 = this.aClass6_8;
					synchronized (this.aClass6_8) {
						local17 = (Class10_Sub1_Sub4) this.aClass6_8.method5();
					}
				}
				for ( int local112 = 0; local112 < 4; local112++) {
					byte[] local119 = this.aByteArrayArray4[local112];
					int local122 = local119.length;
					for ( int local124 = 0; local124 < local122; local124++) {
						if (local119[local124] == this.anInt784) {
							local119[local124] = 0;
							local17 = new Class10_Sub1_Sub4();
							local17.anInt486 = local112;
							local17.anInt487 = local124;
							local17.aBoolean125 = false;
							this.aClass6_9.method3(local17);
							this.method571(this.anInt787, local17);
							this.aBoolean204 = true;
							if (this.anInt783 < this.anInt789) {
								this.anInt783++;
							}
							this.aString15 = "Loading extra files - " + this.anInt783 * 100 / this.anInt789 + "%";
							this.anInt786++;
							if (this.anInt786 == 10) {
								return;
							}
						}
					}
				}
				this.anInt784--;
			}
		} catch ( RuntimeException local223) {
			signlink.reporterror("81922, " + 0 + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	public void method556( int arg0, byte arg1, int arg2) {
		try {
			if (this.aClient5.aClass24Array1[0] != null && this.anIntArrayArray21[arg0][arg2] != 0) {
				byte[] local31 = this.aClient5.aClass24Array1[arg0 + 1].method241(this.aByte44, arg2);
				if (!this.method570(local31, 764, this.anIntArrayArray21[arg0][arg2], this.anIntArrayArray20[arg0][arg2])) {
					this.aByteArrayArray4[arg0][arg2] = arg1;
					if (arg1 > this.anInt784) {
						this.anInt784 = arg1;
					}
					this.anInt789++;
				}
			}
		} catch ( RuntimeException local71) {
			signlink.reporterror("39133, " + -44 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	public boolean method557( int arg0, boolean arg1) {
		try {
			if (!arg1) {
				throw new NullPointerException();
			}
			return this.anIntArray208[arg0] == 1;
		} catch ( RuntimeException local16) {
			signlink.reporterror("75311, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	public void method558( int arg0, int arg1) {
		if (arg0 > this.anIntArrayArray21.length || arg1 < 0 || arg1 > this.anIntArrayArray21[arg0].length || this.anIntArrayArray21[arg0][arg1] == 0) {
			return;
		}
		Stack local27 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			Class10_Sub1_Sub4 local34;
			for (local34 = (Class10_Sub1_Sub4) this.aClass9_2.method35(); local34 != null; local34 = (Class10_Sub1_Sub4) this.aClass9_2.method36()) {
				if (local34.anInt486 == arg0 && local34.anInt487 == arg1) {
					return;
				}
			}
			local34 = new Class10_Sub1_Sub4();
			local34.anInt486 = arg0;
			local34.anInt487 = arg1;
			local34.aBoolean125 = true;
			Class6 local71 = this.aClass6_5;
			synchronized (this.aClass6_5) {
				this.aClass6_5.method3(local34);
			}
			this.aClass9_2.method33(local34);
		}
	}

	public Class10_Sub1_Sub4 method559() {
		Class6 local4 = this.aClass6_7;
		Class10_Sub1_Sub4 local11;
		synchronized (this.aClass6_7) {
			local11 = (Class10_Sub1_Sub4) this.aClass6_7.method5();
		}
		if (local11 == null) {
			return null;
		}
		Stack local24 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			local11.uncache();
		}
		if (local11.aByteArray13 == null) {
			return local11;
		}
		int local41 = 0;
		try {
			GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray13));
			while (true) {
				if (local41 == this.aByteArray19.length) {
					throw new RuntimeException("buffer overflow!");
				}
				int local71 = local50.read(this.aByteArray19, local41, this.aByteArray19.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch ( IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray13 = new byte[local41];
		for ( int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray13[local93] = this.aByteArray19[local93];
		}
		return local11;
	}

	@Override
	public void run() {
		try {
			while (this.aBoolean205) {
				this.anInt788++;
				byte local11 = 20;
				if (this.anInt784 == 0 && this.aClient5.aClass24Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch ( Exception local27) {
				}
				this.aBoolean204 = true;
				for ( int local32 = 0; local32 < 100 && this.aBoolean204; local32++) {
					this.aBoolean204 = false;
					this.method567();
					this.method560();
					if (this.anInt785 == 0 && local32 >= 5) {
						break;
					}
					this.method555();
					if (this.anInputStream2 != null) {
						this.method553();
					}
				}
				boolean local67 = false;
				Class10_Sub1_Sub4 local72;
				for (local72 = (Class10_Sub1_Sub4) this.aClass6_9.method6(); local72 != null; local72 = (Class10_Sub1_Sub4) this.aClass6_9.method8()) {
					if (local72.aBoolean125) {
						local67 = true;
						local72.anInt488++;
						if (local72.anInt488 > 50) {
							local72.anInt488 = 0;
							this.method571(this.anInt787, local72);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class10_Sub1_Sub4) this.aClass6_9.method6(); local72 != null; local72 = (Class10_Sub1_Sub4) this.aClass6_9.method8()) {
						local67 = true;
						local72.anInt488++;
						if (local72.anInt488 > 50) {
							local72.anInt488 = 0;
							this.method571(this.anInt787, local72);
						}
					}
				}
				if (local67) {
					this.anInt790++;
					if (this.anInt790 > 750) {
						try {
							this.aSocket2.close();
						} catch ( Exception local159) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt792 = 0;
					}
				} else {
					this.anInt790 = 0;
					this.aString15 = "";
				}
				if (this.aClient5.ingame && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt784 > 0 || this.aClient5.aClass24Array1[0] == null)) {
					this.anInt796++;
					if (this.anInt796 > 500) {
						this.anInt796 = 0;
						this.aByteArray20[0] = 0;
						this.aByteArray20[1] = 0;
						this.aByteArray20[2] = 0;
						this.aByteArray20[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray20, 0, 4);
						} catch ( IOException local240) {
							this.anInt790 = 5000;
						}
					}
				}
			}
		} catch ( Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}

	private void method560() {
		try {
			this.anInt785 = 0;
			this.anInt786 = 0;
			Class10_Sub1_Sub4 local15;
			for (local15 = (Class10_Sub1_Sub4) this.aClass6_9.method6(); local15 != null; local15 = (Class10_Sub1_Sub4) this.aClass6_9.method8()) {
				if (local15.aBoolean125) {
					this.anInt785++;
				} else {
					this.anInt786++;
				}
			}
			while (this.anInt785 < 10) {
				local15 = (Class10_Sub1_Sub4) this.aClass6_6.method5();
				if (local15 == null) {
					break;
				}
				if (this.aByteArrayArray4[local15.anInt486][local15.anInt487] != 0) {
					this.anInt783++;
				}
				this.aByteArrayArray4[local15.anInt486][local15.anInt487] = 0;
				this.aClass6_9.method3(local15);
				this.anInt785++;
				this.method571(this.anInt787, local15);
				this.aBoolean204 = true;
			}
		} catch ( RuntimeException local99) {
			signlink.reporterror("54967, " + 0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	public void method561( boolean arg0) {
		try {
			int local14 = this.anIntArray205.length;
			for ( int local16 = 0; local16 < local14; local16++) {
				if (arg0 || this.anIntArray204[local16] != 0) {
					this.method556(3, (byte) 2, this.anIntArray207[local16]);
					this.method556(3, (byte) 2, this.anIntArray206[local16]);
				}
			}
		} catch ( RuntimeException local49) {
			signlink.reporterror("13462, " + arg0 + ", " + 109 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	public int method562() {
		Stack local2 = this.aClass9_2;
		synchronized (this.aClass9_2) {
			return this.aClass9_2.method37();
		}
	}

	public boolean method563( int arg0) {
		try {
			for ( int local1 = 0; local1 < this.anIntArray205.length; local1++) {
				if (this.anIntArray207[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch ( RuntimeException local25) {
			signlink.reporterror("39871, " + arg0 + ", " + false + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	public void method564(JagFile arg0, Client arg1) {
		String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		int local36;
		int local56;
		for ( int local22 = 0; local22 < 4; local22++) {
			byte[] local31 = arg0.read(local20[local22], null);
			local36 = local31.length / 2;
			Packet local42 = new Packet(local31);
			this.anIntArrayArray21[local22] = new int[local36];
			this.aByteArrayArray4[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray21[local22][local56] = local42.g2();
			}
		}
		String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.read(local93[local36], null);
			local56 = local104.length / 4;
			Packet local115 = new Packet(local104);
			this.anIntArrayArray20[local36] = new int[local56];
			for ( int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray20[local36][local123] = local115.g4();
			}
		}
		local104 = arg0.read("model_index", null);
		local56 = this.anIntArrayArray21[0].length;
		this.aByteArray18 = new byte[local56];
		for ( int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray18[local158] = local104[local158];
			} else {
				this.aByteArray18[local158] = 0;
			}
		}
		local104 = arg0.read("map_index", null);
		Packet local193 = new Packet(local104);
		local56 = local104.length / 7;
		this.anIntArray205 = new int[local56];
		this.anIntArray206 = new int[local56];
		this.anIntArray207 = new int[local56];
		this.anIntArray204 = new int[local56];
		for ( int local216 = 0; local216 < local56; local216++) {
			this.anIntArray205[local216] = local193.g2();
			this.anIntArray206[local216] = local193.g2();
			this.anIntArray207[local216] = local193.g2();
			this.anIntArray204[local216] = local193.g1();
		}
		local104 = arg0.read("anim_index", null);
		local193 = new Packet(local104);
		local56 = local104.length / 2;
		this.anIntArray209 = new int[local56];
		for ( int local268 = 0; local268 < local56; local268++) {
			this.anIntArray209[local268] = local193.g2();
		}
		local104 = arg0.read("midi_index", null);
		local193 = new Packet(local104);
		local56 = local104.length;
		this.anIntArray208 = new int[local56];
		for ( int local300 = 0; local300 < local56; local300++) {
			this.anIntArray208[local300] = local193.g1();
		}
		this.aClient5 = arg1;
		this.aBoolean205 = true;
		this.aClient5.startThread(this, 2);
	}

	public void method565() {
		try {
			Class6 local2 = this.aClass6_8;
			synchronized (this.aClass6_8) {
				this.aClass6_8.clear();
			}
		} catch ( RuntimeException local26) {
			signlink.reporterror("61235, " + -125 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	public void method566( int arg0, int arg1, byte arg2) {
		try {
			if (this.aClient5.aClass24Array1[0] != null && (this.anIntArrayArray21[arg1][arg0] != 0 && (this.aByteArrayArray4[arg1][arg0] != 0 && this.anInt784 != 0))) {
				Class10_Sub1_Sub4 local30 = new Class10_Sub1_Sub4();
				if (arg2 != -113) {
					this.anInt794 = 244;
				}
				local30.anInt486 = arg1;
				local30.anInt487 = arg0;
				local30.aBoolean125 = false;
				Class6 local48 = this.aClass6_8;
				synchronized (this.aClass6_8) {
					this.aClass6_8.method3(local30);
				}
			}
		} catch ( RuntimeException local61) {
			signlink.reporterror("6642, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	private void method567() {
		try {
			Class6 local4 = this.aClass6_5;
			Class10_Sub1_Sub4 local11;
			synchronized (this.aClass6_5) {
				local11 = (Class10_Sub1_Sub4) this.aClass6_5.method5();
			}
			while (local11 != null) {
				this.aBoolean204 = true;
				byte[] local33 = null;
				if (this.aClient5.aClass24Array1[0] != null) {
					local33 = this.aClient5.aClass24Array1[local11.anInt486 + 1].method241(this.aByte44, local11.anInt487);
				}
				if (!this.method570(local33, 764, this.anIntArrayArray21[local11.anInt486][local11.anInt487], this.anIntArrayArray20[local11.anInt486][local11.anInt487])) {
					local33 = null;
				}
				Class6 local79 = this.aClass6_5;
				synchronized (this.aClass6_5) {
					if (local33 == null) {
						this.aClass6_6.method3(local11);
					} else {
						local11.aByteArray13 = local33;
						Class6 local95 = this.aClass6_7;
						synchronized (this.aClass6_7) {
							this.aClass6_7.method3(local11);
						}
					}
					local11 = (Class10_Sub1_Sub4) this.aClass6_5.method5();
				}
			}
		} catch ( RuntimeException local122) {
			signlink.reporterror("79437, " + true + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	public void method568() {
		this.aBoolean205 = false;
	}

	public int method569( int arg0) {
		try {
			return this.anIntArrayArray21[arg0].length;
		} catch ( RuntimeException local17) {
			signlink.reporterror("25460, " + arg0 + ", " + -31140 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	private boolean method570( byte[] arg0, int arg1, int arg2, int arg3) {
		try {
			boolean local3 = false;
			if (arg0 == null || arg0.length < 2) {
				return false;
			}
			int local16 = arg0.length - 2;
			int local32 = ((arg0[local16] & 0xFF) << 8) + (arg0[local16 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg0, 0, local16);
			int local46 = (int) this.aCRC32_1.getValue();
			if (local32 == arg2) {
				return local46 == arg3;
			} else {
				return false;
			}
		} catch ( RuntimeException local59) {
			signlink.reporterror("51252, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	private void method571( int arg0, Class10_Sub1_Sub4 arg1) {
		try {
			if (arg0 == 0) {
				try {
					if (this.aSocket2 == null) {
						long local9 = System.currentTimeMillis();
						if (local9 - this.aLong26 < 4000L) {
							return;
						}
						this.aLong26 = local9;
						this.aSocket2 = this.aClient5.openSocket(Client.portOffset + 43594);
						this.anInputStream2 = this.aSocket2.getInputStream();
						this.anOutputStream2 = this.aSocket2.getOutputStream();
						this.anOutputStream2.write(15);
						for ( int local44 = 0; local44 < 8; local44++) {
							this.anInputStream2.read();
						}
						this.anInt790 = 0;
					}
					this.aByteArray20[0] = (byte) arg1.anInt486;
					this.aByteArray20[1] = (byte) (arg1.anInt487 >> 8);
					this.aByteArray20[2] = (byte) arg1.anInt487;
					if (arg1.aBoolean125) {
						this.aByteArray20[3] = 2;
					} else if (this.aClient5.ingame) {
						this.aByteArray20[3] = 0;
					} else {
						this.aByteArray20[3] = 1;
					}
					this.anOutputStream2.write(this.aByteArray20, 0, 4);
					this.anInt796 = 0;
					this.anInt797 = -10000;
				} catch ( IOException local121) {
					try {
						this.aSocket2.close();
					} catch ( Exception local126) {
					}
					this.aSocket2 = null;
					this.anInputStream2 = null;
					this.anOutputStream2 = null;
					this.anInt792 = 0;
					this.anInt797++;
				}
			}
		} catch ( RuntimeException local146) {
			signlink.reporterror("78345, " + arg0 + ", " + arg1 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	public int method572( int arg0) {
		try {
			boolean local3 = false;
			return this.anIntArray209.length;
		} catch ( RuntimeException local8) {
			signlink.reporterror("67787, " + arg0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}

	public int method573( int arg0, int arg1, int arg2) {
		try {
			int local9 = (arg0 << 8) + arg1;
			for ( int local11 = 0; local11 < this.anIntArray205.length; local11++) {
				if (this.anIntArray205[local11] == local9) {
					if (arg2 == 0) {
						return this.anIntArray206[local11];
					}
					return this.anIntArray207[local11];
				}
			}
			return -1;
		} catch ( RuntimeException local40) {
			signlink.reporterror("26806, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
