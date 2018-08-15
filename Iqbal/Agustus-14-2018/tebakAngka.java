import java.util.*;
public class tebakAngka{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random acak = new Random();
		int nyawaUser = 1 , nyawaKomputer = 1 ;
		for(int round = 1 ; round <= 20 ; round++){			
			System.out.println("nyawa Sementara");
			System.out.println("User : "+nyawaUser+ " , Nyawa Komputer : "+nyawaKomputer);
			System.out.println("Round : "+round);
			String status = " ";
			int angkaKomputer = acak.nextInt(10)+1;
			
			for(int kesempatan = 1 ; kesempatan <= 2 ; kesempatan++){				
				System.out.println("Silahkan Kalian Tebak angka dari 1-10");
				System.out.println("kesempatan ke-"+kesempatan);
				int angkaUser = input.nextInt();
				if(kesempatan == 1){
					if(angkaUser == angkaKomputer){
						nyawaUser += 2 ;
						nyawaKomputer --;
						kesempatan = 3;
						if(round >11){
							System.out.println("Noob");
						}
						else if(round > 8){
							System.out.println("Nice");	
						}
						else {
							System.out.println("Cheater");
						}

					}
				}
				else{
					if(angkaUser == angkaKomputer){
						nyawaUser += 2 ;
						nyawaKomputer --;
						kesempatan = 3;
						if(round >11){
							System.out.println("Noob");
						}
						else if(round > 8){
							System.out.println("Nice");	
						}
						else {
							System.out.println("Cheater");
						}
					}
					else{
						nyawaKomputer += 2;
						nyawaUser--;
					}
				}
			}
			if(nyawaUser >= 16 || (nyawaUser - nyawaKomputer) >= 6){
				status = "User Win";
			}
			if(nyawaKomputer >= 16 || (nyawaKomputer - nyawaUser) >= 6 ){
				status = "Komputer Win";
			}
			if(nyawaUser >= 16 || nyawaKomputer >= 16){
				System.out.println("Done "+status);
				round = 21;
			}
			if((nyawaUser - nyawaKomputer) >= 6 || (nyawaKomputer - nyawaUser) >= 6){
				System.out.println("Done "+status);
				System.out.println("nyawa");
				System.out.println("User : "+nyawaUser+ " , Nyawa Komputer : "+nyawaKomputer);
				round = 21;
			}

		}

	}
}