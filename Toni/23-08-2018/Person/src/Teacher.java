
public class Teacher extends Worker{
	String subject;
	
	Teacher(int id, String name, int age, String gender, String position, String subject){
		super(id, name, age, gender, position);
		this.subject = subject;
	}
	
	String bio() {
		return super.bio() + "of "+subject;
	}
	
	String greeting() {
		return super.greeting() + " And I teach "+subject;
	}
}
