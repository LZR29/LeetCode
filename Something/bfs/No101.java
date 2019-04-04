package bfs;

import easy.TreeNode;

/**
 * @authoor linzerong
 * @create 2019-03-15 22:10
 */
public class No101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return helper(root.right,root.left);
    }
    public boolean helper(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val == root2.val){
            return helper(root1.left,root2.right) && helper(root1.right,root2.left);
        }
        return false;
    }
}
