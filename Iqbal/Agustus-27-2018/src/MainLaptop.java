public class MainLaptop {
	public static void main(String[] args) {
		Laptop lenovo = new Laptop("Lenovo", "Hitam", "12 Inch", "720 HD", "I3", "4 Gb" , "Celeron", "Windows 8.1", "500GB");
		lenovo.displayInformation();
		System.out.println();
		lenovo.setProcessor("i5");
		lenovo.setHardDisk("1 TB");
		lenovo.displayInformation();
	}
}
