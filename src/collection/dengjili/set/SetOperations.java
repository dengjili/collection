package collection.dengjili.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
		set1.add("M");
		
		System.out.println(set1);
		System.out.println(set1.contains("H"));
		System.out.println(set1.contains("N"));
		
		Set<String> set2 = new HashSet<String>();
		Collections.addAll(set2, "H I J K L".split(" "));
		System.out.println(set1.containsAll(set2));
		set1.remove("H");
		System.out.println(set1.containsAll(set2));
		System.out.println(set1);
		System.out.println(set2);
		
		Set<String> set1Copy = new HashSet<String>(set1);
		Set<String> set2Copy = new HashSet<String>(set2);
		
		set1.removeAll(set2);
		System.out.println(set1);
		
		System.out.println(set1Copy);
		System.out.println(set2Copy);
		set1Copy.retainAll(set2Copy);
		System.out.println(set1Copy);
	}

}