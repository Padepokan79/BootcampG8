
public class Teacher extends Person {
	String status ;
	Teacher(String fName , String lName , int newAge , String newGender ,String newInterests ,String statusNew){
		firstName = fName;
		lastName = lName;
		age = newAge;
		gender = newGender;
		interests = newInterests;
		status = statusNew;
	}
	void tampil() {
		super.tampil();
		System.out.println("Status : "+status);
	}
	
}
