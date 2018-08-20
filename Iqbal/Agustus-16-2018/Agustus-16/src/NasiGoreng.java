//Author : Muhamad Iqbal FM , 16 Agustus 2018 
public class NasiGoreng {
	
	int nasi , telur , minyakGoreng , dagingAyam , sayurSayuran , bumbu;
	
	NasiGoreng(int nasiKu , int telurKu , int minyakGorengKu , int dagingAyamKu , int sayurSayuranKu , int bumbuKu){
		nasi = nasiKu ;
		telur = telurKu;
		minyakGoreng = minyakGorengKu;
		dagingAyam = dagingAyamKu;
		sayurSayuran = sayurSayuranKu ;
		bumbu = bumbuKu;
	}
	int hargaDasar() {
		int jumlahHargaDasar = nasi+telur+minyakGoreng+dagingAyam+sayurSayuran+bumbu;
		return jumlahHargaDasar;
	}
	int hargaJual() {
		int untung = (hargaDasar()*15)/100;
		int jumlahHargaJual = hargaDasar()+untung;
		return jumlahHargaJual;
	}
	
	void tampilHarga(){
		System.out.println("Harga Minggu Ini");
		System.out.println("Harga Dasar : Rp. "+hargaDasar());
		System.out.println("Harga Jual  : Rp. "+hargaJual());
	}
	
	
}
