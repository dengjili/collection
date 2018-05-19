package collection.dengjili.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MultiIterableClass extends IterableClass {
	public Iterable<String> reversed() {
		return new Iterable<String>() {

			@Override
			public Iterator<String> iterator() {
				return new Iterator<String>() {

					int index = words.length - 1;
					
					@Override
					public boolean hasNext() {
						return index >= 0;
					}

					@Override
					public String next() {
						if (hasNext()) {
							return words[index--];
						}
						return null;
					}
				};
			}

		};
	}
	
	public Iterable<String> randomized() {
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled);
				return shuffled.iterator();
			}
		};
	}
	
	public static void main(String[] args) {
		MultiIterableClass multiIterableClass = new MultiIterableClass();
		for (String string : multiIterableClass) {
			System.out.println(string);
		}
		for (String string : multiIterableClass.reversed()) {
			System.out.println(string);
		}
		for (String string : multiIterableClass.randomized()) {
			System.out.println(string);
		}
	}
}
