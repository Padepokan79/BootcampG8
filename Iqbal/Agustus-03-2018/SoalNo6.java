public class SoalNo6{
   public static void main(String[] args) {
      int kolom = 5 , baris = (kolom*2)-1 ;
      
      
      for(int jumlah = 0 ; jumlah < kolom ; jumlah++){
         for(int jumlah1 =0 ; jumlah1 < baris ; jumlah1++){
            if(jumlah1 == (kolom-jumlah)-1 || jumlah1 == (kolom+jumlah)-1){
               System.out.print("*");
            }
            else{
               System.out.print("-");
            }
         }
         System.out.println();
      }
      for(int jumlah = kolom-1 ; jumlah >= 0 ; jumlah--){
         for(int jumlah1 =0 ; jumlah1 < baris ; jumlah1++){
            if(jumlah1 == (kolom-jumlah)-1 || jumlah1 == (kolom+jumlah)-1){
               System.out.print("*");
            }
            else{
               System.out.print("-");
            }
         }
         System.out.println();
      }
   }
}