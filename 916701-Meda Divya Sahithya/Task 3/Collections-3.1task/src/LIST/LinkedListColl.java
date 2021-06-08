package LIST;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
public class LinkedListColl {
public static void main(String[] args) {
			//Creating LinkedList
			LinkedList<String> list=new LinkedList<String>();
			//Adding items to the list
			list.add("C");
			list.add("C++");
			list.add("Python");
			list.add("Java");
			list.add("DotNet");
			list.add("C#");
			list.add("SQL");
			//Printing the items
			System.out.println(list);
			//Removal of items based on index,item
			list.remove("DotNet");
			list.remove(4);
			System.out.println("\nAfter removing: \n"+list);
			//Displaying the size
			System.out.println("\nSize of Linked List: "+list.size());
			//Searching item using contains method
			String search ="Java";
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
			//Conversion of LinkedList to array
			Object[] s=list.toArray();
			System.out.println("\nDisplaying list as array:");
			for(Object o:s)
			{
			System.out.print(o+" ");
			}
			//Sorting the LinkedList
		Collections.sort(list);
		System.out.println("\n\nAfter Sorting:"+list);
			
		}
		

	}



