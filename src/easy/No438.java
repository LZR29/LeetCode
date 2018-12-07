package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No438 {
	
	public static List<Integer> findAnagrams(String s, String p) {
        if(s == null||s.length() < p.length()) {
        	return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        int[] chars = new int[26];
        for (char c : p.toCharArray()) {
			chars[c-'a']++;
		}
        int left = 0;
        int cntMatch = 0;
        for (int right = 0; right < s.length(); right++) {
            char sChar = s.charAt(right);
            chars[sChar-'a']--;
            if (chars[sChar-'a'] + 1 > 0) {
                cntMatch++;
            }
            while (cntMatch == p.length()) {
                if (right - left + 1 == p.length()) {
                    ans.add(left);
                }
                sChar = s.charAt(left);
                chars[sChar-'a']++;
                if (chars[sChar-'a'] - 1 >= 0) {
                    cntMatch--;
                }
                left++;
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list ;
		list = findAnagrams("ababababab", "aab"); 
		System.out.println(list.toString());	//0246 ababababab aab
	}

}
