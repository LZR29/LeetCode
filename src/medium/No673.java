package medium;

/**
 * @author linzerong
 * @create 2019-09-19 9:08
 */
public class No673 {
    public int findNumberOfLIS(int[] nums) {
        //两者之间的关系：对于i>j,nums[i]>nums[j]的时候，如果len[j]+1>len[i]，说明第一次找到len[j]+1长度且以nums[i]结尾的最长递增子序列，则count[i]=count[j]（以nums[i]结尾的最长递增子序列的组合方式就等于nums[j]目前的组合方式）;
        //如果len[j]+1==len[i]说明这个长度的递增序列已找到过一次了，则count[i]+=count[j]（现有的组合方式个数加上count[j]的组合方式，即为总的组合方式个数）
        int n = nums.length;
        int[] len = new int[n];
        int[] counts = new int[n];
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            len[i] = 1;
            counts[i] = 1;
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]){
                    if(len[j] + 1 == len[i]){
                        counts[i] += counts[j];
                    }else if(len[j] + 1 > len[i]){
                        len[i] = len[j] + 1;
                        counts[i] = counts[j];
                    }
                }
            }
            maxLen = Math.max(maxLen, len[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(len[i] == maxLen){
                ans += counts[i];
            }
        }
        return ans;
    }
}
