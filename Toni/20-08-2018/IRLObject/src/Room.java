
public class Room {
	public static void main(String[] args) {
		int[] pc1Specs = {500000, 2048, 1024}, pc2Specs = {1000000, 1024, 256};
				
		Computer pc1 = new Computer("HP", "Probook", "Asus", pc1Specs);
		Computer pc2 = new Computer("Asus", "Chromebook", "Gigabyte", pc2Specs);

		pc1.bios();
		pc1.power("on");
		pc1.bios();
		pc1.power("off");
		pc1.bios();
		
		pc2.bios();
		pc2.power("on");
		pc2.bios();
		pc2.power("off");
		pc2.bios();
		
		String[] human1p = {"Black", "Caucasian"}, human2p = {"Blonde", "Americana"};
		int[] human1id = {18, 181, 80}, human2id = {21, 175, 55};
		
		Human dennis = new Human("Dennis", human1p, human1id);
		Human donna = new Human("Donna", human2p, human2id);
		
		dennis.introduce();
		dennis.wake();
		dennis.introduce();
		dennis.speak("I like Pink Floyd");
		
		donna.introduce();
		donna.wake();
		donna.introduce();
		donna.speak("I like Elton John");
		
		Door main = new Door("Chitose", "Green", 4, 10);
		
		main.open();
		main.lock();
		main.close();
		main.lock();
	}
}



