
public class Teacher extends Person {
	String courses;
	
	public Teacher(String name, int id, int age, String gender, String courses) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.courses = courses;
	}
	
	public void greeting() {
		super.greeting();
		System.out.println("Courses : " +courses);
		System.out.println("Hi, I'am " +name+ " i would courses " +this.courses);
		
	}
}
