package easy;

/**
 * @author linzerong
 * @create 2018-12-25 20:05
 */
public class No876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next != null){
            return slow.next;
        }
        return slow;
    }
}
