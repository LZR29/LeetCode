package easy;

/**
 * @authoor linzerong
 * @create 2019-04-16 20:26
 */
public class No160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        int countA = 1;
        int countB = 1;
        while (curA.next != null || curB.next != null){
            if(curA.next != null) {
                curA = curA.next;
                countA++;
            }
            if(curB.next != null){
                curB = curB.next;
                countB++;
            }
        }
        if(curA != curB){
            return null;
        }
        if(countA < countB){
            ListNode node = headA;
            headA = headB;
            headB = node;
        }
        int dif = Math.abs(countA - countB);
        while (dif > 0){
            headA = headA.next;
            dif--;
        }
        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
