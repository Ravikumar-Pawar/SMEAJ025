package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> treeSet = new TreeSet<>();
		
		System.out.println("Tree Set does not allow duplicates and sorts all the elements by default");
		
		//Add elements
		treeSet.add("z");
		treeSet.add("y");
		treeSet.add("x");
		treeSet.add("w");
		treeSet.add("v");
		treeSet.add("y");
		treeSet.add("y");
		
		System.out.println("Tree Set: " + treeSet);
		
		//Size
		System.out.println("Size: " + treeSet.size());
		
		//Remove by element
		treeSet.remove("w");
		System.out.println("TreeSet after removal: " + treeSet);
		
	}

}