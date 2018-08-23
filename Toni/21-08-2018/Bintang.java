import java.util.*;
public class Bintang{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int bintang, bpr = 70, counter = 1, bintangKe = 1;
		System.out.print("Masukan Jumlah bintang ");
		bintang = input.nextInt();

		while(counter <= bintang){
			bintangKe = 1;
			while(bintangKe <= bpr && counter <= bintang){
				System.out.print(" *");
				counter++;
				bintangKe++;
			}
			System.out.print("\n");
		}
	}
}