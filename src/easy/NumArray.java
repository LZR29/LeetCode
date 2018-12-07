package easy;

public class NumArray {
	private int[] num;
	public NumArray(int[] nums) {
        num = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        	num[i] = nums[i];
    }
    
    public int sumRange(int i, int j) {
        int sum = 0;
        for(int k = i; k <= j; k++)
        	sum += num[k];
        return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
