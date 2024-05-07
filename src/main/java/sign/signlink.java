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
   public static int anInt1063;
   public static int anInt1066;
   private static int threadreqpri = 1;
   public static boolean aBoolean268;
   public static int storeId = 32;
   public static String dns = null;
   private static String urlreq = null;
   private static int socketreq;
   public static String errorname = "";
   private static String savereq = null;
   private static boolean active;
   public static boolean reporterror = true;
   public static Applet mainapp = null;
   private static int anInt1060;
   public static int anInt1064;
   private static byte[] savebuf = null;
   private static Runnable aRunnable1 = null;
   private static String dnsreq = null;
   public static RandomAccessFile aRandomAccessFile3 = null;
   public static boolean sunjava;
   private static int anInt1062;
   private static int anInt1065;
   public static String midi = null;
   private static DataInputStream urlstream = null;
   private static boolean aBoolean269;
   private static Socket socket = null;
   public static RandomAccessFile[] aRandomAccessFileArray1 = new RandomAccessFile[5];
   private static int anInt1061;
   private static InetAddress socketip;
   private static String aString32 = null;
   public static int anInt1058;

   private signlink() {
   }

   public void run() {
      active = true;
      String var1 = findcachedir();
      anInt1058 = getuid(var1);

      try {
         File var2 = new File(var1 + "main_file_cache.dat");
         if (var2.exists() && var2.length() > 52428800L) {
            var2.delete();
         }

         aRandomAccessFile3 = new RandomAccessFile(var1 + "main_file_cache.dat", "rw");

         for(int var3 = 0; var3 < 5; ++var3) {
            aRandomAccessFileArray1[var3] = new RandomAccessFile(var1 + "main_file_cache.idx" + var3, "rw");
         }
      } catch (Exception var11) {
         var11.printStackTrace();
      }

      int var4 = anInt1060;

      while(anInt1060 == var4) {
         if (socketreq != 0) {
            try {
               socket = new Socket(socketip, socketreq);
            } catch (Exception var6) {
               socket = null;
            }

            socketreq = 0;
         } else if (aRunnable1 != null) {
            Thread var5 = new Thread(aRunnable1);
            var5.setDaemon(true);
            var5.start();
            var5.setPriority(threadreqpri);
            aRunnable1 = null;
         } else if (dnsreq != null) {
            try {
               dns = InetAddress.getByName(dnsreq).getHostName();
            } catch (Exception var10) {
               dns = "unknown";
            }

            dnsreq = null;
         } else if (savereq != null) {
            if (savebuf != null) {
               try {
                  FileOutputStream var12 = new FileOutputStream(var1 + savereq);
                  var12.write(savebuf, 0, anInt1061);
                  var12.close();
               } catch (Exception var9) {
               }
            }

            if (aBoolean269) {
               aString32 = var1 + savereq;
               aBoolean269 = false;
            }

            if (aBoolean268) {
               midi = var1 + savereq;
               aBoolean268 = false;
            }

            savereq = null;
         } else if (urlreq != null) {
            try {
               urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
            } catch (Exception var8) {
               urlstream = null;
            }

            urlreq = null;
         }

         try {
            Thread.sleep(50L);
         } catch (Exception var7) {
         }
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

   public static synchronized boolean wavesave(byte[] var0, int var1) {
      if (var1 > 2000000) {
         return false;
      } else if (savereq == null) {
         anInt1065 = (anInt1065 + 1) % 5;
         anInt1061 = var1;
         savebuf = var0;
         aBoolean269 = true;
         savereq = "sound" + anInt1065 + ".wav";
         return true;
      } else {
         return false;
      }
   }

   private static String findcachedir() {
      String[] var0 = new String[]{"c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "", "c:/rscache", "/rscache"};
      if (storeId < 32 || storeId > 34) {
         storeId = 32;
      }

      String var1 = ".file_store_" + storeId;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         try {
            String var3 = var0[var2];
            File var4;
            if (var3.length() > 0) {
               var4 = new File(var3);
               if (!var4.exists()) {
                  continue;
               }
            }

            var4 = new File(var3 + var1);
            if (var4.exists() || var4.mkdir()) {
               return var3 + var1 + "/";
            }
         } catch (Exception var5) {
         }
      }

      return null;
   }

   public static synchronized Socket opensocket(int var0) throws IOException {
      socketreq = var0;

      while(socketreq != 0) {
         try {
            Thread.sleep(50L);
         } catch (Exception var2) {
         }
      }

      if (socket == null) {
         throw new IOException("could not open socket");
      } else {
         return socket;
      }
   }

   public static synchronized void startthread(Runnable var0, int var1) {
      threadreqpri = var1;
      aRunnable1 = var0;
   }

   public static synchronized DataInputStream openurl(String var0) throws IOException {
      urlreq = var0;

      while(urlreq != null) {
         try {
            Thread.sleep(50L);
         } catch (Exception var2) {
         }
      }

      if (urlstream == null) {
         throw new IOException("could not open: " + var0);
      } else {
         return urlstream;
      }
   }

   public static synchronized void midisave(byte[] var0, int var1) {
      if (var1 <= 2000000 && savereq == null) {
         anInt1062 = (anInt1062 + 1) % 5;
         anInt1061 = var1;
         savebuf = var0;
         aBoolean268 = true;
         savereq = "jingle" + anInt1062 + ".mid";
      }
   }

   public static void reporterror(String var0) {
      if (reporterror && active) {
         System.out.println("Error: " + var0);

         try {
            String var1 = var0.replace(':', '_');
            String var2 = var1.replace('@', '_');
            String var3 = var2.replace('&', '_');
            String var4 = var3.replace('#', '_');
            DataInputStream var5 = openurl("reporterror377.cgi?error=" + errorname + " " + var4);
            var5.readLine();
            var5.close();
         } catch (IOException var6) {
         }

      }
   }

   private static int getuid(String var0) {
      try {
         File var1 = new File(var0 + "uid.dat");
         if (!var1.exists() || var1.length() < 4L) {
            DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var0 + "uid.dat"));
            var2.writeInt((int)(Math.random() * 9.9999999E7));
            var2.close();
         }
      } catch (Exception var5) {
      }

      try {
         DataInputStream var6 = new DataInputStream(new FileInputStream(var0 + "uid.dat"));
         int var3 = var6.readInt();
         var6.close();
         return var3 + 1;
      } catch (Exception var4) {
         return 0;
      }
   }

   public static void startpriv(InetAddress var0) {
      anInt1060 = (int)(Math.random() * 9.9999999E7);
      if (active) {
         try {
            Thread.sleep(500L);
         } catch (Exception var4) {
         }

         active = false;
      }

      socketreq = 0;
      aRunnable1 = null;
      dnsreq = null;
      savereq = null;
      urlreq = null;
      socketip = var0;
      Thread var1 = new Thread(new signlink());
      var1.setDaemon(true);
      var1.start();

      while(!active) {
         try {
            Thread.sleep(50L);
         } catch (Exception var3) {
         }
      }

   }

   public static synchronized void dnslookup(String var0) {
      dns = var0;
      dnsreq = var0;
   }
}
