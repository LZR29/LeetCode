package easy;

import java.util.Arrays;

public class No167 {
	
	public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int [2];
        int left = 0 ,right = numbers.length - 1;
        while (left < right) {
			if(numbers[left] + numbers[right] == target) {
				ans[0] = left + 1;
				ans[1] = right + 1;
				break;
			}else if (numbers[right] + numbers[left] > target) {
				right--;
			}else {
				left++;
			}
		}
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(numbers, 9)));
	}

}
