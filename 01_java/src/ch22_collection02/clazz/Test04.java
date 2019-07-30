/**
 * 
 * Stack
 */
package ch22_collection02.clazz;

import java.util.Stack;

public class Test04 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		System.out.println(s);
		
		System.out.println("pop -> " + s.pop());
		System.out.println("pop -> " + s.pop());
		System.out.println(s);
		
		System.out.println("peek -> " + s.peek());
		System.out.println(s);
		
	}

}
