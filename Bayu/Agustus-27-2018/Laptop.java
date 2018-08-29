
public class Laptop {
	private String ram, vga, processor, hdd, warna, ukuranLayar, wifi, bluetooth, os, merk, tipe;
	private int harga;
	
	public Laptop(String ram, String vga, String processor, String hdd, String warna, String ukuranLayar, String wifi,
			String bluetooth, String os, String merk, String tipe) {
		super();
		this.ram = ram;
		this.vga = vga;
		this.processor = processor;
		this.hdd = hdd;
		this.warna = warna;
		this.ukuranLayar = ukuranLayar;
		this.wifi = wifi;
		this.bluetooth = bluetooth;
		this.os = os;
		this.merk = merk;
		this.tipe = tipe;
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

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
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

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getTipe() {
		return tipe;
	}

	public void setTipe(String tipe) {
		this.tipe = tipe;
	}

	public String getMerk() {
		return merk;
	}

	public int getHarga() {
		if ( processor.equals("i7")) {
			harga = 9000000;
		}
		else if (processor.equals("i5")) {
			harga = 6000000;
		}
		return harga;
	}
	
	void DisplayInformation () {
		System.out.print("Merk = " +merk );
		System.out.print("Processor = " +processor );
		System.out.print("VGA = " +vga );
		System.out.print("RAM = " +ram );
		System.out.print("Harddisk = " +hdd );
		System.out.print("Warna = " +warna );
		System.out.print("Ukuran Layar = " +ukuranLayar );
		System.out.print("Bluetooth = " +bluetooth );
		System.out.print("Sistem Operasi = " +os );
		System.out.print("Harga = " +harga );
	}
	
	
	

}
