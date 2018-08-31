import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> jenisJabatan = new HashMap<String, String>(){{
			put("i", "fungsional");
			put("ii", "struktural");
			put("iii", "umum");
		}};
		String answer, nama, nip, penempatan, jabatan, golongan = "";
		Boolean menikah = false, sewa = false;
		int mkg, anak = 0, eselon = 0;
		
		/* User Input */
		
		// Input Nama
		do{
			System.out.print("Nama : ");
			nama = input.nextLine();
			if (!nama.matches("[a-zA-Z_ ]+")) System.out.println("Invalid Nama !!");
		}while(!nama.matches("[a-zA-Z_ ]+"));
		
		// Input NIP
		do{
			System.out.print("NIP : ");
			nip = input.nextLine();
			if (!nip.matches("[0-9]+")) System.out.println("Invalid NIP !!");
		}while(!nip.matches("[0-9]+"));
		
		// Golongan
		do{
			System.out.print("Golongan (I/a): ");
			answer = input.nextLine().toLowerCase();
			if (!answer.matches("(.*)/(.*)") || !checkGolongan(answer)) System.out.println("Invalid Golongan !!");

		}while(!answer.matches("(.*)/(.*)") || !checkGolongan(answer));
		golongan = answer;
		
		// Masa Kerja Golongan
		do{
			System.out.print("Masa Kerja Golongan : ");
			answer = input.nextLine().toLowerCase();
			mkg = Integer.parseInt(answer);
			String[] tempg = golongan.split("/");
			if(mkg < 0 || ((tempg[0].equals("i") || tempg[0].equals("ii"))&& !tempg[1].equals("a") && mkg<3)) {
				System.out.println("Invalid MKG !!");
				answer = "wrong";
			}
		}while(answer.equals("wrong"));
		mkg = Integer.parseInt(answer);
		
		//Penempatan Kerja
		do{
			System.out.print("Penempatan : ");
			penempatan = input.nextLine();
			if (!penempatan.matches("[a-zA-Z_ ]+")) System.out.println("Invalid Penempatan !!");
		}while(!penempatan.matches("[a-zA-Z_ ]+"));
		
		// Sewa Rumah Dinas
		do{
			System.out.print("Apakah anda tinggal di rumah dinas (y/n) ");
			answer = input.nextLine().toLowerCase();;
			if (!answer.equals("y") && !answer.equals("n")) System.out.println("Invalid Answer !! ");
		}while(!answer.equals("y") && !answer.equals("n"));
		if (answer.equals("y"))  sewa = true;
		
		// Jenis Jabatan
		do{
			System.out.print("Apakah jenis jabatan anda ?\n I. Fungsional\n II. Struktural\n III. Umum\n> ");
			answer = input.nextLine().toLowerCase();;
			if (!answer.equals("i") && !answer.equals("ii") && !answer.equals("iii")) System.out.println("Invalid Answer !!");
		}while(!answer.equals("i") && !answer.equals("ii") && !answer.equals("iii"));
		jabatan = jenisJabatan.get(answer);
		if (answer.equals("ii")) {
			do{
				System.out.print("Eselon : ");
				answer = input.nextLine();
				if (!nip.matches("[0-9]+") && Integer.parseInt(answer) > 5) System.out.println("Invalid Eselon !!");
			}while(!nip.matches("[0-9]+") && Integer.parseInt(answer) > 5);
				eselon = Integer.parseInt(answer);
		}
		
		// Status pernikahan 
		do{
			System.out.print("Apakah anda sudah menikah (y/n) ");
			answer = input.nextLine();
			if (!answer.equals("y") && !answer.equals("n")) System.out.println("Invalid Answer !!");
		}while(!answer.equals("y") && !answer.equals("n"));
		if(answer.equals("y")) menikah = true;

		// Jumlah Anak
		do{
			System.out.print("Berapa Jumlah anak anda : ");
			answer = input.nextLine();
			if (!answer.matches("[0-9]+")) System.out.println("Invalid Answer !!");
		}while(!answer.matches("[0-9]+"));
		anak = Integer.parseInt(answer);
		if(anak > 2) anak = 2;
		
		Pns pns1 = new Pns(nama, nip, penempatan, jabatan, golongan, menikah, eselon, mkg, anak, sewa);
		pns1.slip();
		
	}
	
	// Cek Golongan
	public static boolean checkGolongan(String param) {
		String[] gol = param.split("/");
		if(gol[0].equals("i") || gol[0].equals("ii") || gol[0].equals("iii") || gol[0].equals("iv")) {
			if(!gol[1].equals("a") && !gol[1].equals("b") && !gol[1].equals("c") && !gol[1].equals("d") && !gol[1].equals("e")){
				return false;
			}if(gol[1].equals("e") && !gol[0].equals("iv")) {
				return false;
			}
		}else return false;
		return true;
	}
}
