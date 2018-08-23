
public class Teacher extends Person {
	String status ;
	Teacher(String fName , String lName , int newAge , String newGender ,String newInterests ,String statusNew){
		super(fName , lName , newAge , newGender , newInterests );
		status = statusNew;
	}
	void tampil() {
		super.tampil();
		System.out.println("Status : "+status);
	}
	
}
