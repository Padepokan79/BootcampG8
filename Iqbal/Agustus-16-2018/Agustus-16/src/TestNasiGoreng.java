//Author : Muhamad Iqbal FM , 16 Agustus 2018 

public class TestNasiGoreng {
	public static void main(String[] args) {
		int[][] array = {{2500,1500,1000,2000,1000,700} , {2500 , 1800 , 1500 , 2000 , 1000 , 800} , {2500 , 1800 , 1000 ,3000,1200,1000} , {3000,1500,1800,3300,1500,1200}};
		for(int index = 0 ; index < 4 ; index++) {
			//String varIn = String.valueOf(index);
			NasiGoreng ng =new NasiGoreng(array[index][0],array[index][1],array[index][2],array[index][3],array[index][4],array[index][5]); 
			ng.tampilHarga();
		}
		
	}
	
}
