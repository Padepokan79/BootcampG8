
public class Valentine extends Card {
	int kiss = 0;
	Valentine(String recipient, int kiss){
		this.recipient = recipient;
		this.kiss = kiss;
	}
	
	public void greeting() {
		System.out.println("Dear, "+recipient);
		System.out.println("Love and Kisses");
		for(; kiss >= 0; kiss--) {
			System.out.print("X");
		}
		System.out.println("\n\n");
	}
}
