package medium;

public class No91 {
	
	public static int numDecodings(String s) {
		if(s.length() == 0)
			return 0;
        int[] num = new int[s.length()];
        num[0] = s.charAt(0) == '0'? 0:1;
        if(s.length() == 1)
        	return num[0];
        int m = s.charAt(0) > '0' && s.charAt(1) > '0'? 1:0;
        int n = (s.charAt(0) == '1')||(s.charAt(0) == '2' && s.charAt(1)<'7')? 1:0;
        num[1] = m+n;
        for(int i = 2;i < s.length();i++) {
        	if(s.charAt(i)!='0') {
        		num[i] += num[i-1];
        	}
        	if(s.charAt(i-1)=='1'||(s.charAt(i-1)=='2' && s.charAt(i)<'7')) {
        		num[i] += num[i-2];
        	}
        }
        return num[s.length()-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(No91.numDecodings("121"));
	}

}
