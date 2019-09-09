package medium;

import easy.ListNode;

/**
 * @author linzerong
 * @create 2019-08-28 15:58
 */
public class No61 {

    public ListNode rotateRight(ListNode head, int k) {
        int count = 0;
        ListNode node = head;
        while (node != null){
            count++;
            node = node.next;
        }
        node = head;
        if(count == 0){
            return head;
        }
        k = k % count;
        k = count - k;
        if(k == 0 || k == count){
            return head;
        }
        ListNode newHead = head;
        ListNode pre = null;
        for (int i = 0; i < k; i++) {
            pre = newHead;
            newHead = newHead.next;
        }
        pre.next = null;
        node = newHead;
        while (node.next != null){
            node = node.next;
        }
        node.next = head;
        return newHead;
    }
}
