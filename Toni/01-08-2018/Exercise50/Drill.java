import java.util.Scanner;

public class Drill{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String[] heroes = {"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon", 
					"Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes", 
					"Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason", 
					"Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"};
		String guess;
		boolean found;

		System.out.println("Pop Quiz!");
		System.out.println("Name any *mortal* hero from Greek mythology: ");
		guess = keyboard.next();
		found = false;
		int counter = 0;
		for(String hero : heroes){
			if (guess.equals(hero)) {
				System.out.println("That's one of them!");
				found = true;
				counter = 1;
			}
		}

		if (found == false || counter == 1) {
			System.out.println("No, "+guess+" wasn't a Greek mortal Hero.");
		}
		
	}
}