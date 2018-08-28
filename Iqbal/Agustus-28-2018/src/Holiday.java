
public class Holiday extends card{
	public Holiday(String r) {
		recipient = r;
	}
	public void greeting() {
		System.out.println("Dear "+ recipient);
		System.out.println("Season's Greeting !!");
	}
}
