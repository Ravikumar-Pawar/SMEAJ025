package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Array_Deque {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new ArrayDeque<>();
		
		System.out.println("FIFO");
		
		//Offer
		System.out.println("offer() returns boolean: " + queue.offer(4));
 		
		//add 
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.add(9);
		queue.add(10);
		
		System.out.println("Queue: " + queue);
		
		//Poll
		System.out.println("Poll: " + queue.poll());
		System.out.println("Queue after poll: " + queue);
		
		//Peek
		System.out.println("Peek: " + queue.peek());
		System.out.println("Queue after peek: " + queue);
		
		//Using for loop
		System.out.println("Using for loop");
		for (Integer i : queue) {
			System.out.println(i);
		}
		
	}

}
