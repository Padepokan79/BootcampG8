
public class MainTest {
	public static void main(String[] args) {
		Person p = new Person("Person " , "Satu" , 17 , "Laki-Laki" ,"Berenang");
		p.tampil();
		Teacher t = new Teacher("Guru" , "Tercinta" , 34 , "Perempuan" , "Mengajar" , "PNS");
		t.tampil();
		Student s = new Student("Siswa" , "Ganteng" , 18 , "Laki-Laki" , "Maen Game" , "IX RPL 2");
		s.tampil();
		HeadMaster h = new HeadMaster("Kepala" , "Sekolah" , 60 , "Perempuan" , "Dapet uang" , "SMPN 123 Kota England");
		h.tampil();
	}
}
