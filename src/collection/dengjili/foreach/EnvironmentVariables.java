package collection.dengjili.foreach;

import java.util.Map;

public class EnvironmentVariables {

	public static void main(String[] args) {
		Map<String, String> getenv = System.getenv();
		
		for (Map.Entry<String, String> entry : getenv.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
