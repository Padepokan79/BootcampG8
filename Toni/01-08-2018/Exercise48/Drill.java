public class ArrayIntro{
	public static void main(String[] args){
		String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		String[] galaxy = {"Milky Way", "Andromeda", "Zeuzarian", "Gorgonite"};

		for(String p : planets){
			System.out.println(p+"\t"+p.toUpperCase());
		}

		for(String g : galaxy){
			System.out.println(g+"\t"+g.toUpperCase());
		}
	}
}