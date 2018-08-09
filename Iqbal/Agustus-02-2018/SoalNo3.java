import java.util.Scanner;
public class SoalNo3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String noHp ;
		System.out.println("Masukan No hp");
		noHp = input.next();
		for(int posisi = 0	 ; posisi < noHp.length() ; posisi++){
			int hasil = posisi + 1 ;	
			
			String fengShui = noHp.substring(posisi, hasil);
			if(fengShui.equals("0")){
				System.out.println(fengShui + " Khusus , Spesial , Langka");
			}
			if(fengShui.equals("1")){
				System.out.println(fengShui + " Satu , satu-satunya , diri Sendiri");
			}
			if(fengShui.equals("2")){
				System.out.println(fengShui + " Mudah , Gampang , tidak sulit ");
			}
			if(fengShui.equals("3")){
				System.out.println(fengShui + " Menemukan , mendapatkan , hidup");				
			}
			if(fengShui.equals("4")){
				System.out.println(fengShui + " Mati , Miskin , Susah");
			}
			if(fengShui.equals("5")){
				System.out.println(fengShui + " Tidak akan , tidak pernah , tidak bisa");
			}
			if(fengShui.equals("6")){
				System.out.println(fengShui + " Menuju , akan");
			}
			if(fengShui.equals("7")){
				System.out.println(fengShui + " Tepat , Hoki , atau bisa di sebut juga ketuhanan");
			}
			if(fengShui.equals("8")){
				System.out.println(fengShui + " Makmur");
			}
			if(fengShui.equals("9")){
				System.out.println(fengShui + " Sukses");
			}


		}
	}
}