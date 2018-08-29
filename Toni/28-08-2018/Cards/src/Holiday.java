
public class Holiday extends Card {
	Holiday(String recipient){
		this.recipient = recipient;
	}
	
	public void greeting() {
		System.out.println("Dear, "+recipient);
		System.out.println("Season's Greetings !!\n\n");
	}
}
