package contest157;

/**
 * @author linzerong
 * @create 2019-10-06 11:09
 */
public class Path_with_Maximum_Gold {
    int ans = 0;
    public int getMaximumGold(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != 0){
                    dfs(grid, i, j , new int[]{0});
                }
            }
        }
        return ans;
    }

    public void dfs(int[][] grid, int i, int j, int[] cur){
        cur[0] += grid[i][j];
        int temp = grid[i][j];
        grid[i][j] = 0;
        int k = 0;
        if(i+1 < grid.length && grid[i+1][j] != 0){
            k++;
            dfs(grid, i+1, j, cur);
        }
        if(i-1 >= 0 && grid[i-1][j] != 0){
            k++;
            dfs(grid, i-1, j, cur);
        }
        if(j+1 < grid[0].length && grid[i][j+1] != 0){
            k++;
            dfs(grid, i, j+1, cur);
        }
        if(j-1 >= 0 && grid[i][j-1] != 0){
            k++;
            dfs(grid, i, j-1, cur);
        }
        if(k == 0){
            ans = Math.max(ans, cur[0]);
        }
        grid[i][j] = temp;
        cur[0] -= grid[i][j];
    }
}
