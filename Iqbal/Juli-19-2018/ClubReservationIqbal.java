/*
Author : Muhamad Iqbal Farhan Maulana
Created
*/
import java.util.Scanner;

public class ClubReservationIqbal{
	public static void main(String [] args){
		String hari , kelamin ;
		int penampilan , umur ;
		Scanner input = new Scanner(System.in);
		System.out.println("==============================");
		System.out.println("====   CLUB RESERVATION   ====");
		System.out.println("==============================");
		System.out.println("Hari Yang diinginkan :");
		hari = input.next();
		System.out.println("UMUR ANDA :");
		umur = input.nextInt();
		System.out.println("Jenis Kelamin (Cewek/Cowok) :");
		kelamin = input.next();
		System.out.println("Penampilan rate dari 0 s.d 10 :");
		penampilan = input.nextInt();

		if("jumat".equals(hari)){
			if(umur > 40 && kelamin.equals("cowok") || kelamin.equals("cewek") ){
				System.out.println("Reservasi Melodies Memori : SUKSES");
			}
			else
				System.out.println("Reservasi Melodies Memori : GAGAL");
		}
		else if("kamis".equals(hari)){
			if("cewek".equals(kelamin) && penampilan >= 8 && umur >= 21 & & umur <= 30){
				System.out.println("Reservasi Ladies Night 5a : SUKSES");
			}
			else
				System.out.println("Reservasi Ladies Night 5a : GAGAL");
		}
		else if("sabtu".equals(hari)){
			if(umur>= 21 && umur <= 30 && penampilan>=8 && kelamin.equals("cowok") || kelamin.equals("cewek")){
				System.out.println("Reservasi Jomblo Night 5b : SUKSES");
			}
			else 
				System.out.println("Reservasi Jomblo Night 5b : GAGAL");			
		}
		else if("selasa".equals(hari)){
			if(kelamin.equals("cewek")){
				if(umur >= 30 && umur <= 45 && penampilan >= 8){
					System.out.println("Reservasi Brondong Night 3c : SUKSES");
				}
				else
					System.out.println("Reservasi Brondong Night 3c : GAGAL");
			}
			else if(kelamin.equals("cowok")){
				if(umur >= 20 && umur <= 25 && penampilan < 8 ){
					System.out.println("Reservasi Brondong Night 3c : SUKSES");
				}
				else
					System.out.println("Reservasi Brondong Night 3c : GAGAL");
			}
		}
		else 
			System.out.println("Reservasi SUKSES");
		
	}
}