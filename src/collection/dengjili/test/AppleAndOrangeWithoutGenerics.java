package collection.dengjili.test;

import java.util.ArrayList;

import collection.dengjili.pojo.Apple;
import collection.dengjili.pojo.Orange;

/**
 * <b>���Բ�ʹ�÷���</b>
 * 
 * <pre> <p>��ʹ�÷��������������ת���쳣java.lang.ClassCastException<p/>
 * Exception in thread "main" java.lang.ClassCastException: collection.dengjili.pojo.Orange cannot be cast to collection.dengjili.pojo.Apple
	at collection.dengjili.test.AppleAndOrangeWithoutGenerics.main(AppleAndOrangeWithoutGenerics.java:24)
 * </pre>
 * 
 * @author it
 */
public class AppleAndOrangeWithoutGenerics {

	public static void main(String[] args) {

		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		apples.add(new Orange());

		for (int i = 0; i < apples.size(); i++) {
			((Apple) apples.get(i)).id();
		}
	}

}
