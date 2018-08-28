
public class Valentine extends Card {
	int kisses;
	
	public Valentine (String r, int k) {
		recipient = r;
		kisses    = k; 
	}
	
	public void greeting() {
		System.out.println("Dear " +recipient+ ",\n");
		System.out.println("Love and Kisses,\n");
		for ( int j = 0; j < kisses; j++);
			System.out.print("X");
		System.out.println("\n\n");
	}
}
