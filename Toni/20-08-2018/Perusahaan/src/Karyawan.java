/*
 * Author Muhammad Sultoni
 * 20 Agustus 2018
 * 09:00 AM
 */
public class Karyawan {
	String nama, tanggalLahir, alamat, telepon, email, jabatan, nik, alasan;
	int id, masaKerja;
	double gaji;
	boolean aktif = true;
	
	Karyawan(String nama, String[] data, int[] data2 ){
		this.nama = nama;
		tanggalLahir = data[0];
		alamat = data[1];
		jabatan = data[2];
		nik = data[3];
		telepon = data[4];
		email = data[5];
		
		id = data2[0];
		masaKerja = data2[1];
		gaji();
	}
	
	// Hitung Gaji
	void gaji() {
		switch(jabatan.toLowerCase()) {
		case "karyawan":
			gaji = 4000000.0 + (masaKerja * (0.05 * 4000000.0));
		break;
		case "manajer":
			gaji = 8000000.0 + (masaKerja * (0.05 * 8000000.0));
		break;
		case "direktur":
			gaji = 20000000.0 + (masaKerja * (0.05 * 20000000.0));
		break;
		case "boss":
			gaji = 100000000.0;
		break;
		}
	}
	
	// Naik Jabatan
	void naik_jabatan() {
		if(masaKerja >= 4 && aktif == true)
			switch(jabatan.toLowerCase()) {
				case "karyawan" :
					jabatan = "manajer";
					System.out.print("Selamat, anda naik jabatan dari Karyawan menjadi Manajer");
				break;
				case "manajer" :
					jabatan = "direktur";	
					System.out.print("Selamat, anda naik jabatan dari Manajer menjadi Direktur");
				break;
				default :
					System.out.println("Anda tidak memenuhi kriteria untuk naik Jabatan");
				break;
			}
		else
			System.out.println("Anda tidak memenuhi kriteria untuk naik Jabatan");
	}
	
	// Tampilkan Bio
	void bio() {
		System.out.println("==============================");
		System.out.println("Nama\t: "+nama);
		System.out.println("Jabatan\t: "+jabatan);
		System.out.println("ID\t: "+id);
		System.out.println("==============================");
		System.out.println("T Lahir\t: "+tanggalLahir);
		System.out.println("Alamat\t: "+alamat);
		System.out.println("Telepon\t: "+telepon);
		System.out.println("Email\t: "+email);
		System.out.println("==============================");
	}
	
	// Tambah masa Kerja
	void kerja(int tahun) {
		if(aktif == true)
			masaKerja += tahun;
		else
			pecat(alasan);
	}
	
	// Pecat Karyawan
	void pecat(String alasan){
		this.alasan = alasan;
		System.out.println("Anda Dipecat karena "+alasan);
		aktif = false;
	}
	
	
	
}
