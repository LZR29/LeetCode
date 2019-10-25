package medium;

import java.util.Random;

/**
 * @author linzerong
 * @create 2019-09-16 13:07
 */
public class No398 {
    int[] nums ;
    public No398(int[] nums) {
        nums = nums;
    }

    public int pick(int target) {
        Random random = new Random();
        int i = 0;
        for(; i < nums.length; i++){
            if(nums[i] == target){
                break;
            }
        }
        int count = 2;
        for (int j = i+1; j < nums.length; j++) {
            if(nums[j] == target){
                int k = random.nextInt(count);
                if(k == 0){
                    i = j;
                }
                count++;
            }
        }
        return i;
    }
}
