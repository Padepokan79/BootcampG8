
public class Teacher extends Person {
String subject;
	
	Teacher(String name, String gender, int id, int age, String subject){
		this.setName(name);
		this.setGender(gender);
		this.setId(id);
		this.setAge(age);
		this.subject = subject;
	}
	
	public String bio() {
		return super.bio() + " Teacher.";
	}
	
	public String greeting() {
		return super.greeting() + " I Teach " + subject;
	}
}
