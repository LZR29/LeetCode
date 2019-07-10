package bytedance.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-07-09 21:01
 */
public class No1 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 0){
            return 0;
        }
        int max = 0;
        int start = 0, end = 0;
        Map<Character, Integer> map = new HashMap<>();
        for ( end = 0; end < s.length(); end++) {
            if(map.containsKey(s.charAt(end))){
                //更新start，标记没有重复的字符区间的起始位置
                start = Math.max(start, map.get(s.charAt(end)));
            }
            max = Math.max(max, end - start + 1);
            //end + 1 代表从end后一个开始没重复
            map.put(s.charAt(end), end + 1);
        }
        return max;
    }
}
