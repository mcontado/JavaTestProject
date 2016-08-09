package stacksqueues;

import java.util.Stack;

public class RedundantBraces {
	public static int braces(String a) {
		Stack<Character> stack = new Stack<Character>();
		int N = a.length();
		
		for (int i=0; i<N; i++) {
			if (a.charAt(i) == ')') {
				int count = 0;
				while (stack.peek() != '(') {
					stack.pop();
					count++;
				}
				stack.pop();
				if (count < 2) {
					return 1;
				}
			} else {
				stack.push(a.charAt(i));
			}
		}
		
		boolean isRedundant = true;
		while (stack.size() > 0) {
			if (stack.peek() == '(' || stack.peek() == ')') {
				isRedundant = false;
				break;
			}
			stack.pop();
		}
		
		if (!isRedundant) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		String a = "(((a+b)))";
		String b = "(a * (a+b))";
		
		System.out.println(braces(a));

	}

}
