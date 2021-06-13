package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer> s=new LinkedHashSet<>();
		
		//add
		s.add(5);
		s.add(3);
		s.add(8);
		s.add(1);
		s.add(9);
		s.add(1);
		
System.out.println("LinkedHashset does not allow duplicates but maintains insertion order.");
		
System.out.println(s);

//size 
System.out.println("size "+ s.size());

//remove 
s.remove(Integer.valueOf(8));
System.out.println("After removal "+s);

//for loop
for(int i:s) {
	System.out.println(i);
}

	}
	
}
