package bytedance.string;

/**
 * @author linzerong
 * @create 2019-07-09 21:31
 */
public class No2 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; ) {
            if(strs[i].indexOf(ans) != 0){
                ans = ans.substring(0, ans.length() - 1);
            }else {
                i++;
            }
        }
        return ans;
    }
}
