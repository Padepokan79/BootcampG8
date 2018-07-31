import java.util.*;
import java.util.Scanner;

public class Soal3 {
	int deret=Integer.parseInt(JOptionPane.showInputDialog("Masukan Deret Fibonacci: "));
	int a = 0;
	int b = 1;
	System.out.print(deret+ " deret Fibonacci : " );
	for (int i=0; i<deret; i++);
		System.out.print(a+" " );
		a = a+b;
		b = a-b;
	}
	
}