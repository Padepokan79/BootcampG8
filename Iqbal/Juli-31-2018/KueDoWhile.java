/*
Author : Muhamad Iqbal Farhan Maulana 
*/

public class KueDoWhile {
	public static void main(String [] args){
		int kue = 200 , jam =  4*8+2 , jual = 4; 
		int berhasil = 0 ; 
		do{
			kue -= jual ;
			berhasil ++;
		}while(berhasil < jam );
		System.out.println("Sisa kue =" + kue);

	}
}

