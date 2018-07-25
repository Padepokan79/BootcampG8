import java.util.Scanner;
public class NilaiMahasiswa {
	public static void main(String[] args){
		System.out.println(" Masukan Nilai Mahasiswa ");
		Scanner input = new Scanner(System.in);

		int nilai = input.nextInt();
		if(nilai < 50){
			System.out.println("Maaf Kamu Tidak Lulus Nilai Kamu E");
		}
		else if (nilai < 65) {
			System.out.println("Kamu LULUS Nilai Kamu D");
		}
		else if(nilai < 75){
			System.out.println("Kamu LULUS Nilai Kamu C");
		}
		else if(nilai < 85 ){
			System.out.println("Kamu LULUS Nilai Kamu B");
		}
		else if(nilai >= 85 && nilai <= 100){
			System.out.println("Kamu LULUS Nilai Kamu A");
		}
		else{
			System.out.println("Nilai Error");
		}
	}
}