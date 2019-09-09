package easy;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-09-02 11:42
 */
public class No1175 {
    public int numPrimeArrangements(int n) {
        //质数筛选
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i <= n; i++) {
            if(primes[i]){
                for (int j = i+i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        int countP = 0;
        for(boolean prime : primes){
            if(prime){
                countP++;
            }
        }
        int count = n - countP;
        double ans = 1;
        for (int i = 1; i <= countP; i++) {
            ans = ans * i % (1e9 + 7);
        }
        for (int i = 1; i <= count ; i++) {
            ans = ans * i % (1e9 + 7);
        }
        return (int)ans;
    }
}
