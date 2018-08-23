
public class Classroom extends Infrastructure{
	String classname;
	
	Classroom(int id, String name, String classname, int capacity, int[] dimension, String condition){
		super(id, name, capacity, dimension, condition);
		this.classname = classname;
	}
	
	String deskripsi() {
		return super.deskripsi() + "\nClass Name : "+classname;
	}
}
