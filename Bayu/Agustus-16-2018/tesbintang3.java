public class tesbintang3 {
    public static void main(String [] args){
        int x=3;
        for (int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=3;i++){
            for(int j=2;j>=i;j--){ 
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){ 
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}