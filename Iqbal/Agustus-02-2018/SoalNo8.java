public class SoalNo8{
	public static void main(String[] args) {
		int[] fibonacci = new int[16];
		int angka1 = 1 , angka2 = 1 ;
		fibonacci[0] = angka1;
		fibonacci[1] = angka1;
		int[] arrayPrima = new int[6];
		int[] arraySisa = new int[10];
		for(int index = 2 ; index < fibonacci.length ; index++){
			int nilaiFibonacci = angka1+angka2;
			angka1 = angka2 ;
			angka2 = nilaiFibonacci;
			fibonacci[index] = nilaiFibonacci;
		}
		System.out.println("Bilangan Fibonacci ");
		//System.out.println(fibonacci.length);
		for(int tampil = 0 ; tampil < fibonacci.length ; tampil++){
			
			System.out.print(fibonacci[tampil]+" ");
		}
		int indexArrayPrima = 0;
		int indexArraySisa = 0 ;
		for(int indexFibonacci = 0 ; indexFibonacci< fibonacci.length ; indexFibonacci++){
			//System.out.println(fibonacci[indexFibonacci]);
			
			if(fibonacci[indexFibonacci] == 2 ||fibonacci[indexFibonacci] == 13 ||fibonacci[indexFibonacci] == 29 || fibonacci[indexFibonacci] == 3 || fibonacci[indexFibonacci] == 5 || fibonacci[indexFibonacci] == 7 || (fibonacci[indexFibonacci] % 2 != 0 && fibonacci[indexFibonacci] % 3 != 0 && fibonacci[indexFibonacci] % 5 != 0 && fibonacci[indexFibonacci] % 7 != 0 && fibonacci[indexFibonacci] % 13 != 0  && fibonacci[indexFibonacci] % 29 != 0 &&   fibonacci[indexFibonacci] != 1) ){
				arrayPrima[indexArrayPrima] = fibonacci[indexFibonacci];
				indexArrayPrima++;
			}
			else{
				arraySisa[indexArraySisa] = fibonacci[indexFibonacci];
				indexArraySisa++;
			}
		}
		System.out.println("Bilangan Prima");
		for(int tampilPrima = 0 ;  tampilPrima<arrayPrima.length ; tampilPrima++){
			System.out.println(arrayPrima[tampilPrima]);
		}
		System.out.println("Bilangan Sisa Prima");
		for(int tampilSisa = 0 ;  tampilSisa<arraySisa.length ; tampilSisa++){
			System.out.println(arraySisa[tampilSisa]);
		}

	}
}