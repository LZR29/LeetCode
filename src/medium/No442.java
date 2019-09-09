package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-08-09 18:48
 */
public class No442 {


    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int index = (nums[i] - 1) % len;
            nums[index] += len;
        }
        int k = len * 2;
        for (int i = 0; i < len; i++) {
            if(nums[i] > k){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
