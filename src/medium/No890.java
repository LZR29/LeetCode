package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-06-26 13:13
 */
public class No890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(helper(words[i], pattern)){
                ans.add(words[i]);
            }
        }
        return ans;
    }
    public boolean helper(String word, String pattern){
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(word.charAt(i))){
                    return false;
                }
                map.put(pattern.charAt(i), word.charAt(i));
            }else {
                char c = map.get(pattern.charAt(i));
                if(c != word.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
