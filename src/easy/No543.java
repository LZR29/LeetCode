package easy;

public class No543 {
	
	public  int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
        	return 0;
        int r = depth(root.right);
        int l = depth(root.left);
        return Math.max(r + l, Math.max(diameterOfBinaryTree(root.right), diameterOfBinaryTree(root.left))) ;
    }
	public int  depth(TreeNode root) {
		if(root == null)
			return 0;
		return Math.max(depth(root.right), depth(root.left)) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
