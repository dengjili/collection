package collection.dengjili.test;

import java.util.ArrayList;

import collection.dengjili.pojo.Apple;
import collection.dengjili.pojo.impl.BraeBurn;
import collection.dengjili.pojo.impl.Fuji;
import collection.dengjili.pojo.impl.Gala;
import collection.dengjili.pojo.impl.GrannySmith;

public class GenericsAndUpcasting {
	public static void main(String[] args) throws Exception {
		
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new BraeBurn());
		
		for (Apple apple : apples) {
			System.out.println(apple);
			
			String classStr = apple.toString().split("@")[0];
			System.out.println(apple.hashCode());
			Class<?> clazz =  Class.forName(classStr);
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
		}
	}
}
