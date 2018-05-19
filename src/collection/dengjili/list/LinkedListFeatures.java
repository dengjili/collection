package collection.dengjili.list;

import java.util.LinkedList;

public class LinkedListFeatures {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list.peek());
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		LinkedList<Integer> copy = new LinkedList<Integer>(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.peek());
		System.out.println(list.element());
		
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(copy);
		copy.addFirst(6);
		copy.add(7);
		System.out.println(copy);
		copy.offerFirst(8);
		copy.offer(9);
		System.out.println(copy);
		
	}

}
