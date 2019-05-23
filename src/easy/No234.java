package easy;

/**
 * @author linzerong
 * @create 2019-04-16 19:44
 */
public class No234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //奇数个节点
        if(fast.next == null){
            slow = slow.next;
        }
        ListNode node = null;
        ListNode reHead = null;
        //反转中点
        while (slow != null){
            node = slow.next;
            slow.next = reHead;
            reHead = slow;
            slow = node;
        }
        while (reHead != null && head != null){
            if(reHead.val != head.val){
                return false;
            }
            reHead = reHead.next;
            head = head.next;
        }
        return true;
    }

}
