
public abstract class Person {
	String name, gender, interest;
	int age, id;
	
	public void greeting() {
		System.out.println("Nama      : " +this.name);
		System.out.println("id        : " +id);
		System.out.println("age       : " +age);
		System.out.println("gender    : " +gender);
	}
		
	
	/*void tampilkan() {
		System.out.println("Nama Depan      : " +getNameFirst());
		System.out.println("Nama Belakang   : " +getNameLast());
		System.out.println("Usia            : " +getAge());
		System.out.println("Jenis Kelamin   : " +getGender());
		System.out.println("Hobi            : " +getInterest());
		System.out.println(greeting());
	}*/
}
