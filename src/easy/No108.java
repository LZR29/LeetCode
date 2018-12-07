package easy;

public class No108 {
	/*
	 * 
	 *平衡二叉树
	 */
	public TreeNode sortedArrayToBST(int[] nums) {	//-10 -3 0 5 9 
		if(nums.length == 0)
			return null;
		return create(nums, 0, nums.length-1);
    }
	public TreeNode create(int[] nums,int left,int right) {
		if(left > right)
			return null;
		int mid = (left+right) >> 1;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = create(nums, left, mid-1);
		node.right = create(nums, mid+1, right);
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if(nums.length == 0)
			return null;
		TreeNode root = new TreeNode(nums[0]);
        for(int i =1 ;i < nums.length;i++) {
        	TreeNode cur = root;
        	TreeNode pre = root;
        	while(cur != null) {
        		if(cur.val >=nums[i]) {
        			pre = cur;
        			cur = cur.left;
        		}
        		else {
        			pre = cur;
					cur = cur.right;
				}
        	}
        	if(pre.val > nums[i])
        		pre.left = new TreeNode(nums[i]);
        	else
        		pre.right = new TreeNode(nums[i]);
        }
        return root;
		 */
	}

}
