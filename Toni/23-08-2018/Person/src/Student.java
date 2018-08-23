
public class Student extends Member {
	String classes;
	
	Student(int id, String name, int age, String gender, String classes){
		super(id, name, age, gender);
		this.classes = classes;
	}
	
	String bio() {
		return super.bio() + " A Member of class "+classes;
	}
	
	String greeting() {
		return super.greeting() + " And I study in class "+classes;
	}
}
