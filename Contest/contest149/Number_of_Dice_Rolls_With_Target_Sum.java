package contest149;

import java.util.Arrays;
import java.util.Date;

/**
 * @author linzerong
 * @create 2019-08-11 10:36
 */
public class Number_of_Dice_Rolls_With_Target_Sum {
    public int numRollsToTarget(int d, int f, int target) {
        if(target > d * f){
            return 0;
        }
        int[][] dp = new int[d+1][d*f+1];

        for(int i = 1; i <= f; i++){
            dp[1][i] = 1;
        }
        for (int i = 2; i <= d; i++) {
            int max = i * f;
            for (int j = i; j <= max; j++) {
                for (int k = 1; k <= f; k++) {
                    if(j - k >= 0){
                        dp[i][j] += dp[i-1][j-k];
                        dp[i][j] %= 1000000007 ;
                    }else {
                        break;
                    }
                }
            }
        }

        return (dp[d][target] % 1000000007 );
    }


}
