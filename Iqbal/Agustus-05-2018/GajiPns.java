import java.util.Scanner;
public class GajiPns{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] umum = {175000 , 180000 , 185000 , 190000};
		int jumlahTunjanganFungsi = 1350000;
		int[] struktur = {5500000 , 4375000 , 3250000 , 2025000 , 1260000 , 980000 , 540000 , 490000 , 360000};
		int[][] jumlahTunjanganPapua = {{200000 , 225000 , 250000 , 275000} , {300000 , 325000 , 350000 , 375000} , {425000 , 45000 , 475000 , 500000} , {525000 , 550000 , 575000 , 600000 , 625000} };
		int[] taperum = {3000 , 5000 , 7000 , 10000};
		int[][][] gajiGolongan = {
									//Golongan1
									{	/*A*/{1486500 , 1533400 , 1581700 , 1631500 , 1682900 , 1735900 , 1790500 , 1846900 , 1905100 , 1965100 , 2027000 , 2090800 , 2156700 , 2224600} ,
										/*B*/{1623400 , 1674500 , 1727300 , 1781700 , 1837800 , 1895700 , 1955400 , 2016900 , 2080500 , 2146000 , 2213600 , 2283300 , 2355200} ,
										/*C*/{1692100 , 1745400 , 1800300 , 1857000 , 1915500 , 1975800 , 2038100 , 2102300 , 2168500 , 2236800 , 2307200 , 2379900 , 2454800} ,
										/*D*/{1763600 , 1819200 , 1876500 , 1935600 , 1996500 , 2059400 , 2124300 , 2191200 , 2260200 , 2331400 , 2404800 , 2480500 , 2558700}
									},	
									//Golongan2
									{
										/*A*/{1926000 , 1956300 , 2017900 , 2081500 , 2147000 , 2214700 , 2284400 , 2356400 , 2430600 , 2507100 , 2586100 , 2667500 , 2751600 , 2838200 , 2927600 , 3019800 , 3114900 , 3213000} ,
										/*B*/{2103300 , 2169500 , 2237900 , 2308300 , 2381100 , 2456000 , 2533400 , 2613200 , 2695500 , 2780400 , 2867900 , 2958300 , 3051400 , 3147600 , 3246700 , 3348900 } ,
										/*C*/{2192300 , 2261300 , 2332500 , 2406000 , 2481800 , 2559900 , 2640600 , 2723700 , 2809500 , 2898000 , 2989300 , 3083400 , 3180500 , 3280700 , 3384000 , 3490600 } ,
										/*D*/{2285000 , 2357000 , 2431200 , 2507800 , 2586700 , 2668200 , 2752300 , 2838900 , 2928300 , 3020600 , 3115700 , 3213800 , 3315100 , 3419500 , 3527200 , 3638200}
									},
									//Golongan3
									{
										/*A*/{2456700 , 2534000 , 2613800 , 2696200 , 2781100 , 2868700 , 2959000 , 3052200 , 3148300 , 3247500 , 3349800 , 3455300 , 3564100 , 3676400 , 3792100 , 3911600 , 4034800} ,
										/*B*/{2560600 , 2641200 , 2724400 , 2810200 , 2898700 , 2990000 , 3084200 , 3181300 , 3281500 , 3384900 , 3491500 , 3601400 , 3714900 , 3831900 , 3952600 , 4077000 , 4205400} ,
										/*C*/{2668900 , 2752900 , 2839700 , 2929100 , 3021300 , 3116500 , 3214700 , 3315900 , 3420300 , 3528100 , 3639200 , 3753800 , 3872000 , 3994000 , 4119700 , 4249500 , 4383300} ,
										/*D*/{2781800 , 2869400 , 2959800 , 3053000 , 3149100 , 3248300 , 3350600 , 3456200 , 3565000 , 3677300 , 3793100 , 3912600 , 4035800 , 4162900 , 4294000 , 4429300 , 4568800}	
									},
									//Golongan4
									{
										/*A*/{2899500 , 2990800 , 3085000 , 3182100 , 3282400 , 3385700 , 3492400 , 3602400 , 3715800 , 3832800 , 3953600 , 4078100 , 4206500 , 4339000 , 4475700 , 4616600 , 4762000} ,
										/*B*/{3022100 , 3117300 , 3215500 , 3316700 , 3421200 , 3528900 , 3640100 , 3754700 , 3873000 , 3995000 , 4120800 , 4250600 , 4384400 , 4522500 , 4665000 , 4811900 , 4963400} ,
										/*C*/{3149900 , 3249100 , 3351500 , 3457000 , 3565900 , 3678200 , 3794100 , 3913600 , 4036800 , 4164000 , 4295100 , 4430400 , 4569900 , 4713800 , 4862300 , 5015400 , 5173400} ,
										/*D*/{3283200 , 3386600 , 3493200 , 3603300 , 3716700 , 3833800 , 3954600 , 4079100 , 4207600 , 4340100 , 4476800 , 4617800 , 4763200 , 4913200 , 5068000 , 5227600 , 5392200} ,
										/*E*/{3422100 , 3529800 , 3641000 , 3755700 , 3874000 , 3996000 , 4121800 , 4251600 , 4385600 , 4523700 , 4666100 , 4813100 , 4964700 , 5121100 , 5282300 , 5448700 , 5620300}
									}

								};
								
		int jumlahAnak = 0 , jumlahKeluarga = 1 , hargaBeras =10000;
		double  gajiPokok = 0 , tunjanganPasangan = 0 , tunjanganAnak = 0 , tunjanganUmum = 0 , tunjanganTambahan = 0 , tunjanganFungsi = 0 , tunjanganStruktur = 0;
		double tunjanganPapua = 0 , tunjanganPulauTerpencil = 0 , tunjanganLain = 0 , tujanganBulat = 0 , tunjanganBeras = 0 , tunjanganBulat = 0 , tunjanganPajak = 0 ;
		String punyaPasangan , punyaAnak = " ";
		String namaTunjanganLain = " ";
		double sewaRumah = 0 , jumlahTunggakan = 0 , hutang = 0 , lainLain = 0 , potonganBeras = 0,  potonganPPH , iwp;
		String namaTunggakan =" " , namaLainLain = " ";

		// Input Nama & Validasi
		System.out.println("Nama      : ");		  
		String nama = input.nextLine();
 		while((nama.length() >= 35 && nama.length() < 1 )|| !nama.matches("[a-zA-Z_ ]+")){
			System.out.println("Nama Terlalu Panjang/Ada Angka ulangi!");	
			System.out.println("Nama      : ");
			nama = input.nextLine();
		}
		// Input Nip & Validasi
		System.out.println("NIP 	  : ");
		String nip = input.nextLine();
		while(nip.length() != 18 || !nip.matches("[0-9]+")){	
			System.out.println("NIP Salah Ulangi!");
			System.out.println("NIP 	  : ");
			nip = input.nextLine();
		}
		// Input Golongan & Validasi
		System.out.println("Golongan  : ");
		String golongan = input.next().toLowerCase();
		while(!golongan.equals("1a") && !golongan.equals("1b") && !golongan.equals("1c") && !golongan.equals("1d") && !golongan.equals("2a") && !golongan.equals("2b") && !golongan.equals("2c") && !golongan.equals("2d") && !golongan.equals("3a") && !golongan.equals("3b") && !golongan.equals("3c") && !golongan.equals("3d") && !golongan.equals("4a") && !golongan.equals("4b") && !golongan.equals("4c") && !golongan.equals("4d") && !golongan.equals("4e")){
			System.out.println("Input golongan salah Ulangi!");
			System.out.println("Golongan  : ");
			golongan = input.next().toLowerCase();
		}
		int golonganKe = Integer.parseInt(golongan.substring(0,1));
		String huruf = golongan.substring(1);
		// Input Masa Kerja & Penentuan Batas Masa Kerja
		int batasMasakerjaAwal = 0 , batasMasakerjaAkhir = 33;
		if(golonganKe == 1 && huruf.equals("a")){
			batasMasakerjaAwal= 0;
			batasMasakerjaAkhir = 27;
		}
		else if(golonganKe == 1 && !huruf.equals("a")){
			batasMasakerjaAwal = 3;
			batasMasakerjaAkhir=27;
		}
		else if(golonganKe == 2 && huruf.equals("a")){
			batasMasakerjaAwal = 0;
			batasMasakerjaAkhir = 33;
		}
		else if(golonganKe == 2 && !huruf.equals("a")){
			batasMasakerjaAwal = 3;
			batasMasakerjaAkhir = 33;
		}
		else{
			batasMasakerjaAwal = 0;
			batasMasakerjaAkhir = 32;
		}	
		System.out.println("Masa Kerja: ");
		int masaKerja = input.nextInt();
		
		while(masaKerja < batasMasakerjaAwal || masaKerja > batasMasakerjaAkhir ){
			System.out.println("Mungkin Anda Sudah Pensiun Atau Belum pns coba lagi!");
			System.out.println("Masa Kerja: ");
			masaKerja = input.nextInt();
		}
		
		// Input & Validasi Menikah
		System.out.println("Apakah Anda Sudah Menikah ? (y/n)");
		String pasangan = input.next();
		while(!pasangan.equals("y") && !pasangan.equals("n")){
			System.out.println("Jawaban Salah hanya (y/n)");
			pasangan = input.next();
		}
		// Input Punya anak
		System.out.println("Punya Berapa anak :");
		String anaku = input.next();
		while(!anaku.matches("[0-9]+")){	
			System.out.println("Kamu Gila Ulangi!!");
			System.out.println("Jumlah Anak 	 : ");
			anaku = input.next();
		}
		int anak = Integer.parseInt(anaku);
		// Input & Validasi Jenis Pns
		System.out.println("Apakah Anda Pns (Profesi/Jabatan/Umum)");
		String jawabTunjangan = input.next().toLowerCase();
		while(!jawabTunjangan.equals("profesi") && !jawabTunjangan.equals("jabatan") &&  !jawabTunjangan.equals("umum")){
			System.out.println("Jawaban Salah hanya (Profesi/Jabatan/Umum)");
			jawabTunjangan = input.next().toLowerCase();
		}
		if(jawabTunjangan.equals("profesi")){
			tunjanganFungsi += jumlahTunjanganFungsi ;	
		}
		else if(jawabTunjangan.equals("jabatan")){
			System.out.println("Masukan Golongan Anda (1-9)");
			int jawabJabatan = input.nextInt();
			tunjanganStruktur += struktur[(jawabJabatan-1)];
		}
		else if(jawabTunjangan.equals("umum")){
			tunjanganUmum += umum[(golonganKe-1)];

		}
		else{
			System.out.println("Jawaban Salah Coba Lagi!");
		}
		// Input Pulau
		System.out.println("Di Pulau apa Anda Bekerja :");
		String pulau = input.next().toLowerCase();

		// Input dan Validasi Tunjangan
		System.out.println("Apakah ada Tunjangan Lain(y/n)");
		String jawabanLain = input.next().toLowerCase();
		while(!jawabanLain.equals("y") && !jawabanLain.equals("n")){
			System.out.println("Jawaban Salah hanya (y/n)");
			jawabanLain = input.next();
		}
		if(jawabanLain.equals("y")){
			System.out.println("Tunjangan Apa itu :");
			namaTunjanganLain = input.next();
			System.out.println("Berapa Jumlahnya");
			System.out.print("Rp : ");
			tunjanganLain = input.nextInt();
			
		}

		// Input dan Validasi Rumah Dinas
		System.out.println("Apakah Kamu Sewa Rumah Dinas(y/n)");
		String rumah = input.next().toLowerCase();
		while(!rumah.equals("y") && !rumah.equals("n")){
			System.out.println("Jawaban Salah hanya (y/n)");
			rumah = input.next();
		}

		// Input dan Validasi tunggakan
		System.out.println("Apakah Kamu Punya Tunggakan(y/n)");
		String tunggakan = input.next().toLowerCase();
		while(!tunggakan.equals("y") && !tunggakan.equals("n")){
			System.out.println("Jawaban Salah hanya (y/n)");
			tunggakan = input.next();
		}
		if(tunggakan.equals("y")){
			System.out.println("Tunggakan Apa :");
			namaTunggakan = input.next();
			System.out.println("Jumlah Tunggakan :");
			jumlahTunggakan = input.nextDouble();
		}

		// Input dan Validasi Utang
		System.out.println("Apakah Kamu Punya Utang(y/n)");
		String jawabanHutang = input.next().toLowerCase();
		while(!jawabanHutang.equals("y") && !jawabanHutang.equals("n")){
			System.out.println("Jawaban Salah hanya (y/n)");
			jawabanHutang = input.next();
		}
		if(jawabanHutang.equals("y")){
			System.out.println("Berapa Jumlah Utang nya :");
			hutang = input.nextInt();
		}

		// Input dan Validasi Potongan Lain
		System.out.println("Apakah Masih ada Potongan lain (Y/N)");
		String lainlain = input.next().toLowerCase();
		while(!lainlain.equals("y") && !lainlain.equals("n")){
			System.out.println("Jawaban Salah hanya (y/n)");
			lainlain = input.next();
		}
		if(lainlain.equals("y")){
			System.out.println("Potongan apa :");
			namaLainLain = input.next();
			System.out.println("Berapa Jumlahnya :");
			lainLain = input.nextInt();	
		}

		//Tunjangan Beras Input & Validasi
		System.out.println("apakah Tunjangan Beras menggunakan uang(y/n)");
		String tunjanganberas = input.next();
		while(!tunjanganberas.equals("y") && !tunjanganberas.equals("n")){
			System.out.println("Jawaban Salah hanya (y/n)");
			tunjanganberas = input.next();
		}


		// Fungsi Penentuan Pasangan
		if(pasangan.equals("y") || pasangan.equals("Y")){
			punyaPasangan = "y";
			
		}
		else{
			punyaPasangan = "n";
		}
		//Fungsi Jumlah Anak
		if(anak != 0){
				punyaAnak = "y";
				jumlahAnak += anak ;
				jumlahKeluarga += anak;
		}
		
		
		// Mencari Index Golongan Untuk Gaji Pokok				
		int indexGolonganKe = golonganKe - 1;
		int golonganHuruf = 0 ;
		
		//Penentuan Index
		switch(huruf){
			case "a" : golonganHuruf = 0;
					   break ;
			case "b" : golonganHuruf = 1;
			 		   break ;
			case "c" : golonganHuruf = 2;
					   break ;
			case "d" : golonganHuruf = 3;
					   break ;
			case "e" : golonganHuruf = 4;
					   break ;		   		   	   		   
		}
		if(indexGolonganKe == 0 ){
			if(masaKerja == 0){
				masaKerja++;
			}
			if(golonganHuruf == 0){
				if(masaKerja % 2 != 0){
					masaKerja = (masaKerja + 1)/2 - 1;
				}
				else{
					masaKerja = masaKerja/2;
				}	
			}
			else{
				if(masaKerja < 3){
					System.out.println("Mungkin Golongan yang anda masukan salah");
					
				}
				if(masaKerja % 2 != 0){
					masaKerja = (masaKerja+1)/2-2;
				}
				else{
					masaKerja = masaKerja/2-2;
				}
			}
		}
		else if(indexGolonganKe == 1){
			if(golonganHuruf == 0){
				if(masaKerja == 0){
				masaKerja = 0 ;
				}
				else if(masaKerja % 2 != 0){
					masaKerja = (masaKerja+1)/2;
				}
				else{
					masaKerja = masaKerja/2; 
				}
			}
			else{
				if(masaKerja < 3){
					System.out.println("Mungkin Golongan yang anda masukan salah");
					
				}
				if(masaKerja % 2 != 0){
					masaKerja = (masaKerja+1)/2-2;
				}
				else{
					masaKerja = masaKerja/2-2;
				}
			}
		}
		else{
			if(masaKerja % 2 != 0){
				masaKerja = (masaKerja + 1)/2 - 1;
			}
			else{
				masaKerja = masaKerja/2;
			}
		}
			/*
		*/	
		//Pencarian Gaji Pokok dengan index yang sudah dicari	
		gajiPokok = gajiGolongan[indexGolonganKe][golonganHuruf][masaKerja];
		//Mencari Tunjangan Pasangan
		if(punyaPasangan.equals("y")){
			tunjanganPasangan = gajiPokok*0.10;
			jumlahKeluarga++;
		}
		//Mencari Tunjangan Anak
		if(punyaAnak.equals("y")){
			if(jumlahAnak == 1){
				tunjanganAnak = gajiPokok*0.02;
			}
			else if(jumlahAnak >= 2){
				tunjanganAnak = gajiPokok*0.04;
			}
			else{
				System.out.println("Tidak Punya anak");
			}									
		}
		//Mencari Tunjangan Pulau
			if(pulau.equals("jawa") || pulau.equals("madura") || pulau.equals("bali")){
				tunjanganPulauTerpencil=0;
			}
			else{
				tunjanganPulauTerpencil+=gajiPokok;
			}

			if(pulau.equals("papua")){
				tunjanganPapua += jumlahTunjanganPapua[indexGolonganKe][golonganHuruf];
			}

		
		// Mencari Tunjangan Keluarga
		if(jumlahKeluarga >= 4){
			tunjanganBeras += (hargaBeras*10)*4; 
		}
		else if(jumlahKeluarga < 4 && jumlahKeluarga>0){
			tunjanganBeras += (hargaBeras*10)*jumlahKeluarga;
		}	

		//Cari Pajak
		double bruto , neto , netoPertahun ,  biayaJabatan = 0 , biayaPensiun , ptkp = 36000000 , ptkpPerorang = 3000000 , pkp = 0 , pphPertahun = 0, pphPerbulan = 0 ;
		bruto = gajiPokok+tunjanganPasangan+tunjanganAnak+tunjanganUmum+tunjanganPapua+tunjanganPulauTerpencil+tunjanganStruktur+tunjanganFungsi+tunjanganBeras+tunjanganLain;
		double biayaJabat = bruto*0.05;
		if(biayaJabat> 500000){
			biayaJabatan += 500000;
		}
		else{
			biayaJabatan+= biayaJabat;
		}
		biayaPensiun = (gajiPokok+tunjanganPasangan+tunjanganAnak)*0.0475;
		neto = bruto - (biayaJabatan+biayaPensiun);
		netoPertahun = neto*12;
		if((jumlahKeluarga-1) >= 4){
			ptkp += ptkpPerorang*4;
		}
		else{
		   ptkp += (jumlahKeluarga-1)*ptkpPerorang;
		}
		double pkpSementara = netoPertahun - ptkp;
		if(pkpSementara < 0){
			pkp += 0 ;
		}
		else{
			pkp += pkpSementara;
		}
		if(pkp == 0){
			pphPerbulan= 0 ;
		}
		else{
			pphPertahun += pkp*0.05;
			pphPerbulan =  pphPertahun/12;
		}
		tunjanganPajak += pphPerbulan;
		//Jumlh Kotor
		double jumlahKotor = gajiPokok+tunjanganPasangan+tunjanganAnak+tunjanganUmum+tunjanganPapua+tunjanganPulauTerpencil+tunjanganStruktur+tunjanganFungsi+tunjanganBeras+tunjanganPajak;
		//Cari tunjangan Bulat
		double sisa = jumlahKotor-100;
		while(sisa>=100){
				sisa -= 100;
		}
		tunjanganBulat = 100-sisa;
		if(jumlahKotor<2000000){
			tunjanganTambahan = 2000000 - jumlahKotor;
		}
		double gajiKotor = jumlahKotor + tunjanganTambahan + tunjanganBulat ;
		//Pengeluaran
		//Sewa Rumah Atau Tidak
		if(rumah.equals("y")){
			sewaRumah = 400000;
		}		
		//Beras atau uang
		if(tunjanganberas.equals("n")){
			potonganBeras = tunjanganBeras;
		}
		double jumlahTaperum = taperum[indexGolonganKe];
		potonganPPH = tunjanganPajak ;
		iwp = 0.1*(gajiPokok+tunjanganAnak+tunjanganPasangan);
		System.out.println("======================================");
		System.out.println("====          SELIP GAJI          ====");
		System.out.println("======================================");
		System.out.println("NAMA : " + nama.toUpperCase() + " | NIP : "+nip);
		System.out.println("======================================");
		System.out.println("Penghasilan :");
		System.out.println("Gaji Pokok             	   : Rp. "+gajiPokok);
		System.out.println("Tunjangan Pasangan   	   : Rp. "+tunjanganPasangan);
		System.out.println("Tunjangan Anak       	   : Rp. "+tunjanganAnak);
		System.out.println("Tunjangan Umum             : Rp. "+tunjanganUmum);
		System.out.println("Tunjangan Papua 	   : Rp. "+tunjanganPapua);
		System.out.println("Tunjangan Pulau Terpencil  : Rp. "+tunjanganPulauTerpencil);
		System.out.println("Tunjangan Struktur 	   : Rp. "+tunjanganStruktur);
		System.out.println("Tunjangan Fungsi 	   : Rp. "+tunjanganFungsi);
		System.out.println("Tunjangan Beras 	   : Rp. "+tunjanganBeras);
		System.out.println("Tunjangan Bulat 	   : Rp. "+tunjanganBulat);
		System.out.println("Tunjangan Pajak 	   : Rp. "+tunjanganPajak);
		System.out.println("Tunjangan Tambahan Umum: Rp. "+tunjanganTambahan);
		System.out.println("Tunjangan Lain("+namaTunjanganLain +"): Rp. "+tunjanganLain);
		System.out.println("======================================");
		System.out.println("Jumlah Penghasilan Kotor : Rp. "+gajiKotor);
		System.out.println("Pengeluaran :");
		System.out.println("Potongan Beras 			   : Rp. "+potonganBeras);
		System.out.println("Potongan IWP 			   : Rp. "+iwp);
		System.out.println("Potongan PPH 			   : Rp. "+potonganPPH);
		System.out.println("Sewa Rumah 			   : Rp. "+sewaRumah);
		System.out.println("Tunggakan("+namaTunggakan+")	   		 : Rp. "+jumlahTunggakan );
		System.out.println("Utang				   : Rp. "+hutang);
		System.out.println("Potongan Lain("+namaLainLain+")		    : Rp. "+lainLain);
		System.out.println("Taperum 			   : Rp. "+jumlahTaperum);
		double jumlahPotongan = potonganBeras+iwp+potonganPPH+sewaRumah+jumlahTunggakan+hutang+jumlahTaperum;
		System.out.println("Jumlah Potongan 	  	   : Rp. "+jumlahPotongan);
		double gajiBersih = gajiKotor - jumlahPotongan;
		System.out.println("======================================");
		System.out.println("Gaji Yang Di Terima Rp. "+gajiBersih);
	}
}		