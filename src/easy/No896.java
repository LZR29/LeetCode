package easy;

/**
 * @author linzerong
 * @create 2018-12-26 10:00
 */
public class No896 {
    public boolean isMonotonic(int[] A) {
        if(A.length == 1) {
            return true;
        }
        for (int i = 1; i < A.length; i++) {
            if(A[i-1] > A[i]){
                for (int j = i+1; j < A.length; j++) {
                    if(A[j-1] < A[j]){
                        return false;
                    }
                }
            } else if(A[i-1] < A[i]){
                for (int j = i+1; j < A.length; j++) {
                    if(A[j-1] > A[j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
