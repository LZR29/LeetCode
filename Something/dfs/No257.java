package dfs;

import easy.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-03-14 20:44
 */
public class No257 {
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return new ArrayList<String>();
        }
        List<String> ans = new ArrayList<>();
        helper(root,"",ans);
        return ans;
    }
    public void  helper(TreeNode root, String str, List<String> ans){
        if (root.left == null && root.right == null) {
            ans.add(str + root.val);
            return;
        }
        if(root.left != null){
            helper(root.left,str + root.val + "->",ans);
        }
        if(root.right != null){
            helper(root.right,str + root.val + "->",ans);
        }
    }
}
