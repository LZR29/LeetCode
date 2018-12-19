package easy;

import java.util.*;

/**
 * @authoor linzerong
 * @create 2018-12-19 12:56
 */
public class No429 {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null){
            return Collections.emptyList();
        }
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> cur = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                cur.add(node.val);
                for(Node n : node.children){
                    queue.add(n);
                }
            }
            ans.add(cur);
        }
        return ans;
    }
}
