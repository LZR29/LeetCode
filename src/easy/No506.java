package easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author linzerong
 * @create 2019-05-12 15:36
 */
public class No506 {
    public String[] findRelativeRanks(int[] nums) {
        String[] ans = new String[nums.length];
        int[][] p = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            p[i][0] = nums[i];
            p[i][1] = i;
        }
        Arrays.sort(p, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        for (int i = 0; i < p.length; i++) {
            if(i == 0){
                ans[p[i][1]] = "Gold Medal";
            }else if(i == 1){
                ans[p[i][1]] = "Silver Medal";
            }else if(i == 2){
                ans[p[i][1]] = "Bronze Medal";
            }else {
                ans[p[i][1]] = (i + 1) + "";
            }
        }
        return ans;
    }
}
