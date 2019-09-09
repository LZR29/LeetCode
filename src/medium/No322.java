package medium;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-09-07 8:48
 */
public class No322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(i >= coins[j]){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        if(dp[amount] > amount){
            return -1;
        }
        return dp[amount];
    }
}
