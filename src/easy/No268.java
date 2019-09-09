package easy;

/**
 * @author linzerong
 * @create 2019-08-24 11:43
 */
public class No268 {
    public int missingNumber(int[] nums) {
        int sum1 = nums.length * (nums.length + 1) / 2;
        int sum2 = 0;
        for(int i : nums){
            sum2 += i;
        }
        return sum1 - sum2;
    }
}
