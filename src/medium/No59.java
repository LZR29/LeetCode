package medium;

/**
 * @author linzerong
 * @create 2019-08-28 15:28
 */
public class No59 {

    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bootom = n - 1;
        int num = 1;
        int fin = n * n;
        while (num <= fin){
            for (int i = left; i <= right; i++) {
                ans[top][i] = num;
                num++;
            }
            top++;
            for (int i = top; i <= bootom; i++) {
                ans[i][right] = num;
                num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                ans[bootom][i] = num;
                num++;
            }
            bootom--;
            for (int i = bootom; i >= top; i--) {
                ans[i][left] = num;
                num++;
            }
            left++;
        }
        return ans;
    }
}
