package medium;

/**
 * @author linzerong
 * @create 2019-08-09 12:40
 */
public class No31 {

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int index = -1;
        for (int i = len-1; i > 0; i--) {
            if(nums[i] > nums[i-1]){
                index = i-1;
                break;
            }
        }
        if(index >= 0){
            int j = nums.length - 1;
            while (j > index && nums[j] <= nums[index]) {
                j--;
            }
            int temp = nums[index];
            nums[index] = nums[j];
            nums[j] = temp;
        }
        reverse(nums, index+1);
    }
    void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
