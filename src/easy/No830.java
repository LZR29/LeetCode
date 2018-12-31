package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @authoor linzerong
 * @create 2018-12-31 9:15
 */
public class No830 {
    public List<List<Integer>> largeGroupPositions(String S) {
        int len = S.length();
        if(len < 3){
            return Collections.emptyList();
        }
        List<List<Integer>> ans = new ArrayList<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < len; ) {
            int start = i;
            int end = start;
            while (end < len - 1 && chars[end] == chars[end+1]){
                end++;
            }
            if(end - start >= 2){
                List<Integer> item = new ArrayList<>();
                item.add(start);
                item.add(end);
                ans.add(item);
            }
            i = end + 1;
        }
        return ans;
    }
}
