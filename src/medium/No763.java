package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-06-22 23:32
 */
public class No763 {
    public List<Integer> partitionLabels(String S) {
        int[] indexs = new int[26];
        //记录字符的最后一个位置
        for (int i = 0; i < S.length(); i++) {
            indexs[S.charAt(i) - 'a'] = i;
        }
        List<Integer> ans = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < S.length(); i++) {
            //记录区间的最后一个位置
            end = Math.max(end,indexs[S.charAt(i) - 'a']);
            //刚好当前位置是最后一个就记录，因为里面所有字符的最后位置的小于当前字符的最后位置
            if(i == end){
                ans.add(end - start + 1);
                start = i + 1;
            }
        }
        return ans;
    }
}
