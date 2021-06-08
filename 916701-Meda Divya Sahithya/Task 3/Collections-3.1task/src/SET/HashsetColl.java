package SET;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetColl {
	public static void main(String[] args) {
		//Creating Hash set
		Set<String> hashset=new HashSet<String>();
		//Adding items to the Hash set
		hashset.add("Peacock");
		hashset.add("Crow");
		hashset.add("Humming Bird");
		hashset.add("Pigeon");
		hashset.add("Eagle");
		hashset.add("Dove");
		hashset.add("Owl");
		hashset.add("Humming Bird");
		//Printing the items
		System.out.println(hashset);
		//Removal of items based on index,item
		hashset.remove("Owl");
		System.out.println("After removing: \n"+hashset);
		//Displaying the size
		System.out.println("Size of Hash Set: "+hashset.size());
		//Displaying hash code
		System.out.println("Hash code of the hash set "+hashset.hashCode());
		//Searching item using contains method
		String search ="Pigeon";
		System.out.println("Is "+search+" found?: "+hashset.contains(search));
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
		System.out.print("\nIteration using for loop:");
		for(String item:hashset)
		{
	         System.out.println(item);
		}
		//Conversion of Hash set to array
		Object[] s=hashset.toArray();
		System.out.println("Displaying hashset as array:");
		for(Object o:s)
		{
		System.out.print(o+" ");
		}
		
		
	}
	

}
