package hard;

import java.util.Date;

/**
 * @author linzerong
 * @create 2019-03-20 10:03
 */
public class No52 {
    int count = 0;
    public int totalNQueens(int n) {
        int[][] data = new int[n][n];
        helper(data,0);
        return count;
    }
    public void helper(int[][] data, int row){
        if(row == data.length){
            count++;
            return;
        }
        for (int i = 0; i < data.length; i++) {
            if(check(data,row,i)){
                data[row][i] = 1;
                helper(data,row+1);
                data[row][i] = 0;
            }
        }
    }
    public boolean check(int[][] data, int row ,int col){
        for (int i = 0; i < row; i++) {
            if(data[i][col] == 1){
                return false;
            }
        }
        for (int i = row-1,j = col-1; i >= 0 && j >= 0; i--,j--) {
            if(data[i][j] == 1){
                return false;
            }
        }
        for (int i = row-1,j = col+1; i >= 0 && j < data.length; i--,j++) {
            if(data[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
