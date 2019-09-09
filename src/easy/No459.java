package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-08-09 18:25
 */
public class No459 {

    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; i < len; i++) {
            if(len % i != 0){
                continue;
            }
            String cur = s.substring(0, i);
            int k = len / i;
            StringBuilder sb = new StringBuilder(len);
            for (int j = 0; j < k; j++) {
                sb.append(cur);
            }
            if(sb.toString().equals(s)){
                return true;
            }
        }
        return false;
    }
}
