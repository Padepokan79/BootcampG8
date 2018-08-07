import java.util.*;

public class GajiPNS{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		/*int[][][] gaji = {
			//Golongan I
			{
				{"1.486.500", "1.533.400", "1.581.700", "1.631.500", "1.682.900", "1.735.900", "1.790.500", "1.846.900"}, 
				{}, 
				{}, 
				{}
			},
			//Golongan II
			{{}, {}, {}, {}},
			//Golongan III
			{{}, {}, {}, {}},
			//Golongan IIII
			{{}, {}, {}, {}}
		};*/
		int[][] gaji = {
			//Golongan I
			{1486500, 1623400, 1692100, 1763600},
			//Golongan II
			{1926000, 2103300, 2192300, 2285000},
			//Golongan III
			{2456700, 2560600, 2668900, 2781800},
			//Golongan IIII
			{2899500, 3022100, 3149900, 3283200, 3422100}
		};
		int net = 0, mkg, anak;
		int[] tunjangan = {175000, 0, 0}, potongan = new int[3], pendapatan = new int[2];
		String golongan, nama, menikah;

		System.out.print("Masukan Nama anda ");
		nama = input.nextLine();
		System.out.print("Masukan Golongan (I/a - IV/e) ");
		golongan = input.nextLine();
		System.out.print("Masukan Masa Kerja Golongan ");
		mkg = input.nextInt();
		System.out.print("Apakah anda sudah menikah (y/n) ");
		menikah = input.next();
		System.out.print("Berapa jumlah anak anda ");
		anak = input.nextInt();

		
		String[] gol = golongan.split("/");
		
		if (gol[0].equals("I")) {
			if (gol[1].equals("a")) {
				net = gaji[0][0];
			}else if (gol[1].equals("b")) {
				mkg -= 3;
				net = gaji[0][1];
			}else if (gol[1].equals("c")) {
				mkg -= 3;
				net = gaji[0][2];
			}else if (gol[1].equals("d")) {
				mkg -= 3;
				net = gaji[0][3];
			}	
		}else if (gol[0].equals("II")) {
			tunjangan[0] += 5000;
				mkg -= 3;
			if (gol[1].equals("a")) {
				mkg += 3;
				net = gaji[1][0];
			}else if (gol[1].equals("b")) {
				net = gaji[1][1];
			}else if (gol[1].equals("c")) {
				net = gaji[1][2];
			}else if (gol[1].equals("d")) {
				net = gaji[1][3];
			}	
		}else if (gol[0].equals("III")) {
			tunjangan[0] += 10000;
			if (gol[1].equals("a")) {
				net = gaji[2][0];
			}else if (gol[1].equals("b")) {
				net = gaji[2][1];
			}else if (gol[1].equals("c")) {
				net = gaji[2][2];
			}else if (gol[1].equals("d")) {
				net = gaji[2][3];
			}	
		}else if (gol[0].equals("IV")) {
			tunjangan[0] += 15000;
			if (gol[1].equals("a")) {
				net = gaji[3][0];
			}else if (gol[1].equals("b")) {
				net = gaji[3][1];
			}else if (gol[1].equals("c")) {
				net = gaji[3][2];
			}else if (gol[1].equals("d")) {
				net = gaji[3][3];
			}else if (gol[1].equals("e")) {
				net = gaji[3][4];
			}	
		}


		if (mkg >= 0 && golongan.matches("(.*)/(.*)")) {
			for (int kenaikan = (mkg/2); kenaikan > 0; kenaikan--) {
				net += (net*315)/10000;
			}

			//tunjangan istri & anak
			if (menikah.equals("y")){
				tunjangan[1] = (net/10);
				tunjangan[2] = (anak*((net/100)*2));
			} 
			
			//Pendapatan kotor
			pendapatan[0] = net+tunjangan[0]+tunjangan[1]+tunjangan[2];

			//Potongan jabatan, iuran
			potongan[0] = (net/20);
			potongan[1] = (pendapatan[0]*475)/10000;

			//Pendapatan kotor
			pendapatan[1] = pendapatan[0] - (potongan[0] + potongan[1]);

			System.out.println("\n===============================");
			System.out.println(" Nama \t:  "+nama);
			System.out.println("-------------------------------");
			System.out.println(" Gaji Pokok\t: "+net);
			System.out.println(" Tunjangan Umum\t:  "+tunjangan[0]);
				System.out.println(" Tunjangan Istri:  "+tunjangan[1]); 
			System.out.println(" Tunjangan Anak\t:  " + tunjangan[2]); 
			System.out.println("-------------------------------");
			System.out.println(" Pengurangan   *** ");
			System.out.println(" Biaya Jabatan\t: "+potongan[0]);
			System.out.println(" Iuran Pensiun\t: "+potongan[1]);
			System.out.println("-------------------------------");
			System.out.println(" Penghasilan   *** ");
			System.out.println(" Kotor\t\t: "+(pendapatan[0]));
			System.out.println(" Bersih\t\t: "+(pendapatan[1]));
			System.out.println("===============================");
		}else{
			System.out.println("Invalid Input");
		}
	}
} 