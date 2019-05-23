package medium;

/**
 * @author linzerong
 * @create 2018-12-05 13:14
 */
public class No938 {

    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if(root != null ){
            if(root.val > R){
                sum += rangeSumBST(root.left,L,R);
            }else if(root.val < L){
                sum += rangeSumBST(root.right,L,R);
            }else {
                sum += root.val +rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
