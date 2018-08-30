import java.util.*;
public class GajiKaryawan {
	
	public static Scanner input = new Scanner(System.in);
	public static Scanner inputnext = new Scanner(System.in);
	public static ArrayList<Karyawan> pegawai = new ArrayList<Karyawan>();
	
	public static void main(String[] args) {
		String answer = "y", name = "dudu", nik = "123", penempatan = "jakarta", jabatan = "1", status = "1";
		String[] position = {"programmer", "analis", "tester", "writer"}, stat = {"junior", "middle", "senior"};
		int a, jamLembur;
		boolean menikah;
		Karyawan k;
		
		
		//Looping List Pegawai
		while(answer.equals("y")){
			System.out.println("Karyawan ke-"+(pegawai.size()+1));
			answer = "";
			
		// Looping nama
		do{
			System.out.print("Nama : ");
			answer = input.nextLine();
			if (!answer.matches("[a-zA-Z_ ]+")) System.out.println("Invalid Name !!");
		}while(!answer.matches("[a-zA-Z_ ]+"));
		name = answer;
		
		// Looping NIK
		do{
			System.out.print("NIK : ");
			answer = input.nextLine();
			if (!answer.matches("[0-9]+") && answer.length() != 18) System.out.println("Invalid NIK !!");
		}while(!answer.matches("[0-9]+") && answer.length() != 18);
		nik = answer;
		
		//Looping Penempatan
		do{
			System.out.print("Penempatan : ");
			answer = input.nextLine().toLowerCase();
			if (!answer.matches("[a-zA-Z_ ]+") || (!answer.equals("bandung") && !answer.equals("jakarta") && !answer.equals("karawang"))) {
				System.out.println("Invalid Penempatan !!");
				answer = "wrong";
			}
		}while(!answer.matches("[a-zA-Z_ ]+") || answer.equals("wrong"));
		penempatan = answer;
		
		// Looping Jabatan
		do{
			System.out.print("Jabatan\n1. Programmer\n2. Analis\n3. Tester\n4. Writer\n > ");
			answer = input.nextLine().toLowerCase();
			a= Integer.parseInt(answer);
			if (!answer.matches("[0-9]+") && (a != 1 && a != 2 && a != 3 && a != 4)) {
				System.out.println("Invalid Jabatan !!");
				answer = "wrong";
			}
		}while(!answer.matches("[0-9]+") && answer.equals("wrong"));
		jabatan = position[Integer.parseInt(answer)-1];
		
		// Looping Status
		do{
			System.out.print("Status\n1. Junior\n2. Middle\n3. Senior\n > ");
			answer = input.nextLine().toLowerCase();
			a= Integer.parseInt(answer);
			if (!answer.matches("[0-9]+") && (a != 1 && a != 2 && a != 3)) {
				System.out.println("Invalid Jabatan !!");
				answer = "wrong";
			}
		}while(!answer.matches("[0-9]+") && answer.equals("wrong"));
		status = stat[Integer.parseInt(answer)-1];
		
		// Looping Status Menikah
		do{
			System.out.print("Sudah Menikah : ");
			answer = input.nextLine().toLowerCase();
			if (!answer.equals("y")&&!answer.equals("n")) System.out.println("Invalid Status !!");
		}while(!answer.equals("y")&&!answer.equals("n"));
		if(answer.equals("y")) menikah = true;
		else menikah = false;
		
		// Jam Lembutr
		System.out.print("Masukan Jumlah jam lembur : ");
		jamLembur = Integer.parseInt(input.nextLine());
		
		k = new Karyawan(name, nik, penempatan, jabatan, status, menikah, jamLembur);
		pegawai.add(k);
		System.out.print("Tambah Karyawan ? (y/n) ");
		
		answer = inputnext.nextLine();
		System.out.println("");
		}
		
		
		// Menu
		do {
			System.out.print("Menu ? ");
			answer = input.next();
			switch(answer) {
			case "1" :
				System.out.println("Total Gaji Pokok : "+menu1());
			break;
			case "2" :
				System.out.println("Total Tunjangan Pegawai : "+menu2());
			break;
			case "3" :
				System.out.println("Total Lembur Pegawai : "+menu3());
			break;
			case "4" :
				System.out.println("Pengeluaran Perbulan : "+menu4());
			break;
			case "5" :
				System.out.println("Pengeluaran Pertahun : "+menu4()*12);
			break;
			case "6" :
				System.out.println("Income Pertahun : "+(425000000 - (menu4()*12)));
			break;
			default:
				System.out.println("Invalid Input");
			}
			
			System.out.print("Lanjut ? (y/n) ");
			answer = input.nextLine();
		}while(answer.equals("y"));
		
	}
	
	public static int menu1() {
		int total = 0;
		for(Karyawan piece : pegawai) {
			total += piece.gajiPokok();
		}
		return total;
	}
	
	public static int menu2() {
		int total = 0;
		int[] tunjangan;
		for(Karyawan piece : pegawai) {
			tunjangan = piece.hitungTunjangan();
			total += tunjangan[0]+tunjangan[1]+tunjangan[2];
		}
		return total;
	}
	
	public static int menu3() {
		int total = 0;
		for(Karyawan piece : pegawai) {
			total += piece.hitungLemburan();
		}
		return total;
	}
	
	public static int menu4() {
		int total = 0;
		for(Karyawan piece : pegawai) {
			total += piece.gajiBersih();
		}
		return total;
	}
}
