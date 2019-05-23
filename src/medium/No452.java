package medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author linzerong
 * @create 2019-03-23 20:37
 */
public class No452 {
    public int findMinArrowShots(int[][] points) {
        int count = 1;
        if(points == null || points.length <= 0){
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int curH = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if(points[i][0] > curH){
                curH = points[i][1];
                count++;
            }
        }
        return count;
    }
}
