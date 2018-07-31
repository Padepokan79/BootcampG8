public class Kue{
	public static void main(String[] args){
		int kue = 200;
		int waktu = (int)((8.5 * 60)/15);

		for(; waktu > 0; waktu --){
			kue -= 4;
		}

		System.out.print(kue);

	}
}