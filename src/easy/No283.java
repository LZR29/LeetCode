package easy;

/**
 * @author linzerong
 * @create 2019-04-10 17:20
 */
public class No283 {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int i = 0;
        for (int j = 0; j < len; j++) {
            if(nums[j] != 0){
                nums[i++] = nums[j];
            }
        }
        while (i < len){
            nums[i++] = 0;
        }
    }
}
