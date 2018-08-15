import java.util.Scanner;
public class SoalTestNo1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Jumlah urutan angka Fibonacci yang akan di tampilkan : ");
		String jumlahAngka = input.next();
		while(!jumlahAngka.matches("[0-9]+")){
			System.out.println("Maaf , input yang diterima berupa angka");
			System.out.print("Silahkan Input lagi : ");
			jumlahAngka = input.next();
		}

		int jumlah = Integer.parseInt(jumlahAngka);
		
		while(!jumlahAngka.matches("[0-9]+") && jumlah<5 && jumlah > 100 );
		{
			if(jumlah<5){
				System.out.println("Maaf , jumlah urutan angka tidak boleh kurang dari 5");
				System.out.print("Silahkan Input lagi : ");
				jumlahAngka = input.next();
				jumlah = Integer.parseInt(jumlahAngka);
			}
			if(jumlah>100){
				System.out.println("Maaf , jumlah urutan angka tidak boleh lebih dari 100");
				System.out.print("Silahkan Input lagi : ");
				jumlahAngka = input.next();
				jumlah = Integer.parseInt(jumlahAngka);
			}
			
		}

		int[] fibonacci = new int[jumlah];
		int nil1 = 1,nil2 = 1 , temp = 0 , fib = 0;
		fibonacci[0] = nil1 ;
		fibonacci[1] = nil2 ;
		for(int index = 2 ; index<jumlah ; index++){
			fib = nil1+nil2;
			nil1 = nil2 ;
			nil2 =fib ;
			fibonacci[index] = fib ; 
		}	

		for(int tampil = 0 ; tampil < fibonacci.length ; tampil++){
			System.out.print(fibonacci[tampil]+ ",");
		}
	}
}