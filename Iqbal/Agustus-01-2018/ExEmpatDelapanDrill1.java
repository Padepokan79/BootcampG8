public class ExEmpatDelapanDrill1{
	public static void main(String[] args) {
		String[] planets ={"Mercury" , "Venus" , "Earth" , "Mars" , "Jupiter " , "Saturn" , "Uranus" , "Neptune"};
		String[] lessonn ={"Indonesia Language " , "English Language" , "Sains" , "Math"};
		for(String p : planets){
			System.out.println(p + "\t" + p.toUpperCase());
		}
		for(String l : lessonn){
			System.out.println(l + "\t" + l.toLowerCase());
		}
	}
}