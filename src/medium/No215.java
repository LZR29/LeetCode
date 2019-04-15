package medium;

import java.util.PriorityQueue;

/**
 * @authoor linzerong
 * @create 2019-04-15 13:10
 */
public class No215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            if(i < k){
                queue.add(nums[i]);
            }else {
                int min = queue.poll();
                queue.add(Math.max(min,nums[i]));
            }
        }
        return queue.peek();
    }
}
