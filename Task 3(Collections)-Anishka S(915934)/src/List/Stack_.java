package List;

import java.util.Iterator;
import java.util.Stack;

public class Stack_ {

	public static void main(String []args) {
		Stack<Integer> stack = new Stack<>();
		
		//add elements
		stack.add(4);
		stack.add(8);
		stack.add(6);
		stack.add(1);
		System.out.println(stack);
		
		//push
		stack.push(3);
		stack.push(9);
		System.out.println(stack);
		//pop
		stack.pop();
		System.out.println(stack);
		
		//contains
		System.out.println(stack.contains(3)? "present":"not present");// present
		
		//peek(displays top element in the stack)
		System.out.println("after peek "+ stack.peek());
		
		//iterator
		Iterator<Integer> s=stack.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
		
	}
}
