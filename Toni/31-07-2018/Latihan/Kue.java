public class Kue{
	public static void main(String[] args){
		int kue = 200;
		int waktu = (int)((8.5 * 60)/15);

		do{
			kue -= 4;
			waktu--;
		}while(waktu > 0);

		System.out.print(kue);

	}
}