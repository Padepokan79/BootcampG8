public class SoalNo30{
	public static void main(String[] args) {
		for(int angka = 6 ; angka > 0 ; angka--){
			for(int ulang = angka ; ulang > 0 ; ulang--){
				if(angka % 2 == 1){
					System.out.print(angka);
				}
				else{
					System.out.print(ulang);
				}
			}
		}
	}
}