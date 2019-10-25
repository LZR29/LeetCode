package easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author linzerong
 * @create 2019-09-17 10:14
 */
public class No994 {
    int[] dr = new int[]{-1, 0, 1, 0};
    int[] dc = new int[]{0, -1, 0, 1};
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == 2){
                    int hash = i * col + j;
                    queue.add(hash);
                    map.put(hash, 0);
                }
            }
        }
        int ans = 0;
        while (!queue.isEmpty()){
            int hash = queue.poll();
            int i = hash / col;
            int j = hash % col;
            for (int k = 0; k < 4; k++) {
                int di = i + dr[k];
                int dj = j + dc[k];
                if(di >= 0 && di < row && dj >= 0 && dj < col && grid[di][dj] == 1){
                    grid[di][dj] = 2;
                    int code = di * col + dj;
                    map.put(code, map.get(hash)+1);
                    ans = map.get(code);
                    queue.add(code);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return ans;
    }

}
