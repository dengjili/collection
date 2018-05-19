package collection.dengjili.foreach;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {

	public static void main(String[] args) {
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "I Love you alwys".split(" "));
		
		for (String string : cs) {
			System.out.println(string);
		}
	}

}
