import java.util.*;
public class GajiKaryawan {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String answer, name = "dudu", nik = "123", penempatan = "jakarta", jabatan = "1", status = "1";
		int a, keluarga = 1;
		Karyawan k;
		
		
		do{
			System.out.print("Nama : ");
			answer = input.nextLine();
			if (!answer.matches("[a-zA-Z_ ]+")) System.out.println("Invalid Name !!");
		}while(!answer.matches("[a-zA-Z_ ]+"));
		name = answer;
		
		do{
			System.out.print("NIK : ");
			answer = input.nextLine();
			if (!answer.matches("[0-9]+") && answer.length() != 18) System.out.println("Invalid NIK !!");
		}while(!answer.matches("[0-9]+") && answer.length() != 18);
		nik = answer;
		
		do{
			System.out.print("Penempatan : ");
			answer = input.nextLine().toLowerCase();
			if (!answer.matches("[a-zA-Z_ ]+") || (!answer.equals("bandung") && !answer.equals("jakarta") && !answer.equals("karawang"))) {
				System.out.println("Invalid Penempatan !!");
				answer = "wrong";
			}
		}while(!answer.matches("[a-zA-Z_ ]+") || answer.equals("wrong"));
		penempatan = answer;
		
		do{
			System.out.print("Jabatan\n1. Programmer\n2. Analis\n3. Tester\n4. Writer\n > ");
			answer = input.nextLine().toLowerCase();
			a= Integer.parseInt(answer);
			if (!answer.matches("[0-9]+") && (a != 1 && a != 2 && a != 3 && a != 4)) {
				System.out.println("Invalid Jabatan !!");
				answer = "wrong";
			}
		}while(!answer.matches("[0-9]+") && answer.equals("wrong"));
		jabatan = answer;
		
		do{
			System.out.print("Status\n1. Junior\n2. Middle\n3. Senior\n > ");
			answer = input.nextLine().toLowerCase();
			a= Integer.parseInt(answer);
			if (!answer.matches("[0-9]+") && (a != 1 && a != 2 && a != 3)) {
				System.out.println("Invalid Jabatan !!");
				answer = "wrong";
			}
		}while(!answer.matches("[0-9]+") && answer.equals("wrong"));
		status = answer;
		
		do{
			System.out.print("Jumlah Keluarga : ");
			answer = input.nextLine().toLowerCase();
			a = Integer.parseInt(answer);
			if (!answer.matches("[0-9]+")) System.out.println("Invalid Jabatan !!");
		}while(!answer.matches("[0-9]+"));
		keluarga = Integer.parseInt(answer);
		
		k = new Karyawan(name, nik, penempatan, jabatan, status, keluarga);
		k.slip();
		
	}
}
