package easy;

public class No70 {
	
	public static int climbStairs(int n) {
		if(n <= 2) {
			return n;
		}
        int[] num = new int[n];
        num[0] = 1;
        num[1] = 2;
        for (int i = 2; i < num.length; i++) {
			num[i] = num[i-1]+num[i-2];
		}
        return num[n-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(No70.climbStairs(3));
		System.out.println(No70.climbStairs(1));
		System.out.println(No70.climbStairs(2));
		System.out.println(No70.climbStairs(0));
	}

}
