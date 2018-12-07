package easy;

public class No66 {
	
	public static int[] plusOne(int[] digits) {
        int more = 1;
        for(int i = digits.length-1;i >=0;i--) {
        	digits[i] += more;
        	more = digits[i]/10;
        	digits[i] = digits[i]%10;
        }
        if(more == 1) {
        	digits = new int[digits.length+1];
        	digits[0] = 1;
        }
        return digits;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {4,3,8,8};
		digits = No66.plusOne(digits);
		for (int i = 0; i < digits.length; i++) {
			System.out.println(digits[i]);
		}
	}

}
