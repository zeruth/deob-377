package jagex2.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


import jagex2.client.GameShell;

public final class ClientStream implements Runnable {

	private byte[] buf;

	private int bufLen;

	private int bufPos;

	private boolean closed = false;

	private boolean writer = false;

	private boolean ioerror = false;

	private GameShell shell;

	private Socket socket;

	private InputStream in;

	private OutputStream out;

	public ClientStream(Socket socket, GameShell shell) throws IOException {
		this.shell = shell;
		this.socket = socket;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

	public void close() {
		this.closed = true;
		try {
			if (this.in != null) {
				this.in.close();
			}
			if (this.out != null) {
				this.out.close();
			}
			if (this.socket != null) {
				this.socket.close();
			}
		} catch ( IOException ignored) {
			System.out.println("Error closing stream");
		}
		this.writer = false;
		synchronized (this) {
			this.notify();
		}
		this.buf = null;
	}

	public int read() throws IOException {
		return this.closed ? 0 : this.in.read();
	}

	public int available() throws IOException {
		return this.closed ? 0 : this.in.available();
	}

	public void read(byte[] dst, int off, int len) throws IOException {
		if (this.closed) {
			return;
		}
		while (len > 0) {
			int read = this.in.read(dst, off, len);
			if (read <= 0) {
				throw new IOException("EOF");
			}
			off += read;
			len -= read;
		}
	}

	public void write(int arg0, byte[] arg1) throws IOException {
		if (!this.closed) {
			if (this.ioerror) {
				this.ioerror = false;
				throw new IOException("Error in writer thread");
			}
			if (this.buf == null) {
				this.buf = new byte[5000];
			}
			synchronized (this) {
				for ( int i = 0; i < arg0; i++) {
					this.buf[this.bufPos] = arg1[i + 0];
					this.bufPos = (this.bufPos + 1) % 5000;
					if (this.bufPos == (this.bufLen + 4900) % 5000) {
						throw new IOException("buffer overflow");
					}
				}
				if (!this.writer) {
					this.writer = true;
					this.shell.startThread(this, 3);
				}
				this.notify();
			}
		}
	}

	@Override
	public void run() {
		while (this.writer) {
			int len;
			int off;
			synchronized (this) {
				if (this.bufPos == this.bufLen) {
					try {
						this.wait();
					} catch ( InterruptedException local16) {
					}
				}
				if (!this.writer) {
					return;
				}
				off = this.bufLen;
				if (this.bufPos >= this.bufLen) {
					len = this.bufPos - this.bufLen;
				} else {
					len = 5000 - this.bufLen;
				}
			}
			if (len > 0) {
				try {
					this.out.write(this.buf, off, len);
				} catch ( IOException ignored) {
					this.ioerror = true;
				}
				this.bufLen = (this.bufLen + len) % 5000;
				try {
					if (this.bufPos == this.bufLen) {
						this.out.flush();
					}
				} catch ( IOException ignored) {
					this.ioerror = true;
				}
			}
		}
	}

	public void printDebug() {
		System.out.println("dummy:" + this.closed);
		System.out.println("tcycl:" + this.bufLen);
		System.out.println("tnum:" + this.bufPos);
		System.out.println("writer:" + this.writer);
		System.out.println("ioerror:" + this.ioerror);
		try {
			System.out.println("available:" + this.available());
		} catch ( IOException ignored) {
		}
	}
}
