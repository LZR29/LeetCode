package medium;

/**
 * @author linzerong
 * @create 2019-08-30 8:36
 */
public class No918 {
    public int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSum = -30000, curMax = 0, minSum = 30000, curMin = 0;
        for(int i : A){
            curMax = Math.max(i, curMax+i);
            maxSum = Math.max(curMax, maxSum);
            curMin = Math.min(i, curMin+i);
            minSum = Math.min(curMin, minSum);
            total += i;
        }
        if(maxSum <= 0){
            return maxSum;
        }
        return Math.max(total-minSum, maxSum);
    }
}
