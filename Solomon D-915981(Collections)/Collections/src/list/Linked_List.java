package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		
		List<Integer> integerList = new LinkedList<>();
		List<String> stringList = new LinkedList<>();
		
		//Add 
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);
		
		stringList.add("First");
		stringList.add("Second");
		stringList.add("Third");
		stringList.add("Fourth");
		stringList.add("Fifth");
		
		//Remove items based on index
		System.out.println("Before removal: " + integerList);
		integerList.remove(2);
		System.out.println("After removal: " + integerList);
		
		System.out.println("Before removal: " + stringList);
		stringList.remove(2);
		System.out.println("After removal: " + stringList);
		
		//Remove item based on item
		System.out.println("Before removal: " + integerList);
		integerList.remove(Integer.valueOf(4));
		System.out.println("After removal: " + integerList);
		
		System.out.println("Before removal: " + stringList);
		stringList.remove("Fourth");
		System.out.println("After removal: " + stringList);
		
		//Size
		System.out.println("integerList size: " + integerList.size());
		System.out.println("stringList size: " + stringList.size());
		
		//Check
		System.out.println(integerList.contains(Integer.valueOf(5)) ? "5 is Present" : "5 is Not Present");
		System.out.println(stringList.contains("Fifth") ? "'Fifth' is Present" : "'Fifth' is Not Present");
		
		
		//Using iterator
		Iterator<Integer> integerListIterator = integerList.iterator();
		System.out.println("Using Iterator");
		while(integerListIterator.hasNext()) {
			System.out.println(integerListIterator.next());
		}
		
		//Using For Loop
		System.out.println("Using For Loop");
		for(String eachString: stringList) {
			System.out.println(eachString);
		}
		
		//Convert list to array
		Integer[] integerArray = integerList.stream().toArray(Integer[]::new);
		System.out.println("integerList -> integerArray" + Arrays.toString(integerArray));
		
		String[] stringArray = stringList.stream().toArray(String[]::new);
		System.out.println("stringList -> stringArray" + Arrays.toString(stringArray));
		
		//Sorting
		System.out.println("Unsorted List: " + integerList); 
		integerList.sort((i1,i2) -> i1 < i2 ? -1 : 1); //The sort() in list takes comparator as argument
		System.out.println("Sorted List: " + integerList);
		
		System.out.println("Unsorted List: " + stringList); 
		stringList.sort((i1,i2) -> i1.compareTo(i2)); //The compareTo method returns -ve value if i1 is smaller than i2
		System.out.println("Sorted List: " + stringList);
		
	}

}
