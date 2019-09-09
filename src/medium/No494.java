package medium;

/**
 * @author linzerong
 * @create 2019-08-30 18:54
 */
public class No494 {
    int ans = 0;
    public int findTargetSumWays(int[] nums, int S) {
        helper(nums, 0, 0, S);
        return ans;
    }
    public void helper(int[] nums, int i, int sum, int target){
        if(i == nums.length ){
            if(sum == target){
                ans++;
            }
            return;
        }
        helper(nums, i+1, sum+nums[i], target);
        helper(nums, i+1, sum-nums[i], target);

    }
}
