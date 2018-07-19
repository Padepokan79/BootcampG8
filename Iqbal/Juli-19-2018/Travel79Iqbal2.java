/*
Author : Muhamad Iqbal Farhan Maulana
Created
*/
// Jika 25 maka
import java.util.Scanner;

public class Travel79Iqbal2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int jumlah , class1,class2,class3,class4,class5,class6;
	    String bis1 , bis2 , bis3 , bis4 , bis5 , bis6 ;
	    class1 = 2000000; 
	    class2 = 1300000;
	    class3 = 1500000;
	    class4 = 1800000;
	    class5 = 2000000;
	    class6 = 2300000;
	    bis1="BIS Executive Dengan kursi 6 : Rp.";
	    bis2="BIS Dengan kursi 12 : RP." ;
	    bis3="BIS Dengan kursi 18 : Rp." ;
	    bis4 = "BIS Dengan kursi 32 : Rp.";
	    bis5="BIS Dengan kursi 45 : Rp.";
	    bis6 = "BIS Dengan kursi 60 : Rp.";


		System.out.println("===========================");
		System.out.println("==  Welcome to Travel79   =");
		System.out.println("===========================");
		System.out.println("Masukan JUmlah Penumpang");

		jumlah = input.nextInt();
		
		
			System.out.println(bis1+ class1);
		
		
		if(jumlah >= 12){
			
		System.out.println(bis2 + class2);
				
		}

		if(jumlah >= 18){
			System.out.println(bis3+ class3);
		}
		
		if(jumlah >= 32){
			System.out.println(bis4 + class4);			
		}
		if(jumlah >= 45){
			System.out.println(bis5+ class5);
		}
		if(jumlah >= 60){
			System.out.println(bis6 + class6);
		}
		System.out.println("----------------------------------------------");	
		System.out.println("---              Recomendasi               ---");
		System.out.println("----------------------------------------------");
		if(jumlah <= 11){
				if(jumlah<=6){
					System.out.println("1" + bis1 + class1 );
				}
				if(jumlah<=11 && jumlah >= 7){
					System.out.println("2" + bis1 + 2*class1 );
				}
		}
		else if(jumlah == 12 ){
			System.out.println("1" +bis2 + class2);
		}
		else if(jumlah == 18){
			System.out.println("1" + bis3 + class3);
		}
		else if(jumlah >= 13 && jumlah <=24){
			System.out.println("2" + bis2 + 2*class2);
		}
		else if(jumlah>= 25 && jumlah <= 30) {
			System.out.println("1" + bis2  + class2);
			System.out.println("1" + bis3  + class3);
			System.out.println("Jumlah :" + (class2+class3));
		}
		else if(jumlah == 31){
			System.out.println("2" + bis3 +2*class3);
		}

		else if(jumlah == 32){
			System.out.println("1" + bis4 + class4);
		}
		else if(jumlah == 36){
			System.out.println("2" + bis3 + 2*class3);
		}
		else if(jumlah>=37 && jumlah<=44){
			System.out.println("1" + bis2  + class2);
			System.out.println("1" + bis4  + class4);
			System.out.println("Jumlah :" + (class2+class4));
		}
		else if(jumlah == 45){
			System.out.println("1" +bis6 + class6);
		}
		else if(jumlah>=46 && jumlah<=50){
			System.out.println("1"+bis3+class3);
			System.out.println("1"+bis4+class4);
			System.out.println("Jumlah :" + (class3+class4));
		}
		else if(jumlah==64){
			System.out.println("2"+bis4+ 2*class4);
		}
		else if(jumlah>=51 && jumlah<=57){
			System.out.println("1"+bis2+class2);
			System.out.println("1"+bis5+class5);
			System.out.println("Jumlah :" + (class2+class5));
		}
		else if(jumlah == 60){
			System.out.println("1" + bis6 + class6);
		}
		else if(jumlah>=58 && jumlah<=63){
			System.out.println("1"+bis3+class3);
			System.out.println("1"+bis5+class5);
			System.out.println("Jumlah :" + (class3+class5));
		}
		else if(jumlah>=65 && jumlah<=72){
			System.out.println("1"+bis2+class2);
			System.out.println("1"+bis6+class6);
			System.out.println("Jumlah :" + (class2+class6));
		}
		else if(jumlah>=73 && jumlah<=78){
			System.out.println("1"+bis3+class3);
			System.out.println("1"+bis6+class6);
			System.out.println("Jumlah :" + (class3+class6));
		}
		else if(jumlah>=79 && jumlah<=92){
			System.out.println("1"+bis6+class6);
			System.out.println("1"+bis4+class4);
			System.out.println("Jumlah :" + (class3+class6));
		}
		else if(jumlah>=93 && jumlah<=105){
			System.out.println("1"+bis5+class5);
			System.out.println("1"+bis6+class6);
			System.out.println("Jumlah :" + (class5+class6));
		}
		else if(jumlah>=106 && jumlah<=120){
			System.out.println("2"+bis6+ 2*class6);
		}
		else
			System.out.println("Edan Loobaaa tea");

	
	}
}