package easy;

/**
 * @authoor linzerong
 * @create 2019-04-10 16:51
 */
public class No242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] set1 = new int[26];
        int[] set2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            set1[s.charAt(i)-'a']++;
            set2[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(set1[i] != set2[i]){
                return false;
            }
        }
        return true;
    }
}
