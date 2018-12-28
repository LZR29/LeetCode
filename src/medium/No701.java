package medium;

/**
 * @authoor linzerong
 * @create 2018-12-28 9:51
 */
public class No701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return root;
        }
        if(root.val > val && root.left != null){
            insertIntoBST(root.left,val);
        }else if(root.val <= val && root.right != null){
            insertIntoBST(root.right,val);
        }else if(root.val > val && root.left == null){
            root.left = new TreeNode(val);
        }else {
            root.right = new TreeNode(val);
        }
        return root;
    }
}
