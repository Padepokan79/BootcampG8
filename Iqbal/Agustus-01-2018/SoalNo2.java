import java.util.Scanner;

public class SoalNo2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr1 = {25 , 14 , 56 , 15 ,36 , 56 , 77 , 18 ,29 ,49};
		int[] arr2 = new int[10];
		int pencarian;
		

		for(int isi = 0 ; isi < arr1.length ; isi++){
			System.out.println(arr1[isi]);
		}

		System.out.println("Silahkan Masukan Angka yang anda cari");
		pencarian = input.nextInt();

		for(int isi = 0 ; isi < arr1.length ; isi ++){
			int temp = arr1[isi];
			if(pencarian == temp){
				System.out.println("Angka yang anda cari ada");
			}		
		}
	
		}	
	}
		
