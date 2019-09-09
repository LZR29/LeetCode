package easy;

/**
 * @author linzerong
 * @create 2019-08-04 12:15
 */
public class No1144 {

    public int movesToMakeZigzag(int[] nums) {
        int res[] = new int[2],  n = nums.length;
        int left, right;
        for (int i = 0; i < n; ++i) {
            left = i > 0 ? nums[i - 1] : 1000;
            right = i + 1 < n ? nums[i + 1] : 1000;
            res[i % 2] += Math.max(0, nums[i] - Math.min(left, right) + 1);
        }
        return Math.min(res[0], res[1]);
    }
}
