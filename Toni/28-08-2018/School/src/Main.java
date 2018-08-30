import java.util.*;

public class Main {
	public static void main(String[] args) {
		Person s1 = new Teacher("Cania Citra", "Female", 619, 18, "Plants");
		Person s2 = new Teacher("Nanika Huhul", "Female", 619, 19, "Music");
		Person s3 = new Teacher("Giring Andriani", "Male", 219, 19, "Dance");
		
		ArrayList<Person> students = new ArrayList<Person>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println(" Foreach : ");
		for(Person siske : students) {
			siske.tampil();
		}
		
		Iterator itr = students.iterator();
		System.out.println("\n Iterator : ");
		while(itr.hasNext()) {
			Person siske = (Person) itr.next();
			siske.tampil();
		}
		
	}
}
