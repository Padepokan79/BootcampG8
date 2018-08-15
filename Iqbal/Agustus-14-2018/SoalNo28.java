public class SoalNo28{
	public static void main(String[] args) {
		for(int angka = 1 ; angka < 6 ; angka++){
			for(int ulang = 1 ; ulang < angka+1 ; ulang++){
				if(angka%2 == 0){
					System.out.print(angka);
				}
				else{
					System.out.print(ulang);
				}
			}
		}
	}
}