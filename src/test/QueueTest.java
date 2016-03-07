package test;
import test.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue q = new Queue();
		int[] a = {11, 13, 14, 15, 16};
	
	
		 for(int arr : a) {
				q.enqueue(arr);
			}
	     while (!q.isEmpty()) {
	    	 System.out.print(q.dequeue() + " ");
	     }
	}
}
