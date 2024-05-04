



import sign.signlink;

public final class Class8 {

	public static int anInt60;

	private static int anInt55 = (int) (Math.random() * 17.0D) - 8;

	private static final int[] anIntArray13 = new int[] { 0, -1, 0, 1 };

	public static int anInt56 = 99;

	private static byte aByte5 = -80;

	private static final int[] anIntArray19 = new int[] { 1, 2, 4, 8 };

	private static final int[] anIntArray20 = new int[] { 1, 0, -1, 0 };

	private static int anInt61 = (int) (Math.random() * 33.0D) - 16;

	private static final int[] anIntArray21 = new int[] { 16, 32, 64, 128 };

	public static boolean aBoolean15 = true;

	private byte aByte4 = 0;

	private boolean aBoolean13 = true;

	private byte aByte6 = 0;

	private boolean aBoolean14 = true;

	private int anInt59 = 20411;

	private int anInt62 = 69;

	private int anInt57;

	private int anInt58;

	private int[][][] anIntArrayArrayArray1;

	private byte[][][] aByteArrayArrayArray1;

	private byte[][][] aByteArrayArrayArray5;

	private byte[][][] aByteArrayArrayArray4;

	private byte[][][] aByteArrayArrayArray3;

	private byte[][][] aByteArrayArrayArray2;

	private int[][][] anIntArrayArrayArray2;

	private byte[][][] aByteArrayArrayArray6;

	private int[][] anIntArrayArray4;

	private int[] anIntArray14;

	private int[] anIntArray15;

	private int[] anIntArray16;

	private int[] anIntArray17;

	private int[] anIntArray18;

	private static int method11( int arg0, int arg1, int arg2) {
		int local3 = arg0 / arg2;
		int local9 = arg0 & arg2 - 1;
		int local13 = arg1 / arg2;
		int local19 = arg1 & arg2 - 1;
		int local23 = method26(local3, local13);
		int local29 = method26(local3 + 1, local13);
		int local35 = method26(local3, local13 + 1);
		int local43 = method26(local3 + 1, local13 + 1);
		int local49 = method24(local23, local29, local9, arg2);
		int local55 = method24(local35, local43, local9, arg2);
		return method24(local49, local55, local19, arg2);
	}

	public static void method13( int arg0, int arg1, int arg2, int arg3, Class47 arg4, int arg5, int arg6, int arg7, Class23 arg8, int[][][] arg9) {
		try {
			int local9 = arg9[arg1][arg6][arg3];
			int local19 = arg9[arg1][arg6 + 1][arg3];
			int local31 = arg9[arg1][arg6 + 1][arg3 + 1];
			int local41 = arg9[arg1][arg6][arg3 + 1];
			int local51 = local9 + local19 + local31 + local41 >> 2;
			Class48 local54 = Class48.method523(arg0);
			int local69 = arg6 + (arg3 << 7) + (arg0 << 14) + 1073741824;
			if (!local54.aBoolean180) {
				local69 += Integer.MIN_VALUE;
			}
			byte local83 = (byte) ((arg5 << 6) + arg2);
			Class10_Sub1_Sub2 local103;
			if (arg2 == 22) {
				if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
					local103 = local54.method531(22, arg5, local9, local19, local31, local41, -1);
				} else {
					local103 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 22, (byte) 3, arg0, true, local9, arg5);
				}
				arg8.method196(arg6, arg3, local83, local69, local51, arg7, local103);
				if (local54.aBoolean192 && local54.aBoolean180) {
					arg4.method483(arg3, arg6);
				}
			} else {
				int local199;
				if (arg2 == 10 || arg2 == 11) {
					if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
						local103 = local54.method531(10, arg5, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 10, (byte) 3, arg0, true, local9, arg5);
					}
					if (local103 != null) {
						int local186 = 0;
						if (arg2 == 11) {
							local186 += 256;
						}
						int local202;
						if (arg5 == 1 || arg5 == 3) {
							local199 = local54.anInt697;
							local202 = local54.anInt707;
						} else {
							local199 = local54.anInt707;
							local202 = local54.anInt697;
						}
						arg8.method200(arg7, local199, arg3, local103, local83, local186, arg6, local202, local51, local69);
					}
					if (local54.aBoolean192) {
						arg4.method482(arg3, arg5, local54.anInt697, local54.anInt707, local54.aBoolean191, arg6);
					}
				} else if (arg2 >= 12) {
					if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
						local103 = local54.method531(arg2, arg5, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, arg2, (byte) 3, arg0, true, local9, arg5);
					}
					arg8.method200(arg7, 1, arg3, local103, local83, 0, arg6, 1, local51, local69);
					if (local54.aBoolean192) {
						arg4.method482(arg3, arg5, local54.anInt697, local54.anInt707, local54.aBoolean191, arg6);
					}
				} else if (arg2 == 0) {
					if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
						local103 = local54.method531(0, arg5, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 0, (byte) 3, arg0, true, local9, arg5);
					}
					arg8.method198(local51, 0, anIntArray19[arg5], null, arg6, local69, local83, arg3, local103, arg7);
					if (local54.aBoolean192) {
						arg4.method481(arg5, local54.aBoolean191, arg2, arg6, arg3);
					}
				} else if (arg2 == 1) {
					if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
						local103 = local54.method531(1, arg5, local9, local19, local31, local41, -1);
					} else {
						local103 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 1, (byte) 3, arg0, true, local9, arg5);
					}
					arg8.method198(local51, 0, anIntArray21[arg5], null, arg6, local69, local83, arg3, local103, arg7);
					if (local54.aBoolean192) {
						arg4.method481(arg5, local54.aBoolean191, arg2, arg6, arg3);
					}
				} else {
					int local445;
					Class10_Sub1_Sub2 local474;
					if (arg2 == 2) {
						local445 = arg5 + 1 & 0x3;
						Class10_Sub1_Sub2 local464;
						if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
							local464 = local54.method531(2, arg5 + 4, local9, local19, local31, local41, -1);
							local474 = local54.method531(2, local445, local9, local19, local31, local41, -1);
						} else {
							local464 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 2, (byte) 3, arg0, true, local9, arg5 + 4);
							local474 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 2, (byte) 3, arg0, true, local9, local445);
						}
						arg8.method198(local51, anIntArray19[local445], anIntArray19[arg5], local474, arg6, local69, local83, arg3, local464, arg7);
						if (local54.aBoolean192) {
							arg4.method481(arg5, local54.aBoolean191, arg2, arg6, arg3);
						}
					} else if (arg2 == 3) {
						if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
							local103 = local54.method531(3, arg5, local9, local19, local31, local41, -1);
						} else {
							local103 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 3, (byte) 3, arg0, true, local9, arg5);
						}
						arg8.method198(local51, 0, anIntArray21[arg5], null, arg6, local69, local83, arg3, local103, arg7);
						if (local54.aBoolean192) {
							arg4.method481(arg5, local54.aBoolean191, arg2, arg6, arg3);
						}
					} else if (arg2 == 9) {
						if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
							local103 = local54.method531(arg2, arg5, local9, local19, local31, local41, -1);
						} else {
							local103 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, arg2, (byte) 3, arg0, true, local9, arg5);
						}
						arg8.method200(arg7, 1, arg3, local103, local83, 0, arg6, 1, local51, local69);
						if (local54.aBoolean192) {
							arg4.method482(arg3, arg5, local54.anInt697, local54.anInt707, local54.aBoolean191, arg6);
						}
					} else {
						if (local54.aBoolean182) {
							if (arg5 == 1) {
								local445 = local41;
								local41 = local31;
								local31 = local19;
								local19 = local9;
								local9 = local445;
							} else if (arg5 == 2) {
								local445 = local41;
								local41 = local19;
								local19 = local445;
								local445 = local31;
								local31 = local9;
								local9 = local445;
							} else if (arg5 == 3) {
								local445 = local41;
								local41 = local9;
								local9 = local19;
								local19 = local31;
								local31 = local445;
							}
						}
						if (arg2 == 4) {
							if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
								local103 = local54.method531(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 4, (byte) 3, arg0, true, local9, 0);
							}
							arg8.method199(arg7, anIntArray19[arg5], arg5 * 512, local69, local83, arg6, 0, arg3, 0, local51, local103);
						} else if (arg2 == 5) {
							local445 = 16;
							local199 = arg8.method216(arg7, arg6, arg3);
							if (local199 > 0) {
								local445 = Class48.method523(local199 >> 14 & 0x7FFF).anInt708;
							}
							if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
								local474 = local54.method531(4, 0, local9, local19, local31, local41, -1);
							} else {
								local474 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 4, (byte) 3, arg0, true, local9, 0);
							}
							arg8.method199(arg7, anIntArray19[arg5], arg5 * 512, local69, local83, arg6, anIntArray13[arg5] * local445, arg3, anIntArray20[arg5] * local445, local51, local474);
						} else if (arg2 == 6) {
							if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
								local103 = local54.method531(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 4, (byte) 3, arg0, true, local9, 0);
							}
							arg8.method199(arg7, 256, arg5, local69, local83, arg6, 0, arg3, 0, local51, local103);
						} else if (arg2 == 7) {
							if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
								local103 = local54.method531(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 4, (byte) 3, arg0, true, local9, 0);
							}
							arg8.method199(arg7, 512, arg5, local69, local83, arg6, 0, arg3, 0, local51, local103);
						} else if (arg2 == 8) {
							if (local54.anInt709 == -1 && local54.anIntArray192 == null) {
								local103 = local54.method531(4, 0, local9, local19, local31, local41, -1);
							} else {
								local103 = new Class10_Sub1_Sub2_Sub5(local54.anInt709, local31, local41, local19, 4, (byte) 3, arg0, true, local9, 0);
							}
							arg8.method199(arg7, 768, arg5, local69, local83, arg6, 0, arg3, 0, local51, local103);
						}
					}
				}
			}
		} catch ( RuntimeException local1013) {
			signlink.reporterror("29081, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 0 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local1013.toString());
			throw new RuntimeException();
		}
	}

	public static void method17( Class33_Sub1 arg0, Class10_Sub1_Sub3 arg1) {
		try {
			int local7 = -1;
			while (true) {
				int local10 = arg1.method325();
				if (local10 == 0) {
					return;
				}
				local7 += local10;
				Class48 local19 = Class48.method523(local7);
				local19.method525(arg0);
				while (true) {
					int local26 = arg1.method325();
					if (local26 == 0) {
						break;
					}
					arg1.method311();
				}
			}
		} catch ( RuntimeException local37) {
			signlink.reporterror("21049, " + arg0 + ", " + arg1 + ", " + -3 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	public static boolean method18( int arg0, byte arg1, int arg2) {
		try {
			Class48 local2 = Class48.method523(arg2);
			if (arg1 != aByte5) {
				for ( int local7 = 1; local7 > 0; local7++) {
				}
			}
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return local2.method532(arg0);
		} catch ( RuntimeException local31) {
			signlink.reporterror("72100, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	private static int method19( int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	private static int method23( int arg0, int arg1) {
		int local5 = arg0 + arg1 * 57;
		int local11 = local5 << 13 ^ local5;
		int local25 = local11 * (local11 * local11 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	private static int method24( int arg0, int arg1, int arg2, int arg3) {
		int local11 = 65536 - Class10_Sub1_Sub1_Sub4.anIntArray182[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (arg1 * local11 >> 16);
	}

	private static int method26( int arg0, int arg1) {
		int local31 = method23(arg0 - 1, arg1 - 1) + method23(arg0 + 1, arg1 - 1) + method23(arg0 - 1, arg1 + 1) + method23(arg0 + 1, arg1 + 1);
		int local55 = method23(arg0 - 1, arg1) + method23(arg0 + 1, arg1) + method23(arg0, arg1 - 1) + method23(arg0, arg1 + 1);
		int local59 = method23(arg0, arg1);
		return local31 / 16 + local55 / 8 + local59 / 4;
	}

	public static boolean method29( int arg0, int arg1, byte[] arg2) {
		try {
			boolean local3 = true;
			Class10_Sub1_Sub3 local9 = new Class10_Sub1_Sub3(true, arg2);
			int local18 = -1;
			label53: while (true) {
				int local21 = local9.method325();
				if (local21 == 0) {
					return local3;
				}
				local18 += local21;
				int local29 = 0;
				boolean local31 = false;
				while (true) {
					int local36;
					while (!local31) {
						local36 = local9.method325();
						if (local36 == 0) {
							continue label53;
						}
						local29 += local36 - 1;
						int local58 = local29 & 0x3F;
						int local64 = local29 >> 6 & 0x3F;
						int local69 = local9.method311() >> 2;
						int local73 = local64 + arg0;
						int local77 = local58 + arg1;
						if (local73 > 0 && local77 > 0 && local73 < 103 && local77 < 103) {
							Class48 local90 = Class48.method523(local18);
							if (local69 != 22 || !aBoolean15 || local90.aBoolean180 || local90.aBoolean181) {
								local3 &= local90.method528();
								local31 = true;
							}
						}
					}
					local36 = local9.method325();
					if (local36 == 0) {
						break;
					}
					local9.method311();
				}
			}
		} catch ( RuntimeException local116) {
			signlink.reporterror("35154, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 24515 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	private static int method32( int arg0, int arg1) {
		int local32 = method11(arg0 + 45365, arg1 + 91923, 4) + (method11(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method11(arg0, arg1, 1) - 128 >> 2) - 128;
		local32 = (int) ((double) local32 * 0.3D) + 35;
		if (local32 < 10) {
			local32 = 10;
		} else if (local32 > 60) {
			local32 = 60;
		}
		return local32;
	}

	public Class8( int[][][] arg0, int arg1, byte[][][] arg2, int arg3, int arg4) {
		try {
			anInt56 = 99;
			this.anInt57 = arg4;
			this.anInt58 = arg3;
			this.anIntArrayArrayArray1 = arg0;
			this.aByteArrayArrayArray1 = arg2;
			this.aByteArrayArrayArray5 = new byte[4][this.anInt57][this.anInt58];
			this.aByteArrayArrayArray4 = new byte[4][this.anInt57][this.anInt58];
			this.aByteArrayArrayArray3 = new byte[4][this.anInt57][this.anInt58];
			this.aByteArrayArrayArray2 = new byte[4][this.anInt57][this.anInt58];
			this.anIntArrayArrayArray2 = new int[4][this.anInt57 + 1][this.anInt58 + 1];
			this.aByteArrayArrayArray6 = new byte[4][this.anInt57 + 1][this.anInt58 + 1];
			this.anIntArrayArray4 = new int[this.anInt57 + 1][this.anInt58 + 1];
			this.anIntArray14 = new int[this.anInt58];
			this.anIntArray15 = new int[this.anInt58];
			this.anIntArray16 = new int[this.anInt58];
			this.anIntArray17 = new int[this.anInt58];
			this.anIntArray18 = new int[this.anInt58];
		} catch ( RuntimeException local133) {
			signlink.reporterror("48031, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	private int method12( int arg0, int arg1, int arg2) {
		try {
			if (this.aByte6 != 0) {
				return 2;
			} else if ((this.aByteArrayArrayArray1[arg1][arg2][arg0] & 0x8) == 0) {
				return arg1 <= 0 || (this.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
			} else {
				return 0;
			}
		} catch ( RuntimeException local42) {
			signlink.reporterror("43009, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	public void method14( int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 == this.anInt59) {
				int local12;
				for ( int local8 = 0; local8 < 8; local8++) {
					for (local12 = 0; local12 < 8; local12++) {
						this.anIntArrayArrayArray1[arg1][arg3 + local8][arg2 + local12] = 0;
					}
				}
				if (arg3 > 0) {
					for (local12 = 1; local12 < 8; local12++) {
						this.anIntArrayArrayArray1[arg1][arg3][arg2 + local12] = this.anIntArrayArrayArray1[arg1][arg3 - 1][arg2 + local12];
					}
				}
				if (arg2 > 0) {
					for (local12 = 1; local12 < 8; local12++) {
						this.anIntArrayArrayArray1[arg1][arg3 + local12][arg2] = this.anIntArrayArrayArray1[arg1][arg3 + local12][arg2 - 1];
					}
				}
				if (arg3 > 0 && this.anIntArrayArrayArray1[arg1][arg3 - 1][arg2] != 0) {
					this.anIntArrayArrayArray1[arg1][arg3][arg2] = this.anIntArrayArrayArray1[arg1][arg3 - 1][arg2];
				} else if (arg2 > 0 && this.anIntArrayArrayArray1[arg1][arg3][arg2 - 1] != 0) {
					this.anIntArrayArrayArray1[arg1][arg3][arg2] = this.anIntArrayArrayArray1[arg1][arg3][arg2 - 1];
				} else if (arg3 > 0 && arg2 > 0 && this.anIntArrayArrayArray1[arg1][arg3 - 1][arg2 - 1] != 0) {
					this.anIntArrayArrayArray1[arg1][arg3][arg2] = this.anIntArrayArrayArray1[arg1][arg3 - 1][arg2 - 1];
				}
			}
		} catch ( RuntimeException local202) {
			signlink.reporterror("69004, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local202.toString());
			throw new RuntimeException();
		}
	}

	public void method15( Class47[] arg0, int arg1, Class23 arg2) {
		try {
			int local7;
			int local11;
			int local27;
			for ( int local3 = 0; local3 < 4; local3++) {
				for (local7 = 0; local7 < 104; local7++) {
					for (local11 = 0; local11 < 104; local11++) {
						if ((this.aByteArrayArrayArray1[local3][local7][local11] & 0x1) == 1) {
							local27 = local3;
							if ((this.aByteArrayArrayArray1[1][local7][local11] & 0x2) == 2) {
								local27 = local3 - 1;
							}
							if (local27 >= 0) {
								arg0[local27].method483(local11, local7);
							}
						}
					}
				}
			}
			anInt55 += (int) (Math.random() * 5.0D) - 2;
			if (anInt55 < -8) {
				anInt55 = -8;
			}
			if (anInt55 > 8) {
				anInt55 = 8;
			}
			anInt61 += (int) (Math.random() * 5.0D) - 2;
			if (anInt61 < -16) {
				anInt61 = -16;
			}
			if (anInt61 > 16) {
				anInt61 = 16;
			}
			int local133;
			int local139;
			int local141;
			int local145;
			int local169;
			int local191;
			int local204;
			int local210;
			int local214;
			int local220;
			int local236;
			int local284;
			for (local7 = 0; local7 < 4; local7++) {
				byte[][] local108 = this.aByteArrayArrayArray6[local7];
				local133 = (int) Math.sqrt((double) 5100);
				local139 = local133 * 768 >> 8;
				for (local141 = 1; local141 < this.anInt58 - 1; local141++) {
					for (local145 = 1; local145 < this.anInt57 - 1; local145++) {
						local169 = this.anIntArrayArrayArray1[local7][local145 + 1][local141] - this.anIntArrayArrayArray1[local7][local145 - 1][local141];
						local191 = this.anIntArrayArrayArray1[local7][local145][local141 + 1] - this.anIntArrayArrayArray1[local7][local145][local141 - 1];
						local204 = (int) Math.sqrt((double) (local169 * local169 + local191 * local191 + 65536));
						local210 = (local169 << 8) / local204;
						local214 = 65536 / local204;
						local220 = (local191 << 8) / local204;
						local236 = (local210 * -50 + local214 * -10 + local220 * -50) / local139 + 96;
						local284 = (local108[local145 - 1][local141] >> 2) + (local108[local145 + 1][local141] >> 3) + (local108[local145][local141 - 1] >> 2) + (local108[local145][local141 + 1] >> 3) + (local108[local145][local141] >> 1);
						this.anIntArrayArray4[local145][local141] = local236 - local284;
					}
				}
				for (local145 = 0; local145 < this.anInt58; local145++) {
					this.anIntArray14[local145] = 0;
					this.anIntArray15[local145] = 0;
					this.anIntArray16[local145] = 0;
					this.anIntArray17[local145] = 0;
					this.anIntArray18[local145] = 0;
				}
				for (local169 = -5; local169 < this.anInt57 + 5; local169++) {
					for (local191 = 0; local191 < this.anInt58; local191++) {
						local204 = local169 + 5;
						int local419;
						if (local204 >= 0 && local204 < this.anInt57) {
							local210 = this.aByteArrayArrayArray5[local7][local204][local191] & 0xFF;
							if (local210 > 0) {
								Class16 local378 = Class16.aClass16Array1[local210 - 1];
								this.anIntArray14[local191] += local378.anInt170;
								this.anIntArray15[local191] += local378.anInt168;
								this.anIntArray16[local191] += local378.anInt169;
								this.anIntArray17[local191] += local378.anInt171;
								local419 = this.anIntArray18[local191]++;
							}
						}
						local210 = local169 - 5;
						if (local210 >= 0 && local210 < this.anInt57) {
							local214 = this.aByteArrayArrayArray5[local7][local210][local191] & 0xFF;
							if (local214 > 0) {
								Class16 local451 = Class16.aClass16Array1[local214 - 1];
								this.anIntArray14[local191] -= local451.anInt170;
								this.anIntArray15[local191] -= local451.anInt168;
								this.anIntArray16[local191] -= local451.anInt169;
								this.anIntArray17[local191] -= local451.anInt171;
								local419 = this.anIntArray18[local191]--;
							}
						}
					}
					if (local169 >= 1 && local169 < this.anInt57 - 1) {
						local204 = 0;
						local210 = 0;
						local214 = 0;
						local220 = 0;
						local236 = 0;
						for (local284 = -5; local284 < this.anInt58 + 5; local284++) {
							int local527 = local284 + 5;
							if (local527 >= 0 && local527 < this.anInt58) {
								local204 += this.anIntArray14[local527];
								local210 += this.anIntArray15[local527];
								local214 += this.anIntArray16[local527];
								local220 += this.anIntArray17[local527];
								local236 += this.anIntArray18[local527];
							}
							int local572 = local284 - 5;
							if (local572 >= 0 && local572 < this.anInt58) {
								local204 -= this.anIntArray14[local572];
								local210 -= this.anIntArray15[local572];
								local214 -= this.anIntArray16[local572];
								local220 -= this.anIntArray17[local572];
								local236 -= this.anIntArray18[local572];
							}
							if (local284 >= 1 && local284 < this.anInt58 - 1 && (!aBoolean15 || (this.aByteArrayArrayArray1[0][local169][local284] & 0x2) != 0 || (this.aByteArrayArrayArray1[local7][local169][local284] & 0x10) == 0 && this.method12(local284, local7, local169) == anInt60)) {
								if (local7 < anInt56) {
									anInt56 = local7;
								}
								int local671 = this.aByteArrayArrayArray5[local7][local169][local284] & 0xFF;
								int local682 = this.aByteArrayArrayArray4[local7][local169][local284] & 0xFF;
								if (local671 > 0 || local682 > 0) {
									int local695 = this.anIntArrayArrayArray1[local7][local169][local284];
									int local706 = this.anIntArrayArrayArray1[local7][local169 + 1][local284];
									int local719 = this.anIntArrayArrayArray1[local7][local169 + 1][local284 + 1];
									int local730 = this.anIntArrayArrayArray1[local7][local169][local284 + 1];
									int local737 = this.anIntArrayArray4[local169][local284];
									int local746 = this.anIntArrayArray4[local169 + 1][local284];
									int local757 = this.anIntArrayArray4[local169 + 1][local284 + 1];
									int local766 = this.anIntArrayArray4[local169][local284 + 1];
									int local768 = -1;
									int local770 = -1;
									int local778;
									int local782;
									if (local671 > 0) {
										local778 = local204 * 256 / local220;
										local782 = local210 / local236;
										int local786 = local214 / local236;
										local768 = this.method25(local778, local782, local786);
										int local798 = local778 + anInt55 & 0xFF;
										local786 += anInt61;
										if (local786 < 0) {
											local786 = 0;
										} else if (local786 > 255) {
											local786 = 255;
										}
										local770 = this.method25(local798, local782, local786);
									}
									if (local7 > 0) {
										boolean local823 = true;
										if (local671 == 0 && this.aByteArrayArrayArray3[local7][local169][local284] != 0) {
											local823 = false;
										}
										if (local682 > 0 && !Class16.aClass16Array1[local682 - 1].aBoolean48) {
											local823 = false;
										}
										if (local823 && local695 == local706 && local695 == local719 && local695 == local730) {
											this.anIntArrayArrayArray2[local7][local169][local284] |= 0x924;
										}
									}
									local778 = 0;
									if (local768 != -1) {
										local778 = Class10_Sub1_Sub1_Sub4.anIntArray186[method19(local770, 96)];
									}
									if (local682 == 0) {
										arg2.method195(local7, local169, local284, 0, 0, -1, local695, local706, local719, local730, method19(local768, local737), method19(local768, local746), method19(local768, local757), method19(local768, local766), 0, 0, 0, 0, local778, 0);
									} else {
										local782 = this.aByteArrayArrayArray3[local7][local169][local284] + 1;
										byte local935 = this.aByteArrayArrayArray2[local7][local169][local284];
										Class16 local941 = Class16.aClass16Array1[local682 - 1];
										int local944 = local941.anInt166;
										int local952;
										int local950;
										if (local944 >= 0) {
											local950 = Class10_Sub1_Sub1_Sub4.method512(local944);
											local952 = -1;
										} else if (local941.anInt165 == 16711935) {
											local952 = -2;
											local944 = -1;
											local950 = Class10_Sub1_Sub1_Sub4.anIntArray186[this.method30(local941.anInt172, 96)];
										} else {
											local952 = this.method25(local941.anInt167, local941.anInt168, local941.anInt169);
											local950 = Class10_Sub1_Sub1_Sub4.anIntArray186[this.method30(local941.anInt172, 96)];
										}
										arg2.method195(local7, local169, local284, local782, local935, local944, local695, local706, local719, local730, method19(local768, local737), method19(local768, local746), method19(local768, local757), method19(local768, local766), this.method30(local952, local737), this.method30(local952, local746), this.method30(local952, local757), this.method30(local952, local766), local778, local950);
									}
								}
							}
						}
					}
				}
				for (local191 = 1; local191 < this.anInt58 - 1; local191++) {
					for (local204 = 1; local204 < this.anInt57 - 1; local204++) {
						arg2.method194(local7, local204, local191, this.method12(local191, local7, local204));
					}
				}
			}
			arg2.method221((byte) 2);
			for (local11 = 0; local11 < this.anInt57; local11++) {
				for (local27 = 0; local27 < this.anInt58; local27++) {
					if ((this.aByteArrayArrayArray1[1][local11][local27] & 0x2) == 2) {
						arg2.method192(local11, local27);
					}
				}
			}
			if (arg1 <= 0) {
				this.anInt59 = 313;
			}
			local27 = 1;
			int local1132 = 2;
			int local1134 = 4;
			for ( int local1136 = 0; local1136 < 4; local1136++) {
				if (local1136 > 0) {
					local27 <<= 0x3;
					local1132 <<= 0x3;
					local1134 <<= 0x3;
				}
				for ( int local1154 = 0; local1154 <= local1136; local1154++) {
					for (local133 = 0; local133 <= this.anInt58; local133++) {
						for (local139 = 0; local139 <= this.anInt57; local139++) {
							if ((this.anIntArrayArrayArray2[local1154][local139][local133] & local27) != 0) {
								local141 = local133;
								local145 = local133;
								local169 = local1154;
								local191 = local1154;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1154][local139][local141 - 1] & local27) != 0) {
									local141--;
								}
								while (local145 < this.anInt58 && (this.anIntArrayArrayArray2[local1154][local139][local145 + 1] & local27) != 0) {
									local145++;
								}
								label332: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local139][local204] & local27) == 0) {
											break label332;
										}
									}
									local169--;
								}
								label321: while (local191 < local1136) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local139][local204] & local27) == 0) {
											break label321;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local139][local141] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local139][local141];
									Class23.method193(local139 * 128, local220, local139 * 128, local145 * 128 + 128, local1136, local141 * 128, local214, 1);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local139][local284] &= ~local27;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1154][local139][local133] & local1132) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local1154;
								local191 = local1154;
								while (local141 > 0 && (this.anIntArrayArrayArray2[local1154][local141 - 1][local133] & local1132) != 0) {
									local141--;
								}
								while (local145 < this.anInt57 && (this.anIntArrayArrayArray2[local1154][local145 + 1][local133] & local1132) != 0) {
									local145++;
								}
								label385: while (local169 > 0) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local169 - 1][local204][local133] & local1132) == 0) {
											break label385;
										}
									}
									local169--;
								}
								label374: while (local191 < local1136) {
									for (local204 = local141; local204 <= local145; local204++) {
										if ((this.anIntArrayArrayArray2[local191 + 1][local204][local133] & local1132) == 0) {
											break label374;
										}
									}
									local191++;
								}
								local204 = (local191 + 1 - local169) * (local145 + 1 - local141);
								if (local204 >= 8) {
									local214 = this.anIntArrayArrayArray1[local191][local141][local133] - 240;
									local220 = this.anIntArrayArrayArray1[local169][local141][local133];
									Class23.method193(local141 * 128, local220, local145 * 128 + 128, local133 * 128, local1136, local133 * 128, local214, 2);
									for (local236 = local169; local236 <= local191; local236++) {
										for (local284 = local141; local284 <= local145; local284++) {
											this.anIntArrayArrayArray2[local236][local284][local133] &= ~local1132;
										}
									}
								}
							}
							if ((this.anIntArrayArrayArray2[local1154][local139][local133] & local1134) != 0) {
								local141 = local139;
								local145 = local139;
								local169 = local133;
								local191 = local133;
								while (local169 > 0 && (this.anIntArrayArrayArray2[local1154][local139][local169 - 1] & local1134) != 0) {
									local169--;
								}
								while (local191 < this.anInt58 && (this.anIntArrayArrayArray2[local1154][local139][local191 + 1] & local1134) != 0) {
									local191++;
								}
								label438: while (local141 > 0) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1154][local141 - 1][local204] & local1134) == 0) {
											break label438;
										}
									}
									local141--;
								}
								label427: while (local145 < this.anInt57) {
									for (local204 = local169; local204 <= local191; local204++) {
										if ((this.anIntArrayArrayArray2[local1154][local145 + 1][local204] & local1134) == 0) {
											break label427;
										}
									}
									local145++;
								}
								if ((local145 + 1 - local141) * (local191 + 1 - local169) >= 4) {
									local204 = this.anIntArrayArrayArray1[local1154][local141][local169];
									Class23.method193(local141 * 128, local204, local145 * 128 + 128, local191 * 128 + 128, local1136, local169 * 128, local204, 4);
									for (local210 = local141; local210 <= local145; local210++) {
										for (local214 = local169; local214 <= local191; local214++) {
											this.anIntArrayArrayArray2[local1154][local210][local214] &= ~local1134;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch ( RuntimeException local1769) {
			signlink.reporterror("34443, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local1769.toString());
			throw new RuntimeException();
		}
	}

	public void method16( int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, Class47[] arg6, int arg7, int arg8) {
		try {
			for ( int local8 = 0; local8 < 8; local8++) {
				for ( int local12 = 0; local12 < 8; local12++) {
					if (arg5 + local8 > 0 && arg5 + local8 < 103 && arg7 + local12 > 0 && arg7 + local12 < 103) {
						arg6[arg3].anIntArrayArray16[arg5 + local8][arg7 + local12] &= 0xFEFFFFFF;
					}
				}
			}
			Class10_Sub1_Sub3 local62 = new Class10_Sub1_Sub3(true, arg2);
			for ( int local64 = 0; local64 < 4; local64++) {
				for ( int local68 = 0; local68 < 64; local68++) {
					for ( int local72 = 0; local72 < 64; local72++) {
						if (local64 == arg4 && local68 >= arg8 && local68 < arg8 + 8 && local72 >= arg1 && local72 < arg1 + 8) {
							this.method31(0, 0, local62, arg0, arg5 + Class35.method391((byte) 7, arg0, local68 & 0x7, local72 & 0x7), arg3, arg7 + Class35.method392(local72 & 0x7, local68 & 0x7, arg0, (byte) 5));
						} else {
							this.method31(0, 0, local62, 0, -1, 0, -1);
						}
					}
				}
			}
		} catch ( RuntimeException local149) {
			signlink.reporterror("86281, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	public void method20( int arg0, Class47[] arg1, Class23 arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			Class10_Sub1_Sub3 local7 = new Class10_Sub1_Sub3(true, arg3);
			int local12 = -1;
			while (true) {
				int local15 = local7.method325();
				if (local15 == 0) {
					return;
				}
				local12 += local15;
				int local23 = 0;
				while (true) {
					int local26 = local7.method325();
					if (local26 == 0) {
						break;
					}
					local23 += local26 - 1;
					int local38 = local23 & 0x3F;
					int local44 = local23 >> 6 & 0x3F;
					int local48 = local23 >> 12;
					int local51 = local7.method311();
					int local55 = local51 >> 2;
					int local59 = local51 & 0x3;
					if (local48 == arg9 && local44 >= arg6 && local44 < arg6 + 8 && local38 >= arg8 && local38 < arg8 + 8) {
						Class48 local81 = Class48.method523(local12);
						int local98 = arg7 + Class35.method393(arg5, local81.anInt697, local59, local44 & 0x7, local81.anInt707, local38 & 0x7);
						int local115 = arg4 + Class35.method394(local81.anInt707, arg5, local44 & 0x7, local38 & 0x7, local81.anInt697, local59);
						if (local98 > 0 && local115 > 0 && local98 < 103 && local115 < 103) {
							int local127 = arg0;
							if ((this.aByteArrayArrayArray1[1][local98][local115] & 0x2) == 2) {
								local127 = arg0 - 1;
							}
							Class47 local142 = null;
							if (local127 >= 0) {
								local142 = arg1[local127];
							}
							this.method21(arg2, local142, local115, arg0, local98, this.aByte4, local59 + arg5 & 0x3, local55, local12);
						}
					}
				}
			}
		} catch ( RuntimeException local170) {
			signlink.reporterror("43096, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	private void method21( Class23 arg0, Class47 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
		try {
			if (aBoolean15 && (this.aByteArrayArrayArray1[0][arg4][arg2] & 0x2) == 0) {
				if ((this.aByteArrayArrayArray1[arg3][arg4][arg2] & 0x10) != 0) {
					return;
				}
				if (this.method12(arg2, arg3, arg4) != anInt60) {
					return;
				}
			}
			if (arg3 < anInt56) {
				anInt56 = arg3;
			}
			int local49 = this.anIntArrayArrayArray1[arg3][arg4][arg2];
			int local60 = this.anIntArrayArrayArray1[arg3][arg4 + 1][arg2];
			int local73 = this.anIntArrayArrayArray1[arg3][arg4 + 1][arg2 + 1];
			int local84 = this.anIntArrayArrayArray1[arg3][arg4][arg2 + 1];
			int local94 = local49 + local60 + local73 + local84 >> 2;
			Class48 local97 = Class48.method523(arg8);
			int local109 = arg4 + (arg2 << 7) + (arg8 << 14) + 1073741824;
			if (arg5 != 0) {
				this.aBoolean14 = !this.aBoolean14;
			}
			if (!local97.aBoolean180) {
				local109 += Integer.MIN_VALUE;
			}
			byte local133 = (byte) ((arg6 << 6) + arg7);
			Class10_Sub1_Sub2 local162;
			if (arg7 != 22) {
				int local260;
				if (arg7 == 10 || arg7 == 11) {
					if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
						local162 = local97.method531(10, arg6, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 10, (byte) 3, arg8, true, local49, arg6);
					}
					if (local162 != null) {
						int local247 = 0;
						if (arg7 == 11) {
							local247 += 256;
						}
						int local263;
						if (arg6 == 1 || arg6 == 3) {
							local260 = local97.anInt697;
							local263 = local97.anInt707;
						} else {
							local260 = local97.anInt707;
							local263 = local97.anInt697;
						}
						if (arg0.method200(arg3, local260, arg2, local162, local133, local247, arg4, local263, local94, local109) && local97.aBoolean190) {
							Class10_Sub1_Sub2_Sub4 local294;
							if (local162 instanceof Class10_Sub1_Sub2_Sub4) {
								local294 = (Class10_Sub1_Sub2_Sub4) local162;
							} else {
								local294 = local97.method531(10, arg6, local49, local60, local73, local84, -1);
							}
							if (local294 != null) {
								for ( int local310 = 0; local310 <= local260; local310++) {
									for ( int local314 = 0; local314 <= local263; local314++) {
										int local321 = local294.anInt409 / 4;
										if (local321 > 30) {
											local321 = 30;
										}
										if (local321 > this.aByteArrayArrayArray6[arg3][arg4 + local310][arg2 + local314]) {
											this.aByteArrayArrayArray6[arg3][arg4 + local310][arg2 + local314] = (byte) local321;
										}
									}
								}
							}
						}
					}
					if (local97.aBoolean192 && arg1 != null) {
						arg1.method482(arg2, arg6, local97.anInt697, local97.anInt707, local97.aBoolean191, arg4);
					}
				} else if (arg7 >= 12) {
					if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
						local162 = local97.method531(arg7, arg6, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, arg7, (byte) 3, arg8, true, local49, arg6);
					}
					arg0.method200(arg3, 1, arg2, local162, local133, 0, arg4, 1, local94, local109);
					if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0) {
						this.anIntArrayArrayArray2[arg3][arg4][arg2] |= 0x924;
					}
					if (local97.aBoolean192 && arg1 != null) {
						arg1.method482(arg2, arg6, local97.anInt697, local97.anInt707, local97.aBoolean191, arg4);
					}
				} else if (arg7 == 0) {
					if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
						local162 = local97.method531(0, arg6, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 0, (byte) 3, arg8, true, local49, arg6);
					}
					arg0.method198(local94, 0, anIntArray19[arg6], null, arg4, local109, local133, arg2, local162, arg3);
					if (arg6 == 0) {
						if (local97.aBoolean190) {
							this.aByteArrayArrayArray6[arg3][arg4][arg2] = 50;
							this.aByteArrayArrayArray6[arg3][arg4][arg2 + 1] = 50;
						}
						if (local97.aBoolean187) {
							this.anIntArrayArrayArray2[arg3][arg4][arg2] |= 0x249;
						}
					} else if (arg6 == 1) {
						if (local97.aBoolean190) {
							this.aByteArrayArrayArray6[arg3][arg4][arg2 + 1] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg2 + 1] = 50;
						}
						if (local97.aBoolean187) {
							this.anIntArrayArrayArray2[arg3][arg4][arg2 + 1] |= 0x492;
						}
					} else if (arg6 == 2) {
						if (local97.aBoolean190) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg2] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg2 + 1] = 50;
						}
						if (local97.aBoolean187) {
							this.anIntArrayArrayArray2[arg3][arg4 + 1][arg2] |= 0x249;
						}
					} else if (arg6 == 3) {
						if (local97.aBoolean190) {
							this.aByteArrayArrayArray6[arg3][arg4][arg2] = 50;
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg2] = 50;
						}
						if (local97.aBoolean187) {
							this.anIntArrayArrayArray2[arg3][arg4][arg2] |= 0x492;
						}
					}
					if (local97.aBoolean192 && arg1 != null) {
						arg1.method481(arg6, local97.aBoolean191, arg7, arg4, arg2);
					}
					if (local97.anInt708 != 16) {
						arg0.method206(arg2, local97.anInt708, arg3, arg4);
					}
				} else if (arg7 == 1) {
					if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
						local162 = local97.method531(1, arg6, local49, local60, local73, local84, -1);
					} else {
						local162 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 1, (byte) 3, arg8, true, local49, arg6);
					}
					arg0.method198(local94, 0, anIntArray21[arg6], null, arg4, local109, local133, arg2, local162, arg3);
					if (local97.aBoolean190) {
						if (arg6 == 0) {
							this.aByteArrayArrayArray6[arg3][arg4][arg2 + 1] = 50;
						} else if (arg6 == 1) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg2 + 1] = 50;
						} else if (arg6 == 2) {
							this.aByteArrayArrayArray6[arg3][arg4 + 1][arg2] = 50;
						} else if (arg6 == 3) {
							this.aByteArrayArrayArray6[arg3][arg4][arg2] = 50;
						}
					}
					if (local97.aBoolean192 && arg1 != null) {
						arg1.method481(arg6, local97.aBoolean191, arg7, arg4, arg2);
					}
				} else {
					int local871;
					Class10_Sub1_Sub2 local900;
					if (arg7 == 2) {
						local871 = arg6 + 1 & 0x3;
						Class10_Sub1_Sub2 local890;
						if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
							local890 = local97.method531(2, arg6 + 4, local49, local60, local73, local84, -1);
							local900 = local97.method531(2, local871, local49, local60, local73, local84, -1);
						} else {
							local890 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 2, (byte) 3, arg8, true, local49, arg6 + 4);
							local900 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 2, (byte) 3, arg8, true, local49, local871);
						}
						arg0.method198(local94, anIntArray19[local871], anIntArray19[arg6], local900, arg4, local109, local133, arg2, local890, arg3);
						if (local97.aBoolean187) {
							if (arg6 == 0) {
								this.anIntArrayArrayArray2[arg3][arg4][arg2] |= 0x249;
								this.anIntArrayArrayArray2[arg3][arg4][arg2 + 1] |= 0x492;
							} else if (arg6 == 1) {
								this.anIntArrayArrayArray2[arg3][arg4][arg2 + 1] |= 0x492;
								this.anIntArrayArrayArray2[arg3][arg4 + 1][arg2] |= 0x249;
							} else if (arg6 == 2) {
								this.anIntArrayArrayArray2[arg3][arg4 + 1][arg2] |= 0x249;
								this.anIntArrayArrayArray2[arg3][arg4][arg2] |= 0x492;
							} else if (arg6 == 3) {
								this.anIntArrayArrayArray2[arg3][arg4][arg2] |= 0x492;
								this.anIntArrayArrayArray2[arg3][arg4][arg2] |= 0x249;
							}
						}
						if (local97.aBoolean192 && arg1 != null) {
							arg1.method481(arg6, local97.aBoolean191, arg7, arg4, arg2);
						}
						if (local97.anInt708 != 16) {
							arg0.method206(arg2, local97.anInt708, arg3, arg4);
						}
					} else if (arg7 == 3) {
						if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
							local162 = local97.method531(3, arg6, local49, local60, local73, local84, -1);
						} else {
							local162 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 3, (byte) 3, arg8, true, local49, arg6);
						}
						arg0.method198(local94, 0, anIntArray21[arg6], null, arg4, local109, local133, arg2, local162, arg3);
						if (local97.aBoolean190) {
							if (arg6 == 0) {
								this.aByteArrayArrayArray6[arg3][arg4][arg2 + 1] = 50;
							} else if (arg6 == 1) {
								this.aByteArrayArrayArray6[arg3][arg4 + 1][arg2 + 1] = 50;
							} else if (arg6 == 2) {
								this.aByteArrayArrayArray6[arg3][arg4 + 1][arg2] = 50;
							} else if (arg6 == 3) {
								this.aByteArrayArrayArray6[arg3][arg4][arg2] = 50;
							}
						}
						if (local97.aBoolean192 && arg1 != null) {
							arg1.method481(arg6, local97.aBoolean191, arg7, arg4, arg2);
						}
					} else if (arg7 == 9) {
						if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
							local162 = local97.method531(arg7, arg6, local49, local60, local73, local84, -1);
						} else {
							local162 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, arg7, (byte) 3, arg8, true, local49, arg6);
						}
						arg0.method200(arg3, 1, arg2, local162, local133, 0, arg4, 1, local94, local109);
						if (local97.aBoolean192 && arg1 != null) {
							arg1.method482(arg2, arg6, local97.anInt697, local97.anInt707, local97.aBoolean191, arg4);
						}
					} else {
						if (local97.aBoolean182) {
							if (arg6 == 1) {
								local871 = local84;
								local84 = local73;
								local73 = local60;
								local60 = local49;
								local49 = local871;
							} else if (arg6 == 2) {
								local871 = local84;
								local84 = local60;
								local60 = local871;
								local871 = local73;
								local73 = local49;
								local49 = local871;
							} else if (arg6 == 3) {
								local871 = local84;
								local84 = local49;
								local49 = local60;
								local60 = local73;
								local73 = local871;
							}
						}
						if (arg7 == 4) {
							if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
								local162 = local97.method531(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 4, (byte) 3, arg8, true, local49, 0);
							}
							arg0.method199(arg3, anIntArray19[arg6], arg6 * 512, local109, local133, arg4, 0, arg2, 0, local94, local162);
						} else if (arg7 == 5) {
							local871 = 16;
							local260 = arg0.method216(arg3, arg4, arg2);
							if (local260 > 0) {
								local871 = Class48.method523(local260 >> 14 & 0x7FFF).anInt708;
							}
							if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
								local900 = local97.method531(4, 0, local49, local60, local73, local84, -1);
							} else {
								local900 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 4, (byte) 3, arg8, true, local49, 0);
							}
							arg0.method199(arg3, anIntArray19[arg6], arg6 * 512, local109, local133, arg4, anIntArray13[arg6] * local871, arg2, anIntArray20[arg6] * local871, local94, local900);
						} else if (arg7 == 6) {
							if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
								local162 = local97.method531(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 4, (byte) 3, arg8, true, local49, 0);
							}
							arg0.method199(arg3, 256, arg6, local109, local133, arg4, 0, arg2, 0, local94, local162);
						} else if (arg7 == 7) {
							if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
								local162 = local97.method531(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 4, (byte) 3, arg8, true, local49, 0);
							}
							arg0.method199(arg3, 512, arg6, local109, local133, arg4, 0, arg2, 0, local94, local162);
						} else if (arg7 == 8) {
							if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
								local162 = local97.method531(4, 0, local49, local60, local73, local84, -1);
							} else {
								local162 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 4, (byte) 3, arg8, true, local49, 0);
							}
							arg0.method199(arg3, 768, arg6, local109, local133, arg4, 0, arg2, 0, local94, local162);
						}
					}
				}
			} else if (!aBoolean15 || local97.aBoolean180 || local97.aBoolean181) {
				if (local97.anInt709 == -1 && local97.anIntArray192 == null) {
					local162 = local97.method531(22, arg6, local49, local60, local73, local84, -1);
				} else {
					local162 = new Class10_Sub1_Sub2_Sub5(local97.anInt709, local73, local84, local60, 22, (byte) 3, arg8, true, local49, arg6);
				}
				arg0.method196(arg4, arg2, local133, local109, local94, arg3, local162);
				if (local97.aBoolean192 && local97.aBoolean180 && arg1 != null) {
					arg1.method483(arg2, arg4);
				}
			}
		} catch ( RuntimeException local1645) {
			signlink.reporterror("29929, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local1645.toString());
			throw new RuntimeException();
		}
	}

	public void method22( int arg0, int arg1, int arg2, byte[] arg3, int arg4, Class47[] arg5) {
		try {
			int local16;
			for ( int local8 = 0; local8 < 4; local8++) {
				for ( int local12 = 0; local12 < 64; local12++) {
					for (local16 = 0; local16 < 64; local16++) {
						if (arg2 + local12 > 0 && arg2 + local12 < 103 && arg0 + local16 > 0 && arg0 + local16 < 103) {
							arg5[local8].anIntArrayArray16[arg2 + local12][arg0 + local16] &= 0xFEFFFFFF;
						}
					}
				}
			}
			Class10_Sub1_Sub3 local70 = new Class10_Sub1_Sub3(true, arg3);
			for (local16 = 0; local16 < 4; local16++) {
				for ( int local76 = 0; local76 < 64; local76++) {
					for ( int local80 = 0; local80 < 64; local80++) {
						this.method31(arg4, arg1, local70, 0, local76 + arg2, local16, local80 + arg0);
					}
				}
			}
		} catch ( RuntimeException local110) {
			signlink.reporterror("18884, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	private int method25( int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}

	public void method27( int arg0, Class47[] arg1, int arg2, Class23 arg3, byte[] arg4) {
		try {
			Class10_Sub1_Sub3 local10 = new Class10_Sub1_Sub3(true, arg4);
			int local12 = -1;
			while (true) {
				int local15 = local10.method325();
				if (local15 == 0) {
					return;
				}
				local12 += local15;
				int local23 = 0;
				while (true) {
					int local26 = local10.method325();
					if (local26 == 0) {
						break;
					}
					local23 += local26 - 1;
					int local38 = local23 & 0x3F;
					int local44 = local23 >> 6 & 0x3F;
					int local48 = local23 >> 12;
					int local51 = local10.method311();
					int local55 = local51 >> 2;
					int local59 = local51 & 0x3;
					int local63 = local44 + arg2;
					int local67 = local38 + arg0;
					if (local63 > 0 && local67 > 0 && local63 < 103 && local67 < 103) {
						int local79 = local48;
						if ((this.aByteArrayArrayArray1[1][local63][local67] & 0x2) == 2) {
							local79 = local48 - 1;
						}
						Class47 local94 = null;
						if (local79 >= 0) {
							local94 = arg1[local79];
						}
						this.method21(arg3, local94, local67, local48, local63, this.aByte4, local59, local55, local12);
					}
				}
			}
		} catch ( RuntimeException local118) {
			signlink.reporterror("66719, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -571 + ", " + arg3 + ", " + arg4 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	public void method28( int arg0, int arg1, int arg2, int arg3) {
		try {
			for ( int local8 = arg1; local8 <= arg1 + arg2; local8++) {
				for ( int local12 = arg0; local12 <= arg0 + arg3; local12++) {
					if (local12 >= 0 && local12 < this.anInt57 && local8 >= 0 && local8 < this.anInt58) {
						this.aByteArrayArrayArray6[0][local12][local8] = 127;
						if (local12 == arg0 && local12 > 0) {
							this.anIntArrayArrayArray1[0][local12][local8] = this.anIntArrayArrayArray1[0][local12 - 1][local8];
						}
						if (local12 == arg0 + arg3 && local12 < this.anInt57 - 1) {
							this.anIntArrayArrayArray1[0][local12][local8] = this.anIntArrayArrayArray1[0][local12 + 1][local8];
						}
						if (local8 == arg1 && local8 > 0) {
							this.anIntArrayArrayArray1[0][local12][local8] = this.anIntArrayArrayArray1[0][local12][local8 - 1];
						}
						if (local8 == arg1 + arg2 && local8 < this.anInt58 - 1) {
							this.anIntArrayArrayArray1[0][local12][local8] = this.anIntArrayArrayArray1[0][local12][local8 + 1];
						}
					}
				}
			}
		} catch ( RuntimeException local153) {
			signlink.reporterror("8771, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -810 + ", " + arg3 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	private int method30( int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	private void method31( int arg0, int arg1, Class10_Sub1_Sub3 arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			int local34;
			if (arg4 >= 0 && arg4 < 104 && arg6 >= 0 && arg6 < 104) {
				this.aByteArrayArrayArray1[arg5][arg4][arg6] = 0;
				while (true) {
					local34 = arg2.method311();
					if (local34 == 0) {
						if (arg5 == 0) {
							this.anIntArrayArrayArray1[0][arg4][arg6] = -method32(arg4 + arg0 + 932731, arg6 + 556238 + arg1) * 8;
							return;
						} else {
							this.anIntArrayArrayArray1[arg5][arg4][arg6] = this.anIntArrayArrayArray1[arg5 - 1][arg4][arg6] - 240;
							return;
						}
					}
					if (local34 == 1) {
						int local88 = arg2.method311();
						if (local88 == 1) {
							local88 = 0;
						}
						if (arg5 == 0) {
							this.anIntArrayArrayArray1[0][arg4][arg6] = -local88 * 8;
							return;
						}
						this.anIntArrayArrayArray1[arg5][arg4][arg6] = this.anIntArrayArrayArray1[arg5 - 1][arg4][arg6] - local88 * 8;
						return;
					}
					if (local34 <= 49) {
						this.aByteArrayArrayArray4[arg5][arg4][arg6] = arg2.method312();
						this.aByteArrayArrayArray3[arg5][arg4][arg6] = (byte) ((local34 - 2) / 4);
						this.aByteArrayArrayArray2[arg5][arg4][arg6] = (byte) (local34 + arg3 - 2 & 0x3);
					} else if (local34 <= 81) {
						this.aByteArrayArrayArray1[arg5][arg4][arg6] = (byte) (local34 - 49);
					} else {
						this.aByteArrayArrayArray5[arg5][arg4][arg6] = (byte) (local34 - 81);
					}
				}
			} else {
				while (true) {
					local34 = arg2.method311();
					if (local34 == 0) {
						return;
					}
					if (local34 == 1) {
						arg2.method311();
						return;
					}
					if (local34 <= 49) {
						arg2.method311();
					}
				}
			}
		} catch ( RuntimeException local229) {
			signlink.reporterror("83639, " + arg0 + ", " + -61 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local229.toString());
			throw new RuntimeException();
		}
	}
}
