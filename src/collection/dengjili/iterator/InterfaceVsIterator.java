package collection.dengjili.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InterfaceVsIterator {

	public static void main(String[] args) {
		List<String> baseList = Arrays.asList("1", "2", "2", "3", "4");
		List<String> valueList = Arrays.asList("a", "b", "c", "d", "e");
		List<String> list = new ArrayList<String>(baseList);
		Set<String> set = new HashSet<String>(baseList);
		
		Map<String, String> map = new HashMap<String, String>();
		for (Iterator<String> itKey = baseList.iterator(), itValue = valueList.iterator(); itKey.hasNext() && itValue.hasNext();) {
			map.put(itKey.next(), itValue.next());
		}
		
		display(list);
		display(set);
		display(list.iterator());
		display(set.iterator());
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		display(map.values());
		display(map.values().iterator());
	}

	public static <E> void display(Iterator<E> it) {
		while (it.hasNext()) {
			E e = it.next();
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static <E> void display(Collection<E> it) {
		for (E e : it) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
