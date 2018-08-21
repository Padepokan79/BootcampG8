
public class Baju {
	String kegunaan , ukuran , jenisKain , warnaKain ,bahanKancing , warnaKancing , jenisBenang , warnaBenang , merk;
	int harga;
	Baju(String ukuranKu , String jenisKainKu , String warnaKainKu , String jenisKancingKu , String warnaKancingKu,String jenisBenangKu , String warnaBenangKu , String merkKu , int hargaKu , String kegunaanKu){
		ukuran = ukuranKu ;
		jenisKain = jenisKainKu;
		warnaKain = warnaKainKu;
		bahanKancing = jenisKancingKu;
		warnaKancing = warnaKancingKu;
		jenisBenang = jenisBenangKu ;
		kegunaan = kegunaanKu;
		warnaBenang = warnaBenangKu;
		merk = merkKu;
		harga = hargaKu;
	}
	void tampilBaju(){
		System.out.println("Baju dengan Merk "+ merk + ", dan berukuran :"+ukuran);
		System.out.println("Baju Ini Memiliki Jenis Kain "+jenisKain+" Berwarna "+warnaKain);
		System.out.println("Kancing nya ber bahan "+bahanKancing+" berwarna "+warnaKancing);
		System.out.println("dan diJahit dengan benang "+jenisBenang + " Berwarna"+warnaBenang);
		System.out.println("Harga Baju Ini Sangat Murah yaitu Rp."+harga);
		System.out.print("Baju ini Berguna untuk"+kegunaan);
	}
	
}
