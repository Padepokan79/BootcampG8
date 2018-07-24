import static java.lang.System.*;
import java.util.Scanner;

public class Skill {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pemrograman, algoritma, logic, publicSpeaking, average, project, pengalamanKerja ;
		String nama;

		out.println( "                 SKILL" );
		System.out.println( "===========================================" );
		System.out.print("Masukan Nama : " );
		nama = keyboard.next();
		System.out.println( "===========================================" );
		System.out.println("SKill Range 0-10" );
		System.out.print("Masukan Skill Pemrograman : " );
		pemrograman = keyboard.nextInt();
		System.out.print( "Masukan Skill Algoritma : " );
		algoritma = keyboard.nextInt();
		System.out.print("Masukan Skil Basic Logic : " );
		logic = keyboard.nextInt();
		System.out.print("Masukan Skil Public Speaking : " );
		publicSpeaking = keyboard.nextInt();

		System.out.println( "===========================================" );
		System.out.println();
		System.out.print("Masukan Jumlah Project : " );
		project = keyboard.nextInt();
		System.out.print("Masukan Pengalaman Kerja : " );
		pengalamanKerja = keyboard.nextInt();
		System.out.println( "===========================================" );

		average = ( (pemrograman + algoritma + logic + publicSpeaking) / 4 );

		System.out.println();
		System.out.println( " Rata-rata skill adalah " + average);
		System.out.println();

		if ( average <= 3 || project <= 5 )
			System.out.print( "BEGINNER" );
		else if ( average > 3 && average <= 6 || project > 5 && project <= 12 || pengalamanKerja >= 3 && pengalamanKerja <= 5 )
			System.out.print( "MIDDLE" );
		else if ( average >6 && average <= 10 || project > 12 || pengalamanKerja > 5 )
			System.out.print( "EXPERT" );


	}
}