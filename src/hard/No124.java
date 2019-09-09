package hard;

import easy.TreeNode;

/**
 * @author linzerong
 * @create 2019-08-29 12:14
 */
public class No124 {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        int val = left + right + root.val;
        max = Math.max(max, val);
        return Math.max(left, right) + root.val;
    }
}

