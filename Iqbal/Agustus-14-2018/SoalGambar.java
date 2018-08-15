public class SoalGambar {
	public static void main(String[] args) {
		// Segitiga Sama Kaki
		for(int baris = 0 ; baris < 5 ; baris++){
			//Spasi
			for(int spasi = 5 ; spasi > baris ; spasi--){
				System.out.print(" ");
			}
			for(int bintang = 0 ; bintang< baris+1 ; bintang++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		// Segitiga Sama Kaki nonggeng
		for(int baris = 0 ; baris < 5 ; baris++){
			for(int spasi = 0 ; spasi < baris+1 ; spasi++){
				System.out.print(" ");
			}
			for(int bintang = 5 ; bintang > baris ; bintang--){
				System.out.print("* ");
			}
			System.out.println();	
		}

		//Nomor 3
		for(int baris = 0 ; baris < 3 ; baris ++){
			for(int bintang = 0 ; bintang < baris+1 ; bintang++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int baris = 0 ; baris < 3 ; baris ++){
			for(int spasi = 2 ; spasi > baris ; spasi--){
				System.out.print(" ");
			}
			for(int bintang = 0 ; bintang < baris+1 ; bintang++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// Nomor 6
		for(int baris = 0 ; baris < 3 ; baris ++){
			for(int spasi = 2 ; spasi > baris ; spasi--){
				System.out.print(" ");
			}
			for(int bintang = 0 ; bintang < baris+1 ; bintang++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int baris = 0 ; baris < 3 ; baris ++){
			for(int spasi = 0 ; spasi < baris+1 ; spasi++){
				System.out.print("*");
			}
			for(int bintang = 0 ; bintang < baris+1 ; bintang++){
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		// no 10
		for(int baris = 0 ; baris < 5 ; baris ++){
			for(int kolom = 5 ; kolom > baris ; kolom--){
				System.out.print("*");
			}
			System.out.println();			
		}
		
		for(int baris = 1 ; baris < 5 ; baris ++){
			for (int kolom =1 ; kolom < baris +2 ; kolom++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 7
		for(int baris = 0 ; baris < 5 ; baris ++){
			for(int spasi = 1 ; spasi <= baris ; spasi++){
				System.out.print(" ");
			}
			for(int kolom = 5 ; kolom > baris ; kolom--){
				System.out.print("*");
			}
			System.out.println();			
		}
		
		for(int baris = 1 ; baris < 5 ; baris ++){
			for(int spasi = 5 ; spasi > baris+1 ; spasi--){
				System.out.print(" ");
			}
			for (int kolom =1 ; kolom < baris +2 ; kolom++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//13
		int jumlahBaris = 6 , baris = 0;
		for( ; baris < jumlahBaris ; baris++){
			for(int nol = 0 ; nol < baris+1 ; nol++){
				System.out.print("0");
			}
			for(int bintang = 6 ; bintang > baris ; bintang--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		//14		
		int jumlah = 6 ;
		for( baris = 0 ; baris < jumlah ; baris++){
			for(int nol = 0 ; nol < baris+1 ; nol++){
				System.out.print("*");
			}
			for(int bintang = 6 ; bintang > baris ; bintang--){
				System.out.print("0");
			}
			System.out.println();
		}
		System.out.println();

		//15
		for(int bawah = 0 ; bawah < 6 ; bawah++){
			for(int samping1 = 6 ; samping1 > bawah ; samping1--){
				System.out.print("0");
			}
			for(int samping2 = 0 ; samping2 < bawah + 1 ; samping2++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//16
		for(int bawah = 0 ; bawah < 6 ; bawah++){
			for(int samping1 = 6 ; samping1 > bawah ; samping1--){
				System.out.print("*");
			}
			for(int samping2 = 0 ; samping2 < bawah + 1 ; samping2++){
				System.out.print("0");
			}
			System.out.println();
		}
	}
}