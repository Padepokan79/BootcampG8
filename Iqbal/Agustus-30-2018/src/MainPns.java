import java.util.Scanner;
public class MainPns {
	public static void main(String[] args) {
		Scanner inputPanjang = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Scanner inputAngka = new Scanner (System.in);
		Pns pns1 = new Pns();
		String nama ,nip , golongan, status , statusPns , tempatKerja , beras , sewa , statusUtang , namaUtang ;
		double masaKerja ,  tingkat , jumlahUtang;
		int jumlahAnak ;
//		/Input
		System.out.println("Masukan Nama PNS :");
		nama = inputPanjang.nextLine();
		System.out.println("Masukan Nip :");	
		nip = input.next();
		System.out.println("Masukan Golongan");
		golongan = input.next();
		System.out.println("Masukan Masa Kerja");
		masaKerja = inputAngka.nextInt();
		System.out.println("Apakah Sudah Menikah ? (y/n)");
		status = input.next();
		System.out.println("Masukan Jumlah Anak");
		jumlahAnak = inputAngka.nextInt();
		System.out.println("Apakah Anda Pns (Profesi/Jabatan/Umum)");
		statusPns = input.next();
		System.out.println("Dimana Lokasi Dinasmu");
		tempatKerja = input.next();
		System.out.println("Apakah Kamu Ambil Beras(y/n)");
		beras = input.next();
		System.out.println("Apakah Kamu Sewa Rumah (y/n)");
		sewa = input.next();
		System.out.println("Apakah Kamu Punya Utang(y/n)");
		statusUtang = input.next();
		if(statusUtang.equalsIgnoreCase("y")) {
			System.out.println("Masukan Nama Utang");
			namaUtang = inputPanjang.nextLine();
			pns1.setNamaUtang(namaUtang);
			System.out.println("Jumlah Utang");
			jumlahUtang = inputAngka.nextDouble();
			pns1.setJumlahUtang(jumlahUtang);
		}
		//Set
		pns1.setNama(nama);
		pns1.setNip(nip);
		pns1.setGolongan(golongan);
		pns1.setMasaKerja(masaKerja);
		pns1.setStatusMenikah(status);
		pns1.setJumlahAnak(jumlahAnak);
		if(statusPns.equalsIgnoreCase("profesi")) {
			pns1.setPilih1("y");
			pns1.setTunjanganFungsi("y");
			pns1.setTunjanganStruktur("n");
			pns1.setTunjanganUmum("n");
			pns1.setJabatanKu(10);
		}
		else if(statusPns.equalsIgnoreCase("jabatan")) {
			pns1.setPilih2("y");
			pns1.setTunjanganFungsi("n");
			pns1.setTunjanganStruktur("y");
			pns1.setTunjanganUmum("n");
			System.out.println("Masukan Tingkat Jabatan(1-9)");
			tingkat = inputAngka.nextDouble();
			pns1.setJabatanKu(tingkat);
		}
		else if(statusPns.equalsIgnoreCase("umum")) {
			pns1.setPilih3("y");
			pns1.setTunjanganFungsi("n");
			pns1.setTunjanganStruktur("n");
			pns1.setTunjanganUmum("y");
			pns1.setJabatanKu(10);
		}
		pns1.setTunjanganPapua(tempatKerja);
		pns1.setTunjanganKecil(tempatKerja);
		pns1.setPotonganBeras(beras);
		pns1.setPotonganSewaRumah(sewa);
		pns1.setPotonganTaperum();
		//Output
		System.out.println("===============================");
		System.out.println("Selip Gaji ");
		System.out.println("Nama\t\t\t: "+pns1.getNama());
		System.out.println("Nip\t\t\t: "+pns1.getNip());
		System.out.println("Golongan\t\t: "+pns1.getGolongan());
		System.out.println("===============================");
		System.out.println("Gaji Pokok\t\t: "+pns1.getGapok());
		System.out.println("Tunjangan Pasangan\t: "+pns1.getTunjanganPasangan());
		System.out.println("Tunjangan Anak\t\t: "+pns1.getTunjanganAnak());
		System.out.println("Tunjangan Struktur\t: "+pns1.getTunjanganStruktur());
		System.out.println("Tunjangan Fungsi\t: "+pns1.getTunjanganFungsi());
		System.out.println("Tunjangan Umum\t\t: "+pns1.getTunjanganUmum());
		System.out.println("Tunjangan Papua\t\t: "+pns1.getTunjanganPapua());
		System.out.println("Tunjangan Pulau Kecil\t: "+pns1.getTunjanganPulauKecil());
		System.out.println("Tunjangan Beras\t\t: "+pns1.getTunjanganBeras());
		System.out.println("Tunjangan PPH\t\t: "+pns1.getTunjanganPPH());
		System.out.println("Jumlah Penghasilan\t: "+pns1.getSeluruhPenghasilan());
		System.out.println("===============================");
		System.out.println("Potongan Beras\t\t: "+pns1.getPotonganBeras());
		System.out.println("Potongan IWP\t\t: "+pns1.getPotonganIWP());
		System.out.println("Potongan PPH\t\t: "+pns1.getPotonganPPH());
		System.out.println("Sewa Rumah\t\t: "+pns1.getPotonganSewaRumah());
		System.out.println("Potongan Taperum\t: "+pns1.getPotonganTaperum());
		System.out.println(pns1.toString());
		System.out.println("Jumlah Potongan\t\t: "+pns1.getSeluruhPotongan());
		System.out.println("===============================");
		System.out.println("Gaji Bersih\t\t+ "+ pns1.takeHomePay());
	}
}
