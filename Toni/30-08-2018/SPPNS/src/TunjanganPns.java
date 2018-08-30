import java.util.HashMap;

public interface TunjanganPns {
	// Tunjangan Jabatan
	double tFungsional = 1350000.0;
	@SuppressWarnings("serial")
	HashMap<String, Double> tUmum = new HashMap<String, Double>() {{
		put("i", 175000.0);
		put("ii", 180000.0);
		put("iii", 185000.0);
		put("iv", 190000.0);
	}}, tStruktural = new HashMap<String, Double>() {{
		put("i", 175000.0);
		put("ii", 180000.0);
		put("iii", 185000.0);
		put("iv", 190000.0);
	}};
	
	//Tunjangan Pasutri
	double tarifTPasutri = 0.1, tarifTAnak = 0.04, hargaBeras = 10000.0, tarifTTerpencil = 1;
	
	double tunjanganJabatan(String target);
	double tunjanganPasutri();
	double tunjanganAnak();
	double tunjanganBeras();
	double tunjanganBulat();
	double tunjanganTerpencil();
	double tunjanganPapua();
	double tunjanganTUmum();
	void tunjanganLain();
}
