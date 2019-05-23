package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-03-23 10:25
 */
public class No17 {
    static String[] chars = {"0","0","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        if(digits == null || digits.length() <= 0){
            return ans;
        }
        helper(ans,"",0,digits);
        return ans;
    }
    public void helper(List<String> ans , String cur, int d, String digits){
        if(d >= digits.length()){
            ans.add(cur);
            return;
        }
        int index = digits.charAt(d) - '0';
        for (int i = 0; i < chars[index].length(); i++) {
                String s = new String(cur);
                s += chars[index].charAt(i);
                helper(ans,s,d+1,digits);
        }
    }
    
    public static void main(String[] args) {
        No17 no17 = new No17();
        System.out.println(no17.letterCombinations("23"));
    }
}
