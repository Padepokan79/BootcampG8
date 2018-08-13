import java.util.*;

public class Soal3{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		String[] arti = {"khusus, special, langka", "satu, satu-satunya, diri sendiri", "mudah, gampang, tidak sulit",
		"menemukan, mendapatkan, hidup", "mati, miskin, susah", "Tidak akan, tidak pernah, tidak bisa", "Menuju, akan",
		"Tepat, hoki, atau bisa disebut juga ketuhanan", "Makmur", "Sukses"};
		String phone;
		int number; 

		System.out.print("Enter Your Phone Number ");
		phone = keyboard.nextLine();
		System.out.println("\nArti:");

		for (int index = 0;index < phone.length() ; index++) {
			number = Integer.parseInt(phone.substring(index, index+1));
			System.out.println(number+" "+arti[number]);
		}




	}
}