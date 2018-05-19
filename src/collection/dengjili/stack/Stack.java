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
	
	// ����Ԫ��
	public T peek() {
		return linkedList.peek();
	}
	
	// �ж�ջ���Ƿ���Ԫ��
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	@Override
	public String toString() {
		return linkedList.toString();
	}
}
