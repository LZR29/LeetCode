package easy;

public class No110 {
	
	public boolean isBalanced(TreeNode root) {
        return balanced(root)!= -1;
    }
	
	public int balanced(TreeNode root) {
		if(root == null)
			return 0;
		int l = balanced(root.left);
		if(l == -1)
			return -1;
		int r = balanced(root.right);
		if(r == -1)
			return -1;
		if(Math.abs(l - r) > 1)
			return -1;
		return 1+Math.max(l, r);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
