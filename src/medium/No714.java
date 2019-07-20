package medium;

public class No714 {
	
	public static int maxProfit(int[] prices, int fee) {
        int pro = 0;
        int curPro = 0;
        int max = prices[0], min = prices[0];
        for (int i = 1; i < prices.length; i++) {
			min = Math.min(min, prices[i]);
			max = Math.max(max, prices[i]);
			curPro = Math.max(curPro, prices[i]-min-fee);
			if(max - prices[i] >= fee) {
				pro += curPro;
				curPro = 0;
				max = prices[i];
				min = prices[i];
			}
		}
        return pro + curPro;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1,3,2,8,6,9};
		int fee = 2;
//		Arrays.sort(prices);
		System.out.println(maxProfit(prices, fee));
	}

    /**
    * 使用穷举框架，状态机
    */
    public int maxProfit2(int[] prices, int fee) {
        int n = prices.length;
        if (n <= 1){
           return 0;
        }
        int[][] dp = new int[n][2];
         for (int i = 0; i < n; i++) {
             if (i == 0){
                 dp[i][0] = 0;
                 dp[i][1] = -prices[i];
                 continue;
             }
             dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i] - fee);
             dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
         }
         return dp[n-1][0];
    }
}
