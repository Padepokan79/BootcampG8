public class KamarMandi extends Ruangan{
	String bak , wc;
	int jumlahGayung , jumlahEmber;
	KamarMandi(String pintuKu ,String lantaiKu ,String atapKu ,String dindingKu , String catKu , String bakKu , String wcKu , int jumlahGayungKu,int jumlahEmberKu){
		super(pintuKu , lantaiKu , atapKu , dindingKu , catKu );
		bak = bakKu;
		wc = wcKu;
		jumlahGayung = jumlahGayungKu;
		jumlahEmber = jumlahEmberKu;
	}
	void tampil() {
		super.tampil();
		System.out.println("Bak		: "+bak);
		System.out.println("Wc		: "+wc);
		System.out.println("Jumlah gayung	: "+jumlahGayung);
		System.out.println("Jumlah Ember	: "+jumlahEmber);
	}
	
}
