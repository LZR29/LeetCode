package easy;

public class No9 {
	
	public static boolean isPalindrome(int x) {
  /*      if (x < 0 ) {
			return false;
		}
        if(x > 0 && x % 10 == 0)
        	return false;
        int a = 0 ,c = 0;
        while (x > a) {
			c = x % 10;
			a = a * 10 + c;
			x = x / 10;
		}
        return (x == a)||(a / 10 == x);*/
		String string = ((Integer) x).toString();
		char[] cs = string.toCharArray();
		int len = cs.length;
		for (int i = 0; i < len/2; i++) {
			if(cs[i] != cs[len-1-i])
				return false;
		}
		return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1011));
	}

}
