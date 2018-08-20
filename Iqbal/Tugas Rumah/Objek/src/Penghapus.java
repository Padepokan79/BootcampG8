
public class Penghapus {
	String gagang , warnaGagang , bahanGagang , intiPenghapus ,  bahanIntiPenghapus ;
	String[] kegunaan = {"Menghapus " , "Baledog Orang " , "ganjelMotor"};
	
	Penghapus(String gagangKu , String warnaGagangKu , String bahanGagangKu , String intiPenghapusKu , String bahanIntiPenghapusKu){
		gagang = gagangKu;
		warnaGagang = warnaGagangKu;
		bahanGagang = bahanGagangKu;
		intiPenghapus = intiPenghapusKu;
		bahanIntiPenghapus = bahanIntiPenghapusKu;
	}
	void tampilPnghapus(int pilih) {
		System.out.println("Penghapus dengan gagang "+gagang);
		System.out.println("Warna gagang "+warnaGagang+" , dengan bahan"+bahanGagang);
		System.out.println("Inti Penghapusnya berwarna "+intiPenghapus+" dengan bahan "+bahanIntiPenghapus);
		System.out.println("Kegunaan yang kamu pilih adalah "+ kegunaan[pilih]);
	}
	
}
