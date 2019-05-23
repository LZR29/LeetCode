package easy;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-01-22 21:58
 */
public class No977 {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
