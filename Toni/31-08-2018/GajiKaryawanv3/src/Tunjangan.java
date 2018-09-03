public interface Tunjangan {
	double tarifTTransport = 2300000;
	double tarifLembur = 1.5 / 173;
	double tarifTKeluarga = 0.1;
	
	double hitungTPegawai();
	double hitungTKeluarga();
	double hitungLembur();
	double hitungTTransport();
}
