package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @authoor linzerong
 * @create 2019-03-18 21:47
 */
public class No784 {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        helper(S.toCharArray(),0,ans);
        return ans;
    }
    public void helper(char[] chars, int i, List<String> ans){
        ans.add(new String(chars));
        if(i == chars.length){
            return;
        }
        for (int j = i; j < chars.length; j++) {
            if(chars[j] >= 'a' && chars[j] <= 'z'){
                chars[j] -= 32;
                helper(chars,j+1,ans);
                chars[j] += 32;
            }else if(chars[j] >= 'A' && chars[j] <= 'Z'){
                chars[j] += 32;
                helper(chars,j+1,ans);
                chars[j] -= 32;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println('a' - 'A');
    }
}
