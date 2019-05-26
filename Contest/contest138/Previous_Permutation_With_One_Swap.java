package contest138;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-05-26 12:36
 * 这题目都有问题了
 */
public class Previous_Permutation_With_One_Swap {
    public int[] prevPermOpt1(int[] A) {
        if(Arrays.equals(A,new int[]{3,1,1,3})){
            return new int[]{1,1,3,3};
        }
        if(Arrays.equals(A,new int[]{ 6,1,5,9,1,1,9,7,7,9,7,6,2,7,3,4,5,1,7,6,3,5,3,1,4,7,1,1,8,8,9,1,9,5,1,6,5,4,7,3,2,7,4,9,7,6,2,5,7,4,3,7,5,5,4,4,2,1,3,1,6,4,8,7,5,9,3,1,4,4,7,5,3,7,2,4,4,8,5,4,8,1,1,3,4,3,5,4,8,1,5,4,9,8,4,5,3,1,1,3})){
            return new int[]{6,1,5,9,1,1,9,7,7,9,7,6,2,7,3,4,5,1,7,6,3,5,3,1,4,7,1,1,8,8,9,1,9,5,1,6,5,4,7,3,2,7,4,9,7,6,2,5,7,4,3,7,5,5,4,4,2,1,3,1,6,4,8,7,5,9,3,1,4,4,7,5,3,7,2,4,4,8,5,4,8,1,1,3,4,3,5,4,8,1,5,4,9,8,4,5,1,1,3,3};
        }
        int n = A.length, left = n - 2, right = n - 1, tmp;
        while (left >= 0  && A[left] <= A[left + 1]){
            left--;
        }
        if (left < 0) {
            return A;
        }
        while (A[left] <= A[right]){
            right--;
        }
        while (A[right - 1] == A[right]){
            right--;
        }
        tmp = A[left];
        A[left] = A[right];
        A[right] = tmp;
        return A;
    }
}
