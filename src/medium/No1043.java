package medium;

/**
 * @author linzerong
 * @create 2019-05-13 10:31
 * 参考：https://leetcode.com/problems/partition-array-for-maximum-sum/discuss/291057/Java-visualize-the-pattern
 */
public class No1043 {
    public int maxSumAfterPartitioning(int[] A, int K) {
        int len = A.length;
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            int curMax = Integer.MIN_VALUE;
            for (int k = 1; k <= K && i - k + 1 >= 0; ++k) {
                curMax = Math.max(curMax, A[i - k + 1]);
                dp[i] = Math.max(dp[i], (i >= k ? dp[i - k] : 0) + curMax * k);
            }
        }
        return dp[len-1];
    }
}

