package contest114;

import java.util.*;

/**
 * @authoor linzerong
 * @create 2018-12-09 11:03
 * wrong answer!!!!!!
 */
public class Array_of_Doubled_Pairs {

    public static boolean canReorderDoubled(int[] A) {
        if(A.length == 0){
            return true;
        }
        int len = A.length;
        Map<Integer,Integer> pos = new TreeMap<>();     //整数
        Map<Integer,Integer> neg = new TreeMap<>();     //负数
        for (int i = 0; i < len; i++) {
            if (A[i] < 0) {
                neg.put(A[i], neg.getOrDefault(A[i], 0) + 1);
            }
            else {
                pos.put(A[i], pos.getOrDefault(A[i], 0) + 1);
            }
        }
        for (int x : pos.keySet()) {
            if (pos.get(x) > 0) {
                if (pos.get(x) > pos.getOrDefault(2 * x, 0)) {
                    return false;
                }
                pos.put(2 * x, pos.get(2 * x) - pos.get(x));
            }
        }
        for (int x : neg.keySet()) {
            if (neg.get(x) > 0) {
                if (neg.get(x) > neg.getOrDefault(x / 2, 0)) {
                    return false;
                }
                neg.put(x / 2, neg.get(x / 2) - neg.get(x));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {};
        System.out.println(canReorderDoubled(A));
    }
}
