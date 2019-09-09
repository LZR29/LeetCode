package medium;

/**
 * @author linzerong
 * @create 2019-08-23 10:32
 */
public class No866 {
    public int primePalindrome(int N) {
        while (true) {
            if (N == reverse(N) && isPrime(N)) {
                return N;
            }
            N++;
            //这个范围没有素数
            if (10_000_000 < N && N < 100_000_000) {
                N = 100_000_000;
            }
        }
    }

    public boolean isPrime(int N) {
        //素数
        if (N < 2) {
            return false;
        }
        int R = (int) Math.sqrt(N);
        for (int d = 2; d <= R; ++d) {
            if (N % d == 0) {
                return false;
            }
        }
        return true;
    }


    public int reverse(int N) {
        //回文，也可以计算一半长度的N然后判断
        int ans = 0;
        while (N > 0) {
            ans = 10 * ans + (N % 10);
            N /= 10;
        }
        return ans;
    }
}
