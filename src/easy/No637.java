package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @authoor linzerong
 * @create 2018-12-04 19:41
 */
public class No637 {

    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null) {
            return new ArrayList<Double>();
        }
        List<Double> ave = new ArrayList<>();
        double num = 0;
        int size = 0;
        TreeNode node;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            size = queue.size();
            List<TreeNode> nodes = new ArrayList<>(size);
            num = 0;
            for (int i = 0; i < size; i++) {
                nodes.add(queue.poll());
            }
            for (int i = 0; i < size; i++) {
                node = nodes.get(i);
                num += node.val;
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            ave.add(num / nodes.size());
        }
        return ave;
    }

    public static void main(String[] args) {

    }

}
