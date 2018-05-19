package collection.dengjili.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortTest {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		Collections.addAll(set, "Cc", "Bb", "Aa", "c", "b", "a");

		System.out.println(set);
	}

}
