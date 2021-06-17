package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {

	public static void main(String[] args) {
		
		System.out.println("Priority Queue removes the element with highest priority.\nBy default it removes in ascending order.");
		
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		
		//Add
		priorityQueue.add(10);
		priorityQueue.add(9);
		priorityQueue.add(8);
		priorityQueue.add(7);
		priorityQueue.add(6);
		
		System.out.println("Priority Queue: " + priorityQueue);
		
		//Poll
		System.out.println("Poll: " + priorityQueue.poll());
		System.out.println("Priority queue after poll: " + priorityQueue);
		System.out.println("Poll: " + priorityQueue.poll());
		System.out.println("Priority queue after poll: " + priorityQueue);
		
		//Peek
		System.out.println("Peek: "+ priorityQueue.peek());
		System.out.println("Priority queue after peek: " + priorityQueue);
		
		
	}

}
