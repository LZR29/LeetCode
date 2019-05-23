package contest127;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-03-10 10:31
 */
public class Maximize_Sum_Of_Array_After_K_Negations {
    public int largestSumAfterKNegations(int[] A, int K) {
        List<Integer> less = new ArrayList<>();
        List<Integer> more = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] > 0){
                more.add(A[i]);
            }else {
                less.add(A[i]);
            }
        }
        if(K - less.size() >= 0){
            K = K - less.size();
            for(int i : less){
                more.add(-i);
            }
            if(K % 2 == 0){
                for(int i : more){
                    sum += i;
                }
            }else {
                int min = Integer.MAX_VALUE;
                for(int i : more){
                    min = Math.min(min,i);
                    sum += i;
                }
                sum -= 2 * min;
            }
        }else {
            Collections.sort(less);
            for(int i : less){
                if(K > 0){
                    sum -= i;
                    K--;
                }else {
                    sum += i;
                }
            }
            for(int i : more){
                sum += i;
            }
        }
        return sum;
    }
}
