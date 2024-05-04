package jagex2.io;


public final class BZip2 {

	private static final BZip2State state = new BZip2State();

	public static int read(byte[] decompressed, int length, byte[] stream, int avail_in, int next_in) {
		synchronized (state) {
			state.stream = stream;
			state.next_in = next_in;
			state.decompressed = decompressed;
			state.next_out = 0;
			state.avail_in = avail_in;
			state.avail_out = length;
			state.bsLive = 0;
			state.bsBuff = 0;
			state.total_in_lo32 = 0;
			state.total_in_hi32 = 0;
			state.total_out_lo32 = 0;
			state.total_out_hi32 = 0;
			state.currBlockNo = 0;
			decompress(state);
			return length - state.avail_out;
		}
	}

	private static void finish(BZip2State s) {
		byte c_state_out_ch = s.state_out_ch;
		int c_state_out_len = s.state_out_len;
		int c_nblock_used = s.c_nblock_used;
		int c_k0 = s.k0;
		int[] c_tt = BZip2State.tt;
		int c_tPos = s.tPos;
		byte[] cs_decompressed = s.decompressed;
		int cs_next_out = s.next_out;
		int cs_avail_out = s.avail_out;
		int avail_out_INIT = cs_avail_out;
		int s_save_nblockPP = s.save_nblock + 1;
		label67: while (true) {
			if (c_state_out_len > 0) {
				while (true) {
					if (cs_avail_out == 0) {
						break label67;
					}
					if (c_state_out_len == 1) {
						if (cs_avail_out == 0) {
							c_state_out_len = 1;
							break label67;
						}
						cs_decompressed[cs_next_out] = c_state_out_ch;
						cs_next_out++;
						cs_avail_out--;
						break;
					}
					cs_decompressed[cs_next_out] = c_state_out_ch;
					c_state_out_len--;
					cs_next_out++;
					cs_avail_out--;
				}
			}
			boolean next = true;
			byte k1;
			while (next) {
				next = false;
				if (c_nblock_used == s_save_nblockPP) {
					c_state_out_len = 0;
					break label67;
				}
				c_state_out_ch = (byte) c_k0;
				c_tPos = c_tt[c_tPos];
				k1 = (byte) (c_tPos & 0xFF);
				c_tPos >>= 0x8;
				c_nblock_used++;
				if (k1 != c_k0) {
					c_k0 = k1;
					if (cs_avail_out == 0) {
						c_state_out_len = 1;
						break label67;
					}
					cs_decompressed[cs_next_out] = c_state_out_ch;
					cs_next_out++;
					cs_avail_out--;
					next = true;
				} else if (c_nblock_used == s_save_nblockPP) {
					if (cs_avail_out == 0) {
						c_state_out_len = 1;
						break label67;
					}
					cs_decompressed[cs_next_out] = c_state_out_ch;
					cs_next_out++;
					cs_avail_out--;
					next = true;
				}
			}
			c_state_out_len = 2;
			c_tPos = c_tt[c_tPos];
			k1 = (byte) (c_tPos & 0xFF);
			c_tPos >>= 0x8;
			c_nblock_used++;
			if (c_nblock_used != s_save_nblockPP) {
				if (k1 == c_k0) {
					c_state_out_len = 3;
					c_tPos = c_tt[c_tPos];
					k1 = (byte) (c_tPos & 0xFF);
					c_tPos >>= 0x8;
					c_nblock_used++;
					if (c_nblock_used != s_save_nblockPP) {
						if (k1 == c_k0) {
							c_tPos = c_tt[c_tPos];
							k1 = (byte) (c_tPos & 0xFF);
							c_tPos >>= 0x8;
							c_nblock_used++;
							c_state_out_len = (k1 & 0xFF) + 4;
							c_tPos = c_tt[c_tPos];
							c_k0 = (byte) (c_tPos & 0xFF);
							c_tPos >>= 0x8;
							c_nblock_used++;
						} else {
							c_k0 = k1;
						}
					}
				} else {
					c_k0 = k1;
				}
			}
		}
		int total_out_lo32_old = s.total_out_lo32;
		s.total_out_lo32 += avail_out_INIT - cs_avail_out;
		if (s.total_out_lo32 < total_out_lo32_old) {
			s.total_out_hi32++;
		}
		s.state_out_ch = c_state_out_ch;
		s.state_out_len = c_state_out_len;
		s.c_nblock_used = c_nblock_used;
		s.k0 = c_k0;
		BZip2State.tt = c_tt;
		s.tPos = c_tPos;
		//Redundant
		//s.decompressed = cs_decompressed;
		s.next_out = cs_next_out;
		s.avail_out = cs_avail_out;
	}

	private static void decompress(BZip2State cState) {
		cState.anInt21 = 1;
		if (BZip2State.tt == null) {
			BZip2State.tt = new int[cState.anInt21 * 100000];
		}
		boolean reading = true;

		while (reading) {
			byte uc = getUnsignedChar(cState);
			if (uc == 23) {
				return;
			}
			uc = getUnsignedChar(cState);
			uc = getUnsignedChar(cState);
			uc = getUnsignedChar(cState);
			uc = getUnsignedChar(cState);
			uc = getUnsignedChar(cState);
			cState.currBlockNo++;
			uc = getUnsignedChar(cState);
			uc = getUnsignedChar(cState);
			uc = getUnsignedChar(cState);
			uc = getUnsignedChar(cState);
			uc = getBit(cState);
            cState.blockRandomized = uc != 0;
			if (cState.blockRandomized) {
				System.out.println("PANIC! RANDOMISED BLOCK!");
			}
			cState.origPtr = 0;
			uc = getUnsignedChar(cState);
			cState.origPtr = cState.origPtr << 8 | uc & 0xFF;
			uc = getUnsignedChar(cState);
			cState.origPtr = cState.origPtr << 8 | uc & 0xFF;
			uc = getUnsignedChar(cState);
			cState.origPtr = cState.origPtr << 8 | uc & 0xFF;

			int i;
			for (i = 0; i < 16; i++) {
				uc = getBit(cState);
                cState.inUse16[i] = uc == 1;
			}
			for (i = 0; i < 256; i++) {
				cState.inUse[i] = false;
			}
			int j;
			for (i = 0; i < 16; i++) {
				if (cState.inUse16[i]) {
					for (j = 0; j < 16; j++) {
						uc = getBit(cState);
						if (uc == 1) {
							cState.inUse[i * 16 + j] = true;
						}
					}
				}
			}
			makeMaps(cState);
			int alphaSize = cState.nInUse + 2;
			int nGroups = getBits(3, cState);
			int nSelectors = getBits(15, cState);
			for (i = 0; i < nSelectors; i++) {
				j = 0;
				while (true) {
					uc = getBit(cState);
					if (uc == 0) {
						cState.selectorMtf[i] = (byte) j;
						break;
					}
					j++;
				}
			}
			byte[] pos = new byte[BZip2State.BZ_N_GROUPS];
			byte v = 0;
			while (v < nGroups) {
				pos[v] = v++;
			}
			for (i = 0; i < nSelectors; i++) {
				v = cState.selectorMtf[i];
				byte tmp = pos[v];
				while (v > 0) {
					pos[v] = pos[v - 1];
					v--;
				}
				pos[0] = tmp;
				cState.selector[i] = tmp;
			}
			int t;
			for (t = 0; t < nGroups; t++) {
				int curr = getBits(5, cState);
				for (i = 0; i < alphaSize; i++) {
					while (true) {
						uc = getBit(cState);
						if (uc == 0) {
							cState.len[t][i] = (byte) curr;
							break;
						}
						uc = getBit(cState);
						if (uc == 0) {
							curr++;
						} else {
							curr--;
						}
					}
				}
			}
			for (t = 0; t < nGroups; t++) {
				byte minLen = 32;
				byte maxLen = 0;
				for (i = 0; i < alphaSize; i++) {
					if (cState.len[t][i] > maxLen) {
						maxLen = cState.len[t][i];
					}
					if (cState.len[t][i] < minLen) {
						minLen = cState.len[t][i];
					}
				}
				createDecodeTables(cState.limit[t], cState.base[t], cState.perm[t], cState.len[t], minLen, maxLen, alphaSize);
				cState.minLens[t] = minLen;
			}
			int EOB = cState.nInUse + 1;
			int nblockMAX = cState.anInt21 * 100000;
			byte groupNo = -1;
			for (i = 0; i <= 255; i++) {
				cState.unzftab[i] = 0;
			}
			int kk = BZip2State.MTFA_SIZE - 1;
			for ( int ii = 15; ii >= 0; ii--) {
				for ( int jj = 15; jj >= 0; jj--) {
					cState.mtfa[kk] = (byte) (ii * 16 + jj);
					kk--;
				}
				cState.mtfbase[ii] = kk + 1;
			}
			int nblock = 0;

			int groupPos = groupNo + 1;
			byte gPosition = 50;
			byte gSel = cState.selector[0];
			int gMinlen = cState.minLens[gSel];
			int[] gLimit = cState.limit[gSel];
			int[] gPerm = cState.perm[gSel];
			int[] gBase = cState.base[gSel];
			int gPos = gPosition - 1;
			int zn = gMinlen;
			int zvec;
			byte zj;
			for (zvec = getBits(gMinlen, cState); zvec > gLimit[zn]; zvec = zvec << 1 | zj) {
				zn++;
				zj = getBit(cState);
			}
			int nextSym = gPerm[zvec - gBase[zn]];
			while (true) {
				while (nextSym != EOB) {
					if (nextSym == 0 || nextSym == 1) {
						int es = -1;
						int N = 1;
						do {
							if (nextSym == 0) {
								es += N;
							} else if (nextSym == 1) {
								es += N * 2;
							}
							N *= 2;
							if (gPos == 0) {
								groupPos++;
								gPos = 50;
								gSel = cState.selector[groupPos];
								gMinlen = cState.minLens[gSel];
								gLimit = cState.limit[gSel];
								gPerm = cState.perm[gSel];
								gBase = cState.base[gSel];
							}
							gPos--;
							zn = gMinlen;
							for (zvec = getBits(gMinlen, cState); zvec > gLimit[zn]; zvec = zvec << 1 | zj) {
								zn++;
								zj = getBit(cState);
							}
							nextSym = gPerm[zvec - gBase[zn]];
						} while (nextSym == 0 || nextSym == 1);
						es++;
						uc = cState.aByteArray3[cState.mtfa[cState.mtfbase[0]] & 0xFF];
						cState.unzftab[uc & 0xFF] += es;
						while (es > 0) {
							BZip2State.tt[nblock] = uc & 0xFF;
							nblock++;
							es--;
						}
					} else {
						int nn = nextSym - 1;
						int pp;
						if (nn < 16) {
							pp = cState.mtfbase[0];
							uc = cState.mtfa[pp + nn];
							while (nn > 3) {
								int z = pp + nn;
								cState.mtfa[z] = cState.mtfa[z - 1];
								cState.mtfa[z - 1] = cState.mtfa[z - 2];
								cState.mtfa[z - 2] = cState.mtfa[z - 3];
								cState.mtfa[z - 3] = cState.mtfa[z - 4];
								nn -= 4;
							}
							while (nn > 0) {
								cState.mtfa[pp + nn] = cState.mtfa[pp + nn - 1];
								nn--;
							}
							cState.mtfa[pp] = uc;
						} else {
							int lno = nn / BZip2State.MTFL_SIZE;
							int off = nn % BZip2State.MTFL_SIZE;
							pp = cState.mtfbase[lno] + off;
							uc = cState.mtfa[pp];
							while (pp > cState.mtfbase[lno]) {
								cState.mtfa[pp] = cState.mtfa[pp - 1];
								pp--;
							}
							int local865 = cState.mtfbase[lno]++;
							while (lno > 0) {
								local865 = cState.mtfbase[lno]--;
								cState.mtfa[cState.mtfbase[lno]] = cState.mtfa[cState.mtfbase[lno - 1] + 16 - 1];
								lno--;
							}
							local865 = cState.mtfbase[0]--;
							cState.mtfa[cState.mtfbase[0]] = uc;
							if (cState.mtfbase[0] == 0) {
								int ll = BZip2State.MTFA_SIZE - 1;
								for ( int ii = 15; ii >= 0; ii--) {
									for ( int jj = 15; jj >= 0; jj--) {
										cState.mtfa[ll] = cState.mtfa[cState.mtfbase[ii] + jj];
										ll--;
									}
									cState.mtfbase[ii] = ll + 1;
								}
							}
						}
						cState.unzftab[cState.aByteArray3[uc & 0xFF] & 0xFF]++;
						BZip2State.tt[nblock] = cState.aByteArray3[uc & 0xFF] & 0xFF;
						nblock++;
						if (gPos == 0) {
							groupPos++;
							gPos = 50;
							gSel = cState.selector[groupPos];
							gMinlen = cState.minLens[gSel];
							gLimit = cState.limit[gSel];
							gPerm = cState.perm[gSel];
							gBase = cState.base[gSel];
						}
						gPos--;
						zn = gMinlen;
						for (zvec = getBits(gMinlen, cState); zvec > gLimit[zn]; zvec = zvec << 1 | zj) {
							zn++;
							zj = getBit(cState);
						}
						nextSym = gPerm[zvec - gBase[zn]];
					}
				}
				cState.state_out_len = 0;
				cState.state_out_ch = 0;
				cState.anIntArray2[0] = 0;
				for (i = 1; i <= 256; i++) {
					cState.anIntArray2[i] = cState.unzftab[i - 1];
				}
				for (i = 1; i <= 256; i++) {
					cState.anIntArray2[i] += cState.anIntArray2[i - 1];
				}
				for (i = 0; i < nblock; i++) {
					uc = (byte) (BZip2State.tt[i] & 0xFF);
					BZip2State.tt[cState.anIntArray2[uc & 0xFF]] |= i << 8;
					cState.anIntArray2[uc & 0xFF]++;
				}
				cState.tPos = BZip2State.tt[cState.origPtr] >> 8;
				cState.c_nblock_used = 0;
				cState.tPos = BZip2State.tt[cState.tPos];
				cState.k0 = (byte) (cState.tPos & 0xFF);
				cState.tPos >>= 0x8;
				cState.c_nblock_used++;
				cState.save_nblock = nblock;
				finish(cState);
				if (cState.c_nblock_used == cState.save_nblock + 1 && cState.state_out_len == 0) {
					reading = true;
					break;
				}
				reading = false;
				break;
			}
		}
		return;
	}

	private static byte getUnsignedChar(BZip2State state) {
		return (byte) getBits(8, state);
	}

	private static byte getBit(BZip2State state) {
		return (byte) getBits(1, state);
	}

	private static int getBits(int n, BZip2State state) {
		while (state.bsLive < n) {
			state.bsBuff = state.bsBuff << 8 | state.stream[state.next_in] & 0xFF;
			state.bsLive += 8;
			state.next_in++;
			state.avail_in--;
			state.total_in_lo32++;
			if (state.total_in_lo32 == 0) {
				state.total_in_hi32++;
			}
		}
		int local17 = state.bsBuff >> state.bsLive - n & (0x1 << n) - 1;
		state.bsLive -= n;
		return local17;
	}

	private static void makeMaps(BZip2State state) {
		state.nInUse = 0;
		for ( int local4 = 0; local4 < 256; local4++) {
			if (state.inUse[local4]) {
				state.aByteArray3[state.nInUse] = (byte) local4;
				state.nInUse++;
			}
		}
	}

	private static void createDecodeTables(int[] limit, int[] base, int[] arg2, byte[] length, int minLen, int maxLen, int arg6) {
		int pp = 0;
		int i;
		for (i = minLen; i <= maxLen; i++) {
			for ( int j = 0; j < arg6; j++) {
				if (length[j] == i) {
					arg2[pp] = j;
					pp++;
				}
			}
		}
		for (i = 0; i < 23; i++) {
			base[i] = 0;
		}
		for (i = 0; i < arg6; i++) {
			base[length[i] + 1]++;
		}
		for (i = 1; i < 23; i++) {
			base[i] += base[i - 1];
		}
		for (i = 0; i < 23; i++) {
			limit[i] = 0;
		}
		int vec = 0;
		for (i = minLen; i <= maxLen; i++) {
			vec += base[i + 1] - base[i];
			limit[i] = vec - 1;
			vec <<= 0x1;
		}
		for (i = minLen + 1; i <= maxLen; i++) {
			base[i] = (limit[i - 1] + 1 << 1) - base[i];
		}
	}

	public static final class BZip2State {

		public static int[] tt;

		public byte[] stream;

		public int next_in;

		public int avail_in;

		public int total_in_lo32;

		public int total_in_hi32;

		public byte[] decompressed;

		public int next_out;

		public int avail_out;

		public int total_out_lo32;

		public int total_out_hi32;

		public byte state_out_ch;

		public int state_out_len;

		public boolean blockRandomized;

		public int bsBuff;

		public int bsLive;

		public int anInt21;

		public int currBlockNo;

		public int origPtr;

		public int tPos;

		public int k0;

		public int c_nblock_used;

		public int nInUse;

		public int save_nblock;

		private static final int MTFA_SIZE = 4096;

		private static final int MTFL_SIZE = 16;

		private final int BZ_MAX_ALPHA_SIZE = 258;

		private final int BZ_MAX_CODE_LEN = 23;

		private final int anInt5 = 1;

		private static final int BZ_N_GROUPS = 6;

		private final int BZ_G_SIZE = 50;

		private final int anInt8 = 4;

		private final int BZ_MAX_SELECTORS = (2 + (900000 / BZ_G_SIZE)); // 18002

		public int[] unzftab = new int[256];

		public int[] anIntArray2 = new int[257];

		private int[] anIntArray3 = new int[257];

		public boolean[] inUse = new boolean[256];

		public boolean[] inUse16 = new boolean[16];

		public byte[] aByteArray3 = new byte[256];

		public byte[] mtfa = new byte[MTFA_SIZE];

		public int[] mtfbase = new int[MTFL_SIZE];

		public byte[] selector = new byte[BZ_MAX_SELECTORS];

		public byte[] selectorMtf = new byte[BZ_MAX_SELECTORS];

		public byte[][] len = new byte[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

		public int[][] limit = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

		public int[][] base = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

		public int[][] perm = new int[BZ_N_GROUPS][BZ_MAX_ALPHA_SIZE];

		public int[] minLens = new int[BZ_N_GROUPS];
	}
}
