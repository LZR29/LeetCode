package easy;

import java.util.*;

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

    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> needs = new HashMap<>();
        Map<Character, Integer> win = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            needs.put(p.charAt(i), needs.getOrDefault(p.charAt(i), 0)+1);
        }
        int match = 0;
        int allMatch = needs.size();
        int left = 0;
        int right = 0;
        for(; right < s.length(); right++){
            if(needs.containsKey(s.charAt(right))){
                win.put(s.charAt(right), win.getOrDefault(s.charAt(right), 0)+1);
                if(needs.get(s.charAt(right)).equals(win.get(s.charAt(right)))){
                    match++;
                }
            }
            while (match == allMatch) {
                if(right - left + 1 == p.length()){
                    //匹配
                    ans.add(left);
                }
                if(needs.containsKey(s.charAt(left))){
                    win.put(s.charAt(left), win.get(s.charAt(left))-1);
                    if(win.get(s.charAt(left)).intValue() < needs.get(s.charAt(left))){
                        match--;
                    }
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
