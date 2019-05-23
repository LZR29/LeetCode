package easy;

import java.util.List;

/**
 * @author linzerong
 * @create 2018-12-19 12:56
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
