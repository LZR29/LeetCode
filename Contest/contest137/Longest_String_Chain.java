package contest137;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-05-19 10:43
 */
public class Longest_String_Chain {
    int max = 0;
    public int longestStrChain(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (int i = 0; i < words.length; i++) {
            helper(words,words[i],1);
        }
        return max;
    }

    private void helper(String[] words, String pre, int count){
        max = Math.max(max,count);
        int len = pre.length() + 1;
        for (int i = 0; i < words.length && words[i].length() <= len; i++) {
            if(words[i].length() == len){
                if(check(pre, words[i])){
                    helper(words, words[i],count+1);
                }
            }
        }
    }


    private static boolean check(String s1, String s2){
        int[] counts = new int[26];
        counts[s2.charAt(s2.length()-1)-'a']--;
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i)-'a']++;
            counts[s2.charAt(i)-'a']--;
        }
        int i = 0;
        int k = 0;
        for (int j = 0; j < 26; j++) {
            if(counts[j] == -1){
                i++;
            }
            if(counts[j] == 1){
                k++;
            }
        }
        return i == 1 && k == 0;
    }

    public static void main(String[] args) {
        System.out.println(check("aaicm","aaicwm"));
    }
}
