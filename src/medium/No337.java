package medium;

/**
 * @author linzerong
 * @create 2019-08-22 23:05
 */
public class No337 {

    public int rob(TreeNode root) {
        //interesting
        int[] dp = helper(root);
        return Math.max(dp[0], dp[1]);
    }
    public int[] helper(TreeNode root){
        int[] dp = new int[2];
        if(root == null){
            return dp;
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        //dp[0]为包含根节点时的最大值，dp[1]为不包含根节点
        //dp[0]包含根，所以值只能为子节点的不包含根的值和
        dp[0] = left[1] + right[1] + root.val;
        //dp[1]1不包含根，节点值为子节点的最大值之和
        dp[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return dp;
    }
}
