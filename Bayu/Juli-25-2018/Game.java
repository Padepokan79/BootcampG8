import java.util.Scanner;

public class Game {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int stamina, uang, skill, mood, gaji;
		String belajar, bekerja, berlibur, makan, tidur, berdagang, player;

		stamina = 100;
		uang = 100;
		skill = 0;
		mood = 100;
		gaji = 15 + skill;

		System.out.println("Pilih salah satu ");
		System.out.println("Belajar/Bekerja/Berlibur/Makan/TIdur/Bergadang");
		System.out.println("Pilih Kegiatan Player : ");
		player = keyboard.next();

		if ( player.equals ("belajar")) {
			stamina = stamina - 10;
			uang = uang - 5;
			skill = skill + 5;
			mood = mood-40;
		}
		else if ( player.equals ("bekerja")) {
			stamina = stamina - 40;
			uang = uang + 25;
			mood = mood-5;
		}
		else if ( player.equals ("berlibur")) {
			stamina = stamina + 50;
			uang = uang - 40;
			skill = skill + 2;
			mood = mood + 15;
		}
		else if ( player.equals ("makan")) {
			stamina = stamina + 3;
			uang = uang - 10;
			mood = mood + 2;
		}
		else if ( player.equals ("tidur")) {
			stamina = stamina + 5;
			mood = mood + 5;
		}
		else if ( player.equals ("bergadang")) {
			stamina = stamina - 5;
			skill = skill + 2;
			mood = mood - 5;
		}

		System.out.println("Score Akhir Player : ");
		System.out.println("Stamina    :  " +stamina);
		System.out.println("Uang       : " +uang);
		System.out.println("Skill      : " +skill);
		System.out.println("Mood       : " +mood);
		System.out.println("Gaji       : " +gaji);
	}
}