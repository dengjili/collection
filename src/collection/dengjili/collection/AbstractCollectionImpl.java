package collection.dengjili.collection;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * 集合接口默认抽象类的部分实现
 * 
 * 
 * @author it
 *
 * @param <E>
 */
public class AbstractCollectionImpl<E> extends AbstractCollection<E> {

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public int size() {
		return 0;
	}

}
