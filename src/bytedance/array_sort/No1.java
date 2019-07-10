package bytedance.array_sort;

import union_find.UF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-07-10 13:16
 */
public class No1 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if(nums == null || len < 3){
            return ans;
        }
        for (int i = 0; i < len; i++) {
            //大于0就可以结束了
            if(nums[i] > 0){
                break;
            }
            //去掉重复的
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            //从这个数后面再找两个数出来
            int left = i + 1;
            int rigth = len - 1;
            while (left < rigth){
                int sum = nums[i] + nums[left] + nums[rigth];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[rigth]));
                    //去重
                    while (left < rigth && nums[left] == nums[left+1]){
                        left++;
                    }
                    while (left < rigth && nums[rigth] == nums[rigth-1]){
                        rigth--;
                    }
                    left++;
                    rigth--;
                }else if (sum < 0){
                    left++;
                }else if (sum > 0){
                    rigth--;
                }

            }
        }
        return ans;
    }
}
