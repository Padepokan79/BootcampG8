/*
 * Author Muhammad Sultoni
 * 20 Agustus 2018
 * 10:00 AM
 */
import java.util.*;
public class Saving {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		String nama, menu;
		double start_balance, amount;
		
		System.out.print("Masukan Nama : ");
		nama = input.nextLine();
		
		System.out.print("Masukan Saldo Awal : ");
		start_balance = input.nextDouble();
		
		Account acc = new Account(001, nama, start_balance);
		
		do {
			System.out.print("Pilih Menu :\n1. Cek Saldo\n2. Deposit\n3. Withdraw\n(or exit)\n> ");
			menu = input.next();
			
			switch(menu.toLowerCase()) {
			case "1" :
				acc.check();
			break;
			case "2" :
				System.out.print("Enter the amount ");
				amount = input.nextDouble();
				acc.deposit(amount);
			break;
			case "3" :
				System.out.print("Enter the amount ");
				amount = input.nextDouble();
				acc.withdraw(amount);
			break;
			case "exit" :
				System.out.print("Goodbye");
			break;
			default :
				System.out.print("Invalid Input");
			}
		}while(!menu.toLowerCase().equals("exit"));
	}
}
