
public class Main {
	public static void main(String[] args) {
		Laptop asus = new Laptop("Asus", "i3", "NVidia", "4GB", "1TB");
		
		asus.info();
		System.out.println("Harga\t  : Rp."+asus.getHarga());
	}
}
