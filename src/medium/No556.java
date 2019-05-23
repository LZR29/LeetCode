package medium;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @author linzerong
 * @create 2019-03-23 15:29
 */
public class No556 {
    public static int nextGreaterElement(int n) {
        char[] number = (n + "").toCharArray();
        int i, j;
        for (i = number.length-1; i > 0; i--) {
            if (number[i-1] < number[i]) {
                break;
            }
        }
        if (i == 0) {
            return -1;
        }
        int x = number[i-1], smallest = i;
        for (j = i+1; j < number.length; j++) {
            if (number[j] > x && number[j] <= number[smallest]) {
                smallest = j;
            }
        }
        char temp = number[i-1];
        number[i-1] = number[smallest];
        number[smallest] = temp;
        Arrays.sort(number, i, number.length);
        long val = Long.parseLong(new String(number));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }
    public static void main(String[] args) {
        int i = 1999999999;
        System.out.println(nextGreaterElement(i));
    }
}
