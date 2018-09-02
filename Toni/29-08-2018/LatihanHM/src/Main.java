import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Uang money = new Uang();
		
		
		/*String ch;
		do {
			System.out.print("Enter Money \n > ");
			ch = input.nextLine();
			System.out.println(" >> "+money.change.get(ch));
		}while(true);*/
		
		for(Entry<String, Double> tukeran : money.change.entrySet()) {
			System.out.println(tukeran.getKey()+" -- "+tukeran.getValue());
		}
		
	}
}
