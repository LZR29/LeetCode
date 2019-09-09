package bicontest6;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-08-10 22:30
 */
public class Check_If_a_Number_Is_Majority_Element_in_a_Sorted_Array {
    public boolean isMajorityElement(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        if(map.containsKey(target) && map.get(target) > len / 2){
            return true;
        }
        return false;
    }
}
