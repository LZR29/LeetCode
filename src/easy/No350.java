package easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-04-10 20:57
 */
public class No350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ans = new LinkedList<>();
        int i1 = 0, i2 = 0;
        while (i1 < nums1.length && i2 < nums2.length){
            if(nums1[i1] == nums2[i2]){
                ans.add(nums1[i1]);
                i1++;
                i2++;
            }else if(nums1[i1] > nums2[i2]){
                i2++;
            }else {
                i1++;
            }
        }
        int[] nums = new int[ans.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans.get(i);
        }
        return nums;
    }
}
