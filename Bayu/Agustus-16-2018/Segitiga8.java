public class Segitiga8 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int k = 3; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}