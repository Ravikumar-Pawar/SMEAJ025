package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	
	public static void main(String[] args) {
		System.out.println("ArrayList");
		List<Integer> values = new ArrayList<Integer>();
		List<String> words = new ArrayList<String>();
		
		//add elements in collection
		values.add(3);
		values.add(76);
		values.add(92);
		values.add(18);
		values.add(12);
		values.add(47);
		
		
		words.add("Hema");
		words.add("Ravi");
		words.add("Latha");
		words.add("chandran");
		
		
		//remove item on basis of index
		int index = 3;
		System.out.println("Intially the list was: "+ values);
		values.remove(index);
		System.out.println("After removing the element from index " + index + " the list is as: " + values);
		
		//remove item on basis of item
		values.remove(Integer.valueOf(92));
		System.out.println("After removing the element 92, the list is as: " + values);
		
		//print size of list
		int size = values.size();
		System.out.println("Size of list is " + size);
		
		//check element using contain method
		boolean result1= values.contains(3);
		boolean result2= words.contains("Ravi");
		
		System.out.println("Is 3 present in the list? " + result1);
		System.out.println("Is Latha present in the string_list? " + result2);
		
		//Iterator collection using iterator
		Iterator<Integer> iterator1 = values.iterator();
		System.out.println("using iterator: ");
		
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		
		//iterating using for loop
		System.out.println("using for loop: ");
		for(Integer i : values) {
			System.out.println("value= "+ i);
		}

		//convert collections to an array
		String[] stringArray = words.stream().toArray(String[]::new);
		System.out.println("string_list -> string_array" + Arrays.toString(stringArray));
		
		//sorting collection
		System.out.println("Unsorted list: " + values);
		Collections.sort(values);
		System.out.println("Sorted list: " + values);
		
		System.out.println("Unsorted string_list: " + words);
		Collections.sort(words);
		System.out.println("Sorted string_list: " + words);



		
		
		

	}

}

