package list;

import java.util.Iterator;
import java.util.Vector;

public class VectorList {

	
	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		// Add elements
		vector.add(5);
		vector.add(4);
		vector.add(3);
		vector.add(2);
		vector.add(1);

		System.out.println("Vector: " + vector);
		
		//First Element
		System.out.println("First Element: " + vector.firstElement());

		// Contains
		System.out.println(vector.contains(8) ? "Contains" : "Does not contain");
		
		//Size
		System.out.println("Size: " + vector.size());
		
		//Remove by index
		vector.remove(3);
		System.out.println("Vector after remove by index: " + vector);
		
		//Remove by element
		vector.remove(Integer.valueOf(3));
		System.out.println("Vector after remove by object: " + vector);
		// Using Iterator
		Iterator<Integer> stackIterator = vector.iterator();
		System.out.println("Using Iterator");
		while (stackIterator.hasNext()) {
			System.out.println(stackIterator.next());
		}

	}


}
