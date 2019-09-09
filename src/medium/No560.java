package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-08-17 11:32
 */
public class No560 {

    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int[] sum = new int[nums.length+1];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i-1] + nums[i-1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sum.length; i++) {
            if(map.containsKey(sum[i]-k)){
                ans += map.get(sum[i]-k);
            }
            map.put(sum[i], map.getOrDefault(sum[i], 0)+1);
        }
        return ans;
    }
}
