package easy;

public class No633 {
	
	public static boolean judgeSquareSum(int c) {
       for (int i = 0; i <=Math.sqrt(c); i++) {
    	int d = c - i*i; 
		 if (Math.floor(Math.sqrt(d)) == Math.sqrt(d)) return true;
	}
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(judgeSquareSum(1));//10000000001000000001
	}

}
