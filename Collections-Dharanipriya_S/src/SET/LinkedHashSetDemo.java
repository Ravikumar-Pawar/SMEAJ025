package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(3);
		linkedHashSet.add(4);
		linkedHashSet.add(5);
		linkedHashSet.add(1);
		linkedHashSet.add(1);
		
		System.out.println("LinkedHashset does not allow duplicates but maintains insertion order.");
		
		System.out.println(linkedHashSet);
		
		//Remove
		linkedHashSet.remove(Integer.valueOf(4));
		System.out.println("LinkedHashSet after removal: " + linkedHashSet);
		
		//Size
		System.out.println("Size: " + linkedHashSet.size());
		
		//Using for loop
		System.out.println("Using for loop");
		for (Integer element : linkedHashSet) {
			System.out.println(element);
		}
		
	}

}