package medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author linzerong
 * @create 2018-12-10 19:58
 */
public class No179 {

    public static String largestNumber(int[] nums) {
        if(nums.length == 0){
            return "";
        }
        int len = nums.length;
        StringBuilder sb = new StringBuilder();
        String[] strings = new String[len];
        for (int i = 0; i < len; i++) {
            strings[i] = ((Integer)nums[i]).toString();
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        });
        if(strings[0].charAt(0) == '0'){
            return "0";
        }
        for (int i = 0; i < len; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0};             //[121,12]
        System.out.println(largestNumber(nums));   //"12121"
    }
}
