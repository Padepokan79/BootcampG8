import java.util.HashMap;
public interface PotonganPns extends Pph, Iwp {
	// Tarif Taperum
	@SuppressWarnings("serial")
	HashMap<String, Double> tarifTaperum = new HashMap<String, Double>(){{
		put("i", 3000.0); put("ii", 5000.0); put("iii", 7000.0); put("iv", 1000.0); 
	}};
	// Tarif Sewq Rumah
	double tarifSewa = 400000.0;
	// Tarif IWP
	double tarifIwp = 0.1;
	
	double potonganIwp();
	double potonganTaperum();
	double potonganSewa();
	void potonganLain();
}
