/*author : Muhamad Iqbal farhan Maulana*/
import java.util.Scanner;
public class Traveling79{
	public static void main(String[] args){
		Scanner kata = new Scanner(System.in);
		Scanner nomber = new Scanner(System.in);
		String nama1 , namaOpsional1 , nama2 , namaOpsional2 , nama3 , namaOpsional3 , nama4 , namaOpsional4;
		int pesawat1 , hotel1 ,  makan1 , opsional1 ;
		int pesawat2 , hotel2 ,  makan2 , opsional2 ;
		int pesawat3 , hotel3 ,  makan3 , opsional3 ;
		int pesawat4 , hotel4 ,  makan4 , opsional4 ;		
		nama1 = "Lombok" ; namaOpsional1 = "Snorkling" ;
		pesawat1 = 2170000 ; hotel1 = 255000 ; makan1 = 75000 ; opsional1=250000;
		nama2 = "Bangkok"; namaOpsional2 = "Belanja" ;
		pesawat2 = 3780000; hotel2 = 305000 ; makan2 = 55000 ; opsional2 = 300000;
		nama3 = "Singapura"; namaOpsional3 = "Ke Universal Studio";
		pesawat3 = 1200000 ; hotel3 =335000  ; makan3 = 85000 ; opsional3 = 360000;
		nama4 = "Tokyo" ; namaOpsional4 = "Ski";
		pesawat4 = 4760000 ;  hotel4 = 355000 ; makan4 = 105000 ; opsional4 = 325000;
		System.out.println("==== Welcome to Traveling79.com");
		System.out.println("Siapa Nama kamu :");
		String nama = kata.nextLine();
		System.out.println("Berapa orang yang akan ikut bersama mu :");
		int jumlahOrang = nomber.nextInt() + 1 ;
		System.out.println("Berapa Hari Kamu akan pergi");
		int jumlahHari = nomber.nextInt();
		System.out.println("Berapa Budget kamu :");
		int budget = nomber.nextInt();
		
		
		int jumlahLombok = 0;
			if(jumlahOrang % 2 == 0){
				
				jumlahLombok = pesawat1*jumlahOrang+hotel1*jumlahOrang/2*jumlahHari+makan1*jumlahOrang*jumlahHari;
				

			}
			else {
				
				jumlahLombok = pesawat1*jumlahOrang+hotel1*(jumlahOrang+1)/2*jumlahHari+makan1*jumlahOrang*jumlahHari;
				
			}
		int jumlahBangkok = 0;
			if(jumlahOrang % 2 == 0){
				
				jumlahBangkok = pesawat2*jumlahOrang+hotel2*jumlahOrang/2*jumlahHari+makan2*jumlahOrang*jumlahHari;
				
			}
			else {
				
				jumlahBangkok = pesawat2*jumlahOrang+hotel2*(jumlahOrang+1)/2*jumlahHari+makan2*jumlahOrang*jumlahHari;
			}
		int jumlahSingapura = 0;
			if(jumlahOrang % 2 == 0){
				
				jumlahSingapura = pesawat3*jumlahOrang+hotel3*jumlahOrang/2*jumlahHari+makan3*jumlahOrang*jumlahHari;
				

			}
			else {
				
				jumlahSingapura = pesawat3*jumlahOrang+hotel3*(jumlahOrang+1)/2*jumlahHari+makan3*jumlahOrang*jumlahHari;
				
			}
		int jumlahTokyo = 0;
			if(jumlahOrang % 2 == 0){
				
				jumlahTokyo = pesawat4*jumlahOrang+hotel4*jumlahOrang/2*jumlahHari+makan4*jumlahOrang*jumlahHari;
				

			}
			else {
				
				jumlahTokyo = pesawat4*jumlahOrang+hotel4*(jumlahOrang+1)/2*jumlahHari+makan4*jumlahOrang*jumlahHari;
				
			}
		if (budget >= jumlahTokyo){
			System.out.println("Hy : "+nama);
			System.out.println("Tempat Wisata Rekomendasi Untuk kamu adalah Tokyo");
			System.out.println("Apakah kamu ingin "+ namaOpsional4 +"(Y/N)");
			String op = kata.next();
			if(op.equals("y")){
				jumlahTokyo = jumlahTokyo + jumlahOrang*opsional4;
				System.out.println("Jumlah yang Harus kamu keluarkan adalah Rp ."+ jumlahTokyo);
				System.out.println("Sisa uang anda adalahRp "+ (budget - jumlahTokyo));
			}
			else if(op.equals("n")){
				System.out.println("jumlah yang harus kamu keluarkan adalah Rp ."+ jumlahTokyo);
				System.out.println("Sisa uang anda adalahRp "+ (budget - jumlahTokyo));
			}
		}
		else if (budget >= jumlahBangkok){
			System.out.println("Hy : "+nama);
			System.out.println("Tempat Wisata Rekomendasi Untuk kamu adalah Bangkok");
			System.out.println("Apakah kamu ingin "+ namaOpsional2 +"(Y/N)");
			String op = kata.next();
			if(op.equals("y")){
				jumlahBangkok = jumlahBangkok + jumlahOrang*opsional2;
				System.out.println("Jumlah yang Harus kamu keluarkan adalah Rp ."+ jumlahBangkok);
				System.out.println("Sisa uang anda adalahRp "+ (budget - jumlahBangkok));
			}
			else if(op.equals("n")){
				System.out.println("jumlah yang harus kamu keluarkan adalah Rp ."+ jumlahBangkok);
				System.out.println("Sisa uang anda adalahRp "+ (budget - jumlahBangkok));
			}
		}
		else if (budget >= jumlahLombok){
			System.out.println("Hy : "+nama);
			System.out.println("Tempat Wisata Rekomendasi Untuk kamu adalah Lombok");
			System.out.println("Apakah kamu ingin "+ namaOpsional1 +"(Y/N)");
			String op = kata.next();
			if(op.equals("y")){
				jumlahLombok = jumlahLombok + jumlahOrang*opsional1;
				System.out.println("Jumlah yang Harus kamu keluarkan adalah Rp ."+ jumlahLombok);
				System.out.println("Sisa uang anda adalahRp "+ (budget - jumlahLombok));
			}
			else if(op.equals("n")){
				System.out.println("jumlah yang harus kamu keluarkan adalah Rp ."+ jumlahLombok);
				System.out.println("Sisa uang anda adalahRp "+ (budget - jumlahLombok));
			}
		}
		else if (budget >= jumlahSingapura){
			System.out.println("Hy : "+nama);
			System.out.println("Tempat Wisata Rekomendasi Untuk kamu adalah Singapura");
			System.out.println("Apakah kamu ingin "+ namaOpsional3 +"(Y/N)");
			String op = kata.next();
			if(op.equals("y")){
				jumlahSingapura = jumlahSingapura + jumlahOrang*opsional3;
				System.out.println("Jumlah yang Harus kamu keluarkan adalah Rp ."+ jumlahSingapura);
				System.out.println("Sisa uang anda adalahRp "+ (budget - jumlahSingapura));
			}
			else if(op.equals("n")){
				System.out.println("jumlah yang harus kamu keluarkan adalah Rp ."+ jumlahSingapura);
				System.out.println("Sisa uang anda adalahRp "+ (budget - jumlahSingapura));
			}
		}
		else
			{
				System.out.println("Maaf Budget anda belum cukup untuk kami Rekomendasi kan");
			}				

			
	}
}