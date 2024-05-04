package unmapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


import jagex2.client.GameShell;
import sign.signlink;

public final class Class18 implements Runnable {

	private byte[] aByteArray9;

	private int anInt205;

	private int anInt206;

	private byte aByte15 = 2;

	private boolean aBoolean55 = false;

	private boolean aBoolean56 = false;

	private boolean aBoolean57 = false;

	private GameShell anApplet_Sub1_1;

	private Socket aSocket1;

	private int anInt204;

	private InputStream anInputStream1;

	private OutputStream anOutputStream1;

	public Class18( byte arg0, Socket arg1, GameShell arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg2;
			this.aSocket1 = arg1;
			if (arg0 == this.aByte15) {
				boolean local25 = false;
			} else {
				this.anInt204 = -5;
			}
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch ( RuntimeException local50) {
			signlink.reporterror("87665, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	public void method116() {
		this.aBoolean55 = true;
		try {
			if (this.anInputStream1 != null) {
				this.anInputStream1.close();
			}
			if (this.anOutputStream1 != null) {
				this.anOutputStream1.close();
			}
			if (this.aSocket1 != null) {
				this.aSocket1.close();
			}
		} catch ( IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean56 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray9 = null;
	}

	public int method117() throws IOException {
		return this.aBoolean55 ? 0 : this.anInputStream1.read();
	}

	public int method118() throws IOException {
		return this.aBoolean55 ? 0 : this.anInputStream1.available();
	}

	public void method119( byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.aBoolean55) {
			return;
		}
		while (arg2 > 0) {
			int local11 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local11 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += local11;
			arg2 -= local11;
		}
	}

	public void method120( int arg0, byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean55) {
				if (this.aBoolean57) {
					this.aBoolean57 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray9 == null) {
					this.aByteArray9 = new byte[5000];
				}
				synchronized (this) {
					for ( int local28 = 0; local28 < arg0; local28++) {
						this.aByteArray9[this.anInt206] = arg1[local28 + 0];
						this.anInt206 = (this.anInt206 + 1) % 5000;
						if (this.anInt206 == (this.anInt205 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean56) {
						this.aBoolean56 = true;
						this.anApplet_Sub1_1.startThread(this, 3);
					}
					this.notify();
				}
			}
		} catch ( RuntimeException local90) {
			signlink.reporterror("53412, " + 0 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void run() {
		while (this.aBoolean56) {
			int local38;
			int local27;
			synchronized (this) {
				if (this.anInt206 == this.anInt205) {
					try {
						this.wait();
					} catch ( InterruptedException local16) {
					}
				}
				if (!this.aBoolean56) {
					return;
				}
				local27 = this.anInt205;
				if (this.anInt206 >= this.anInt205) {
					local38 = this.anInt206 - this.anInt205;
				} else {
					local38 = 5000 - this.anInt205;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray9, local27, local38);
				} catch ( IOException local62) {
					this.aBoolean57 = true;
				}
				this.anInt205 = (this.anInt205 + local38) % 5000;
				try {
					if (this.anInt206 == this.anInt205) {
						this.anOutputStream1.flush();
					}
				} catch ( IOException local83) {
					this.aBoolean57 = true;
				}
			}
		}
	}

	public void method121() {
		try {
			System.out.println("dummy:" + this.aBoolean55);
			System.out.println("tcycl:" + this.anInt205);
			System.out.println("tnum:" + this.anInt206);
			System.out.println("writer:" + this.aBoolean56);
			System.out.println("ioerror:" + this.aBoolean57);
			try {
				System.out.println("available:" + this.method118());
			} catch ( IOException local64) {
			}
		} catch ( RuntimeException local66) {
			signlink.reporterror("8814, " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
