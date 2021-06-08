package LIST;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorColl {
	public static void main(String[] args) {
		//Creating Vector collection
		Vector<String> list=new Vector<String>();
		//Adding items to the list
		list.add("Apple");
		list.add("Watermelon");
		list.add("Banana");
		list.add("Grapes");
		list.add("Pineapple");
		list.add("Pomegranate");
		list.add("Orange");
		//Printing the items
		System.out.println(list);
		//Removal of items based on index,item
		list.remove("Orange");
		list.remove(4);
		System.out.println("\nAfter removing: \n"+list);
		//Displaying the size
		System.out.println("\nSize of Vector: "+list.size());
		//Searching item using contains method
		String search ="Banana";
		System.out.println("\nIs "+search+" found?: "+list.contains(search));
		//Using for loop for searching
		for(String item:list)
		{
	       if(item.equals(search))
	       {
		      System.out.println(search+" is found in the list at "+list.indexOf(item)+" position");
		      break;
	       }
		}
		//Iterating the list 
		Iterator<String> it=list.iterator();
		System.out.println("\nIteration using Iterator:");
		while(it.hasNext())
		{
		System.out.print(it.next()+" ");
		}
		
		//Using for loop to iterate
		System.out.println("\n\nIteration using for loop:");
		for(String item:list)
		{
	         System.out.println(item);
		}
		//Conversion of vector to array
		Object[] s=list.toArray();
		System.out.println("\nDisplaying list as array:");
		for(Object o:s)
		{
		System.out.print(o+" ");
		}
		//Sorting the vector
	Collections.sort(list);
	System.out.println("\n\nAfter Sorting:"+list);
		
	}
	

}
