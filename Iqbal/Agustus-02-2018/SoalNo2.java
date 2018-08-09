import java.util.Scanner;

public class SoalNo2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nilaiAwal , nilaiAkhir ;
		System.out.println("Masukan Angka Pertama untuk ditampilkan ganjil");
		nilaiAwal = input.nextInt();
		System.out.println("Masukan Nilai Akhir");
		nilaiAkhir = input.nextInt();

		if(nilaiAwal%2 != 0){
			nilaiAwal+= 1;
		}
		System.out.println("Hasil");
		for(; nilaiAwal <= nilaiAkhir ; nilaiAwal += 2 ){
			System.out.println(nilaiAwal);
		}

	}
}