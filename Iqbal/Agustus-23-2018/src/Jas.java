
public class Jas extends Baju{
	String dasi;
	Jas(String merkKu , String kainKu , String warnaKu , String ukuranKu , int hargaKu , String dasiKu){
		super(merkKu , kainKu , warnaKu , ukuranKu , hargaKu);
		dasi = dasiKu;
	}
	void tampil(){
		super.tampil();
		System.out.println("dasi\t: "+dasi);
	}
}
