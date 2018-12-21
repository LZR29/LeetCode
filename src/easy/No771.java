package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @authoor linzerong
 * @create 2018-12-21 9:33
 */
public class No771 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        int len = J.length();
        for (int i = 0; i < len; i++) {
            set.add(J.charAt(i));
        }
        len = S.length();
        for (int i = 0; i < len; i++) {
            if(set.contains(S.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
