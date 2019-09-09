package bicontest7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author linzerong
 * @create 2019-08-24 22:51
 */
public class Minimum_Cost_to_Connect_Sticks {
    public int connectSticks(int[] sticks) {
        int n = sticks.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int ans = 0;
        for(int i : sticks){
            queue.add(i);
        }
        while (queue.size() > 1){
            int x1 = queue.poll();
            int x2 = queue.poll();
            ans += x1 + x2;
            queue.add(x1+x2);
        }
        return ans;
    }
}
