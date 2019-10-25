package hard;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-09-15 10:12
 */
public class No1121 {
    public boolean canDivideIntoSubsequences(int[] nums, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int maxCount = 0;
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
            maxCount = Math.max(maxCount, map.get(i));
        }
        return len >= maxCount * K;
    }
}
