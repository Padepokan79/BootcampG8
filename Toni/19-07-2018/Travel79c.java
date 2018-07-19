import java.util.*;
import static java.lang.System.*;
public class Travel79c{
	public static void main(String[] args){
		int penumpang, grade = 0;
		Scanner input = new Scanner(System.in);

		out.println("Selamat Datang di Travel 79\n");
		out.print("Masukan jumlah penumpang : ");
		penumpang = input.nextInt();

		//List
		out.println("Bis 6 Kursi \tHarga : 2000000 (Executive)");
		if (penumpang >= 12) {
			out.println("Bis 12 Kursi \tHarga : 1.300.000 ");
		}if (penumpang >= 18) {
			out.println("Bis 18 Kursi \tHarga : 1500000 ");
		}if (penumpang >= 32) {
			out.println("Bis 32 Kursi \tHarga : 1.800.000 ");
		}if (penumpang >= 45) {
			out.println("Bis 45 Kursi \tHarga : 2000000 ");
		}if (penumpang >= 60) {
			out.println("Bis 60 Kursi \tHarga : 2.300.000 ");
		}

		//Recomendation
		out.println("\nRekomendasi :\n---------------------------------");
		if (penumpang <= 6) { 							// Penumpang 1-6
			out.println("1x Bis 6 Kursi \tHarga : 2.000.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 2.000.000 ");
		}
		else if(penumpang < 12){ 						// Penumpang 7-11
			out.println(" 2x Bis 6 Kursi \tHarga : 2.000.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 4.000.000 ");
		}
		else if(penumpang == 12){ 						// Penumpang 12
			out.println(" 1x Bis 12 Kursi \tHarga : 1.300.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 1.300.000 ");
		}
		else if(penumpang == 18){ 						// Penumpang 18
			out.println(" 1x Bis 18 Kursi \tHarga : 1500000 ");
			out.println("---------------------------------\n \t\t\tTotal : 1500000 ");
		}
		else if(penumpang > 18 && penumpang <= 24){ 	// Penumpang 19-24
			out.println(" 2x Bis 12 Kursi \tHarga : 1.300.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 2.600.000 ");
		}
		else if(penumpang > 24 && penumpang <= 30){ 	// Penumpang 25-30
			out.println(" 1x Bis 18 Kursi \tHarga : 1.800.000 ");
			out.println(" 1x Bis 12 Kursi \tHarga : 1.300.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 2.800.000 ");
		}
		else if(penumpang == 32){ 						// Penumpang 32
			out.println(" 1x Bis 32 Kursi \tHarga : 1.800.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 1.800.000 ");
		}
		else if(penumpang <= 36 && penumpang > 32){ 	// Penumpang 33-36
			out.println(" 2x Bis 18 Kursi \tHarga : 1.800.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 3.000.000 ");
		}
		else if(penumpang > 36 && penumpang <= 44){ 	// Penumpang 37-44
			out.println(" 1x Bis 32 Kursi \tHarga : 1.800.000 ");
			out.println(" 1x Bis 12 Kursi \tHarga : 1.300.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 3.100.000 ");
		}
		else if(penumpang == 45){ 	// Penumpang 45
			out.println(" 1x Bis 45 Kursi \tHarga : 2.000.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 2.000.000 ");
		}
		else if(penumpang > 45 && penumpang <= 50){ 	// Penumpang 46-50
			out.println(" 1x Bis 32 Kursi \tHarga : 1.800.000 ");
			out.println(" 1x Bis 18 Kursi \tHarga : 1.500.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 3.300.000 ");
		}
		else if(penumpang > 50 && penumpang <= 57){ 	// Penumpang 51-57
			out.println(" 1x Bis 45 Kursi \tHarga : 2.000.000 ");
			out.println(" 1x Bis 12 Kursi \tHarga : 1.300.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 3.300.000 ");
		}
		else if((penumpang > 57 && penumpang <= 59) || (penumpang > 60 && penumpang <= 63)){ 	// Penumpang 51-57 & 61-63
			out.println(" 1x Bis 45 Kursi \tHarga : 2.000.000 ");
			out.println(" 1x Bis 18 Kursi \tHarga : 1.500.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 3.500.000 ");
		}
		else if(penumpang == 60){ 	// Penumpang 60
			out.println(" 1x Bis 60 Kursi \tHarga : 2.300.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 2.300.000 ");
		}
		else if(penumpang > 60 && penumpang <= 63){ 	// Penumpang 60
			out.println(" 1x Bis 60 Kursi \tHarga : 2.300.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 2.300.000 ");
		}
		else if(penumpang > 60 && penumpang <= 72){ 	// Penumpang 61-72
			out.println(" 1x Bis 60 Kursi \tHarga : 2.300.000 ");
			out.println(" 1x Bis 12 Kursi \tHarga : 1.300.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 2.600.000 ");
		}
		else if(penumpang > 73 && penumpang <= 78){ 	// Penumpang 73-78
			out.println(" 1x Bis 60 Kursi \tHarga : 2.300.000 ");
			out.println(" 1x Bis 18 Kursi \tHarga : 1.500.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 3.800.000 ");
		}
		else if(penumpang > 79 && penumpang <= 92){ 	// Penumpang 79-92
			out.println(" 1x Bis 60 Kursi \tHarga : 2.300.000 ");
			out.println(" 1x Bis 32 Kursi \tHarga : 1.800.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 4.100.000 ");
		}
		else if(penumpang > 92 && penumpang <= 105){ 	// Penumpang 92-105
			out.println(" 1x Bis 60 Kursi \tHarga : 2.300.000 ");
			out.println(" 1x Bis 45 Kursi \tHarga : 2.000.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 4.300.000 ");
		}
		else if(penumpang > 105 && penumpang <= 120){ 	// Penumpang 105-120
			out.println(" 2x Bis 60 Kursi \tHarga : 2.300.000 ");
			out.println("---------------------------------\n \t\t\tTotal : 4.600.000 ");
		}


		
	}
}