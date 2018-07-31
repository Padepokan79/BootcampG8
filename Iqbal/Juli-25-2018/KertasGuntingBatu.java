import java.util.*;

public class KertasGuntingBatu {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("===============================================");
		System.out.println("          KERTAS GUNTING BATU BATLE            ");
		System.out.println("===============================================");
		int hpPlayer = 100 , hpKomputer = 100 , jumlahSerangan;
		for(int round = 1 ; round >= 1 ; round++){
			System.out.println("===============================================");
			System.out.println("RONDE : "+ round);
			System.out.println("===============================================");
			String pilihanKomputer = "" ;
		    int pilih = rand.nextInt(3)+1;
		    if(pilih == 1 ){
		    	pilihanKomputer = "K";	
		    }
		    else if(pilih == 2){
		    	pilihanKomputer = "G";
		    }
		    else {
		    	pilihanKomputer = "B";
		    }
		    int attackKom = rand.nextInt(9)+2 ;
		    int deffKom = (10 - attackKom)	;

		    System.out.println("Masukan Pilihan Serangan Kamu (K / G / B) ");
		    String pilihanPlayer = input.next();
		    System.out.println("Masukan Berapa Jumlah Serangan kamu (2-10)");
		    int attackPlay = input.nextInt();
		    int deffPlay = (10 - attackPlay);
		    System.out.println("Pilihan KOmputer : " + pilihanKomputer);
		    System.out.println("Pilihan Kamu : " + pilihanPlayer);

		    //Jika Player Menang
		    if(pilihanPlayer.equals("K") && pilihanKomputer.equals("B") || pilihanPlayer.equals("G") && pilihanKomputer.equals("K") || pilihanPlayer.equals("B") && pilihanKomputer.equals("G")){
		    	if(attackPlay > deffKom){
		    		if(attackPlay >= 7){
		    			attackPlay += 2 ;
		    			deffKom = deffKom * 50 / 100 ;
		    			jumlahSerangan = attackPlay - deffKom ;
		    			hpKomputer -= jumlahSerangan ;
		    			System.out.println(" Kamu menang dengan menyerang      :" + attackPlay);
		    			System.out.println(" KOmputer Menggunakan deff sebesar :" + deffKom);
		    			System.out.println(" Sisa Hp Kamu     : " + hpPlayer);
		    			System.out.println(" Sisa Hp KOmputer : " + hpKomputer);
		    		}
		    		else {
		    			deffKom = deffKom * 50 /100 ;
		    			jumlahSerangan = attackPlay - deffKom ;
		    			hpKomputer -= jumlahSerangan ;
		    			System.out.println(" Kamu menang dengan menyerang      :" + attackPlay);
		    			System.out.println(" KOmputer Menggunakan deff sebesar :" + deffKom);
		    			System.out.println(" Sisa Hp Kamu     : " + hpPlayer);
		    			System.out.println(" Sisa Hp KOmputer : " + hpKomputer);
		    		}
		    	
		    	}

		    	else {
		    		if((attackPlay += 2) > deffKom){
		    			deffKom = deffKom * 50 /100 ;
		    			jumlahSerangan = attackPlay - deffKom ;
		    			hpKomputer -= jumlahSerangan ;
		    			System.out.println(" Kamu menang dengan menyerang      :" + attackPlay);
		    			System.out.println(" KOmputer Menggunakan deff sebesar :" + deffKom);
		    			System.out.println(" Sisa Hp Kamu     : " + hpPlayer);
		    			System.out.println(" Sisa Hp KOmputer : " + hpKomputer);
		    		}
		    		else {

		    			hpKomputer += 2 ;
		    	 		System.out.println("Kamu Menang Tapi ,Komputer Berhasil Menangkis serangan HP +2");
		    			System.out.println(" Sisa Hp Kamu     : " + hpPlayer);
		    			System.out.println(" Sisa Hp KOmputer : " + hpKomputer);	
		    	 	}
		    	}	
		    }

		    // JIka KOmputer Menang
		    else if(pilihanKomputer.equals("K") && pilihanPlayer.equals("B") || pilihanKomputer.equals("G") && pilihanPlayer.equals("K") || pilihanKomputer.equals("B") && pilihanPlayer.equals("G")){
		    	if(attackKom > deffPlay){
		    		if(attackKom >= 7){
		    			attackKom += 2 ;
		    			deffPlay = deffPlay * 50 / 100 ;
		    			jumlahSerangan = attackKom - deffPlay ;
		    			hpPlayer -= jumlahSerangan ;
		    			System.out.println(" Komputer menang dengan menyerang      :" + attackKom);
		    			System.out.println(" Kamu Menggunakan deff sebesar :" + deffPlay);
		    			System.out.println(" Sisa Hp Kamu     : " + hpPlayer);
		    			System.out.println(" Sisa Hp KOmputer : " + hpKomputer);
		    		}
		    		else {
		    			deffPlay = deffPlay * 50 / 100 ;
		    			jumlahSerangan = attackKom - deffPlay ;
		    			hpPlayer -= jumlahSerangan ;
		    			System.out.println(" Komputer menang dengan menyerang      :" + attackKom);
		    			System.out.println(" Kamu Menggunakan deff sebesar :" + deffPlay);
		    			System.out.println(" Sisa Hp Kamu     : " + hpPlayer);
		    			System.out.println(" Sisa Hp KOmputer : " + hpKomputer);	
		    		}
		    		
		    	}

		    	else {
		    		if((attackKom += 2 )> deffPlay){
		    			deffPlay = deffPlay * 50 /100 ;
		    			jumlahSerangan = attackKom - deffPlay ;
		    			hpPlayer -= jumlahSerangan ;
		    			System.out.println(" Komputer menang dengan menyerang      :" + attackKom);
		    			System.out.println(" Kamu Menggunakan deff sebesar :" + deffPlay);
		    			System.out.println(" Sisa Hp Kamu     : " + hpPlayer);
		    			System.out.println(" Sisa Hp KOmputer : " + hpKomputer);
		    		}
		    		else {
		    			hpPlayer += 2 ;
		    			hpKomputer += 2 ;
		    	 		System.out.println(" Komputer Menang tapi ,Kamu Berhasil Menangkis serangan HP +2");
		    			System.out.println(" Sisa Hp Kamu     : " + hpPlayer);
		    			System.out.println(" Sisa Hp KOmputer : " + hpKomputer);	
		    		}
		    	}
		   	
		    }
		    else {
		    	System.out.println("RONDE DRAW");
		    }
		    jumlahSerangan = 0;	


		}
	}
}