package collection_queue;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorQueue {

	public static void main(String[] args) {
		
		System.out.println("******PriorityQueue******");

        Queue<Integer> priorityQueue = new PriorityQueue<>();
		
		//Add elements in collection
		priorityQueue.add(1);
		priorityQueue.add(9);
		priorityQueue.add(19);
		priorityQueue.add(5);
		priorityQueue.add(13);
		priorityQueue.add(7);
		priorityQueue.add(6);
		
		System.out.println("Priority Queue: " + priorityQueue);
		
		//remove element i.e. poll
		System.out.println("Poll: " + priorityQueue.poll());
		System.out.println("Priority queue after poll: " + priorityQueue);
		System.out.println("Poll: " + priorityQueue.poll());
		System.out.println("Priority queue after poll: " + priorityQueue);
		
		//Peek
		System.out.println("Peek: "+ priorityQueue.peek());
		System.out.println("Priority queue after peek: " + priorityQueue);
		
		//print size
		System.out.println("Size of Priority queue is: " + priorityQueue.size());
		
		//check element using contain method
		boolean result1= priorityQueue.contains(9);
				
		System.out.println("Is 9 present in the list? " + result1);
				
		//Iterator collection using iterator
		Iterator<Integer> iterator1 = priorityQueue.iterator();
		System.out.println("using iterator: ");
				
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
				
		//iterating using for loop
		System.out.println("using for loop: ");
		for(Integer i : priorityQueue) {
			System.out.println("value= "+ i);
		}
		
	


	}

}
