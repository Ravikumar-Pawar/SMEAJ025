package SET;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetColl {
	public static void main(String[] args) {
		//Creating Hash set
		Set<String> hashset=new LinkedHashSet<String>();
		//Adding items to the Hash set
		hashset.add("Cat");
		hashset.add("Dog");
		hashset.add("Monkey");
		hashset.add("Giraffe");
		hashset.add("Bear");
		hashset.add("Rabbit");
		hashset.add("Rabbit");
		hashset.add("Tiger");
		hashset.add("Lion");
		//Printing the items
		System.out.println(hashset);
		//Removal of items based on index,item
		hashset.remove("Bear");
		System.out.println("\nAfter removing: \n"+hashset);
		//Displaying the size
		System.out.println("\nSize of Linked Hash Set: "+hashset.size());
		//Displaying hash code
		System.out.println("\nHash code of the hash set "+hashset.hashCode());
		//Searching item using contains method
		String search ="Tiger";
		System.out.println("\nIs "+search+" found?: "+hashset.contains(search));
		//Using for loop for searching
		for(String item:hashset)
		{
	       if(item.equals(search))
	       {
		      System.out.println(search+" is found in the hashset");
	       }
		}
		//Iterating the Hash set 
		Iterator<String> it=hashset.iterator();
		System.out.println("\nIteration using Iterator:");
		while(it.hasNext())
		{
		System.out.print(it.next()+" ");
		}
		
		//Using for loop to iterate
		System.out.print("\n\nIteration using for loop:");
		for(String item:hashset)
		{
	         System.out.println(item);
		}
		//Conversion of Hash set to array
		Object[] s=hashset.toArray();
		System.out.println("\nDisplaying hashset as array:");
		for(Object o:s)
		{
		System.out.print(o+" ");
		}
		
		
	}
	


}
