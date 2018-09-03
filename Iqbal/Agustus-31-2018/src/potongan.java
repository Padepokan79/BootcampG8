
public interface potongan {
	double bpjs = 0.01;
	double getBpjs();
	
	double ptkp = 36000000;
	double penambahanPtkp = 3000000;
	double biayaJabat = 0.05;
	double biayaPensi = 0.0475;
	double maksimalBiayaJabatan = 500000;
	double pphDibawah50 = 0.05;
	double pphDibawah250 = 0.15;
	double pphDibawah500 = 0.25;
	double pphDiatas500 = 0.3;
	double batasPPH50 = 50000000;
	double batasPPH250 = 200000000;
	double batasPPH500 = 250000000;
	double getPTKP();
	double getPKP();
	double getPPH();
}
