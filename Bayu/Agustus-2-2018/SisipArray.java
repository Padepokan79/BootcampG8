import java.util.Scanner;

public class SisipArray {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int[] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int sisip, posisi;

		System.out.print( "Ada  " +arr1.length);
        System.out.println(" angka pada database.");
 
        System.out.print(" angka : ");
        for ( int indeks =0; indeks < arr1.length; indeks++) {
            System.out.print( arr1[ indeks ]+ " ");
        }

       	System.out.println(" " );
       	System.out.print("masukan bilangan pada indeks:  " );
        posisi = keyboard.nextInt();
        System.out.print("masukan nilai:  " );
        sisip = keyboard.nextInt();

        int geser = posisi - 1;

        for ( int indeks = 0; indeks < arr1.length; indeks++ ) {
            if (  indeks == geser ) {
                System.out.print( arr1[ indeks ]+ " ");
                arr1[indeks] = sisip;
                System.out.print( arr1[ indeks ]+ " ");
            }
            else if ( indeks < geser ) {
                System.out.print( arr1[ indeks ]+ " ");                
            }
            else if ( indeks > geser) {
                System.out.print( arr1[ indeks ]+ " ");
            }
        }
	}
}