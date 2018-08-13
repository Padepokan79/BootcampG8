import java.util.*;

public class Soal9{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int height = 0;		

		System.out.print("Masukan tinggi ");
		height = keyboard.nextInt();

		for (int level = 0; level < height; level++) {
			for (int star = 0; star < height; star++) {
				if (star < height-(level+1)) {
					System.out.print(" ");
				}else{
					System.out.print("#");
				}
			}
			System.out.print("\n");
		}
		
	}
	
}