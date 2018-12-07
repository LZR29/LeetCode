package medium;

public class No3 {
	
	public static int lengthOfLongestSubstring(String s) {
/*		if(s == null||s.length() == 0)
			return 0;
        int[] charIdex = new int[128];
        int len = s.length();
        int ans = 0,pre = 0;
        for (int i = 0; i < len; i++) {
        	char c = s.charAt(i);
        	if(charIdex[c] > pre)
        		pre = charIdex[c];
        	int l = i - pre + 1;
        	charIdex[c] = i + 1;
        	ans = Math.max(ans, l);
		}
        return ans;*/
		if(s == null||s.length() == 0)
			return 0;
        int[] charIdex = new int[128];
        int len = s.length();
        int ans = 0;
        for (int i = 0; i < len; i++) {
        	char c = s.charAt(i);
        	if(charIdex[c] == 0) {
        		ans = Math.max(ans, i - charIdex[c]) + 1;
        		charIdex[c] = i;
        	}else {
        		ans = Math.max(ans, i - charIdex[c]);
        		charIdex[c] = i;
        	}
		}
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println('a' - 0);
	//	System.out.println('z' - 0);
	//	System.out.println("  ".length());
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

}
