public class MainTest {
	public static void main(String[] args) {
		Holiday h = new Holiday("Iqbal");
		h.greeting();
		Birthday b = new Birthday("Iqbal", 18);
		b.greeting();
		Valentine v = new  Valentine("Iqbal", 9);
		v.greeting();
	}
}
