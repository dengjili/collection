package collection.dengjili.foreach;

import java.util.Iterator;

import collection.dengjili.iterator.InterfaceVsIterator;

public class IterableClass implements Iterable<String> {

	protected String[] words = ("fuck you hahhaha !").split(" ");
	
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			int index = 0;
			
			@Override
			public boolean hasNext() {
				return words.length > index;
			}

			@Override
			public String next() {
				if (hasNext()) {
					return words[index++];
				}
				return null;
			}
		};
	}
	
	public static void main(String[] args) {
		IterableClass iterableClass = new IterableClass();
		//
		InterfaceVsIterator.display(iterableClass.iterator());
		//ʵ��Iterable�ӿڣ�ӵ��for-eachѭ��
		for (String string : iterableClass) {
			System.out.println(string);
		}
		
	}

}
