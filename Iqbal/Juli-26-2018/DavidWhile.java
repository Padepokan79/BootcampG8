public class DavidWhile {
	public static void main(String[] args ){
		int jumlahGaji = 0;
		int gajiAwal = 3000000 ; 
		int kenaikanGaji = 10 * gajiAwal/100 ;
		int gajiTahunIni = gajiAwal ;
		int jumlahBulan = 12 ;
		int jumlahTahun = 12  ;
		int gajiTahun = 1 ;
		while( gajiTahun <= jumlahTahun){
			int gajiBulan = 1 ; 
			while(gajiBulan <= jumlahBulan){
				jumlahGaji += gajiTahunIni;
				gajiBulan++;;
			}
			gajiTahun++;;
			gajiTahunIni += kenaikanGaji ;
		}
  		System.out.println("Jumlah Gaji david : Rp. "+ jumlahGaji);
	}
}