
public interface Potongan {
	double tarifBPJSkes = 0.05, tarifBPJSket = 0.05;
	double tarifPph = 0.05;
	
	double potonganBPJSkes();
	double potonganBPJSket();

	abstract double hitungPph();
	abstract double hitungPkp();
	abstract double hitungPtkp();
}
