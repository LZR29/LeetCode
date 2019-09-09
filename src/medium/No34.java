package medium;

/**
 * @author linzerong
 * @create 2019-08-16 18:20
 */
public class No34 {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        int leftIdx = helper(nums, target, true);
        if(leftIdx >= nums.length || nums[leftIdx] != target){
            return ans;
        }
        int rightIdx = helper(nums, target, false);
        ans[0] = leftIdx;
        ans[1] = rightIdx - 1;
        return ans;
    }

    public int helper(int[] nums, int target, boolean left){
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else {
                if(left){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return start;
    }

}
