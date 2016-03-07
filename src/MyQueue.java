
public class MyQueue {

	private Node first = null;
	private Node last = null;
	private int n; //size
	
	class Node {
		Object item;
		Node next;
	}		
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return n;
	}
	
	public void enqueue(Object data) {
		Node newNode = new Node();
		newNode.item = data;
		
		if (isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		n++;
	}
	
	public Object dequeue() {
		if (isEmpty()) return null;
		
		Object item = first.item;
		first = first.next;
		n--;
		return item;
	}
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		q.enqueue(24);
		System.out.println(q.dequeue());

	}

}
