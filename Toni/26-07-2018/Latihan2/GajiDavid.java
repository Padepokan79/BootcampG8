public class GajiDavid{
	public static void main(String[] args){
		int gajiAwal = 3000000, kenaikanGaji = (gajiAwal*10)/100, gajiTahun = gajiAwal, lamaBekerja = 2026 - 2014, totalGaji = 0;


		while(lamaBekerja > 0){
			totalGaji += 12 * gajiTahun;
			gajiTahun += kenaikanGaji;
			lamaBekerja--;
		}

		System.out.print(totalGaji);

	}
}