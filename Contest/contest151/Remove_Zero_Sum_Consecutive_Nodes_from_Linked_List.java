package contest151;

import easy.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-08-25 11:00
 */
public class Remove_Zero_Sum_Consecutive_Nodes_from_Linked_List {

    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        List<Integer> ans = new ArrayList<>();
        while (true){
            boolean flag = false;
            int sum[] = new int[list.size()];
            sum[0] = list.get(0);
            for(int i = 1;i<list.size();i++) {
                sum[i] = list.get(i)+sum[i-1];
            }
            for(int i = 0;i<sum.length;i++){
                boolean bre = false;
                for(int j = i;j<sum.length;j++){
                    if(sum[j]-sum[i]+list.get(i)==0){
                        deal(list,i,j);
                        bre = true;
                        flag = true;
                        break;
                    }
                }
                if(bre) {
                    break;
                }
            }
            ans.clear();
            ans.addAll(list);
            if(!flag||ans.size()==0) {
                break;
            }
        }
        if(ans.size()==0) {
            return null;
        } else{
            ListNode res = new ListNode(ans.get(0));
            ListNode t = res;
            for(int i = 1;i<ans.size();i++){
                t.next = new ListNode(ans.get(i));
                t = t.next;
                t.next = null;
            }
            return res;
        }
    }

    private void deal(List<Integer> list, int start, int end) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<list.size();i++){
            if(i>=start&&i<=end) {
                continue;
            } else {
                res.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(res);
    }
}
