
public class Staff extends Worker{
	String sector;
	
	Staff(int id, String name, int age, String gender, String position, String sector){
		super(id, name, age, gender, position);
		this.sector = sector;
	}
	
	String bio() {
		return super.bio() + " "+sector;
	}
	
	String greeting() {
		return super.greeting() + " And I'm a"+sector+" Staff";
	}
}
