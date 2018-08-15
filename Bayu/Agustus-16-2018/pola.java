public class pola {
	public static void main (String [] args) {
	int samping, bawah, temp, nilai, bintang;

	//Segitiga
	System.out.println("Pola satu");
	for (nilai = 1; nilai <= 6; nilai++){
            for( samping =4; samping >= nilai; samping--){ 
                System.out.print(" ");
            }
            for(bawah =1; bawah <= nilai; bawah++){
                System.out.print("*");
            }
            for (bintang=1; bintang<=nilai-1; bintang++){
                System.out.print("*");
            }
            System.out.println();
        }     
	}
}