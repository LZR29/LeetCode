package contest145;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-07-14 10:44
 */
public class Longest_Well_Performing_Interval {
    public int longestWPI(int[] hours) {
        int res = 0, score = 0, n = hours.length;
        Map<Integer, Integer> seen = new HashMap<>();
        seen.put(0, -1);
        for (int i = 0; i < n; ++i) {
            score += hours[i] > 8 ? 1 : -1;
            if (score > 0) {
                res = i + 1;
            } else {
                seen.putIfAbsent(score, i);
                if (seen.containsKey(score - 1))    //使得从0到和为score-1的位置为score-1，这样从这个位置到i的和就是1
                    res = Math.max(res, i - seen.get(score - 1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {9,9,6,0,6,6,9,8,9,9};
        new Longest_Well_Performing_Interval().longestWPI(nums);
    }
}
