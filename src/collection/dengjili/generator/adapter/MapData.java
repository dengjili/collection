package collection.dengjili.generator.adapter;

import java.util.LinkedHashMap;

import collection.dengjili.generator.Generator;
import collection.dengjili.generator.Pair;

public class MapData<K, V> extends LinkedHashMap<K, V> {

	private static final long serialVersionUID = -437241707768073798L;

	// �ɶԼ�ֵ��������
	public MapData(Generator<Pair<K, V>> generator, int quantity) {
		for (int i = 0; i < quantity; i++) {
			Pair<K, V> pair = generator.next();
			put(pair.key, pair.value);
		}
	}

	// ����������,��һ�������ֵ
	public MapData(Generator<K> genK, Generator<V> genV, int quantity) {
		for (int i = 0; i < quantity; i++) {
			put(genK.next(), genV.next());
		}
	}

	public MapData(Generator<K> genK, V v, int quantity) {

		for (int i = 0; i < quantity; i++) {
			put(genK.next(), v);
		}
	}

	public MapData(Iterable<K> it, Generator<V> genV) {
		for (K k : it) {
			put(k, genV.next());
		}
	}

	public MapData(Iterable<K> it, V v) {
		
		for (K k : it) {
			put(k, v);
		}
	}
	public static <K, V> MapData<K, V> list(Generator<Pair<K, V>> generator, int quantity) {
		return new MapData<K, V>(generator, quantity);
	}

}
