public class David {
	public static void main(String[] args ){
		int jumlahGaji = 0;
		int gajiAwal = 3000000 ; 
		int kenaikanGaji = 10 * gajiAwal/100 ;
		int gajiTahunIni = gajiAwal ;
		int jumlahBulan = 12 ;
		int jumlahTahun = 12  ;
		for(int gajiTahun = 1 ; gajiTahun <= jumlahTahun ; gajiTahun++){
			for(int gajiBulan = 1 ; gajiBulan <= jumlahBulan ; gajiBulan++){
				jumlahGaji += gajiTahunIni;
			}
			gajiTahunIni += kenaikanGaji ;
		}
  		System.out.println("Jumlah Gaji david : Rp. "+ jumlahGaji);
	}
}