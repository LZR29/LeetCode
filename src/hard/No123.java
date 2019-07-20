package hard;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-07-20 22:18
 * 参考：
 * https://mp.weixin.qq.com/s?__biz=MzU0MDg5OTYyOQ==&mid=2247484079&idx=1&sn=4a90da2b16be911394e418ad21b232ab&chksm=fb3362edcc44ebfbec433ff322a9a7e2708ef6390ad87510fd7e765421dd6f702aaf0bb9edb8&mpshare=1&scene=1&srcid=&key=acb0d941f6b05235a52411ed6925e9c53b7a2f5fcb1b7df4f6a35bccb21e8fc2afcd2e95a89420bb5dfd092d6ba1c2496ead788bffabf6103a1f554a9ac164b4812c77b2bfb5566352a7d1ac5661514d&ascene=1&uin=MjMwOTgxNjI4Mg%3D%3D&devicetype=Windows+8&version=62060834&lang=zh_CN&pass_ticket=xoGWRb3QOALAFcSWcRpfQjlQ96SliHLkWZNJ0QVjJgegaTCOuejTiB3Saqy%2BeDAJ
 * 全部股票问题一次框架解决
 */
public class No123 {
    public int maxProfit(int[] prices) {
        int k = 2;
        int n = prices.length;
        if (n < 1) {
            return 0;
        }
        int[][][] dp = new int[n][k+1][2];
        for (int i = 0; i < n; i++) {
            for (int j = k; j >= 1; j--){
                if(i == 0){
                    dp[i][j][0] = 0;
                    dp[i][j][1] = -prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i-1][j][0], dp[i-1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][0] - prices[i]);
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[n-1][k][0];
    }
}
