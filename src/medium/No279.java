package medium;

import java.util.Arrays;

/**
 * @authoor linzerong
 * @create 2018-12-14 22:55
 */
public class No279 {

    public static int numSquares(int n) {
        int[] counts = new int[n+1];
        Arrays.fill(counts,Integer.MAX_VALUE);
        counts[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j*j <= i; j++) {
                counts[i] = Math.min(counts[i],counts[i-j*j]+1);
            }
        }
        return counts[n];
    }

    public static void main(String[] args) {

    }
}
