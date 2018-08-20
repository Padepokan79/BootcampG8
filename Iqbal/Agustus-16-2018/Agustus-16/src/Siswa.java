//Author : Muhamad Iqbal FM , 16 Agustus 2018 
public class Siswa {
 int id;
 String name , gender;
 	Siswa(int idSiswa , String namaSiswa , String jenisKelamin){
 		id = idSiswa;
 		name = namaSiswa;
 		gender = jenisKelamin;
 	}
 	void masukanInput(String n , int i , String mf) {
 		name = n;
 		id = i;
 		gender = mf;
 	}
 	void tampilkanInput() {
 		System.out.println(id + " " + name + " " + gender);
 	}
}
