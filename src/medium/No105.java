package medium;

/**
 * @author linzerong
 * @create 2019-08-21 11:33
 */
public class No105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, 0, preorder.length-1);
    }

    public TreeNode helper(int[] pre, int[] in, int preStart, int inStart, int inEnd){
        if (preStart > pre.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        int i = inStart;
        for(; i <= inEnd; i++){
            if(in[i] == pre[preStart]){
                break;
            }
        }
        //左子树的根在前序数组中的位置为它的根的下一个
        //右子树的根在前序数组中的位置为它的根的位置加上左子树的节点数
        root.left = helper(pre, in, preStart+1, inStart, i-1);
        root.right = helper(pre, in, preStart+1+i-inStart, i+1, inEnd);
        return root;
    }
}
