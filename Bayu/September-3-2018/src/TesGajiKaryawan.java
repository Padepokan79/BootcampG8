
public class TesGajiKaryawan {
	public static void main(String[] args) {
		
		Programmer pertama = new Programmer("Brian", 123123, "jakarta", 3, "programmer", "middle", "sudah", 2, 2);
		SystemAnalist kedua = new SystemAnalist("Matthew", 123123, "bandung", 4, "systemanalist", "junior", "sudah", 3, 3);
		Tester ketiga = new Tester("James", 6661, "surabaya", 5,  "tester", "senior", "sudah", 5, 8);
		TechnicalWriter keempat = new TechnicalWriter("Sullivan", 66611, "karawang", 7, "tachnicalwriter", "senior", "sudah", 7, 7);
		
		//method programmer
		pertama.setHashMapGapok();
		pertama.setTunjPegawai();
		pertama.indeksGapok();
		pertama.hitungUmk();
		pertama.hitungGapok();
		pertama.hitungLembur();
		pertama.hitungTunjanganKeluarga();
		pertama.hitungTunjanganTransport();
		pertama.hitungTunjanganPegawai();
		pertama.hitungBonus();
		pertama.hitungBpjs();
		pertama.hitungNetto();
		pertama.hitungPtkp();
		pertama.hitungpkp();
		pertama.hitungGajiTotal();
		pertama.tampilkan();
		
		//method system analist
		kedua.setHashMapGapok();
		kedua.setTunjPegawai();
		kedua.indeksGapok();
		kedua.hitungUmk();
		kedua.hitungGapok();
		kedua.hitungLembur();
		kedua.hitungTunjanganKeluarga();
		kedua.hitungTunjanganTransport();
		kedua.hitungTunjanganPegawai();
		kedua.hitungBonus();
		kedua.hitungBpjs();
		kedua.hitungNetto();
		kedua.hitungPtkp();
		kedua.hitungpkp();
		kedua.hitungGajiTotal();
		kedua.tampilkan();
		
		//method tester
		ketiga.setHashMapGapok();
		ketiga.setTunjPegawai();
		ketiga.indeksGapok();
		ketiga.hitungUmk();
		ketiga.hitungGapok();
		ketiga.hitungLembur();
		ketiga.hitungTunjanganKeluarga();
		ketiga.hitungTunjanganTransport();
		ketiga.hitungTunjanganPegawai();
		ketiga.hitungBonus();
		ketiga.hitungBpjs();
		ketiga.hitungNetto();
		ketiga.hitungPtkp();
		ketiga.hitungpkp();
		ketiga.hitungGajiTotal();
		ketiga.tampilkan();
		
		//method Technical Writer
		keempat.setHashMapGapok();
		keempat.setTunjPegawai();
		keempat.indeksGapok();
		keempat.hitungUmk();
		keempat.hitungGapok();
		keempat.hitungLembur();
		keempat.hitungTunjanganKeluarga();
		keempat.hitungTunjanganTransport();
		keempat.hitungTunjanganPegawai();
		keempat.hitungBonus();
		keempat.hitungBpjs();
		keempat.hitungNetto();
		keempat.hitungPtkp();
		keempat.hitungpkp();
		keempat.hitungGajiTotal();
		keempat.tampilkan();
		
	}
}