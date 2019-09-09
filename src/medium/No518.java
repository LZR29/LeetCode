package medium;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-09-07 9:20
 */
public class No518 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if(i >= coin){
                    dp[i] += dp[i-coin];
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount];
    }
}
