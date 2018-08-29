
public class Store {
	public static void main(String[] args) {
		GoodsSGA lego = new ToySG("This is Lego", 20000, 6, 100);
		GoodsSGA mom = new BookSG("Map of Meaning", 100000, "Jordan Peterson", 10);
		GoodsSGA sushi = new FoodSG("Sushi is raw fish", 20000, 6, 100);
		GoodsSGA toiletPaper = new ToileterySG("This Toilet Paper", 20000, "Paper", 100);
		
		System.out.println(lego.toString());
		System.out.println(mom.toString());;
		System.out.println(sushi.toString());;
		System.out.println(toiletPaper.toString());;
	
	}
	
	
}
