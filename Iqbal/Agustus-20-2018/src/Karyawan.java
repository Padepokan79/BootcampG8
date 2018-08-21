// Author : Muhamad Iqbal FM , 20 Agustus 2018
public class Karyawan {
	//Buat Variable
	String nip , nama , tanggalLahir , alamat , nik , noHandphone , email , statusKaryawan  ,  jabatanKaryawan , tugasKaryawan , tempatKerjaKaryawan;
	int  masaKerjaKaryawan ,gajiKaryawan , kenaikanGaji , tunjanganHariRaya;
	
	Karyawan(String nipKu , String namaKu , String tanggalLahirKu , String alamatKu , String nikKu , String noHandphoneKu , String emailKu ,  String jabatanKaryawanKu , String tugasKaryawanKu , String tempatKerjaKaryawanKu , int masaKerjaKaryawanKu ) {
	nip = nipKu ;
	nama = namaKu;
	tanggalLahir = tanggalLahirKu;
	alamat = alamatKu;
	nik = nikKu;
	noHandphone = noHandphoneKu;
	email = emailKu;
	masaKerjaKaryawan = masaKerjaKaryawanKu;
	jabatanKaryawan = jabatanKaryawanKu ;
	tugasKaryawan = tugasKaryawanKu;
	tempatKerjaKaryawan = tempatKerjaKaryawanKu;
	
	}
	//Menentukan Status
	String status() {
		statusKaryawan = " ";
		if(masaKerjaKaryawan > 4) {
			statusKaryawan = "Tetap";
		}
		else {
			statusKaryawan = "Kontrak";
		}
		return statusKaryawan;
	}
	//Menentukan Tambahan Gaji
	int naikGaji() {
		kenaikanGaji = 100000*masaKerjaKaryawan;
		return kenaikanGaji;
	}
	//Menentukan Jumlah Gaji
	int gaji() {
		gajiKaryawan = 3100000 + naikGaji() ;
		return gajiKaryawan;
	}
	// Menentukan Jumlah THR
	int thr() {
		tunjanganHariRaya = (gaji()*80)/100;
		return tunjanganHariRaya;
	}
	
	void tampilKaryawan() {
		System.out.println("NIP				: "+nip);
		System.out.println("Nama			: "+nama);
		System.out.println("Tanggal Lahir	: "+tanggalLahir);
		System.out.println("Alamat			: "+alamat);
		System.out.println("NIK				: "+nik);
		System.out.println("No Handphone	: "+noHandphone);
		System.out.println("Email			: "+email);
		System.out.println("Status Karyawan	: "+status());
		System.out.println("Jabatan			: "+jabatanKaryawan);
		System.out.println("Tugas			: "+tugasKaryawan);
		System.out.println("Tempat Dinas	: "+tempatKerjaKaryawan);
		System.out.println("Masa Kerja		: "+masaKerjaKaryawan);
		System.out.println("Gaji			: Rp. "+gaji());
		System.out.println("THR 			: Rp. "+thr());
	}
	
}
