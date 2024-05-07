package unmapped;


import jagex2.datastruct.Hashable;
import sign.signlink;

public class Class10_Sub1_Sub2 extends Hashable {

	private static byte aByte42 = 3;

	public Class41[] aClass41Array10;

	private boolean aBoolean194 = true;

	public int anInt713 = 1000;

	public void method536( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Class10_Sub1_Sub2_Sub4 local3 = this.method537(aByte42);
		if (local3 != null) {
			this.anInt713 = local3.anInt713;
			local3.method536(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	protected Class10_Sub1_Sub2_Sub4 method537( byte arg0) {
		try {
			if (arg0 != 3) {
				this.aBoolean194 = !this.aBoolean194;
			}
			return null;
		} catch ( RuntimeException local13) {
			signlink.reporterror("78559, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
