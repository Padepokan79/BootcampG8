
public class Committee extends Worker{
	String section;
	
	Committee(int id, String name, int age, String gender, String position, String section){
		super(id, name, age, gender, position);
		this.section = section;
	}
	
	String bio() {
		return super.bio() + " of "+section;
	}
	
	String greeting() {
		return super.greeting() + " of "+section;
	}
}
