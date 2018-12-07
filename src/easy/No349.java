package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No349 {
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> res = new HashSet<Integer>();
		if(nums1.length == 0||nums2.length == 0) {
			return new int[0];
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int len1 = nums1.length, len2 = nums2.length;
		int min1 = nums1[0], min2 = nums2[0];
		int max1 = nums1[len1 - 1],max2 = nums2[len2 - 1];
		int start , end;
		start = min1 > min2? min1:min2;
		end = max1 > max2? max1:max2;
		if(start > end) {
			return new int[0];
		}else {
			for (int i = 0; i < len1; i++) {
				if(start <= nums1[i] && nums1[i] <= end) {
					for (int j = 0; j < len2; j++) {
						if(nums2[j] == nums1[i]) {
							res.add(nums1[i]);
							break;
						}
					}
				}
			}
		}
		int[] ans = new int[res.size()];
		int  i = 0;
		for (Integer integer : res) {
			ans[i] = integer;
			i++;
		}
		return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,9,9,9};
		int[] nums2 = {9,9};
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}

}
