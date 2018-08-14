import java.util.Scanner;

public class SistemGajiPNS1 {
	public static void main (String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		int mkg;
		long nip;
		double gator, gajiNetto, ptkp = 0, pkp = 0, pph, pphTahun, tunjanganTambahanUmum,
		gajiNettoTahun, iuranPensiun, tunjanganUmum = 0, biayaJabatan, tunjanganStruktural = 0, 
		tunjanganFungsional = 0, tunjanganEselon = 0, gapok = 0, tunjanganStatus = 0, 
		gatot, jumlahAnak = 0, tunjanganBeras, jumlahJiwa = 1, tunjanganAnak = 0, temp, tunjanganPajak = 0,
		istriSuami = 0, tunjanganPulauTerpencil = 0, besarPangkat = 0, tunjanganPapua = 0, sewaRumah = 0, potonganBeras, iwp, tunggakan = 0, utang = 0, jumlahPotongan, bulat  ;

		int [] golIA = { 1402400, 1445500, 1492100, 1539100, 1587600, 1637600, 1689200, 1742400, 1797200, 1853800, 1912200, 1972400, 2034600, 2098600 } ;
		int [] golIB = { 1531500, 1579700, 1629500, 1650800, 1733700, 1788300, 1844700, 1902700, 1962700, 2024500, 2088300, 2154000, 2221900 };
		int [] golIC = { 1596300, 1646500, 1698400, 1751900, 1807100, 1864000, 1922700, 1983200, 2045700, 2110100, 2175600, 2245110, 2315800 };
		int [] golID = { 1663800, 1716200, 1770200, 1826000, 1883500, 1942800, 2004000, 2057100, 2132200, 2199400, 2258700, 2340100, 2413800 };
		int [] golIIA = { 1816900, 1845600, 1903700, 1963600, 2025500, 2089300, 2155100, 2223000, 2293000, 2365200, 2439700, 2516500, 2595800, 2677500, 2761900, 2848800, 2938600, 3031100 };
		int [] golIIB = { 1984200, 2046700, 2111200, 2177700, 2246200, 2317000, 2390000, 2465200, 2542900, 2623000, 2709600, 2790800, 2878700, 2969300, 3062900, 3159300 };
		int [] golIIC = { 2068100, 2133300, 2200500, 2269800, 2341300, 2415000, 2491100, 2569500, 2650400, 2733900, 2820000, 2908800, 3000400, 3094900, 3192400, 3293000 };
		int [] golIID = { 2155600, 2223500, 2293500, 2365800, 2440300, 2517200, 2596400, 2678200, 2762600, 2849600, 2939300, 3031900, 3127400, 3225900,3327500, 3432300 };
		int [] golIIIA = { 2317600, 2390600, 2465900, 2543500, 2623600, 2708200, 2708300, 2791500, 2879400, 2970100, 3063600, 3160100, 3259700, 3362300, 3468200, 3577400, 3690100, 3806300 };
		int [] golIIIB = { 2415600, 2491700, 2570200, 2651100, 2734600, 2820700, 2909600, 3001200, 3095700, 3193200, 3293800, 3397500, 3504500, 3614900, 3728800, 3846200, 3967300 };
		int [] golIIIC = { 2517800, 2597100, 2678900, 2763300, 2850300, 2940000, 3032600, 3128200, 3226700, 3328300, 3433100, 3541300, 3652800, 3767800, 3886500, 4008900, 4135200 };
		int [] golIIID = { 2624300, 2706900, 2792200, 2880100, 2970800, 3064400, 3168900, 3260500, 3363200, 3469100, 3578400, 3691100, 3807300, 3927200, 4080900, 4178500, 4310100 };
		int [] golIVA = { 2733300, 2821400, 2910300, 3002000, 3096500, 3194000, 3294600, 3398400, 3505400, 3615800, 3729700, 3847200, 3968300, 4093300, 4222300, 4355200, 4492400 };
		int [] golIVB = { 2851000, 2940800, 3033408, 3128900, 3227500, 3329100, 3434000, 3542200, 3653700, 3768800, 3887800, 4009900, 4136200, 4266500, 4400900, 4539500, 4632400 };
		int [] golIVC = { 2971600, 3065200, 3161700, 3261300, 3364000, 3470000, 3579300, 3692000, 3808300, 3928200, 4031900, 4179500, 4311200, 4447000, 4587000, 4731500, 4880500 };
		int [] golIVD = { 3097300, 3194800, 3295500, 3399300, 3306300, 3616700, 3730700, 3848200, 3969400, 4094400, 4223300, 4356300, 4493500, 4635100, 4781000, 4931600, 5086900 };
		int [] golIVE = { 3228300, 3330000, 3434900, 3543000, 3654600, 3769700, 3888500, 4010900, 4137300,  4257600, 4402000, 4402000, 4540600, 4683600, 4831100, 4983300, 5140200, 5302100 };

		System.out.println("=========================");
		System.out.println("Sistem Penggajian PNS");
		System.out.println("=========================");
		System.out.print("Masukan Nama Anda \t: ");
		String nama = keyboard.next();
		System.out.print("Masukan NIP anda \t: ");
		nip = keyboard.nextLong();
		System.out.print("Masukan Golongan anda \t: ");
		String gol = keyboard.next();
		System.out.print("Masukan Masa Kerja anda \t: ");
		mkg = keyboard.nextInt();
		System.out.print("Apakah anda sudah menikah ? (sudah/belum) \t: ");
		String status = keyboard.next();
		System.out.print("Apakah anda sudah memiliki anak ? (sudah/belum) \t: ");
		String anak = keyboard.next();
			if (anak.equals ("sudah")) {
					System.out.print("Berapa jumlah anak kandung anda ? \t: " );
					jumlahAnak = keyboard.nextInt();
				}
		System.out.print("Masukan daerah dinas anda \t: ");
		String daerah = keyboard.next();
		System.out.print("Masukan Profesi/Jabatan anda \t: ");
		String profesiJabatan = keyboard.next();
		System.out.print("Masukan jumlah Tunggakan anda \t: ");
		tunggakan = keyboard.nextInt();
		System.out.print("Masukan Jumlah Utang anda \t: ");
		utang = keyboard.nextInt();

		//Gaji Pokok
		if (gol.equals ("IA")) {
				gapok = golIA[mkg]; 
				}
			else if (gol.equals ("IB")) {
				gapok = golIB[mkg];
				}
			else if (gol.equals ("IC")) {
				gapok = golIC[mkg];
			}
			else if (gol.equals ("ID")) {
				gapok = golID[mkg];
			}
			else if (gol.equals ("IIA")) {
				gapok = golIIA[mkg];
			}
			else if (gol.equals ("IIB")) {
				gapok = golIIB[mkg];
			}
			else if (gol.equals ("IIC")) {
				gapok = golIIC[mkg];
			}
			else if (gol.equals ("IID")) {
				gapok = golIID[mkg];
			}
			else if (gol.equals ("IIIA")) {
				gapok = golIIIA[mkg];
			}
			else if (gol.equals ("IIIB")) {
				gapok = golIIIB[mkg];
			}
			else if (gol.equals ("IIIC")) {
				gapok = golIIIC[mkg];
			}
			else if (gol.equals ("IVA")) {
				gapok = golIVA[mkg];
			}
			else if (gol.equals ("IVB")) {
				gapok = golIVB[mkg];
			}
			else if (gol.equals ("IVC")) {
				gapok = golIVC[mkg];
			}
			else if (gol.equals ("IVD")) {
				gapok = golIVD[mkg];
			}
			else if (gol.equals ("IVE")) {
				gapok = golIVE[mkg];
			}

		//Tunjangan Suami/Istri
		if ( status.equals ("sudah")) {
			jumlahJiwa = 2;
			tunjanganStatus = (gapok * 0.1);
		}
		else if ( status.equals ("belum")) {
			jumlahJiwa = 1;
			tunjanganStatus = 0;
		}

		//Tunjangan anak
		if (anak.equals ("sudah")) {
			if (jumlahAnak == 1 ) {
				jumlahAnak = 1;
				jumlahJiwa = jumlahJiwa + 1;
			}
			else if (jumlahAnak == 2 ) {
				jumlahAnak = 2;
				jumlahJiwa = jumlahJiwa + 2;
			}
			else if (jumlahAnak >= 3 ) {
				jumlahAnak = 2;
				jumlahJiwa = jumlahJiwa + 3;
			}
			else if (anak.equals ("belum")) {
				jumlahAnak = 0;
				jumlahJiwa = jumlahJiwa + 0;
			}
		}

		//Daerah dinas
		if (daerah.equals ("papua")) {
			tunjanganPulauTerpencil = gapok;
			tunjanganPapua = tunjanganPulauTerpencil + gapok;
		}
		else if (daerah.equals ("jawa") || daerah.equals ("madura") || daerah.equals ("bali")) {
			tunjanganPulauTerpencil = 0;
			tunjanganPapua = 0;
		}else  {
			tunjanganPulauTerpencil = gapok;
			tunjanganPapua = 0;
		}

		//Tunjangan Struktural, Fungsional, Umum
		if ( profesiJabatan.equals ("eselon")) {
			tunjanganFungsional = 0;
			tunjanganStruktural = gapok;
			tunjanganUmum = 0;
		}
		else if ( profesiJabatan.equals ("dokter") || profesiJabatan.equals ("guru") || profesiJabatan.equals ("dosen")) {
			tunjanganFungsional = gapok;
			tunjanganStruktural = 0;
			tunjanganUmum = 0;
		}
		else if ( profesiJabatan.equals ("umum")) {
			tunjanganFungsional = 0;
			tunjanganStruktural = 0;
			tunjanganUmum =gapok;
		}

		//PTKP
		if ( jumlahJiwa == 1) {
				ptkp = 36000000;
			}	
			else if ( jumlahJiwa == 2 ) {
				ptkp = 3000000 + 36000000;
			}
			else if ( jumlahJiwa == 3 ) {
				ptkp = 3000000 + 3000000 + 36000000;
			}
			else if ( jumlahJiwa == 4 ) {
				ptkp = 3000000 + 3000000 + 3000000 + 36000000;
			}
			else if ( jumlahJiwa >= 5 ) {
				ptkp = 3000000 + 3000000 + 3000000 + 3000000 + 36000000;
			}



			tunjanganAnak = (gapok * 0.02) * jumlahAnak;
			tunjanganBeras = 10000 * jumlahJiwa * 10 ;
			//tunjanganTambahanUmum = gapok + tunjanganStatus + tunjanganUmum + tunjanganBeras;
			gator = gapok + tunjanganStatus + tunjanganAnak + tunjanganBeras + tunjanganPapua + tunjanganPulauTerpencil + tunjanganStruktural + tunjanganFungsional + tunjanganUmum ;
			biayaJabatan = (0.05 * gator );
			iuranPensiun = (0.0475 * (gapok + tunjanganStatus + tunjanganAnak));
			gajiNetto = gator - biayaJabatan - iuranPensiun ;
			gajiNettoTahun = gajiNetto * 12;
			

			if ( gajiNettoTahun > ptkp ) {
				pkp = gajiNettoTahun - ptkp;
				pphTahun = 0.05 * pkp;
				pph = pphTahun / 12;
			}
			else {
				pph = 0;
			}

			iwp = 0.1 * (tunjanganAnak + tunjanganStatus + gapok);
			sewaRumah = 400000;
			potonganBeras = tunjanganBeras;
			jumlahPotongan = pph + iwp + sewaRumah + tunggakan + utang + potonganBeras; 
			gatot = gator - jumlahPotongan ;
			//bulat = gatot - ( gatot / 100) * 100;

			System.out.println(" ");
			System.out.println("=========================================");
			System.out.println("Nama : " +nama);
			System.out.println("NIP :  " +nip);
			System.out.println("Status Menikah : " +status);
			System.out.println("Jumlah anak : " +jumlahAnak);
			System.out.println("=========================================");
			System.out.println("PENGHASILAN");
			System.out.println("Gaji Pokok anda adalah                                    : Rp. " +gapok);
			System.out.println("Tunjangan Suami/Istri anda adalah                         : Rp. " +tunjanganStatus);
			System.out.println("Tunjangan Anak anda adalah                                : Rp. " +tunjanganAnak);
			System.out.println("Tunjangan Beras anda adalah                               : Rp. " +tunjanganBeras);
			System.out.println("Tunjangan Papua anda adalah                               : Rp. " +tunjanganPapua);
			System.out.println("Tunjangan Pulau Terpencil anda adalah                     : Rp. " +tunjanganPulauTerpencil);
			System.out.println("Tunjangan Fungsional anda adalah                          : Rp. " +tunjanganFungsional+ " ");
			System.out.println("Tunjangan Struktural anda adalah                          : Rp. " +tunjanganStruktural+ " ");
			System.out.println("Tunjangan Umum anda adalah                                : Rp.  " +tunjanganUmum+ " ");
			//System.out.println("Tunjangan Tambahan Umum anda adalah Rp.  " +tunjanganTambahanUmum+ " ");
			System.out.println("=========================================");
			System.out.println("POTONGAN");
			System.out.println("Tunjangan Pajak anda adalah                               : Rp.  " +pph);
			System.out.println("Potongan sewa rumah anda adalah                           : Rp.  " +sewaRumah);
			System.out.println("Potongan Iuran Wajib Pegawai anda adalah                  : Rp.  " +iwp);
			System.out.println("Potongan Tunggakan anda adalah                            : Rp.  " +tunggakan);
			System.out.println("Potongan Utang anda adalah                                : Rp.  " +utang);
			System.out.println("Potongan Lain-lain anda adalah                            : Rp.  ");
			System.out.println("Potongan Beras anda adalah                                : Rp.  " +potonganBeras);
			System.out.println("Jumlah Potongan anda adalah                               : Rp.  " +jumlahPotongan);
			System.out.println("=========================================");
			System.out.println("GAJI TOTAL");
			System.out.println("Gaji total anda adalah                                    : Rp. " +gatot+ " ");

	} 
}