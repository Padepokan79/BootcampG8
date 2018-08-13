public class CopyArray {
 
 public static void main(String args []){
  
  int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 28, 29, 49};
  
  int [] arr2 = new int[10];
  
  arr2 = new int[arr1.length];
  for (int i = 0; i < arr1.length; i++) {
  arr2[i] = arr1[i];
  }

   System.out.println("Arr2 sekarang adalah : " );
  
   for (int i = 0; i < arr1.length; i++){
    
    System.out.print("["+ arr2[i] + "]" + " " );
    
   }
   
   System.out.println();
   arr1[0] = 100;
   
   for (int i = 0; i < arr2.length; i++){
    
     System.out.print("["+ arr2[i] + "]" + " " );
     
  }
   
   
  
 }

}