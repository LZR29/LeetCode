package medium;

import java.util.ArrayList;
import java.util.List;

public class No64 {
	
	public static int minPathSum(int[][] grid) {
        int len = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[len][col];
        for(int i = 0; i < len; i++) {
        	for (int j = 0; j < col; j++) {
				if(i == j && i == 0)
					dp[i][j] = grid[i][j];
				else if(i == 0)
					dp[i][j] = grid[i][j] + dp[i][j-1];
				else if(j == 0)
					dp[i][j] = grid[i][j] + dp[i-1][j];
				else
					dp[i][j] = grid[i][j] + Math.min(dp[i][j-1], dp[i-1][j]);
			}
        }
        return dp[len-1][col-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,2,4},{3,3,2},{3,1,9},{1,1,2}};
		System.out.println(minPathSum(grid));
		List<Integer> nums = new ArrayList<>();

	}

}
