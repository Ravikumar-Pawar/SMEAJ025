package list;

import java.util.Iterator;
import java.util.Vector;

public class Vector_ {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		// Add 
		vector.add(5);
		vector.add(4);
		vector.add(3);
		vector.add(2);
		vector.add(1);

		System.out.println("Vector: " + vector);
		
		//First Element
		System.out.println("First Element: " + vector.firstElement());

		//Contains
		System.out.println(vector.contains(3) ? "Does contain" : "Does not contain");
		
		//Size
		System.out.println("Size: " + vector.size());
		
		//Remove by index
		vector.remove(3);
		System.out.println("Vector after remove by index: " + vector);
		
		//Remove by element
		vector.remove(Integer.valueOf(3));
		System.out.println("Vector after remove by element: " + vector);
		
		//Using Iterator
		Iterator<Integer> vectorIterator = vector.iterator();
		System.out.println("Using Iterator");
		while (vectorIterator.hasNext()) {
			System.out.println(vectorIterator.next());
		}

	}

}
