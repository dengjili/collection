package collection.dengjili.abstract2;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Countries {

	public static final String[][] DATA = { { "a", "1" }, { "b", "2" }, { "c", "3" }, { "d", "4" }, { "e", "5" } };

	// 自己实现AbstractMap
	static class FlyweightMap extends AbstractMap<String, String> {
		
		static class MyEntry implements Map.Entry<String, String> {
			int index;
			public MyEntry(int index) {
				this.index = index;
			}
			@Override
			public String getKey() {
				return DATA[index][0];
			}
			@Override
			public String getValue() {
				return DATA[index][1];
			}
			@Override
			public String setValue(String value) {
				throw new UnsupportedOperationException();
			}
			@Override
			public int hashCode() {
				return DATA[index][0].hashCode();
			}
			@Override
			public boolean equals(Object obj) {
				return DATA[index][0].equals(obj);
			}
		}
		static class EntrySet extends AbstractSet<Map.Entry<String, String>> {
			private int size;
			public EntrySet(int size) {
				if (size < 0) {
					this.size = 0;
				} else if (size > DATA.length) {
					this.size = DATA.length;
				} else {
					this.size = size;
				}
			}
			@Override
			public Iterator<Map.Entry<String, String>> iterator() {
				return null;
			}
			@Override
			public int size() {
				return size;
			}
		}

		@Override
		public Set<Map.Entry<String, String>> entrySet() {
			return null;
		}
	}

}
