import java.util.Scanner;

public class SoalNo5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukan Kalimat");
		String kalimat = input.nextLine();
		System.out.println("Batas Baris");
		int barisInput = input.nextInt();


		String[] kata = new String[kalimat.length()];
		// Masukan Ke array
		for(int posisi = 0 ; posisi < kalimat.length() ; posisi++){
			int posisiAkhir = posisi+1;
			String kata1 = kalimat.substring(posisi , posisiAkhir);
			kata[posisi] = kata1;
		}
		// Bikin segititga
		int posisiArray = 0 ;
		for(int baris = 0 ; baris < barisInput ; baris ++){
			//int batasSpasi = kata.length-baris;
			for(int colomSpasi = barisInput ; colomSpasi > baris ; colomSpasi-- ){
				System.out.print(" ");
			}
				
			for(int colomAngka = 0 ; colomAngka < baris+1 ; colomAngka++){
				int maksimal = kata.length;
				 	if(posisiArray < kata.length){
				 		System.out.print(kata[posisiArray] + " ");
						posisiArray++;
					}
					else{
						System.out.print(" ");
					}

				
			}
			System.out.println();
			
		}


	}
}					