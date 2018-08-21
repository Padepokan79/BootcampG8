
public class Bangun {
	double volume, luas;
	void calc(String bangun, int[] parameter) {
		switch(bangun) {
		case "balok":
			balok(parameter);
		break;
		case "kubus":
			kubus(parameter);
		break;
		case "bola":
			bola(parameter);
		break;
		case "tabung":
			tabung(parameter);
		break;
			
		}
	}
	
	void balok(int[] parameter) {
		if(parameter.length == 1) {
			volume = parameter[0] * parameter[0] * parameter[0];
			System.out.println("Volume : "+volume);
			luas = 6*(parameter[0] * parameter[0]);
			System.out.println("Luas   : "+luas);
		}else {
			System.out.println("Invalid Parameter !!");
		}
	}
	
	void kubus(int[] parameter) {
		if(parameter.length == 3) {
			volume = parameter[0] * parameter[1] * parameter[2];
			System.out.println("Volume : "+volume);
			luas = (2*(parameter[0] * parameter[1]))+(2*(parameter[0] * parameter[2]))+(2*(parameter[1] * parameter[2]));
			System.out.println("Luas   : "+luas);
		}else {
			System.out.println("Invalid Parameter !!");
		}
	}
	
	void bola(int[] parameter) {
		if(parameter.length == 1) {
			volume = 1.3333 * (3.1428  * (parameter[0]*parameter[0]*parameter[0]));
			System.out.println("Volume : "+volume);
			luas = 4 * (3.1428 * (parameter[0]*parameter[0]));
			System.out.println("Luas   : "+luas);
		}else {
			System.out.println("Invalid Parameter !!");
		}
	}
	
	void tabung(int[] parameter) {
		if(parameter.length == 2) {
			volume =  ((3.1428  * (parameter[0] * parameter[0]))*parameter[1]);
			System.out.println("Volume : "+volume);
			luas =  2 * (3.1428  * (parameter[0]*parameter[0])) + 2 * ((3.1428  * parameter[0])*parameter[1]);
			System.out.println("Luas   : "+luas);
		}else {
			System.out.println("Invalid Parameter !!");
		}
	}
}
