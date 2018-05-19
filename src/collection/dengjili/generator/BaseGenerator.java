package collection.dengjili.generator;

import java.lang.reflect.ParameterizedType;
import java.util.Random;

public class BaseGenerator<T> implements Generator<T> {
	
	Random random = new Random();

	@Override
	public T next() {
		
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
		Class<T> clazz = (Class<T>) parameterizedType.getActualTypeArguments()[0];
		if (clazz.isAssignableFrom(String.class)) {
			System.out.println("String");
		}
		if (clazz.isAssignableFrom(Integer.class)) {
			System.out.println("Integer");
		}
		
		return null;
	}
	
	public Integer nextInteger(int begin, int end) {
		if (begin < 0) {
			throw new IllegalArgumentException("起始不能为负数");
		}
		
		int size = end - begin;
		return random.nextInt(size) + begin;
	}
	
	public Character nextCharacter() {
		char c;
		boolean isUpper = random.nextDouble() > 0.5;
		if (isUpper) {
			c = (char) nextInteger(65, 91).intValue();
		} else {
			c = (char) nextInteger(97, 123).intValue();
		}
		return c;
	}
	
	public String nextString() {
		StringBuffer sb = new StringBuffer();
		int length = nextInteger(5, 11);
		for (int i = 0; i < length; i++) {
			sb.append(nextCharacter());
		}
		
		return sb.toString();
	}
}
