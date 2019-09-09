package medium;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-08-30 14:41
 */
public class No416 {
    public boolean canPartition(int[] nums) {
        //背包问题
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        if(sum % 2 == 1){
            return false;
        }
        return helper(nums, nums.length-1, sum/2);
    }
    public boolean helper(int[] nums, int i, int sum){
        if(i < 0 || sum < 0){
            return false;
        }
        if(sum == 0){
            return true;
        }
        if(nums[i] > sum){
            return false;
        }
        //注意先假设取这个数，然后再假设不取这个数，否则当全部数一样的时候会超时
        return helper(nums, i-1, sum-nums[i]) || helper(nums, i-1, sum);
    }
}
