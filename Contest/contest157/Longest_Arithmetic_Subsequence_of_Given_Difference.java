package contest157;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-10-08 10:17
 */
public class Longest_Arithmetic_Subsequence_of_Given_Difference {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 1;
        for(int i : arr){
            int count = map.getOrDefault(i, 0);
            map.put(i+difference, count+1);
            ans = Math.max(count+1, ans);
        }
        return ans;
    }
}
