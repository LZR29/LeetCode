package dfs;

import easy.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author linzerong
 * @create 2019-03-14 22:04
 */
public class No897 {
    public static TreeNode increasingBST(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode newHead = null, pre = null,head = root;
        Stack<TreeNode> stack = new Stack<>();
        List<TreeNode> nodes = new ArrayList<>();
        while (!stack.isEmpty() || head != null){
            if(head != null){
                stack.push(head);
                head = head.left;
            }else {
                head = stack.pop();
                nodes.add(head);
                head = head.right;
            }
        }
        /*System.out.println("1");*/
        newHead = new TreeNode(nodes.get(0).val);
        pre = newHead;
        for (int i = 1; i < nodes.size(); i++) {
            pre.right = new TreeNode(nodes.get(i).val);
            pre = pre.right;
        }
        /*while (newHead != null){
            System.out.println(newHead.val);
            newHead = newHead.right;
        }*/
        return newHead;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        increasingBST(root);
    }
}
