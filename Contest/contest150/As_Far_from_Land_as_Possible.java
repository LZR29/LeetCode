package contest150;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-08-18 10:49
 */
public class As_Far_from_Land_as_Possible {

    public int maxDistance(int[][] grid) {
        //中文社区超时，英文社区通过
        int len = grid.length;
        List<int[]> lands = new ArrayList<>(len*len);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(grid[i][j] == 1){
                    lands.add(new int[]{i,j});
                }
            }
        }
        if(lands.size() == 0 || lands.size() == len*len){
            return -1;
        }
        int max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(grid[i][j] == 0){
                    int curMin = Integer.MAX_VALUE;
                    for(int[] land : lands){
                        int cur = 0;
                        cur = Math.abs(land[0]-i) + Math.abs(land[1]-j);
                        curMin = Math.min(cur, curMin);
                    }
                    max = Math.max(max, curMin);
                }
            }
        }
        return max;
    }
}
