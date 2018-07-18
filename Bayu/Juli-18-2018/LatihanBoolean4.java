import java.util.Scanner;

public class LatihanBoolean4 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		double income, cute;
		boolean allowed;

		System.out.print( "Masukan usia anda : " );
		age = keyboard.nextInt();

		System.out.print( "Masukan penghasilan anda : " );
		income = keyboard.nextDouble();

		System.out.print( "Seberapa ganteng anda dari skala 0.0 sampai 10.0 ? " );
		cute = keyboard.nextDouble();

		allowed = ( age >= 17 && age < 22 || ( income > 5000000 || cute >= 8.0 ) );

		System.out.println( "Apakah anda cocok dengan anak saya yang berusia 17 tahun ? " + allowed );
	}
}