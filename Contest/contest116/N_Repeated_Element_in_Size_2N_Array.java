package contest116;

import java.util.HashSet;
import java.util.Set;

/**
 * @author linzerong
 * @create 2018-12-23 10:35
 */
public class N_Repeated_Element_in_Size_2N_Array {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if(!set.contains(A[i])){
                set.add(A[i]);
            }else {
                return A[i];
            }
        }
        return 0;
    }
}
