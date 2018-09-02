import java.util.HashMap;
public interface Tunjangan {
	double hargaBeras = 100000;
	HashMap<Integer , Double> tunjanganUmum = new HashMap<Integer , Double>();
	HashMap<Integer , Double> tunjanganStruktur = new HashMap<Integer , Double>();
	HashMap<String , Double> tunjanganPapua = new HashMap<String , Double>();
	void setTunjanganUmum(String pilih);
	void setTunjanganStruktur(String pilih);
	void setTunjanganFungsi(String pilih);
	void setTunjanganPapua(String pulau);
	double getTunjanganPapua();
	double getTunjanganFungsi();
	double getTunjanganStruktur();
	double getTunjanganUmum();
	double getTunjanganPasangan();
	double getTunjanganPPH();
}
