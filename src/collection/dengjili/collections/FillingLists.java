package collection.dengjili.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddree {
	private String string;

	public StringAddree(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return super.toString() + " " + string;
	}
}

public class FillingLists {
	
	public static void main(String[] args) {
		List<StringAddree> nCopies = Collections.nCopies(5, new StringAddree("hello"));
		List<StringAddree> list = new ArrayList<StringAddree>(nCopies);
		System.out.println(list);
		
		Collections.fill(list, new StringAddree("word"));
		System.out.println(list);
	}

}
