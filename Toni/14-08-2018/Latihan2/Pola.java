public class Pola{
	public static void main(String[] args){
		System.out.println("\n  ------   \n  Pola 1 \n");
		pola1(5);
		System.out.println("\n  ------   \n  Pola 2 \n");
		pola2(5);
		System.out.println("\n  ------   \n  Pola 3 \n");
		pola3(5);
		System.out.println("\n  ------   \n  Pola 4 \n");
		pola4(5);
		System.out.println("\n  ------   \n  Pola 5 \n");
		pola5(6);
		System.out.println("\n  ------   \n  Pola 6 \n");
		pola6(6);
		System.out.println("\n  ------   \n  Pola 7 \n");
		pola7(4);
		System.out.println("\n  ------   \n  Pola 8 \n");
		pola8(4);
		System.out.println("\n  ------   \n  Pola 9 \n");
		pola9(7);
		System.out.println("\n  ------   \n  Pola 10 \n");
		pola10(7);
	}


	// Pola 1 : Pyramid Reverse
	public static void pola1(int height){
		for (int level = 0; level < height; level++) {
			System.out.print(" ");
			for (int step = 0; step < (height*2)-1; step++) {
				if (step >= (height-level)-1 && step <= (height+level)-1) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

	// Pola 2 : Pyramid Reverse
	public static void pola2(int height){
		for (int level = height-1; level >= 0; level--) {
			System.out.print(" ");
			for (int step = 0; step < (height*2)-1; step++) {
				if (step >= (height-level)-1 && step <= (height+level)-1) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

	// Pola 3 : Empty Pyramid
	public static void pola3(int height){
		for (int level = 0; level < height; level++) {
			System.out.print(" ");
			for (int step = 0; step < (height*2)-1; step++) {
				if (step > (height-level)-1 && step < (height+level)-1) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}

	// Pola 4 : Empty Pyramid Reverse
	public static void pola4(int height){
		for (int level = height-1; level >= 0; level--) {
			System.out.print(" ");
			for (int step = 0; step < (height*2)-1; step++) {
				if (step > (height-level)-1 && step < (height+level)-1) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}

	// Pola 5 : Division
	public static void pola5(int height){
		for (int level = 0; level < height; level++) {
			System.out.print(" ");
			for (int step = 0; step < height+1; step++) {
				if (step < level+1) {
					System.out.print("0");
				}else{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}

	// Pola 6 : Division
	public static void pola6(int height){
		for (int level = 0; level < height; level++) {
			System.out.print(" ");
			for (int step = 0; step < height+1; step++) {
				if (step < level+1) {
					System.out.print("*");
				}else{
					System.out.print("0");
				}
			}
			System.out.print("\n");
		}
	}

	// Pola 7 : Vice Versa
	public static void pola7(int height){
		String[] symbols = {"*", " "};
		for (int level = 0; level < height*2; level++) {
			System.out.print(" ");
			for (int step = 0; step < height; step++) {
				if (level < height) {
					if (step <= level%height) System.out.print(symbols[0]);
					else System.out.print(symbols[1]);
				}else{
					if (step >= height-(level%height)-1) System.out.print(symbols[0]);
					else System.out.print(symbols[1]);
				}
			}
			System.out.print("\n");
		}
	}

	// Pola 8 : Vice Versa Reverse
	public static void pola8(int height){
		String[] symbols = {"*", " "};
		for (int level = 0; level < height*2; level++) {
			System.out.print(" ");
			for (int step = 0; step < height; step++) {
				if (level < height) {
					if (step >= height-(level%height)-1) System.out.print(symbols[0]);
					else System.out.print(symbols[1]);
				}else{
					if (step <= level%height) System.out.print(symbols[0]);
					else System.out.print(symbols[1]);
				}
			}
			System.out.print("\n");
		}
	}

	// Pola 9 : Division
	public static void pola9(int height){
		for (int level = 0; level < height; level++) {
			System.out.print(" ");
			for (int step = 0; step < height+1; step++) {
				if (step == level) {
					System.out.print("*");
				}else{
					System.out.print("0");
				}
			}
			System.out.print("\n");
		}
	}

	// Pola 9 : Division
	public static void pola10(int height){
		for (int level = 0; level < height; level++) {
			System.out.print(" ");
			for (int step = 0; step < height+1; step++) {
				if (step == height-level) {
					System.out.print("*");
				}else{
					System.out.print("0");
				}
			}
			System.out.print("\n");
		}
	}

}