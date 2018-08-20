/*
 * Author Muhammad Sultoni
 * 20 Agustus 2018
 * 10:00 AM
 */
public class Account {
	String owner;
	int id;
	double balance = 0;
	
	Account(int id, String owner, double deposit){
		this.id = id;
		this.owner = owner;
		balance += deposit;
	}
	
	void check(){
		System.out.println("====================");
		System.out.println("ID\t: "+id);
		System.out.println("A/N\t: "+owner);
		System.out.println("Balance\t: "+balance);
	}
	
	void deposit(double amount) {
		balance += amount;
		System.out.println("Balance Increased to "+balance);
	}
	
	void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Balance Withdrawed succesfully.");
			System.out.println("Balance Left "+balance);
		}else {
			System.out.println("Balance not enough.");
		}
	}
}
