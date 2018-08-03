import java.util.Scanner;

public class PigDice{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int roll , ptot , ctot ,turnTotal;
		String choice = "" ;

		ptot = 0;
		ctot = 0;

		do{
			turnTotal = 0 ;
			System.out.println("You Have : " + ptot + " Points");
			do{
				roll = 1 + (int)(Math.random()*6);
				System.out.println("\tYou rolled a "+roll+ ".");
				if(roll == 1){
					System.out.println("\t Thats End your turn. ");
					turnTotal = 0 ;
				}
				else{
					turnTotal += roll ;
					System.out.println("\t You Have " + turnTotal + " Points");
					System.out.println("So far this round with " + ptot + " Points " );
					System.out.println("\tWould You Like to \"roll\" again");
					System.out.println("or \"Hold\" ? ");
					choice = keyboard.next();
				}

			}while(roll != 1 && choice.equals("roll"));

			ptot += turnTotal;
			System.out.println("\t You End The Round with "+ptot+ "Points");

			if(ptot < 100 ){
				turnTotal = 0 ;
				System.out.println("Computer Has " +ctot+ "Points" );

				do{	
					roll = 1 + (int)(Math.random()*6);
					System.out.println("\t Computer Rolled a "+roll+".");
					if(roll == 1){
						System.out.println("\t Thats ends its turn");
						turnTotal = 0;
					}
					else{
						turnTotal += roll ;
						System.out.println("\tComputer Has "+ turnTotal);
						System.out.println("Points So far this round \n");

						if(turnTotal < 20 ){
							System.out.println("\t Computer Will Roll Again");
						}	
					}
				}while(roll != 1 && turnTotal < 20);

				ctot += turnTotal ;
				System.out.print("\t Computer Ends the round with");
				System.out.println(ctot + "Points \n ");


			}

		}while(ptot < 100 && ctot < 100);

		if(ptot > ctot){
			System.out.println("Humanit WIns ");
		}
		else{
			System.out.println( "The computer wins." );
		}
	}
}