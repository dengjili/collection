package collection.dengjili.generator.adapter;

import java.util.Random;

import collection.dengjili.generator.Generator;

public abstract class AbstractGenerator<T> implements Generator<T> {

	protected Random random = new Random();
	
	protected Integer nextInteger(int begin, int end) {
		if (begin < 0) {
			throw new IllegalArgumentException("起始不能为负数");
		}
		
		int size = end - begin;
		return random.nextInt(size) + begin;
	}
	
	protected Character nextCharacter() {
		char c;
		boolean isUpper = random.nextDouble() > 0.5;
		if (isUpper) {
			c = (char) nextInteger(65, 91).intValue();
		} else {
			c = (char) nextInteger(97, 123).intValue();
		}
		return c;
	}
	
	protected String nextString() {
		StringBuffer sb = new StringBuffer();
		int length = nextInteger(5, 11);
		for (int i = 0; i < length; i++) {
			sb.append(nextCharacter());
		}
		
		return sb.toString();
	}
}
