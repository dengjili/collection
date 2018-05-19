package collection.dengjili.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ReversibleArrayList<E> extends ArrayList<E> {
	
	private static final long serialVersionUID = 3903173218464497521L;
	
	

	public ReversibleArrayList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReversibleArrayList(Collection<? extends E> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public ReversibleArrayList(int initialCapacity) {
		super(initialCapacity);
		// TODO Auto-generated constructor stub
	}
	
	public Iterable<E> reversed() {
		return new Iterable<E>() {

			@Override
			public Iterator<E> iterator() {
				return new Iterator<E>() {

					int index = size() - 1;
					
					@Override
					public boolean hasNext() {
						return index >= 0;
					}

					@Override
					public E next() {
						if (hasNext()) {
							return get(index--);
						}
						return null;
					}
				};
			}

		};
	}

	public Iterator<E> revers() {
		return new Iterator<E>() {

			int index = size() - 1;
			
			@Override
			public boolean hasNext() {
				return index >= 0;
			}

			@Override
			public E next() {
				if (hasNext()) {
					return get(index--);
				}
				return null;
			}
		};
	}
	
	public static void main(String[] args) {
		ReversibleArrayList<String> list = new ReversibleArrayList<String>(Arrays.asList("I Love you momo".split(" ")));
		
		for (String string : list) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		
		for (String string : list.reversed()) {
			System.out.print(string + " ");
		}
	}
}
