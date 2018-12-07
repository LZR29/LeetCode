package medium;


public class No338 {
	
	public static int[] countBits(int num) {
		if(num == 0) {
			int[] bits = {0};
			return bits;
		}
        int[] bits = new int[num+1];
        bits[0] = 0;
        bits[1] = 1;
        for(int i = 2; i <= num; i++) {
        	bits[i] = bits[i/2] + i % 2;
        }
        return bits;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = countBits(1);
	//	System.out.println(3/2);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
