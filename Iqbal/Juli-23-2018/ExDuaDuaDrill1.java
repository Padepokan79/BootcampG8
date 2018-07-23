/*
Author : Muhamad Iqbal Farhan Maulana

*/

import java.util.Scanner;

public class ExDuaDuaDrill1{
	public static void main(String[] args){
		Scanner keybord = new Scanner(System.in);
		int month , days ;
		String monthName ;

		System.out.println("Which Month ? (1-12)");
		month = keybord.nextInt();

		switch(month){
			case 1 : monthName = "January " ; 
					System.out.println("Drill 1");
			case 2 : monthName = "February" ;
					break;
			case 3 : monthName = "March"	;
					break;
			case 4 : monthName = "April"	;
					break;
			case 5 : monthName = "Mei"		;
					break;
			case 6 : monthName = "June"		;
					break;
			case 7 : monthName = "July"		;
					break;
			case 8 : monthName = "August"	;
					break;
			case 9 : monthName = "September";
					break;
			case 10 : monthName = "October"	;
					break;
			case 11 : monthName = "November";
					break;
			case 12 : monthName = "December";
					break;
			default : monthName = "error "	;
				}	


			/*Thirty days hath September  , april , june and november  all the rest have 31 except the second month alone*/																					 
			switch(month){
				case 9 :
				case 4 :
				case 6 :
				case 11 : days = 30;
						break;
				case 2 : days = 28 ;
						break;
				default : days = 31 ;

 
			}	
		
		System.out.println(days + "days hath " + monthName);
	}
}