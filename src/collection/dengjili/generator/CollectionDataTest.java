package collection.dengjili.generator;

import java.util.LinkedHashSet;
import java.util.Set;

import collection.dengjili.generator.adapter.CollctionData;
import collection.dengjili.generator.adapter.IntegerGenerator;
import collection.dengjili.generator.adapter.StringGenerator;

public class CollectionDataTest {

	public static void main(String[] args) {
		CollctionData<String> collctionData = new CollctionData<String>(new StringGenerator(), 5);
		Set<String> set = new LinkedHashSet<String>(collctionData);
		System.out.println(set);
		set.addAll(CollctionData.<String>list(new StringGenerator(), 5));
		System.out.println(set);
		
		System.out.println(CollctionData.<Integer>list(new IntegerGenerator(), 5));
	}

}
