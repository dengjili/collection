package collection.dengjili.generator;

import java.util.Iterator;

import collection.dengjili.generator.adapter.MapData;
import collection.dengjili.generator.adapter.StringGenerator;

class Letter implements Generator<Pair<Integer, String>>, Iterable<Integer>{

	private int number = 1;
	private char letter = 'A';
	
	@Override
	public Pair<Integer, String> next() {
		return new Pair<Integer, String>(number++, letter++ + "");
	}

	private int size = 10;
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			@Override
			public boolean hasNext() {
				return number <= size;
			}
			@Override
			public Integer next() {
				return number++;
			}
		};
	}

}

public class MapDataTest {
	public static void main(String[] args) {
		MapData<Integer, String> map = new MapData<Integer, String>(new Letter(), 11);
		System.out.println(map);
		
		map = new MapData<Integer, String>(new Letter(), new StringGenerator());
		System.out.println(map);
	}
}