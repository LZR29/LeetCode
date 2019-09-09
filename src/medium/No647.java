package medium;

public class No647 {
	
	public int palindromic(char[] chars,int left,int right) {
		int count = 0;
		while (left >= 0 && right < chars.length && chars[left] == chars[right]){
			left--;
			right++;
			count++;
		}
		return count;
	}
	
	public int countSubstrings(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        int len = s.length();
        for(int i = 0; i < len; i++) {
        	count += palindromic(chars, i, i);
        	count += palindromic(chars, i, i+1);
        }
        return count;
    }
	


}
