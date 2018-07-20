/*
Author : Muhamad Iqbal Farhan Maulana
Created
*/

import java.util.Scanner;

public class Travel79Iqbal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int jumlah , reoommend;
		int class1,class2,class3,class4,class5,class6;
	    class1 = 2000000;
	    class2 = 1300000;
	    class3 = 1500000;
	    class4 = 1800000;
	    class5 = 2000000;
	    class6 = 3200000;
		System.out.println("===========================");
		System.out.println("==  Welcome to Travel79   =");
		System.out.println("===========================");
		System.out.println("Masukan JUmlah Penumpang");
		jumlah = input.nextInt();
		
		System.out.println("BIS Executive Dengan kursi 6 : Rp."+ class1);
		if(jumlah >= 12){
			
			System.out.println("BIS Dengan kursi 12 : RP." + class2);
		}

		if(jumlah >= 18){
			System.out.println("BIS Dengan kursi 18 : Rp."+ class3);
		}
		
		if(jumlah >= 32){
			System.out.println("BIS Dengan kursi 32 : Rp."+ class4);			
		}
		if(jumlah >= 45){
			System.out.println("BIS Dengan kursi 45 : Rp."+ class5);
		}
		if(jumlah >= 60){
			System.out.println("BIS Dengan kursi 60 : Rp."+ class6);
		}
		
	}
}