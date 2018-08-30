import java.util.HashMap;

public abstract class Karyawan {
	String nama, nip, penempatan, jabatan, golongan;
	Boolean menikah;
	HashMap<String, Double> gaji, tunjangan, potongan;
	
	public Karyawan(String nama, String nip, String penempatan, String jabatan, String golongan, Boolean menikah) {
		super();
		this.nama = nama;
		this.nip = nip;
		this.penempatan = penempatan;
		this.jabatan = jabatan;
		this.golongan = golongan;
		this.menikah = menikah;
	}
	
	abstract double gajiPokok();
	abstract double gajiKotor();
	abstract double gajiBersih();
		
}
