package contest157;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-10-06 11:24
 */
public class Count_Vowels_Permutation {
    public int countVowelPermutation(int n) {
        int MOD = 1000000007;
        long[] countA = new long[n+1];
        long[] countE = new long[n+1];
        long[] countI = new long[n+1];
        long[] countO = new long[n+1];
        long[] countU = new long[n+1];
        countA[1] = 1;
        countE[1] = 1;
        countI[1] = 1;
        countO[1] = 1;
        countU[1] = 1;
        for (int i = 2; i <= n; i++) {
            countA[i] = (countE[i-1] + countI[i-1] + countU[i-1]) % MOD;
            countE[i] = (countA[i-1] + countI[i-1]) % MOD;
            countI[i] = (countE[i-1] + countO[i-1]) % MOD;
            countO[i] = countI[i-1] % MOD;
            countU[i] = (countI[i-1] + countO[i-1]) % MOD;
        }
        long ans = 0;
        ans = (ans + countA[n]) % MOD;
        ans = (ans + countE[n]) % MOD;
        ans = (ans + countI[n]) % MOD;
        ans = (ans + countO[n]) % MOD;
        ans = (ans + countU[n]) % MOD;
        return (int) ans;
    }
}
