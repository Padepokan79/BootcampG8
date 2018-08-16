import java.util.Scanner;
public class SoalNo3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] jumlahHari = {31,28,31,30,31,30,31,31,30,31,30,31};
		int jumlahTabungan = 0 , tabunganBulan = 0 ;
		System.out.println("Masukan Jumlah Keluarga");
		String jumlahKeluarga1 = input.next();
		while(!jumlahKeluarga1.matches("[0-9]+")){
			System.out.println("Maaf , input yang diterima berupa angka");
			System.out.print("Silahkan Input lagi : ");
			jumlahKeluarga1 = input.next();
		}

		//System.out.println(jumlahKeluarga);
		int jumlah = Integer.parseInt(jumlahKeluarga1);
		
		while(!jumlahKeluarga1.matches("[0-9]+") && jumlah<5 && jumlah > 6 );
		{
			if(jumlah<2){
				System.out.println("Maaf , jumlah keluarga tidak boleh kurang dari 2");
				System.out.print("Silahkan Input lagi : ");
				jumlahKeluarga1 = input.next();
				jumlah = Integer.parseInt(jumlahKeluarga1);
			}
			if(jumlah>6){
				System.out.println("Maaf , jumlah keluarga tidak boleh lebih dari 6");
				System.out.print("Silahkan Input lagi : ");
				jumlahKeluarga1 = input.next();
				jumlah = Integer.parseInt(jumlahKeluarga1);
			}
			
		}
		System.out.println("Masukan Lama Tabungan");
		String lamaTabungan1 = input.next();
		while(!lamaTabungan1.matches("[0-9]+")){
			System.out.println("Maaf , input yang diterima berupa angka");
			System.out.print("Silahkan Input lagi : ");
			lamaTabungan1 = input.next();
		}
		int lamaTabungan = Integer.parseInt(lamaTabungan1);
		
		while(!lamaTabungan1.matches("[0-9]+") && lamaTabungan<1 && lamaTabungan > 12 );
		{
			if(lamaTabungan<2){
				System.out.println("Maaf , jumlah Bulan tidak boleh kurang dari 2");
				System.out.print("Silahkan Input lagi : ");
				lamaTabungan1 = input.next();
				lamaTabungan = Integer.parseInt(lamaTabungan1);
			}
			if(lamaTabungan>6){
				System.out.println("Maaf , jumlah Bulan tidak boleh lebih dari 12");
				System.out.print("Silahkan Input lagi : ");
				lamaTabungan1 = input.next();
				lamaTabungan = Integer.parseInt(lamaTabungan1);
			}
			
		}

		for(int bulan = 0 ; bulan < lamaTabungan ; bulan++){
			int tabunganAwal = 1000 * jumlahHari[bulan];
			int pengurangan = 1000 ;
			for (int hari = 0 ; hari <jumlahHari[bulan] ; hari++ ) {
				tabunganBulan += jumlah*(tabunganAwal-(pengurangan*hari));
				
			}
			jumlahTabungan+= tabunganBulan;
			System.out.println("Tabungan bulan ke : " +(bulan+1)+ " Rp :" + tabunganBulan);
			tabunganBulan = 0 ;
		}
		System.out.println(" Jumlah Tabungan :" +jumlahTabungan);


	}
}