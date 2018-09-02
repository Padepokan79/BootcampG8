import java.util.*;
public class TestCollection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Johnson");
		list.add("Mark");
		list.add("Travor");
		list.add("Stanley");
		
		// Using Iteration
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(list.indexOf(list));
		}
		
		System.out.println("\n+++\n");
		
		// For Each
		for(String name :list) {
			System.out.println(name);
		}
	}
}
