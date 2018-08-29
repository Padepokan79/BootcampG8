
public class Birthday extends Card {
	int age = 0;
	Birthday(String recipient, int age){
		this.recipient = recipient;
		this.age = age;
	}
	
	public void greeting() {
		System.out.println("Dear, "+recipient);
		System.out.println("Happy "+age+" Birthday.\n\n");
	}
}
