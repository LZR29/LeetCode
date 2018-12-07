package easy;

public class No198 {
	public static int rob(int[] nums) {
		if(nums.length == 1)
			return nums[0];
		if(nums.length == 0)
            return 0;
		int[] money = new int[nums.length];
		int max = 0;
		money[0] = nums[0];
		money[1] = nums[1];
		max = money[0];
		for (int i = 2; i < money.length; i++) {
			for(int j = 0;j < i - 1;j++) {
				if(money[j] > max)
					max = money[j];
			}
			money[i] = nums[i]+max;
		}
		for (int i = 0; i < money.length; i++) {
			if(money[i] > max)
				max = money[i];
		}
		return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,9,3,1};
		System.out.println(No198.rob(nums));
	}

}
