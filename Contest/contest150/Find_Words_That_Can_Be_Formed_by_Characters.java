package contest150;

/**
 * @author linzerong
 * @create 2019-08-18 10:30
 */
public class Find_Words_That_Can_Be_Formed_by_Characters {

    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            count[chars.charAt(i)-'a']++;
        }
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            int[] cur = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                cur[words[i].charAt(j)-'a']++;
            }
            boolean f = true;
            for (int j = 0; j < 26; j++) {
                if(cur[j] != 0 && cur[j] > count[j]){
                    f = false;
                    break;
                }
            }
            if(f){
                ans += words[i].length();
            }
        }
        return ans;
    }

}
