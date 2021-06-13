package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_ {

	public static void main(String args[]) {
		
		Queue<Integer> q=new PriorityQueue<>();
		
		System.out.println("Priority Queue removes the element with highest priority.\nBy default it removes in ascending order.");
		
		//add
		q.add(7);
		q.add(9);
		q.add(2);
		q.add(5);
		
		//peek 
		
		System.out.println(q.peek());
		System.out.println("Priority queue after peek " + q);
		
		//poll
		System.out.println("poll " +q.poll());
		System.out.println("priority queue after poll "+ q);
		System.out.println("poll " +q.poll());
		System.out.println("priority queue after poll "+ q);
		
	}
}
