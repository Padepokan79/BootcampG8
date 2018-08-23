
public class Tools extends Property{
	String category, material, subject;
	
	Tools(int id, String name, String condition, String category, String material, String subject){
		super(id, name, condition);
		this.category = category;
		this.material = material;
		this.subject = subject;
	}
	
	String deskripsi() {
		return super.deskripsi()+"\nCategory: "+category+"\nMaterial : "+material+"\nSubject : "+subject;
	}
}
