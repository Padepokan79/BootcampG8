import java.util.*;
public class GajiKaryawan {
	
	public static Scanner input = new Scanner(System.in);
	public static Scanner inputnext = new Scanner(System.in);
	public static ArrayList<Karyawan> pegawai = new ArrayList<Karyawan>();
	
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		String answer, name, nik, penempatan, tingkat, posisi;
		Boolean menikah = false;
		int masaKerja, bonus = 0, lembur;
		HashMap<String, String> question = new HashMap<String, String>(){{
				put("pg", "Masukan jumlah Bug yang diperbaiki");
				put("ts", "Masukan jumlah test case");
				put("tw", "Masukan jumlah Document");
		}};
		
		Karyawan worker;

		// Nama
		do{
			System.out.print("Nama : ");
			name = input.nextLine();
			if (!name.matches("[a-zA-Z_ ]+")) System.out.println("Invalid Nama !!");
		}while(!name.matches("[a-zA-Z_ ]+"));
		if (name.length() > 35) name= name.substring(0, 35);
			
		// NIK
		do{
			System.out.print("NIK : ");
			nik = input.nextLine();
			if (!nik.matches("[0-9]+")) System.out.println("Invalid NIP !!");
		}while(!nik.matches("[0-9]+"));
		
		// Penempatan
		do{
			System.out.print("Penempatan (jakarta, bandung, karawang, surabaya) : ");
			penempatan = input.nextLine().toLowerCase();
			if (!penempatan.matches("jakarta") && !penempatan.matches("bandung") && !penempatan.matches("karawang") && !penempatan.matches("surabaya")) 
				System.out.println("Invalid Penempatan !!");
		}while(!penempatan.matches("jakarta") && !penempatan.matches("bandung") && !penempatan.matches("karawang") && !penempatan.matches("surabaya"));
		
		do{
			System.out.print("Posisi :\n(PG) Programmer\n(SA) System Analist\n(TS) Tester\n(TW) Technical Writer\n > ");
			posisi = input.nextLine().toLowerCase();
			if (!posisi.matches("pg") && !posisi.matches("sa") && !posisi.matches("ts") && !posisi.matches("tw")) 
				System.out.println("Invalid Posisi !!");
		}while(!posisi.matches("pg") && !posisi.matches("sa") && !posisi.matches("ts") && !posisi.matches("tw"));
		
		do{
			System.out.print("Tingkat (junior, middle, senior) : ");
			tingkat = input.nextLine().toLowerCase();
			if (!tingkat.matches("junior") && !tingkat.matches("middle") && !tingkat.matches("senior")) 
				System.out.println("Invalid Tingkat !!");
		}while(!tingkat.matches("junior") && !tingkat.matches("middle") && !tingkat.matches("senior"));
		
		do{
			System.out.print("Masa Kerja : ");
			answer = input.nextLine();
			if (!answer.matches("[0-9]+") || Integer.parseInt(answer) < 0) System.out.println("Invalid Masa Kerja !!");
		}while(!answer.matches("[0-9]+") || Integer.parseInt(answer) < 0);
		masaKerja = Integer.parseInt(answer);
		
		do{
			System.out.print("Sudah Menikah (y/n) ");
			answer = input.nextLine().toLowerCase();;
			if (!answer.equals("y") && !answer.equals("n")) System.out.println("Invalid Answer !! ");
		}while(!answer.equals("y") && !answer.equals("n"));
		if (answer.equals("y"))  menikah = true;
		
		do{
			System.out.print("Jumlah Jam Lembur : ");
			answer = input.nextLine();
			if (!answer.matches("[0-9]+") || Integer.parseInt(answer) < 0) System.out.println("Invalid Jumlah Jam Lembur!!");
		}while(!answer.matches("[0-9]+") || Integer.parseInt(answer) < 0);
		lembur = Integer.parseInt(answer);
		
		if(!posisi.equals("sa")) {
			do{
				System.out.print(question.get(posisi)+" : ");
				answer = input.nextLine();
				if (!answer.matches("[0-9]+") || Integer.parseInt(answer) < 0) System.out.println("Invalid Jumlah Jam Lembur!!");
			}while(!answer.matches("[0-9]+") || Integer.parseInt(answer) < 0);
			bonus = Integer.parseInt(answer);
		}
		
		if(posisi.equals("pg")) {
			worker = new PG(name, nik, penempatan, menikah, masaKerja, lembur, tingkat, bonus);
		}else if(posisi.equals("sa")) {
			worker = new SA(name, nik, penempatan, menikah, masaKerja, lembur, tingkat);
		}else if(posisi.equals("ts")) {
			worker = new TS(name, nik, penempatan, menikah, masaKerja, lembur, tingkat, bonus);
		}else{
			worker = new TW(name, nik, penempatan, menikah, masaKerja, lembur, tingkat, bonus);
		}
		
		worker.slit();
		
	}
}
