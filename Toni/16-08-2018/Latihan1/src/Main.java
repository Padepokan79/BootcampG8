/* 	
 * Aurhor  : Muhammad Sultoni 
 * Created : 16-08-2018 
 */
public class Main {
	
	public static void main(String[] args) {
		//NasiGoreng[] harga = new NasiGoreng[4];
		int main;
		// Murid 1
		Student murid1 = new Student(801, "Tony Hazama", "Male");
		murid1.displayInformation();
		
		// Murid 2
		Student murid2 = new Student(802, "Iqbal Doflamingo", "Male");
		murid2.displayInformation();

		// Murid 3
		Student murid3 = new Student(803, "Bayu Bayu", "Male");
		murid3.displayInformation();
		
		//Person
		
		Person person1 = new Person();
		person1.age = 20;
		person1.name[0] = "Dina";
		person1.name[1] = "Rosita";
		person1.gender = "Female";
		person1.interest = "Reading";
		person1.bio();
		person1.greeting();
		
		Person person2 = new Person();
		person2.insertData(30, "Riko", "Sinatra", "Male","Singing");
		person2.bio();
		person2.greeting();
		
		Person person3 = new Person(10, "Dandi", "Soker", "Male", "Gaming");
		person3.bio();
		person3.greeting();
		
		System.out.println("HARGA NASI GORENG\n---------------");
		System.out.println("Minggu 1 : ");
		NasiGoreng minggu1 = new NasiGoreng(2500, 1500, 1000, 2000, 1000, 700);
		minggu1.tampilHarga();
		
		System.out.println("Minggu 2 : ");
		NasiGoreng minggu2 = new NasiGoreng(2500, 1800, 1500, 2000, 1000, 800);
		minggu2.tampilHarga();
		
		System.out.println("Minggu 3 : ");
		NasiGoreng minggu3 = new NasiGoreng(2500, 1800, 1000, 3000, 1200, 1000);
		minggu3.tampilHarga();
		
		System.out.println("Minggu 4 : ");
		NasiGoreng minggu4 = new NasiGoreng(3000, 1500, 1800, 3300, 1500, 1200);
		minggu4.tampilHarga();
		
	}
	
}
