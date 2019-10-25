package contest156;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-09-29 10:53
 */
public class Remove_All_Adjacent_Duplicates_in_StringII {
    public String removeDuplicates(String s, int k) {
        List<int[]> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i <= s.length()-k; ) {
            int j = 0;
            for (; j < k; j++) {
                if(s.charAt(i+j) != s.charAt(i)){
                    break;
                }
            }
            //      System.out.println(i + " " + j);
            if(j == k){
                //           System.out.println(i + " "+ (i+k-1));
                list.add(new int[]{i,i+k-1});

            }
            i += j;
        }
        //    System.out.println(list.toString());
        StringBuilder sb = new StringBuilder();
        if(list.size() <= 0){
            return s;
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.get(i)[0]; j <= list.get(i)[1]; j++) {
                chars[j] = '#';
            }
        }
        for(char c : chars){
            if(c != '#') {
                sb.append(c);
            }
        }
        return removeDuplicates(sb.toString(), k);
    }
}
