import java.util.*;

public class SPPNS{
	public static void main(String[] Args){
		Scanner input = new Scanner(System.in);

		//Gaji Pokok
		int[][] gajiAwal = {
			{1486500, 1623400, 1692100, 1763600}, //Golongan I
			{1926000, 2103300, 2192300, 2285000}, //Golongan II
			{2456700, 2560600, 2668900, 2781800}, //Golongan III			
			{2899500, 3022100, 3149900, 3283200, 3422100} //Golongan IV
		};

		int[] pendapatan = new int[5], tunjangan = new int[10], potongan = new int[10], golongan = new int[2],
			taperum = {3000, 5000, 7000, 10000};
		int anak, mkg, istri = 0, eselon = 0, totpot = 0;
		boolean terpencil = false, papua = false, sewaRumah = false;
		String nama, nip, menikah, answer, jenisJabatan, nativeGolongan, hutang="", tunjanganLain="", potonganLain="";



		/*  User Input  */

		// Nama
		System.out.print("Nama : ");
		nama = input.nextLine();
		if (nama.length() > 35) nama = nama.substring(0, 35);
		
		// NIP
		do{
			System.out.print("NIP : ");
			nip = input.nextLine();
			if (!isNumber(nip)) System.out.println("Invalid NIP !!");
		}while(!isNumber(nip));

		// Golongan
		do{
			System.out.print("Golongan (I/a): ");
			answer = input.nextLine();
			if (!answer.matches("(.*)/(.*)")) System.out.println("Invalid Golongan !!");
		}while(!answer.matches("(.*)/(.*)"));
		golongan = parseGolongan(answer);
		nativeGolongan = answer;

		// Masa Kerja Golongan 
		do{
			System.out.print("Masa Kerja Golongan : ");
			answer = input.nextLine();
			if (!isNumber(answer)) System.out.println("Invalid MKG !!");
		}while(!isNumber(answer));
		mkg = Integer.parseInt(answer);

		// Lokasi Dinas
		System.out.print("Masukan Lokasi Dinas : ");
		answer = input.nextLine();
		if (!answer.equals("jawa") && !answer.equals("bali") && !answer.equals( "manado") && !answer.equals("sumatera")) terpencil = true;
		if (answer.equals("papua")) papua = true;

		// Rumah Dinas
		do{
			System.out.print("Apakah anda tinggal di rumah dinas (y/n) ");
			answer = input.nextLine();
			if (!answer.equals("y") && !answer.equals("n")) System.out.println("Invalid Answer !! ");
		}while(!answer.equals("y") && !answer.equals("n"));
		if (answer.equals("y"))  sewaRumah = true;

		// Jenis Jabatan
		do{
			System.out.print("Apakah jenis jabatan anda ?\n I. Fungsional\n II. Struktural\n III. Umum\n> ");
			answer = input.nextLine();
			if (!answer.equals("I") && !answer.equals("II") && !answer.equals("III")) System.out.println("Invalid Answer !!");
		}while(!answer.equals("I") && !answer.equals("II") && !answer.equals("III"));
		jenisJabatan = answer;
		if (answer.equals("II")) {
			do{
				System.out.print("Eselon : ");
				answer = input.nextLine();
				if (!isNumber(answer) && Integer.parseInt(answer) > 5) System.out.println("Invalid Eselon !!");
			}while(!isNumber(answer) && Integer.parseInt(answer) > 5);
				eselon = Integer.parseInt(answer);
		}

		// Status pernikahan 
		do{
			System.out.print("Apakah anda sudah menikah (y/n) ");
			menikah = input.nextLine();
			if (!menikah.equals("y") && !menikah.equals("n")) System.out.println("Invalid Answer !!");
		}while(!menikah.equals("y") && !menikah.equals("n"));

		// Jumlah Anak
		do{
			System.out.print("Berapa Jumlah anak anda : ");
			answer = input.nextLine();
			if (!isNumber(answer)) System.out.println("Invalid Answer !!");
		}while(!isNumber(answer));
		anak = Integer.parseInt(answer);
		if(anak > 2) anak = 2;

		// Tunjangan Lain
		do{
			System.out.print("Apakah anda memiliki Tunjangan Lain (y/n) ");
			answer = input.nextLine();
			if (!answer.equals("y") && !answer.equals("n")) System.out.println("Invalid Answer !!");
		}while(!answer.equals("y") && !answer.equals("n"));
		if (answer.equals("y")) {
			System.out.print("Nama Tunjangan : ");
			tunjanganLain = input.nextLine();
			System.out.print("Nominal Tunjangan : ");
			tunjangan[8] = Integer.parseInt(input.nextLine());
		}

		// Hutang
		do{
			System.out.print("Apakah anda memiliki Hutang ? (y/n) ");
			answer = input.nextLine();
			if (!answer.equals("y") && !answer.equals("n")) System.out.println("Invalid Answer !!");
		}while(!answer.equals("y") && !answer.equals("n"));
		if (answer.equals("y")) {
			System.out.print("Nama Hutang : ");
			hutang = input.nextLine();
			System.out.print("Nominal Hutang : ");
			potongan[4] = Integer.parseInt(input.nextLine());
		}

		// Potongan Lain
		do{
			System.out.print("Apakah anda memiliki Potongan Lain ? (y/n) ");
			answer = input.nextLine();
			if (!answer.equals("y") && !answer.equals("n")) System.out.println("Invalid Answer !!");
		}while(!answer.equals("y") && !answer.equals("n"));
		if (answer.equals("y")) {
			System.out.print("Nama Potongan : ");
			potonganLain = input.nextLine();
			System.out.print("Nominal potongan : ");
			potongan[5] = Integer.parseInt(input.nextLine());
		}




		/*  Calculation  */
		pendapatan[0] = gajiPokok(nativeGolongan, mkg); //Gaji Pokok
		pendapatan[0] -= (100 - pembulatan(100, pendapatan[0]));

		int[] tj = tunjanganJabatan(jenisJabatan, golongan[0], eselon);
		tunjangan[0] = tj[0]; // Tunjangan Umum
		tunjangan[1] = tj[1]; // Tunjangan Struktural
		tunjangan[2] = tj[2]; // Tunjangan Fungsional
		if(menikah.equals("y")){
			tunjangan[3] = percentage(10.0, pendapatan[0]); // Tunjangan Suami Istri
			istri = 1;
		}
		tunjangan[4] = anak * percentage(2.0, pendapatan[0]); // Tunjangan anak
		if (papua) tunjangan[5] = tunjanganPapua(golongan); // Tunjangan Papua
		if (terpencil) tunjangan[6] = pendapatan[0]; // Tunjangan Pulau terpencil
		tunjangan[7] = (10 * 10000) * (1+anak+istri); // Tunjangan Beras

		pendapatan[1] = pendapatan[0]; // Gaji Kotor
		for (int i=0; i < tunjangan.length; i++) {
			pendapatan[1] += tunjangan[i];
		}
		pendapatan[1] += pembulatan(100, pendapatan[1]);

		potongan[1] = percentage(10.0, (pendapatan[0] + tunjangan[3]+ tunjangan[4])); // IWP
		potongan[2] = findPPH(findPKP(pendapatan, tunjangan, istri+anak)); // PPH
		if(sewaRumah) potongan[3] = 400000; // Sewa Rumah
		potongan[7] = taperum[golongan[0]]; // Taperum

		pendapatan[2] = pendapatan[1] + potongan[2]; // Gaji Bersih
		for (int i=0; i < potongan.length; i++) {
			pendapatan[2] -= potongan[i];
		}

		for (int i=0; i < potongan.length; i++) {
			totpot += potongan[i];
		}


		/*  Display Result  */
		System.out.println("========================================");
		System.out.println("Nama   : "+nama);
		System.out.println("NIP    : "+nip);
		System.out.println("----------------------------------------");
		System.out.println("Gaji Pokok\t: "+pendapatan[0]);
		System.out.println("T. Suami/Istri \t: "+tunjangan[3]);
		System.out.println("T. Anak \t: "+tunjangan[4]);
		System.out.println("T. Umum \t: "+tunjangan[0]);
		System.out.println("T. Papua\t: "+tunjangan[5]);
		System.out.println("T. P terpencil\t: "+tunjangan[6]);
		System.out.println("T. Struktural \t: "+tunjangan[1]);
		System.out.println("T. Fungsional \t: "+tunjangan[2]);
		if (pendapatan[1] < 2000000){
			System.out.println("T. T.Umum\t: "+(2000000 - pendapatan[1]));
			pendapatan[1] = 2000000;
		}
		System.out.println("T. Lain \t: ");
		if (tunjangan[8] != 0) System.out.println(" + "+tunjanganLain+" \t: "+tunjangan[8]); 
		System.out.println("T. Bulat \t: "+pembulatan(100, pendapatan[1]));
		System.out.println("T. Beras \t: "+tunjangan[7]);
		System.out.println("T. Pajak \t: "+potongan[2]);
		System.out.println("----------------------------------------");
		System.out.println("Jumlah Kotor\t:"+pendapatan[1]);
		System.out.println("----------------------------------------");
		System.out.println("Pot. Beras \t: "+potongan[0]);
		System.out.println("IWP\t\t: "+potongan[1]);
		System.out.println("Pot. PPH\t: "+potongan[2]);
		System.out.println("Sewa Rumah\t: "+potongan[3]);
		System.out.println("Hutang \t\t: ");
		if (potongan[4] != 0) System.out.println(" + "+hutang+" \t: "+potongan[4]); 
		System.out.println("Pot. Lain \t: ");
		if (potongan[5] != 0) System.out.println(" + "+tunjanganLain+" \t: "+potongan[5]); 
		System.out.println("Taperum \t: "+potongan[7]);
		System.out.println("----------------------------------------");
		System.out.println("Jumlah potongan\t:"+totpot);
		pendapatan[2] += pembulatan(100, pendapatan[2]);
		System.out.println("Jumlah Bersih\t:"+pendapatan[2]);
		System.out.println("========================================");



	}


	/* Function */


	// Check Number
	public static boolean isNumber(String s){
		try {
	        int d = Integer.parseInt(s);
	    } catch (NumberFormatException | NullPointerException nfe) {
	        return false;
	    }
	    return true;
	}

	//Determine Gaji Pokok
	public static int gajiPokok(String gol, int mkg){
		String[] golongan = gol.split("/");
		int gapok = 0;

		int[][] gaji = {
			//Golongan I
			{1486500, 1623400, 1692100, 1763600},
			//Golongan II
			{1926000, 2103300, 2192300, 2285000},
			//Golongan III
			{2456700, 2560600, 2668900, 2781800},
			//Golongan IIII
			{2899500, 3022100, 3149900, 3283200, 3422100}
		};

		if (golongan[0].equals("I")) {
			if (golongan[1].equals("a")) {
				gapok = gaji[0][0];
			}else if (golongan[1].equals("b")) {
				mkg -= 3;
				gapok = gaji[0][1];
			}else if (golongan[1].equals("c")) {
				mkg -= 3;
				gapok = gaji[0][2];
			}else if (golongan[1].equals("d")) {
				mkg -= 3;
				gapok = gaji[0][3];
			}	
		}else if (golongan[0].equals("II")) {
				mkg -= 3;
			if (golongan[1].equals("a")) {
				mkg += 3;
				gapok = gaji[1][0];
			}else if (golongan[1].equals("b")) {
				gapok = gaji[1][1];
			}else if (golongan[1].equals("c")) {
				gapok = gaji[1][2];
			}else if (golongan[1].equals("d")) {
				gapok = gaji[1][3];
			}	
		}else if (golongan[0].equals("III")) {
			if (golongan[1].equals("a")) {
				gapok = gaji[2][0];
			}else if (golongan[1].equals("b")) {
				gapok = gaji[2][1];
			}else if (golongan[1].equals("c")) {
				gapok = gaji[2][2];
			}else if (golongan[1].equals("d")) {
				gapok = gaji[2][3];
			}	
		}else if (golongan[0].equals("IV")) {
			if (golongan[1].equals("a")) {
				gapok = gaji[3][0];
			}else if (golongan[1].equals("b")) {
				gapok = gaji[3][1];
			}else if (golongan[1].equals("c")) {
				gapok = gaji[3][2];
			}else if (golongan[1].equals("d")) {
				gapok = gaji[3][3];
			}else if (golongan[1].equals("e")) {
				gapok = gaji[3][4];
			}	
		}

		for (int kenaikan = (mkg/2); kenaikan > 0; kenaikan--) {
			gapok += (gapok*315)/10000;
		}

		return gapok;
	}

	// Tunjangan Jabatan
	public static int[] tunjanganJabatan(String jj, int golongan, int es){
		int[] tunjanganUmum = {175000, 180000, 185000, 190000},
			tunjanganStruktur = {5500000, 3250000, 1260000, 540000, 360000},
			tunjangan = new int[3];
		if (jj.equals("I")) { tunjangan[2] = 1350000; }
		else if (jj.equals("II")) { tunjangan[1] = tunjanganStruktur[es-1]; }
		else if (jj.equals("III")) { tunjangan[0] = tunjanganUmum[golongan]; }
		return tunjangan;
	}

	//Tunjangan papua
	public static int tunjanganPapua(int[] golongan){
		int[][] tunjangan = {
			{200000, 225000, 250000, 275000}, 
			{300000, 325000, 350000, 375000},
			{425000, 450000, 475000, 500000},
			{525000, 550000, 575000, 600000, 625000}
		};
		return tunjangan[golongan[0]][golongan[1]];
	}

	//PPH
	public static int findPPH(int pkp){
		return percentage(5.0, pkp)/12;
	}

	public static int findPKP(int[] pendapatan, int[] tunjangan, int anggota){
		int kenaPajak = 0, biayaJabatan, iuranPensiun;
		biayaJabatan = percentage(5.0, pendapatan[1]);
		iuranPensiun = percentage(4.75, pendapatan[0]+tunjangan[4]+tunjangan[3]);
		kenaPajak = (12 * (pendapatan[1] - (biayaJabatan + iuranPensiun))) - (36000000 + (anggota*3000000));
		if (kenaPajak < 0) kenaPajak = 0;
		return kenaPajak;
	}

	//Parse Golongan
	public static int[] parseGolongan(String gol){
		String[] golString = gol.split("/");
		int[] golongan = new int[2];

		if (golString[0].equals("I")) {
			golongan[0] = 0;
		}else if (golString[0].equals("II")) {
			golongan[0] = 1;
		}else if (golString[0].equals("III")) {
			golongan[0] = 2;
		} else if (golString[0].equals("IV")) {
			golongan[0] = 3;
		}

		if (golString[1].equals("a")) {
			golongan[1] = 0;
		}else if (golString[1].equals("b")) {
			golongan[1] = 1;
		}else if (golString[1].equals("c")) {
			golongan[1] = 2;
		}else if (golString[1].equals("d")) {
			golongan[1] = 3;
		}else if (golString[1].equals("e")) {
			golongan[1] = 4;
		}
		return golongan;
	}

	//Percent Method
	public static int percentage(Double percent, int num){
		return (int)(num * percent)/100;
	}

	public static int pembulatan(int divider, int num){
		int pembulatan = num - ((num/divider)*divider);
		return divider - pembulatan;
	}
}