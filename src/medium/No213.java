package medium;



public class No213 {
	
	public static int rob(int[] nums) {
        if(nums.length == 0)
        	return 0;
        if(nums.length == 1)
        	return nums[0];
        if(nums.length == 2)
        	return nums[0] > nums[1]? nums[0]:nums[1];
        int max1 ,max2;
        int[] money1 = new int[nums.length];
        int[] money2 = new int[nums.length];
        money1[0] = nums[0];
        money1[1] = nums[1];
        money2[1] = nums[1];
        money2[2] = nums[2];
        max1 = money1[0];
        max2 = money2[1];
        for(int i = 2; i < nums.length-1;i++) {
        	for (int j = 0; j < i-1; j++) {
				if(max1 < money1[j])
					max1 = money1[j];
			}
        	money1[i] = nums[i]+max1;
        }
        for(int i = 0; i < money1.length;i++)
        	if(max1 < money1[i])
        		max1 = money1[i];
        for(int i = 3; i < nums.length;i++) {
        	for (int j = 0; j < i-1; j++) {
				if(max2 < money2[j])
					max2 = money2[j];
			}
        	money2[i] = nums[i]+max2;
        }
        for(int i = 0; i < money1.length;i++)
        	if(max2 < money2[i])
        		max2 = money2[i];
        return max1 > max2? max1:max2;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
	//	System.out.println(No213.rob(nums));
	//	System.out.printf("%.2f",2.3333);
	}

}
