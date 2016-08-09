package hackerrank;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		Stack<Character> stack = new Stack<Character>();
		char[] s = str.toCharArray();
		
		for (int i=0; i<s.length; i++) {
			if (stack.isEmpty() || stack.peek() != s[i]) {
				stack.push(s[i]);
			} else if (stack.peek() == s[i]) {
				stack.pop();
			} 
		}
		
		Stack<Character> reverseStack = new Stack<Character>();
		
		while(!stack.isEmpty()) {
			reverseStack.push(stack.pop());
		}
		
		if (reverseStack.isEmpty()) {
			System.out.println("Empty String");
		} else {
			while (!reverseStack.isEmpty()) {
				System.out.print(reverseStack.pop());
			}
		}
		

	}

}
