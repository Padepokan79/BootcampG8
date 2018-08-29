import java.util.HashMap;

public class Karyawan {
	private String name, nik, penempatan, jabatan, status;
	private int lembur;
	private int[] tunjangan = new int[3], potongan = new int[3];
	private boolean menikah;
	
	Karyawan(String name, String nik, String penempatan, String jabatan, String status, boolean menikah, int jamLembur){
		this.name = name;
		this.nik = nik;
		this.penempatan = penempatan;
		this.jabatan = jabatan;
		this.status = status;
		this.menikah = menikah;
		this.lembur = jamLembur;
		
		tunjangan = hitungTunjangan();
		potongan = hitungPotongan();
	}
	
	Karyawan(){
		
	}
	
	void setInformation(String name, String nik, String penempatan, String jabatan, String status, boolean menikah, int jamLembur){
		this.name = name;
		this.nik = nik;
		this.penempatan = penempatan;
		this.jabatan = jabatan;
		this.status = status;
		this.menikah = menikah;
		this.lembur = jamLembur;
		tunjangan = hitungTunjangan();
		potongan = hitungPotongan();
	}
	
	String getName() {
		return name;
	}
	
	String getNik() {
		return nik;
	}
	
	String getJabatan() {
		return jabatan;
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
		System.out.println("Lemburan \t: "+hitungLemburan()+" "+lembur);
		System.out.println("Gaji Bersih \t: "+gajiBersih());
		System.out.println("========================================");
	}
	
	int gajiPokok(){
		HashMap<String, Integer> umk = new HashMap<>();
		umk.put("bandung", 3091345);
		umk.put("bandung", 3648035);
		umk.put("bandung", 3919291);
		
		int gp = umk.get(this.penempatan);
		
		switch(jabatan) {
		case "analis" :
			gp = (int)(1.2 * gp);
		break;
		case "writer" :
			gp = (int)(0.9 * gp);
		break;
		}
		return gp;
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
		return gBersih + hitungLemburan();
	}
	
	//function tunjangan
	int[] hitungTunjangan() {
		int[] t = new int[3], tPegawai = {200000, 300000, 500000};
		
		// Tunjangan keluarga 
		if(menikah)
		t[0] = (int)(0.02 * gajiPokok());
		
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
		return (int)(lembur * ((1.5 * gajiPokok())/ 173.0));
	}
	
	int pph() {
		int pajak = (int)((pkp() * 0.05)/12);
		return pajak;
	}
	
	int pkp(){
		double kenaPajak = 0, biayaJabatan, iuranPensiun, ptkp = 36000000;
		if(menikah) ptkp+= 3000000;
		biayaJabatan = (0.05 * gajiKotor());
		iuranPensiun = (0.0475 * (gajiPokok() + tunjangan[0]));
		
		kenaPajak = (12 * (gajiKotor() - (biayaJabatan + iuranPensiun))) - ptkp;
		if (kenaPajak < 0) kenaPajak = 0;
		return (int)kenaPajak;
	}
}
