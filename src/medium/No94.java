package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-08-15 14:59
 */
public class No94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(ans, root);
        return ans;
    }

    public void helper(List<Integer> ans, TreeNode root){
        if(root == null){
            return;
        }
        helper(ans, root.left);
        ans.add(root.val);
        helper(ans, root.right);
    }
}
