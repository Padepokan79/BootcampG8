import java.util.Scanner;
public class SoalNo2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan Jumlah Baris Yang di inginkan");
		String baris = input.next();
        

		while(!baris.matches("[0-9]+")){
			System.out.println("Maaf , input yang diterima berupa angka");
			System.out.print("Silahkan Input lagi : ");
			baris = input.next();
		}

		int jumlah = Integer.parseInt(baris);
		while(jumlah<2 && jumlah > 20 );
        {
            if(jumlah<2){
                System.out.println("Maaf , jumlah baris tidak boleh kurang dari 2");
                System.out.print("Silahkan Input lagi : ");
                baris = input.next();
                jumlah = Integer.parseInt(baris);
            }
            if(jumlah>20){
                System.out.println("Maaf , jumlah urutan angka tidak boleh lebih dari 20");
                System.out.print("Silahkan Input lagi : ");
                baris = input.next();
                jumlah = Integer.parseInt(baris);
            }
            
        }
        int arr[][] = new int[jumlah][jumlah];
		for(int satu = 0 ; satu<arr.length ; satu++){
            arr[satu][0] = 1;
        }

        for(int index = 1 ; index < arr.length ; index++){
            for(int samping = 1 ; samping < arr.length ; samping++){
                arr[index][samping] = arr[index-1][samping-1]+arr[index-1][samping];
            }
        }

        

		for(int index = 0 ; index<jumlah ; index++){
			for(int ulang = 0 ; ulang < index+1 ; ulang++){
				System.out.print(arr[index][ulang]);
			}
			System.out.println();
		}	
	}
}