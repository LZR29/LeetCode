package medium;

/**
 * @author linzerong
 * @create 2019-06-26 12:42
 */
public class No654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }
    public int helper(int[] nums, int start, int end){
        int index = start;
        for (int i = start; i <= end; i++) {
            if(nums[i] >= nums[index]){
                index = i;
            }
        }
        return index;
    }

    public TreeNode build(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int i = helper(nums, start, end);
        TreeNode treeNode = new TreeNode(nums[i]);
        treeNode.left = build(nums, start, i - 1);
        treeNode.right = build(nums, i + 1, end);
        return treeNode;
    }
}
