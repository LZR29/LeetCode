package bytedance.array_sort;

/**
 * @author linzerong
 * @create 2019-07-10 17:22
 */
public class No4 {
    public int findLengthOfLCIS(int[] nums) {
        int start = 0;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[i-1]){
                max = Math.max(max, i - start);
                start = i;
            }
        }
        max = Math.max(max, nums.length - start);
        return max;
    }
}
