import static java.lang.System.*; //agar tidak usah pakay System saat
import java.util.Scanner;

public class CollegeAdmission{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int math;
		out.println("Welcome to the art UT Austin College Admission Interface!");
		out.println("Please enter your math score (200 - 800)");
		math = keyboard.nextInt();

		out.println("Admittance Status :");
		if (math >= 790 ){
			out.println("certain");			
		}
		else if (math >= 710 ){
			out.println("Safe");
		}
		else if(math >= 580){
			out.println("PROBABLE");
		}
		else if (math >= 500){
			out.println("UNCERTAIN");
		}
		else if(math >= 390){
			out.println("UNLIKELY");
		}
		else // beloow 390		
			out.println("DENIDE");
			out.println();
	}
}