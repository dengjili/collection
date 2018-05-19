package collection.dengjili.generator;

import java.io.UnsupportedEncodingException;

public class TestChar {
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println((int)'a');
		System.out.println((int)'z');
		
		BaseGenerator<String> generator = new BaseGenerator<String>();
		System.out.println(generator.nextString());
	}

}
