package bicontest5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-07-27 22:30
 */
public class Largest_Unique_Number {

    public int largestUniqueNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        boolean flag = true;
        for(int k : map.keySet()){
            if(map.get(k) == 1) {
                max = Math.max(k, max);
                flag = false;
            }
        }
        if(flag) {
            return -1;
        }
        return max;
    }

}
