import java.util.ArrayList;
import java.util.Scanner;
public class MainKaryawanNewReborn {
	public static void main(String[] args) {
		
		KaryawanNewReborn karyawan = new KaryawanNewReborn();
		ArrayList<KaryawanNewReborn> karyawanKu = new ArrayList<KaryawanNewReborn>();
		//Variabel Requirment
		Scanner input = new Scanner(System.in);
		Scanner inputPanjang = new Scanner(System.in);
		String nikKu , namaKu , lokasiKu = "" , pekerjaanKu="";
		String tambah = "n";
		do {
			//Input
			System.out.println("Masukan Nik :");
			nikKu = input.next();
			System.out.println("Masukan Nama :");
			namaKu = inputPanjang.nextLine();
			System.out.println("Pilih Lokasi Kerja(1.Bandung / 2.Jakarta / 3.Karawang)");
			int pilih = input.nextInt();
			System.out.println("Masukan Pekerjaan(1.Programer / 2.S.Analis / 3.Tester / 4.Text Writer");
			int pilih1 = input.nextInt();
			System.out.println("Apakah Kamu Sudah Menikah(y/n");
			String pilih2 = input.next();
			System.out.println("Masukan Masa Kerja");
			double pilih3 = input.nextDouble();
			System.out.println("Masukan Jam Lembur :");
			double pilih4 = input.nextDouble();
			
			//Inisialisasi
				//TempatKerja
			switch(pilih) {
			
			case 1:
				lokasiKu = "Bandung";
				break;
			case 2:
				lokasiKu = "Jakarta";
				break;
			case 3:
				lokasiKu = "Karawang";
			}
				//Pekerjaan
			switch(pilih1) {
			case 1:
				pekerjaanKu =  "Programer";
				break;
			case 2:
				pekerjaanKu = "S.Analis";
				break;
			case 3:
				pekerjaanKu = "Tester";
				break;
			case 4:
				pekerjaanKu = "T.Writer";
			}
							
			
			//Insert To Set Variable
			karyawan.setNik(nikKu);
			karyawan.setNama(namaKu);
			karyawan.setPenempatanKerja(lokasiKu);
			karyawan.setPekerjaan(pekerjaanKu);
			if(pilih2.equals("y") || pilih2.equals("Y")) {
				karyawan.setKeluarga("y", 1);
			}
			karyawan.setMasaKerja(pilih3);
			karyawan.setJamLembur(pilih4);
			karyawanKu.add(karyawan);
			System.out.println("Apakah anda akan Menambahkan Pegawai Lain(Y/N)");
			tambah = input.next();
		}
		while(!tambah.equalsIgnoreCase("n"));
		String exitMenu = "y";
		do {
			long totalGapok = 0 ,  totalLembur = 0 , totalTunjangan = 0 , pengeluaranPerbulan = 0 , pengeluaranPertahun , penghasilanPertahun = 425000000 , penghasilanBersih;
			System.out.println("Selamat Datang Di Menu Perusahaan");
			System.out.println("1.Total Gaji Pokok");
			System.out.println("2.Jumlah Tunjangan");
			System.out.println("3.Total Lembur");
			System.out.println("4.Besar Pengeluaran Perbulan");
			System.out.println("5.Besar Pengeluaran Pertahun");
			System.out.println("6.Penghasilan bersih Pertahun");
			int pilih = input.nextInt();
			switch(pilih) {
			case 1 :
				for (KaryawanNewReborn kar : karyawanKu) {
					totalGapok += kar.getGapok();
				}
				System.out.println("Total Gaji Pokok yang harus dibayar Rp. "+totalGapok);
				totalGapok = 0;
				break;
			case 2 :
				
				for (KaryawanNewReborn kar : karyawanKu) {
					
					totalTunjangan += kar.getTunjanganKeluarga()+kar.getTunjanganKhusus()+kar.getTunjanganPegawai();			
				}
				System.out.println("Jumlah Tunjangan yang Harus Dibayar Rp "+totalTunjangan);
				totalTunjangan = 0;
				break;
			case 3 :
				for (KaryawanNewReborn kar : karyawanKu) {
					totalLembur += kar.getLembur();
				}
				System.out.println("Total Lembur Yang harus Dibayar Rp. "+totalLembur);
				totalLembur = 0;		
				break;
			case 4 :
				for (KaryawanNewReborn kar : karyawanKu) {
					pengeluaranPerbulan += kar.getGajiBersih();
				}
				System.out.println("Total Pengeluaran Perbulan Rp. "+pengeluaranPerbulan);
				pengeluaranPerbulan = 0;
				break;
			case 5 :
				for (KaryawanNewReborn kar : karyawanKu) {
					pengeluaranPerbulan += kar.getGajiBersih();
				}
				pengeluaranPertahun = pengeluaranPerbulan * 12;
				System.out.println("Total Pengeluaran Pertahun Rp. "+pengeluaranPertahun);
				pengeluaranPerbulan = 0;
				pengeluaranPertahun = 0;
				break;
			case 6 :
				for (KaryawanNewReborn kar : karyawanKu) {
					pengeluaranPerbulan += kar.getGajiBersih();
				}
				pengeluaranPertahun = pengeluaranPerbulan * 12;
				penghasilanBersih = penghasilanPertahun - pengeluaranPertahun;	
				System.out.println("Total Penghasilan Bersih Pertahun Rp. "+penghasilanBersih);
				pengeluaranPerbulan = 0;
				pengeluaranPertahun = 0;
				break;
			}
			System.out.println("Apakah Akan Keluar ? (y/n)");
			exitMenu = input.next();
				
		}
		while(!exitMenu.equalsIgnoreCase("y"));
		
	}
}
