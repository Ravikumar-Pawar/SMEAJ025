package collection_set;

import java.util.HashSet;
import java.util.Set;

public class hashSet {

	public static void main(String[] args) {
		System.out.println("******HashSet******");

		
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(7);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(5);
		hashSet.add(1);
		hashSet.add(1);
		
		
		System.out.println(hashSet);
		
		//Remove
		hashSet.remove(Integer.valueOf(4));
		System.out.println("HashSet after removal: " + hashSet);
		
		//Size
		System.out.println("Size: " + hashSet.size());
		
		//Using for loop
		System.out.println("Using for loop");
		for (Integer element : hashSet) {
			System.out.println(element);
		}
		
	}
	
}
