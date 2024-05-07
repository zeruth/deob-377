package jagex2.config;


import jagex2.io.JagFile;
import jagex2.graphics.Model;
import jagex2.io.Packet;

public final class IdkType {

	public static int count;

	public static IdkType[] instances;

	private int[] models;

	public int type = -1;

	private int[] recol_s = new int[6];

	private int[] recol_d = new int[6];

	private int[] heads = new int[] { -1, -1, -1, -1, -1 };

	public boolean disable = false;

	public static void unpack(JagFile arg0) {
		Packet dat = new Packet(arg0.read("idk.dat", null));
		count = dat.g2();
		if (instances == null) {
			instances = new IdkType[count];
		}
		for (int local18 = 0; local18 < count; local18++) {
			if (instances[local18] == null) {
				instances[local18] = new IdkType();
			}
			instances[local18].decode(dat);
		}
	}

	private IdkType() {
	}

	private void decode(Packet arg1) {
		while (true) {
			int code = arg1.g1();
			if (code == 0) {
				return;
			}
			if (code == 1) {
				this.type = arg1.g1();
			} else if (code == 2) {
				int local33 = arg1.g1();
				this.models = new int[local33];
				for ( int local39 = 0; local39 < local33; local39++) {
					this.models[local39] = arg1.g2();
				}
			} else if (code == 3) {
				this.disable = true;
			} else if (code >= 40 && code < 50) {
				this.recol_s[code - 40] = arg1.g2();
			} else if (code >= 50 && code < 60) {
				this.recol_d[code - 50] = arg1.g2();
			} else if (code >= 60 && code < 70) {
				this.heads[code - 60] = arg1.g2();
			} else {
				System.out.println("Error unrecognised config code: " + code);
			}
		}
	}

	public boolean method548( int arg0) {
		if (this.models == null) {
			return true;
		}
		boolean local6 = true;
		boolean local10 = false;
		for (int local12 = 0; local12 < this.models.length; local12++) {
			if (!Model.method272(this.models[local12])) {
				local6 = false;
			}
		}
		return local6;
	}

	public Model getModel() {
		if (this.models == null) {
			return null;
		}
		Model[] models = new Model[this.models.length];
		for (int i = 0; i < this.models.length; i++) {
			models[i] = Model.createModel(this.models[i]);
		}
		Model model;
		if (models.length == 1) {
			model = models[0];
		} else {
			model = new Model(models.length, models);
		}
		for (int local49 = 0; local49 < 6 && this.recol_s[local49] != 0; local49++) {
			model.recolor(this.recol_s[local49], this.recol_d[local49]);
		}
		return model;
	}

	public boolean method550() {
		boolean local8 = true;
		for ( int i = 0; i < 5; i++) {
			if (this.heads[i] != -1 && !Model.method272(this.heads[i])) {
				local8 = false;
			}
		}
		return local8;
	}

	public Model getHeadModel() {
		Model[] models = new Model[5];
		int count = 0;
		for ( int i = 0; i < 5; i++) {
			if (this.heads[i] != -1) {
				models[count++] = Model.createModel(this.heads[i]);
			}
		}
		Model model = new Model(count, models);
		for (int i = 0; i < 6 && this.recol_s[i] != 0; i++) {
			model.recolor(this.recol_s[i], this.recol_d[i]);
		}
		return model;
	}
}
