

public class Pns extends Karyawan implements GajiPokok , Tunjangan , Potongan{
	private int jabatanKu , jumlahAnak ;
	private String pilih1 , pilih2 , pilih3 , namaUtang = "Utang";
	double jumlahUtang , tunjanganFungsi , tunjanganPulauKecil , potonganBeras , potonganSewaRumah ;
	double[][][] gajiGolongan = {
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
	private String golongan , nip;
	
	public Pns() {
		super();

	}
	public void setNamaUtang(String nama) {
		namaUtang = nama;
	}
	public void setJumlahUtang(double jumlah) {
		jumlahUtang = jumlah;
	}
	public int getJumlahAnak() {
		return jumlahAnak;
	}

	public void setJumlahAnak(int jumlahAnak) {
		this.jumlahAnak = jumlahAnak;
	}

	public String getPilih1() {
		return pilih1;
	}

	public void setPilih1(String pilih1) {
		this.pilih1 = pilih1;
	}

	public String getPilih2() {
		return pilih2;
	}

	public void setPilih2(String pilih2) {
		this.pilih2 = pilih2;
	}

	public String getPilih3() {
		return pilih3;
	}

	public void setPilih3(String pilih3) {
		this.pilih3 = pilih3;
	}

	public int getJabatanKu() {
		return jabatanKu;
	}

	public void setJabatanKu(double tingkat) {
		this.jabatanKu = (int) tingkat;
	}
	public void setTunjanganKecil(String pulau) {
		if(pulau.equals("jawa") || pulau.equals("madura") || pulau.equals("bali") ) {
			tunjanganPulauKecil = 0;
		}
		else {
			tunjanganPulauKecil = getGapok();
		}
	}
	public String getGolongan() {
		return golongan;
	}
	public void setGolongan(String golongan) {
		this.golongan = golongan;
	}
	public int getTingkatGolongan() {
		return Integer.parseInt(getGolongan().substring(0, 1));
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	 //Behavior
	void setArrayList() {
		double Sementara;
		for(int index = 0 ; index < gajiGolongan.length ; index++) {
			for(int jumlah = 0 ; jumlah < gajiGolongan[0][index].length ; jumlah++) {
				if(index == 0){
					golongan1a.add((Double)gajiGolongan[0][index][jumlah]);
				}
				if(index == 1) {
					golongan1b.add((Double)gajiGolongan[0][index][jumlah]);
				}
				if(index == 2) {
					golongan1c.add((Double)gajiGolongan[0][index][jumlah]);
				}
				if(index == 3){
					golongan1d.add((Double)gajiGolongan[0][index][jumlah]);
				}
			}
		}
		for(int index = 0 ; index < gajiGolongan.length ; index++) {
			for(int jumlah = 0 ; jumlah < gajiGolongan[1][index].length ; jumlah++) {
				if(index == 0){
					golongan2a.add((Double)gajiGolongan[1][index][jumlah]);
				}
				if(index == 1) {
					golongan2b.add((Double)gajiGolongan[1][index][jumlah]);
				}
				if(index == 2) {
					golongan2c.add((Double)gajiGolongan[1][index][jumlah]);
				}
				if(index == 3) {
					golongan2d.add((Double)gajiGolongan[1][index][jumlah]);
				}
			}
		}
		for(int index = 0 ; index < gajiGolongan.length ; index++) {
			for(int jumlah = 0 ; jumlah < gajiGolongan[2][index].length ; jumlah++) {
				if(index == 0){
					golongan3a.add((Double)gajiGolongan[2][index][jumlah]);
				}
				if(index == 1) {
					golongan3b.add((Double)gajiGolongan[2][index][jumlah]);
				}
				if(index == 2) {
					golongan3c.add((Double)gajiGolongan[2][index][jumlah]);
				}
				if(index == 3) {
					golongan3d.add((Double)gajiGolongan[2][index][jumlah]);
				}
			}
		}
		for(int index = 0 ; index < gajiGolongan.length+1 ; index++) {
			for(int jumlah = 0 ; jumlah < gajiGolongan[3][index].length ; jumlah++) {
				if(index == 0){
					golongan4a.add((Double)gajiGolongan[3][index][jumlah]);
				}
				if(index == 1) {
					golongan4b.add((Double)gajiGolongan[3][index][jumlah]);
				}
				if(index == 2) {
					golongan4c.add((Double)gajiGolongan[3][index][jumlah]);
				}
				if(index == 3) {
					golongan4d.add((Double)gajiGolongan[3][index][jumlah]);
				}
				if(index == 4){
					golongan4e.add((Double)gajiGolongan[3][index][jumlah]);
				}
			}
		}
		
		
	}
	public double getGapok() {
		setArrayList();
		String golonganKu = getGolongan();
		double masaKerja = getMasaKerja();
		double gapok = 0;
		if(golonganKu.equalsIgnoreCase("1a")) {
			gapok = golongan1a.get((int)(masaKerja/2));
		}
		else if(golonganKu.equalsIgnoreCase("1b")) {
			gapok = golongan1b.get((int)((masaKerja+1)/2-2));
		}
		else if(golonganKu.equalsIgnoreCase("1c")) {
			gapok = golongan1c.get((int)((masaKerja+1)/2-2));
		}
		else if(golonganKu.equalsIgnoreCase("1d")) {
			gapok = golongan1d.get((int)((masaKerja+1)/2-2));
		}
		else if(golonganKu.equalsIgnoreCase("2a")) {
			if(masaKerja == 0) {
				gapok = golongan2a.get(0);
			}
			else {
				gapok = golongan2a.get((int)(masaKerja+1)/2);
			}
		}
		else if(golonganKu.equalsIgnoreCase("2b")) {
			gapok = golongan2b.get((int)((masaKerja+1)/2-2));
		}
		else if(golonganKu.equalsIgnoreCase("2c")) {
			gapok = golongan2c.get((int)((masaKerja+1)/2-2));
		}
		else if(golonganKu.equalsIgnoreCase("2d")) {
			gapok = golongan2d.get((int)((masaKerja+1)/2-2));
		}
		else if(golonganKu.equalsIgnoreCase("3a")) {
			gapok = golongan3a.get((int)(masaKerja/2));
		}
		else if(golonganKu.equalsIgnoreCase("3b")) {
			gapok = golongan3b.get((int)(masaKerja/2));
		}
		else if(golonganKu.equalsIgnoreCase("3c")) {
			gapok = golongan3c.get((int)(masaKerja/2));
		}
		else if(golonganKu.equalsIgnoreCase("3d")) {
			gapok = golongan3d.get((int)(masaKerja/2));
		}
		else if(golonganKu.equalsIgnoreCase("4a")) {
			gapok = golongan4a.get((int)(masaKerja/2));
		}
		else if(golonganKu.equalsIgnoreCase("4b")) {
			gapok = golongan4b.get((int)(masaKerja/2));
		}
		else if(golonganKu.equalsIgnoreCase("4c")) {
			gapok = golongan4c.get((int)(masaKerja/2));
		}
		else if(golonganKu.equalsIgnoreCase("4d"))
			gapok = golongan4d.get((int)(masaKerja/2));
		else if(golonganKu.equalsIgnoreCase("4e")) {
			gapok = golongan4e.get((int)(masaKerja/2));
		}
	return gapok;
	}
	public double getTunjanganPasangan() {
		double tunjangan = 0;
		String status = getStatusMenikah();
		if(status.equalsIgnoreCase("y")) {
			tunjangan += getGapok()*0.1;
		addKeluarga(1);
		}
		return tunjangan;
	}
	public double getTunjanganAnak() {
		double tunjanganAnak = 0;
		if(getJumlahAnak() <= 2 && getJumlahAnak() >0) {
			tunjanganAnak = 0.02*getGapok();
		}
		else if(getJumlahAnak() >= 3) {
			tunjanganAnak = 0.04*getGapok();
		}
		addKeluarga((int)getJumlahAnak());
		return tunjanganAnak;
	}
	public void setTunjanganPapua(String pulau) {
		if(pulau.equalsIgnoreCase("papua")) {
			tunjanganPapua.put("1a",(double) 200000);
			tunjanganPapua.put("1b",(double) 225000);
			tunjanganPapua.put("1c",(double) 250000);
			tunjanganPapua.put("1d",(double) 275000);
			tunjanganPapua.put("2a",(double) 300000);
			tunjanganPapua.put("2b",(double) 325000);
			tunjanganPapua.put("2c",(double) 350000);
			tunjanganPapua.put("2d",(double) 375000);
			tunjanganPapua.put("3a",(double) 425000);
			tunjanganPapua.put("3b",(double) 450000);
			tunjanganPapua.put("3c",(double) 475000);
			tunjanganPapua.put("3d",(double) 500000);
			tunjanganPapua.put("4a",(double) 525000);
			tunjanganPapua.put("4b",(double) 550000);
			tunjanganPapua.put("4c",(double) 575000);
			tunjanganPapua.put("4d",(double) 600000);
			tunjanganPapua.put("4e",(double) 625000);			
		}
		else {
			tunjanganPapua.put("1a",(double) 0);
			tunjanganPapua.put("1b",(double) 0);
			tunjanganPapua.put("1c",(double) 0);
			tunjanganPapua.put("1d",(double) 0);
			tunjanganPapua.put("2a",(double) 0);
			tunjanganPapua.put("2b",(double) 0);
			tunjanganPapua.put("2c",(double) 0);
			tunjanganPapua.put("2d",(double) 0);
			tunjanganPapua.put("3a",(double) 0);
			tunjanganPapua.put("3b",(double) 0);
			tunjanganPapua.put("3c",(double) 0);
			tunjanganPapua.put("3d",(double) 0);
			tunjanganPapua.put("4a",(double) 0);
			tunjanganPapua.put("4b",(double) 0);
			tunjanganPapua.put("4c",(double) 0);
			tunjanganPapua.put("4d",(double) 0);
			tunjanganPapua.put("4e",(double) 0);
		}
	}
	public void setTunjanganUmum(String pilih) {
		if(pilih.equalsIgnoreCase("y")) {
			tunjanganUmum.put(1,(double) 175000);
			tunjanganUmum.put(2,(double) 180000);
			tunjanganUmum.put(3,(double) 185000);
			tunjanganUmum.put(4,(double) 190000);
		}
		else {
			tunjanganUmum.put(1,(double) 0);
			tunjanganUmum.put(2,(double) 0);
			tunjanganUmum.put(3,(double) 0);
			tunjanganUmum.put(4,(double) 0);
		}
	}
	public void setTunjanganStruktur(String pilih) {

		if(pilih.equalsIgnoreCase("y")) {
			tunjanganStruktur.put(1, (double) 5500000);
			tunjanganStruktur.put(2, (double) 4375000);
			tunjanganStruktur.put(3, (double) 3250000);
			tunjanganStruktur.put(4, (double) 2025000);
			tunjanganStruktur.put(5, (double) 1260000);
			tunjanganStruktur.put(6, (double) 980000);
			tunjanganStruktur.put(7, (double) 540000);
			tunjanganStruktur.put(8, (double) 490000);
			tunjanganStruktur.put(9, (double) 360000);
			tunjanganStruktur.put(10, (double) 0);
		}
		else {
			tunjanganStruktur.put(1, (double) 0);
			tunjanganStruktur.put(2, (double) 0);
			tunjanganStruktur.put(3, (double) 0);
			tunjanganStruktur.put(4, (double) 0);
			tunjanganStruktur.put(5, (double) 0);
			tunjanganStruktur.put(6, (double) 0);
			tunjanganStruktur.put(7, (double) 0);
			tunjanganStruktur.put(8, (double) 0);
			tunjanganStruktur.put(9, (double) 0);
			tunjanganStruktur.put(10, (double) 0);
		}
		
	}
	public void setTunjanganFungsi(String pilih) {
		if(pilih.equalsIgnoreCase("y")) {
			tunjanganFungsi=1350000;
		}
		else {
			tunjanganFungsi =0;
		}

	}
	public void setPotonganBeras(String pilih) {
		if(pilih.equalsIgnoreCase("y")) {
			potonganBeras = getTunjanganBeras();
		}
		else {
			potonganBeras = 0;
		}
	}
	public void setPotonganSewaRumah(String pilih) {
		if(pilih.equalsIgnoreCase("y")) {
			potonganSewaRumah = 400000;
		}
		else {
			potonganSewaRumah = 0;
		}
	}
	public void setPotonganTaperum() {
		taperum.put(1, (double)3000);
		taperum.put(2, (double)5000);
		taperum.put(3, (double)7000);
		taperum.put(4, (double)10000);
	}
	public double getTunjanganFungsi() {
		return tunjanganFungsi;
	}

	public double getTunjanganStruktur() {
		
		return tunjanganStruktur.get(getJabatanKu());
	}
	public double getTunjanganUmum() {
		return tunjanganUmum.get(getTingkatGolongan());
	}
	public double getTunjanganPapua() {
		return tunjanganPapua.get(getGolongan());
	}
	public double getTunjanganPulauKecil() {
		return tunjanganPulauKecil;
	}
	public double getTunjanganBeras() {
		double tunjanganBeras = hargaBeras;
		double keluarga = getJumlahKeluarga();
		if(keluarga+1 > 3) {
			tunjanganBeras += hargaBeras * 3;
		}
		else {
			tunjanganBeras += hargaBeras * keluarga;
		}
			
		return tunjanganBeras;
	}
	public double getGator() {
		return getGapok()+getTunjanganPasangan()+getTunjanganAnak()+getTunjanganFungsi()+getTunjanganStruktur()+getTunjanganUmum()+getTunjanganPapua()+getTunjanganPulauKecil()+getTunjanganBeras();
	}
	public double getTunjanganPPH() {
		double bruto , neto , netoPertahun ,  biayaJabatan = 0 , biayaPensiun , ptkp = 36000000 , ptkpPerorang = 3000000 , pkp = 0 , pphPertahun = 0, pphPerbulan = 0 , potonganPPH;
		bruto = getGator();
		double tunjanganKeluarga = getTunjanganPasangan()+getTunjanganAnak();
		double jumlahKeluarga = getJumlahKeluarga();
		double biayaJabat = bruto*0.05;
		if(biayaJabat> 500000){
			biayaJabatan += 500000;
		}
		else{
			biayaJabatan+= biayaJabat;
		}
		biayaPensiun = (getGapok()+tunjanganKeluarga)*0.0475;
		neto = bruto - (biayaJabatan+biayaPensiun);
		netoPertahun = neto*12;
		if((jumlahKeluarga) >= 4){
			ptkp += ptkpPerorang*4;
		}
		else{
		   ptkp += (jumlahKeluarga)*ptkpPerorang;
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
		potonganPPH = pphPerbulan;
		return potonganPPH;
				
	}
	public int getSeluruhPenghasilan() {
		return (int) (getGator()+getTunjanganPPH());
	}
	public double getPotonganBeras() {
		return potonganBeras;
	}
	public double getPotonganIWP() {
		return 0.1*(getGapok()+getTunjanganAnak()+getTunjanganPasangan());
	}
	public double getPotonganPPH() {
		return getTunjanganPPH();
	}
	public double getPotonganSewaRumah() {
		return potonganSewaRumah;
	}
	public double getPotonganTaperum() {
		return taperum.get(getTingkatGolongan());
	}
	public String getNamaUtang() {
		return namaUtang;
	}
	public double getJumlahUtang() {
		return jumlahUtang;
	}
	public String toString() {
		return getNamaUtang() + "\t\t : "+ getJumlahUtang();
	}
	public int getSeluruhPotongan() {
		return (int)(getPotonganBeras()+getPotonganIWP()+getPotonganPPH()+getPotonganSewaRumah()+getPotonganTaperum()+getJumlahUtang());
	}
	public int takeHomePay() {
		return getSeluruhPenghasilan()-getSeluruhPotongan();
	}
}