
public class Property {
	String name, condition;
	int id;
	
	Property(int id, String name, String condition){
		this.id = id;
		this.name = name;
		this.condition = condition;
	}
	
	String deskripsi() {
		return "\nName : "+name+"\nID : "+id+"\nCondition : "+condition;
	}
	
}
