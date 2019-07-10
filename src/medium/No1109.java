package medium;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-07-07 20:44
 */
public class No1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for(int[] b : bookings){
            ans[b[0] - 1] += b[2];
            if(b[1] < n){
                ans[b[1]] -= b[2];
            }
        }
        System.out.println(Arrays.toString(ans));
        for (int i = 1; i < n; i++) {
            ans[i] += ans[i-1];
        }
        return ans;
    }
}
