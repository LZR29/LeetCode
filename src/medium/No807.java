package medium;

import java.util.Arrays;

/**
 * @authoor linzerong
 * @create 2018-12-28 9:14
 */
public class No807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int len = grid.length;
        int[] tb = new int[len];
        int[] lr = new int[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                lr[i] = Math.max(lr[i],grid[i][j]);
                tb[i] = Math.max(tb[i],grid[j][i]);
            }
        }
        int min = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                min = Math.min(lr[i],tb[j]);
                count += min - grid[i][j];
            }
        }
        return count;
    }
}
