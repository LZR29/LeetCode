package contest150;

import easy.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author linzerong
 * @create 2019-08-18 10:38
 */
public class Maximum_Level_Sum_of_a_Binary_Tree {

    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int ans = 0;
        int level = 1;
        int max = Integer.MIN_VALUE;
        queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            int cur = 0;
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                cur += node.val;
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            if(cur > max){
                max = cur;
                ans = level;
            }
            level++;
        }
        return ans;
    }

}
