
public class Baju {
	String merk , kain , warna , ukuran ;
	int  harga;
	Baju(){
		
	}
	Baju(String merkKu , String kainKu , String warnaKu , String ukuranKu , int hargaKu ){
		merk = merkKu;
		kain = kainKu ;
		warna = warnaKu;
		ukuran = ukuranKu;
		harga = hargaKu;
	}
	void tampil() {
		System.out.println("Baju\t: "+merk);
		System.out.println("Jenis Kain\t: "+kain);
		System.out.println("Warna Kain\t: "+warna);
		System.out.println("Ukuran\t: "+ukuran);
		System.out.println("Harga\t: "+harga);
	}
	
}
