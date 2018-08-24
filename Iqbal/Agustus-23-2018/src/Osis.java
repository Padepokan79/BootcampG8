public class Osis {
	String ketua , wakilKetua , sekertaris , bendahara , kegiatan;
	Osis(){
		
	}
	Osis(String ketuaKu , String wakilKetuaKu , String sekertarisKu ,String bendaharaKu ,String kegiatanKu){
		ketua = ketuaKu ;
		wakilKetua = wakilKetuaKu ;
		sekertaris = sekertarisKu ;
		bendahara = bendaharaKu;
		kegiatan = kegiatanKu;
	}
	void tampil() {
		System.out.println("KETUA\t:\t"+ketua);
		System.out.println("Wakil Ketua\t:\t"+wakilKetua);
		System.out.println("Sekertaris\t:\t"+sekertaris);
		System.out.println("Bendahara\t:\t"+bendahara);
		System.out.println("Kegiatan\t:\t"+kegiatan);
	}
	
}
