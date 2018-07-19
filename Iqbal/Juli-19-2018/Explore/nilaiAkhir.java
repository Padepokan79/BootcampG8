/*
Hitung nilai akhir tingkat kelulusan mahasiswa dengan prosentase 30% UTS + 30% UAS + 40% Tugas.

Input yang di harapkan adalah Nama Mahasiswa, UTS, UAS, dan Tugas. Output yang diharapakan sesuai dengan tabel di bawah ini :

Range Nilai	Predikat	Keterangan
80 – 100	A	Lulus
60 -79	B	Lulus
40 – 59	C	Tidak Lulus
20 – 39	D	Tidak Lulus
0 – 19	E	Tidak Lulus
*/

import java.util.Scanner;

public class NilaiAkhir {
	public static void main(String[] args){
		double nilaiUts , nilaiUas , tugas , jumlah ;
		String nama;

		Scanner inputNilai = new Scanner(System.in);
		Scanner inputNama = new Scanner(System.in);

		System.out.println("Masukan Nama Mahasiswa : ");
		nama = inputNama.nextLine(); // nextLine digunakan untuk lebih dari 1 kata
		System.out.println("Masukan Nilai UTS (1-100)");
		nilaiUts = inputNilai.nextDouble();
		System.out.println("Masukan Nilai Uas (1-100)");
		nilaiUas = inputNilai.nextDouble();
		System.out.println("Masukan Nilai Tugas (1-100)");
		tugas = inputNilai.nextDouble();

		jumlah = (nilaiUts*0.3)+(nilaiUas*0.3)+(tugas*0.4);

		
		

		System.out.println("Nama\t:\t" + nama);
		if((jumlah <=100 ) && (jumlah >= 80)) {
			System.out.println("Anda Dinyatakan Lulus , Predikat A Dengan Jumlah Nilai : " + jumlah);
		}
		else if((jumlah<=79)&&(jumlah>= 60)){
			System.out.println("Anda Dinyatakan Lulus , Predikat B Dengan Jumlah Nilai : " + jumlah);
		}
			else if((jumlah<=59)&&(jumlah>=40)){
			System.out.println("Anda Dinyatakan Tidak Lulus , Predikat C Dengan Jumlah Nilai : " + jumlah);
		}
			else if((jumlah<=39)&&(jumlah>=20)){
			System.out.println("Anda Dinyatakan Tidak Lulus , Predikat D Dengan Jumlah Nilai : " + jumlah);
		}
			else if((jumlah<=19)&&(jumlah>=0)){
			System.out.println("Anda Dinyatakan Tidak Lulus , Predikat E Dengan Jumlah Nilai : " + jumlah);
		}
		else{
			System.out.println("Inputan Salah ! ");
		}

	}
}