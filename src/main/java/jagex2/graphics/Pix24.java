package jagex2.graphics;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;


import sign.signlink;
import unmapped.Class10_Sub1_Sub1_Sub3;
import unmapped.Packet;
import jagex2.io.JagFile;

public final class Pix24 extends Draw2D {

	private boolean aBoolean27 = true;

	private byte aByte8 = 5;

	private int anInt99 = -3539;

	private int anInt100 = -766;

	private int anInt101 = -766;

	private int anInt102 = 1;

	private boolean aBoolean28 = true;

	private boolean aBoolean29 = false;

	private boolean aBoolean30 = false;

	private int anInt103 = 3600;

	public int[] pixels;

	public int cropW;

	public int width;

	public int cropH;

	public int height;

	private int cropY;

	private int cropX;

	public Pix24(int width, int height) {
		this.pixels = new int[width * height];
		this.width = this.cropW = width;
		this.height = this.cropH = height;
		this.cropX = this.cropY = 0;
	}

	public Pix24(byte[] src, Component component) {
		try {
			Image image = Toolkit.getDefaultToolkit().createImage(src);
			MediaTracker tracket = new MediaTracker(component);
			tracket.addImage(image, 0);
			tracket.waitForAll();
			this.width = image.getWidth(component);
			this.height = image.getHeight(component);
			this.cropW = this.width;
			this.cropH = this.height;
			this.cropX = 0;
			this.cropY = 0;
			this.pixels = new int[this.width * this.height];
			PixelGrabber grabber = new PixelGrabber(image, 0, 0, this.width, this.height, this.pixels, 0, this.width);
			grabber.grabPixels();
		} catch ( Exception local105) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix24(JagFile jag, String name, int index) {
		Packet dat = new Packet(jag.read(name + ".dat", null));
		Packet idx = new Packet(jag.read("index.dat", null));

		idx.pos = dat.readShort();
		this.cropW = idx.readShort();
		this.cropH = idx.readShort();
		int paletteCount = idx.readByte();

		int[] palette = new int[paletteCount];
		for ( int i = 0; i < paletteCount - 1; i++) {
			palette[i + 1] = idx.readInt24();
			if (palette[i + 1] == 0) {
				palette[i + 1] = 1;
			}
		}
		for ( int i = 0; i < index; i++) {
			idx.pos += 2;
			dat.pos += idx.readShort() * idx.readShort();
			idx.pos++;
		}
		this.cropX = idx.readByte();
		this.cropY = idx.readByte();
		this.width = idx.readShort();
		this.height = idx.readShort();
		int pixelOrder = idx.readByte();
		int len = this.width * this.height;
		this.pixels = new int[len];

		if (pixelOrder == 0) {
			for (int i = 0; i < len; i++) {
				this.pixels[i] = palette[dat.readByte()];
			}
		} else if (pixelOrder == 1) {
			for (int x = 0; x < this.width; x++) {
				for (int y = 0; y < this.height; y++) {
					this.pixels[x + y * this.width] = palette[dat.readByte()];
				}
			}
		}
	}

	public void bind() {
		Draw2D.bind(this.width, this.height, this.pixels);
	}

	public void translate(int b, int g, int r) {
		for (int i = 0; i < this.pixels.length; i++) {
			int rgb = this.pixels[i];
			if (rgb != 0) {
				int red = rgb >> 16 & 0xFF;
				red += r;
				if (red < 1) {
					red = 1;
				} else if (red > 255) {
					red = 255;
				}
				int green = rgb >> 8 & 0xFF;
				green += g;
				if (green < 1) {
					green = 1;
				} else if (green > 255) {
					green = 255;
				}
				int blue = rgb & 0xFF;
				blue += b;
				if (blue < 1) {
					blue = 1;
				} else if (blue > 255) {
					blue = 255;
				}
				this.pixels[i] = (red << 16) + (green << 8) + blue;
			}
		}
	}

	public void method75() {
		int[] local8 = new int[this.cropW * this.cropH];
		for (int local10 = 0; local10 < this.height; local10++) {
			for (int local14 = 0; local14 < this.width; local14++) {
				local8[(local10 + this.cropY) * this.cropW + local14 + this.cropX] = this.pixels[local10 * this.width + local14];
			}
		}
		this.pixels = local8;
		this.width = this.cropW;
		this.height = this.cropH;
		this.cropX = 0;
		this.cropY = 0;
	}

	public void method76( int arg0, int arg1) {
		try {
			arg1 += this.cropX;
			arg0 += this.cropY;
			int local15 = arg1 + arg0 * Draw2D.width2d;
			int local17 = 0;
			int local20 = this.height;
			int local23 = this.width;
			int local27 = Draw2D.width2d - local23;
			int local29 = 0;
			int local36;
			if (arg0 < Draw2D.top) {
				local36 = Draw2D.top - arg0;
				local20 -= local36;
				arg0 = Draw2D.top;
				local17 = local36 * local23 + 0;
				local15 += local36 * Draw2D.width2d;
			}
			if (arg0 + local20 > Draw2D.bottom) {
				local20 -= arg0 + local20 - Draw2D.bottom;
			}
			if (arg1 < Draw2D.left) {
				local36 = Draw2D.left - arg1;
				local23 -= local36;
				arg1 = Draw2D.left;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Draw2D.right) {
				local36 = arg1 + local23 - Draw2D.right;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method77(local23, local27, local20, this.pixels, local17, local29, local15, Draw2D.data);
			}
		} catch ( RuntimeException local148) {
			signlink.reporterror("71094, " + arg0 + ", " + -192 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	private void method77( int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7) {
		try {
			int local6 = -(arg0 >> 2);
			int local17 = -(arg0 & 0x3);
			for ( int local20 = -arg2; local20 < 0; local20++) {
				for ( int local24 = local6; local24 < 0; local24++) {
					arg7[arg6++] = arg3[arg4++];
					arg7[arg6++] = arg3[arg4++];
					arg7[arg6++] = arg3[arg4++];
					arg7[arg6++] = arg3[arg4++];
				}
				for ( int local63 = local17; local63 < 0; local63++) {
					arg7[arg6++] = arg3[arg4++];
				}
				arg6 += arg1;
				arg4 += arg5;
			}
		} catch ( RuntimeException local89) {
			signlink.reporterror("73293, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -39 + ", " + arg7 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	public void method78( int arg0, int arg1) {
		try {
			arg1 += this.cropX;
			arg0 += this.cropY;
			int local18 = arg1 + arg0 * Draw2D.width2d;
			int local20 = 0;
			int local23 = this.height;
			int local26 = this.width;
			int local30 = Draw2D.width2d - local26;
			int local32 = 0;
			int local39;
			if (arg0 < Draw2D.top) {
				local39 = Draw2D.top - arg0;
				local23 -= local39;
				arg0 = Draw2D.top;
				local20 = local39 * local26 + 0;
				local18 += local39 * Draw2D.width2d;
			}
			if (arg0 + local23 > Draw2D.bottom) {
				local23 -= arg0 + local23 - Draw2D.bottom;
			}
			if (arg1 < Draw2D.left) {
				local39 = Draw2D.left - arg1;
				local26 -= local39;
				arg1 = Draw2D.left;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Draw2D.right) {
				local39 = arg1 + local26 - Draw2D.right;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method79(Draw2D.data, this.pixels, local20, local18, local26, local23, local30, local32);
			}
		} catch ( RuntimeException local141) {
			signlink.reporterror("82148, " + arg0 + ", " + arg1 + ", " + -488 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	private void method79( int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int local6 = -(arg4 >> 2);
		int local11 = -(arg4 & 0x3);
		for ( int local14 = -arg5; local14 < 0; local14++) {
			int local25;
			for ( int local18 = local6; local18 < 0; local18++) {
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
			}
			for ( int local85 = local11; local85 < 0; local85++) {
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	public void method80( int arg0, int arg1) {
		try {
			arg0 += this.cropX;
			arg1 += this.cropY;
			int local15 = arg0 + arg1 * Draw2D.width2d;
			int local17 = 0;
			int local23 = this.height;
			int local26 = this.width;
			int local30 = Draw2D.width2d - local26;
			int local32 = 0;
			int local39;
			if (arg1 < Draw2D.top) {
				local39 = Draw2D.top - arg1;
				local23 -= local39;
				arg1 = Draw2D.top;
				local17 = local39 * local26 + 0;
				local15 += local39 * Draw2D.width2d;
			}
			if (arg1 + local23 > Draw2D.bottom) {
				local23 -= arg1 + local23 - Draw2D.bottom;
			}
			if (arg0 < Draw2D.left) {
				local39 = Draw2D.left - arg0;
				local26 -= local39;
				arg0 = Draw2D.left;
				local17 += local39;
				local15 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Draw2D.right) {
				local39 = arg0 + local26 - Draw2D.right;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method81(local26, local32, 0, local30, local17, this.anInt100, local15, local23, Draw2D.data, this.pixels);
			}
		} catch ( RuntimeException local144) {
			signlink.reporterror("57053, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 128 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	private void method81( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		try {
			for ( int local8 = -arg7; local8 < 0; local8++) {
				for ( int local13 = -arg0; local13 < 0; local13++) {
					int local20 = arg9[arg4++];
					if (local20 == 0) {
						arg6++;
					} else {
						int local26 = arg8[arg6];
						arg8[arg6++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg6 += arg3;
				arg4 += arg1;
			}
			if (arg5 >= 0) {
				this.aBoolean27 = !this.aBoolean27;
			}
		} catch ( RuntimeException local88) {
			signlink.reporterror("92686, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 128 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	public void method82( int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
		try {
			boolean local5 = false;
			try {
				int local10 = -arg4 / 2;
				int local15 = -arg2 / 2;
				int local24 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
				int local33 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
				int local39 = local24 * arg8 >> 8;
				int local45 = local33 * arg8 >> 8;
				int local57 = (arg3 << 16) + local15 * local39 + local10 * local45;
				int local69 = (arg10 << 16) + (local15 * local45 - local10 * local39);
				int local75 = arg6 + arg0 * Draw2D.width2d;
				for ( int local77 = 0; local77 < arg2; local77++) {
					int local83 = arg9[local77];
					int local87 = local75 + local83;
					int local93 = local57 + local45 * local83;
					int local99 = local69 - local39 * local83;
					for ( int local104 = -arg5[local77]; local104 < 0; local104++) {
						Draw2D.data[local87++] = this.pixels[(local93 >> 16) + (local99 >> 16) * this.width];
						local93 += local45;
						local99 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Draw2D.width2d;
				}
			} catch ( Exception local152) {
			}
		} catch ( RuntimeException local154) {
			signlink.reporterror("77040, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	public void method83( int arg0, int arg1, double arg2, int arg3) {
		try {
			if (arg1 == -30658) {
				try {
					int local21 = (int) (Math.sin(arg2) * 65536.0D);
					int local27 = (int) (Math.cos(arg2) * 65536.0D);
					int local33 = local21 * 256 >> 8;
					int local39 = local27 * 256 >> 8;
					int local51 = local33 * -10 + local39 * -10 + 983040;
					int local63 = local39 * -10 + 983040 - local33 * -10;
					int local69 = arg0 + arg3 * Draw2D.width2d;
					for ( int local71 = 0; local71 < 20; local71++) {
						int local75 = local69;
						int local77 = local51;
						int local79 = local63;
						for ( int local82 = -20; local82 < 0; local82++) {
							int local98 = this.pixels[(local77 >> 16) + (local79 >> 16) * this.width];
							if (local98 == 0) {
								local75++;
							} else {
								Draw2D.data[local75++] = local98;
							}
							local77 += local39;
							local79 -= local33;
						}
						local51 += local33;
						local63 += local39;
						local69 += Draw2D.width2d;
					}
				} catch ( Exception local137) {
				}
			}
		} catch ( RuntimeException local139) {
			signlink.reporterror("73715, " + 256 + ", " + 15 + ", " + arg0 + ", " + 15 + ", " + 20 + ", " + arg1 + ", " + 20 + ", " + arg2 + ", " + arg3 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	public void method84(Class10_Sub1_Sub1_Sub3 arg0, int arg1, int arg2) {
		try {
			arg2 += this.cropX;
			arg1 += this.cropY;
			int local19 = arg2 + arg1 * Draw2D.width2d;
			int local21 = 0;
			int local24 = this.height;
			int local27 = this.width;
			int local31 = Draw2D.width2d - local27;
			int local33 = 0;
			int local40;
			if (arg1 < Draw2D.top) {
				local40 = Draw2D.top - arg1;
				local24 -= local40;
				arg1 = Draw2D.top;
				local21 = local40 * local27 + 0;
				local19 += local40 * Draw2D.width2d;
			}
			if (arg1 + local24 > Draw2D.bottom) {
				local24 -= arg1 + local24 - Draw2D.bottom;
			}
			if (arg2 < Draw2D.left) {
				local40 = Draw2D.left - arg2;
				local27 -= local40;
				arg2 = Draw2D.left;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg2 + local27 > Draw2D.right) {
				local40 = arg2 + local27 - Draw2D.right;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method85(local19, local31, this.pixels, local27, Draw2D.data, arg0.aByteArray16, local24, local21, 0, local33);
			}
		} catch ( RuntimeException local145) {
			signlink.reporterror("61194, " + arg0 + ", " + arg1 + ", " + -49993 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	private void method85( int arg0, int arg1, int[] arg2, int arg3, int[] arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int local6 = -(arg3 >> 2);
			int local22 = -(arg3 & 0x3);
			for ( int local25 = -arg6; local25 < 0; local25++) {
				int local36;
				for ( int local29 = local6; local29 < 0; local29++) {
					local36 = arg2[arg7++];
					if (local36 != 0 && arg5[arg0] == 0) {
						arg4[arg0++] = local36;
					} else {
						arg0++;
					}
					local36 = arg2[arg7++];
					if (local36 != 0 && arg5[arg0] == 0) {
						arg4[arg0++] = local36;
					} else {
						arg0++;
					}
					local36 = arg2[arg7++];
					if (local36 != 0 && arg5[arg0] == 0) {
						arg4[arg0++] = local36;
					} else {
						arg0++;
					}
					local36 = arg2[arg7++];
					if (local36 != 0 && arg5[arg0] == 0) {
						arg4[arg0++] = local36;
					} else {
						arg0++;
					}
				}
				for ( int local112 = local22; local112 < 0; local112++) {
					local36 = arg2[arg7++];
					if (local36 != 0 && arg5[arg0] == 0) {
						arg4[arg0++] = local36;
					} else {
						arg0++;
					}
				}
				arg0 += arg1;
				arg7 += arg9;
			}
		} catch ( RuntimeException local149) {
			signlink.reporterror("75394, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 40303 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
