package List;

import java.util.Iterator;
import java.util.Vector;

public class Vector_methods {
	
public static void main(String [] args) {
	
	Vector<Integer> v = new Vector<>();

	// Add elements
	v.add(5);
	v.add(7);
	v.add(3);
	v.add(4);
	v.add(1);

	System.out.println("Vector: " + v);
	
	//First Element
	System.out.println("First Element: " + v.firstElement());

	// Contains
	System.out.println(v.contains(8) ? "Contains" : "Does not contain");
	
	//Size
	System.out.println("Size: " + v.size());
	
	//Remove by index
	v.remove(3);
	System.out.println("Vector after remove by index: " + v);
	
	//Remove by element
	v.remove(Integer.valueOf(3));
	System.out.println("Vector after remove by object: " + v);
	// Using Iterator
	Iterator<Integer> i = v.iterator();
	
	while (i.hasNext()) {
		System.out.println(i.next());
	}

}
}
