public class GajiDavid{
	public static void main(String[] args){
		int gajiAwal = 3000000, kenaikanGaji = (gajiAwal*10)/100, gajiTahun = gajiAwal, lamaBekerja = 2026 - 2014, totalGaji = 0;


		for(; lamaBekerja > 0; lamaBekerja --){
			totalGaji += 12 * gajiTahun;
			gajiTahun += kenaikanGaji;
		}

		System.out.print(totalGaji);

	}
}