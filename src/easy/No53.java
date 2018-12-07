package easy;

public class No53 {
	
	public static int maxSubArray(int[] nums) {
        if(nums.length == 0)
        	return 0;
		int sum = nums[0];
        int curMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
			if(curMax > 0)
				curMax += nums[i];
			else 
				curMax = nums[i];
			sum = sum > curMax? sum:curMax;
		}
        return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(No53.maxSubArray(nums));
	}

}
