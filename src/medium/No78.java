package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-03-18 21:25
 */
public class No78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans,new ArrayList<Integer>());
        return ans;
    }
    public void helper(int[] nums, int i, List<List<Integer>> ans, List<Integer> cur){
        ans.add(new ArrayList<>(cur));
        for (int j = i; j < nums.length; j++) {
            cur.add(nums[j]);
            helper(nums,j+1,ans,cur);
            cur.remove(cur.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        No78 no78 = new No78();
        List<List<Integer>> ans = no78.subsets(nums);
        List<Integer> nums1 = new ArrayList<Integer>();

        System.out.println(ans.toString());
    }
}
