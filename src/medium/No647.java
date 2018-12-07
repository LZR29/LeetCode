package medium;

public class No647 {
	
	public static boolean palindromic(char[] chars,int start,int end) {
		while(start < end) {
			if(chars[start++] != chars[end--]) {
				return false;
			}
		}
		return true;
	}
	
	public static int countSubstrings(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        int len = s.length();
        for(int i = 0; i < len; i++) {
        	for(int j = i; j < len; j++) {
        		if (palindromic(chars, i, j)) {
					count++;
				}
        	}
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSubstrings("abc"));
	}

}
