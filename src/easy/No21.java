package easy;

public class No21 {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
        	return l1 == null? l2:l1;
		ListNode newHead = null;
		ListNode cur = null;
		if(l1.val < l2.val) {
			newHead = new ListNode(l1.val);
			l1 = l1.next;
		}else {
			newHead = new ListNode(l2.val);
			l2 = l2.next;
		}
		cur = newHead;
		while (l1!=null&&l2!=null) {
			if(l1.val <= l2.val) {
				cur.next = new ListNode(l1.val);
				l1 = l1.next;
			}else {
				cur.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			cur = cur.next;
		}
		if(l1 == null) {
			cur.next = l2;
		}else {
			cur.next = l1;
		}
		return newHead;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
