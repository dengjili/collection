package collection.dengjili.test;

import java.util.ArrayList;

import collection.dengjili.pojo.Apple;
import collection.dengjili.pojo.Orange;

/**
 * <b>����ʹ�÷���</b>
 * 
 * <pre> <p>ʹ�÷��������������<p/>
 * {@code
 * 		ArrayList<Apple> apples = new ArrayList<Apple>();
 * }
 * </pre>
 * 
 * @author it
 */
public class AppleAndOrangeWithGenerics {

	public static void main(String[] args) {

		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		
		//����Orange���ܷ���Apple����
		//apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			apples.get(i).id();
		}
	}

}
