import java.util.Scanner;
public class Halhal{
		public static main(String[] args){
				Scanner input = new Scanner(System.in);
				int pilih ;
				String balik;
				System.out.println("Hai Sahabat Kepo ! , Apa yang ingin anda tanyakan" );
				System.out.println("1 . hal-hal yang membuat saya Senang" );
				System.out.println("2 . hal-hal yang membuat saya Marah" );
				System.out.println("3 . hal-hal yang membuat saya Sedih" );
				System.out.println("4 . hal-hal yang membuat saya Menyesal" );
				System.out.println("Jawaban Kalian :  ");
				pilih = input.nextInt();
				switch(pilih){
					case 1:
							//cls();
							System.out.println("Saya Senang Ketika");
							break;
					case 2:
							//cls();
							System.out.println("Saya Marah Ketika");
							break;
					case 3:
							//cls();
							System.out.println("Saya Sedih Ketika");
							break;
					case 4:
							//cls();
							System.out.println("Saya Menyesal Ketika");
							break;						
				}
				

					return 0;
		}
		
}