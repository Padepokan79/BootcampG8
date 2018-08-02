import java.util.Scanner;

public class SoalNo4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan Batas Angka Prima");
		int batas = input.nextInt();
		
		for(int nilaiAwal = 2 ; nilaiAwal < batas ; nilaiAwal++ ){
			if(nilaiAwal == 2 || nilaiAwal == 3 || nilaiAwal == 5 || nilaiAwal == 7 || nilaiAwal == 11 || nilaiAwal == 13 || nilaiAwal == 17){
				System.out.println(nilaiAwal);
			}
			if(nilaiAwal % 2 != 0 && nilaiAwal % 3 != 0 && nilaiAwal % 5 != 0 && nilaiAwal % 7 !=0 && nilaiAwal % 11 != 0 && nilaiAwal % 13 != 0 && nilaiAwal % 17 !=0 ){
				System.out.println(nilaiAwal);
			}
		}

	}
}