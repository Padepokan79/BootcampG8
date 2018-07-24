/*
Author : Muhamad Iqbal farhan maulana
*/
import java.util.Scanner;

public class Avengers{
	public static void main(String[] args){
		double ironMan , thor , hulk , captainAmerika , spiderMan ;
		double ironManHasil , thorHasil , hulkHasil , captainAmerikaHasil , spiderManHasil , rab ;
		int jarvisIronMan , paluPetirThor , labHulk , kendaraanCaptainAmerika , jaringSpiderMan ;
		
		Scanner input = new Scanner(System.in);	

		jarvisIronMan = 15000; paluPetirThor = 32000 ; labHulk = 13500 ; kendaraanCaptainAmerika = 20500 ; jaringSpiderMan = 5000 ;
		rab = 50000 ; 

	// performa (<3 - 1000) | (3-5 + 30%*harga) | (5.1 - 7 + 50%*harga) | (7.1 - 9 + 75%*harga) | (9.1 - 10 100%*dana) 

		System.out.println("Masukan performa iron Man");
		ironMan = input.nextDouble();
		System.out.println("Masukan performa Thor");
		thor = input.nextDouble();
		System.out.println("Masukan performa Hulk");
		hulk = input.nextDouble();
		System.out.println("Masukan performa captain Amerika");
		captainAmerika = input.nextDouble();
		System.out.println("Masukan performa Spider Man");
		spiderMan = input.nextDouble();
		ironManHasil = 0 ;
			if(ironMan < 3){
				ironManHasil = jarvisIronMan + 1000;
			}
			else if(ironMan>= 3 && ironMan <=5){
				ironManHasil = jarvisIronMan - (0.3 * jarvisIronMan);
			}
			else if(ironMan >=5.1 && ironMan <= 7){
				ironManHasil = jarvisIronMan - (0.5 * jarvisIronMan);
			}
			else if(ironMan >= 7.1 && ironMan<= 9){
				ironManHasil = jarvisIronMan - (0.75 * jarvisIronMan);
			}
			else if(ironMan >= 9.1 && ironMan<=10){
				ironManHasil = jarvisIronMan - jarvisIronMan;
			}
			else {
				System.out.println("Salah input");
			}
		thorHasil = 0 ;
			if(thor < 3){
				thorHasil = paluPetirThor + 1000;
			}
			else if(thor>= 3 && thor <=5){
				thorHasil = paluPetirThor -(0.3 * paluPetirThor);
			}
			else if(thor >=5.1 && thor <= 7){
				thorHasil = paluPetirThor -(0.5 * paluPetirThor);
			}
			else if(thor >= 7.1 && thor <= 9){
				thorHasil = paluPetirThor -(0.75 * paluPetirThor);
			}
			else if(ironMan >= 9.1 && thor <=10){
				thorHasil = paluPetirThor - paluPetirThor;
			}
			else {
				System.out.println("Salah input");
			}
		hulkHasil = 0;
			if(hulk < 3){
				hulkHasil = labHulk + 1000;
			}
			else if(hulk>= 3 && hulk <=5){
				hulkHasil = labHulk-(0.3 * labHulk);
			}
			else if(hulk >=5.1 && hulk <= 7){
				hulkHasil = labHulk-(0.5 * labHulk);
			}
			else if(hulk >= 7.1 && hulk <= 9){
				hulkHasil = labHulk-(0.75 * labHulk);
			}
			else if(hulk >= 9.1 && hulk <=10){
				hulkHasil = labHulk - labHulk;
			}
			else {
				System.out.println("Salah input");
			}
		captainAmerikaHasil = 0 ;
			if(captainAmerika < 3){
				captainAmerikaHasil = kendaraanCaptainAmerika + 1000;
			}
			else if(captainAmerika>= 3 && captainAmerika <=5){
				captainAmerikaHasil = kendaraanCaptainAmerika-(0.3 * kendaraanCaptainAmerika);
			}
			else if(captainAmerika >=5.1 && captainAmerika <= 7){
				captainAmerikaHasil = kendaraanCaptainAmerika-(0.5 * kendaraanCaptainAmerika);
			}
			else if(captainAmerika >= 7.1 && captainAmerika <= 9){
				captainAmerikaHasil = kendaraanCaptainAmerika-(0.75 * kendaraanCaptainAmerika);
			}
			else if(captainAmerika >= 9.1 && captainAmerika<=10){
				captainAmerikaHasil = kendaraanCaptainAmerika-kendaraanCaptainAmerika;
			}
			else {
				System.out.println("Salah input");
			}
		spiderManHasil = 0 ;
			if(spiderMan < 3){
				spiderManHasil =  jaringSpiderMan + 1000;
			}
			else if(spiderMan>= 3 && spiderMan <=5){
				spiderManHasil = jaringSpiderMan-(0.3 * jaringSpiderMan);
			}
			else if(spiderMan >=5.1 && spiderMan <= 7){
				spiderManHasil = jaringSpiderMan-(0.5 * jaringSpiderMan);
			}
			else if(spiderMan >= 7.1 && spiderMan <= 9){
				spiderManHasil = jaringSpiderMan-(0.75 * jaringSpiderMan);
			}
			else if(spiderMan >= 9.1 && spiderMan<=10){
				spiderManHasil = jaringSpiderMan-jaringSpiderMan;
			}
			else {
				System.out.println("Salah input");
			}

		//System.out.println(ironManHasil + " "+ thorHasil + " "+ hulkHasil + " "+ captainAmerikaHasil + " "+ spiderManHasil);	
		double hasil = ironManHasil +  thorHasil +  hulkHasil + captainAmerikaHasil + spiderManHasil;
		if(hasil < rab){
			System.out.println("Jumlah yang digunakan adalah :"+ hasil);
			rab = rab - hasil;
			System.out.println("Sisa rab =" + rab);
		}
		else{
			System.out.println("RAB KEKURANGAN DANA SEBESAR" + (rab-hasil));
		}

	}
}