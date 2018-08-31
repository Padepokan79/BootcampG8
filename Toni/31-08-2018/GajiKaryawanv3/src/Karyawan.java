import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;

public abstract class Karyawan {
	String name, nik, penempatan, tingkatJabatan, posisi;
	Boolean menikah;
	int masaKerja;
	HashMap<String, Double> tunjangan = new HashMap<String, Double>(), 
	potongan = new HashMap<String, Double>(),
	gaji = new HashMap<String, Double>();
	
	public Karyawan(String name, String nik, String penempatan, Boolean menikah, int mas, String tingkatJabatan, String posisi) {
		super();
		this.name = name;
		this.nik = nik;
		this.penempatan = penempatan;
		this.menikah = menikah;
		this.tingkatJabatan = tingkatJabatan;
		this.posisi = posisi;
	}
	
	abstract double gajiPokok();
	abstract double gajiKotor();
	abstract double gajiBersih();
	
	void slit() {
		System.out.println("========================================");
		System.out.println("Nama   	   : "+name);
		System.out.println("NIK        : "+nik);
		System.out.println("Penempatan : "+penempatan);
		System.out.println("Posisi     : "+posisi);
		System.out.println("Tingkat    : "+tingkatJabatan);
		System.out.println("----------------------------------------");
	}
	
	double round(double number) {
		NumberFormat formatter = new DecimalFormat("##0.00");
		return Double.parseDouble(formatter.format(number));
	}
	
	
	
}
