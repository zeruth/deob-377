



import sign.signlink;

public final class Class7 implements Runnable {

	public int anInt54;

	public boolean aBoolean12 = true;

	public int[] anIntArray11 = new int[500];

	public Object anObject1 = new Object();

	private int anInt53 = 8;

	public int[] anIntArray12 = new int[500];

	private client aClient1;

	public Class7( client arg0, byte arg1) {
		try {
			this.aClient1 = arg0;
		} catch ( RuntimeException local31) {
			signlink.reporterror("69281, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void run() {
		while (this.aBoolean12) {
			Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt54 < 500) {
					this.anIntArray12[this.anInt54] = this.aClient1.anInt816;
					this.anIntArray11[this.anInt54] = this.aClient1.anInt817;
					this.anInt54++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch ( Exception local42) {
			}
		}
	}
}
