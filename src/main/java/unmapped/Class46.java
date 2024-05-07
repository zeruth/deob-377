package unmapped;


import jagex2.io.JagFile;
import jagex2.io.Packet;
import sign.signlink;

public final class Class46 {

	private static int anInt659;

	private static boolean aBoolean163;

	private static boolean aBoolean164;

	private static int anInt662;

	private static boolean aBoolean165;

	private static int[] anIntArray176;

	private static char[][] aCharArrayArray1;

	private static byte[][][] aByteArrayArrayArray7;

	private static char[][] aCharArrayArray2;

	private static char[][] aCharArrayArray3;

	private static int[] anIntArray177;

	private static int anInt658 = 3;

	private static int anInt660 = -761;

	private static int anInt661 = -48545;

	private static byte aByte37 = -113;

	private static int anInt663 = 3;

	private static int anInt664 = -939;

	private static boolean aBoolean166 = true;

	private static final String[] aStringArray6 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	public static void method442( JagFile arg0) {
		Packet local10 = new Packet(arg0.read("fragmentsenc.txt", null));
		Packet local19 = new Packet(arg0.read("badenc.txt", null));
		Packet local28 = new Packet(arg0.read("domainenc.txt", null));
		Packet local37 = new Packet(arg0.read("tldlist.txt", null));
		method443(local10, local19, local28, local37);
	}

	private static void method443(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
		method445(arg1);
		method446(arg2);
		method447(arg0);
		method444(arg3);
	}

	private static void method444( Packet arg0) {
		try {
			int local4 = arg0.g4();
			aCharArrayArray3 = new char[local4][];
			anIntArray177 = new int[local4];
			for ( int local12 = 0; local12 < local4; local12++) {
				anIntArray177[local12] = arg0.g1();
				char[] local23 = new char[arg0.g1()];
				for ( int local25 = 0; local25 < local23.length; local25++) {
					local23[local25] = (char) arg0.g1();
				}
				aCharArrayArray3[local12] = local23;
			}
		} catch ( RuntimeException local57) {
			signlink.reporterror("14371, " + arg0 + ", " + -7305 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	private static void method445( Packet arg0) {
		try {
			int local5 = arg0.g4();
			aCharArrayArray1 = new char[local5][];
			aByteArrayArrayArray7 = new byte[local5][][];
			method448(arg0, aCharArrayArray1, aByteArrayArrayArray7);
		} catch ( RuntimeException local18) {
			signlink.reporterror("20698, " + true + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	private static void method446( Packet arg0) {
		try {
			int local2 = arg0.g4();
			aCharArrayArray2 = new char[local2][];
			method449(arg0, aCharArrayArray2);
		} catch ( RuntimeException local16) {
			signlink.reporterror("55888, " + 20529 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	private static void method447( Packet arg0) {
		try {
			anIntArray176 = new int[arg0.g4()];
			for ( int local9 = 0; local9 < anIntArray176.length; local9++) {
				anIntArray176[local9] = arg0.g2();
			}
		} catch ( RuntimeException local23) {
			signlink.reporterror("95365, " + arg0 + ", " + 21901 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	private static void method448(Packet arg0, char[][] arg1, byte[][][] arg2) {
		try {
			for ( int local3 = 0; local3 < arg1.length; local3++) {
				char[] local9 = new char[arg0.g1()];
				for ( int local11 = 0; local11 < local9.length; local11++) {
					local9[local11] = (char) arg0.g1();
				}
				arg1[local3] = local9;
				byte[][] local33 = new byte[arg0.g1()][2];
				for ( int local35 = 0; local35 < local33.length; local35++) {
					local33[local35][0] = (byte) arg0.g1();
					local33[local35][1] = (byte) arg0.g1();
				}
				if (local33.length > 0) {
					arg2[local3] = local33;
				}
			}
		} catch ( RuntimeException local75) {
			signlink.reporterror("87435, " + 34541 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	private static void method449(Packet arg0, char[][] arg1) {
		try {
			for ( int local8 = 0; local8 < arg1.length; local8++) {
				char[] local14 = new char[arg0.g1()];
				for ( int local16 = 0; local16 < local14.length; local16++) {
					local14[local16] = (char) arg0.g1();
				}
				arg1[local8] = local14;
			}
		} catch ( RuntimeException local40) {
			signlink.reporterror("48449, " + arg0 + ", " + arg1 + ", " + -37125 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	private static void method450( char[] arg0) {
		try {
			int local3 = 0;
			for ( int local5 = 0; local5 < arg0.length; local5++) {
				if (method451(arg0[local5])) {
					arg0[local3] = arg0[local5];
				} else {
					arg0[local3] = ' ';
				}
				if (local3 == 0 || arg0[local3] != ' ' || arg0[local3 - 1] != ' ') {
					local3++;
				}
			}
			for ( int local47 = local3; local47 < arg0.length; local47++) {
				arg0[local47] = ' ';
			}
		} catch ( RuntimeException local63) {
			signlink.reporterror("4096, " + arg0 + ", " + 6 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	private static boolean method451( char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007f' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch ( RuntimeException local31) {
			signlink.reporterror("96774, " + arg0 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	public static String method452( String arg0) {
		try {
			long local3 = System.currentTimeMillis();
			char[] local6 = arg0.toCharArray();
			method450(local6);
			String local15 = (new String(local6)).trim();
			char[] local19 = local15.toLowerCase().toCharArray();
			String local22 = local15.toLowerCase();
			method460(local19);
			method455(local19, anInt661);
			method456(local19);
			method469(local19);
			for ( int local42 = 0; local42 < aStringArray6.length; local42++) {
				int local52 = -1;
				while ((local52 = local22.indexOf(aStringArray6[local42], local52 + 1)) != -1) {
					char[] local59 = aStringArray6[local42].toCharArray();
					for ( int local61 = 0; local61 < local59.length; local61++) {
						local19[local61 + local52] = local59[local61];
					}
				}
			}
			method453(local19, local15.toCharArray());
			method454(local19);
			long local103 = System.currentTimeMillis();
			return (new String(local19)).trim();
		} catch ( RuntimeException local110) {
			signlink.reporterror("77455, " + 0 + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	private static void method453( char[] arg0, char[] arg1) {
		try {
			for ( int local1 = 0; local1 < arg1.length; local1++) {
				if (arg0[local1] != '*' && method477(arg1[local1])) {
					arg0[local1] = arg1[local1];
				}
			}
		} catch ( RuntimeException local31) {
			signlink.reporterror("79914, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	private static void method454( char[] arg0) {
		try {
			boolean local3 = true;
			for ( int local5 = 0; local5 < arg0.length; local5++) {
				char local11 = arg0[local5];
				if (!method474(local11)) {
					local3 = true;
				} else if (local3) {
					if (method476(local11, aBoolean165)) {
						local3 = false;
					}
				} else if (method477(local11)) {
					arg0[local5] = (char) (local11 + 'a' - 65);
				}
			}
		} catch ( RuntimeException local52) {
			signlink.reporterror("90548, " + 1 + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	private static void method455( char[] arg0, int arg1) {
		try {
			for ( int local3 = 0; local3 < 2; local3++) {
				for ( int local10 = aCharArrayArray1.length - 1; local10 >= 0; local10--) {
					method464(aByteArrayArrayArray7[local10], aCharArrayArray1[local10], arg0);
				}
			}
			if (arg1 != -48545) {
				aBoolean163 = !aBoolean163;
			}
		} catch ( RuntimeException local39) {
			signlink.reporterror("74044, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	private static void method456( char[] arg0) {
		try {
			char[] local3 = (char[]) arg0.clone();
			char[] local18 = new char[] { '(', 'a', ')' };
			method464(null, local18, local3);
			char[] local35 = (char[]) arg0.clone();
			char[] local50 = new char[] { 'd', 'o', 't' };
			method464(null, local50, local35);
			for ( int local60 = aCharArrayArray2.length - 1; local60 >= 0; local60--) {
				method457(arg0, local35, local3, aCharArrayArray2[local60]);
			}
		} catch ( RuntimeException local75) {
			signlink.reporterror("40077, " + 3 + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	private static void method457( char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		try {
			if (arg3.length <= arg0.length) {
				int local22;
				for ( int local14 = 0; local14 <= arg0.length - arg3.length; local14 += local22) {
					int local18 = local14;
					int local20 = 0;
					local22 = 1;
					label58: while (true) {
						while (true) {
							if (local18 >= arg0.length) {
								break label58;
							}
							char local30 = arg0[local18];
							char local32 = 0;
							if (local18 + 1 < arg0.length) {
								local32 = arg0[local18 + 1];
							}
							int local57;
							if (local20 < arg3.length && (local57 = method466(local30, arg3[local20], local32)) > 0) {
								local18 += local57;
								local20++;
							} else {
								if (local20 == 0) {
									break label58;
								}
								int local78;
								if ((local78 = method466(local30, arg3[local20 - 1], local32)) > 0) {
									local18 += local78;
									if (local20 == 1) {
										local22++;
									}
								} else {
									if (local20 >= arg3.length || !method472(local30)) {
										break label58;
									}
									local18++;
								}
							}
						}
					}
					if (local20 >= arg3.length) {
						boolean local109 = false;
						int local115 = method458(arg0, arg2, local14);
						int local123 = method459(arg1, local18 - 1, arg0);
						if (local115 > 2 || local123 > 2) {
							local109 = true;
						}
						if (local109) {
							for ( int local135 = local14; local135 < local18; local135++) {
								arg0[local135] = '*';
							}
						}
					}
				}
			}
		} catch ( RuntimeException local158) {
			signlink.reporterror("96111, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -65 + ", " + arg3 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	private static int method458( char[] arg0, char[] arg1, int arg2) {
		try {
			if (arg2 == 0) {
				return 2;
			}
			for ( int local9 = arg2 - 1; local9 >= 0 && method472(arg0[local9]); local9--) {
				if (arg0[local9] == '@') {
					return 3;
				}
			}
			int local29 = 0;
			for ( int local33 = arg2 - 1; local33 >= 0 && method472(arg1[local33]); local33--) {
				if (arg1[local33] == '*') {
					local29++;
				}
			}
			if (local29 >= 3) {
				return 4;
			} else if (method472(arg0[arg2 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch ( RuntimeException local74) {
			signlink.reporterror("90947, " + arg0 + ", " + arg1 + ", " + -72 + ", " + arg2 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	private static int method459( char[] arg0, int arg1, char[] arg2) {
		try {
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			int local13 = arg1 + 1;
			while (true) {
				if (local13 < arg2.length && method472(arg2[local13])) {
					if (arg2[local13] != '.' && arg2[local13] != ',') {
						local13++;
						continue;
					}
					return 3;
				}
				int local40 = 0;
				for ( int local48 = arg1 + 1; local48 < arg2.length && method472(arg0[local48]); local48++) {
					if (arg0[local48] == '*') {
						local40++;
					}
				}
				if (local40 >= 3) {
					return 4;
				}
				if (method472(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch ( RuntimeException local86) {
			signlink.reporterror("28741, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	private static void method460( char[] arg0) {
		try {
			char[] local3 = (char[]) arg0.clone();
			char[] local18 = new char[] { 'd', 'o', 't' };
			method464(null, local18, local3);
			char[] local27 = (char[]) arg0.clone();
			char[] local50 = new char[] { 's', 'l', 'a', 's', 'h' };
			method464(null, local50, local27);
			for ( int local65 = 0; local65 < aCharArrayArray3.length; local65++) {
				method461(arg0, (byte) 7, local3, anIntArray177[local65], aCharArrayArray3[local65], local27);
			}
		} catch ( RuntimeException local85) {
			signlink.reporterror("40483, " + arg0 + ", " + 0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	private static void method461( char[] arg0, byte arg1, char[] arg2, int arg3, char[] arg4, char[] arg5) {
		try {
			if (arg4.length <= arg0.length) {
				int local19;
				for ( int local11 = 0; local11 <= arg0.length - arg4.length; local11 += local19) {
					int local15 = local11;
					int local17 = 0;
					local19 = 1;
					label120: while (true) {
						while (true) {
							if (local15 >= arg0.length) {
								break label120;
							}
							char local27 = arg0[local15];
							char local29 = 0;
							if (local15 + 1 < arg0.length) {
								local29 = arg0[local15 + 1];
							}
							int local54;
							if (local17 < arg4.length && (local54 = method466(local27, arg4[local17], local29)) > 0) {
								local15 += local54;
								local17++;
							} else {
								if (local17 == 0) {
									break label120;
								}
								int local75;
								if ((local75 = method466(local27, arg4[local17 - 1], local29)) > 0) {
									local15 += local75;
									if (local17 == 1) {
										local19++;
									}
								} else {
									if (local17 >= arg4.length || !method472(local27)) {
										break label120;
									}
									local15++;
								}
							}
						}
					}
					if (local17 >= arg4.length) {
						boolean local106 = false;
						int local112 = method462(arg2, local11, arg0);
						int local120 = method463(arg5, local15 - 1, arg0);
						if (arg3 == 1 && local112 > 0 && local120 > 0) {
							local106 = true;
						}
						if (arg3 == 2 && (local112 > 2 && local120 > 0 || local112 > 0 && local120 > 2)) {
							local106 = true;
						}
						if (arg3 == 3 && local112 > 0 && local120 > 2) {
							local106 = true;
						}
						boolean local163;
						if (arg3 == 3 && local112 > 2 && local120 > 0) {
							local163 = true;
						} else {
							local163 = false;
						}
						if (local106) {
							int local170 = local11;
							int local174 = local15 - 1;
							boolean local182;
							int local186;
							if (local112 > 2) {
								if (local112 == 4) {
									local182 = false;
									for (local186 = local11 - 1; local186 >= 0; local186--) {
										if (local182) {
											if (arg2[local186] != '*') {
												break;
											}
											local170 = local186;
										} else if (arg2[local186] == '*') {
											local170 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local170 - 1; local186 >= 0; local186--) {
									if (local182) {
										if (method472(arg0[local186])) {
											break;
										}
										local170 = local186;
									} else if (!method472(arg0[local186])) {
										local182 = true;
										local170 = local186;
									}
								}
							}
							if (local120 > 2) {
								if (local120 == 4) {
									local182 = false;
									for (local186 = local174 + 1; local186 < arg0.length; local186++) {
										if (local182) {
											if (arg5[local186] != '*') {
												break;
											}
											local174 = local186;
										} else if (arg5[local186] == '*') {
											local174 = local186;
											local182 = true;
										}
									}
								}
								local182 = false;
								for (local186 = local174 + 1; local186 < arg0.length; local186++) {
									if (local182) {
										if (method472(arg0[local186])) {
											break;
										}
										local174 = local186;
									} else if (!method472(arg0[local186])) {
										local182 = true;
										local174 = local186;
									}
								}
							}
							for ( int local320 = local170; local320 <= local174; local320++) {
								arg0[local320] = '*';
							}
						}
					}
				}
				boolean local346 = false;
			}
		} catch ( RuntimeException local349) {
			signlink.reporterror("37819, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local349.toString());
			throw new RuntimeException();
		}
	}

	private static int method462( char[] arg0, int arg1, char[] arg2) {
		try {
			int local6;
			if (aByte37 != -113) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			if (arg1 == 0) {
				return 2;
			}
			local6 = arg1 - 1;
			while (true) {
				if (local6 >= 0 && method472(arg2[local6])) {
					if (arg2[local6] != ',' && arg2[local6] != '.') {
						local6--;
						continue;
					}
					return 3;
				}
				int local44 = 0;
				for ( int local48 = arg1 - 1; local48 >= 0 && method472(arg0[local48]); local48--) {
					if (arg0[local48] == '*') {
						local44++;
					}
				}
				if (local44 >= 3) {
					return 4;
				}
				if (method472(arg2[arg1 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch ( RuntimeException local84) {
			signlink.reporterror("25568, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -113 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	private static int method463( char[] arg0, int arg1, char[] arg2) {
		try {
			int local9;
			if (anInt663 > 3 || anInt663 < 3) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			if (arg1 + 1 == arg2.length) {
				return 2;
			}
			local9 = arg1 + 1;
			while (true) {
				if (local9 < arg2.length && method472(arg2[local9])) {
					if (arg2[local9] != '\\' && arg2[local9] != '/') {
						local9++;
						continue;
					}
					return 3;
				}
				int local53 = 0;
				for ( int local57 = arg1 + 1; local57 < arg2.length && method472(arg0[local57]); local57++) {
					if (arg0[local57] == '*') {
						local53++;
					}
				}
				if (local53 >= 5) {
					return 4;
				}
				if (method472(arg2[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch ( RuntimeException local95) {
			signlink.reporterror("59010, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 3 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	private static void method464( byte[][] arg0, char[] arg1, char[] arg2) {
		try {
			if (arg1.length <= arg2.length) {
				int local26;
				for ( int local16 = 0; local16 <= arg2.length - arg1.length; local16 += local26) {
					int local20 = local16;
					int local22 = 0;
					int local24 = 0;
					local26 = 1;
					boolean local28 = false;
					boolean local30 = false;
					boolean local32 = false;
					char var12;
					char var13;
					label164: while (true) {
						while (true) {
							if (local20 >= arg2.length || local30 && local32) {
								break label164;
							}
							var12 = arg2[local20];
							var13 = '\u0000';
							if (local20 + 1 < arg2.length) {
								var13 = arg2[local20 + 1];
							}
							int local67;
							if (local22 < arg1.length && (local67 = method467(arg1[local22], var12, var13)) > 0) {
								if (local67 == 1 && method475(var12)) {
									local30 = true;
								}
								if (local67 == 2 && (method475(var12) || method475(var13))) {
									local30 = true;
								}
								local20 += local67;
								local22++;
							} else {
								if (local22 == 0) {
									break label164;
								}
								int local110;
								if ((local110 = method467(arg1[local22 - 1], var12, var13)) > 0) {
									local20 += local110;
									if (local22 == 1) {
										local26++;
									}
								} else {
									if (local22 >= arg1.length || !method473(var12)) {
										break label164;
									}
									if (method472(var12) && var12 != '\'') {
										local28 = true;
									}
									if (method475(var12)) {
										local32 = true;
									}
									local20++;
									local24++;
									if (local24 * 100 / (local20 - local16) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (local22 >= arg1.length && (!local30 || !local32)) {
						boolean local175 = true;
						int local271;
						if (local28) {
							boolean local221 = false;
							boolean local223 = false;
							if (local16 - 1 < 0 || method472(arg2[local16 - 1]) && arg2[local16 - 1] != '\'') {
								local221 = true;
							}
							if (local20 >= arg2.length || method472(arg2[local20]) && arg2[local20] != '\'') {
								local223 = true;
							}
							if (!local221 || !local223) {
								boolean local267 = false;
								local271 = local16 - 2;
								if (local221) {
									local271 = local16;
								}
								while (!local267 && local271 < local20) {
									if (local271 >= 0 && (!method472(arg2[local271]) || arg2[local271] == '\'')) {
										char[] local293 = new char[3];
										int local295;
										for (local295 = 0; local295 < 3 && local271 + local295 < arg2.length && (!method472(arg2[local271 + local295]) || arg2[local271 + local295] == '\''); local295++) {
											local293[local295] = arg2[local271 + local295];
										}
										boolean local333 = true;
										if (local295 == 0) {
											local333 = false;
										}
										if (local295 < 3 && local271 - 1 >= 0 && (!method472(arg2[local271 - 1]) || arg2[local271 - 1] == '\'')) {
											local333 = false;
										}
										if (local333 && !method478(local293, 463)) {
											local267 = true;
										}
									}
									local271++;
								}
								if (!local267) {
									local175 = false;
								}
							}
						} else {
							var12 = ' ';
							if (local16 - 1 >= 0) {
								var12 = arg2[local16 - 1];
							}
							var13 = ' ';
							if (local20 < arg2.length) {
								var13 = arg2[local20];
							}
							byte local203 = method468(var12);
							byte local207 = method468(var13);
							if (arg0 != null && method465(local207, arg0, local203)) {
								local175 = false;
							}
						}
						if (local175) {
							int local383 = 0;
							int local385 = 0;
							int local387 = -1;
							for (local271 = local16; local271 < local20; local271++) {
								if (method475(arg2[local271])) {
									local383++;
								} else if (method474(arg2[local271])) {
									local385++;
									local387 = local271;
								}
							}
							if (local387 > -1) {
								local383 -= local20 - local387 - 1;
							}
							if (local383 <= local385) {
								for ( int local429 = local16; local429 < local20; local429++) {
									arg2[local429] = '*';
								}
							} else {
								local26 = 1;
							}
						}
					}
				}
			}
		} catch ( RuntimeException local456) {
			signlink.reporterror("85121, " + arg0 + ", " + -939 + ", " + arg1 + ", " + arg2 + ", " + local456.toString());
			throw new RuntimeException();
		}
	}

	private static boolean method465( byte arg0, byte[][] arg1, byte arg2) {
		try {
			int local1 = 0;
			if (arg1[0][0] == arg2 && arg1[0][1] == arg0) {
				return true;
			}
			int local32 = arg1.length - 1;
			if (arg1[local32][0] == arg2 && arg1[local32][1] == arg0) {
				return true;
			}
			do {
				int local54 = (local1 + local32) / 2;
				if (arg1[local54][0] == arg2 && arg1[local54][1] == arg0) {
					return true;
				}
				if (arg2 < arg1[local54][0] || arg2 == arg1[local54][0] && arg0 < arg1[local54][1]) {
					local32 = local54;
				} else {
					local1 = local54;
				}
			} while (local1 != local32 && local1 + 1 != local32);
			return false;
		} catch ( RuntimeException local108) {
			signlink.reporterror("39484, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	private static int method466( char arg0, char arg1, char arg2) {
		try {
			if (arg1 == arg0) {
				return 1;
			} else if (arg1 == 'o' && arg0 == '0') {
				return 1;
			} else if (arg1 == 'o' && arg0 == '(' && arg2 == ')') {
				return 2;
			} else if (arg1 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
				return 1;
			} else if (arg1 == 'e' && arg0 == '€') {
				return 1;
			} else if (arg1 == 's' && arg0 == '$') {
				return 1;
			} else if (arg1 == 'l' && arg0 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch ( RuntimeException local68) {
			signlink.reporterror("24200, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	private static int method467( char arg0, char arg1, char arg2) {
		try {
			if (arg0 == arg1) {
				return 1;
			}
			if (arg0 >= 'a' && arg0 <= 'm') {
				if (arg0 == 'a') {
					if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
						if (arg1 == '/' && arg2 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg0 == 'b') {
					if (arg1 != '6' && arg1 != '8') {
						if ((arg1 != '1' || arg2 != '3') && (arg1 != 'i' || arg2 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg0 == 'c') {
					if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'd') {
					if ((arg1 != '[' || arg2 != ')') && (arg1 != 'i' || arg2 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'e') {
					if (arg1 != '3' && arg1 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'f') {
					if (arg1 == 'p' && arg2 == 'h') {
						return 2;
					}
					if (arg1 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'g') {
					if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'h') {
					if (arg1 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'i') {
					if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'j') {
					return 0;
				}
				if (arg0 == 'k') {
					return 0;
				}
				if (arg0 == 'l') {
					if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'm') {
					return 0;
				}
			}
			if (arg0 >= 'n' && arg0 <= 'z') {
				if (arg0 == 'n') {
					return 0;
				}
				if (arg0 == 'o') {
					if (arg1 != '0' && arg1 != '*') {
						if ((arg1 != '(' || arg2 != ')') && (arg1 != '[' || arg2 != ']') && (arg1 != '{' || arg2 != '}') && (arg1 != '<' || arg2 != '>')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg0 == 'p') {
					return 0;
				}
				if (arg0 == 'q') {
					return 0;
				}
				if (arg0 == 'r') {
					return 0;
				}
				if (arg0 == 's') {
					if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 't') {
					if (arg1 != '7' && arg1 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'u') {
					if (arg1 == 'v') {
						return 1;
					}
					if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'v') {
					if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'w') {
					if (arg1 == 'v' && arg2 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg0 == 'x') {
					if ((arg1 != ')' || arg2 != '(') && (arg1 != '}' || arg2 != '{') && (arg1 != ']' || arg2 != '[') && (arg1 != '>' || arg2 != '<')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'y') {
					return 0;
				}
				if (arg0 == 'z') {
					return 0;
				}
			}
			if (arg0 >= '0' && arg0 <= '9') {
				if (arg0 == '0') {
					if (arg1 == 'o' || arg1 == 'O') {
						return 1;
					} else if ((arg1 != '(' || arg2 != ')') && (arg1 != '{' || arg2 != '}') && (arg1 != '[' || arg2 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg0 == '1') {
					return arg1 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg0 == ',') {
				return arg1 == '.' ? 1 : 0;
			} else if (arg0 == '.') {
				return arg1 == ',' ? 1 : 0;
			} else if (arg0 == '!') {
				return arg1 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch ( RuntimeException local513) {
			signlink.reporterror("48972, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + local513.toString());
			throw new RuntimeException();
		}
	}

	private static byte method468( char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return (byte) (arg0 + 1 - 'a');
			} else if (arg0 == '\'') {
				return 28;
			} else if (arg0 >= '0' && arg0 <= '9') {
				return (byte) (arg0 + 29 - '0');
			} else {
				return 27;
			}
		} catch ( RuntimeException local40) {
			signlink.reporterror("98760, " + arg0 + ", " + 7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	private static void method469( char[] arg0) {
		try {
			int local5 = 0;
			int local7 = 0;
			int local16 = 0;
			while (true) {
				do {
					int local115;
					if ((local115 = method470(local5, arg0)) == -1) {
						return;
					}
					boolean local20 = false;
					for ( int local22 = local5; local22 >= 0 && local22 < local115 && !local20; local22++) {
						if (!method472(arg0[local22]) && !method473(arg0[local22])) {
							local20 = true;
						}
					}
					if (local20) {
						local7 = 0;
					}
					if (local7 == 0) {
						local16 = local115;
					}
					local5 = method471(local115, arg0);
					int local61 = 0;
					for ( int local63 = local115; local63 < local5; local63++) {
						local61 = local61 * 10 + arg0[local63] - 48;
					}
					if (local61 <= 255 && local5 - local115 <= 8) {
						local7++;
					} else {
						local7 = 0;
					}
				} while (local7 != 4);
				for ( int local97 = local16; local97 < local5; local97++) {
					arg0[local97] = '*';
				}
				local7 = 0;
			}
		} catch ( RuntimeException local119) {
			signlink.reporterror("46379, " + 3 + ", " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	private static int method470( int arg0, char[] arg1) {
		try {
			for ( int local1 = arg0; local1 < arg1.length && local1 >= 0; local1++) {
				if (arg1[local1] >= '0' && arg1[local1] <= '9') {
					return local1;
				}
			}
			return -1;
		} catch ( RuntimeException local33) {
			signlink.reporterror("38534, " + 307 + ", " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	private static int method471( int arg0, char[] arg1) {
		try {
			int local12 = arg0;
			while (true) {
				if (local12 < arg1.length && local12 >= 0) {
					if (arg1[local12] >= '0' && arg1[local12] <= '9') {
						local12++;
						continue;
					}
					return local12;
				}
				return arg1.length;
			}
		} catch ( RuntimeException local37) {
			signlink.reporterror("11150, " + arg0 + ", " + 618 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	private static boolean method472( char arg0) {
		try {
			return !method474(arg0) && !method475(arg0);
		} catch ( RuntimeException local18) {
			signlink.reporterror("38425, " + arg0 + ", " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	private static boolean method473( char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch ( RuntimeException local36) {
			signlink.reporterror("90461, " + 2 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	private static boolean method474( char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch ( RuntimeException local20) {
			signlink.reporterror("76433, " + true + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	private static boolean method475( char arg0) {
		try {
			return arg0 >= '0' && arg0 <= '9';
		} catch ( RuntimeException local16) {
			signlink.reporterror("14158, " + arg0 + ", " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	private static boolean method476( char arg0, boolean arg1) {
		try {
			if (arg1) {
				throw new NullPointerException();
			}
			return arg0 >= 'a' && arg0 <= 'z';
		} catch ( RuntimeException local16) {
			signlink.reporterror("15875, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	private static boolean method477( char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch ( RuntimeException local14) {
			signlink.reporterror("20252, " + -217 + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	private static boolean method478( char[] arg0, int arg1) {
		try {
			boolean local3 = true;
			for ( int local5 = 0; local5 < arg0.length; local5++) {
				if (!method475(arg0[local5]) && arg0[local5] != '\u0000') {
					local3 = false;
				}
			}
			boolean local28 = false;
			if (local3) {
				return true;
			}
			int local36 = method479(arg0, (byte) 5);
			int local38 = 0;
			int local43 = anIntArray176.length - 1;
			if (local36 == anIntArray176[0] || local36 == anIntArray176[local43]) {
				return true;
			}
			do {
				int local61 = (local38 + local43) / 2;
				if (local36 == anIntArray176[local61]) {
					return true;
				}
				if (local36 < anIntArray176[local61]) {
					local43 = local61;
				} else {
					local38 = local61;
				}
			} while (local38 != local43 && local38 + 1 != local43);
			return false;
		} catch ( RuntimeException local90) {
			signlink.reporterror("8754, " + arg0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	private static int method479( char[] arg0, byte arg1) {
		try {
			if (arg0.length > 6) {
				return 0;
			}
			int local9 = 0;
			boolean local14 = false;
			for ( int local20 = 0; local20 < arg0.length; local20++) {
				char local31 = arg0[arg0.length - local20 - 1];
				if (local31 >= 'a' && local31 <= 'z') {
					local9 = local9 * 38 + local31 + 1 - 'a';
				} else if (local31 == '\'') {
					local9 = local9 * 38 + 27;
				} else if (local31 >= '0' && local31 <= '9') {
					local9 = local9 * 38 + local31 + 28 - '0';
				} else if (local31 != '\u0000') {
					return 0;
				}
			}
			return local9;
		} catch ( RuntimeException local90) {
			signlink.reporterror("19292, " + arg0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
