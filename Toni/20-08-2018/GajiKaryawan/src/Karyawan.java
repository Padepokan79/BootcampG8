
public class Karyawan {
	String name, nik, penempatan, jabatan, status;
	int lembur, tPegawai, gapok, keluarga, gB;
	int[] tunjangan = new int[3], potongan = new int[3];
	
	Karyawan(String name, String nik, String penempatan, String jabatan, String status){
		gapok = gajiPokok();
		gB = gajiBersih();
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
	int[] tunjangan() {
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
	int[] potongan () {
		int[] p = new int[3];
		
		//potogan BPJS Kesehatan
		p[0] = (int)(0.01 * gajiKotor());
		
		//potogan BPJS Ketenagakerjaan
		p[1] = (int)(0.01 * gajiKotor());
		
		//potogan BPJS Ketenagakerjaan
		p[1] = pph();
		
 		return p;
	}
	
	int pph() {
		int pajak = (int)(0.05 * pkp());
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
