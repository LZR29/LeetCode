package medium;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-09-13 12:04
 * 公式: (count[25] - 1) * (n + 1) + maxCount
 *
 */
public class No621 {
    public int leastInterval(char[] tasks, int n) {
        int ans = 0;
        int[] count = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            count[tasks[i]-'A']++;
        }
        Arrays.sort(count);
        //最多任务在count[25]
        //统计有多少个频率最高的字母
        int maxCount = 0;
        for (int i = 25; i >= 0; i--) {
            if(count[i] == count[25]){
                maxCount++;
            }else {
                break;
            }
        }
        ans = (count[25] - 1) *(n + 1) + maxCount;
        return Math.max(ans, tasks.length);
    }
}
