




public final class Class31 {

	private static BZip2State aClass1_1 = new BZip2State();

	public static int method363( byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
		BZip2State local3 = aClass1_1;
		synchronized (aClass1_1) {
			aClass1_1.aByteArray1 = arg2;
			aClass1_1.anInt10 = arg4;
			aClass1_1.aByteArray2 = arg0;
			aClass1_1.anInt14 = 0;
			aClass1_1.anInt11 = arg3;
			aClass1_1.anInt15 = arg1;
			aClass1_1.anInt20 = 0;
			aClass1_1.anInt19 = 0;
			aClass1_1.anInt12 = 0;
			aClass1_1.anInt13 = 0;
			aClass1_1.anInt16 = 0;
			aClass1_1.anInt17 = 0;
			aClass1_1.anInt22 = 0;
			method365(aClass1_1);
			return arg1 - aClass1_1.anInt15;
		}
	}

	private static void method364( BZip2State arg0) {
		byte local4 = arg0.aByte1;
		int local7 = arg0.anInt18;
		int local10 = arg0.anInt26;
		int local13 = arg0.anInt25;
		int[] local15 = BZip2State.anIntArray4;
		int local18 = arg0.anInt24;
		byte[] local21 = arg0.aByteArray2;
		int local24 = arg0.anInt14;
		int local27 = arg0.anInt15;
		int local29 = local27;
		int local34 = arg0.anInt28 + 1;
		label67: while (true) {
			if (local7 > 0) {
				while (true) {
					if (local27 == 0) {
						break label67;
					}
					if (local7 == 1) {
						if (local27 == 0) {
							local7 = 1;
							break label67;
						}
						local21[local24] = local4;
						local24++;
						local27--;
						break;
					}
					local21[local24] = local4;
					local7--;
					local24++;
					local27--;
				}
			}
			boolean local64 = true;
			byte local87;
			while (local64) {
				local64 = false;
				if (local10 == local34) {
					local7 = 0;
					break label67;
				}
				local4 = (byte) local13;
				local18 = local15[local18];
				local87 = (byte) (local18 & 0xFF);
				local18 >>= 0x8;
				local10++;
				if (local87 != local13) {
					local13 = local87;
					if (local27 == 0) {
						local7 = 1;
						break label67;
					}
					local21[local24] = local4;
					local24++;
					local27--;
					local64 = true;
				} else if (local10 == local34) {
					if (local27 == 0) {
						local7 = 1;
						break label67;
					}
					local21[local24] = local4;
					local24++;
					local27--;
					local64 = true;
				}
			}
			local7 = 2;
			local18 = local15[local18];
			local87 = (byte) (local18 & 0xFF);
			local18 >>= 0x8;
			local10++;
			if (local10 != local34) {
				if (local87 == local13) {
					local7 = 3;
					local18 = local15[local18];
					local87 = (byte) (local18 & 0xFF);
					local18 >>= 0x8;
					local10++;
					if (local10 != local34) {
						if (local87 == local13) {
							local18 = local15[local18];
							local87 = (byte) (local18 & 0xFF);
							local18 >>= 0x8;
							local10++;
							local7 = (local87 & 0xFF) + 4;
							local18 = local15[local18];
							local13 = (byte) (local18 & 0xFF);
							local18 >>= 0x8;
							local10++;
						} else {
							local13 = local87;
						}
					}
				} else {
					local13 = local87;
				}
			}
		}
		int local224 = arg0.anInt16;
		arg0.anInt16 += local29 - local27;
		if (arg0.anInt16 < local224) {
			arg0.anInt17++;
		}
		arg0.aByte1 = local4;
		arg0.anInt18 = local7;
		arg0.anInt26 = local10;
		arg0.anInt25 = local13;
		BZip2State.anIntArray4 = local15;
		arg0.anInt24 = local18;
		arg0.aByteArray2 = local21;
		arg0.anInt14 = local24;
		arg0.anInt15 = local27;
	}

	private static void method365( BZip2State arg0) {
		arg0.anInt21 = 1;
		if (BZip2State.anIntArray4 == null) {
			BZip2State.anIntArray4 = new int[arg0.anInt21 * 100000];
		}
		boolean local60 = true;
		while (true) {
			while (local60) {
				byte local64 = method366(arg0);
				if (local64 == 23) {
					return;
				}
				local64 = method366(arg0);
				local64 = method366(arg0);
				local64 = method366(arg0);
				local64 = method366(arg0);
				local64 = method366(arg0);
				arg0.anInt22++;
				local64 = method366(arg0);
				local64 = method366(arg0);
				local64 = method366(arg0);
				local64 = method366(arg0);
				local64 = method367(arg0);
				if (local64 == 0) {
					arg0.aBoolean1 = false;
				} else {
					arg0.aBoolean1 = true;
				}
				if (arg0.aBoolean1) {
					System.out.println("PANIC! RANDOMISED BLOCK!");
				}
				arg0.anInt23 = 0;
				local64 = method366(arg0);
				arg0.anInt23 = arg0.anInt23 << 8 | local64 & 0xFF;
				local64 = method366(arg0);
				arg0.anInt23 = arg0.anInt23 << 8 | local64 & 0xFF;
				local64 = method366(arg0);
				arg0.anInt23 = arg0.anInt23 << 8 | local64 & 0xFF;
				int local164;
				for (local164 = 0; local164 < 16; local164++) {
					local64 = method367(arg0);
					if (local64 == 1) {
						arg0.aBooleanArray2[local164] = true;
					} else {
						arg0.aBooleanArray2[local164] = false;
					}
				}
				for (local164 = 0; local164 < 256; local164++) {
					arg0.aBooleanArray1[local164] = false;
				}
				int local212;
				for (local164 = 0; local164 < 16; local164++) {
					if (arg0.aBooleanArray2[local164]) {
						for (local212 = 0; local212 < 16; local212++) {
							local64 = method367(arg0);
							if (local64 == 1) {
								arg0.aBooleanArray1[local164 * 16 + local212] = true;
							}
						}
					}
				}
				method369(arg0);
				int local244 = arg0.anInt27 + 2;
				int local248 = method368(3, arg0);
				int local252 = method368(15, arg0);
				for (local164 = 0; local164 < local252; local164++) {
					local212 = 0;
					while (true) {
						local64 = method367(arg0);
						if (local64 == 0) {
							arg0.selectorMtf[local164] = (byte) local212;
							break;
						}
						local212++;
					}
				}
				byte[] local279 = new byte[6];
				byte local281 = 0;
				while (local281 < local248) {
					local279[local281] = local281++;
				}
				for (local164 = 0; local164 < local252; local164++) {
					local281 = arg0.selectorMtf[local164];
					byte local308 = local279[local281];
					while (local281 > 0) {
						local279[local281] = local279[local281 - 1];
						local281--;
					}
					local279[0] = local308;
					arg0.selector[local164] = local308;
				}
				int local340;
				for (local340 = 0; local340 < local248; local340++) {
					int local346 = method368(5, arg0);
					for (local164 = 0; local164 < local244; local164++) {
						while (true) {
							local64 = method367(arg0);
							if (local64 == 0) {
								arg0.len[local340][local164] = (byte) local346;
								break;
							}
							local64 = method367(arg0);
							if (local64 == 0) {
								local346++;
							} else {
								local346--;
							}
						}
					}
				}
				for (local340 = 0; local340 < local248; local340++) {
					byte local388 = 32;
					byte local390 = 0;
					for (local164 = 0; local164 < local244; local164++) {
						if (arg0.len[local340][local164] > local390) {
							local390 = arg0.len[local340][local164];
						}
						if (arg0.len[local340][local164] < local388) {
							local388 = arg0.len[local340][local164];
						}
					}
					method370(arg0.limit[local340], arg0.base[local340], arg0.perm[local340], arg0.len[local340], local388, local390, local244);
					arg0.minLens[local340] = local388;
				}
				int local462 = arg0.anInt27 + 1;
				int local467 = arg0.anInt21 * 100000;
				byte local469 = -1;
				for (local164 = 0; local164 <= 255; local164++) {
					arg0.anIntArray1[local164] = 0;
				}
				int local486 = 4095;
				for ( int local488 = 15; local488 >= 0; local488--) {
					for ( int local492 = 15; local492 >= 0; local492--) {
						arg0.mtfa[local486] = (byte) (local488 * 16 + local492);
						local486--;
					}
					arg0.anIntArray5[local488] = local486 + 1;
				}
				int local520 = 0;
				int local523 = local469 + 1;
				byte local525 = 50;
				byte local530 = arg0.selector[0];
				int local535 = arg0.minLens[local530];
				int[] local540 = arg0.limit[local530];
				int[] local545 = arg0.perm[local530];
				int[] local550 = arg0.base[local530];
				int local551 = local525 - 1;
				int local553 = local535;
				int local557;
				byte local566;
				for (local557 = method368(local535, arg0); local557 > local540[local553]; local557 = local557 << 1 | local566) {
					local553++;
					local566 = method367(arg0);
				}
				int local582 = local545[local557 - local550[local553]];
				while (true) {
					while (local582 != local462) {
						if (local582 == 0 || local582 == 1) {
							int local592 = -1;
							int local594 = 1;
							do {
								if (local582 == 0) {
									local592 += local594;
								} else if (local582 == 1) {
									local592 += local594 * 2;
								}
								local594 *= 2;
								if (local551 == 0) {
									local523++;
									local551 = 50;
									local530 = arg0.selector[local523];
									local535 = arg0.minLens[local530];
									local540 = arg0.limit[local530];
									local545 = arg0.perm[local530];
									local550 = arg0.base[local530];
								}
								local551--;
								local553 = local535;
								for (local557 = method368(local535, arg0); local557 > local540[local553]; local557 = local557 << 1 | local566) {
									local553++;
									local566 = method367(arg0);
								}
								local582 = local545[local557 - local550[local553]];
							} while (local582 == 0 || local582 == 1);
							local592++;
							local64 = arg0.aByteArray3[arg0.mtfa[arg0.anIntArray5[0]] & 0xFF];
							arg0.anIntArray1[local64 & 0xFF] += local592;
							while (local592 > 0) {
								BZip2State.anIntArray4[local520] = local64 & 0xFF;
								local520++;
								local592--;
							}
						} else {
							int local724 = local582 - 1;
							int local732;
							if (local724 < 16) {
								local732 = arg0.anIntArray5[0];
								local64 = arg0.mtfa[local732 + local724];
								while (local724 > 3) {
									int local745 = local732 + local724;
									arg0.mtfa[local745] = arg0.mtfa[local745 - 1];
									arg0.mtfa[local745 - 1] = arg0.mtfa[local745 - 2];
									arg0.mtfa[local745 - 2] = arg0.mtfa[local745 - 3];
									arg0.mtfa[local745 - 3] = arg0.mtfa[local745 - 4];
									local724 -= 4;
								}
								while (local724 > 0) {
									arg0.mtfa[local732 + local724] = arg0.mtfa[local732 + local724 - 1];
									local724--;
								}
								arg0.mtfa[local732] = local64;
							} else {
								int local825 = local724 / 16;
								int local829 = local724 % 16;
								local732 = arg0.anIntArray5[local825] + local829;
								local64 = arg0.mtfa[local732];
								while (local732 > arg0.anIntArray5[local825]) {
									arg0.mtfa[local732] = arg0.mtfa[local732 - 1];
									local732--;
								}
								int local865 = arg0.anIntArray5[local825]++;
								while (local825 > 0) {
									local865 = arg0.anIntArray5[local825]--;
									arg0.mtfa[arg0.anIntArray5[local825]] = arg0.mtfa[arg0.anIntArray5[local825 - 1] + 16 - 1];
									local825--;
								}
								local865 = arg0.anIntArray5[0]--;
								arg0.mtfa[arg0.anIntArray5[0]] = local64;
								if (arg0.anIntArray5[0] == 0) {
									int local924 = 4095;
									for ( int local926 = 15; local926 >= 0; local926--) {
										for ( int local930 = 15; local930 >= 0; local930--) {
											arg0.mtfa[local924] = arg0.mtfa[arg0.anIntArray5[local926] + local930];
											local924--;
										}
										arg0.anIntArray5[local926] = local924 + 1;
									}
								}
							}
							arg0.anIntArray1[arg0.aByteArray3[local64 & 0xFF] & 0xFF]++;
							BZip2State.anIntArray4[local520] = arg0.aByteArray3[local64 & 0xFF] & 0xFF;
							local520++;
							if (local551 == 0) {
								local523++;
								local551 = 50;
								local530 = arg0.selector[local523];
								local535 = arg0.minLens[local530];
								local540 = arg0.limit[local530];
								local545 = arg0.perm[local530];
								local550 = arg0.base[local530];
							}
							local551--;
							local553 = local535;
							for (local557 = method368(local535, arg0); local557 > local540[local553]; local557 = local557 << 1 | local566) {
								local553++;
								local566 = method367(arg0);
							}
							local582 = local545[local557 - local550[local553]];
						}
					}
					arg0.anInt18 = 0;
					arg0.aByte1 = 0;
					arg0.anIntArray2[0] = 0;
					for (local164 = 1; local164 <= 256; local164++) {
						arg0.anIntArray2[local164] = arg0.anIntArray1[local164 - 1];
					}
					for (local164 = 1; local164 <= 256; local164++) {
						arg0.anIntArray2[local164] += arg0.anIntArray2[local164 - 1];
					}
					for (local164 = 0; local164 < local520; local164++) {
						local64 = (byte) (BZip2State.anIntArray4[local164] & 0xFF);
						BZip2State.anIntArray4[arg0.anIntArray2[local64 & 0xFF]] |= local164 << 8;
						arg0.anIntArray2[local64 & 0xFF]++;
					}
					arg0.anInt24 = BZip2State.anIntArray4[arg0.anInt23] >> 8;
					arg0.anInt26 = 0;
					arg0.anInt24 = BZip2State.anIntArray4[arg0.anInt24];
					arg0.anInt25 = (byte) (arg0.anInt24 & 0xFF);
					arg0.anInt24 >>= 0x8;
					arg0.anInt26++;
					arg0.anInt28 = local520;
					method364(arg0);
					if (arg0.anInt26 == arg0.anInt28 + 1 && arg0.anInt18 == 0) {
						local60 = true;
						break;
					}
					local60 = false;
					break;
				}
			}
			return;
		}
	}

	private static byte method366( BZip2State arg0) {
		return (byte) method368(8, arg0);
	}

	private static byte method367( BZip2State arg0) {
		return (byte) method368(1, arg0);
	}

	private static int method368( int arg0, BZip2State arg1) {
		while (arg1.anInt20 < arg0) {
			arg1.anInt19 = arg1.anInt19 << 8 | arg1.aByteArray1[arg1.anInt10] & 0xFF;
			arg1.anInt20 += 8;
			arg1.anInt10++;
			arg1.anInt11--;
			arg1.anInt12++;
			if (arg1.anInt12 == 0) {
				arg1.anInt13++;
			}
		}
		int local17 = arg1.anInt19 >> arg1.anInt20 - arg0 & (0x1 << arg0) - 1;
		arg1.anInt20 -= arg0;
		return local17;
	}

	private static void method369( BZip2State arg0) {
		arg0.anInt27 = 0;
		for ( int local4 = 0; local4 < 256; local4++) {
			if (arg0.aBooleanArray1[local4]) {
				arg0.aByteArray3[arg0.anInt27] = (byte) local4;
				arg0.anInt27++;
			}
		}
	}

	private static void method370( int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int local3 = 0;
		int local5;
		for (local5 = arg4; local5 <= arg5; local5++) {
			for ( int local9 = 0; local9 < arg6; local9++) {
				if (arg3[local9] == local5) {
					arg2[local3] = local9;
					local3++;
				}
			}
		}
		for (local5 = 0; local5 < 23; local5++) {
			arg1[local5] = 0;
		}
		for (local5 = 0; local5 < arg6; local5++) {
			arg1[arg3[local5] + 1]++;
		}
		for (local5 = 1; local5 < 23; local5++) {
			arg1[local5] += arg1[local5 - 1];
		}
		for (local5 = 0; local5 < 23; local5++) {
			arg0[local5] = 0;
		}
		int local93 = 0;
		for (local5 = arg4; local5 <= arg5; local5++) {
			local93 += arg1[local5 + 1] - arg1[local5];
			arg0[local5] = local93 - 1;
			local93 <<= 0x1;
		}
		for (local5 = arg4 + 1; local5 <= arg5; local5++) {
			arg1[local5] = (arg0[local5 - 1] + 1 << 1) - arg1[local5];
		}
	}
}
