public class Soal1{
	public static void main(String[] args){
		int[] arr1 = {25, 14, 56,15,36,56,77,18,29,49}, arr2 = new int[10];
		
		int total = 0, index = 0;
		double rata;
		for(int angka : arr1){
			arr2[index] = angka;
			total += angka;
			index++;
		}

		rata = (double)total / arr1.length;

		System.out.println("Total     : "+total);
		System.out.println("Rata-Rata : "+rata);

		
	}
}