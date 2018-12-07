package easy;

public class No213 {
	
	public static int rob(int[] nums) {
		if(nums.length == 0)
			return 0;
		if(nums.length == 1)
			return nums[0];
		if(nums.length == 2)
			return Math.max(nums[0], nums[1]);
        int len = nums.length;
        int[] dp1 = new int[len];
        int[] dp2 = new int[len];
        int max = 0;
        int min = 0;
        dp1[0] = nums[0];
        dp1[1] = nums[1];
        dp2[0] = nums[0];
        dp2[1] = nums[1];
        for(int i = 2; i < len; i++) {
        	for(int j = 0; j < i-1;j++) {
        		if(max < nums[j])
        			max = nums[j];
        		else {
        			min = nums[j];
				}
        	}
        	dp1[i] = nums[i] + max;
        	dp2[i] = nums[i] + min;
        }
        int sum = 0;
        for(int i = 0; i < len ;i++) {
        	sum += nums[i];
        	if(max < dp1[i])
        		max = dp1[i];
        	if(min > dp2[i])
        		min = dp2[i];
        }
        if(len == 3)
        	return max;
		return Math.max(max, sum-max);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
		System.out.println(rob(nums));
	}

}
