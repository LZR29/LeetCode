package medium;

/**
 * @authoor linzerong
 * @create 2019-03-15 17:34
 */
public class No33 {
    public static int search(int[] nums, int target) {
        return helper(nums,0,nums.length-1,target);
    }
    public static int helper(int[] nums, int start, int end, int target){
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
    public static void main(String[] args) {

    }
}
