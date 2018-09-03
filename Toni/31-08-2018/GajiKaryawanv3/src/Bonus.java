import java.util.HashMap;

public interface Bonus {
	@SuppressWarnings("serial")
	HashMap<String, Double> tarifBonus = new HashMap<String, Double>(){{
		put("programmer", 20000.0);
		put("tester", 25000.0);
		put("technical writer", 35000.0);
	}};
	@SuppressWarnings("serial")
	HashMap<String, Integer> batasBonus = new HashMap<String, Integer>(){{
		put("programmer", 1);
		put("tester", 100);
		put("technical writer", 1);
	}};
	double maxBonus = 500000.0;
	double hitungBonus();
}
