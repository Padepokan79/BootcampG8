
public class Worker extends Member{
	String position;
	
	Worker(int id, String name, int age, String gender, String position){
		super(id, name, age, gender);
		this.position = position;
	}
	
	String bio() {
		return super.bio() + " A "+position;
	}
	
	String greeting() {
		return super.greeting() + ", I'm a "+position;
	}
}
