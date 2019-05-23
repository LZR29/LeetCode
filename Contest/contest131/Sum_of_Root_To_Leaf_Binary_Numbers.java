package contest131;

import easy.TreeNode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-04-07 11:12
 */
public class Sum_of_Root_To_Leaf_Binary_Numbers {
    public int sumRootToLeaf(TreeNode root) {
        ans = 0;
        dfs(root, 0L);
        return (int)(ans%mod);
    }
    int mod = 1000000007;
    long ans;

    void dfs(TreeNode cur, long v) {
        if(cur == null){
            return;
        }
        if(cur.left == null && cur.right == null){
            ans += v*2+cur.val;
            return;
        }
        dfs(cur.left, (v*2 + cur.val) % mod);
        dfs(cur.right, (v*2 + cur.val) % mod);
    }
    public static void main(String[] args) {
        String s = "100";
        byte[] b = {0,1,1};
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.parseInt(s,2));

    }
}
