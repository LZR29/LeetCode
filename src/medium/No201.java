package medium;

/**
 * @author linzerong
 * @create 2019-06-22 13:03
 * 题意最终的意思就是找到m和n的二进制码的公共前缀
 */
public class No201 {
    public int rangeBitwiseAnd(int m, int n) {
        if(m == 0){
            return 0;
        }
        int i = 1;
        while(n != m){
            m >>= 1;
            n >>= 1;
            i <<= 1;
        }
        return m * i;
    }
}
