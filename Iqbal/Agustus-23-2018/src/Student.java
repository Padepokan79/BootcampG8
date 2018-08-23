
public class Student extends Person {
	String kelas ;
	Student(String fName , String lName , int newAge , String newGender ,String newInterests ,String classNew){
		super(fName , lName , newAge , newGender , newInterests );
		kelas = classNew;
	}
	void tampil() {
		super.tampil();
		System.out.println("Kelas : "+kelas);
	}
}
