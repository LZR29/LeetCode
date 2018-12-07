package easy;

public class No35 {
	public static int searchInsert(int[] nums, int target) {
		if(nums.length == 0)
			return 0;
        int i = 0;
        for(i = 0;i < nums.length;i++) {
        	if(nums[i] >= target)
        		break;
        }
  //      if(nums[i] <= target)
   //     	return i;
        return i;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		System.out.println(No35.searchInsert(nums, 0));
	}

}
