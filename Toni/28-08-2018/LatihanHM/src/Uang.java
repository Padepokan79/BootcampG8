import java.util.HashMap;
public class Uang {
	HashMap<String, Double> change = new HashMap<>();
	
	Uang(){
		change.put("Seribu", 1000.0);
		change.put("Dua Ribu", 2000.0);
		change.put("Lima Ribu", 5000.0);
		change.put("Sepuluh Ribu", 10000.0);
		change.put("Dua Puluh Ribu", 20000.0);
		change.put("Lima Puluh Ribu", 50000.0);
		change.put("Seratus Ribu", 100000.0);
	}
}
