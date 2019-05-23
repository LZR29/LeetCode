package easy;

/**
 * @author linzerong
 * @create 2018-12-15 10:16
 */
public class No867 {

    public int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] ans = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ans[i][j] = A[j][i];
            }
        }
        return ans;
    }
}
