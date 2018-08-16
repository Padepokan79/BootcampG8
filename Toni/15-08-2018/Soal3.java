import java.util.*;
public class Soal3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String temp;
		String[][] keyword = {{"Jumlah", "Lama"},{"Keluarga", "Tabungan"}};
		int valid = 0;
		int[] answer = new int[2];
		int[][] hilow = {{2, 6}, {2, 12}};

		for (int questions = 0; questions < keyword[0].length; questions++) {
			valid = 0;	
			do{
				System.out.print("Masukan "+keyword[0][questions]+" "+keyword[1][questions]+" : ");
				temp = input.next();
				if (!temp.matches("[0-9]+")) {
					System.out.println("Maaf, input yang diterima hanya berupa angka.\nSilahkan input kembali.\n");
				}else{
					answer[questions] = Integer.parseInt(temp);
					if(answer[questions] < hilow[questions][0]){
						System.out.println("Maaf, "+keyword[0][questions]+" "+keyword[1][questions]+" tidak boleh kurang dari "+hilow[questions][0]+".\nSilahkan input kembali.\n");
					}else if(answer[questions] > hilow[questions][1]){
						System.out.println("Maaf, "+keyword[0][questions]+" "+keyword[1][questions]+" tidak boleh lebih dari "+hilow[questions][1]+".\nSilahkan input kembali.\n");
					}else{
						valid = 1;
					}
				}
			}while(valid != 1);
		}

		tabungan(answer[0], answer[1]);
			
	}

	public static void tabungan(int anggota, int bulan){
		int[] hari = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, totalbulanan = new int[bulan];
		int total = 0, temp;

		for (int bulanke = 0; bulanke < bulan; bulanke++) {
			temp = hari[bulanke];
			for (int harike = 0; harike < hari[bulanke]; harike++) {
				totalbulanan[bulanke] += temp*anggota*1000;
				//System.out.print(temp+" ");
				temp--;
			}
			System.out.println("Tabungan Bulan Ke-"+(bulanke+1)+" : "+totalbulanan[bulanke]);
			total += totalbulanan[bulanke];
		}
		System.out.println("\nTotal Tabungan Selama "+bulan+" Bulan dengan "+anggota+" Anggota adalah : "+total);
	}
}