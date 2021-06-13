package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <Integer> s=new TreeSet<>();
		System.out.println("Tree Set does not allow duplicates and sorts all the elements by default");
		
		//add
				s.add(5);
				s.add(3);
				s.add(8);
				s.add(1);
				s.add(9);
				s.add(1);
				System.out.println(s);
				
		//size
				System.out.println("size "+ s.size());
		//remove 
				s.remove(Integer.valueOf(5));
				System.out.println("after removal "+ s);
				
		//for loop
				for(int i:s) {
					System.out.println(i);
				}
		
	}

}
