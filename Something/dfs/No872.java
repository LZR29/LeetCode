package dfs;

import easy.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @authoor linzerong
 * @create 2019-03-14 21:40
 */
public class No872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        List<Integer> vals1 = new ArrayList<>();
        List<Integer> vals2 = new ArrayList<>();
        helper(root1,vals1);
        helper(root2,vals2);
        return vals1.equals(vals2);
    }
    public void helper(TreeNode root, List<Integer> vals){
        if(root.left == null && root.right == null){
            vals.add(root.val);
        }
        if(root.left != null){
            helper(root.left,vals);
        }
        if(root.right != null){
            helper(root.right,vals);
        }
    }

}
