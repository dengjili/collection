package collection.dengjili.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class X implements Comparable<X>{
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

	@Override
	public int compareTo(X o) {
		
		String l = this.toString();
		String e = o.toString();
		
		return l == e ? 0 : (l.toCharArray()[0] > e.toCharArray()[0] ? 1 : -1);
	}
}
class A extends X {}
class B extends X {}
class C extends X {}
class D extends X {}
class E extends X {}
class F extends X {}

public class ListFeatures {

	public static void main(String[] args) {
		List<X> xs = new ArrayList<X>(4);
		xs.add(new A());
		xs.add(new B());
		xs.add(new C());
		xs.add(new D());
		System.out.println(xs);
		//测试容器自动增长
		E e = new E();
		xs.add(e);
		System.out.println(xs);
		System.out.println(xs.contains(e));
		System.out.println(xs.contains(new E()));
		
		xs.remove(e);
		System.out.println(xs);
		
		X x = xs.get(2);
		System.out.println(xs.indexOf(x));
		
		xs.add(2, e);
		System.out.println(xs);
		Collections.sort(xs);
		System.out.println(xs);
		
		List<X> subList = xs.subList(1, 4);
		System.out.println(subList);
		System.out.println(xs.containsAll(subList));
		
		Collections.shuffle(subList, new Random(47));
		System.out.println(subList);
		System.out.println(xs.containsAll(subList));
		
		List<X> copy = new ArrayList<X>(xs);
		System.out.println(copy);
		subList = Arrays.asList(xs.get(1), xs.get(4), new F());
		System.out.println(subList);
		copy.retainAll(subList);
		System.out.println(copy);
		System.out.println(xs);
		Collections.sort(xs);
		System.out.println(xs);
		xs.addAll(copy);
		System.out.println(xs);
		xs.removeAll(copy);
		System.out.println(xs);
		
	} 
}
