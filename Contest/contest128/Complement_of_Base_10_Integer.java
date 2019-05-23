package contest128;

/**
 * @author linzerong
 * @create 2019-03-17 10:41
 */
public class Complement_of_Base_10_Integer {
    public int bitwiseComplement(int N) {
        String str = Integer.toBinaryString(N);
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == '1') {
                chs[i] = '0';
            } else {
                chs[i] = '1';
            }
        }
        int num = 1;
        int sum = 0;
        for (int i = chs.length - 1; i >= 0; i--) {
            if (chs[i] == '1') {
                sum += num;
            }
            num *= 2;
        }
        return sum;
    }

}
