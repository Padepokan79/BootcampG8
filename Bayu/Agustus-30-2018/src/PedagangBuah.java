import java.util.HashMap;
import java.util.Map;
	
public class PedagangBuah {
	public static void main (String[] args) {
			Map<String, Buah> map = new HashMap<String, Buah>();
			
			Buah senin = new Buah(12, 10, 13);
			senin.setSemangka(12);
			senin.setPisang(10);
			senin.setMangga(13);
			Buah selasa = new Buah(15, 14, 12);
			selasa.setSemangka(15);
			selasa.setPisang(14);
			selasa.setMangga(12);
			Buah rabu = new Buah(11, 15, 12);
			rabu.setSemangka(11);
			rabu.setPisang(15);
			rabu.setMangga(12);
			Buah kamis = new Buah(8, 7, 15);
			kamis.setSemangka(8);
			kamis.setPisang(7);
			kamis.setMangga(15);
			Buah jumat = new Buah(20, 20, 20);
			jumat.setSemangka(20);
			jumat.setPisang(20);
			jumat.setMangga(20);
			Buah sabtu = new Buah(10, 13, 9);
			sabtu.setSemangka(10);
			sabtu.setPisang(13);
			sabtu.setMangga(9);			
			Buah minggu = new Buah(14, 16, 13);
			minggu.setSemangka(14);
			minggu.setPisang(16);
			minggu.setMangga(13);
			
			map.put("Senin", senin);
			map.put("Selasa", selasa);
			map.put("Rabu", rabu);
			map.put("Kamis", kamis);
			map.put("Jumat", jumat);
			map.put("Sabtu", sabtu);
			map.put("Minggu", minggu);
			
			for (Map.Entry<String, Buah> entry:map.entrySet()) {
				String key = entry.getKey();
				Buah fruit = entry.getValue();
				System.out.println("Semangka terjual : " +fruit.semangka+ " Kg. \nPisang terjual : " +fruit.pisang+ " kg. \nMangga terjual : " +fruit.mangga+ " kg.");
				fruit.penjualanSemangka();
				fruit.penjualanMangga();
				fruit.penjualanPisang();
				fruit.penjualanPerHari();
				fruit.penjualanPerMinggu();
				fruit.tampilkanPerHari();
		}
			Integer penghasilanMinggu;
			penghasilanMinggu = senin.penjualanPerMinggu();
			System.out.println(penghasilanMinggu);
	}
}