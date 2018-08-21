/*
 * Author Muhammad Sultoni
 * 20 Agustus 2018
 * 09:00 AM
 */
public class Perusahaan {
	public static void main(String[] args) {
		String[] k1data1 = {"18-08-2000", "Bandung padalarang", "boss", "0031231421412", "089696682544", "tonyhazama@gmail.com"},
				k2data1 = {"18-08-1980", "Bandung Cibereum", "Manajer", "0112451321232", "0012321312", "iqbalmaul@gmail.com"};
		int[] k1data2 = {121213, 3}, k2data2 = {221213, 10};
		Karyawan[] ka = new Karyawan[3];
		
		ka[0] = new Karyawan("Muhammad Sultoni", k1data1, k1data2);
		ka[0].bio();
		ka[0].naik_jabatan();
		ka[0].bio();
		ka[0].naik_jabatan();
		ka[0].bio();
		
		ka[1] = new Karyawan("Iqbal Maulana", k2data1, k2data2);
		ka[1].bio();
		ka[1].naik_jabatan();
		ka[1].bio();
		ka[1].naik_jabatan();
		ka[1].bio();
	}
}
