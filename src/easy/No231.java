package easy;

/**
 * @author linzerong
 * @create 2019-08-28 12:15
 */
public class No231 {
    public boolean isPowerOfTwo(int n) {
        //2次幂，n与n-1等于0。1000000 & 0111111 === 0
        return n > 0 && (n & (n-1)) == 0;
    }
}
