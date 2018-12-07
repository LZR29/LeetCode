package easy;

public class No27 {
	public static int removeElement(int[] nums, int val) {
		if(nums.length == 0)
			return 0;
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[length] = nums[i];
				length++;
			}
		}
        return length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,2,3};
		System.out.println(No27.removeElement(nums, 3));
	}
}
