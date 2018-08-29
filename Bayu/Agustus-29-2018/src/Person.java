
public class Person {
	private String firstName, lastName, gender, interest;
	private int age, id;
	
	Person(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public String getInterest() {
		return interest;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}
	
	void bio () {
		System.out.println("Hi, I'am " +firstName+ " I'am " +age+ " years old. So glad to meet you. ");
	}
	
	public void greeting() {
		System.out.println("I'am interest " +interest);
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
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
