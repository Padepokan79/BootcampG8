import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int keluar = 0;
		String  kegunaan , ukuranKu , jenisKainKu , warnaKainKu , jenisKancingKu , warnaKancingKu , jenisBenangKu , warnaBenangKu , merkKu , jenisResleting;
		String gagangKu , warnaGagangKu ,  bahanGagangKu ,  intiPenghapusKu ,  bahanIntiPenghapusKu;
		int harga , kegunaanPenghapus;
		
			System.out.println("Apa yang akan anda Review :");
			System.out.println("1.Baju");
			System.out.println("2.Celana");
			System.out.println("3.Penghapus");
			int pilih = input.nextInt();
			switch(pilih) {
			
			case 1 : 
				System.out.println("Masukan merk baju :");
				merkKu = input.next();
				System.out.println("Masukan Ukuran");
				ukuranKu = input.next();
				System.out.println("Masukan Jenis Kain");
				jenisKainKu = input.next();
				System.out.println("Masukan Warna Kain");
				warnaKainKu = input.next();
				System.out.println("Masukan Jenis Kancing");
				jenisKancingKu = input.next();
				System.out.println("Masukan Warna Kancing");
				warnaKancingKu = input.next();
				System.out.println("Masukan Jenis Benang");
				jenisBenangKu = input.next();
				System.out.println("Masukan Warna Benang");
				warnaBenangKu = input.next();
				System.out.println("Masukan Harga :");
				harga = input.nextInt();
				System.out.println("Masukan Kegunaannya");
				kegunaan = input.next();
				Baju baju = new Baju(ukuranKu , jenisKainKu , warnaKainKu , jenisKancingKu , warnaKancingKu,jenisBenangKu , warnaBenangKu ,  merkKu , harga , kegunaan);
				baju.tampilBaju();
				break;
			
			case 2 :
				System.out.println("Masukan merk Celana :");
				merkKu = input.next();
				System.out.println("Masukan Ukuran");
				ukuranKu = input.next();
				System.out.println("Masukan Jenis Kain");
				jenisKainKu = input.next();
				System.out.println("Masukan Warna Kain");
				warnaKainKu = input.next();
				System.out.println("Masukan Jenis Kancing");
				jenisKancingKu = input.next();
				System.out.println("Masukan Warna Kancing");
				warnaKancingKu = input.next();
				System.out.println("Masukan Jenis Benang");
				jenisBenangKu = input.next();
				System.out.println("Masukan Warna Benang");
				warnaBenangKu = input.next();
				System.out.println("Masukan Jenis Resleting");
				jenisResleting = input.next();
				System.out.println("Masukan Harga :");
				harga = input.nextInt();
				System.out.println("Masukan Kegunaannya");
				kegunaan = input.next();
				Celana celana = new Celana(ukuranKu , jenisKainKu , warnaKainKu , jenisKancingKu , warnaKancingKu,jenisBenangKu , warnaBenangKu ,  merkKu , harga , kegunaan , jenisResleting);
				celana.tampilCelana();
				break;
			
			case 3:
				//String gagangKu , String warnaGagangKu , String bahanGagangKu , String intiPenghapusKu , String bahanIntiPenghapusKu
				System.out.println("Masukan Permukaan gagang ");
				gagangKu = input.next();
				System.out.println("Masukan Warna gagang ");
				warnaGagangKu = input.next();
				System.out.println("Masukan Bahan gagang ");
				bahanGagangKu = input.next();
				System.out.println("Masukan Warna Inti Penghapus ");
				intiPenghapusKu = input.next();
				System.out.println("Masukan Bahan Inti Penghapus ");
				bahanIntiPenghapusKu = input.next();
				System.out.println("Pilih Kegunaan 1 - 3 ");
				kegunaanPenghapus = input.nextInt();
				int kepilih = kegunaanPenghapus-1;
				Penghapus penghapus = new Penghapus(gagangKu , warnaGagangKu , bahanGagangKu , intiPenghapusKu , bahanIntiPenghapusKu);
				penghapus.tampilPnghapus(kepilih);
				
			}
		
	}
	
}
