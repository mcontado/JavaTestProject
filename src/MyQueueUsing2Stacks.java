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
	

	public static void main(String[] args) {
		MyQueueUsing2Stacks myq = new MyQueueUsing2Stacks<>();
		myq.push(1);
		myq.push(2);
		myq.push(3);
		System.out.println(myq.pop());
		myq.push(4);
		System.out.println(myq.pop());

		System.out.println(myq.pop());

		System.out.println(myq.pop());


		
	}

}
