import static java.lang.System.*;
import java.util.Scanner;

public class Travel79{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int  orang, budget, hari, ruanghotel, recomend, change;
		int[] lombok = {2170000, 225000, 75000, 250000}, 
		bangkok = {3780000, 305000, 55000, 300000}, 
		singapura = {1200000, 335000, 85000, 360000},
		tokyo = {4760000, 355000, 105000, 325000},
		subtotal = {0,0,0,0};
		String optional;
		String[] tujuan = {"lombok", "bangkok", "singapura", "tokyo"};

		out.print("Masukan Jumlah Orang : ");
		orang = input.nextInt();

		out.print("Masukan Jumlah Hari : ");
		hari = input.nextInt();

		out.print("Masukan Jumlah Budget : ");
		budget = input.nextInt();

		out.print("Apakah kamu ingin mengikuti kegiata Opsional? (Y/N) ");
		optional = input.next();
		if (optional != "Y") {
			lombok[3] = 0;
			bangkok[3] = 0;
			singapura[3] = 0;
			tokyo[3] = 0;
		}

		ruanghotel = orang;
		if (orang % 2 == 1) ruanghotel = orang+1;

		lombok[0] = lombok[0] * orang;
		lombok[1] = lombok[1] * (ruanghotel/2);
		lombok[2] = (lombok[2] * orang) * hari;
		lombok[3] = lombok[3] * orang;
		subtotal[0] = lombok[0] + lombok[1] + lombok[2] + lombok[3];

		bangkok[0] = bangkok[0] * orang;
		bangkok[1] = bangkok[1] * (ruanghotel/2);
		bangkok[2] = (bangkok[2] * orang) * hari;
		bangkok[3] = bangkok[3] * orang;
		subtotal[1] = bangkok[0] + bangkok[1] + bangkok[2] + bangkok[3];

		singapura[0] = singapura[0] * orang;
		singapura[1] = singapura[1] * (ruanghotel/2);
		singapura[2] = (singapura[2] * orang) * hari;
		singapura[3] = singapura[3] * orang;
		subtotal[2] = singapura[0] + singapura[1] + singapura[2] + singapura[3];

		tokyo[0] = tokyo[0] * orang;
		tokyo[1] = tokyo[1] * (ruanghotel/2);
		tokyo[2] = (tokyo[2] * orang) * hari;
		tokyo[3] = tokyo[3] * orang;
		subtotal[3] = tokyo[0] + tokyo[1] + tokyo[2] + tokyo[3];
		//out.println("=================================");
		//out.println(subtotal[0]+" | "+subtotal[1]+" | "+subtotal[2]+" | "+subtotal[3]+" | ");
		//out.println("=================================");
		subtotal[3] = budget - subtotal[3] ; subtotal[2] = budget - subtotal[2] ; subtotal[1] = budget - subtotal[1] ; subtotal[0] = budget - subtotal[0] ;
		//out.println("=================================");
		//out.println(subtotal[0]+" | "+subtotal[1]+" | "+subtotal[2]+" | "+subtotal[3]+" | ");
		//out.println("=================================");


		if (subtotal[3] > 0) { recomend = 3; }
		else if(subtotal[1] > 0){ recomend = 1; }
		else if(subtotal[0] > 0){ recomend = 0; }
		else{ recomend = 2; }
			
		out.println("Rekomendasi tujuan anda dalah : "+tujuan[recomend]);
		out.println("Total harga : "+(budget-subtotal[recomend]));
		if (subtotal[recomend] < 0) {
			change =+subtotal[recomend];
			out.println("Kekurangan Dana : "+change);
		}
		

	}
}

/*
-Lombok-
tiket pesawat PP: 	Rp. 2.170.000,- per orang
hotel		: 	Rp. 255.000,- per malam per 2 orang
makan sehari	:	Rp. 75.000,- per hari per orang
Snorkling**	:	Rp. 250.000,- per orang
-Bangkok-
tiket pesawat PP: 	Rp. 3.780.000,- per orang
hotel		: 	Rp. 305.000,- per malam per 2 orang
makan sehari	:	Rp. 55.000,- per hari per orang
belanja**	:	Rp. 300.000,- per orang
-Singapura-
tiket pesawat PP: 	Rp. 1.200.000,- per orang
hotel		: 	Rp. 335.000,- per malam per 2 orang
makan sehari	:	Rp. 85.000,- per hari per orang
unvrsl studio**	:	Rp. 360.000,- per orang
-Tokyo-
tiket pesawat PP: 	Rp. 4.760.000,- per orang
hotel		: 	Rp. 355.000,- per malam per 2 orang
makan sehari	:	Rp. 105.000,- per hari per orang
ski**		:	Rp. 325.000,- per orang
*/