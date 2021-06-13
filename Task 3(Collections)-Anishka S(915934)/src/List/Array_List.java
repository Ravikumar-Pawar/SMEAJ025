package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Array_List {

	public static void main(String [] args) {
		
		List<Integer> ilist=new ArrayList<>();
		List<String> slist=new ArrayList<>();
		
		//add elements 
		ilist.add(4);
		ilist.add(7);
		ilist.add(3);
		ilist.add(1);
		
		slist.add("one");
		slist.add("two");
		slist.add("three");
		slist.add("four");
		
		//remove elements based on index
		
		System.out.println("Before " +  ilist);
		ilist.remove(0);
		System.out.println("After "+ ilist);
		
		System.out.println("Before " + slist);
		slist.remove(2);
		System.out.println("After "+ slist);
		
		//remove elements based on item
		
		System.out.println("Before "+ ilist);
		ilist.remove(Integer.valueOf(3));
		System.out.println("After "+ilist);
		
		System.out.println("Before "+slist);
		slist.remove(String.valueOf("one"));
		System.out.println("After "+ slist);
		
		//searching for a element(true/false)
		
		System.out.println(ilist.contains(Integer.valueOf(1)));//true
		System.out.println(ilist.contains(Integer.valueOf(2)));//false
		System.out.println(slist.contains("two"));//true
		
		//size of an element 
		
		System.out.println(ilist.size());
		System.out.println(slist.size());
		
		//iteration 
		
		//using Iterator
		Iterator<Integer> iterator= ilist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Iterator<String> stringIterator=slist.iterator();
		while(stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}
		
		//using for loop
		
		for(String s : slist) {
			System.out.println(s);
		}
		
		//sorting
		
		ilist.sort((n1,n2)->n1<n2 ? -1 : 1);//sort() is taking comparator as argument		
		System.out.println("sorted ilist " + ilist);
		slist.sort((n1,n2)->n1.compareTo(n2)); // comapreTo returns negative value if i1 < i2
		System.out.println("sorted slist" + slist);
		
		//list to array
		String[] a = slist.stream().toArray(String[]::new);
		System.out.println("list to array "+ Arrays.toString(a));
		
		
		Integer[] o=ilist.toArray(new Integer[0]);
		for(Integer i:o) {
			System.out.println(i);
		}
		
			
	}
}
