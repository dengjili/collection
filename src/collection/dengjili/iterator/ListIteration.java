package collection.dengjili.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(10);
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String string = listIterator.next();
			System.out.println(string + ", " + listIterator.previousIndex() + ", " + listIterator.nextIndex());
		}
		System.out.println();
		while (listIterator.hasPrevious()) {
			
			String string = listIterator.previous();
			System.out.println(string);
		}
		
		ListIterator<String> listIterator2 = list.listIterator(3);
		while (listIterator2.hasNext()) {
			String string = listIterator2.next();
			System.out.println(string + ", " + listIterator2.previousIndex() + ", " + listIterator2.nextIndex());
		}

	}

}
