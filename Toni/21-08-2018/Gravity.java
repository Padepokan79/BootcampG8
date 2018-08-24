import java.util.*;
public class Gravity{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final double G = 9.80665;
		double t = 0.0, d;

		System.out.print("Enter Time ");
		t = input.nextDouble();


		for (int time = 0;time <= t*10; time++) {
			d = (0.5 * G)*((0.0 + time)/10);
			System.out.println(" "+(0.0 + time)/10+" S");
			System.out.println("Distance : "+d+"\n");
		}
	}
}