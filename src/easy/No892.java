package easy;

/**
 * @author linzerong
 * @create 2019-09-15 9:46
 */
public class No892 {
    public int surfaceArea(int[][] grid) {
        int len = grid.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(grid[i][j] == 0){
                    continue;
                }
                int top = grid[i][j];
                if(i > 0){
                    top = grid[i-1][j] <= grid[i][j] ? grid[i][j] - grid[i-1][j] : 0;
                }
                int bow = grid[i][j];
                if(i < len - 1){
                    bow = grid[i+1][j] <= grid[i][j] ? grid[i][j] - grid[i+1][j] : 0;
                }
                int left = grid[i][j];
                if(j > 0){
                    left = grid[i][j-1] <= grid[i][j] ? grid[i][j] - grid[i][j-1] : 0;
                }
                int right = grid[i][j];
                if(j < len - 1){
                    right = grid[i][j+1] <= grid[i][j] ? grid[i][j] - grid[i][j+1] : 0;
                }
                ans += 2 + top + bow + left + right;
            }
        }
        return ans;
    }
}
