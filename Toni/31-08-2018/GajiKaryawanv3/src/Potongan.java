import java.util.HashMap;

public interface Potongan {
	double tarifBPJS = 0.01;
	double tarifBiayaJabatan = 0.05, tarifIuranPensiun = 0.0475, tarifPtkp = 36000000, tarifPtkpKeluarga = 3000000;
	@SuppressWarnings("serial")
	HashMap<Integer, Double> tarifPph = new HashMap<Integer, Double>(){{
		put(0, 0.05);
		put(1, 0.15);
		put(2, 0.25);
		put(3, 0.30);
	}};
	HashMap<Integer, Double> rangePph = new HashMap<Integer, Double>(){{
		put(0, 50000000.0);
		put(1, 150000000.0);
		put(2, 250000000.0);
		put(3, 0.0);
	}};
	double potonganBPJS();

	abstract double hitungPph();
	abstract double hitungPkp();
	abstract double hitungPtkp();
}
