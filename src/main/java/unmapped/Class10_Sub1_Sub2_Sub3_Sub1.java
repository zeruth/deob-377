package unmapped;


import jagex2.dash3d.entity.PathingEntity;
import jagex2.graphics.Model;
import sign.signlink;

public final class Class10_Sub1_Sub2_Sub3_Sub1 extends PathingEntity {

	public Class38 aClass38_1;

	private boolean aBoolean131 = true;

	private Model method386() {
		try {
			int local14;
			if (super.anInt753 < 0 || super.anInt756 != 0) {
				local14 = -1;
				if (super.anInt719 >= 0) {
					local14 = Class15.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
				}
				return this.aClass38_1.method405(local14, -1, null);
			}
			local14 = Class15.aClass15Array1[super.anInt753].anIntArray47[super.anInt754];
			int local16 = -1;
			if (super.anInt719 >= 0 && super.anInt719 != super.anInt760) {
				local16 = Class15.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
			}
			return this.aClass38_1.method405(local14, local16, Class15.aClass15Array1[super.anInt753].anIntArray50);
		} catch ( RuntimeException local79) {
			signlink.reporterror("1452, " + 122 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@Override
	protected Model method537(byte arg0) {
		try {
			if (arg0 != 3) {
				throw new NullPointerException();
			}
			boolean local4 = false;
			if (this.aClass38_1 == null) {
				return null;
			}
			Model local19 = this.method386();
			if (local19 == null) {
				return null;
			}
			super.anInt723 = local19.anInt713;
			if (super.anInt743 != -1 && super.anInt744 != -1) {
				Class28 local40 = Class28.aClass28Array1[super.anInt743];
				Model local43 = local40.method352();
				if (local43 != null) {
					int local52 = local40.aClass15_1.anIntArray47[super.anInt744];
					Model local64 = new Model(false, false, true, local43, Class22.method169(this.aBoolean131, local52));
					local64.method284(0, 0, -super.anInt747);
					local64.method278();
					local64.method279(local52, (byte) 6);
					local64.anIntArrayArray11 = null;
					local64.anIntArrayArray10 = null;
					if (local40.anInt438 != 128 || local40.anInt439 != 128) {
						local64.method287(local40.anInt439, local40.anInt438, local40.anInt438);
					}
					local64.method288(local40.anInt441 + 64, local40.anInt442 + 850, -30, -50, -30, true);
					Model[] local127 = new Model[] { local19, local64 };
					local19 = new Model(2, true, 0, local127);
				}
			}
			if (this.aClass38_1.aByte31 == 1) {
				local19.aBoolean106 = true;
			}
			return local19;
		} catch ( RuntimeException local146) {
			signlink.reporterror("61004, " + arg0 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public boolean isVisible() {
		try {
			return this.aClass38_1 != null;
		} catch ( RuntimeException local13) {
			signlink.reporterror("81751, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
