package linkedlist;

import java.util.*;

class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
 


public class LinkedListPalindrome {
	
	public static int lPalin(ListNode A) {
		int isPalindrome = 1;
		Stack<Integer> stack = new Stack<Integer>();
		ListNode temp = A;
		
		while (A != null) {
			stack.push(A.val);
			A = A.next;
		}
		
		while (!stack.isEmpty()) {
			if (stack.pop() == temp.val) {
				temp = temp.next;
			} else {
				isPalindrome = 0;
				return isPalindrome;
			}
		}
		
		return isPalindrome;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n = new ListNode(1);

		System.out.println(n.val);
		n.next = new ListNode(2);
		System.out.println(n.next.val);
		n.next.next = new ListNode(2);
		System.out.println(n.next.next.val);
		n.next.next.next = new ListNode(1);
		System.out.println(n.next.next.next.val);
		System.out.println(lPalin(n));
		

	}

}
