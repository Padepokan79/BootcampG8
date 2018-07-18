import java.util.*;
public class Tebak{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);

		System.out.println("Apakah Air itu Basah ?");
		System.out.print("(Y/N) ?  ");
		String Jawaban = key.next();
		if (Jawaban.equals("N")) {
			System.out.println("Bingo !");
		}else{
			System.out.println("Boo !");
		}
	}
}