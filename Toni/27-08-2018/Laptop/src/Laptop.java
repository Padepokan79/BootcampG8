class Laptop{
	private String merk, processor, gpu, ram, hdd;
	int harga; 
	
	
	public Laptop(String merk, String processor, String gpu, String ram, String hdd) {
		super();
		this.merk = merk;
		this.processor = processor;
		this.gpu = gpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	
	
	public String getProcessor() {
		return processor;
	}



	public void setProcessor(String processor) {
		this.processor = processor;
	}



	public String getGpu() {
		return gpu;
	}



	public void setGpu(String gpu) {
		this.gpu = gpu;
	}



	public String getRam() {
		return ram;
	}



	public void setRam(String ram) {
		this.ram = ram;
	}



	public String getHdd() {
		return hdd;
	}



	public void setHdd(String hdd) {
		this.hdd = hdd;
	}



	public String getMerk() {
		return merk;
	}



	public int getHarga() {
		if(processor.equals("i3"))
			harga = 4000000;
		if(processor.equals("i5"))
			harga = 6000000;
		if(processor.equals("i7"))
			harga = 9000000;
		return harga;
	}

	public void info() {
		System.out.println("Merk\t: "+getMerk());
		System.out.println("Processor : "+getProcessor());
		System.out.println("Ram\t  : "+getRam());
		System.out.println("GPU\t  : "+getGpu());
		System.out.println("Harddisk  : "+getHdd());
	}
	
}