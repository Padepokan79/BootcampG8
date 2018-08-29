import java.util.*;

public class TestHashMap {
	public static void main(String args[]) {
		HashMap<Integer,String> hm = new HashMap<Integer,String> ();
		hm.put(121, "Bayu");
		hm.put(232, "Iqbal");
		hm.put(123, "Toni");
		
		for (Map.Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+ " " +m.getValue());
		}
				
	}

}
