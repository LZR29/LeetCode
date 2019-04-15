package easy;

/**
 * @authoor linzerong
 * @create 2019-04-10 16:43
 */
public class No387 {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(chars[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}