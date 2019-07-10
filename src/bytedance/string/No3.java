package bytedance.string;


import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-07-09 21:57
 */
public class No3 {
    public boolean checkInclusion(String s1, String s2) {
        //一开始全排列肯定过不了就换个想法
        //使用滑动窗口，找到一个窗口它的拥有的元素的个数与目标的一样
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        int len = s1.length();
        for(char c : s1.toCharArray()){
            c1[c - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if(i >= len){
                c2[s2.charAt(i-len) - 'a']--;
            }
            c2[s2.charAt(i) - 'a']++;
            if(Arrays.equals(c1, c2)) {
                return true;
            }
        }
        return false;
    }
}
