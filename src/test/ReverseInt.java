package test;

import java.util.ArrayList;

public class ReverseInt {
	// using Stack
	
	public static void reverseIntUsingStack() {
		int[] a = {1,2,3,4,5,6,7};
		// sysout 7,6,5,4,3,2,1
	
		Stack stack = new Stack();
		for(int num : a) {
			stack.push(num);
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		
		// using ArrayList
	}
	
	public static void printSameOrder(int[] arr) {
		
		
		Queue q = new Queue();
		for (int num: arr) {
			q.enqueue(num);
		}
		
		while (!q.isEmpty()) {
			System.out.print(q.dequeue() + " ");
		}
	}
	
	//using ArrayList
	public static void reverseUsingArrayList() {
		int[] a = {1,2,3,4,5,6,7};
		
		ArrayList al = new ArrayList();
		for (int i = a.length-1; i>=0; i--) {
			al.add(a[i]);			
		}
		System.out.print(al);
	}
	
	//using Queue
	public static void reverseUsingQueue() {
		Queue q = new Queue();
		int[] a = {1,2,3,4,5,6,7};
	
	
		 
	}
	
	public static int  reverseInteger(int a) {
		String s = String.valueOf(a);
		boolean isNegative = false;
		char[] arr = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		
		if (s.charAt(0) == '-')  {
			isNegative = true;	
		}
		
		
		for(int i=arr.length-1; isNegative? i>=1 : i>= 0; i--) {
			sb.append(arr[i]);
		}
		int result = Integer.parseInt(sb.toString());
		
		if (isNegative) {
			result = -result;
		}
		return result;
	}
	
	
	public static void main(String[] args){
		/*reverseIntUsingStack();
		System.out.println("\n");
		reverseUsingArrayList();
		System.out.println("\n");
		reverseUsingQueue();*/
		int[] a = {1,2,3,4,5,6,7};
		//printSameOrder(a);
		
		int b = -123;
		System.out.println(reverseInteger(b));
	}
}
