package easy;


public class No235 {
	
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root.val > p.val && root.val > q.val)
			return lowestCommonAncestor(root.left, p, q);
		else if (root.val < p.val && root.val < q.val) {
			return lowestCommonAncestor(root.right, p, q);
		}else {
			return root;
		}
        
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
