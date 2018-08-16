import java.util.Scanner;
public class SoalNo4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] deretAngka = {25 , 14 , 56 , 15 , 36 , 56 , 77 , 18 , 29 ,49};
		for(int index = 0 ; index < deretAngka.length ; index++){
			System.out.print(deretAngka[index]+",");
		}

		{
		System.out.println("Silahkan Masukan Berapa kali shift :");
		String jumlah1 = input.next();
		while(!jumlah1.matches("[0-9]+")){
			System.out.println("Hanya Angka!");
			jumlah1 = input.next();
		}
		int jumlah = Integer.parseInt(jumlah1);
		while(jumlah<1 && jumlah > 10 );
		{
			if(jumlah<1){
				System.out.println("Maaf , jumlah urutan angka tidak boleh kurang dari 1");
				System.out.print("Silahkan Input lagi : ");
				jumlah1 = input.next();
				jumlah = Integer.parseInt(jumlah1);
			}
			if(jumlah>10){
				System.out.println("Maaf , jumlah urutan angka tidak boleh lebih dari 10");
				System.out.print("Silahkan Input lagi : ");
				jumlah1 = input.next();
				jumlah = Integer.parseInt(jumlah1);
			}
			
		}
		
	
		int[] arrayBantu = new int[jumlah];
		int[] arrayHasil = new int[10];


		for(int index = 0 ; index < jumlah ; index++){
			arrayBantu[index] = deretAngka[index];
		}
		int indexKu = jumlah;
		int indexBaru = 0;
		for(int index = 0 ; index < arrayHasil.length ; index++){ 
			
			if(index < (arrayHasil.length-jumlah)){
				arrayHasil[index] = deretAngka[indexKu];
				indexKu++;
			}
			else{
				arrayHasil[index] = arrayBantu[indexBaru];
				indexBaru++;
			}
		}
		for(int index = 0 ; index < arrayHasil.length ; index++){
			System.out.print(arrayHasil[index] + ",");
		}

	}
}}