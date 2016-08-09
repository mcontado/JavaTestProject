package stacksqueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class EvaluateExpression {
	
	public static int evalRPN(ArrayList<String> a) {
		int returnValue = 0;
		
		String operators = "+-*/";
		
		Stack<String> stack = new Stack<String>();
		
		for (String t: a) {
			if (!operators.contains(t)) {
				stack.push(t);
			} else {
				int x = Integer.valueOf(stack.pop());
				int y = Integer.valueOf(stack.pop());
				int index = operators.indexOf(t);
				
				switch(index) {
				case 0:
					stack.push(String.valueOf(x+y));
					break;
				case 1:
					stack.push(String.valueOf(y-x));
					break;
				case 2: 
					stack.push(String.valueOf(x*y));
					break;
				case 3:
					stack.push(String.valueOf(y/x));
					break;
				}
			}
		}

		returnValue = Integer.valueOf(stack.pop());
		return returnValue;
	}
	

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>(Arrays.asList("4", "13", "5", "/", "+"));
		
		System.out.println(evalRPN(a));
	}

}
