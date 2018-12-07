package easy;

public class No206 {
	
	public ListNode reverseList(ListNode head) {
		ListNode newHead = null;
	    ListNode node = null;
	    while(head != null) {
	    	node = head.next;
	        head.next = newHead;
	        newHead = head;
	        head = node;
	    }
	    return newHead;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
