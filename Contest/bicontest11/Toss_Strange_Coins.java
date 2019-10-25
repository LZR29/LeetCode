package bicontest11;

/**
 * @author linzerong
 * @create 2019-10-20 10:27
 */
public class Toss_Strange_Coins {
    public double probabilityOfHeads(double[] prob, int target) {
        //dp[c][k] = dp[c - 1][k] * (1 - p) + dp[c - 1][k - 1] * p)
        int len = prob.length;
        double[][] dp = new double[len][len+1];
        dp[0][0] = 1 - prob[0];
        dp[0][1] = prob[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = dp[i-1][0] * (1 - prob[i]);
        }
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j < len; j++) {
                dp[j][i] = dp[j-1][i-1] * prob[j] + dp[j-1][i] * (1 - prob[j]);
            }
        }
        return dp[len-1][target];
    }
}
