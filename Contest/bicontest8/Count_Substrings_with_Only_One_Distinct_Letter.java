package bicontest8;

/**
 * @author linzerong
 * @create 2019-09-08 9:19
 */
public class Count_Substrings_with_Only_One_Distinct_Letter {
    public int countLetters(String S) {
        int ans = 0;
        int count = 1;
        int len = S.length();
        for (int i = 0; i < len-1; i++) {
            if(S.charAt(i) != S.charAt(i+1)){
                ans += count * (count + 1) / 2;
                count = 1;
            }else {
                count++;
            }
        }
        ans += count * (count + 1) / 2;
        return ans;
    }
}
