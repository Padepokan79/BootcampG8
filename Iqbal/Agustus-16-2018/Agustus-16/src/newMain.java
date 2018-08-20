//Author : Muhamad Iqbal FM , 16 Agustus 2018 
public class newMain {
	public static void main(String[] args) {
		Person satu = new Person();
		satu.firstName = "Iqbal";
		satu.lastName = "FM";
		satu.age = 18 ;
		satu.gender = "Male";
		satu.interests = "Playing Dota";
		satu.tampil();
		
		Person dua = new Person();
		dua.caraMetod("bayu", "BayuJuga", 23, "Male", "Playing");
		dua.tampil();
		
		Person tiga = new Person("Toni", "Sultoni" , 18 , "Male" , "Playing Too");
		tiga.tampil();
	}
}
