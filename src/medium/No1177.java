package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-09-03 9:51
 */
public class No1177 {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int[] ori = new int[26];
        int len = s.length();
        List<Boolean> ans = new ArrayList<>();
        int[][] map = new int[len][26];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            int[] cur = Arrays.copyOfRange(ori, 0, 26);
            cur[c-'a']++;
            map[i] = cur;
            ori = cur;
        }
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int k = queries[i][2];
            int count = 0;
            if(left == right){
                ans.add(true);
                continue;
            }
            for (int j = 0; j < 26; j++) {
                if(s.charAt(left)-'a' == j){
                    count += ((map[right][j] - map[left][j] + 1) % 2);
                }else {
                    count += ((map[right][j] - map[left][j]) % 2);
                }
            }
            System.out.println(count);
            if(count/2 <= k){
                ans.add(true);
            }else {
                ans.add(false);
            }
        }
        return ans;
    }
}
