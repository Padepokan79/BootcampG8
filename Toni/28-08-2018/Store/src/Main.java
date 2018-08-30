import java.util.*;
public class Main {
	public static void main(String[] args) {
		GoodsSGA toy1 = new ToySG("Lego", 70000, 6, 100);
		GoodsSGA toy2 = new ToySG("Hot Wheels", 30000, 6, 72);
		GoodsSGA book1 = new BookSG("Map of Meaning", 100000, "Jordan Peterson", 10);
		GoodsSGA book2 = new BookSG("12 Rules of life", 200000, "Jordan Peterson", 30);
		GoodsSGA food1 = new FoodSG("Sushi", 20000, 6, 132);
		GoodsSGA food2 = new FoodSG("Dorayaki", 40000, 33, 300);
		GoodsSGA toiletery1 = new ToileterySG("Toilet Paper", 8000, "Paper", 121);
		GoodsSGA toiletery2 = new ToileterySG("Soap", 12000, "Liquid", 88);
		
		ArrayList<GoodsSGA> stock = new ArrayList<GoodsSGA>();
		
		stock.add(toy1);
		stock.add(toy2);
		stock.add(book1);
		stock.add(book2);
		stock.add(food1);
		stock.add(food2);
		stock.add(toiletery1);
		stock.add(toiletery2);
		
		for(GoodsSGA barang : stock) {
			System.out.println(barang.toString());
		}
		
	}
	
	
}
