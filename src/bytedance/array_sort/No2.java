package bytedance.array_sort;

/**
 * @author linzerong
 * @create 2019-07-10 13:37
 */
public class No2 {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length <= 0) {
            return 0;
        }
        int max = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == 1){
                    max = Math.max(max,helper(grid,i,j));
                }

            }
        }
        return max;
    }


    public int helper(int[][] grid,int i,int j){
        if( i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        return 1+
                helper(grid, i+1, j)+
                helper(grid, i-1, j)+
                helper(grid, i, j -1)+
                helper(grid, i, j+1);
    }
}
