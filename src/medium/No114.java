package medium;

/**
 * @author linzerong
 * @create 2019-08-15 15:44
 */
public class No114 {

    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        //把根的右子树放到左子树的最右节点，然后根的左子树放到右子树
        if(root.left != null){
            TreeNode pre = root.left;
            while (pre.right != null){
                pre = pre.right;
            }
            pre.right = root.right;
            root.right = root.left;
            root.left = null;
        }
    }
}
