package stacksqueues;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElementInStack {
	/*	1 x  -Push the element x into the stack.
	2    -Delete the element present at the top of the stack.
	3    -Print the maximum element in the stack.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i=0; i<n; i++) {
			int operator = sc.nextInt();
			
			switch(operator) {
			case 1: 
				int currentData = sc.nextInt();
				
				if (stack.isEmpty()) {
					stack.push(currentData);
				} else {
					stack.push(Math.max(currentData, stack.peek()));
				}
				
				
				break;
			
			case 2:
				if (!stack.isEmpty()) { 
					stack.pop();
				}	
					
				break;
				
			case 3:
				
				System.out.println(stack.peek());
				
				break;
			}
		}

	}
	


}
