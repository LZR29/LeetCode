package medium;


import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-08-09 11:23
 */
public class No22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans, "", 0, 0, n);
        return ans;
    }
    public void helper(List<String> list, String cur, int left, int right, int count){
        if(cur.length() == 2 * count){
            list.add(cur);
            return;
        }
        if(left < count){
            helper(list, cur+"(", left+1, right, count);
        }
        if(right < left){
            helper(list, cur+")", left, right+1, count);
        }
    }
}
