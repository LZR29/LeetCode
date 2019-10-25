package easy;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author linzerong
 * @create 2019-09-17 9:57
 */
public class No703 {
    int k ;
    PriorityQueue<Integer> queue ;
    public No703(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }
        while (queue.size() > k){
            queue.poll();
        }
    }

    public int add(int val) {
        if(queue.size() < k){
            queue.add(val);
        }else if(queue.peek() < val){
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }
}
