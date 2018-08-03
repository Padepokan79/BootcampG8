import java.util.*;

public class CobaTebak{
	public static void main(String[] args){
		Random acak = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kami akan Merandom angka 1-10 dalam 10 ronde");	
		int nilaiUser = 0;
		for (int ronde = 1 ; ronde <= 10 ; ronde ++){
				
			System.out.println("Ronde :" + ronde);
			for(int kesempatan = 3; kesempatan >0 ; kesempatan -- ){
					int nilai = acak.nextInt(5)+1 , jawab ;
					//System.out.println(nilai);
					System.out.println("Jawaban Anda :");	
					jawab = input.nextInt();	
				if(jawab == nilai){
					System.out.println("Selamat Jawaban Anda Benar + 1 point!");
					kesempatan = 0;
					nilaiUser ++;					
				}
								
				else{
					System.out.println("Jawaban anda salah anda memiliki " + (kesempatan-1) + "x kesempatan lagi");
				}	

		}

		}

		if(nilaiUser > 5 ){
			System.out.println("Selamat Anda Berhak membawa pulang 10 juta monopoli dengan berhasil menebak "+ nilaiUser + " Jawaban");
		}
		else if(nilaiUser < 5 ){
			System.out.println("Anda kalah karena jawaban yang anda tebak berjumlah "+ nilaiUser + " Jawaban");
		}
		else {
			System.out.println("Seri") ;
		}
			
		

			

	}
}