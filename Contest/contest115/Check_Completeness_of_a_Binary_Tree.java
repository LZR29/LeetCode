package contest115;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author linzerong
 * @create 2018-12-16 10:32
 */
public class Check_Completeness_of_a_Binary_Tree {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        boolean ans = true;
        boolean isNode = false;
     //   ((LinkedList<TreeNode>) q).push(root);
        q.add(root);
        while (!q.isEmpty()){
            TreeNode node = q.poll();
            if(isNode){
                if(node.left != null || node.right != null){
                    ans = false;
                    break;
                }
            }else {
                if (node.left != null && node.right != null) {
                    q.add(node.left);
                    q.add(node.right);
                } else if (node.left == null && node.right != null) {
                    ans = false;
                    break;
                } else if ((node.left != null && node.right == null)) {
                    q.add(node.left);
                    isNode = true;
                }else {
                    isNode = true;
                }
            }
        }
        return ans;
    }
}
