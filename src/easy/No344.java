package easy;

public class No344 {
	
	public static String reverseString(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("A man, a plan, a canal: Panama"));
	}

}
