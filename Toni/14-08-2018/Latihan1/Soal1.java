public class Soal1{
	public static void main(String[] args){
		int[] numbers = {3, -4, 2, 1, 0, -8, -12, 11, 200, -34, 21};
		System.out.print("Negative : ");
		for (int index = 0; index < numbers.length; index++) {
			if(numbers[index] < 0) System.out.print(numbers[index]+" ");
		}
	}
}