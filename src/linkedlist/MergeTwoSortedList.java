package linkedlist;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

public class MergeTwoSortedList {
	
	public static ListNode merge(ListNode a, ListNode b)
	{
	   if (a == null) return b;
	   if (b == null) return a;

	   ListNode node;
	   if (a.val < b.val)
	   {
	      node = a; 
	      node.next = merge(a.next, b);
	   }
	   else
	   {
	      node = b;
	      node.next = merge(a, b.next);
	   }
	   return node;
	}

	
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
	    ListNode head = new ListNode(0);
	    ListNode p = head;
	 
	    while(a!=null||b!=null){
	        if(a!=null&&b!=null){
	            if(a.val < b.val){
	                p.next = a;
	                a=a.next;
	            }else{
	                p.next=b;
	                b=b.next;
	            }
	            p = p.next;
	        }else if(a==null){
	            p.next = b;
	            break;
	        }else if(b==null){
	            p.next = a;
	            break;
	        }
	    }
	 
	    return head.next;
	}
	
	//BEST SOLUTION FROM INTERVIEWBIT
	public static ListNode mergeTwoList(ListNode A, ListNode B) {
	    return solve(A, B);
	}
	
	public static ListNode solve(ListNode A, ListNode B) {
	    
	    if (A == null)
	        return B;
	        
	    if (B == null)
	        return A;
	        
	    ListNode head;
	    ListNode node = new ListNode(0);
	    head = node;
	        
	    while (A != null && B != null) {
	        
	        if (A.val <= B.val) {
	            node.next = A;
	            A = A.next;
	            node = node.next;
	        } else {
	            node.next = B;
	            B = B.next;
	            node = node.next;
	        }
	    }
	    
	    if (A == null)
	        node.next = B;
	    else
	        node.next = A;
	    
	    head = head.next;
	    
	    return head;
	    
	}
	public static void main(String[] args) {
		ListNode n = new ListNode(5);
		n.next = new ListNode(8);
		n.next.next = new ListNode(20);
		
		ListNode m = new ListNode(4);
		m.next = new ListNode(11);
		m.next.next = new ListNode(15);
		
		
		while (n != null) {
			System.out.print(n.val);
			if (n.next != null) System.out.print("->");
			n = n.next;
		}
		System.out.println("");
		while (m != null) {
			System.out.print(m.val);
			if (m.next != null) System.out.print("->");
			m = m.next;
		}
		
		mergeTwoList(m,n);
		
//		while (mergeNodes != null) {
//			System.out.print(mergeNodes.val);
//			if (mergeNodes.next != null) System.out.println("->");
//			mergeNodes = mergeNodes.next;
//		}
		

	}

}
