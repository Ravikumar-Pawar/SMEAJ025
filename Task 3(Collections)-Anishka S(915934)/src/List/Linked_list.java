package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_list {

	public static void main(String [] args) {
		List<Integer> ilist=new LinkedList<Integer>();
		List<String> slist=new LinkedList<String>();
		
		//add elements
		ilist.add(8);
		ilist.add(3);
		ilist.add(6);
		ilist.add(1);
		System.out.println(ilist);
		
		slist.add("five");
		slist.add("one");
		slist.add("eight");
		slist.add("three");
		System.out.println(slist);
		
		//remove elements based on index
		System.out.println("after removing based on index");
		ilist.remove(3);
		slist.remove(1);
		
		//remove elements based on element
		System.out.println("after removing based on element");
		ilist.remove(Integer.valueOf(6));
		slist.remove(String.valueOf("three"));
		
		//to get size
		System.out.println(ilist.size());
		System.out.println(slist.size());
		
		//check element is present
		System.out.println(ilist.contains(Integer.valueOf(8)));//true
		System.out.println(slist.contains("five"));//true
		
		//using for loop
		for(String s:slist) {
			System.out.println(s);
		}
		
		//using iterator
		Iterator<Integer> i=ilist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//sorting 
		
		System.out.println(" ilist before sorting "+ ilist);
		System.out.println(" slist before sorting "+ slist);
		ilist.sort((n1, n2)-> n1< n2 ? -1 : 1);
		slist.sort((n1,n2)->n1.compareTo(n2));
		System.out.println("after sorting ilist "+ ilist);
		System.out.println("after sorting slist "+ slist);
		
		
		//convert list to array
		Object[] array= ilist.toArray();
		for(Object in: array) {
			System.out.println(in);
		}
		
		Object[] st= slist.toArray();
		for(Object in: st) {
			System.out.println(in);
		}
	}
}
