package contest151;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-08-25 10:50
 */
public class Compare_Strings_by_Frequency_of_the_Smallest_Character {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int len = queries.length;
        int[] ans = new int[len];
        int[] fq = new int[len];
        int[] fw = new int[words.length];
        for (int i = 0; i < len; i++) {
            fq[i] = f(queries[i]);
        }
        for (int i = 0; i < words.length; i++) {
            fw[i] = f(words[i]);
        }
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if(fq[i] < fw[j]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
    public int f(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int count = 1;
        char c = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if(c == chars[i]){
                count++;
            }else {
                break;
            }
        }
        return count;
    }

}
