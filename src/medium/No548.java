package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @author linzerong
 * @create 2019-09-18 9:22
 * https://www.bbsmax.com/A/pRdBBQyGdn/
 */
public class No548 {
    public boolean splitArray(int[] nums) {
        //这题意思就是在数组中拿3个数当做隔板，把数组分成4个和相等的子数组
        if(nums.length < 7){
            return false;
        }
        int len = nums.length;
        int[] sum = new int[len];
        sum[0] = nums[0];
        for (int i = 1; i < len; i++) {
            sum[i] = sum[i-1] + nums[i];
        }
        for (int i = 3; i < len-3 ; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 1; j < i-1; j++) {
                int sum1 = sum[j-1];
                int sum2 = sum[i-1] - sum[j];
                if(sum1 == sum2){
                    set.add(sum1);
                }
            }
            if(set.isEmpty()){
                continue;
            }
            for (int j = i+2; j < len-1; j++) {
                int sum3 = sum[j-1] - sum[i];
                int sum4 = sum[len-1] - sum[j];
                if(sum3 == sum4 && set.contains(sum3)){
                    return true;
                }
            }
        }
        return false;
    }
}
