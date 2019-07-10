package bytedance.string;

import java.math.BigInteger;

/**
 * @author linzerong
 * @create 2019-07-09 22:34
 * https://leetcode.com/problems/multiply-strings/discuss/17605/Easiest-JAVA-Solution-with-Graph-Explanation
 */
public class No4 {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] ans = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0 ; i--) {
            for (int j = len2 - 1; j >= 0 ; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                mul += ans[p2];
                ans[p1] += mul / 10;
                ans[p2] = mul % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int p : ans) {
            if(!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
