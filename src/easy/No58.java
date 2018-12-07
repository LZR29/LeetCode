package easy;

public class No58 {
	
	public static int lengthOfLastWord(String s) {
        if(s.length() == 0)
        	return 0;
		int length = 0;
		char c;
		for(int i = s.length()-1;i >=0;i--) {
        	c = s.charAt(i);
        	if((c >= 'a'&&c <='z')||(c >= 'A'&& c <= 'Z')) {
        		length++;
        		for(int j = i-1;j>=0;j--) {
        			c = s.charAt(j);
        			if((c >= 'a'&&c <='z')||(c >= 'A'&& c <= 'Z')) {
        				length++;
        			}else {
						return length;
					}
        		}
        		return length;
        	}
			
        }
		return length;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(No58.lengthOfLastWord("Hello World"));
	}

}
