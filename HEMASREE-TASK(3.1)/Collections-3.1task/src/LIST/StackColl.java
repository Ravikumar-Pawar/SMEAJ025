package LIST;
import java.util.Stack;
import java.util.Collections;
import java.util.Iterator;

public class StackColl {
	public static void main(String[] args) {
		//Creating Stack
		Stack<String> stack=new Stack<String>();
		//Adding items to the stack
		stack.add("EEE");
		stack.add("CSE");
		stack.add("ECE");
		stack.add("EIE");
		stack.add("MECH");
		stack.add("IT");
		stack.add("CIVIL");
		//Printing the items
		System.out.println(stack);
		//Removal of items based on index,item
		stack.pop();
		stack.remove(4);
		System.out.println("\nAfter removing: \n"+stack);
		//Displaying the size
		System.out.println("\nSize of Stack: "+stack.size());
		//Searching item using contains method
		String search ="CSE";
		System.out.println("\nIs "+search+" found?: "+stack.contains(search));
		//Using for loop for searching
		for(String item:stack)
		{
	       if(item.equals(search))
	       {
		      System.out.println(search+" is found in the stack at "+stack.indexOf(item)+" position");
	       }
		}
		//Iterating the stack 
		Iterator<String> it=stack.iterator();
		System.out.println("\nIteration using Iterator:");
		while(it.hasNext())
		{
		System.out.print(it.next()+" ");
		}
		
		//Using for loop to iterate
		System.out.println("\n\nIteration using for loop:");
		for(String item:stack)
		{
	         System.out.println(item);
		}
		//Conversion of Stack to array
		Object[] s=stack.toArray();
		System.out.println("\nDisplaying stack as array:");
		for(Object o:s)
		{
		System.out.print(o+" ");
		}
		//Sorting the stack
	Collections.sort(stack);
	System.out.println("\n\nAfter Sorting:"+stack);
		
	}
	

}
