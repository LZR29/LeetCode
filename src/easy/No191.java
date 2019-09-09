package easy;

/**
 * @author linzerong
 * @create 2019-08-24 11:29
 */
public class No191 {
    public int hammingWeight(int n) {
        int ans = 0;
        int mask = 1;
        for(int i = 0; i < 32; i++){
            if((n & mask) == 1){
                ans++;
            }
            n >>= 1;
        }
        return ans;
    }
}
