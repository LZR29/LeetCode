package medium;

/**
 * @author linzerong
 * @create 2019-08-08 12:46
 */
public class No8 {

    public int myAtoi(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        str = str.trim();
        if(str.length() == 0) {
            return 0;
        }
        char firstChar = str.charAt(0);
        int flag = 1;
        int start = 0, len = str.length();
        long sum = 0;
        if (firstChar == '+') {
            flag = 1;
            start++;
        } else if (firstChar == '-') {
            flag = -1;
            start++;
        }
        for (int i = start; i < len; i++) {
            //第i位不为数字就返回了
            if (!Character.isDigit(str.charAt(i))) {
                return (int) sum * flag;
            }
            sum = sum * 10 + str.charAt(i) - '0';
            if (flag == 1 && sum > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (flag == -1 && (-1) * sum < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) sum*flag;
    }
}
