package list;

import java.util.Iterator;
import java.util.Stack;

public class Stack_ {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		//Add 
		stack.add(5);
		stack.add(4);
		stack.add(3);
		stack.add(2);
		stack.add(1);
		
		System.out.println("Stack: " + stack);
		
		//Pop
		System.out.println("Pop: " + stack.pop());
		System.out.println("Stack after pop: " + stack);
		
		//push
		stack.push(100);
		System.out.println("Stack after push: " + stack);
		
		//Contains
		System.out.println(stack.contains(5) ? "Does contain" : "Does not contain");
		
		//Peek
		System.out.println("Peek: " + stack.peek());
		System.out.println("Stack after peek(): " + stack);
		
		//Using Iterator
		Iterator<Integer> stackIterator = stack.iterator();
		System.out.println("Using Iterator");
		while(stackIterator.hasNext()) {
			System.out.println(stackIterator.next());
		}
	}

}
