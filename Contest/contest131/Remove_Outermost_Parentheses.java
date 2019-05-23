package contest131;

/**
 * @author linzerong
 * @create 2019-04-07 10:30
 */
public class Remove_Outermost_Parentheses {
    public static String removeOuterParentheses(String S) {
        if(S == null || S.length() <= 0){
            return "";
        }
        int len = S.length();
        String ans = ""; //"(()())(())"
        int count = 0;
        int index = 0;
        for (int i = 0; i < len; i++) {
            if(S.charAt(i) == '('){
                count++;
            }else if(S.charAt(i) == ')'){
                count--;
            }
            if(count == 0){
                String cur = S.substring(index,i+1);
                ans = ans + cur.substring(1,cur.length()-1);
                index = i+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(s.substring(6,10));
        removeOuterParentheses(s);
    }
}
