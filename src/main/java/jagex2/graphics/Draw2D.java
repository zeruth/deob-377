package jagex2.graphics;


import unmapped.Class10_Sub1;

public class Draw2D extends Class10_Sub1 {

	private static int anInt672;

	private static boolean aBoolean172;

	public static int[] data;

	public static int width2d;

	public static int height2d;

	public static int top;

	public static int bottom;

	public static int left;

	public static int right;

	public static int boundX;

	public static int centerX2d;

	public static int anInt682;

	private static boolean aBoolean173 = true;

	private static int anInt673 = -291;

	public static void bind(int width, int height, int[] src) {
		data = src;
		width2d = width;
		height2d = height;
		setBounds(0, 0, height, width);
	}

	public static void resetBounds() {
		left = 0;
		top = 0;
		right = width2d;
		bottom = height2d;
		boundX = right - 1;
		centerX2d = right / 2;
	}

	public static void setBounds(int top, int left, int bottom, int right) {
		if (left < 0) {
			left = 0;
		}
		if (top < 0) {
			top = 0;
		}
		if (right > width2d) {
			right = width2d;
		}
		if (bottom > height2d) {
			bottom = height2d;
		}
		Draw2D.left = left;
		Draw2D.top = top;
		Draw2D.right = right;
		Draw2D.bottom = bottom;
		boundX = Draw2D.right - 1;
		centerX2d = Draw2D.right / 2;
		anInt682 = Draw2D.bottom / 2;
	}

	public static void clear() {
		int len = width2d * height2d;
		for ( int idx = 0; idx < len; idx++) {
			data[idx] = 0;
		}
	}

	public static void fillRectAlpha(int alpha, int y, int width, int height, int rgb, int x) {
		if (x < left) {
			width -= left - x;
			x = left;
		}
		if (y < top) {
			height -= top - y;
			y = top;
		}
		if (x + width > right) {
			width = right - x;
		}
		if (y + height > bottom) {
			height = bottom - y;
		}
		int whiteOffset = 256 - rgb;
		int r = (alpha >> 16 & 0xFF) * rgb;
		int g = (alpha >> 8 & 0xFF) * rgb;
		int b = (alpha & 0xFF) * rgb;
		int step = width2d - width;
		int offset = x + y * width2d;
		for ( int y1 = 0; y1 < height; y1++) {
			for ( int x2 = -width; x2 < 0; x2++) {
				int r1 = (data[offset] >> 16 & 0xFF) * whiteOffset;
				int g1 = (data[offset] >> 8 & 0xFF) * whiteOffset;
				int b1 = (data[offset] & 0xFF) * whiteOffset;
				int color = (r + r1 >> 8 << 16) + (g + g1 >> 8 << 8) + (b + b1 >> 8);
				data[offset++] = color;
			}
			offset += step;
		}
	}

	public static void fillRect(int height, int y, int rgb, int width, int x) {
		if (x < left) {
			width -= left - x;
			x = left;
		}
		if (y < top) {
			height -= top - y;
			y = top;
		}
		if (x + width > right) {
			width = right - x;
		}
		if (y + height > bottom) {
			height = bottom - y;
		}
		int step = width2d - width;
		int offset = x + y * width2d;
		for ( int y1 = -height; y1 < 0; y1++) {
			for ( int x1 = -width; x1 < 0; x1++) {
				data[offset++] = rgb;
			}
			offset += step;
		}
	}

	public static void drawRect(int y, int height, int rgb, int x, int width) {
		drawHorizontalLine(x, rgb, y, width);
		drawHorizontalLine(x, rgb, y + height - 1, width);
		drawVerticalLine(x, rgb, height, y);
		drawVerticalLine(x + width - 1, rgb, height, y);
	}

	public static void method501( int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method503(arg4, arg0, arg1, arg5, arg2);
		method503(arg4 + arg3 - 1, arg0, arg1, arg5, arg2);
		if (arg3 >= 3) {
			method505(arg4 + 1, arg0, arg2, arg3 - 2, arg5);
			method505(arg4 + 1, arg0 + arg1 - 1, arg2, arg3 - 2, arg5);
		}
	}

	public static void drawHorizontalLine(int x, int rgb, int y, int width) {
		if (y >= top && y < bottom) {
			if (x < left) {
				width -= left - x;
				x = left;
			}
			if (x + width > right) {
				width = right - x;
			}
			int offset = x + y * width2d;
			for ( int idx = 0; idx < width; idx++) {
				data[offset + idx] = rgb;
			}
		}
	}

	private static void method503( int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= top && arg0 < bottom) {
			if (arg1 < left) {
				arg2 -= left - arg1;
				arg1 = left;
			}
			if (arg1 + arg2 > right) {
				arg2 = right - arg1;
			}
			int local30 = 256 - arg3;
			int local38 = (arg4 >> 16 & 0xFF) * arg3;
			int local46 = (arg4 >> 8 & 0xFF) * arg3;
			int local52 = (arg4 & 0xFF) * arg3;
			int local58 = arg1 + arg0 * width2d;
			for ( int local60 = 0; local60 < arg2; local60++) {
				int local72 = (data[local58] >> 16 & 0xFF) * local30;
				int local82 = (data[local58] >> 8 & 0xFF) * local30;
				int local90 = (data[local58] & 0xFF) * local30;
				int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
				data[local58++] = local112;
			}
		}
	}

	public static void drawVerticalLine(int x, int rgb, int height, int y) {
		if (x >= left && x < right) {
			if (y < top) {
				height -= top - y;
				y = top;
			}
			if (y + height > bottom) {
				height = bottom - y;
			}
			int offset = x + y * width2d;
			for ( int idx = 0; idx < height; idx++) {
				data[offset + idx * width2d] = rgb;
			}
		}
	}

	private static void method505( int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= left && arg1 < right) {
			if (arg0 < top) {
				arg3 -= top - arg0;
				arg0 = top;
			}
			if (arg0 + arg3 > bottom) {
				arg3 = bottom - arg0;
			}
			int local32 = 256 - arg4;
			int local40 = (arg2 >> 16 & 0xFF) * arg4;
			int local48 = (arg2 >> 8 & 0xFF) * arg4;
			int local54 = (arg2 & 0xFF) * arg4;
			int local69 = arg1 + arg0 * width2d;
			for ( int local71 = 0; local71 < arg3; local71++) {
				int local83 = (data[local69] >> 16 & 0xFF) * local32;
				int local93 = (data[local69] >> 8 & 0xFF) * local32;
				int local101 = (data[local69] & 0xFF) * local32;
				int local123 = (local40 + local83 >> 8 << 16) + (local48 + local93 >> 8 << 8) + (local54 + local101 >> 8);
				data[local69] = local123;
				local69 += width2d;
			}
		}
	}

	protected Draw2D() {
	}
}
