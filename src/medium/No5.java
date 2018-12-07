package medium;

public class No5 {
	/*最长子回文串：对每个字符求得最长的回文串，以每个字符为中心，向两边延长，存在两种情况：奇数和偶数长度
	 * 
	 */
	public static String longestPalindrome(String s) {
        if(s.length() <= 1)
        	return s;
        int[][] param = new int[2][3];
        char[] chars = s.toCharArray();
        int len = chars.length;
        String res = "";
        for (int i = 0; i < len; i++) {
			param[0] = isPalindrome(chars, i,i);
			param[1] = isPalindrome(chars, i, i+1);
			if(param[0][2] > param[1][2]) {	//选择长度长的子串
				if(param[0][2] >= res.length()) //选择长度长子串作为结果
					res = s.substring(param[0][0], param[0][1] + 1);
			}else {
				if(param[1][2] >= res.length())
					res = s.substring(param[1][0], param[1][1] + 1);
			}
		}
        return res;
    }
	//判断回文子串的起点，重点，长度-1
	public static int[] isPalindrome(char[] chars,int start,int end) {
		int len = chars.length ;
		int[] param = new int[3];
		while(start >= 0 && end <len && chars[start] == chars[end]) {
			param[0] = start;
			param[1] = end;
			param[2] = end - start;
			start--;
			end++;
		}
		return param;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("babad"));
	}

}
