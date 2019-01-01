package easy;

/**
 * @authoor linzerong
 * @create 2019-01-01 11:53
 */
public class No171 {
    public int titleToNumber(String s) {
        int sum = 0;
        String letter = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            sum *= 26;
            sum += letter.indexOf(s.charAt(i));
        }
        return sum;
    }
}
