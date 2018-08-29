import java.util.Scanner;

public class TesPersonAbs {
	public static void main (String [] args ) {
		String name, interest, gender, courses;
		int id, age;		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Nama : ");
		name = keyboard.next();
		System.out.print("Usia : ");
		age = keyboard.nextInt();
		System.out.print("ID : ");
		id = keyboard.nextInt();
		System.out.print("Interest : ");
		interest = keyboard.next();
		System.out.print("Jenis kelamin : ");
		gender = keyboard.next();
		System.out.print("Courses : ");
		courses = keyboard.next();
		
		System.out.println("===================");
		
		Student pertama = new Student(name, id, age, gender, interest);	
		pertama.greeting();
		
		System.out.println("===================");
		
		Teacher kedua = new Teacher(name, id, age, gender, courses);
		kedua.greeting();
	}

}
