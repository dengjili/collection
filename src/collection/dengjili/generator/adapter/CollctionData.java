package collection.dengjili.generator.adapter;

import java.util.ArrayList;

import collection.dengjili.generator.Generator;

public class CollctionData<E> extends ArrayList<E> {

	private static final long serialVersionUID = -437241707768073798L;

	public CollctionData(Generator<E> generator, int quantity) {
		for (int i = 0; i < quantity; i++) {
			add(generator.next());
		}
	}
	
	public static <E> CollctionData<E> list(Generator<E> generator, int quantity) {
		return new CollctionData<E>(generator, quantity);
	}
	
}
