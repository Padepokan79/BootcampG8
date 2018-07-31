import java.util.*;
public class Fibonaci{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] secuence = {0,1}, tempsec = {0,1,1};
		int leng; 

		System.out.print("\nBerapa banyak deret yang ingin di proses: ");
		leng = input.nextInt();

		for (;leng > 0; leng--) {
			System.out.print((tempsec[0])+", ");
			tempsec[0] = tempsec[1];
			tempsec[1] = tempsec[1]+tempsec[0];
		}

	}
}