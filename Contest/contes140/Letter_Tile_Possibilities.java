package contes140;

import java.util.*;

/**
 * @author linzerong
 * @create 2019-06-09 10:36
 */
public class Letter_Tile_Possibilities {
    public int numTilePossibilities(String str) {
        Set<String> ans = new HashSet<>();
        if(str == null || str.length() < 0){
            return ans.size();
        }
        helper(ans,0,str.toCharArray());
        return ans.size();
    }
    public void helper(Set<String> ans, int i, char[] chars){
        String s = new String(chars,0,i);
        ans.add(s);
        for (int j = i; j < chars.length; j++) {
                char temp = chars[j];
                chars[j] = chars[i];
                chars[i] = temp;
                helper(ans,i+1,chars);
                temp = chars[j];
                chars[j] = chars[i];
                chars[i] = temp;
        }
    }
}
