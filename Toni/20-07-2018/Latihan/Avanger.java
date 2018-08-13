import static java.lang.System.*;
import java.util.Scanner;

public class Avanger{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		double[] ironMan = {15000, 0, 0},
			thor = {32000, 0, 0},
			hulk = {13500, 0, 0},
			captainAmerica = {20500, 0, 0},
			spiderman = {5000, 0, 0};
		int maxRAB = 50000, totalRAB;

		out.println("Daftar RAB Avanger : \n------------------------");
		
		out.print("Iron Man\t: ");
		ironMan[1] = input.nextDouble();
		if ( ironMan[1] < 3 ) ironMan[2] = 0 - (ironMan[0] + 1000);
		else if ( ironMan[1] <= 5 ) ironMan[2] = ((30 * ironMan[0])/100) - ironMan[0];
		else if ( ironMan[1] <= 7 ) ironMan[2] = ((50 * ironMan[0])/100) - ironMan[0];
		else if ( ironMan[1] <= 9 ) ironMan[2] = ((75 * ironMan[0])/100) - ironMan[0];

		out.print("Thor\t\t: ");
		thor[1] = input.nextDouble();
		if ( thor[1] < 3 ) thor[2] = 0 - (thor[0] + 1000);
		else if ( thor[1] <= 5 ) thor[2] = ((30 * thor[0])/100 - thor[0]);
		else if ( thor[1] <= 7 ) thor[2] = ((50 * thor[0])/100 - thor[0]);
		else if ( thor[1] <= 9 ) thor[2] = ((75 * thor[0])/100 - thor[0]);

		out.print("Hulk\t\t: ");
		hulk[1] = input.nextDouble();
		if ( hulk[1] < 3 ) hulk[2] = 0 - (hulk[0] + 1000);
		else if ( hulk[1] <= 5 ) hulk[2] = ((30 * hulk[0])/100 - hulk[0]);
		else if ( hulk[1] <= 7 ) hulk[2] = ((50 * hulk[0])/100 - hulk[0]);
		else if ( hulk[1] <= 9 ) hulk[2] = ((75 * hulk[0])/100 - hulk[0]);

		out.print("Captain America\t: ");
		captainAmerica[1] = input.nextDouble();
		if ( captainAmerica[1] < 3 ) captainAmerica[2] = 0 - (captainAmerica[0] + 1000);
		else if ( captainAmerica[1] <= 5 ) captainAmerica[2] = ((30 * captainAmerica[0])/100) - captainAmerica[0];
		else if ( captainAmerica[1] <= 7 ) captainAmerica[2] = ((50 * captainAmerica[0])/100) - captainAmerica[0];
		else if ( captainAmerica[1] <= 9 ) captainAmerica[2] = ((75 * captainAmerica[0])/100) - captainAmerica[0];

		out.print("Spiderman\t: ");
		spiderman[1] = input.nextDouble();
		if ( spiderman[1] < 3 ) spiderman[2] = 0 - (spiderman[0] + 1000);
		else if ( spiderman[1] <= 5 ) spiderman[2] = ((30 * spiderman[0])/100) - spiderman[0];
		else if ( spiderman[1] <= 7 ) spiderman[2] = ((50 * spiderman[0])/100) - spiderman[0];
		else if ( spiderman[1] <= 9 ) spiderman[2] = ((75 * spiderman[0])/100) - spiderman[0];

		totalRAB = (int)(ironMan[2] + thor[2] + hulk[2] + captainAmerica[2] + spiderman[2]);

		out.println("------------------------");
		out.println(ironMan[2]+" | "+thor[2] +" | "+ hulk[2] +" | "+ captainAmerica[2] +" | "+ spiderman[2]);
		out.println("Total RAB yang digunakan = "+(0-totalRAB));
		if (maxRAB + totalRAB < 0 ) {
			out.println("RAB tidak cukup!!");
		}
		out.println("\nSisa RAB = "+(maxRAB + totalRAB));

		



	}
}
