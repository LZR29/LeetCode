package medium;

import easy.ListNode;

import java.util.Random;

/**
 * @author linzerong
 * @create 2019-09-16 12:58
 */
public class No382 {
    ListNode node ;
    public No382(ListNode head) {
        node = head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        ListNode cur = node.next;
        ListNode res = node;
        int i = 2;
        Random random = new Random();
        while (cur != null){
            int k = random.nextInt(i);
            if(k == 0){
                res = cur;
            }
            cur = cur.next;
            i++;
        }
        return res.val;
    }
}
