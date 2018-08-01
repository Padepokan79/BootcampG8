import java.util.Scanner;

public class GantiArray {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int[] arr1 = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        int nilaiGanti, posisi;

        System.out.print( "Ada  " +arr1.length);
        System.out.println(" angka pada database.");
 
        System.out.print(" angka : ");
        for ( int indeks =0; indeks < arr1.length; indeks++) {
            System.out.print( arr1[ indeks ]+ " ");

        }
        System.out.println();

        System.out.print("ganti bilangan pada posisi:  " );
        posisi = keyboard.nextInt();
        System.out.print("masukan nilai:  " );
        nilaiGanti = keyboard.nextInt();

        posisi = posisi - 1;

        for ( int indeks = 0; indeks < arr1.length; indeks++ ) {
            if ( indeks == posisi ) {
                arr1[indeks] = nilaiGanti ;
            }
        }
        for ( int indeks =0; indeks < arr1.length; indeks++) {
            System.out.print( arr1[ indeks ]+ " ");
        }
    }
}