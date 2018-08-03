public class Kue{
	public static void main(String[] args){
		int kue = 200;
		int waktu = (int)((8.5 * 60)/15);

		while(waktu > 0){
			kue -= 4;
			waktu--;
		}

		System.out.print(kue);

	}
}