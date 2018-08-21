
public class Celana {

	String kegunaan , jenisResleting , ukuran , jenisKain , warnaKain ,bahanKancing , warnaKancing , jenisBenang , warnaBenang , merk;
	int harga;
	Celana(String ukuranKu , String jenisKainKu , String warnaKainKu , String jenisKancingKu , String warnaKancingKu,String jenisBenangKu , String warnaBenangKu , String merkKu , int hargaKu , String kegunaanKu , String jenisResletingKu){
		ukuran = ukuranKu ;
		jenisKain = jenisKainKu;
		warnaKain = warnaKainKu;
		bahanKancing = jenisKancingKu;
		warnaKancing = warnaKancingKu;
		jenisBenang = jenisBenangKu ;
		warnaBenang = warnaBenangKu;
		kegunaan = kegunaanKu;
		merk = merkKu;
		harga = hargaKu;
		jenisResleting = jenisResletingKu;
	}
	void tampilCelana(){
		System.out.println("Celana dengan Merk "+ merk + ", dan berukuran :"+ukuran);
		System.out.println("Celana Ini Memiliki Jenis Kain "+jenisKain+" Berwarna "+warnaKain);
		System.out.println("Kancing nya ber bahan "+bahanKancing+" berwarna "+warnaKancing + " Dengan Resleting :"+jenisResleting);
		System.out.println("dan diJahit dengan benang "+jenisBenang + " Berwarna"+warnaBenang);
		System.out.println("Harga Celana Ini Sangat Murah yaitu Rp."+harga);
		System.out.print("Celana ini Berguna untuk"+kegunaan);
	}


}
