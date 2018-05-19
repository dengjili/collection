package collection.dengjili.test;

import java.util.Arrays;
import java.util.List;

class Snow{}
class Power extends Snow{}
class Light extends Power{}
class Heavy extends Power{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class ArraysAsList {

	public static void main(String[] args) {
		List<Snow> snows = Arrays.asList(new Crusty(), new Slush(), new Power());
		System.out.println(snows);
		
		// 无法通过编译
		//List<Snow> snows2 = Arrays.asList(new Light(), new Heavy());
		List<Power> snows2 = Arrays.<Power>asList(new Light(), new Heavy());
		List<Snow> snows3 = Arrays.asList(new Light(), new Slush());
	}

}
