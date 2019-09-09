package bicontest7;



/**
 * @author linzerong
 * @create 2019-08-24 22:30
 */
public class Single_Row_Keyboard {
    public int calculateTime(String keyboard, String word) {
        int[] chars = new int[26];
        for(int i = 0; i < 26; i++){
            chars[keyboard.charAt(i)-'a'] = i;
        }
        int pre = 0;
        int ans = 0;
        for (int i = 0; i < word.length(); i++) {
            int cur = chars[word.charAt(i)-'a'];
            ans += Math.abs(cur - pre);
            pre = cur;
        }
        return ans;
    }

}
