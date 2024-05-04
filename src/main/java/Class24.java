import java.io.IOException;
import java.io.RandomAccessFile;




import sign.signlink;

public final class Class24 {

	private static byte[] aByteArray10 = new byte[520];

	private int anInt318;

	private boolean aBoolean95 = false;

	private int anInt319 = 3;

	private int anInt321 = 65000;

	private int anInt320;

	private RandomAccessFile aRandomAccessFile1;

	private RandomAccessFile aRandomAccessFile2;

	public Class24( int arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3, int arg4) {
		try {
			this.anInt320 = arg0;
			this.aRandomAccessFile1 = arg2;
			this.aRandomAccessFile2 = arg3;
			this.anInt321 = arg1;
		} catch ( RuntimeException local33) {
			signlink.reporterror("84815, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	public synchronized byte[] method241( byte arg0, int arg1) {
		try {
			if (arg0 == 6) {
				boolean local6 = false;
			} else {
				this.aBoolean95 = !this.aBoolean95;
			}
			try {
				this.method244(arg1 * 6, this.aRandomAccessFile2);
				int local26;
				int local37;
				for (local26 = 0; local26 < 6; local26 += local37) {
					local37 = this.aRandomAccessFile2.read(aByteArray10, local26, 6 - local26);
					if (local37 == -1) {
						return null;
					}
				}
				local37 = ((aByteArray10[0] & 0xFF) << 16) + ((aByteArray10[1] & 0xFF) << 8) + (aByteArray10[2] & 0xFF);
				int local93 = ((aByteArray10[3] & 0xFF) << 16) + ((aByteArray10[4] & 0xFF) << 8) + (aByteArray10[5] & 0xFF);
				if (local37 < 0 || local37 > this.anInt321) {
					return null;
				} else if (local93 > 0 && (long) local93 <= this.aRandomAccessFile1.length() / 520L) {
					byte[] local117 = new byte[local37];
					int local119 = 0;
					int local121 = 0;
					while (local119 < local37) {
						if (local93 == 0) {
							return null;
						}
						this.method244(local93 * 520, this.aRandomAccessFile1);
						local26 = 0;
						int local141 = local37 - local119;
						if (local141 > 512) {
							local141 = 512;
						}
						int local159;
						while (local26 < local141 + 8) {
							local159 = this.aRandomAccessFile1.read(aByteArray10, local26, local141 + 8 - local26);
							if (local159 == -1) {
								return null;
							}
							local26 += local159;
						}
						local159 = ((aByteArray10[0] & 0xFF) << 8) + (aByteArray10[1] & 0xFF);
						int local201 = ((aByteArray10[2] & 0xFF) << 8) + (aByteArray10[3] & 0xFF);
						int local223 = ((aByteArray10[4] & 0xFF) << 16) + ((aByteArray10[5] & 0xFF) << 8) + (aByteArray10[6] & 0xFF);
						int local229 = aByteArray10[7] & 0xFF;
						if (local159 == arg1 && local201 == local121 && local229 == this.anInt320) {
							if (local223 >= 0 && (long) local223 <= this.aRandomAccessFile1.length() / 520L) {
								for ( int local256 = 0; local256 < local141; local256++) {
									local117[local119++] = aByteArray10[local256 + 8];
								}
								local93 = local223;
								local121++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local117;
				} else {
					return null;
				}
			} catch ( IOException local280) {
				return null;
			}
		} catch ( RuntimeException local283) {
			signlink.reporterror("38418, " + arg0 + ", " + arg1 + ", " + local283.toString());
			throw new RuntimeException();
		}
	}

	public synchronized boolean method242( int arg0, byte[] arg1, int arg2) {
		try {
			boolean local17 = this.method243(arg1, this.anInt318, arg2, true, arg0);
			if (!local17) {
				local17 = this.method243(arg1, this.anInt318, arg2, false, arg0);
			}
			return local17;
		} catch ( RuntimeException local31) {
			signlink.reporterror("99076, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	private synchronized boolean method243( byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
		try {
			if (arg1 != 0) {
				throw new NullPointerException();
			}
			try {
				int local64;
				int local19;
				int local30;
				if (arg3) {
					this.method244(arg2 * 6, this.aRandomAccessFile2);
					local19 = 0;
					while (true) {
						if (local19 >= 6) {
							local64 = ((aByteArray10[3] & 0xFF) << 16) + ((aByteArray10[4] & 0xFF) << 8) + (aByteArray10[5] & 0xFF);
							if (local64 <= 0 || (long) local64 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
							break;
						}
						local30 = this.aRandomAccessFile2.read(aByteArray10, local19, 6 - local19);
						if (local30 == -1) {
							return false;
						}
						local19 += local30;
					}
				} else {
					local64 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
					if (local64 == 0) {
						local64 = 1;
					}
				}
				aByteArray10[0] = (byte) (arg4 >> 16);
				aByteArray10[1] = (byte) (arg4 >> 8);
				aByteArray10[2] = (byte) arg4;
				aByteArray10[3] = (byte) (local64 >> 16);
				aByteArray10[4] = (byte) (local64 >> 8);
				aByteArray10[5] = (byte) local64;
				this.method244(arg2 * 6, this.aRandomAccessFile2);
				this.aRandomAccessFile2.write(aByteArray10, 0, 6);
				local19 = 0;
				local30 = 0;
				while (local19 < arg4) {
					int local150 = 0;
					int local162;
					if (arg3) {
						this.method244(local64 * 520, this.aRandomAccessFile1);
						int local173;
						for (local162 = 0; local162 < 8; local162 += local173) {
							local173 = this.aRandomAccessFile1.read(aByteArray10, local162, 8 - local162);
							if (local173 == -1) {
								break;
							}
						}
						if (local162 == 8) {
							local173 = ((aByteArray10[0] & 0xFF) << 8) + (aByteArray10[1] & 0xFF);
							int local214 = ((aByteArray10[2] & 0xFF) << 8) + (aByteArray10[3] & 0xFF);
							local150 = ((aByteArray10[4] & 0xFF) << 16) + ((aByteArray10[5] & 0xFF) << 8) + (aByteArray10[6] & 0xFF);
							int local242 = aByteArray10[7] & 0xFF;
							if (local173 != arg2 || local214 != local30 || local242 != this.anInt320) {
								return false;
							}
							if (local150 < 0 || (long) local150 > this.aRandomAccessFile1.length() / 520L) {
								return false;
							}
						}
					}
					if (local150 == 0) {
						arg3 = false;
						local150 = (int) ((this.aRandomAccessFile1.length() + 519L) / 520L);
						if (local150 == 0) {
							local150++;
						}
						if (local150 == local64) {
							local150++;
						}
					}
					if (arg4 - local19 <= 512) {
						local150 = 0;
					}
					aByteArray10[0] = (byte) (arg2 >> 8);
					aByteArray10[1] = (byte) arg2;
					aByteArray10[2] = (byte) (local30 >> 8);
					aByteArray10[3] = (byte) local30;
					aByteArray10[4] = (byte) (local150 >> 16);
					aByteArray10[5] = (byte) (local150 >> 8);
					aByteArray10[6] = (byte) local150;
					aByteArray10[7] = (byte) this.anInt320;
					this.method244(local64 * 520, this.aRandomAccessFile1);
					this.aRandomAccessFile1.write(aByteArray10, 0, 8);
					local162 = arg4 - local19;
					if (local162 > 512) {
						local162 = 512;
					}
					this.aRandomAccessFile1.write(arg0, local19, local162);
					local19 += local162;
					local64 = local150;
					local30++;
				}
				return true;
			} catch ( IOException local385) {
				return false;
			}
		} catch ( RuntimeException local388) {
			signlink.reporterror("23479, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	private synchronized void method244( int arg0, RandomAccessFile arg1) throws IOException {
		try {
			if (arg0 < 0 || arg0 > 62914560) {
				System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
				arg0 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch ( Exception local27) {
				}
			}
			arg1.seek((long) arg0);
		} catch ( RuntimeException local34) {
			signlink.reporterror("42747, " + true + ", " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}
}
