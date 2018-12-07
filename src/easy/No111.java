package easy;

public class No111 {
	public int minDepth(TreeNode root) {
        if (root == null) {
			return 0;
		}
        int r = minDepth(root.right);
        int l = minDepth(root.left);
        if(r != 0&&l != 0 )
        	return 1 + Math.min(r, l);
        return 1 + r + l;
    }
}
