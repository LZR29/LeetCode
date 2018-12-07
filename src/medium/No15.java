package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No15 {
	
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        if(len < 3)
        	return list;
        Arrays.sort(nums);
        if(nums[len - 1] < 0)
        	return list;
        int max = nums[len - 1];
        for (int i = 0; i < len - 2; ) {
			if(nums[i] > 0)
				break;
			if(nums[i] + 2 * max < 0) {
				while (nums[i] == nums[++i] && i < len - 2) ;
				continue;
			}
			int left = i + 1, right = len - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(sum == 0) {
					list.add(Arrays.asList(nums[i],nums[left],nums[right]));
					while(nums[left] == nums[++left] && left < right);
					while(nums[right] == nums[--right] && left <right);
				}else if(sum < 0) {
					left++;
				}else {
					right--;
				}
			}
			while (nums[i] == nums[++i] && i < len - 2);
		}
        return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer integer = -12;
		System.out.println(integer.toString());
	}

}
