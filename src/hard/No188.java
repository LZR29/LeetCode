package hard;

/**
 * @author linzerong
 * @create 2019-07-20 22:51
 */
public class No188 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if(n <= 1){
            return 0;
        }
        //因为提交会超出内存，所以这里优化下，就是当k大于数组长度的一半时，就是可以看做是无数次买卖了
        if (k > n / 2){
            int max = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i-1]){
                    max += prices[i] - prices[i-1];
                }
            }
            return max;
        }
        int[][][] dp = new int[n][k+1][2];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if(i == 0){
                    dp[i][j][0] = 0;
                    dp[i][j][1] = -prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i-1][j][0], dp[i-1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][0] - prices[i]);
            }
        }
        return dp[n-1][k][0];
    }
}
