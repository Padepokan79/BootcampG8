import java.util.ArrayList;

public class MainPerson {
	public static void main(String[] args) {
		ArrayList<Person> orang = new ArrayList<Person>();
		Person iqbal = new Person("Iqbal" , "FM");
		iqbal.setAge(18);
		iqbal.setInterests("Bermain Game");
		Person bayu = new Person("Bayu" , "Doang");
		bayu.setAge(24);
		bayu.setInterests("Bernyanyi");
		Person tony = new Person("tony" , "Sul");
		tony.setAge(18);
		tony.setInterests("Berdansa");
		
		orang.add(iqbal);
		orang.add(bayu);
		orang.add(tony);
		
		for (Person person : orang) {
			person.tampil();
		}
	}
}
 