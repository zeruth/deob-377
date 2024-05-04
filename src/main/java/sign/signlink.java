package sign;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;





public final class signlink implements Runnable {

	private static final int clientversion = 377;

	public static int anInt1058;

	public static boolean sunjava;

	private static boolean active;

	private static int anInt1060;

	private static InetAddress socketip;

	private static int socketreq;

	private static int anInt1061;

	public static boolean aBoolean268;

	private static int anInt1062;

	public static int anInt1063;

	public static int anInt1064;

	private static boolean aBoolean269;

	private static int anInt1065;

	public static int anInt1066;

	public static int anInt1059 = 32;

	public static RandomAccessFile aRandomAccessFile3 = null;

	public static RandomAccessFile[] aRandomAccessFileArray1 = new RandomAccessFile[5];

	public static Applet mainapp = null;

	private static Socket socket = null;

	private static int threadreqpri = 1;

	private static Runnable aRunnable1 = null;

	private static String dnsreq = null;

	public static String dns = null;

	private static String urlreq = null;

	private static DataInputStream urlstream = null;

	private static String savereq = null;

	private static byte[] savebuf = null;

	public static String midi = null;

	private static String aString32 = null;

	public static boolean reporterror = true;

	public static String errorname = "";

	public static void startpriv( InetAddress arg0) {
		anInt1060 = (int) (Math.random() * 9.9999999E7D);
		if (active) {
			try {
				Thread.sleep(500L);
			} catch ( Exception local10) {
			}
			active = false;
		}
		socketreq = 0;
		aRunnable1 = null;
		dnsreq = null;
		savereq = null;
		urlreq = null;
		socketip = arg0;
		Thread local31 = new Thread(new signlink());
		local31.setDaemon(true);
		local31.start();
		while (!active) {
			try {
				Thread.sleep(50L);
			} catch ( Exception local41) {
			}
		}
	}

	private static String findcachedir() {
		String[] local58 = new String[] { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "", "c:/rscache", "/rscache" };
		if (anInt1059 < 32 || anInt1059 > 34) {
			anInt1059 = 32;
		}
		String local74 = ".file_store_" + anInt1059;
		for ( int local76 = 0; local76 < local58.length; local76++) {
			try {
				String local81 = local58[local76];
				File local89;
				if (local81.length() > 0) {
					local89 = new File(local81);
					if (!local89.exists()) {
						continue;
					}
				}
				local89 = new File(local81 + local74);
				if (local89.exists() || local89.mkdir()) {
					return local81 + local74 + "/";
				}
			} catch ( Exception local124) {
			}
		}
		return null;
	}

	private static int getuid( String arg0) {
		try {
			File local11 = new File(arg0 + "uid.dat");
			if (!local11.exists() || local11.length() < 4L) {
				DataOutputStream local34 = new DataOutputStream(new FileOutputStream(arg0 + "uid.dat"));
				local34.writeInt((int) (Math.random() * 9.9999999E7D));
				local34.close();
			}
		} catch ( Exception local44) {
		}
		try {
			DataInputStream local59 = new DataInputStream(new FileInputStream(arg0 + "uid.dat"));
			int local62 = local59.readInt();
			local59.close();
			return local62 + 1;
		} catch ( Exception local69) {
			return 0;
		}
	}

	public static synchronized Socket opensocket( int arg0) throws IOException {
		socketreq = arg0;
		while (socketreq != 0) {
			try {
				Thread.sleep(50L);
			} catch ( Exception local6) {
			}
		}
		if (socket == null) {
			throw new IOException("could not open socket");
		}
		return socket;
	}

	public static synchronized DataInputStream openurl( String arg0) throws IOException {
		urlreq = arg0;
		while (urlreq != null) {
			try {
				Thread.sleep(50L);
			} catch ( Exception local6) {
			}
		}
		if (urlstream == null) {
			throw new IOException("could not open: " + arg0);
		}
		return urlstream;
	}

	public static synchronized void dnslookup( String arg0) {
		dns = arg0;
		dnsreq = arg0;
	}

	public static synchronized void startthread( Runnable arg0, int arg1) {
		threadreqpri = arg1;
		aRunnable1 = arg0;
	}

	public static synchronized boolean wavesave( byte[] arg0, int arg1) {
		if (arg1 > 2000000) {
			return false;
		} else if (savereq == null) {
			anInt1065 = (anInt1065 + 1) % 5;
			anInt1061 = arg1;
			savebuf = arg0;
			aBoolean269 = true;
			savereq = "sound" + anInt1065 + ".wav";
			return true;
		} else {
			return false;
		}
	}

	public static synchronized boolean wavereplay() {
		if (savereq == null) {
			savebuf = null;
			aBoolean269 = true;
			savereq = "sound" + anInt1065 + ".wav";
			return true;
		} else {
			return false;
		}
	}

	public static synchronized void midisave( byte[] arg0, int arg1) {
		if (arg1 > 2000000 || savereq != null) {
			return;
		}
		anInt1062 = (anInt1062 + 1) % 5;
		anInt1061 = arg1;
		savebuf = arg0;
		aBoolean268 = true;
		savereq = "jingle" + anInt1062 + ".mid";
	}

	public static void reporterror( String arg0) {
		if (!reporterror || !active) {
			return;
		}
		System.out.println("Error: " + arg0);
		try {
			String local19 = arg0.replace(':', '_');
			String local24 = local19.replace('@', '_');
			String local29 = local24.replace('&', '_');
			String local34 = local29.replace('#', '_');
			DataInputStream local51 = openurl("reporterror" + 377 + ".cgi?error=" + errorname + " " + local34);
			local51.readLine();
			local51.close();
		} catch ( IOException local58) {
		}
	}

	private signlink() {
	}

	@Override
	public void run() {
		active = true;
		String local3 = findcachedir();
		anInt1058 = getuid(local3);
		try {
			File local18 = new File(local3 + "main_file_cache.dat");
			if (local18.exists() && local18.length() > 52428800L) {
				local18.delete();
			}
			aRandomAccessFile3 = new RandomAccessFile(local3 + "main_file_cache.dat", "rw");
			for ( int local44 = 0; local44 < 5; local44++) {
				aRandomAccessFileArray1[local44] = new RandomAccessFile(local3 + "main_file_cache.idx" + local44, "rw");
			}
		} catch ( Exception local68) {
			local68.printStackTrace();
		}
		int local72 = anInt1060;
		while (anInt1060 == local72) {
			if (socketreq != 0) {
				try {
					socket = new Socket(socketip, socketreq);
				} catch ( Exception local83) {
					socket = null;
				}
				socketreq = 0;
			} else if (aRunnable1 != null) {
				Thread local95 = new Thread(aRunnable1);
				local95.setDaemon(true);
				local95.start();
				local95.setPriority(threadreqpri);
				aRunnable1 = null;
			} else if (dnsreq != null) {
				try {
					dns = InetAddress.getByName(dnsreq).getHostName();
				} catch ( Exception local114) {
					dns = "unknown";
				}
				dnsreq = null;
			} else if (savereq != null) {
				if (savebuf != null) {
					try {
						FileOutputStream local135 = new FileOutputStream(local3 + savereq);
						local135.write(savebuf, 0, anInt1061);
						local135.close();
					} catch ( Exception local144) {
					}
				}
				if (aBoolean269) {
					aString32 = local3 + savereq;
					aBoolean269 = false;
				}
				if (aBoolean268) {
					midi = local3 + savereq;
					aBoolean268 = false;
				}
				savereq = null;
			} else if (urlreq != null) {
				try {
					urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
				} catch ( Exception local189) {
					urlstream = null;
				}
				urlreq = null;
			}
			try {
				Thread.sleep(50L);
			} catch ( Exception local197) {
			}
		}
	}
}
