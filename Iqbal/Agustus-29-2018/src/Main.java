import java.util.ArrayList;
public class Main {
	public static void main(String[]args) {
		ArrayList<GoodsSGA> jenis = new ArrayList<GoodsSGA>();
		GoodsSGA satu = new FoodsSG("Makanan", 15000, 2);
		satu.tampilString();
		GoodsSGA dua = new ToySG("Naruto",200000 , 10 , 12);
		dua.tampilString();
		GoodsSGA tiga = new BookSG("Nopel", 24000, 122, "Aku");
		tiga.tampilString();
		jenis.add(satu);
		jenis.add(dua);
		jenis.add(tiga);
		
		for (GoodsSGA goodsSGA : jenis) {
			goodsSGA.tampilString();
		}
	}
}
