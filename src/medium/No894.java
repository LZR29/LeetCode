package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-09-14 16:27
 */
public class No894 {
    public List<TreeNode> allPossibleFBT(int N) {
        //参考
        //1. if N = 3 , the number of nodes combination are as follows
        //      left    root    right
        //       1       1        1
        //--------------N = 3, res = 1----------

        //2. if N = 5 , the number of nodes combination are as follows
        //      left    root    right
        //       1       1        3 (recursion)
        //       3       1        1
        //  --------------N = 5, res = 1 + 1 = 2----------

        //3. if N = 7 , the number of nodes combination are as follows
        //      left    root    right
        //       1       1        5 (recursion)
        //       3       1        3
        //       5       1        1
        //  --------------N = 7, res = 2 + 1 + 2 = 5----------

        //4. in order to make full binary tree, the node number must increase by 2
        List<TreeNode> ans = new ArrayList<>();
        if(N <= 0 || N % 2 == 0){
            return ans;
        }
        if(N == 1){
            ans.add(new TreeNode(0));
            return ans;
        }
        for (int i = 1; i < N; i += 2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(N - i - 1);
            for(TreeNode node1 : left){
                for(TreeNode node2 : right){
                    TreeNode root = new TreeNode(0);
                    root.left = node1;
                    root.right = node2;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}
