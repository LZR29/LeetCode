package medium;

/**
 * @author linzerong
 * @create 2019-04-10 21:12
 */
public class No334 {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        int small = Integer.MAX_VALUE,big = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= small){
                small = nums[i];
            }else if(nums[i] <= big){
                big = nums[i];
            }else {
                return true;
            }
        }
        return false;
    }
}
