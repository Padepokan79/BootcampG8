/*
Author : Muhamad Iqbal Farhan Maulana
*/
import java.util.Scanner;
public class AptitudeTest{
	public static void main(String[] args){
		Scanner inputText = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);

		String nama;
		int logic , pattern , complex , nilai ;

		System.out.println("Masukan Nama :");
		nama = inputText.nextLine();
		System.out.println("Masukan Nilai Logic :");
		logic = inputNumber.nextInt();
		System.out.println("Masukan Nilai pattern :");
		pattern = inputNumber.nextInt();
		System.out.println("Masukan Nilai complex :");
		complex = inputNumber.nextInt(); 

		nilai = (logic+pattern+complex)/3;
		if(nilai >= 73){
			System.out.println("Selamat "+ nama + " Anda Telah lulus tes Aptitude");
		}
		else 
			System.out.println("Maaf "+ nama + " Anda Belum lulus tes Aptitude");
		if(nilai < 70){
			System.out.println("Bootcamp Selama 6 Bulan");	
		}
		else if(nilai >= 70 && nilai <= 80){
			System.out.println("Bootcamp Selama 3 Bulan");
		}		
		else if(nilai >= 81 && nilai <= 100){
			System.out.println("Bootcamp Selama 1 Bulan");
		}	
	}
}