package medium;

import easy.ListNode;

/**
 * @author linzerong
 * @create 2019-08-09 11:53
 */
public class No24 {

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
