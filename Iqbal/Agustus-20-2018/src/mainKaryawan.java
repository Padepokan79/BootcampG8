//Author : Muhamad Iqbal FM 20-Agustus-2018
import java.util.Scanner;
public class mainKaryawan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		String nipKu , namaKu , tanggalLahirKu , alamatKu , nikKu , noHandphoneKu , emailKu ,  jabatanKaryawanKu , tugasKaryawanKu , tempatKerjaKaryawanKu ;
		 int masaKerjaKaryawanKu ;
		 
		 System.out.println("Masukan Nip");
		 nipKu = input.next();
		 System.out.println("Masukan Nama");
		 namaKu = input1.nextLine();
		 System.out.println("Masukan Tanggal Lahir");
		 tanggalLahirKu = input.next();
		 System.out.println("Masukan Alamat ");
		 alamatKu = input.next();
		 System.out.println("Masukan NIK(Nomor induk Kependudukan");
		 nikKu = input.next();
		 System.out.println("Masukan Nomor Handphone ");
		 noHandphoneKu = input.next();
		 System.out.println("Masukan EmailKu");
		 emailKu = input.next();
		 System.out.println("Masukan Jabatan ");
		 jabatanKaryawanKu = input1.nextLine();
		 System.out.println("Masukan Tugas Karyawan");
		 tugasKaryawanKu = input1.nextLine();
		 System.out.println("Masukan Tempat Kerja");
		 tempatKerjaKaryawanKu = input1.nextLine();
		 System.out.println("Masukan Masa Kerja");
		 masaKerjaKaryawanKu = input.nextInt();
		 
		 Karyawan orang = new Karyawan(nipKu , namaKu , tanggalLahirKu , alamatKu , nikKu , noHandphoneKu , emailKu , jabatanKaryawanKu , tugasKaryawanKu , tempatKerjaKaryawanKu , masaKerjaKaryawanKu);
		 orang.tampilKaryawan();
	}
	
}
