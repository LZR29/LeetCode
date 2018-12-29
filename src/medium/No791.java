package medium;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @authoor linzerong
 * @create 2018-12-29 14:45
 */
public class No791 {
    public static String customSortString(String S, String T) {
        if(S.length() == 0){
            return T;
        }
        int len = S.length();
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : T.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(map.containsKey(S.charAt(i))) {
                count = map.get(S.charAt(i));
                for (int j = 0; j < count; j++) {
                    sb.append(S.charAt(i));
                }
            }
        }
        for(char c : map.keySet()){
            if(S.indexOf(c) == -1){
                count = map.get(c);
                for (int j = 0; j < count; j++) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        /*
        "cbafg"
        "abcd"
         */
        String S = "cbafg";
        String T = "abcd";
        System.out.println(customSortString(S,T));
    }
}
