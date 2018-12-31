package contest117;

/**
 * @authoor linzerong
 * @create 2018-12-30 10:33
 */
public class Univalued_Binary_Tree {
    public boolean isUnivalTree(TreeNode root) {
        if(root != null){
            if(root.left != null && root.val != root.left.val){
                return false;
            }
            if(root.right != null && root.val != root.right.val){
                return false;
            }
        }else {
            return true;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
