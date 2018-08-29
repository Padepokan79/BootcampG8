public class Laptop {
	private String merk , warna , ukuranLayar , webCam ,processor , ram ,vga , os , hardDisk;
	private int harga;
	public Laptop(String merk, String warna, String ukuranLayar, String webCam, String processor, String ram,
			String vga, String os, String hardDisk) {
		super();
		this.merk = merk;
		this.warna = warna;
		this.ukuranLayar = ukuranLayar;
		this.webCam = webCam;
		this.processor = processor;
		this.ram = ram;
		this.vga = vga;
		this.os = os;
		this.hardDisk = hardDisk;
	}
	public String getWarna() {
		return warna;
	}
	public void setWarna(String warna) {
		this.warna = warna;
	}
	public String getUkuranLayar() {
		return ukuranLayar;
	}
	public void setUkuranLayar(String ukuranLayar) {
		this.ukuranLayar = ukuranLayar;
	}
	public String getWebCam() {
		return webCam;
	}
	public void setWebCam(String webCam) {
		this.webCam = webCam;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getVga() {
		return vga;
	}
	public void setVga(String vga) {
		this.vga = vga;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}
	public String getMerk() {
		return merk;
	}
	public int getHarga() {
		if(processor.equalsIgnoreCase("I7")) {
			harga = 9000000;
		}
		else if(processor.equalsIgnoreCase("I5")) {
			harga = 6000000;
		}
		else if(processor.equalsIgnoreCase("I3")) {
			harga = 3000000;
		}
		else {
			harga = 0;
		}
		return harga;
	}
	
	void displayInformation() {
		System.out.println("Merk Laptop \t: "+merk);
		System.out.println("Warna Laptop \t: "+warna);
		System.out.println("Ukuran Layar \t:"+ukuranLayar);
		System.out.println("Web Cam \t:"+webCam);
		System.out.println("Processpr \t: "+processor);
		System.out.println("Ram \t: "+ram);
		System.out.println("Vga Card \t: "+vga);
		System.out.println("Operation System \t: "+os);
		System.out.println("Hard disk \t: "+hardDisk);
	    System.out.println("Harga \t: "+getHarga());
	}
}
