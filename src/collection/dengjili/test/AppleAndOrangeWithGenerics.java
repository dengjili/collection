package collection.dengjili.test;

import java.util.ArrayList;

import collection.dengjili.pojo.Apple;
import collection.dengjili.pojo.Orange;

/**
 * <b>测试使用泛型</b>
 * 
 * <pre> <p>使用泛型容易造成类型<p/>
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
		
		//不能Orange不能放入Apple类型
		//apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			apples.get(i).id();
		}
	}

}
