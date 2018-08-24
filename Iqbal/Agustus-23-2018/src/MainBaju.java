
public class MainBaju {
	public static void main(String[] args) {
		Baju b = new Baju("Adidos" , "Katun" , "Hitam" ,"XL",150000);
		b.tampil();
		Kemeja k = new Kemeja("Naiki", "Flanel" , "Biru" , "L" , 200000 , "Plastik");
		k.tampil();
		Jas j = new Jas("biruBerry" , "Katun" , "Coklat" , "38" , 500000 , "Kupu-Kupu");
		j.tampil();
	}
}
