package dfs;

import easy.TreeNode;

/**
 * @author linzerong
 * @create 2019-03-14 20:24
 */
public class No100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p != null && q != null && p.val == q.val){
            return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
        }
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return false;
    }
}
