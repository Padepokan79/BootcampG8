import java.util.*;
public class TheNextLevelKertasGuntingBatu{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random acak = new Random();
		String[] alat = {"rock" , "paper" , "scissor" , "spock" , "lizard"};
		int round , game , skorGameUser = 0, skorAllRound = 0 , skorRoundUser = 0, skorGameKomputer = 0 , skorRoundKomputer = 0 , jumlahGame = 3 , jumlahRound = 5;
		for(game = 1 ; game <= jumlahGame ; game++){
			System.out.println("Game Ke-"+game);
			for(round = 1 ; round<= jumlahRound ; round++){
				String statusRound = " ";
			    do{
			    System.out.println("Round Ke-"+round);
			    String jawabanKomputer = alat[acak.nextInt(5)];
			    System.out.println("Pilih Tipe Serangan Kamu (Rock/Paper/Scissor/Spoke/Lizard) ");
			    String jawabanUser = input.next().toLowerCase();

			    if(jawabanUser.equals("rock") && (jawabanKomputer.equals("lizard") || jawabanKomputer.equals("scissor")) || jawabanUser.equals("paper") && (jawabanKomputer.equals("rock") || jawabanKomputer.equals("spock")) || jawabanUser.equals("scissor") && (jawabanKomputer.equals("paper") || jawabanKomputer.equals("lizard")) || jawabanUser.equals("spock") && (jawabanKomputer.equals("rock") || jawabanKomputer.equals("scissor")) || jawabanUser.equals("lizard") && (jawabanKomputer.equals("spock") || jawabanKomputer.equals("paper") )){
			    	statusRound = "User Win";
			    	skorGameUser++;
			    	skorRoundUser++;
			    	skorAllRound++;
			    }
			    else if(jawabanKomputer.equals("rock") && (jawabanUser.equals("lizard") || jawabanUser.equals("scissor")) || jawabanKomputer.equals("paper") && (jawabanUser.equals("rock") || jawabanUser.equals("spock")) || jawabanKomputer.equals("scissor") && (jawabanUser.equals("paper") || jawabanUser.equals("lizard")) || jawabanKomputer.equals("spock") && (jawabanUser.equals("rock") || jawabanUser.equals("scissor")) || jawabanKomputer.equals("lizard") && (jawabanUser.equals("spock") || jawabanUser.equals("paper")) ){
			    	statusRound = "Komputer Win";
			    	skorGameKomputer++;
			    	skorRoundKomputer++;
			    }
			    else{
			    	statusRound = "Draw";
			    }
			    System.out.println("Jawaban Kamu : "+jawabanUser+" ,Jawaban Komputer : "+jawabanKomputer+ ", " + statusRound);
			    }
			    while(statusRound.equals("Draw"));
			}
			if(skorRoundUser>skorRoundKomputer){
				System.out.println("Kamu Menang Game Ke-"+ game);
				skorGameUser++;
			}
			else{
				System.out.println("Komputer Menang Game ke-"+game);
			}
			skorRoundUser=0;
			skorRoundKomputer=0;
		}
		if(skorGameUser>skorGameKomputer){
			System.out.println("Kamu Menang Permainan Ini !");
		}
		else {
			System.out.println("Komputer Menang Permainan Ini !");
		}
		switch(skorGameUser){
			case 1 :
				System.out.println("Kamu Seorang Knight !");
				break;
			case 2 :
				System.out.println("Kamu Seorang Palladins !");
				break;
			case 3 :
				System.out.println("Kamu Seorang GODSPEED !");
				break;		
		}
		if(skorAllRound >= 10){
			System.out.println("Kamu Enthusiast" );
		}
		else if(skorAllRound >= 8){
			System.out.println("Kamu Partichipants" );			
		}
		else if(skorAllRound == 0 ){
			System.out.println("Want-to-know-only" );
		}
		else{
			System.out.println("Doone");
		}

	}
}