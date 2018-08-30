import java.util.HashMap;
public interface Potongan {
	HashMap<Integer , Double> taperum = new HashMap<Integer , Double>();
	void setPotonganBeras(String pilih);
	void setPotonganSewaRumah(String pilih);
	void setPotonganTaperum();
	double getPotonganBeras();
	double getPotonganIWP();
	double getPotonganPPH();
	double getPotonganSewaRumah();
	double getPotonganTaperum();

}
