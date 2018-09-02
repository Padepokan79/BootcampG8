import java.util.*;
public class CobaArrayList {
	public static void main(String[]args) {
		ArrayList<String> satu = new ArrayList<String>();
		satu.add("Iqbal");
		satu.add("Bayu");
		satu.add("Tonny");
		
		Iterator its = satu.iterator();
		while (its.hasNext()){
			System.out.println(its.next());
		}
		
		System.out.println("==========================");
		for(String obj:satu) {
			System.out.println(obj);
		}
	}
}
