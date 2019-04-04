package test;

/**
 * @authoor linzerong
 * @create 2019-03-06 16:31
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        s = s.toUpperCase();
        int start = 0;
        int end = s.length() - 1;
        while (start <= end){
            while(start < s.length() && (s.charAt(start) > 'Z' || s.charAt(start) < 'A') &&( s.charAt(start) >'9' || s.charAt(start) < '0')){
                start++;
            }
            while(end >= 0 && (s.charAt(end) > 'Z' || s.charAt(end) < 'A') && ( s.charAt(end) >'9' || s.charAt(end) < '0')){
                end--;
            }
            if(start < end && s.charAt(start) != s.charAt(end)){
                return false;
            }else {
                start++;
                end--;
            }
        }
        return true;
    }
}
