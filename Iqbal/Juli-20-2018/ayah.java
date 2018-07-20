/* ayah iingin membeli burung dengan sfesifikasi berkicau 3x warna merah campur biru harga 300 rb
   setiap ada yang bisa berkicau 2x lebih dari sehari ayah bisamembeli 1,5x / 2x tambahan kicau dari harga yang ditawarkan keatas
 */
   import java.util.Scanner ;
   public class ayah {
   	public static void main(String[] args){
   		Scanner input = new Scanner(System.in);
   		System.out.println(" Silahlkan Masukan kicauan ");
   		int kicau = input.nextInt();
   		System.out.println("Silahkan Masukan Warna 1" );
   		String warna1 = input.next();
   		System.out.println("Silahkan Masukan Warna 2");
   		String warna2 = input.next();
   		if(kicau <= 2){
   			System.out.println("Gagal Membeli");
   		}
   		else if(kicau >= 3 && kicau <=5 ){
   			if(warna1.equals("merah") && warna2.equals("biru")){
   				System.out.println("Burung saya beli dengan harga 150 ribu");
   			}
   			else{
   				System.out.println("Gagal beli");
   			}
   		}
   		else if(kicau >=6 ){
            if(warna1.equals("merah") && warna2.equals("biru")){
               System.out.println("Burung saya beli dengan harga 300 ribu");
            }
            else{
               System.out.println("Gagal beli");
            }  
         }
   	}
   }