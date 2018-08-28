
public class Student extends Person {
	String kelas ;
	Student(String fName , String lName , int newAge , String newGender ,String newInterests ,String classNew){
		firstName = fName;
		lastName = lName;
		age = newAge;
		gender = newGender;
		interests = newInterests;
		kelas = classNew;
	}
	void tampil() {
		super.tampil();
		System.out.println("Kelas :"+kelas);
	}
}
