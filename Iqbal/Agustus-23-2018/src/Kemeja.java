
public class Kemeja extends Baju{
	String kancing;
	Kemeja(String merkKu , String kainKu , String warnaKu , String ukuranKu , int hargaKu , String kancingKu){
		super(merkKu , kainKu , warnaKu , ukuranKu , hargaKu);
		kancing = kancingKu;
	}
	void tampil(){
		super.tampil();
		System.out.println("Kancing\t: "+kancing);
	}
}
