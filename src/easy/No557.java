package easy;

public class No557 {
	
	public static String reverseWords(String s) {
        StringBuffer res = new StringBuffer();
        String[] strings = s.split(" ");
        for (String string : strings) {
			StringBuffer sb = new StringBuffer(string);
			res.append(sb.reverse().toString());
			res.append(" ");
		}
        res.delete(s.length(), s.length()+1);
        return res.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's take LeetCode contest".length());
		System.out.println(reverseWords("").length());
	}

}
