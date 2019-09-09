package medium;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-08-08 13:02
 */
public class No16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r){
                int cur = nums[i] + nums[l] + nums[r];
                if(Math.abs(target - sum) > Math.abs(target - cur)) {
                    sum = cur;
                }
                if(cur > target){
                    r--;
                }else if (cur < target){
                    l++;
                }else {
                    return sum;
                }

            }
        }
        return sum;
    }
}
