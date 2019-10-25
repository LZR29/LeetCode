package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-09-13 13:06
 */
public class No98 {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        int len = list.size();
        for (int i = 0; i < len-1; i++) {
            if(list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root != null){
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
        }
    }

    /*public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);            // 注意用long
    }

    public boolean helper(TreeNode root, long min, long max) {
        if (root == null)
            return true;
        if (root.val < max && root.val > min)
            return helper(root.left, min, root.val) && helper(root.right, root.val, max);
        return false;
    }*/
}
