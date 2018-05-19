package collection.dengjili.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			priorityQueue.offer(random.nextInt(i+10));
		}
		QueueDemo.print(priorityQueue);
		
		List<Integer> ints = Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
		priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
		priorityQueue.addAll(ints);
		QueueDemo.print(priorityQueue);
	}

}
