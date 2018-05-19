package collection.dengjili.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			queue.offer(random.nextInt(i+10));
		}
		print(queue);
		
		Queue<Character> qc = new LinkedList<Character>();
		for (char c : "abcdefghijkl".toCharArray()) {
			qc.offer(c);
		}
		print(qc);
	}

	public static <E> void print(Queue<E> queue) {
		while (!queue.isEmpty()) {
			E poll = queue.poll();
			System.out.print(poll + " ");
		}
		System.out.println();
	}
}
