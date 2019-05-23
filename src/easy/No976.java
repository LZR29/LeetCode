package easy;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-01-17 22:27
 */
public class No976 {
    public int largestPerimeter(int[] A) {
        int len = A.length;
        Arrays.sort(A);
        int a, b, c;
        for (int i = len - 1; i >= 2; i--) {
            a = A[i];
            b = A[i-1];
            c = A[i-2];
            if(a < b + c){
                return a + b + c;
            }
        }
        return 0;
    }
}
