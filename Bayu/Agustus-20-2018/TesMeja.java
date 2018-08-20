
public class TesMeja {
	public static void main (String [] args) {
		
		//Constractor
		Meja pertama = new Meja("Coklat", "Belajar", "Kayu", "Besar", 100000, "Olympic" );
		pertama.spesifikasiMeja();
		//Method
		Meja kedua = new Meja();
		kedua.meja("Hitam", "Arsitek", "Kayu", "Besar", 1000000, "Local");
		kedua.spesifikasiMeja();
		//Variabel
		Meja ketiga = new Meja();
		ketiga.warna = "Hitam";
		ketiga.bahan = "Jati";
		ketiga.harga = 100000;
		ketiga.jenis = "makan";
		ketiga.merk = "property";
		ketiga.ukuran = "besar";
		ketiga.spesifikasiMeja();
		Baju keempat = new Baju("katun", "kemeja", "tangan panjang", "merah maroon", "L", 100000);
		keempat.spesifikasiBaju();
		Tas kelima = new Tas ("Polyster", "Carrier", "60 L", "Hitam", 500000);
		kelima.spesifikasiTas();
		
		
	}

}
