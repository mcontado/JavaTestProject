package test;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class MyQueueUsing2Stacks<T> {
	private Stack<T> s1 = new Stack<T>();
	private Stack<T> s2 = new Stack<T>();
	
	public void push(T obj) {
		s1.push(obj);
	}
	
	public T pop() {
		if(s2.isEmpty()) {
			if(s1.isEmpty())
				return null;
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	
	public T peek() {
		if(s2.isEmpty()) {
			if(s1.isEmpty())
				return null;
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.peek();
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		MyQueueUsing2Stacks<Integer> stack = new MyQueueUsing2Stacks<Integer>();
		
		for (int i=0; i<n; i++) {
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				//1 x: Enqueue element  into the end of the queue.
				int data = sc.nextInt();
				stack.push(data);
				break;
				
			case 2:
				//Dequeue the element at the front of the queue.
				stack.pop();
				break;
				
			case 3:
				 //Print the element at the front of the queue.
				System.out.println(stack.peek());
				break;
			}
		}


		
	}

}
