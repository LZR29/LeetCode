package medium;

/**
 * @author linzerong
 * @create 2019-06-26 11:54
 */
public class No1038 {

    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root != null && root.right != null){
            bstToGst(root.right);
        }
        root.val += sum;
        sum = root.val;
        if(root != null && root.left != null){
            bstToGst(root.left);
        }
        return root;
    }
}
