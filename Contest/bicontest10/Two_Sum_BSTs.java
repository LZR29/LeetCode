package bicontest10;

import easy.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-10-05 22:35
 */
public class Two_Sum_BSTs {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        /*if (root1 == null || root2 == null) return false;
        int sum = root1.val + root2.val;
        if (sum == target) return true;
        else if (sum > target) return twoSumBSTs(root1.left, root2, target) || twoSumBSTs(root1, root2.left, target);
        else return twoSumBSTs(root1.right, root2, target) || twoSumBSTs(root1, root2.right, target);*/
        helper(root1, list1);
        helper(root2, list2);
        for(int i : list1){
            for(int j : list2){
                if(i + j == target){
                    return true;
                }
            }
        }
        return false;
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}
