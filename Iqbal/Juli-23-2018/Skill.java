/*
Author : Muhamad Iqbal Farhan Maulana
*/

import java.util.Scanner;

public class Skill{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double rataRataSkill , skillAnalisis , skillWebProgramming , skillDesktopProgramming , skillAndroidProgramming ;
		int jumlahProject , pengalamanKerja;
		String skill , skill1 , skill2 , skill3 ;
		skill1 = "Beginner";
		skill2 = "Middle" ;
		skill3 = "Expert";
		System.out.println("Berapa Skill Analisismu (1-10)");
		skillAnalisis = input.nextDouble();
		System.out.println("Berapa Skill Pemograman Web Kamu (1-10)");
		skillWebProgramming = input.nextDouble();
		System.out.println("Berapa Skill Pemograman Desktop kamu (1-10)");
		skillDesktopProgramming = input.nextDouble();
		System.out.println("Berapa Skill skillAndroidProgramming (1-10)");
		skillAndroidProgramming = input.nextDouble();
		System.out.println("Berapa jumlah Project yang pernah dikerjakan");
		jumlahProject = input.nextInt();
		System.out.println("Berapa Tahun pengalaman kerja kamu");	
		pengalamanKerja = input.nextInt();

		rataRataSkill = (skillAnalisis + skillDesktopProgramming + skillWebProgramming + skillAndroidProgramming)/4;
		if(rataRataSkill >= 7 || jumlahProject >= 13 || (pengalamanKerja >= 6N)){
			skill = skill3;
			System.out.println(skill);
		}

		else if(rataRataSkill >= 3 || jumlahProject >= 6 || (pengalamanKerja >= 3 && pengalamanKerja <=5)){
			skill = skill2;
			System.out.println(skill);
		}
		else if(rataRataSkill >= 1 || jumlahProject >= 1){
			skill = skill1;
			System.out.println(skill);
		}
		else {
			System.out.println("Kamu Bukan Programmer");
		} 
	}
}