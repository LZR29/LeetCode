package easy;

public class No557 {
	
	public static String reverseWords(String s) {
        /*StringBuffer res = new StringBuffer();
        String[] strings = s.split(" ");
        for (String string : strings) {
			StringBuffer sb = new StringBuffer(string);
			res.append(sb.reverse().toString());
			res.append(" ");
		}
        res.delete(s.length(), s.length()+1);
        return res.toString();*/
        char[] chars = s.toCharArray();
        int start = 0;
        int end;
        for (int i = 0; i < chars.length; i++){
			if(chars[i] == ' '){
				end = i - 1;
				helper(chars,start,end);
				start = i + 1;
			}
		}
		end = chars.length - 1;
        helper(chars,start,end);
        return new String(chars);
    }
	public static void helper(char[] s, int start, int end ){
		while (start < end){
			char c = s[end];
			s[end] = s[start];
			s[start] = c;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's take LeetCode contest".length());
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

}
