package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @authoor linzerong
 * @create 2018-12-06 14:55
 */
public class No525 {
    public static int findMaxLength(int[] nums) {
        if(nums.length  <= 1) {
            return 0;
        }
        int max = 0;
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if(sum == 0){
                max = Math.max(i+1,max);
            }else if(map.containsKey(sum)){
                max = Math.max(i - map.get(sum),max);
            }else {
                map.put(sum,i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0};
        System.out.println(findMaxLength(nums));
    }
}
