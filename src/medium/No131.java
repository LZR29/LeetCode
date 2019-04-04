package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @authoor linzerong
 * @create 2019-04-04 15:53
 */
public class No131 {
    public List<List<String>> partition(String s) {
        if(s == null || s.length() <= 0){
            return Collections.emptyList();
        }
        List<List<String>> ans = new ArrayList<>();
        char[] chars = s.toCharArray();
        helper(ans,new ArrayList<>(),chars,0);
        return ans;
    }
    public void helper(List<List<String>> ans, List<String> cur, char[] chars, int index){
        if(chars.length <= index){
            ans.add(cur);
            return;
        }
        for (int i = index; i < chars.length; i++) {
            if(check(chars,index,i)){
                List<String> list = new ArrayList<>(cur);
                list.add(new String(chars,index,i-index+1));
                helper(ans,list,chars,i+1);
            }
        }
    }
    public boolean check(char[] chars, int start, int end){
        while (start <= end){
            if(chars[start] != chars[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
