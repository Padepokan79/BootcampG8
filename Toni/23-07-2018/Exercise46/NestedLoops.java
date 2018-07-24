public class NestedLoops{
	public static void main(String[] args){
		for(int n=1; n <= 3; n++){
			for(char c='A'; c <= 'E'; c++){
				System.out.println(c+" "+n);
			}
		}

		System.out.println("\n");

		//this is #2 - I'll call it "AB"
		for(int a=1; a <= 3; a++){
			for(int b=1; b <= 3; b++){
				System.out.print("("+a+","+b+")");
			}
		}
		System.out.println("\n");
	}
}

//Drill 1: The inner variable change faster
//