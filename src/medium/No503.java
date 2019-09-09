package medium;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author linzerong
 * @create 2019-09-04 19:03
 */
public class No503 {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        Arrays.fill(ans, -1);
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 2*len-1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i%len] >= nums[stack.peek()%len]){
                stack.pop();
            }
            ans[i%len] = stack.isEmpty()? -1 : nums[stack.peek()%len];
            stack.push(i);
        }
        return ans;
    }
}
