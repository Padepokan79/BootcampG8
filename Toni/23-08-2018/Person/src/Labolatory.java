
public class Labolatory extends Infrastructure{
	String subject;
	
	Labolatory(int id, String name, String subject, int capacity, int[] dimension, String condition){
		super(id, name, capacity, dimension, condition);
		this.subject = subject;
	}
	
	String deskripsi() {
		return super.deskripsi() + "\nSubject : "+subject;
	}
}
