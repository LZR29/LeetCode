package medium;

/**
 * @author linzerong
 * @create 2019-08-09 12:00
 */
//太难了,没过！！！
public class No29 {

    public int divide(int dividend, int divisor) {
        //排除特殊情况
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(dividend == Integer.MIN_VALUE && divisor == 1){
            return Integer.MIN_VALUE;
        }
        int flag = 1;
        if(dividend < 0){
            dividend = -dividend;
            flag = -1 * flag;
        }
        if(divisor < 0){
            divisor = -divisor;
            flag = -1 * flag;
        }
        int ans = 0;
        long cur = 0;
        int k = 1;
        long dd = dividend;
        long dr = divisor;
        while (cur <= dd){
            ans += k;
            cur += dr;
            dr *= 2;
            k *= 2;
        }
        while (cur > dd){
            cur -= dr;
            ans--;
        }
        return ans * flag;
    }
}
