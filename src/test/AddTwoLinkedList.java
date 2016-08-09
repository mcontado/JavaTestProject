package test;

//Definition of the ListNode
class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
	
	 @Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
	 
	 
}

public class AddTwoLinkedList {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode dummyHead = new ListNode(0);
    	ListNode p = l1, q = l2, current = dummyHead;
    	int carry = 0;
    	
    	while (p!= null || q!= null) {
    		int x = (p != null) ? p.val : 0;
    		int y = (q != null) ? q.val : 0;
    		int sum = carry + x + y;
    		carry = sum / 10;
    		current.next = new ListNode(sum % 10);
    		current = current.next;
    		
    		if (p!=null) p = p.next;
    		if (q!=null) q = q.next;
    		
    	}
    	
    	if (carry > 0) {
    		current.next = new ListNode(carry);
    	}
    	
    	return dummyHead.next;
    }
    
    public static void main(String[] args){
    	
    	ListNode l1 = new ListNode(2);
    	l1.next = new ListNode(4);
    	l1.next.next = new ListNode(3);
    	
    	ListNode l2 = new ListNode(5);
    	l2.next = new ListNode(6);
    	l2.next.next = new ListNode(4);
    	
    	System.out.println(l1.toString());
    	System.out.println(l2.toString());
    	
    	System.out.println("TOTAL: " + addTwoNumbers(l1, l2).toString());
    	
    	
    	
    }
}

