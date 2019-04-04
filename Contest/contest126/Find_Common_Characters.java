package contest126;

import java.util.ArrayList;
import java.util.List;

/**
 * @authoor linzerong
 * @create 2019-03-03 10:31
 */
public class Find_Common_Characters {
    public List<String> commonChars(String[] A) {
        int[][] count = new int[A.length][26];
        char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t', 'u','v','w','x','y','z'};
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                count[i][A[i].charAt(j) - 'a']++;
            }
        }

        boolean flag ;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            flag = true;
            for (int j = 0; j < A.length; j++) {
                if(count[j][i] == 0){
                    flag = false;
                    max = Integer.MAX_VALUE;
                    break;
                }else {
                    max = Math.min(max,count[j][i]);
                }
            }

            if(flag){
                for (int j = 0; j < max; j++) {
                    ans.add(String.valueOf(chars[i]));
                }
                max = Integer.MAX_VALUE;
            }
        }
        return ans;
    }
}
