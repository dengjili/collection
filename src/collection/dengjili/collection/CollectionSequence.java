package collection.dengjili.collection;

import java.util.AbstractCollection;
import java.util.Iterator;

import collection.dengjili.iterator.InterfaceVsIterator;

public class CollectionSequence extends AbstractCollection<Integer>{

	private int[] ints = {1,2,3,3,4,5,6,6,7,777};
	

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			//每次调用该方法，下标置为0
			private int index = 0;
			
			@Override
			public boolean hasNext() {
				if (ints.length > index) {
					return true;
				}
				
				return false;
			}

			@Override
			public Integer next() {
				if (hasNext()) {
					return ints[index++];
				}
				return null;
			}
		};
	}

	@Override
	public int size() {
		return ints.length;
	}

	public static void main(String[] args) {
		CollectionSequence sequence = new CollectionSequence();
		Iterator<Integer> iterator = sequence.iterator();
		InterfaceVsIterator.display(iterator);
	}
}
