import java.util.Scanner;
public class SoalNo5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] number = {2,39,47,14,36,56,57,49,43,79};
		int[] arrayBaru = new int[11];
		for(int index = 0 ; index < number.length ; index++){
			System.out.print(number[index]+",");
		}
		System.out.println("Masukan Angka Yang Mau di Sisipkan ");
		String jumlah1 = input.next();
		while(!jumlah1.matches("[0-9]+")){
			System.out.println("Hanya angka!");
			System.out.println("Masukan Angka Yang Mau di Sisipkan ");
		    jumlah1 = input.next();	
		}
		int angka = Integer.parseInt(jumlah1);
		System.out.println("Posisi yang akan di sisipkan ");
		String pos = input.next();
		while(!pos.matches("[0-9]+")){
			System.out.println("Hanya Angka!");
			pos = input.next();
		}
		int pos1 = Integer.parseInt(pos);
		int posisi = pos1-1;

		while(pos1<1 && pos1 > 10 );
		{
			if(pos1<1){
				System.out.println("Maaf , angka tidak boleh kurang dari 1");
				System.out.print("Silahkan Input lagi : ");
				pos = input.next();
				pos1 = Integer.parseInt(pos);
			}
			if(pos1>10){
				System.out.println("Maaf , jumlah urutan angka tidak boleh lebih dari 10");
				System.out.print("Silahkan Input lagi : ");
				pos = input.next();
				pos1 = Integer.parseInt(pos);
			}
			
		}



		for(int index = 0 ; index <= number.length ; index++){
			if(index < posisi){
				arrayBaru[index] = number[index];
			}
			else if(index == posisi){
				arrayBaru[index] = angka;
			}
			else{
				arrayBaru[index] = number[index-1];
			}
		}
		for(int tampil = 0 ; tampil < arrayBaru.length ; tampil++){
			System.out.print(arrayBaru[tampil]+",");
		}
	}
}