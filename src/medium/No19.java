package medium;

import easy.ListNode;

/**
 * @author linzerong
 * @create 2019-08-09 11:16
 */
public class No19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nHead = new ListNode(-1);
        nHead.next = head;
        ListNode l1 = nHead, l2 = nHead;
        for (int i = 0; i <= n; i++) {
            l1 = l1.next;
        }
        while (l1 != null){
            l1 = l1.next;
            l2 = l2.next;
        }
        l2.next = l2.next.next;
        return nHead.next;
    }
}
