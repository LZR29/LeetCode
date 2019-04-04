package medium;

/**
 * @authoor linzerong
 * @create 2019-03-23 14:54
 */
public class No238 {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int left = 1;
        int right = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length-1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }
}
