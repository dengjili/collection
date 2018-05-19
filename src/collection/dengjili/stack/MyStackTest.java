package collection.dengjili.stack;

public class MyStackTest {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
