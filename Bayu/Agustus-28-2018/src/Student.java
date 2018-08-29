
public class Student extends Person {
	String interest;
	
	public Student( String namaSiswa, int idSiswa, int age, String jenisKelamin, String interest) {
		id = idSiswa;
		name = namaSiswa;
		this.age = age;
		gender = jenisKelamin;
		this.interest = interest;
	}
			
	public void greeting() { 
		super.greeting();
			System.out.println("interest  : " +this.interest);
			System.out.println("Hi, I'am " +name+ " i would like " +this.interest);
	}
}
