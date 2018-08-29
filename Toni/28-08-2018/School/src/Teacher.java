
public class Teacher extends Person {
String subject;
	
	Teacher(String name, String gender, int id, int age, String subject){
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.age = age;
		this.subject = subject;
	}
	
	public String bio() {
		return super.bio() + " Teacher.";
	}
	
	public String greeting() {
		return super.greeting() + " I Teach " + subject;
	}
}
