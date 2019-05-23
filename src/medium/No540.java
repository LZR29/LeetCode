package medium;

/**
 * @author linzerong
 * @create 2019-03-23 12:06
 */
public class No540 {
    public int singleNonDuplicate(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public int helper(int[] nums ,int start, int end){
        if(start >= end){
            return -1;
        }
        int mid = (start + end) / 2;
        if(mid <= 0 ){
            return nums[mid] == nums[mid+1] ? -1 : nums[mid];
        }
        if(mid >= nums.length - 1){
            return nums[mid] == nums[mid-1] ? -1 : nums[mid];
        }
        if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
            return nums[mid];
        }
        int ans = helper(nums,start,mid-1);
        return ans == -1 ? helper(nums,mid+1,end) : ans;
    }
}
