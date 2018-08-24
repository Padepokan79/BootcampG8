
public class HeadMaster extends Person {
	String sekolah ;
	HeadMaster(String fName , String lName , int newAge , String newGender ,String newInterests ,String sekolahNew){
		super(fName , lName , newAge , newGender , newInterests );
		sekolah = sekolahNew;
	}
	void tampil() {
		super.tampil();
		System.out.println("Head Master Of : "+sekolah);
	}
}
