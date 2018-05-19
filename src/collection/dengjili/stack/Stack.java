package collection.dengjili.stack;

import java.util.LinkedList;

public class Stack<T> {

	private LinkedList<T> linkedList = new LinkedList<T>();
	
	public void push(T t) {
		linkedList.addFirst(t);
	}
	
	public T pop() {
		return linkedList.poll();
	}
	
	// 顶端元素
	public T peek() {
		return linkedList.peek();
	}
	
	// 判断栈中是否还有元素
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	@Override
	public String toString() {
		return linkedList.toString();
	}
}
