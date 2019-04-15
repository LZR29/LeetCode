package medium;

/**
 * @authoor linzerong
 * @create 2019-04-15 9:28
 */
public class No1026 {
    public int maxAncestorDiff(TreeNode root) {
        int max = 0;
        if(root != null){
            max = helper(root,root.val, root.val);
        }
        return max;
    }
    public int helper(TreeNode root, int max, int min){
        if(root == null){
            return max - min;
        }
        max = Math.max(max,root.val);
        min = Math.min(min,root.val);
        return Math.max(helper(root.left,max,min), helper(root.right,max,min));
    }
}
