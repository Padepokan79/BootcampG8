import java.util.*;

public class Soal8{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int[] fibonaci = new int[20], bilPrima = {2, 3, 5, 13, 89, 233}, bilHabisBagi = new int[20];
		getFibonaci(1000, fibonaci);
		int duplicate = 0, numbering = 0, unduplicate = 0;

		for (int indexFib = 0; indexFib < fibonaci.length; indexFib++) {
			duplicate = 0;
			for (int indexPrim = 0; indexPrim < bilPrima.length; indexPrim++) {
				if (fibonaci[indexFib] == bilPrima[indexPrim]) {
					duplicate = 1;
				}
				unduplicate = indexFib;
			}
			if (duplicate == 0) {
				bilHabisBagi[numbering] = fibonaci[unduplicate];
				numbering++;
			}
		}
		
		// Fibonaci
		System.out.print("\nFibonaci  : ");
		for (int index = 0; index < fibonaci.length; index++) {
			if(index == 0 || fibonaci[index] != 0)
				System.out.print(fibonaci[index]+" ");
		}

		System.out.print("\nPrime     : ");
		for (int index = 0; index < bilPrima.length; index++) {
			if(index == 0 || bilPrima[index] != 0)
				System.out.print(bilPrima[index]+" ");
		}

		System.out.print("\nNot Prime : ");
		for (int index = 0; index < bilHabisBagi.length; index++) {
			if(index == 0 || bilHabisBagi[index] != 0)
				System.out.print(bilHabisBagi[index]+" ");
		}

		// Printing
		System.out.print("\n");


	}

	public static void getFibonaci(int last, int[] storage){
		int[] container = {0, 1, 1};
		int index = 2;
		storage[0] = container[0];
		storage[1] = container[1];

		do{
			storage[index] = container[2];
			container[0] = container[1];
			container[1] = container[2];
			container[2] = container[0] + container[1];
			index++;
		}while(container[2] < last);
	}


}