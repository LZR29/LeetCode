package medium;

/**
 * @author linzerong
 * @create 2019-09-13 12:35
 * 回溯超时！！！
 * 用官方的题解吧0-unknown，1-bad，2-good dp方法
 */
public class No55 {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[len-1] = 2;
        for (int i = len-2; i >= 0 ; i--) {
            int maxLen = Math.min(nums[i]+i, len-1);
            for (int j = i+1; j <= maxLen; j++) {
                if(dp[j] == 2){
                    dp[i] = 2;
                }
            }
        }
        return dp[0] == 2;
    }

}
