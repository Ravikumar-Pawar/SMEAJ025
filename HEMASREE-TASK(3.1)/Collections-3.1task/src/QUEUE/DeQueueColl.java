package QUEUE;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class DeQueueColl {
	public static void main(String[] args) {
		//Creating queue
		Queue<String> queue=new ArrayDeque<String>();
		//Adding items to the queue
		queue.add("HYDERABAD");
		queue.add("BANGALORE");
		queue.add("CHENNAI");
		queue.add("MUMBAI");
		queue.add("PATNA");
		queue.add("KERALA");
		queue.add("VARANASI");
		//Printing the items
		System.out.println(queue);
		//Removal of items based on index,item
		queue.poll();
		
		System.out.println("\nAfter removing: \n"+queue);
		//Displaying the size
		System.out.println("\nSize of DeQueue: "+queue.size());
		//Searching item using contains method
		String search ="CHENNAI";
		System.out.println("\nIs "+search+" found?: "+queue.contains(search));
		
		//Adding item using offer() method
		queue.offer("DELHI");
		System.out.println("\nUsing Offer method ,an item is added in the queue ");
		
		//Using for loop for searching
		for(String item:queue)
		{
	       if(item.equals(search))
	       {
		      System.out.println(search+" is found in the queue ");
	       }
		}
		//Iterating the queue 
		Iterator<String> it=queue.iterator();
		System.out.println("\nIteration using Iterator:");
		while(it.hasNext())
		{
		System.out.print(it.next()+" ");
		}
		
		//Using for loop to iterate
		System.out.println("\n\nIteration using for loop:");
		for(String item:queue)
		{
	         System.out.println(item);
		}
		//Conversion of queue to array
		Object[] s=queue.toArray();
		System.out.println("\nDisplaying queue as array:");
		for(Object o:s)
		{
		System.out.print(o+" ");
		}
	
		
	}
	

}
