package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.xml.namespace.QName;

public class No107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> nodes = new LinkedList<>();
        if(root == null)
        	return nodes;
        LinkedList<TreeNode> node = new LinkedList<>();
        node.add(root);
        while (!node.isEmpty()) {
			int size = node.size();
			List<Integer> sub = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode treeNode = node.remove();
				sub.add(treeNode.val);
				if(treeNode.left!=null)
					node.add(treeNode.left);
				if(treeNode.right!=null)
					node.add(treeNode.right);
			}
			nodes.add(0,sub);
		}
        return nodes;
    }	
}
