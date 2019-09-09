package medium;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-08-10 11:48
 */
public class No611 {

    public boolean helper(int a, int b, int c){
        return a+b > c && b-a < c;
    }
    //暴力解法
    public int triangleNumber(int[] nums) {
        int count = 0;
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len-2; i++) {
            for (int j = i+1; j < len-1; j++) {
                for (int k = j+1; k < len; k++) {
                    if(helper(nums[i], nums[j], nums[k])){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    //双指针
    public int triangleNumber2(int[] nums) {
        int count = 0;
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = len-1; i > 1; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right){
                if(nums[left]+nums[right] > nums[i]){
                    //说明从l到r-1这么多个数能和nums[r]和nums[i]组成三角形
                    count += right - left;
                    right--;
                }else {
                    left++;
                }
            }
        }
        return count;
    }

}
