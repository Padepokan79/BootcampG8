import java.util.*;

public class TestCollection3 {
	public static void main(String[] args) {
		Person pertama = new Person ("James", "Sullivan");
		pertama.setFirstName("James");
		pertama.setLastName("Sullivan");
		Person kedua = new Person ("Matthew", "Sanders");
		kedua.setFirstName("Matthew");
		kedua.setLastName("Sanders");
		Person ketiga = new Person ("Brian", "Haner");
		ketiga.setFirstName("Brian");
		ketiga.setLastName("Haner");
		
		ArrayList<Person> baru = new ArrayList<Person>();
		baru.add(pertama);
		baru.add(kedua);
		baru.add(ketiga);	
	
		Iterator itr = baru.iterator();
	
		while (itr.hasNext()) {
			Person pr = (Person)itr.next();
			pr.bio();
			pr.greeting();
	}
	
	}
}
