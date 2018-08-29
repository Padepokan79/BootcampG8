import java.util.HashMap;
import java.util.Map;

public class TestGajiHashMap {
	public static void main (String[] args) {
		Map<String, GajiHashMap> map = new HashMap<String, GajiHashMap>();
		
		GajiHashMap bandung = new GajiHashMap("Bandung", 3000000);
		GajiHashMap jakarta = new GajiHashMap("Jakarta", 3500000);
		GajiHashMap karawang = new GajiHashMap("Karawang",3900000);
		
		map.put("1", bandung);
		map.put("2", jakarta);
		map.put("3", karawang);	
		
		for (Map.Entry<String, GajiHashMap> entry:map.entrySet()) {
			int key = entry.getKey();
			GajiHashMap gaji = entry.getValue();
			System.out.println(key);
			System.out.println(gaji.gaji+ " " +gaji.kota);
		}
	}
}
