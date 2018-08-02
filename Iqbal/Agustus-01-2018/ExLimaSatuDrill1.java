public class ExLimaSatuDrill1{
	public static void main(String[] args) {
		int[] arr = new int[1000];
		//Kita akan selalu gunakan perulangan untuk memanggil setiap slot pada array
		for(int i=0 ; i<arr.length ; i++){
			arr[i] = 1 + (int)(Math.random()*100);

		}

		//Menampilkan Seluruh array biaasanya seperti ini

		System.out.print("Values : ");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + "");
		}
		System.out.println();

		///////////////////////////////////////////////////////////
		// Mari Kita Selesaikan Ini dengan Bertahap
		// Simpat nomber pada array dalam satu waktu
		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 8;

		//Dan tampilkan Value tersebut

		System.out.println("Values : " + arr[0] + " " + arr[1] + " " + arr[2]);

		//Ambil satu angka random 1-100 untuk setiap slot array

		arr[0] = (int)(Math.random()*100);
		arr[1] = (int)(Math.random()*100);
		arr[2] = (int)(Math.random()*100);

		//Tampilkan Lagi 

		System.out.println("Values : " + arr[0] + " " + arr[1] + " " + arr[2]);
 
		// memang ini sedikit aneh , tapi coba untuk mengerti

		int m = 0;
		arr[m] = (int)(Math.random()*100);
		m = 1 ;
		arr[m] = (int)(Math.random()*100);
		m = 2 ;
		arr[m] = (int)(Math.random()*100);

		// Tampilkan lagi
		 System.out.print("Values: ");
		 m = 0;
		 System.out.print(arr[m] + " ");
		 m = 1;
		 System.out.print(arr[m] + " ");
		 m = 2;
		 System.out.print(arr[m] + " ");

		 System.out.println();

		  //////////////////////////////////////
		 // Sekarang gunakan looping
		 for ( int q=0 ; q < arr.length ; q++ ) {
		 arr[q] = 1 + (int)(Math.random()*100);
		 }

 		
		System.out.print("Values: ");
		 for ( int q=0 ; q < arr.length ; q++ ) {
 		System.out.print(arr[q] + " ");
 		}
 		System.out.println();
 
	}
}