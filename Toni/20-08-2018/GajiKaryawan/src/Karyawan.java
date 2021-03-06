
public class Karyawan {
	String name, nik, penempatan, jabatan, status;
	String[] position = {"programmer", "analis", "tester", "writer"}, stat = {"junior", "middle", "senior"};
	int lembur, tPegawai, gapok, keluarga, gB;
	int[] tunjangan = new int[3], potongan = new int[3];
	
	Karyawan(String name, String nik, String penempatan, String jabatan, String status, int keluarga, int jamLembur){
		this.name = name;
		this.nik = nik;
		this.penempatan = penempatan;
		this.jabatan = position[Integer.parseInt(jabatan)-1];
		this.status = stat[Integer.parseInt(status)-1];
		this.keluarga = keluarga;
		this.lembur = jamLembur;
		tunjangan = hitungTunjangan();
		potongan = hitungPotongan();
	}
	
	Karyawan(){
		
	}
	
	void slip() {
		System.out.println("========================================");
		System.out.println("Nama \t: "+name);
		System.out.println("NIK \t: "+nik);
		System.out.println("Penempatan \t: "+penempatan);
		System.out.println("Jabatan \t: "+jabatan);
		System.out.println("Status \t: "+status);
		System.out.println("========================================");
		System.out.println("Gaji Pokok \t: "+gajiPokok());
		System.out.println("T Keluarga \t: "+tunjangan[0]);
		System.out.println("T Posisi \t: "+tunjangan[1]);
		System.out.println("T Transport \t: "+tunjangan[2]);
		System.out.println("Gaji Kotor \t: "+gajiKotor());
		System.out.println("========================================");
		System.out.println("P BPJS kesehtn\t: "+potongan[0]);
		System.out.println("P BPJS kesjhtr\t: "+potongan[1]);
		System.out.println("P PPH \t\t: "+potongan[2]);
		System.out.println("========================================");
		System.out.println("Lemburan \t: "+hitungLemburan());
		System.out.println("Gaji Bersih \t: "+gajiBersih());
		System.out.println("========================================");
	}
	
	void initialize(String name, String nik, String penempatan, String jabatan, String status, int keluarga){
		this.name = name;
		this.nik = nik;
		this.penempatan = penempatan;
		this.jabatan = jabatan;
		this.status = status;
		this.keluarga = keluarga;
	}
	
	int gajiPokok(){
		int[] gajipokok = {3091345, 3355750, 3919291};
		int gaji = 0;
		switch(penempatan) {
		case "bandung" :
			gaji = gajipokok[0];
		break;
		case "jakarta" :
			gaji = gajipokok[1];
		break;
		case "karawang" :
			gaji = gajipokok[1];
		break;
		}
		
		switch(jabatan) {
		case "analis" :
			gaji += 0.2 * gaji;
		break;
		case "writer" :
			gaji -= 0.1 * gaji;
		break;
		}
		return gaji;
	}
	
	int gajiKotor() {
		int gKotor = gajiPokok();
		for(int i = 0; i < tunjangan.length; i++) {
			gKotor += tunjangan[i];
		}
		return gKotor;
	}
	
	int gajiBersih() {
		int gBersih = gajiKotor();
		for(int i = 0; i < potongan.length; i++) {
			gBersih -= potongan[i];
		}
		return gBersih;
	}
	
	//function tunjangan
	int[] hitungTunjangan() {
		int[] t = new int[3], tPegawai = {200000, 300000, 500000};
		
		// Tunjangan keluarga 
		t[0] = (int)(keluarga*(0.02 * gajiPokok()));
		
		// Tunjangan status
		if(status.equals("junior")) t[1] = tPegawai[0];
		else if(status.equals("middle")) t[1] = tPegawai[1];
		else if(status.equals("senior")) t[1] = tPegawai[2];
		
		//Tunjangan transport
		if(penempatan.equals("jakarta")) t[2] = 1000000;
		
		return t;
	}
	
	//function potongan
	int[] hitungPotongan () {
		int[] p = new int[3];
		
		//potogan BPJS Kesehatan
		p[0] = (int)(0.01 * gajiKotor());
		
		//potogan BPJS Ketenagakerjaan
		p[1] = (int)(0.01 * gajiKotor());
		
		//potogan BPJS Ketenagakerjaan
		p[2] = pph();
		
 		return p;
	}
	
	int hitungLemburan() {
		return (int)(lembur * (1.5 * (1/173 * gajiPokok())));
	}
	
	int pph() {
		int pajak = (int)(0.05 * (pkp() / 12));
		return pajak;
	}
	
	int pkp(){
		int kenaPajak = 0, biayaJabatan, iuranPensiun;
		biayaJabatan = (int)(0.05 * gajiKotor());
		iuranPensiun = (int)(0.045 * (gajiBersih() + tunjangan[1]));
		kenaPajak = (12 * (gajiKotor() - (biayaJabatan + iuranPensiun))) - (36000000 + (keluarga*3000000));
		if (kenaPajak < 0) kenaPajak = 0;
		return kenaPajak;
	}
	
	
	
}
