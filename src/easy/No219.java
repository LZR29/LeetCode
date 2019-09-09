package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-08-09 18:40
 */
public class No219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>(len);
        for (int i = 0; i < len; i++) {
            if(map.containsKey(nums[i])){
                List<Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i], list);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
        for(int key : map.keySet()){
            List<Integer> list = map.get(key);
            if(list.size() < 2){
                continue;
            }else {
                for (int i = 0; i < list.size()-1; i++) {
                    if(Math.abs(list.get(i)-list.get(i+1)) <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
