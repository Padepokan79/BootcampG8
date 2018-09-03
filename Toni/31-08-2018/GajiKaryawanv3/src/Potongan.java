
public interface Potongan {
	double tarifBPJS = 0.01;
	double tarifPph = 0.05, tarifBiayaJabatan = 0.05, tarifIuranPensiun = 0.0475, tarifPtkp = 36000000, tarifPtkpKeluarga = 3000000;
	
	double potonganBPJS();

	abstract double hitungPph();
	abstract double hitungPkp();
	abstract double hitungPtkp();
}
