import java.util.*;

public class Soal6{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int size = 7, height = size/2;

		//Top
		for (int level = 0; level < height; level++) {
			if (size%2 != 0) System.out.print(" ");
			for (int mark = 0; mark < (height*2)-1; mark++) {
				if (mark < (height-level)-1 || (mark > (height-level)-1 && mark < (height+level)-1) || mark > (height+level)-1) {
					System.out.print(" ");
				}
				if (mark == (height-level)-1 || mark == (height+level)-1) {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}

		if (size%2 != 0) {
			height++;
		}
		//Bottom
		for (int level = height-1; level >= 0; level--) {

			for (int mark = 0; mark < (height*2)-1; mark++) {
				if (mark < (height-level)-1 || (mark > (height-level)-1 && mark < (height+level)-1) || mark > (height+level)-1) {
					System.out.print(" ");
				}
				if (mark == (height-level)-1 || mark == (height+level)-1) {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}


		/*
		for (int level = 0; level < height; level++) {
			for (int space = 0; space < (height-level); space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < level+1; star++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		*/
	}
	
}