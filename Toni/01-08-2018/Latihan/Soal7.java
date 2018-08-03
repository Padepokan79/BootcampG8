public class PindahkanArray{
	public static void main(String[] args){
		int[] arr1 = {25, 14, 56,15,36,56,77,18,29,49}, arr2 = new int[10];
		
		int index = 0;
		for(int angka : arr1){
			arr2[index] = angka;
			index++;
		}

		System.out.print("arr1 : {");	
		for(int angka : arr1){
			System.out.print(angka+" ");
		}
		System.out.print("}\n");

		System.out.print("arr2 : {");	
		for(int angka : arr2){
			System.out.print(angka+" ");
		}
		System.out.print("}\n");
	}
}