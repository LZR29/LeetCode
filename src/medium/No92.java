package medium;

import easy.ListNode;

/**
 * @author linzerong
 * @create 2019-09-16 13:15
 */
public class No92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode node = res;
        //找出要反转的前一个节点
        int index = 1;
        while (index < m){
            node = node.next;
            index++;
        }
        //反转起点
        ListNode start = node.next;
        ListNode pre = null;
        ListNode next = null;
        index = 0;
        //反转
        while (index <= n-m){
            next = start.next;
            start.next = pre;
            pre = start;
            start = next;
            index++;
        }
        //需要反转的那一段的上一个节点的next节点指向反转后链表的头结点
        node.next = pre;
        //找到反转这段的最后一个节点。
        while (pre.next != null) {
            pre = pre.next;
        }
        //把剩下的接上
        pre.next = next;
        return res.next;
    }
}
