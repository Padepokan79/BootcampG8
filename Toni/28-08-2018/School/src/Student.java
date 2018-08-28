
public class Student extends Person {
	String interest;
	
	Student(String name, String gender, int id, int age, String interest){
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.age = age;
		this.interest = interest;
	}
	
	public String bio() {
		return super.bio() + " Student.";
	}
	
	public String greeting() {
		return super.greeting() + " I like " + interest;
	}
}
