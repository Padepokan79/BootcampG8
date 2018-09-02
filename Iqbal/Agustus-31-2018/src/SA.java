
public class SA extends Karyawan  implements UMK , TPegawai , TKeluarga , TTransport , BPJS , PPH , Lembur {
	//Variable
	

	public SA() {
		super();
		setTunjanganPegawai();
	}

	
	public double getUMK() {
		double umk = 0;
		if(getPenempatanKerja().equalsIgnoreCase("bandung")) {
			umk = bandung;
		}
		else if(getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			umk = jakarta;
		}
		else if(getPenempatanKerja().equalsIgnoreCase("karawang")) {
			umk = karawang;
		}
		else if(getPenempatanKerja().equalsIgnoreCase("surabaya")) {
			umk = surabaya;
		}
		return umk;
	}
	public double getGapok() {
		double gapok = 0;
		String tingkat = getTingkatKerja();
		int masaKerja = getMasaKerja();
		
		if(tingkat.equalsIgnoreCase("junior")) {
			if(masaKerja > 3) {
				gapok += getUMK()*1.6;
			}
			else if(masaKerja >1) {
				gapok += getUMK()*1.3;
			}
			else {
				gapok += getUMK()*1.2;
			}
		}
		else if(tingkat.equalsIgnoreCase("Middle")) {
			if(masaKerja > 3) {
				gapok += getUMK()*2.2;
			}
			else if(masaKerja >1) {
				gapok += getUMK()*1.9;
			}
			else {
				gapok += getUMK()*1.8;
			}
		}
		else if(tingkat.equalsIgnoreCase("senior")) {
			if(masaKerja > 3) {
				gapok += getUMK()*3;
			}
			else if(masaKerja >1) {
				gapok += getUMK()*2.9;
			}
			else {
				gapok += getUMK()*2.7;
			}
		}
		return gapok;
	}
	
	public void setTunjanganPegawai() {
		tunjanganPegawai.put("junior" , (double) 200000);
		tunjanganPegawai.put("middle" , (double) 300000);
		tunjanganPegawai.put("senior" , (double) 500000);
		
	}
	public double getTunjanganPegawai() {
		
		return tunjanganPegawai.get(getTingkatKerja());
	}
	
	public double getTunjanganKeluarga() {
		double tunjanganKeluarga = 0;
		if(getStatusKeluarga().equalsIgnoreCase("y")) {
			tunjanganKeluarga += jumlahTunjanganKeluarga * getGapok();
		}
		return tunjanganKeluarga;
	}
	public double getTunjanganKhusus() {
		double tunjanganKhusus = 0;
		if(getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			tunjanganKhusus += tunjanganTransport;
		}
		return tunjanganKhusus;
	}
	
	public double getBpjs() {
		return bpjs*getGapok()*2;
	}
	
	double getGajiKotor(){
		return getGapok()+getTunjanganPegawai()+getTunjanganKhusus()+getTunjanganKeluarga();
	}
	public double getPTKP(){
		double ptkp = 36000000;
		if(getStatusKeluarga().equalsIgnoreCase("y")) {
			ptkp += 3000000;
		}
		return ptkp;
	}
	public double getPKP() {
		double biayaJabatan = getGajiKotor()*0.05 , biayaPensiun , neto , netoPertahun , pkp;
		if(biayaJabatan> 500000){
			biayaJabatan = 500000;
		}
		biayaPensiun = (getGapok()+getTunjanganKeluarga())*0.0475;
		neto = getGajiKotor() - (biayaJabatan+biayaPensiun);
		netoPertahun = neto*12;
		double pkpSementara = netoPertahun - getPTKP();
		if(pkpSementara < 0){
			pkp = 0 ;
		}
		else{
			pkp = pkpSementara;
		}
		return pkp;
	}
	public double getPPH() {
		double pph = 0;
		if(getPKP() == 0) {
			pph = 0;
		}
		else {
			pph = (getPKP()*0.05)/12;
		}
		return pph;
	}

	public double getGajiLembur() {
		return lemburPerjam*getJamLembur()*getGapok();
	}
	double getPenghasilan() {
		return getGajiKotor()+getGajiLembur();
	}
	double getPotongan() {
		return getBpjs() + getPPH();
	}
	double getGajiBersih() {
		
		return getPenghasilan()-getPotongan();
	}
	void slipGaji() {
		System.out.println("===========================================");
		System.out.println("Nama\t\t\t: "+getNama());
		System.out.println("Nik\t\t\t: "+getNik());
		System.out.println("Gapok\t\t\t: "+getGapok());
		System.out.println("-------------------------------------------");
		System.out.println("Lembur\t\t\t: "+getGajiLembur());
		System.out.println("Tunjangan Pegawai\t: "+getTunjanganPegawai());
		System.out.println("Tunjangan Khusus\t: "+getTunjanganKhusus());
		System.out.println("Tunjangan Keluarga\t: "+getTunjanganKeluarga());
		System.out.println("-------------------------------------------");
		System.out.println("Jumlh Penghasilan\t: "+getPenghasilan());
		System.out.println("-------------------------------------------");
		System.out.println("Potongan BPJS Kesehatan: "+getBpjs()/2);
		System.out.println("Potongan BPJS Ketenagakerjaan"+getBpjs()/2);
		System.out.println("Potongan PPH\t: "+getPPH());
		System.out.println("-------------------------------------------");
		System.out.println("Jumlah Potongan\t\t: "+getPotongan());
		System.out.println("-------------------------------------------");
		System.out.println("Gaji Bersih\t\t: "+getGajiBersih());
		
		
	}
}
