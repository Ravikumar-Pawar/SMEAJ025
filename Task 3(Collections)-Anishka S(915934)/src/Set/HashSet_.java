package Set;

import java.util.Set;
import java.util.HashSet;

public class HashSet_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> h= new HashSet<>();
		
		//add
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(8);
		h.add(6);
		h.add(1);
		
		System.out.println("Hashset does not allow duplicates and does not maintain insertion order.");
		System.out.println(h);
		
		//size
		System.out.println("size "+ h.size());
		
		//remove
		h.remove(Integer.valueOf(3));
		System.out.println("after removing "+ h);
		
		//for loop
		for(int i:h) {
			System.out.println(i);
		}
	}

}
