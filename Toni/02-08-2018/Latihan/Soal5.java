import java.util.*;

public class Soal5{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int height = 10, index = 0;
		String phrase = "";

		System.out.println("Enter the Phrase");
		System.out.print("> ");
		phrase = keyboard.nextLine();
		System.out.println("Enter the Height of the Pyramids");
		System.out.print("> ");
		height = keyboard.nextInt();

		for (int level = 0; level < height; level++) {

			for (int mark = 0; mark < (height*2)-1; mark++) {
				if (mark < (height-level)-1 || mark > (height+level)-1) {
					System.out.print(" ");
				}
				if ((mark >= (height-level)-1 && mark <= (height+level)-1)) {
					if (index < phrase.length()) {
						if (((mark+1)-level)%2 == 0) {
							System.out.print(" ");
						}else{
							System.out.print(phrase.substring(index, index+1));
							index++;
						}
					}else{
						System.out.print("-");	
					}
				}
			}
			System.out.print("\n");
		}

	}
	
	
}