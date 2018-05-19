package collection.dengjili.foreach;

import java.util.Arrays;

public class ArrayIsNotIterable {
	
	public static <T> void test(Iterable<T> iterable) {
		for (T t : iterable) {
			System.out.print(t + " ");
		}
	}

	public static void main(String[] args) {
		test(Arrays.asList(1,2,3));
		String[] strings = {"A", "B", "C"};
		//test(strings);
		test(Arrays.asList(strings));
		
		for (String string : strings) {
			System.out.print(string + " ");
		}

	}

}
