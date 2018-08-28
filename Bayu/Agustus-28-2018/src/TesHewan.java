
public class TesHewan {
	public static void main (String [] args) {
		
		Hewan pertama = new Hewan("Harimau", "ya", "ya", "ya", 4);
		pertama.tampilkan();
		System.out.println("========================================");
		Mamalia kedua = new Mamalia("Gajah", "tebal", "ya", "ya", 4, "Hitam", "lebar", "ya");
		kedua.tampilkan();
		System.out.println("========================================");
		Unggas ketiga = new Unggas("Burung Hantu", "ya", "ya", "ya", 2, "ya", "ya", "ya");
		ketiga.tampilkan();
		System.out.println("========================================");
		Reptile keempat = new Reptile("Buaya", "ya", "ya", "ya", 4, "ya", "ya", "ya");
		keempat.tampilkan();
		
	}

}
