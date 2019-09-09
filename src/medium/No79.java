package medium;

/**
 * @author linzerong
 * @create 2019-08-16 17:17
 */
public class No79 {

    boolean[][] visit;

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == word.charAt(0)){
                    if(helper(board, i, j, word, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board, int row, int col, String word, int index){
        if(index == word.length()){
            return true;
        }
        boolean ans = false;
        if(0 <= row && row < board.length &&
                0 <= col && col < board[0].length &&
                !visit[row][col] && board[row][col] == word.charAt(index)){
            visit[row][col] = true;
            ans = helper(board, row+1, col, word, index+1) ||
                    helper(board, row-1, col, word, index+1) ||
                    helper(board, row, col+1, word, index+1) ||
                    helper(board, row, col-1, word, index+1);
            visit[row][col] = false;
        }
        return ans;
    }
}
