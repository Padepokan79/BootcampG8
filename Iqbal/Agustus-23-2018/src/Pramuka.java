
public class Pramuka extends Osis{
	String bajuSeragam , golongan , saka;
	Pramuka(String ketuaKu , String wakilKetuaKu , String sekertarisKu ,String bendaharaKu ,String kegiatanKu ,String golonganKu ){
		super(ketuaKu , wakilKetuaKu ,sekertarisKu , bendaharaKu , kegiatanKu );
		golongan = golonganKu ;
	}
	Pramuka(String ketuaKu , String wakilKetuaKu , String sekertarisKu ,String bendaharaKu ,String kegiatanKu ,String golonganKu , String sakaKu){
		super(ketuaKu , wakilKetuaKu ,sekertarisKu , bendaharaKu , kegiatanKu );
		golongan = golonganKu ;
		saka = sakaKu;
	}
	void tampil() {
		super.tampil();
		System.out.println(baju(golongan , saka));		
	}
	String baju(String golongan , String saka) {
		bajuSeragam = "";
		if(golongan.equals("SIAGA")) {
			bajuSeragam = "Coklat Polet Hijau";
		}
		else if(golongan.equals("PENGGALANG")) {
			bajuSeragam = "Coklat Polet Merah";
		}
		else if(golongan.equals("PENEGAK")) {
			if(saka.equals("BHAYANGKARA")) {
				bajuSeragam = "Coklat Pramuka Polet Polisi";
			}
			else if(saka.equals("DIRGANTARA")) {
				bajuSeragam = "Coklat Pramuka Polet TNI AU";
			}
			else if(saka.equals("WIRA KARTIKA")) {
				bajuSeragam = "Coklat Pramuka Polet TNI AD";
			}
			else if(saka.equals("BAHARI")) {
				bajuSeragam = "Coklat Pramuka Polet TNI AL";
			}
			else {
				bajuSeragam = "Coklat Polet Kuning";
			}
		}
		else {
			bajuSeragam = "Coklat Polet Coklat Tua";
		}
		return "Golongan \t: "+ golongan + "\n" + "Seragam \t: "+bajuSeragam;
	}
}
