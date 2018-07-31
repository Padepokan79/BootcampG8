import java.util.*;
public class Skill{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int overallSkill, project, pengalaman;
		String rank;
		int[] skill = {0,0,0,0};

		System.out.println("Skill\n============================");
		System.out.print(" - Skill Back-End : ");
		skill[0] = keyboard.nextInt();
		System.out.print(" - Skill UI \t  : ");
		skill[1] = keyboard.nextInt();
		System.out.print(" - Skill UX \t  : ");
		skill[2] = keyboard.nextInt();
		System.out.print(" - Skill Database : ");
		skill[3] = keyboard.nextInt();
		overallSkill = (skill[0]+skill[1]+skill[2]+skill[3])/4;

		System.out.println("\nProject\n============================");
		System.out.print(" - Jumlah Project : ");
		project = keyboard.nextInt();

		System.out.println("\nPengalaman\n============================");
		System.out.print(" - Lama Pengalaman Bekerja (Tahun) : ");
		pengalaman = keyboard.nextInt();

		if (overallSkill >= 7 || project > 12 || pengalaman > 5) {
			rank = "Expert";
		}else if (overallSkill >= 4 || project >= 6 || pengalaman > 3) {
			rank = "Middle";
		}else{
			rank = "Beginner";
		}

		System.out.println("\n - Anda adalah seorang "+rank+" Programmer - ");

	}
}