package easy;

public class No674 {
	
	public static int findLengthOfLCIS(int[] nums) {
		if(nums.length < 1) {
			return 0;
		}
		int len = nums.length;
		int max = 1,cur = 0;
		for(int i = 0; i < len-1; i++) {
			while(i < len-1 && nums[i] < nums[i+1]) {
				cur++;
				i++;
			}
			max = Math.max(max, cur+1);
			cur = 0;
		}
		return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,4,7};
		System.out.println(findLengthOfLCIS(nums));
	}

}
