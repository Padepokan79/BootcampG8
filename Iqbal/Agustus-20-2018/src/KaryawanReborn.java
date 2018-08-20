//Author Muhamad Iqbal FM 1:55 20-08-2018
import java.util.Scanner;
public class KaryawanReborn {
	
	String nama , nik ,  penempatanKerja , pekerjaan , statusKeluarga = "n" ;
	int jumlahPenghasilan , jumlahPotongan , gajiDiterima;
	double jumlahKeluarga = 1 , masaKerja , jamLembur;
	double lembur , gapok , gator , nilaiUmk , tunjanganKhusus = 0, tunjanganPegawai, tunjanganKeluarga , potonganPPH , potonganBpjsKesehatan , potonganBpjsKetenagaKerjaan ;
	double[] umk = {3091345.56 , 3648035.82 , 3919291.19};
	double[] bagianKerja = {1 , 1.2 , 1 , 0.9};
	double[] tunjanganKu = {200000 , 300000, 500000};
	
	//3.40 Membuat OutPut
	
	void outPut() {	
		System.out.println("Nama		: "+nama);
		System.out.println("NIK		: "+nik);
		System.out.println("Gaji pokok		: "+gapok);
		System.out.println("Penempatan Kerja		: "+penempatanKerja);
		System.out.println("Gaji Lembur		: "+lembur);
		System.out.println("Tunjangan :");
		System.out.println("Tunjangan Keluarga		: "+tunjanganKeluarga);
		System.out.println("Tunjangan Pegawai		: "+tunjanganPegawai);
		System.out.println("Tunjangan Khusus		: "+tunjanganKhusus);
		System.out.println("Potongan :");
		System.out.println("Potongan PPH:		 "+potonganPPH);
		System.out.println("Potongan BPJS KESEHATAN		: "+potonganBpjsKesehatan);
		System.out.println("Potongan BPJS Ketenaga Kerjaan		: "+potonganBpjsKetenagaKerjaan);
		System.out.println("Jumlah Penghasilan	: "+jumlahPenghasilan);
		System.out.println("Jumlah Potongan	: "+jumlahPotongan);
		System.out.println("Gaji Diterima	: "+gajiDiterima);
	} 
	
	//2:05 20-08-2018 Penentuan Gapok
	
	
	
	double gapok(String pekerjaan , String penempatanKerja  ) {
		nilaiUmk = 0;
		gapok = 0 ;
		if(penempatanKerja.equals("Bandung")) {
			nilaiUmk = umk[0];
		}
		else if(penempatanKerja.equals("Jakarta")) {
			nilaiUmk = umk[1];
		}
		else {
			nilaiUmk =umk[2];
		}
		
		if(pekerjaan.equals("Programer")){
			gapok = bagianKerja[0] * nilaiUmk;
		}
		else if(pekerjaan.equals("S.Analis")){
			gapok = bagianKerja[1] * nilaiUmk;
		}
		else if(pekerjaan.equals("Tester")){
			gapok = bagianKerja[2] * nilaiUmk;
		}
		else {
			gapok = bagianKerja[3] * nilaiUmk;
		}
		return gapok;
	}
	//2.30 20-08-2018 Penentuan tunjanganKeluarga
	
	double tunjanganFamili(String statusKeluarga) {
		tunjanganKeluarga = 0 ;
		if(statusKeluarga.equals("y")) {
			if(jumlahKeluarga < 3) {
				tunjanganKeluarga += 0.02*gapok*jumlahKeluarga;
			}
			else {
				tunjanganKeluarga += 0.02*gapok*3;
			}
		}
		return tunjanganKeluarga;
	}
	
	//2.40 20-08-2018 Tunjangan Pegawai
	double tunjanganEmployee(int masaKerja) {
		tunjanganPegawai = 0;
		if(masaKerja < 3) {
			tunjanganPegawai += tunjanganKu[0];
		}
		else if(masaKerja < 5) {
			tunjanganPegawai += tunjanganKu[1];
		}
		else {
			tunjanganPegawai += tunjanganKu[3];
		}
		return tunjanganPegawai;
	}
	//2.50 20-08-2018 Tunjangan Khusus
	double tunjanganKhusus(String tempatKerja) {
		tunjanganKhusus = 0;
		if(tempatKerja.equals("Jakarta")) {
			tunjanganKhusus += 1000000;
		}
		return tunjanganKhusus;
	}
	
	//2.55 20-08-2018 Gaji Kotor
	double gajiKotor(double gapok , double tunjanganKeluarga , double tunjanganPegawai , double tunjanganKhusus) {
		gator = gapok+tunjanganKeluarga+tunjanganPegawai+tunjanganKhusus;
		return gator;
	}

	
	//3.00 20-08-2018 Cari Lembur
	double gajiLembur(double gajiKotor) {
		lembur = 0;
		if(jamLembur != 0) {
			lembur += 1.5 * 0.00578 * gajiKotor;
		}
		return lembur;
	}
	
	//Cari PPH 3.05 20-08-2018
	double pph(double gapok , double tunjanganKeluarga ,double gajiKotor , double jumlahKeluarga) {
		double bruto , neto , netoPertahun ,  biayaJabatan = 0 , biayaPensiun , ptkp = 36000000 , ptkpPerorang = 3000000 , pkp = 0 , pphPertahun = 0, pphPerbulan = 0 ;
		bruto = gajiKotor;
		double biayaJabat = bruto*0.05;
		if(biayaJabat> 500000){
			biayaJabatan += 500000;
		}
		else{
			biayaJabatan+= biayaJabat;
		}
		biayaPensiun = (gapok+tunjanganKeluarga)*0.0475;
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
	
	// 3.25 20-08-2018 Cari Potongan BPJS kesehatan
	
	double bpjsKesehatan(double gajiKotor) {
		potonganBpjsKesehatan = gajiKotor*0.01;
		return potonganBpjsKesehatan;
	}
	
	// 3.25 20-08-2018 Cari Potongan BPJS ketenaga kerjaan
	
	double bpjsKetenagaKerjaan(double gajiKotor) {
		potonganBpjsKetenagaKerjaan = gajiKotor*0.01;
		return potonganBpjsKetenagaKerjaan;
	}
	// 3.30 20-08-2018 Cari Penghasilan dan Potongan Semuanya
	int jumlahPenghasilanKu(double gajiKotor , double gajiLembur) {
		jumlahPenghasilan = (int)(gajiKotor+gajiLembur);
		return jumlahPenghasilan;
	}
	
	int jumlahPotonganKu(double pph , double  kesehatan , double ketenagaKerjaan) {
		jumlahPotongan = (int)(pph + kesehatan + ketenagaKerjaan);
		return jumlahPotongan;
	}
	

	
	
	
	
	
	
	
}
