package medium;

import java.util.Stack;

/**
 * @author linzerong
 * @create 2019-09-16 12:28
 */
public class No536 {
    public TreeNode str2tree(String s) {
        if(s.isEmpty()){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')'){
                stack.pop();
            }else if((s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i) == '-'){
                int start = i;
                while(i < s.length()-1 && s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9'){
                    i++;
                }
                int val = Integer.parseInt(s.substring(start,i+1));
                TreeNode node = new TreeNode(val);
                if(!stack.isEmpty()){
                    TreeNode pre = stack.peek();
                    if(pre.left == null){
                        pre.left = node;
                    }else {
                        pre.right = node;
                    }
                }
                stack.push(node);
            }
        }
        if(stack.isEmpty()){
            return null;
        }
        return stack.peek();
    }

}
