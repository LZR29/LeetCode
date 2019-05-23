package easy;

/**
 * @author linzerong
 * @create 2019-04-10 16:57
 */
public class No189 {
    public void rotate(int[] nums, int k) {
        int[] temps = new int[k % nums.length];
        for (int i = nums.length-temps.length,j = 0; i < nums.length; i++, j++) {
            temps[j] = nums[i];
        }
        int end = nums.length - 1;
        int pre = end - temps.length;
        while (pre >= 0){
            nums[end] = nums[pre];
            end--;
            pre--;
        }
        while (end >= 0){
            nums[end] = temps[end];
            end--;
        }
    }
}
