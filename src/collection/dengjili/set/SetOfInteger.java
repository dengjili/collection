package collection.dengjili.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {

	public static void main(String[] args) {
		Random random = new Random(47);
		
		//HashSet”ÎTreeSet≈≈–Ú
		//LinkedHashSet≤Â»ÎÀ≥–Ú£¨≤ª≈≈–Ú
		Set<Integer> intset = new LinkedHashSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			intset.add(random.nextInt(30));
		}
		
		System.out.println(intset);
	}

}
