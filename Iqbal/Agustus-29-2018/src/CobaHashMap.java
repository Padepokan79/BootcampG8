import java.util.HashMap;
import java.util.Map;
public class CobaHashMap {
	public static void main(String[]args) {
		HashMap<Integer , String> hm = new HashMap<Integer , String	>();
		hm.put(1, "Satu");
		hm.put(2, "Dua");
		hm.put(3, "Tiga");
		
		for (Map.Entry<Integer,String> ambil : hm.entrySet()) {
			System.out.println(ambil.getValue());
		}
		Baru baru = new Baru();
		System.out.println(baru.getHashMap("iqbal"));
	}
}

class Baru{
	HashMap<String , String> cerdas = new HashMap<String , String>();
	
	Baru(){
		cerdas.put("iqbal", "Cerdas Sekali");
	}
	String getHashMap(String nama) {
		return cerdas.get(nama);
	}
}