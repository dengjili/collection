package collection.dengjili.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

	public static void main(String[] args) {
		Random random = new Random();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < 10000; i++) {
			int r = random.nextInt(10);
			Integer integer = map.get(r);
			
			Integer value = integer == null ? 1 : integer + 1;
			map.put(r, value);
		}
		System.out.println(map);
	}

}
