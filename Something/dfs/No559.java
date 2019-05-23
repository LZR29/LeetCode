package dfs;

import java.util.List;

/**
 * @author linzerong
 * @create 2019-03-14 20:29
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class No559 {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int max = 0;
        for(Node node : root.children){
            max = Math.max(max,maxDepth(node));
        }
        return max + 1;
    }
}
