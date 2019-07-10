package bytedance.array_sort;

/**
 * @author linzerong
 * @create 2019-07-10 16:53
 */
public class No3 {
    public int search(int[] nums, int target) {
        return helper(nums,0,nums.length-1,target);
    }
    public int helper(int[] nums, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if(target == nums[mid]){
            return mid;
        }
        if(nums[mid] < nums[end]){
            if(target <= nums[end] && target > nums[mid]){
                return helper(nums,mid+1,end,target);
            }else {
                return helper(nums,start,mid-1,target);
            }
        }else {
            if(nums[mid] > target && target >= nums[start]){
                return helper(nums,start,mid-1,target);
            }else {
                return helper(nums,mid+1,end,target);
            }
        }
    }
}
