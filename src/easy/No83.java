package easy;

public class No83 {

	public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null &&cur.next != null) {
			if(cur.val == cur.next.val) {
				cur.next = cur.next.next;
			}else {
				cur = cur.next;
			}
		}
        return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
