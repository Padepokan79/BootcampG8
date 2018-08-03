/*
Author : Muhamad Iqbal Farhan Maulana 
*/

public class Kue {
	public static void main(String [] args){
		int kue = 200 , jam =  4*8+2 , jual = 4; 
		for(int berhasil = 0 ; berhasil < jam ; berhasil ++){
			kue -= jual ;
		}
		System.out.println("Sisa kue =" + kue);

	}
}

