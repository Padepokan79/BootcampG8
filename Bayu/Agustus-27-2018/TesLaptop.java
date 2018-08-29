
public class TesLaptop {
	public static void main (String [] args ) {
		
		Laptop pertama = new Laptop("2 Gb", "Nvidia" , "i7", "500 Gb", "Hitam", "14 inchi", "ya" , "ya", "win 10", "Asus", "X441");
		pertama.setRam("8 GB");
		pertama.setHdd("1 TB");
		
		System.out.println("Merk           : " +pertama.getMerk());
		System.out.println("RAM            : " +pertama.getRam());
		System.out.println("Harddisk       : " +pertama.getHdd());
		System.out.println("VGA            : " +pertama.getVga());
		System.out.println("Sistem Oerasi  : " +pertama.getOs());
		System.out.println("Processor      : " +pertama.getProcessor());
		System.out.println("Tipe           : " +pertama.getTipe());
		System.out.println("Ukuran layar   : " +pertama.getUkuranLayar());
		System.out.println("Warna          : " +pertama.getWarna());
		System.out.println("Wi-Fi          : " +pertama.getWifi());
		System.out.println("Bluetooth      : " +pertama.getBluetooth());
		System.out.println("Harga          : " +pertama.getHarga());
	}
}
