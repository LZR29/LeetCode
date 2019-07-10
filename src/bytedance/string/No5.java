package bytedance.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-07-10 10:18
 */
public class No5 {
    public String reverseWords(String s) {
        if(s.length() < 1){
            return s;
        }
        s = s.trim();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                if(s.charAt(i+1) == ' '){
                    continue;
                }else {
                    count++;
                }
            }else {
                count++;
            }
        }
        char[] chars = new char[count];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                if(s.charAt(i+1) == ' '){
                    continue;
                }else {
                    chars[index++] = s.charAt(i);
                }
            }else {
                chars[index++] = s.charAt(i);
            }
        }
        int i = 0, j = 0;
        for ( ; j < chars.length; j++) {
            if(chars[j] == ' '){
                int start = i;
                int end = j - 1;
                reverse(chars, start, end);
                i = j + 1;
            }
        }
        reverse(chars, i, chars.length - 1);
        reverse(chars, 0, chars.length - 1);
        return new String(chars);
    }
    public void reverse(char[] chars, int start, int end ){
        while (start < end){
            char t = chars[start];
            chars[start] = chars[end];
            chars[end] = t;
            start++;
            end--;
        }
    }
}

