
public class Student extends Person {
	String interest;
	
	Student(String name, String gender, int id, int age, String interest){
		this.setName(name);
		this.setGender(gender);
		this.setId(id);
		this.setAge(age);
		this.interest = interest;
	}
	
	public String bio() {
		return super.bio() + " Student.";
	}
	
	public String greeting() {
		return super.greeting() + " I like " + interest;
	}
}
