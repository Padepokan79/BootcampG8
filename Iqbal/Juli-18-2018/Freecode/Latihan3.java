public class Latihan3{
	public static void main( String[] args){
		int hargaApel, hargaJeruk;
		int[] belanja1 = {2, 1, 3400}, belanja2 = {1, 2, 4100}, temp = {0,0,0};

		for(int i = 0; i < belanja1.length; i++){
			belanja1[i] = belanja1[i] * 2;
		}

		for(int i = 0; i < belanja1.length; i++){
			temp[i] = belanja1[i] - belanja2[i];
		}

		hargaApel = temp[2] / temp[0];
		hargaJeruk = (belanja2[2] - (belanja2[0] * hargaApel)) / belanja2[1];

		System.out.println(" Harga 1 Apel dan 1 Jeruk Rp." + (hargaApel+hargaJeruk));


	}
}

