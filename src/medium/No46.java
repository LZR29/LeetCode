package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-08-14 14:43
 */
public class No46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        helper(ans, cur, 0, nums);
        return ans;
    }

    public void helper(List<List<Integer>> ans , List<Integer> cur, int i, int[] nums){
        if(i >= nums.length){
            ans.add(cur);
            return;
        }
        for (int j = i; j < nums.length; j++) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            cur.add(nums[i]);
            helper(ans, new ArrayList<>(cur), i+1, nums);
            cur.remove(cur.size()-1);
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

}
