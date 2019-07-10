package medium;

/**
 * @author linzerong
 * @create 2019-06-22 15:43
 */
public class No1004 {
    public int longestOnes(int[] A, int K) {
        int i = 0;
        int zeros = 0;
        int max = 0;
        for(int j = 0; j < A.length; j++){
            if(A[j] == 0){
                zeros++;
            }
            while(zeros > K){
                if(A[i] == 0){
                    zeros--;
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
