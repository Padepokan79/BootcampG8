public class PigDiceComputer{
	public static void main(String[] args) {
		int roll , total;
		total = 0 ;

		do{
			roll = 1 + (int) (Math.random()*6) ;
			System.out.println( "Computer Rolled a " + roll + "." );
			if(roll == 1){
				System.out.println("\t Thats End its Turn");
				total = 0;
			}
			else{
				total += roll ;
				System.out.println("\t Computer has " + total);
				System.out.println(" points so far this round. \n");
				if(total < 20 ){
					System.out.println("\t Computer Win Roll Again");
				}
			}
		} while (roll != 1 && total < 20 	);

		System.out.println("Computer Ends the round with " + total + ".");
	}
}