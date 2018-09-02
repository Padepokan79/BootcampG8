import java.util.HashMap;

public interface Umk {
	@SuppressWarnings("serial")
	HashMap<String, Double> tarifUmk = new HashMap<String, Double>(){{
		put("bandung", 3091345.0);
		put("jakarta", 3648035.0);
		put("karawang", 3919291.0);
		put("surabaya", 3583312.0);
	}};
}
