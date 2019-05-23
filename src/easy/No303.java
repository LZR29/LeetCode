package easy;

/**
 * @author linzerong
 * @create 2019-03-16 13:06
 */
public class No303 {
    int[] sums;
    public No303(int[] nums) {
        if(nums.length == 0){
            sums = nums;
        }
        sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = nums[i] + sums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        if(i == 0){
            return sums[j];
        }
        return sums[j] - sums[i-1];
    }
}
