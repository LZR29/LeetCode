package easy;

public class No883 {
	
	public static int projectionArea(int[][] grid) {
        int sum = 0;
        int row = grid[0][0];	//行最大
        int col = grid[0][0];	//列最大
        int len = grid.length;
        for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				sum += grid[i][j] == 0 ? 0:1;
				row = Math.max(row, grid[i][j]);
				col = Math.max(col, grid[j][i]);
			}
			sum += row + col;
			row = 0;
			col = 0;
		}
 /*       for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				col = Math.max(col, grid[j][i]);
			}
			sum += col;
		} */
        return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,4},{1,1}};	//1,4,  1,1  14
		System.out.println(projectionArea(grid));
	}

}
