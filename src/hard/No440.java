package hard;

/**
 * @author linzerong
 * @create 2019-09-13 14:17
 * https://blog.csdn.net/FJJ543/article/details/81908992
 */
public class No440 {
    public int findKthNumber(int n, int k) {
        int ans = 1;
        k = k - 1;
        while (k > 0){
            long steps = 0;
            long first = ans;
            long last = ans + 1;
            while (first <= n){
                steps += Math.min(n+1, last) - first;
                first *= 10;
                last *= 10;
            }
            if(steps <= k){
                k -= steps;
                ans += 1;
            }else {
                k -= 1;
                ans *= 10;
            }
        }
        return ans;
    }
}
