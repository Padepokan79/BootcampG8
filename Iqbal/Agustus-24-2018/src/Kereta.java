public class Kereta {
	//Variabel Requierment
	private int[] hargaTiket = {18000 , 35000 , 80000} ;
	private int penghasilanHari , penghasilanMinggu = 0 , penghasilan  , penghasilanGerbong1 , penghasilanGerbong2 , penghasilanGerbong3;
	private int jumlahPenumpang1 , jumlahPenumpang2 , jumlahPenumpang3;
	
	void setPenumpang1(int penumpang) {
		jumlahPenumpang1 = penumpang;
	}
	void setPenumpang2(int penumpang) {
		jumlahPenumpang2 = penumpang;
	}
	void setPenumpang3(int penumpang) {
		jumlahPenumpang3 = penumpang;
	}
	int getPenghasilanGerbong1() {
		penghasilanGerbong1 = penghasilanGerbong1(jumlahPenumpang1);
		return penghasilanGerbong1;
	}
	int getPenghasilanGerbong2() {
		penghasilanGerbong2 = penghasilanGerbong1(jumlahPenumpang2);
		return penghasilanGerbong2;
	}
	int getPenghasilanGerbong3() {
		penghasilanGerbong3 = penghasilanGerbong1(jumlahPenumpang3);
		return penghasilanGerbong3;
	}
	
	//KOnstruktor
	Kereta(){
		
	}
		
	//Function
	int penghasilanGerbong1(int jumlahPenumpang1) {
		return hargaTiket[0]*jumlahPenumpang1;
	}
	int penghasilanGerbong2(int jumlahPenumpang2) {
		return hargaTiket[1]*jumlahPenumpang2;
	}
	int penghasilanGerbong3(int jumlahPenumpang3) {
		return hargaTiket[2]*jumlahPenumpang3;
	}
	void penghasilanPerhari(int jumlahPenumpang1 , int jumlahPenumpang2 , int jumlahPenumpang) {
		int hasil = penghasilanGerbong1(jumlahPenumpang1)+penghasilanGerbong2(jumlahPenumpang2)+penghasilanGerbong3(jumlahPenumpang3);
		penghasilanHari = hasil;
		penghasilanMinggu += hasil;
	}

	
	
}