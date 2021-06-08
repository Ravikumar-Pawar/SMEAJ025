package LIST;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListColl {
	public static void main(String[] args) {
		//Creating ArrayList
		ArrayList<String> list=new ArrayList<String>();
		//Adding items to the list
		list.add("HTML");
		list.add("CSS");
		list.add("Javasript");
		list.add("Jquery");
		list.add("Mysql");
		list.add("PHP");
		list.add("React");
		//Printing the items
		System.out.println(list);
		//Removal of items based on index,item
		list.remove("React");
		list.remove(4);
		System.out.println("\nAfter removing: \n"+list);
		//Displaying the size
		System.out.println("\nSize of Array List: "+list.size());
		//Searching item using contains method
		String search ="HTML";
		System.out.println("\nIs "+search+" found?: "+list.contains(search));
		//Using for loop for searching
		for(String item:list)
		{
	       if(item.equals(search))
	       {
		      System.out.println(search+" is found in the list at "+list.indexOf(item)+" position");
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
		//Conversion of ArrayList to array
		Object[] s=list.toArray();
		System.out.println("\nDisplaying list as array:");
		for(Object o:s)
		{
		System.out.print(o+" ");
		}
		//Sorting the ArrayList
	Collections.sort(list);
	System.out.println("\n\nAfter Sorting:"+list);
		
	}
	

}
