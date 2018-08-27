
public class PersonBaru {
	private String nameFirst, nameLast, gender, interest;
	private int age;
	
	PersonBaru(String nameFirst, String nameLast, String gender, String interest, int age) {
		super();
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		this.gender = gender;
		this.interest = interest;
		this.age = age;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNameFirst() {
		return nameFirst;
	}

	public String getNameLast() {
		return nameLast;
	}

	public String getGender() {
		return gender;
	}
	
	public String greeting() {
		return "Hi, I'am " +nameFirst+ " I would like " +interest;
	}
	
	void tampilkan() {
		System.out.println("Nama Depan      : " +getNameFirst());
		System.out.println("Nama Belakang   : " +getNameLast());
		System.out.println("Usia            : " +getAge());
		System.out.println("Jenis Kelamin   : " +getGender());
		System.out.println("Hobi            : " +getInterest());
		System.out.println(greeting());
	}
	

}
