package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDeque_ {
	
	public static void main(String args[]) {
		//FIFO
		Queue<Integer> q= new ArrayDeque<>();
		
		//offer(add)
		System.out.println("it returns boolean "+ q.offer(1));
		
		//add- may throw an error if element could not be added
		q.add(2);
		q.add(7);
		q.add(9);
		q.add(5);
		
		System.out.println(q);
		
		//peek(displays first integr)
		System.out.println("peek: "+ q.peek());
		System.out.println("peek after poll "+ q);
		
		//poll(pop)
		System.out.println("poll: "+ q.poll());
		System.out.println("Queue after poll: " + q);
		
		//for loop 
		for(Integer i:q) {
			System.out.println(i);
		}
		
	
	}

	
	}
