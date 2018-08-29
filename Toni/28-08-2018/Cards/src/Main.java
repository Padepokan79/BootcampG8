
public class Main {
	public static void main(String[] args) {
		Valentine card1 = new Valentine("Honey", 100);
		Holiday card2 = new Holiday("Honey");
		Birthday card3 = new Birthday("Honey", 47);
	
		card1.greeting();
		card2.greeting();
		card3.greeting();
	}
}
