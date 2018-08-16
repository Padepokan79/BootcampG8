/* 	
 * Aurhor  : Muhammad Sultoni 
 * Created : 16-08-2018 
 */
public class Student {
	int id;
	String nama, gender;
	
	Student(int i, String n, String g) {
		id = i;
		nama = n;
		gender = g;
	}
	
	void displayInformation() {
		System.out.println("Siswa Nomor "+id+" Dengan Nama "+nama+" Adalah "+gender);
	}
}
